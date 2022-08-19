/**
 * Generated using com.iptiq:twiml-kotlin-code-generation version 8.34.1.0
 *
 * (C) 2022 iptiQ
 *
 * @author Allan Todd
 */
package com.iptiq.twiml.extensions.shared

import com.twilio.twiml.GenericNode

typealias GenericNodeBlock = GenericNode.Builder.() -> Unit

//
// com.twilio.twiml.GenericNode
//
fun buildGenericNode(tag: String, block: GenericNodeBlock = {}): GenericNode = GenericNode.Builder(tag).apply(block).build()
fun GenericNode.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
