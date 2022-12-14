package com.iptiq.twiml.extensions.voice

import com.iptiq.twiml.extensions.TwimlTest
import com.twilio.twiml.voice.Identity
import com.twilio.type.PhoneNumber
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class ClientIdentityTest : TwimlTest() {

    @Test
    fun `buildClient { identity(string) identity(string) } will replace the identity`() {
        val client = buildClient {
            identity("identity1")
            identity("identity2")
        }
        assertEquals(client.identity, "identity2")
        assertEquals(0, client.children.size)
    }

    @Test
    fun `buildClient { identity(string) {} identity(string) {} } will nest multiple identities`() {
        val client = buildClient {
            identity("identity1") {}
            identity("identity2") {}
        }
        assertNull(client.identity)
        assertEquals(
            client.children.toSet(),
            setOf(
                buildIdentity("identity1"),
                buildIdentity("identity2"),
            )
        )
    }
}

