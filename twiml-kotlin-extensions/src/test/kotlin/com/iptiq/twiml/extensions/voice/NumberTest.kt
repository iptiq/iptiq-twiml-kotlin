package com.iptiq.twiml.extensions.voice

import com.iptiq.twiml.extensions.TwimlTest
import com.twilio.http.HttpMethod
import com.twilio.twiml.VoiceResponse
import com.twilio.twiml.voice.Dial
import com.twilio.twiml.voice.Number.Event.*
import org.junit.jupiter.api.Test
import com.twilio.twiml.voice.Number as TwilioNumber

internal class NumberTest : TwimlTest() {

    @Test
    fun `Dial with one number using extensions produces the same TwiML`() {

        val expected = VoiceResponse.Builder().dial(
            Dial.Builder().number(
                TwilioNumber.Builder("+441234567890")
                    .statusCallback("https://number.test/callback")
                    .statusCallbackMethod(HttpMethod.POST)
                    .statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
                    .build()
            ).build()
        ).build()

        // Rewritten using the extensions
        val actual = voiceResponse {
            dial {
                number("+441234567890") {
                    statusCallback("https://number.test/callback")
                    statusCallbackMethod(HttpMethod.POST)
                    statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
                }
            }
        }

        // compare
        assertTwimlEquals(expected, actual)
    }

    @Test
    fun `Dial with two numbers using extensions produces the same TwiML`() {
        val expected = VoiceResponse.Builder().dial(
            Dial.Builder().number(
                TwilioNumber.Builder("+441234567890")
                    .statusCallback("https://number1.test/callback")
                    .statusCallbackMethod(HttpMethod.POST)
                    .statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
                    .build()
            ).number(
                TwilioNumber.Builder("+449876543210")
                    .statusCallback("https://number2.test/callback")
                    .statusCallbackMethod(HttpMethod.POST)
                    .statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
                    .build()
            ).build()
        ).build()

        // Rewritten using the extensions
        val actual = voiceResponse {
            dial {
                listOf(
                        "+441234567890" to "https://number1.test/callback",
                        "+449876543210" to "https://number2.test/callback"
                ).forEach { (number, url) ->
                    number(number) {
                        statusCallback(url)
                        statusCallbackMethod(HttpMethod.POST)
                        statusCallbackEvents(listOf(INITIATED, RINGING, ANSWERED, COMPLETED))
                    }
                }
            }
        }

        // compare
        assertTwimlEquals(expected, actual)
    }
}