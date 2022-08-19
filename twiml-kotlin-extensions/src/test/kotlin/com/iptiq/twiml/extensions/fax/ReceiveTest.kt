package com.iptiq.twiml.extensions.fax

import com.iptiq.twiml.extensions.TwimlTest
import com.twilio.twiml.fax.Receive.MediaType.IMAGE_TIFF
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Test using the library to reproduce all examples on https://www.twilio.com/docs/fax/twiml/receive
 *
 * There are no code examples so attempt to reproduce the TwiML
 */
internal class ReceiveTest : TwimlTest() {

    private fun String.removeWhitespace() = this.replace(Regex("\\s"), "")

    @Test
    fun `Receive a Fax with Action URL example produces the same TwiML`() {
        // Example TwiML from website
        val expected = """<?xml version="1.0" encoding="UTF-8"?>
                         |<Response>
                         |  <Receive action="/fax/received"/>
                         |</Response>""".trimMargin()

        // Rewritten using the extensions
        val actual = faxResponse {
            receive {
                action("/fax/received")
            }
        }.toXml()

        // compare
        assertEquals(expected.removeWhitespace(), actual.removeWhitespace())
    }

    @Test
    fun `Store Fax Image as TIFF example produces the same TwiML`() {
        // Example TwiML from website (tweaked to use self closing tag - this is what the SDK produces
        val expected = """<?xml version="1.0" encoding="UTF-8"?>
                         |<Response>
                         |  <Receive mediaType="image/tiff" storeMedia="true"/>
                         |</Response>""".trimMargin()

        // Rewritten using the extensions
        val actual = faxResponse {
            receive {
                mediaType(IMAGE_TIFF)
                storeMedia(true)
            }
        }.toXml()

        // compare
        assertEquals(expected.removeWhitespace(), actual.removeWhitespace())
    }
}