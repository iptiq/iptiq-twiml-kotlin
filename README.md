# TwiML Kotlin Extensions

[![Maven Central](https://img.shields.io/maven-central/v/com.iptiq/twiml-kotlin-extensions.svg)](https://search.maven.org/artifact/com.iptiq/twiml-kotlin-extensions)

A Kotlin DSL for TwiML which is both simpler than using the Java SDK's builders and more closely resembles the generated TwiML.

For example, to produce the TwiML

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Response>
     <Say>Hello World!</Say>
</Response>
```

use

```kotlin
voiceResponse {
    say("Hello World!")
}
```

instead of

```kotlin
VoiceResponse.Builder().say(
  Say.Builder("Hello World!").build()
).build()
```

The library code is produced by [a code generator][code-generation] to ensure the library is correct and up to date with the Java SDK.

## Installation

`twiml-kotlin-extensions` is available from Maven Central.

Use the following dependency in Maven

```xml
<dependency>
  <groupId>com.iptiq</groupId>
  <artifactId>twiml-kotlin-extensions</artifactId>
  <version>10.6.8</version>
</dependency>
```

or in Gradle

```groovy
implementation 'com.iptiq:twiml-kotlin-extensions:10.6.8'
```

Use the following imports in your code

* For voice
  * ```import com.iptiq.twiml.extensions.voice.*```
* For messaging
  * ```import com.iptiq.twiml.extensions.messaging.*```

## Examples

### Select Department Example

To ask the caller to select a department we might use the following TwiML

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Response>
  <Gather action="http://gatherexample.test/select-department" numDigits="1">
    <Say>For Sales please press 1</Say>
    <Say>For Servicing please press 2</Say>
    <Say>For Accounts please press 3</Say>
  </Gather>
  <Redirect>http://gatherexample.test/request-department</Redirect>
</Response>
```

We create the `VoiceResponse` object as follows

```kotlin
val voiceResponse = voiceResponse {
    gather {
        say("For Sales please press 1")
        say("For Servicing please press 2")
        say("For Accounts please press 3")
        action("http://gatherexample.test/select-department")
        numDigits(1)
    }
    redirect("http://gatherexample.test/request-department")
}
```

Using the Java builders, the code would have been

```kotlin
val voiceResponse = VoiceResponse.Builder()
    .gather(
        Gather.Builder()
            .say(
                Say.Builder("For Sales please press 1").build()
            )
            .say(
                Say.Builder("For Servicing please press 2").build()
            )
            .say(
                Say.Builder("For Accounts please press 3").build()
            )
            .action("http://gatherexample.test/select-department")
            .numDigits(1)
            .build()
    )
    .redirect(
        Redirect.Builder("http://gatherexample.test/request-department").build()
    )
    .build()
```

### Loops and Conditions

Considering the example above, we might prefer to build the TwiML dynamically.  We will add two enhancements

* We will create the `Say` tags based on a list of departments

```kotlin
val departments = listOf(
  Department(digit = 1, name = "Sales"),
  Department(digit = 2, name = "Servicing"),
  Department(digit = 3, name = "Accounts"),
)
```

* If `retry` is `true`, tell the caller the input was not recognised

Control flow structures may be easily embedded within the code blocks that create the `VoiceResponse`

```kotlin
val voiceResponse = voiceResponse {
    gather {
        if (retry) {
            say("Your selection was not recognised.")
            pause {
                length(1)
            }
        }
        departments.forEach {
            say("For ${it.name} please press ${it.digit}")
        }
        action("http://gatherexample.test/select-department")
        numDigits(1)
    }
    redirect("http://gatherexample.test/request-department")
}
```
The code above produces the following TwiML when `retry` is `true`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Response>
  <Gather action="http://gatherexample.test/select-department" numDigits="1">
    <Say>Your selection was not recognised.</Say>
    <Pause length="1"/>
    <Say>For Sales please press 1</Say>
    <Say>For Servicing please press 2</Say>
    <Say>For Accounts please press 3</Say>
  </Gather>
  <Redirect>http://gatherexample.test/request-department</Redirect>
</Response>
```

Using the Java builders, we might have written the following code

```kotlin
val gatherBuilder = Gather.Builder()
if (retry) {
  gatherBuilder.say(
    Say.Builder("Your selection was not recognised.").build()
  ).pause(
    Pause.Builder().length(1).build()
  )
}
departments.forEach {
  gatherBuilder.say(
    Say.Builder("For ${it.name} please press ${it.digit}").build()
  )
}
val voiceResponse = VoiceResponse.Builder()
  .gather(
    gatherBuilder
      .action("http://gatherexample.test/select-department")
      .numDigits(1)
      .build()
  )
  .redirect(
    Redirect.Builder("http://gatherexample.test/request-department").build()
  )
  .build()
```

## Messaging

TwiML for messaging is also supported.  For example, to send a message

```kotlin
val response = messagingResponse {
  message("Hello World!")
}
```

or a message with an image

```kotlin
val response = messagingResponse {
  message {
    body("Hello World!")
    media("https://example.test/hello.png")
  }
}
```

## Standalone Child Tags

The examples above each use `voiceResponse { ... }` or `messagingResponse{ ... }` to build TwiML's top-level `<Response> ... </Response>` tags.

All lower level tags may also be built using the `build...` functions.  For example a `com.twilio.twiml.voice.Dial` may be built as follows

```kotlin
val dial = buildDial {
    number("+441234567890") {
        statusCallback("https://number.test/callback")
        statusCallbackMethod(HttpMethod.POST)
        statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
    }
}
```

The child tag may then be added to a `VoiceResponse` later

```kotlin
val voiceResponse = voiceResponse {
    dial(dial)
}
```

## A Note about ```Dial.Builder.number```

The Java SDK has two `Dial.Builder.number` methods which behave differently

```java
public Builder number(Number number)
public Builder number(String number)
```

If you need to dial multiple numbers, do not use

```kotlin
dial {
  number("+44123456789") // this number will be replaced
  number("+44987654321") // this number will remain
}
```

This will call the first builder method twice, replacing the first number

and producing the XML

```xml
<Dial>+44123456789</Dial>
```

instead use
```kotlin
dial {
  number(PhoneNumber("+44123456789")) // create a nested <Number> tag 
  number(PhoneNumber("+44987654321")) // create a nested <Number> tag
}
```

or

```kotlin
dial {
  number("+44123456789") {} // create a nested <Number> tag
  number("+44987654321") {} // create a nested <Number> tag
}
```

to produce

```xml
<Dial>
  <Number>+44123456789</Number>
  <Number>+44987654321</Number>
</Dial>
```

## A Note about ```Client.Builder.identity```

A similar issue exists with the overloaded ```Client.Builder.identity``` methods.

```java
new Client.Builder()
    .identity(new Identity.Builder("identity1").build())
    .identity(new Identity.Builder("identity2").build())
    .build().toXml()
```

produces

```xml
<Client>
    <Identity>identity1</Identity>
    <Identity>identity2</Identity>
</Client>
```

whereas

```java
new Client.Builder().identity("identity1").identity("identity2").build().toXml()
```

produces

 ```xml
<Client>identity2</Client>
 ```

If you require multiple nested identity tags, use

```kotlin
client {
    identity("identity1") {}
    identity("identity2") {}
}
```

## How Does it Work?

For an explanations see [the code generator's documentation][how-does-it-work]

[code-generation]: ./twiml-kotlin-code-generation/README.md
[how-does-it-work]: ./twiml-kotlin-code-generation/README.md#how-does-it-work
