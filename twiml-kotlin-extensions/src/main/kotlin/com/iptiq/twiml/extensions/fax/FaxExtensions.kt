/**
 * Generated using com.iptiq:twiml-kotlin-code-generation version 10.1.2
 *
 * (C) 2024 iptiQ
 *
 * @author Allan Todd
 */
package com.iptiq.twiml.extensions.fax

import com.iptiq.twiml.extensions.shared.*
import com.twilio.twiml.FaxResponse
import com.twilio.twiml.GenericNode
import com.twilio.twiml.fax.Receive

typealias FaxResponseBlock = FaxResponse.Builder.() -> Unit
typealias GenericNodeBlock = GenericNode.Builder.() -> Unit
typealias ReceiveBlock = Receive.Builder.() -> Unit


/**
 * Build a [com.twilio.twiml.FaxResponse]
 */
fun faxResponse(block: FaxResponseBlock = {}): FaxResponse = FaxResponse.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun FaxResponse.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.FaxResponse.Builder.receive
 */
fun FaxResponse.Builder.receive(block: ReceiveBlock = {}) = this.apply { receive(buildReceive(block)) }


/**
 * Build a [com.twilio.twiml.fax.Receive]
 */
fun buildReceive(block: ReceiveBlock = {}): Receive = Receive.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Receive.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
