package com.iptiq.twiml.extensions.voice

import com.iptiq.twiml.extensions.TwimlTest
import com.twilio.http.HttpMethod
import com.twilio.twiml.voice.Dial
import com.twilio.twiml.voice.Number.Event.*
import com.twilio.type.PhoneNumber
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import com.twilio.twiml.voice.Number as TwilioNumber

internal class DialNumberTest : TwimlTest() {

    @Test
    fun `buildDial { number(string) number(string) } will replace the number`() {
        val dial = buildDial {
            number("123")
            number("456")
        }
        assertEquals(dial.number, "456")
        assertEquals(0, dial.children.size)
    }

    @Test
    fun `buildDial { number(string) {} number(string) {} } will nest multiple numbers`() {
        val dial = buildDial {
            number("123") {}
            number("456") {}
        }
        assertNull(dial.number)
        assertEquals(
            dial.children.toSet(),
            setOf(
                buildNumber("123"),
                buildNumber("456")
            )
        )
    }

    @Test
    fun `buildDial { number(PhoneNumber(string)) number(PhoneNumber(string)) } will nest multiple numbers`() {
        val dial = buildDial {
            number(PhoneNumber("123"))
            number(PhoneNumber("456"))
        }
        assertNull(dial.number)
        assertEquals(
            dial.children.toSet(),
            setOf(
                buildNumber("123"),
                buildNumber("456")
            )
        )
    }

}

