package com.iptiq.twiml.extensions.voice

import com.iptiq.twiml.extensions.TwimlTest
import com.twilio.http.HttpMethod
import com.twilio.twiml.voice.Dial
import com.twilio.twiml.voice.Number.Event.*
import org.junit.jupiter.api.Test
import com.twilio.twiml.voice.Number as TwilioNumber

internal class StandaloneTagTest : TwimlTest() {

    @Test
    fun `A standalone Dial tag may be created`() {

        val expected = Dial.Builder().number(
            TwilioNumber.Builder("+441234567890")
                .statusCallback("https://number.test/callback")
                .statusCallbackMethod(HttpMethod.POST)
                .statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
                .build()
        ).build()

        // Rewritten using the extensions
        val actual: Dial = buildDial {
            number("+441234567890") {
                statusCallback("https://number.test/callback")
                statusCallbackMethod(HttpMethod.POST)
                statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
            }
        }

        // compare
        assertTwimlEquals(expected, actual)
    }

    @Test
    fun `A standalone tag may be added to a VoiceResponse later`() {

        val expected = voiceResponse {
            dial {
                number("+441234567890") {
                    statusCallback("https://number.test/callback")
                    statusCallbackMethod(HttpMethod.POST)
                    statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
                }
            }
        }

        // Rewritten using the extensions
        val dial = buildDial {
            number("+441234567890") {
                statusCallback("https://number.test/callback")
                statusCallbackMethod(HttpMethod.POST)
                statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
            }
        }

        val actual = voiceResponse {
            dial(dial)
        }

        // compare
        assertTwimlEquals(expected, actual)
    }

}

