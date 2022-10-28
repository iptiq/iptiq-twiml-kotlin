# twiml-kotlin-extensions

This library allows Kotlin code to be written which is simpler than the using the Java builders from the Twilio SDK and more closely resembles the generated TwiML.

## Installation

twiml-kotlin-extensions is available from Maven Central.

Use the following dependency in Maven

```xml
<dependency>
  <groupId>com.iptiq</groupId>
  <artifactId>twiml-kotlin-extensions</artifactId>
  <version>9.1.0.0</version>
</dependency>
```

or in Gradle

```
implementation 'com.iptiq:twiml-kotlin-extensions:9.1.0.0'
```

## Using the Library
* For voice
  * ```import com.iptiq.twiml.extensions.voice.*```
* For messaging
  * ```import com.iptiq.twiml.extensions.messaging.*```
* For fax
  * ```import com.iptiq.twiml.extensions.fax.*```

## Examples

### Hello World Example

A simple TwiML response to say "Hello World!" can be written using this library as

```kotlin
voiceResponse {
    say("Hello World!")
}
```

Whereas using the Java builders (in Kotlin) would require 

```kotlin
VoiceResponse.Builder().say(
  Say.Builder("Hello World!").build()
).build()
```

The TwiML produced is

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Response>
     <Say>Hello World!</Say>
</Response>
```

### Loops and Conditions

The Hello World example is nice but it saves just a few calls to `.Builder()` and `.build()`.  However, suppose we want to do something more complicated; this is where the extension functions can make our code considerably simpler and more readable.

For example, let's suppose we want to prompt our caller to select a department and optionally read an error message if we are retrying owing to bad or missing input.

Given this list of departments

```kotlin
val departments = listOf(
  Department(digit = 1, name = "Sales"),
  Department(digit = 2, name = "Servicing"),
  Department(digit = 3, name = "Accounts"),
)
```

We might want to produce the following TwiML, where the first 'Say' and the 'Pause' only appear when retrying

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
  <Redirect>http://gatherexample.test/select-department</Redirect>
</Response>
```

Using the extension functions, control flow structures may be easily embedded within the code blocks that create the TwiML

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
    redirect("http://gatherexample.test/select-department")
}
```

Whereas if we used the Java builders we might write some Kotlin code like this

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
    Redirect.Builder("http://gatherexample.test/select-department").build()
  )
  .build()
```

## How Does it Work?

### Creating Tags

The library works by providing functions which 
1. Automatically build each tag using its builder class 
2. Accept an optional function block (used to modify the tag) which has the builder class as its receiver  
 
For example, consider the ```voiceResponse``` function - its signature is

```kotlin
fun voiceResponse(block: VoiceResponseBlock = {}): VoiceResponse
```

To understand how this is made to work, we must look at ```VoiceResponseBlock```

```kotlin
typealias VoiceResponseBlock = VoiceResponse.Builder.() -> Unit
```

So the code block passed to the function actually has the Java SDK's ```VoiceResponse.Builder``` class as its receiver.

The ```voiceResponse``` function simply delegates to the internal ```buildVoiceResponse``` function which creates a new builder, applies your block of code and then builds the ```VoiceResponse``` object.

```kotlin
internal fun buildVoiceResponse(block: VoiceResponseBlock): VoiceResponse = VoiceResponse.Builder().apply(block).build()
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
 
## A Note About ```Dial.Builder.number```
 
The Twilio Java SDK has two `Dial.Builder.number` methods which behave differently
 
```java
public Builder number(number number)
public Builder number(String number)
```

Using the first method

```java
new Dial.Builder().number( new Number.Builder("+44123456789").build() ).build().toXml()
```
 
produces
 
```xml
<Dial>
    <Number>+44123456789</Number>
</Dial>
```
 
whereas
 
```java
new Dial.Builder().number("+44123456789").build().toXml()
```
 
produces
 
```xml
<Dial>+44123456789</Dial>
```
 
The method accepting a ```Number``` must be used to add several numbers.  For example
 
```java
new Dial.Builder()
    .number( new Number.Builder("+44123456789").build() )
    .number( new Number.Builder("+44987654321").build() )
    .build().toXml()
```
 
produces two nested number tags
 
```xml
<Dial>
    <Number>+44123456789</Number>
    <Number>+44987654321</Number>
</Dial>
```
 
whereas
 
```java
new Dial.Builder()
    .number("+44123456789")
    .number("+44987654321")
    .build().toXml()
```
 
replaces the number to dial with each call to the ```number``` method producing
 
```xml
<Dial>+44987654321</Dial>
```
 
Because this library uses ```Dial.Builder``` behind the scenes the same issue exists.
 
To use the ```number``` function to nest ```<Number>``` tags under ```<Dial>```, avoid calling ```number(String)```, instead call one of
* ```number(String, DialBlock)``` 
* ```number(PhoneNumber)```
* ```number(PhoneNumber, DialBlock)```

for example

```kotlin
dial {
    number("+44123456789") {}
    number(PhoneNumber("+44987654321"))
    number(PhoneNumber("+44111222333")) {}
}
```
 
## A Note About ```Client.Builder.identity```

A similar issue exist with the overloaded ```Client.Builder.identity``` methods.

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

Generate the nested identity tags using this library as follows

```kotlin
client {
    identity("identity1") {}
    identity("identity2") {}
}
```
