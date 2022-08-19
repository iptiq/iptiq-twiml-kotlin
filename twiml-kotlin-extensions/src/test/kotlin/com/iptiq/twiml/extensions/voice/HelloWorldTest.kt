package com.iptiq.twiml.extensions.voice

import com.iptiq.twiml.extensions.TwimlTest
import com.twilio.twiml.VoiceResponse
import com.twilio.twiml.voice.Say
import org.junit.jupiter.api.Test

internal class HelloWorldTest : TwimlTest() {

    @Test
    fun `Hello World using extensions produces the same TwiML`() {
        // Using builders
        val expected: VoiceResponse = VoiceResponse.Builder().say(
            Say.Builder("Hello World!").build()
        ).build()

        // Rewritten using the extensions
        val actual = voiceResponse {
            say("Hello World!")
        }

        // compare
        assertTwimlEquals(expected, actual)
    }
}