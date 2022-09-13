/**
 * (C) iptiQ 2022
 *
 * @author Allan Todd
 */
package com.iptiq.twiml.codegen

import com.twilio.twiml.*
import java.io.File
import java.io.PrintWriter
import java.lang.reflect.Constructor
import java.lang.reflect.Method
import java.lang.reflect.Parameter
import java.time.LocalDate

/**
 * Used to identify tag classes
 */
private const val TWIML_PACKAGE = "com.twilio.twiml"

/**
 * Package under which to generate source code
 */
private const val BASE_OUTPUT_PACKAGE = "com.iptiq.twiml.extensions"

private const val SHARED_OUTPUT_PACKAGE = "$BASE_OUTPUT_PACKAGE.shared"
private const val VOICE_OUTPUT_PACKAGE = "$BASE_OUTPUT_PACKAGE.voice"
private const val MESSAGING_OUTPUT_PACKAGE = "$BASE_OUTPUT_PACKAGE.messaging"
private const val FAX_OUTPUT_PACKAGE = "$BASE_OUTPUT_PACKAGE.fax"

private const val SHARED_OUTPUT_SOURCE_FILE = "SharedExtensions.kt"
private const val VOICE_OUTPUT_SOURCE_FILE = "VoiceExtensions.kt"
private const val MESSAGING_OUTPUT_SOURCE_FILE = "MessagingExtensions.kt"
private const val FAX_OUTPUT_SOURCE_FILE = "FaxExtensions.kt"

private const val COPYRIGHT_HOLDER = "iptiQ"
private const val AUTHOR = "Allan Todd"


private typealias ParameterList = List<Parameter>

/**
 * Get the Builder class for the given tag class
 */
@Suppress("UNCHECKED_CAST")
private fun <T : TwiML> Class<T>.builderClass(): Class<TwiML.Builder<*>> =
    Class.forName("$name\$Builder") as Class<TwiML.Builder<*>>

/**
 * Test whether the given class represents a TwiML tag
 */
private fun Class<*>.isTwimlTag() = !isEnum && name.startsWith(TWIML_PACKAGE)

@Suppress("UNCHECKED_CAST")
private fun Class<*>.twimlType() = this as Class<out TwiML>

/**
 * Find all the tag classes which may be nested under this one
 */
private fun <T : TwiML> findTagClasses(parentTagClass: Class<T>): List<Class<out TwiML>> {
    val tagClasses = linkedSetOf<Class<out TwiML>>()
    fun processClass(twimlTagClass: Class<out TwiML>) {
        if (!tagClasses.add(twimlTagClass)) return // already processed this class
        val childTagClasses: List<Class<out TwiML>> = builderMethodsToAddTags(twimlTagClass).map { method ->
            method.parameters[0].type.twimlType()
        }.sortedBy { it.simpleName }
        childTagClasses.forEach(::processClass)
    }
    processClass(parentTagClass)
    return tagClasses.toList()
}

/**
 * Find all the methods on the given tag's builder which add a child tag
 */
private fun <T : TwiML> builderMethodsToAddTags(twimlTagClass: Class<T>): List<Method> {
    return twimlTagClass.builderClass().methods.filter {
        it.parameters.isNotEmpty() && it.parameters[0].type.isTwimlTag()
    }.also { methods ->
        // test my assumption
        methods.find { it.parameters.size != 1 }
            ?.let { throw RuntimeException("Expected exactly one parameter to $it") }
    }.sortedBy { it.name }
}

/**
 * As well as the Builder's constructor parameters, our functions take an additional parameter which
 * is a block used to initialise the Builder.  Generates a string of the form
 *
 * "tagA: TagA, tagB: TagB, block: ParentTagBlock"
 *
 * or
 *
 * "tagA: TagA, tagB: TagB, block: ParentTagBlock = {}"
 */
private fun ParameterList.asFunctionParameters(clz: Class<*>, blockDefaultValue: Boolean): String {
    val blockParameter = "block: ${clz.simpleName}Block" + (if (blockDefaultValue) " = {}" else "")
    return this.takeIf {
        it.isNotEmpty()
    }?.joinToString(postfix = ", $blockParameter") { "${it.name}: ${it.type.simpleName}" } ?: blockParameter
}

/**
 * Our generated functions take the generated parameters above "tagA: TagA, tagB: TagB, block: ParentTagBlock".
 *
 * This function generates the corresponding arguments when these are used to invoke another function - "tagA, tagB"
 * 'block' is not included here
 */
private fun ParameterList.asArguments() = this.joinToString { it.name }

private fun ParameterList.asArgumentsWithBlock() =
    this.asArguments().let { if (it.isNotEmpty()) "$it, block" else "block" }

private fun <T : TwiML> Class<T>.buildFunctionName() = "build${this.simpleName}"

/**
 * Function used to write each source code file
 *
 * @param parentTagClass find all the tags which can be nested under this tag
 * @param packageName package name for the generated code
 * @param writer
 * @param excludedSharedTags tags which have already been included in the shared package (only GenericNode at present).
 *        Build functions and extensions will not be generated for these classes.
 * @param sharedImport import for the shared tags
 * @return a list of the tag classes which were processed
 */
private fun generateExtensionCode(
    parentTagClass: Class<out TwiML>,
    packageName: String,
    writer: PrintWriter,
    excludedSharedTags: Collection<Class<out TwiML>> = emptySet(),
    sharedImport: String? = null,
    generatorDescription: String,
): Collection<Class<out TwiML>> {

    // All the tags to generate code for
    val tagClasses = findTagClasses(parentTagClass)

    // consistently order the generated functions
    val constructorComparator = Comparator<Constructor<*>> { c1, c2 ->
        (c1.parameterCount - c2.parameterCount).takeUnless {
            it == 0
        } ?: c1.toString().compareTo(c2.toString())
    }

    // One function will be generated with which to build this tag class per constructors of the associated builder.
    // This map contains the required parameter lists for these build functions.
    val buildFunctionParameterLists: Map<Class<*>, List<ParameterList>> = tagClasses.map { clz ->
        val builderClass = clz.builderClass()
        clz to builderClass.constructors.sortedWith(constructorComparator).map { it.parameters.toList() }
    }.toMap()

    //
    // header
    //
    writer.println(
        """
            |/**
            | * Generated using $generatorDescription
            | *
            | * (C) ${LocalDate.now().year} $COPYRIGHT_HOLDER
            | *
            | * @author $AUTHOR
            | */
        """.trimMargin()
    )
    //
    // Package declaration
    //
    writer.println("package $packageName")

    //
    // Imports
    //
    writer.println()
    sharedImport?.let { writer.println("import $it") }
    tagClasses.forEach {
        writer.println("import ${it.name}")
    }
    val otherImportTypes = buildFunctionParameterLists.values.flatten().flatMap { parameterList ->
        parameterList.map { it.type }
    }.filter { it.`package`.name != "java.lang" }.toSet().sortedBy { it.name }

    otherImportTypes.forEach {
        writer.println("import ${it.name}")
    }

    //
    // Type aliases for blocks of code passed to the build functions - used to configure and nest tags
    //
    // "typealias MyTagBlock = MyTag.Builder.() -> Unit
    //
    writer.println()
    tagClasses.map { it.simpleName }.forEach {
        writer.println("typealias ${it}Block = $it.Builder.() -> Unit")
    }

    tagClasses.filter { it !in excludedSharedTags }.forEach { tagClass ->
        //
        // Functions used to create the types.
        //
        // Top level tags are built by calling, e.g. VoiceResponse { ... }
        //
        // A nested tag, NestedTag, would be built by calling buildMyNestedTag(arg1, arg2) { ... }
        //
        buildFunctionParameterLists[tagClass]!!.forEach { paramList ->

            val topLevel = (tagClass == parentTagClass) && (sharedImport != null)

            // build functions for nested tags are prefixed with build to prevent confusion with functions used to add these tags
            val functionName =
                if (topLevel) tagClass.simpleName.replaceFirstChar { it.lowercase() } else tagClass.buildFunctionName()
            val parameters = paramList.asFunctionParameters(tagClass, true)
            val returnType = tagClass.simpleName
            val builderConstructorArgs = paramList.asArguments()
            val functionBody = "${tagClass.simpleName}.Builder($builderConstructorArgs).apply(block).build()"
            writer.println(
                """
                |
                |
                |/**
                | * Build a [${tagClass.canonicalName}]
                | */
                |fun $functionName($parameters): $returnType = $functionBody 
            """.trimMargin()
            )
        }

        //
        // Functions to add child elements.  These are extension functions on the relevant builder class
        //
        builderMethodsToAddTags(tagClass).forEach { method ->
            val functionName = method.name
            val typeToAdd = method.parameters[0].type.twimlType()
            if (buildFunctionParameterLists[typeToAdd] == null) {
                throw RuntimeException("$typeToAdd not found in map")
            }
            buildFunctionParameterLists[typeToAdd]?.forEach { paramList ->

                val paramTypes = paramList.map { it.type }.toTypedArray()

                // Usually we make the 'block parameter optional with  a default value of " = {}".
                // However it is possible that attempting to call this function without the block parameter would result
                // in an existing method on the builder class being called instead.
                //
                // For example Dial.Builder has a number(number: String) method and we add an extension function
                //
                //   Dial.Builder.number(number: String, block: NumberBlock)
                //
                // If we make block optional then this function will not be called if block is not passed as the existing
                // method will win

                val existingMethod = runCatching {
                    tagClass.builderClass().getMethod(functionName, *paramTypes) // expect NoSuchMethodException
                }.getOrNull()

                val mandatoryBlockParameterNote = existingMethod?.let { m ->
                    val methodDescription = "${m.declaringClass.enclosingClass.simpleName}.${m.declaringClass.simpleName}.${m.name}(${m.parameters.joinToString { "${it.name}: ${it.type.simpleName}" }})"
                    """
                    | * NOTE: The 'block' parameter is not optional, an attempt to call this function without 'block' would be shadowed by $methodDescription
                    | *
                    |
                    """.trimMargin()
                } ?: ""
                val parameters = paramList.asFunctionParameters(typeToAdd, existingMethod == null)
                val buildFunctionToCall = typeToAdd.buildFunctionName()
                val builderFunctionArgs = paramList.asArgumentsWithBlock()
                val functionBody = "this.apply { $functionName($buildFunctionToCall($builderFunctionArgs)) }"
                writer.println(
                    """
                    |
                    |/**
                    |${mandatoryBlockParameterNote} * @see ${method.declaringClass.canonicalName}.${method.name}
                    | */
                    |fun ${tagClass.simpleName}.Builder.$functionName($parameters) = $functionBody
                """.trimMargin()
                )
            }
        }
    }

    return tagClasses
}

fun main(args: Array<String>) {

    require(args.size == 2) { "Expected exactly two arguments but received ${args.size}" }

    val sourceOutputRoot = File(args[0])
    val generatorDescription = args[1]

    if (!sourceOutputRoot.exists()) sourceOutputRoot.mkdirs()

    fun <T : TwiML> generateSourceFile(
        parentTagClass: Class<T>,
        packageName: String,
        fileName: String,
        excludedSharedTags: Collection<Class<out TwiML>> = emptySet(),
        sharedImport: String? = null,
    ): Collection<Class<out TwiML>> {
        val sourceDir = File("$sourceOutputRoot/" + packageName.replace('.', '/'))
        if (!sourceDir.exists()) {
            sourceDir.mkdirs()
        }
        val sourceFile = File("${sourceDir.path}/$fileName")

        println("Generating ${sourceFile.canonicalPath}")

        return sourceFile.printWriter().use { printWriter ->
            generateExtensionCode(
                parentTagClass = parentTagClass,
                writer = printWriter,
                packageName = packageName,
                excludedSharedTags = excludedSharedTags,
                sharedImport = sharedImport,
                generatorDescription = generatorDescription,
            )
        }
    }

    val sharedTags = generateSourceFile(
        parentTagClass = GenericNode::class.java,
        packageName = SHARED_OUTPUT_PACKAGE,
        fileName = SHARED_OUTPUT_SOURCE_FILE
    )

    val sharedImport = "$SHARED_OUTPUT_PACKAGE.*"

    generateSourceFile(
        parentTagClass = VoiceResponse::class.java,
        packageName = VOICE_OUTPUT_PACKAGE,
        fileName = VOICE_OUTPUT_SOURCE_FILE,
        excludedSharedTags = sharedTags,
        sharedImport = sharedImport
    )

    generateSourceFile(
        parentTagClass = MessagingResponse::class.java,
        packageName = MESSAGING_OUTPUT_PACKAGE,
        fileName = MESSAGING_OUTPUT_SOURCE_FILE,
        excludedSharedTags = sharedTags,
        sharedImport = sharedImport
    )

    generateSourceFile(
        parentTagClass = FaxResponse::class.java,
        packageName = FAX_OUTPUT_PACKAGE,
        fileName = FAX_OUTPUT_SOURCE_FILE,
        excludedSharedTags = sharedTags,
        sharedImport = sharedImport
    )
}