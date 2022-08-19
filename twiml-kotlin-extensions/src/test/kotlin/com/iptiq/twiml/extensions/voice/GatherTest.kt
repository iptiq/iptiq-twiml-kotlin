package com.iptiq.twiml.extensions.voice

import com.iptiq.twiml.extensions.TwimlTest
import com.twilio.twiml.VoiceResponse
import com.twilio.twiml.voice.Gather
import com.twilio.twiml.voice.Pause
import com.twilio.twiml.voice.Redirect
import com.twilio.twiml.voice.Say
import org.junit.jupiter.api.Test

internal class GatherTest : TwimlTest() {

    @Test
    fun `Gather with conditional message using extensions produces the same TwiML`() {

        data class Department(val digit: Int, val name: String)

        val departments = listOf(
            Department(digit = 1, name = "Sales"),
            Department(digit = 2, name = "Servicing"),
            Department(digit = 3, name = "Accounts"),
        )

        listOf(false, true).forEach{ retry ->

            val gatherBuilder = Gather.Builder()
            if (retry) {
                gatherBuilder.say(
                    Say.Builder("Your selection was not recognised.").build()
                ).pause(
                    Pause.Builder().length(1).build()
                )
            }
            departments.forEach {
                gatherBuilder.say(
                    Say.Builder("For ${it.name} please press ${it.digit}").build()
                )
            }

            val expected: VoiceResponse = VoiceResponse.Builder()
                .gather(
                    gatherBuilder
                        .action("http://gatherexample.test/select-department")
                        .numDigits(1)
                        .build()
                )
                .redirect(
                    Redirect.Builder("http://gatherexample.test/select-department").build()
                )
                .build()

            // Rewritten using the extensions
            val actual = voiceResponse {
                gather {
                    if (retry) {
                        say("Your selection was not recognised.")
                        pause {
                            length(1)
                        }
                    }
                    departments.forEach {
                        say("For ${it.name} please press ${it.digit}")
                    }
                    action("http://gatherexample.test/select-department")
                    numDigits(1)
                }
                redirect("http://gatherexample.test/select-department")
            }

            println(actual.toXml())

            // compare
            assertTwimlEquals(expected, actual)
        }
    }
}