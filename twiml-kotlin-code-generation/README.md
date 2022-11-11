# twiml-kotlin-code-generation

This module is used to generate the Kotlin code in the ```twiml-kotlin-extensions``` module.

## Running the code generator
To run the code generator you will require the recompiled Twilio SDK as described below.  With that in place, generate the code by running

```shell script
mvn clean install -P regenerate
```

in the parent project directory.  Note that compilation of the Twilio SDK fails with Java 17 - use Java 11 

**WARNING**: This will delete all the code in ```../twiml-kotlin-extensions/src/main/kotlin/```, i.e the source directory of the ```twiml-kotlin-extensions``` module

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
<version>9.1.2.WITH_PARAMETERS</version>
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