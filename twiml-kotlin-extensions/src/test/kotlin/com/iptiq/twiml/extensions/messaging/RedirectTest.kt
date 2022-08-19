package com.iptiq.twiml.extensions.messaging

import com.iptiq.twiml.extensions.TwimlTest
import com.twilio.twiml.MessagingResponse
import com.twilio.twiml.messaging.Redirect
import org.junit.jupiter.api.Test


/**
 * Test using the library to reproduce all examples on https://www.twilio.com/docs/sms/twiml/redirect
 */
internal class RedirectTest : TwimlTest() {

    @Test
    fun `Absolute URL redirect example produces the same TwiML`() {
        // Example code from website (converted to Kotlin)
        // NOTE: Assuming the original example code is wrong and this should be using MessagingResponse (not VoiceResponse)
        val redirect: Redirect = Redirect.Builder("http://www.foo.com/nextInstructions").build()
        val expected: MessagingResponse = MessagingResponse.Builder().redirect(redirect)
                .build()

        // Rewritten using the extensions
        val actual = messagingResponse {
            redirect("http://www.foo.com/nextInstructions")
        }

        // compare
        assertTwimlEquals(expected, actual)
    }

    @Test
    fun `Relative URL redirect example produces the same TwiML`() {
        // Example code from website (converted to Kotlin)
        // NOTE: Assuming the original example code is wrong and this should be using MessagingResponse (not VoiceResponse)
        val redirect = Redirect.Builder("../nextInstructions").build()
        val expected: MessagingResponse = MessagingResponse.Builder().redirect(redirect)
                .build()

        // Rewritten using the extensions
        val actual = messagingResponse {
            redirect("../nextInstructions")
        }

        // compare
        assertTwimlEquals(expected, actual)
    }
}