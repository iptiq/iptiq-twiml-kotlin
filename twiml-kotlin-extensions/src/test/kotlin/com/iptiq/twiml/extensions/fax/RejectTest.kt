package com.iptiq.twiml.extensions.fax

import com.iptiq.twiml.extensions.TwimlTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Test using the library to reproduce all examples on https://www.twilio.com/docs/fax/twiml/reject
 *
 * There are no code examples so attempt to reproduce the TwiML
 */
internal class RejectTest : TwimlTest() {

    private fun String.removeWhitespace() = this.replace(Regex("\\s"), "")

    @Test
    fun `TwiML Fax Reject example produces the same TwiML`() {
        // Example TwiML from website
        val expected = """<?xml version="1.0" encoding="UTF-8"?>
                         |<Response>
                         |  <Reject/>
                         |</Response>""".trimMargin()

        // Rewritten using the extensions
        // NOTE: The SDK does not provide a 'Reject' class
        val actual = faxResponse {
            addChild("Reject")
        }.toXml()

        // compare
        assertEquals(expected.removeWhitespace(), actual.removeWhitespace())
    }
}