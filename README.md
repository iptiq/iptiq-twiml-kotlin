# twiml-kotlin

This reactor contains two modules

* [Kotlin TwiML extensions][twiml-extensions] to simplify the creation of TwiML when using Kotlin
* [A code generator][code-generation] to produce source code for the Kotlin extensions

The [Kotlin TwiML extensions][twiml-extensions] library contains generated Kotlin extension functions to simplify using the Java TwiML library by removing the need to make explicit use of builders.

## Why use the library?

This library replaces calls to the Twilio SDK's Java builders with a concise DSL having a structure similar to the TwiML it produces.

As well as not writing a lot of calls to `.Builder()` and `.build()`, this library allows you to simplify your TwiML creation by nesting control flow and loops within the call to `voiceResponse{ ... }`.  

See [Kotlin TwiML extensions][twiml-extensions] for examples.

[code-generation]: ./twiml-kotlin-code-generation/README.md
[twiml-extensions]: ./twiml-kotlin-extensions/README.md