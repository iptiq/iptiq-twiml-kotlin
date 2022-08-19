package com.iptiq.twiml.extensions.messaging

import com.iptiq.twiml.extensions.TwimlTest
import com.twilio.http.HttpMethod
import com.twilio.twiml.MessagingResponse
import com.twilio.twiml.messaging.Body
import com.twilio.twiml.messaging.Media
import com.twilio.twiml.messaging.Message
import org.junit.jupiter.api.Test

/**
 * Test using the library to reproduce all examples on https://www.twilio.com/docs/sms/twiml/message
 */
internal class MessageTest : TwimlTest() {

    @Test
    fun `Simple sending of SMS example produces the same TwiML`() {
        // Example code from website (converted to Kotlin)
        val message = Message.Builder("Store Location: 123 Easy St.")
                .build()
        val expected = MessagingResponse.Builder()
                .message(message).build()

        // Rewritten using the extensions
        val actual = messagingResponse {
            message("Store Location: 123 Easy St.")
        }

        // compare
        assertTwimlEquals(expected, actual)
    }

    @Test
    fun `Sending of an Message with Media (MMS) example produces the same TwiML`() {
        // Example code from website (converted to Kotlin)
        val body = Body.Builder("Store Location: 123 Easy St.").build()
        val media = Media.Builder("https://demo.twilio.com/owl.png")
                .build()
        val message = Message.Builder().body(body).media(media).build()
        val expected = MessagingResponse.Builder()
                .message(message).build()

        // Rewritten using the extensions
        val actual = messagingResponse {
            message {
                body("Store Location: 123 Easy St.")
                media("https://demo.twilio.com/owl.png")
            }
        }

        // compare
        assertTwimlEquals(expected, actual)
    }

    @Test
    fun `MessageStatus reporting example produces the same TwiML`() {
        // Example code from website (converted to Kotlin)
        val message = Message.Builder("Store Location: 123 Easy St.")
                .action("/SmsHandler.php").method(HttpMethod.POST).build()
        val expected = MessagingResponse.Builder()
                .message(message).build()

        // Rewritten using the extensions
        val actual = messagingResponse {
            message("Store Location: 123 Easy St.") {
                action("/SmsHandler.php")
                method(HttpMethod.POST)
            }
        }

        // compare
        assertTwimlEquals(expected, actual)
    }

    @Test
    fun `Message with nested nounds reporting example produces the same TwiML`() {
        // Example code from website (converted to Kotlin)
        val body = Body.Builder("Hello friend").build()
        val media = Media.Builder("https://demo.twilio.com/owl.png")
                .build()
        val message = Message.Builder().body(body).media(media).build()
        val expected = MessagingResponse.Builder()
                .message(message).build()

        // Rewritten using the extensions
        val actual = messagingResponse {
            message {
                body("Hello friend")
                media("https://demo.twilio.com/owl.png")
            }
        }

        // compare
        assertTwimlEquals(expected, actual)
    }
}