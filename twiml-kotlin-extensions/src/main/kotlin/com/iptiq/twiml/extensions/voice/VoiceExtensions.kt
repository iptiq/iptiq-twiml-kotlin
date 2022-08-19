/**
 * Generated using com.iptiq:twiml-kotlin-code-generation version 8.34.1.0
 *
 * (C) 2022 iptiQ
 *
 * @author Allan Todd
 */
package com.iptiq.twiml.extensions.voice

import com.iptiq.twiml.extensions.shared.*
import com.twilio.twiml.VoiceResponse
import com.twilio.twiml.voice.Connect
import com.twilio.twiml.voice.Autopilot
import com.twilio.twiml.GenericNode
import com.twilio.twiml.voice.Conversation
import com.twilio.twiml.voice.Room
import com.twilio.twiml.voice.Stream
import com.twilio.twiml.voice.Parameter
import com.twilio.twiml.voice.VirtualAgent
import com.twilio.twiml.voice.Config
import com.twilio.twiml.voice.Dial
import com.twilio.twiml.voice.Client
import com.twilio.twiml.voice.Identity
import com.twilio.twiml.voice.Conference
import com.twilio.twiml.voice.Number
import com.twilio.twiml.voice.Queue
import com.twilio.twiml.voice.Sim
import com.twilio.twiml.voice.Sip
import com.twilio.twiml.voice.Echo
import com.twilio.twiml.voice.Enqueue
import com.twilio.twiml.voice.Task
import com.twilio.twiml.voice.Gather
import com.twilio.twiml.voice.Pause
import com.twilio.twiml.voice.Play
import com.twilio.twiml.voice.Say
import com.twilio.twiml.voice.SsmlBreak
import com.twilio.twiml.voice.SsmlEmphasis
import com.twilio.twiml.voice.SsmlLang
import com.twilio.twiml.voice.SsmlP
import com.twilio.twiml.voice.SsmlPhoneme
import com.twilio.twiml.voice.SsmlProsody
import com.twilio.twiml.voice.SsmlS
import com.twilio.twiml.voice.SsmlSayAs
import com.twilio.twiml.voice.SsmlSub
import com.twilio.twiml.voice.SsmlW
import com.twilio.twiml.voice.Hangup
import com.twilio.twiml.voice.Leave
import com.twilio.twiml.voice.Pay
import com.twilio.twiml.voice.Prompt
import com.twilio.twiml.voice.Record
import com.twilio.twiml.voice.Redirect
import com.twilio.twiml.voice.Refer
import com.twilio.twiml.voice.ReferSip
import com.twilio.twiml.voice.Reject
import com.twilio.twiml.voice.Sms
import com.twilio.twiml.voice.Start
import com.twilio.twiml.voice.Siprec
import com.twilio.twiml.voice.Stop
import com.twilio.type.PhoneNumber
import java.net.URI

typealias VoiceResponseBlock = VoiceResponse.Builder.() -> Unit
typealias ConnectBlock = Connect.Builder.() -> Unit
typealias AutopilotBlock = Autopilot.Builder.() -> Unit
typealias GenericNodeBlock = GenericNode.Builder.() -> Unit
typealias ConversationBlock = Conversation.Builder.() -> Unit
typealias RoomBlock = Room.Builder.() -> Unit
typealias StreamBlock = Stream.Builder.() -> Unit
typealias ParameterBlock = Parameter.Builder.() -> Unit
typealias VirtualAgentBlock = VirtualAgent.Builder.() -> Unit
typealias ConfigBlock = Config.Builder.() -> Unit
typealias DialBlock = Dial.Builder.() -> Unit
typealias ClientBlock = Client.Builder.() -> Unit
typealias IdentityBlock = Identity.Builder.() -> Unit
typealias ConferenceBlock = Conference.Builder.() -> Unit
typealias NumberBlock = Number.Builder.() -> Unit
typealias QueueBlock = Queue.Builder.() -> Unit
typealias SimBlock = Sim.Builder.() -> Unit
typealias SipBlock = Sip.Builder.() -> Unit
typealias EchoBlock = Echo.Builder.() -> Unit
typealias EnqueueBlock = Enqueue.Builder.() -> Unit
typealias TaskBlock = Task.Builder.() -> Unit
typealias GatherBlock = Gather.Builder.() -> Unit
typealias PauseBlock = Pause.Builder.() -> Unit
typealias PlayBlock = Play.Builder.() -> Unit
typealias SayBlock = Say.Builder.() -> Unit
typealias SsmlBreakBlock = SsmlBreak.Builder.() -> Unit
typealias SsmlEmphasisBlock = SsmlEmphasis.Builder.() -> Unit
typealias SsmlLangBlock = SsmlLang.Builder.() -> Unit
typealias SsmlPBlock = SsmlP.Builder.() -> Unit
typealias SsmlPhonemeBlock = SsmlPhoneme.Builder.() -> Unit
typealias SsmlProsodyBlock = SsmlProsody.Builder.() -> Unit
typealias SsmlSBlock = SsmlS.Builder.() -> Unit
typealias SsmlSayAsBlock = SsmlSayAs.Builder.() -> Unit
typealias SsmlSubBlock = SsmlSub.Builder.() -> Unit
typealias SsmlWBlock = SsmlW.Builder.() -> Unit
typealias HangupBlock = Hangup.Builder.() -> Unit
typealias LeaveBlock = Leave.Builder.() -> Unit
typealias PayBlock = Pay.Builder.() -> Unit
typealias PromptBlock = Prompt.Builder.() -> Unit
typealias RecordBlock = Record.Builder.() -> Unit
typealias RedirectBlock = Redirect.Builder.() -> Unit
typealias ReferBlock = Refer.Builder.() -> Unit
typealias ReferSipBlock = ReferSip.Builder.() -> Unit
typealias RejectBlock = Reject.Builder.() -> Unit
typealias SmsBlock = Sms.Builder.() -> Unit
typealias StartBlock = Start.Builder.() -> Unit
typealias SiprecBlock = Siprec.Builder.() -> Unit
typealias StopBlock = Stop.Builder.() -> Unit

//
// com.twilio.twiml.VoiceResponse
//
fun voiceResponse(block: VoiceResponseBlock = {}): VoiceResponse = VoiceResponse.Builder().apply(block).build()
fun VoiceResponse.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun VoiceResponse.Builder.connect(block: ConnectBlock = {}) = this.apply { connect(buildConnect(block)) }
fun VoiceResponse.Builder.dial(block: DialBlock = {}) = this.apply { dial(buildDial(block)) }
fun VoiceResponse.Builder.dial(number: String, block: DialBlock = {}) = this.apply { dial(buildDial(number, block)) }
fun VoiceResponse.Builder.echo(block: EchoBlock = {}) = this.apply { echo(buildEcho(block)) }
fun VoiceResponse.Builder.enqueue(block: EnqueueBlock = {}) = this.apply { enqueue(buildEnqueue(block)) }
fun VoiceResponse.Builder.enqueue(name: String, block: EnqueueBlock = {}) = this.apply { enqueue(buildEnqueue(name, block)) }
fun VoiceResponse.Builder.gather(block: GatherBlock = {}) = this.apply { gather(buildGather(block)) }
fun VoiceResponse.Builder.hangup(block: HangupBlock = {}) = this.apply { hangup(buildHangup(block)) }
fun VoiceResponse.Builder.leave(block: LeaveBlock = {}) = this.apply { leave(buildLeave(block)) }
fun VoiceResponse.Builder.pause(block: PauseBlock = {}) = this.apply { pause(buildPause(block)) }
fun VoiceResponse.Builder.pay(block: PayBlock = {}) = this.apply { pay(buildPay(block)) }
fun VoiceResponse.Builder.play(block: PlayBlock = {}) = this.apply { play(buildPlay(block)) }
fun VoiceResponse.Builder.play(url: String, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }
fun VoiceResponse.Builder.play(url: URI, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }
fun VoiceResponse.Builder.prompt(block: PromptBlock = {}) = this.apply { prompt(buildPrompt(block)) }
fun VoiceResponse.Builder.queue(name: String, block: QueueBlock = {}) = this.apply { queue(buildQueue(name, block)) }
fun VoiceResponse.Builder.record(block: RecordBlock = {}) = this.apply { record(buildRecord(block)) }
fun VoiceResponse.Builder.redirect(url: String, block: RedirectBlock = {}) = this.apply { redirect(buildRedirect(url, block)) }
fun VoiceResponse.Builder.redirect(url: URI, block: RedirectBlock = {}) = this.apply { redirect(buildRedirect(url, block)) }
fun VoiceResponse.Builder.refer(block: ReferBlock = {}) = this.apply { refer(buildRefer(block)) }
fun VoiceResponse.Builder.reject(block: RejectBlock = {}) = this.apply { reject(buildReject(block)) }
fun VoiceResponse.Builder.say(block: SayBlock = {}) = this.apply { say(buildSay(block)) }
fun VoiceResponse.Builder.say(message: String, block: SayBlock = {}) = this.apply { say(buildSay(message, block)) }
fun VoiceResponse.Builder.sms(message: String, block: SmsBlock = {}) = this.apply { sms(buildSms(message, block)) }
fun VoiceResponse.Builder.start(block: StartBlock = {}) = this.apply { start(buildStart(block)) }
fun VoiceResponse.Builder.stop(block: StopBlock = {}) = this.apply { stop(buildStop(block)) }

//
// com.twilio.twiml.voice.Connect
//
fun buildConnect(block: ConnectBlock = {}): Connect = Connect.Builder().apply(block).build()
fun Connect.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Connect.Builder.autopilot(name: String, block: AutopilotBlock = {}) = this.apply { autopilot(buildAutopilot(name, block)) }
fun Connect.Builder.conversation(block: ConversationBlock = {}) = this.apply { conversation(buildConversation(block)) }
fun Connect.Builder.room(name: String, block: RoomBlock = {}) = this.apply { room(buildRoom(name, block)) }
fun Connect.Builder.stream(block: StreamBlock = {}) = this.apply { stream(buildStream(block)) }
fun Connect.Builder.virtualAgent(block: VirtualAgentBlock = {}) = this.apply { virtualAgent(buildVirtualAgent(block)) }

//
// com.twilio.twiml.voice.Autopilot
//
fun buildAutopilot(name: String, block: AutopilotBlock = {}): Autopilot = Autopilot.Builder(name).apply(block).build()
fun Autopilot.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Conversation
//
fun buildConversation(block: ConversationBlock = {}): Conversation = Conversation.Builder().apply(block).build()
fun Conversation.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Room
//
fun buildRoom(name: String, block: RoomBlock = {}): Room = Room.Builder(name).apply(block).build()
fun Room.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Stream
//
fun buildStream(block: StreamBlock = {}): Stream = Stream.Builder().apply(block).build()
fun Stream.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Stream.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }

//
// com.twilio.twiml.voice.Parameter
//
fun buildParameter(block: ParameterBlock = {}): Parameter = Parameter.Builder().apply(block).build()
fun Parameter.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.VirtualAgent
//
fun buildVirtualAgent(block: VirtualAgentBlock = {}): VirtualAgent = VirtualAgent.Builder().apply(block).build()
fun VirtualAgent.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun VirtualAgent.Builder.config(block: ConfigBlock = {}) = this.apply { config(buildConfig(block)) }
fun VirtualAgent.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }

//
// com.twilio.twiml.voice.Config
//
fun buildConfig(block: ConfigBlock = {}): Config = Config.Builder().apply(block).build()
fun Config.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Dial
//
fun buildDial(block: DialBlock = {}): Dial = Dial.Builder().apply(block).build()
fun buildDial(number: String, block: DialBlock = {}): Dial = Dial.Builder(number).apply(block).build()
fun Dial.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Dial.Builder.client(block: ClientBlock = {}) = this.apply { client(buildClient(block)) }
fun Dial.Builder.client(identity: String, block: ClientBlock = {}) = this.apply { client(buildClient(identity, block)) }
fun Dial.Builder.conference(name: String, block: ConferenceBlock = {}) = this.apply { conference(buildConference(name, block)) }
fun Dial.Builder.number(phoneNumber: PhoneNumber, block: NumberBlock = {}) = this.apply { number(buildNumber(phoneNumber, block)) }
/** The 'block' parameter is not optional, an attempt to call this function without 'block' would be shadowed by Dial.Builder.number(number: String) */
fun Dial.Builder.number(phoneNumber: String, block: NumberBlock) = this.apply { number(buildNumber(phoneNumber, block)) }
fun Dial.Builder.queue(name: String, block: QueueBlock = {}) = this.apply { queue(buildQueue(name, block)) }
fun Dial.Builder.sim(simSid: String, block: SimBlock = {}) = this.apply { sim(buildSim(simSid, block)) }
fun Dial.Builder.sip(sipUrl: String, block: SipBlock = {}) = this.apply { sip(buildSip(sipUrl, block)) }
fun Dial.Builder.sip(sipUrl: URI, block: SipBlock = {}) = this.apply { sip(buildSip(sipUrl, block)) }

//
// com.twilio.twiml.voice.Client
//
fun buildClient(block: ClientBlock = {}): Client = Client.Builder().apply(block).build()
fun buildClient(identity: String, block: ClientBlock = {}): Client = Client.Builder(identity).apply(block).build()
fun Client.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
/** The 'block' parameter is not optional, an attempt to call this function without 'block' would be shadowed by Client.Builder.identity(identity: String) */
fun Client.Builder.identity(clientIdentity: String, block: IdentityBlock) = this.apply { identity(buildIdentity(clientIdentity, block)) }
fun Client.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }

//
// com.twilio.twiml.voice.Identity
//
fun buildIdentity(clientIdentity: String, block: IdentityBlock = {}): Identity = Identity.Builder(clientIdentity).apply(block).build()
fun Identity.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Conference
//
fun buildConference(name: String, block: ConferenceBlock = {}): Conference = Conference.Builder(name).apply(block).build()
fun Conference.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Number
//
fun buildNumber(phoneNumber: PhoneNumber, block: NumberBlock = {}): Number = Number.Builder(phoneNumber).apply(block).build()
fun buildNumber(phoneNumber: String, block: NumberBlock = {}): Number = Number.Builder(phoneNumber).apply(block).build()
fun Number.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Queue
//
fun buildQueue(name: String, block: QueueBlock = {}): Queue = Queue.Builder(name).apply(block).build()
fun Queue.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Sim
//
fun buildSim(simSid: String, block: SimBlock = {}): Sim = Sim.Builder(simSid).apply(block).build()
fun Sim.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Sip
//
fun buildSip(sipUrl: String, block: SipBlock = {}): Sip = Sip.Builder(sipUrl).apply(block).build()
fun buildSip(sipUrl: URI, block: SipBlock = {}): Sip = Sip.Builder(sipUrl).apply(block).build()
fun Sip.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Echo
//
fun buildEcho(block: EchoBlock = {}): Echo = Echo.Builder().apply(block).build()
fun Echo.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Enqueue
//
fun buildEnqueue(block: EnqueueBlock = {}): Enqueue = Enqueue.Builder().apply(block).build()
fun buildEnqueue(name: String, block: EnqueueBlock = {}): Enqueue = Enqueue.Builder(name).apply(block).build()
fun Enqueue.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Enqueue.Builder.task(body: String, block: TaskBlock = {}) = this.apply { task(buildTask(body, block)) }

//
// com.twilio.twiml.voice.Task
//
fun buildTask(body: String, block: TaskBlock = {}): Task = Task.Builder(body).apply(block).build()
fun Task.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Gather
//
fun buildGather(block: GatherBlock = {}): Gather = Gather.Builder().apply(block).build()
fun Gather.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Gather.Builder.pause(block: PauseBlock = {}) = this.apply { pause(buildPause(block)) }
fun Gather.Builder.play(block: PlayBlock = {}) = this.apply { play(buildPlay(block)) }
fun Gather.Builder.play(url: String, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }
fun Gather.Builder.play(url: URI, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }
fun Gather.Builder.say(block: SayBlock = {}) = this.apply { say(buildSay(block)) }
fun Gather.Builder.say(message: String, block: SayBlock = {}) = this.apply { say(buildSay(message, block)) }

//
// com.twilio.twiml.voice.Pause
//
fun buildPause(block: PauseBlock = {}): Pause = Pause.Builder().apply(block).build()
fun Pause.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Play
//
fun buildPlay(block: PlayBlock = {}): Play = Play.Builder().apply(block).build()
fun buildPlay(url: String, block: PlayBlock = {}): Play = Play.Builder(url).apply(block).build()
fun buildPlay(url: URI, block: PlayBlock = {}): Play = Play.Builder(url).apply(block).build()
fun Play.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Say
//
fun buildSay(block: SayBlock = {}): Say = Say.Builder().apply(block).build()
fun buildSay(message: String, block: SayBlock = {}): Say = Say.Builder(message).apply(block).build()
fun Say.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Say.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }
fun Say.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }
fun Say.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }
fun Say.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }
fun Say.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }
fun Say.Builder.p(block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(block)) }
fun Say.Builder.p(words: String, block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(words, block)) }
fun Say.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }
fun Say.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }
fun Say.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }
fun Say.Builder.s(block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(block)) }
fun Say.Builder.s(words: String, block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(words, block)) }
fun Say.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }
fun Say.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }
fun Say.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }
fun Say.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }

//
// com.twilio.twiml.voice.SsmlBreak
//
fun buildSsmlBreak(block: SsmlBreakBlock = {}): SsmlBreak = SsmlBreak.Builder().apply(block).build()
fun SsmlBreak.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.SsmlEmphasis
//
fun buildSsmlEmphasis(block: SsmlEmphasisBlock = {}): SsmlEmphasis = SsmlEmphasis.Builder().apply(block).build()
fun buildSsmlEmphasis(words: String, block: SsmlEmphasisBlock = {}): SsmlEmphasis = SsmlEmphasis.Builder(words).apply(block).build()
fun SsmlEmphasis.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun SsmlEmphasis.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }
fun SsmlEmphasis.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }
fun SsmlEmphasis.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }
fun SsmlEmphasis.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }
fun SsmlEmphasis.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }
fun SsmlEmphasis.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }
fun SsmlEmphasis.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }
fun SsmlEmphasis.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }
fun SsmlEmphasis.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }
fun SsmlEmphasis.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }
fun SsmlEmphasis.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }
fun SsmlEmphasis.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }

//
// com.twilio.twiml.voice.SsmlLang
//
fun buildSsmlLang(block: SsmlLangBlock = {}): SsmlLang = SsmlLang.Builder().apply(block).build()
fun buildSsmlLang(words: String, block: SsmlLangBlock = {}): SsmlLang = SsmlLang.Builder(words).apply(block).build()
fun SsmlLang.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun SsmlLang.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }
fun SsmlLang.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }
fun SsmlLang.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }
fun SsmlLang.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }
fun SsmlLang.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }
fun SsmlLang.Builder.p(block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(block)) }
fun SsmlLang.Builder.p(words: String, block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(words, block)) }
fun SsmlLang.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }
fun SsmlLang.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }
fun SsmlLang.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }
fun SsmlLang.Builder.s(block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(block)) }
fun SsmlLang.Builder.s(words: String, block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(words, block)) }
fun SsmlLang.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }
fun SsmlLang.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }
fun SsmlLang.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }
fun SsmlLang.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }

//
// com.twilio.twiml.voice.SsmlP
//
fun buildSsmlP(block: SsmlPBlock = {}): SsmlP = SsmlP.Builder().apply(block).build()
fun buildSsmlP(words: String, block: SsmlPBlock = {}): SsmlP = SsmlP.Builder(words).apply(block).build()
fun SsmlP.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun SsmlP.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }
fun SsmlP.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }
fun SsmlP.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }
fun SsmlP.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }
fun SsmlP.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }
fun SsmlP.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }
fun SsmlP.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }
fun SsmlP.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }
fun SsmlP.Builder.s(block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(block)) }
fun SsmlP.Builder.s(words: String, block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(words, block)) }
fun SsmlP.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }
fun SsmlP.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }
fun SsmlP.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }
fun SsmlP.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }

//
// com.twilio.twiml.voice.SsmlPhoneme
//
fun buildSsmlPhoneme(words: String, block: SsmlPhonemeBlock = {}): SsmlPhoneme = SsmlPhoneme.Builder(words).apply(block).build()
fun SsmlPhoneme.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.SsmlProsody
//
fun buildSsmlProsody(block: SsmlProsodyBlock = {}): SsmlProsody = SsmlProsody.Builder().apply(block).build()
fun buildSsmlProsody(words: String, block: SsmlProsodyBlock = {}): SsmlProsody = SsmlProsody.Builder(words).apply(block).build()
fun SsmlProsody.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun SsmlProsody.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }
fun SsmlProsody.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }
fun SsmlProsody.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }
fun SsmlProsody.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }
fun SsmlProsody.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }
fun SsmlProsody.Builder.p(block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(block)) }
fun SsmlProsody.Builder.p(words: String, block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(words, block)) }
fun SsmlProsody.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }
fun SsmlProsody.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }
fun SsmlProsody.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }
fun SsmlProsody.Builder.s(block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(block)) }
fun SsmlProsody.Builder.s(words: String, block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(words, block)) }
fun SsmlProsody.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }
fun SsmlProsody.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }
fun SsmlProsody.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }
fun SsmlProsody.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }

//
// com.twilio.twiml.voice.SsmlS
//
fun buildSsmlS(block: SsmlSBlock = {}): SsmlS = SsmlS.Builder().apply(block).build()
fun buildSsmlS(words: String, block: SsmlSBlock = {}): SsmlS = SsmlS.Builder(words).apply(block).build()
fun SsmlS.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun SsmlS.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }
fun SsmlS.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }
fun SsmlS.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }
fun SsmlS.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }
fun SsmlS.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }
fun SsmlS.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }
fun SsmlS.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }
fun SsmlS.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }
fun SsmlS.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }
fun SsmlS.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }
fun SsmlS.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }
fun SsmlS.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }

//
// com.twilio.twiml.voice.SsmlSayAs
//
fun buildSsmlSayAs(words: String, block: SsmlSayAsBlock = {}): SsmlSayAs = SsmlSayAs.Builder(words).apply(block).build()
fun SsmlSayAs.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.SsmlSub
//
fun buildSsmlSub(words: String, block: SsmlSubBlock = {}): SsmlSub = SsmlSub.Builder(words).apply(block).build()
fun SsmlSub.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.SsmlW
//
fun buildSsmlW(block: SsmlWBlock = {}): SsmlW = SsmlW.Builder().apply(block).build()
fun buildSsmlW(words: String, block: SsmlWBlock = {}): SsmlW = SsmlW.Builder(words).apply(block).build()
fun SsmlW.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun SsmlW.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }
fun SsmlW.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }
fun SsmlW.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }
fun SsmlW.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }
fun SsmlW.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }
fun SsmlW.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }
fun SsmlW.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }
fun SsmlW.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }

//
// com.twilio.twiml.voice.Hangup
//
fun buildHangup(block: HangupBlock = {}): Hangup = Hangup.Builder().apply(block).build()
fun Hangup.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Leave
//
fun buildLeave(block: LeaveBlock = {}): Leave = Leave.Builder().apply(block).build()
fun Leave.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Pay
//
fun buildPay(block: PayBlock = {}): Pay = Pay.Builder().apply(block).build()
fun Pay.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Pay.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }
fun Pay.Builder.prompt(block: PromptBlock = {}) = this.apply { prompt(buildPrompt(block)) }

//
// com.twilio.twiml.voice.Prompt
//
fun buildPrompt(block: PromptBlock = {}): Prompt = Prompt.Builder().apply(block).build()
fun Prompt.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Prompt.Builder.pause(block: PauseBlock = {}) = this.apply { pause(buildPause(block)) }
fun Prompt.Builder.play(block: PlayBlock = {}) = this.apply { play(buildPlay(block)) }
fun Prompt.Builder.play(url: String, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }
fun Prompt.Builder.play(url: URI, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }
fun Prompt.Builder.say(block: SayBlock = {}) = this.apply { say(buildSay(block)) }
fun Prompt.Builder.say(message: String, block: SayBlock = {}) = this.apply { say(buildSay(message, block)) }

//
// com.twilio.twiml.voice.Record
//
fun buildRecord(block: RecordBlock = {}): Record = Record.Builder().apply(block).build()
fun Record.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Redirect
//
fun buildRedirect(url: String, block: RedirectBlock = {}): Redirect = Redirect.Builder(url).apply(block).build()
fun buildRedirect(url: URI, block: RedirectBlock = {}): Redirect = Redirect.Builder(url).apply(block).build()
fun Redirect.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Refer
//
fun buildRefer(block: ReferBlock = {}): Refer = Refer.Builder().apply(block).build()
fun Refer.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Refer.Builder.sip(sipUrl: String, block: ReferSipBlock = {}) = this.apply { sip(buildReferSip(sipUrl, block)) }
fun Refer.Builder.sip(sipUrl: URI, block: ReferSipBlock = {}) = this.apply { sip(buildReferSip(sipUrl, block)) }

//
// com.twilio.twiml.voice.ReferSip
//
fun buildReferSip(sipUrl: String, block: ReferSipBlock = {}): ReferSip = ReferSip.Builder(sipUrl).apply(block).build()
fun buildReferSip(sipUrl: URI, block: ReferSipBlock = {}): ReferSip = ReferSip.Builder(sipUrl).apply(block).build()
fun ReferSip.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Reject
//
fun buildReject(block: RejectBlock = {}): Reject = Reject.Builder().apply(block).build()
fun Reject.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Sms
//
fun buildSms(message: String, block: SmsBlock = {}): Sms = Sms.Builder(message).apply(block).build()
fun Sms.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

//
// com.twilio.twiml.voice.Start
//
fun buildStart(block: StartBlock = {}): Start = Start.Builder().apply(block).build()
fun Start.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Start.Builder.siprec(block: SiprecBlock = {}) = this.apply { siprec(buildSiprec(block)) }
fun Start.Builder.stream(block: StreamBlock = {}) = this.apply { stream(buildStream(block)) }

//
// com.twilio.twiml.voice.Siprec
//
fun buildSiprec(block: SiprecBlock = {}): Siprec = Siprec.Builder().apply(block).build()
fun Siprec.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Siprec.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }

//
// com.twilio.twiml.voice.Stop
//
fun buildStop(block: StopBlock = {}): Stop = Stop.Builder().apply(block).build()
fun Stop.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }
fun Stop.Builder.siprec(block: SiprecBlock = {}) = this.apply { siprec(buildSiprec(block)) }
fun Stop.Builder.stream(block: StreamBlock = {}) = this.apply { stream(buildStream(block)) }
