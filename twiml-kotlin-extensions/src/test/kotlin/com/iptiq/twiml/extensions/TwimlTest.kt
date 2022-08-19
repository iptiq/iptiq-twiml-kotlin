package com.iptiq.twiml.extensions

import com.twilio.twiml.TwiML
import org.junit.jupiter.api.Assertions.assertEquals

internal abstract class TwimlTest {

    /**
     * Verify that the same XML is produced by two tags
     */
    fun <T : TwiML> assertTwimlEquals(expected: T, actual: T) {
        assertEquals(expected.toXml(), actual.toXml())
    }
}