/**
 * Generated using com.iptiq:twiml-kotlin-code-generation version 8.34.1.0
 *
 * (C) 2022 iptiQ
 *
 * @author Allan Todd
 */
package com.iptiq.twiml.extensions.messaging

import com.iptiq.twiml.extensions.shared.*
import com.twilio.twiml.MessagingResponse
import com.twilio.twiml.GenericNode
import com.twilio.twiml.messaging.Message
import com.twilio.twiml.messaging.Body
import com.twilio.twiml.messaging.Media
import com.twilio.twiml.messaging.Redirect
import java.net.URI

typealias MessagingResponseBlock = MessagingResponse.Builder.() -> Unit
typealias GenericNodeBlock = GenericNode.Builder.() -> Unit
typealias MessageBlock = Message.Builder.() -> Unit
typealias BodyBlock = Body.Builder.() -> Unit
typealias MediaBlock = Media.Builder.() -> Unit
typealias RedirectBlock = Redirect.Builder.() -> Unit

//
// com.twilio.twiml.MessagingResponse
//
fun messagingResponse(block: MessagingResponseBlock = {}): MessagingResponse = MessagingResponse.Builder().apply(block).build()
fun MessagingResponse.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun MessagingResponse.Builder.message(block: MessageBlock = {}) = this.apply { message(buildMessage(block)) }
fun MessagingResponse.Builder.message(body: String, block: MessageBlock = {}) = this.apply { message(buildMessage(body, block)) }
fun MessagingResponse.Builder.redirect(url: String, block: RedirectBlock = {}) = this.apply { redirect(buildRedirect(url, block)) }
fun MessagingResponse.Builder.redirect(url: URI, block: RedirectBlock = {}) = this.apply { redirect(buildRedirect(url, block)) }

//
// com.twilio.twiml.messaging.Message
//
fun buildMessage(block: MessageBlock = {}): Message = Message.Builder().apply(block).build()
fun buildMessage(body: String, block: MessageBlock = {}): Message = Message.Builder(body).apply(block).build()
fun Message.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Message.Builder.body(message: String, block: BodyBlock = {}) = this.apply { body(buildBody(message, block)) }
fun Message.Builder.media(url: String, block: MediaBlock = {}) = this.apply { media(buildMedia(url, block)) }
fun Message.Builder.media(url: URI, block: MediaBlock = {}) = this.apply { media(buildMedia(url, block)) }

//
// com.twilio.twiml.messaging.Body
//
fun buildBody(message: String, block: BodyBlock = {}): Body = Body.Builder(message).apply(block).build()
fun Body.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.messaging.Media
//
fun buildMedia(url: String, block: MediaBlock = {}): Media = Media.Builder(url).apply(block).build()
fun buildMedia(url: URI, block: MediaBlock = {}): Media = Media.Builder(url).apply(block).build()
fun Media.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.messaging.Redirect
//
fun buildRedirect(url: String, block: RedirectBlock = {}): Redirect = Redirect.Builder(url).apply(block).build()
fun buildRedirect(url: URI, block: RedirectBlock = {}): Redirect = Redirect.Builder(url).apply(block).build()
fun Redirect.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
