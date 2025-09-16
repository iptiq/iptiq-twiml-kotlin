/**
 * Generated using com.iptiq:twiml-kotlin-code-generation version 11.0.0-rc.6
 *
 * (C) 2025 iptiQ
 *
 * @author Allan Todd
 */
package com.iptiq.twiml.extensions.shared

import com.twilio.twiml.GenericNode

typealias GenericNodeBlock = GenericNode.Builder.() -> Unit


/**
 * Build a [com.twilio.twiml.GenericNode]
 */
fun buildGenericNode(tag: String, block: GenericNodeBlock = {}): GenericNode = GenericNode.Builder(tag).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun GenericNode.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
