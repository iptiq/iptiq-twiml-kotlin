# twiml-kotlin-code-generation

This module is used to generate the Kotlin code in the ```twiml-kotlin-extensions``` module.

## Running the code generator
To run the code generator you will require the recompiled Twilio SDK as described below.  With that in place, generate the code by running

```shell script
mvn clean install -P regenerate
```

in the parent project directory.

**WARNING**: This will delete all the code in ```../twiml-kotlin-extensions/src/main/kotlin/```, i.e. the source directory of the ```twiml-kotlin-extensions``` module

The *regenerate* profile was added to prevent my IDE from continually regenerating the source code.

## Modified SDK dependency
This module has a dependency on a recompiled *'WITH_PARAMETERS'* version of the Twilio Java SDK that includes parameter name information in the compiled code.

Note that the generated Kotlin extensions do **not** have a dependency on the recompiled SDK, it is required only during code generation.

The SDK may be recompiled as follows 

* Clone the Twilio repo

```shell script
git clone https://github.com/twilio/twilio-java.git 
```

* Change the version number in ```pom.xml```

```xml
<version>10.5.2.WITH_PARAMETERS</version>
```

* Add compiler args to the ```maven-compiler-plugin``` configuration

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    ...
    <configuration>
        ...
        <compilerArgs>
            <arg>-parameters</arg>
        </compilerArgs>
        ...
    </configuration>
</plugin>
```

* Install to your local repo

```shell script
mvn clean install
```

## How Does it Work?

### Creating Tags

The library works by generating functions which
1. Automatically build each tag using its builder class
2. Accept an optional function block, used to modify the tag, which has the builder class as its receiver

For example, consider the ```voiceResponse``` function - its signature is

```kotlin
fun voiceResponse(block: VoiceResponseBlock = {}): VoiceResponse
```

To understand how this works, look at ```VoiceResponseBlock```

```kotlin
typealias VoiceResponseBlock = VoiceResponse.Builder.() -> Unit
```

So the code block passed to the function actually has the Java SDK's ```VoiceResponse.Builder``` class as its receiver.

The ```voiceResponse``` function creates a new builder, applies your block of code and then builds the ```VoiceResponse``` object.

```kotlin
fun voiceResponse(block: VoiceResponseBlock = {}): VoiceResponse = VoiceResponse.Builder().apply(block).build()
```

### Overloaded build functions

Wherever a builder in the Java SDK has multiple constructors, multiple build functions are provided by this library.  For example

```kotlin
fun say(block: SayBlock = {}): Say
```

calls the no-arg ```Say.Buider``` constructor

```java
Say.Builder().apply(block).build()
```

whereas

```kotlin
fun say(message: String, block: SayBlock = {}): Say
```

calls the constructor taking a string

```java
Say.Builder(message).apply(block).build()
```

### Nesting Tags

In addition, we require a convenient way of nesting child tags under our ```<VoiceResponse>```.  To do this an extension function is added to the builder for each builder method that adds a child tag.

Where a child tag's builder has multiple constructors, an extension function is added corresponding to each of these.  For example a ```<Say>``` tag may be nested within a ```<VoiceResponse>``` tag using either of

```kotlin
fun VoiceResponse.Builder.say(block: SayBlock = {})
fun VoiceResponse.Builder.say(message: String, block: SayBlock = {})
```  

which are implemented as

```kotlin
fun VoiceResponse.Builder.say(block: SayBlock = {}) = this.apply { say(buildSay(block)) }
fun VoiceResponse.Builder.say(message: String, block: SayBlock = {}) = this.apply { say(buildSay(message, block)) }
```  

where the ```buildSay``` functions are

```kotlin
internal fun buildSay(block: SayBlock): Say = Say.Builder().apply(block).build()
internal fun buildSay(message: String, block: SayBlock): Say = Say.Builder(message).apply(block).build()
```
