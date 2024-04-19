/**
 * Generated using com.iptiq:twiml-kotlin-code-generation version 10.1.5
 *
 * (C) 2024 iptiQ
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
import com.twilio.twiml.voice.Application
import com.twilio.twiml.voice.ApplicationSid
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
typealias ApplicationBlock = Application.Builder.() -> Unit
typealias ApplicationSidBlock = ApplicationSid.Builder.() -> Unit
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


/**
 * Build a [com.twilio.twiml.VoiceResponse]
 */
fun voiceResponse(block: VoiceResponseBlock = {}): VoiceResponse = VoiceResponse.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun VoiceResponse.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.connect
 */
fun VoiceResponse.Builder.connect(block: ConnectBlock = {}) = this.apply { connect(buildConnect(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.dial
 */
fun VoiceResponse.Builder.dial(block: DialBlock = {}) = this.apply { dial(buildDial(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.dial
 */
fun VoiceResponse.Builder.dial(number: String, block: DialBlock = {}) = this.apply { dial(buildDial(number, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.echo
 */
fun VoiceResponse.Builder.echo(block: EchoBlock = {}) = this.apply { echo(buildEcho(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.enqueue
 */
fun VoiceResponse.Builder.enqueue(block: EnqueueBlock = {}) = this.apply { enqueue(buildEnqueue(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.enqueue
 */
fun VoiceResponse.Builder.enqueue(name: String, block: EnqueueBlock = {}) = this.apply { enqueue(buildEnqueue(name, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.gather
 */
fun VoiceResponse.Builder.gather(block: GatherBlock = {}) = this.apply { gather(buildGather(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.hangup
 */
fun VoiceResponse.Builder.hangup(block: HangupBlock = {}) = this.apply { hangup(buildHangup(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.leave
 */
fun VoiceResponse.Builder.leave(block: LeaveBlock = {}) = this.apply { leave(buildLeave(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.pause
 */
fun VoiceResponse.Builder.pause(block: PauseBlock = {}) = this.apply { pause(buildPause(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.pay
 */
fun VoiceResponse.Builder.pay(block: PayBlock = {}) = this.apply { pay(buildPay(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.play
 */
fun VoiceResponse.Builder.play(block: PlayBlock = {}) = this.apply { play(buildPlay(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.play
 */
fun VoiceResponse.Builder.play(url: String, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.play
 */
fun VoiceResponse.Builder.play(url: URI, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.prompt
 */
fun VoiceResponse.Builder.prompt(block: PromptBlock = {}) = this.apply { prompt(buildPrompt(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.queue
 */
fun VoiceResponse.Builder.queue(name: String, block: QueueBlock = {}) = this.apply { queue(buildQueue(name, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.record
 */
fun VoiceResponse.Builder.record(block: RecordBlock = {}) = this.apply { record(buildRecord(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.redirect
 */
fun VoiceResponse.Builder.redirect(url: String, block: RedirectBlock = {}) = this.apply { redirect(buildRedirect(url, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.redirect
 */
fun VoiceResponse.Builder.redirect(url: URI, block: RedirectBlock = {}) = this.apply { redirect(buildRedirect(url, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.refer
 */
fun VoiceResponse.Builder.refer(block: ReferBlock = {}) = this.apply { refer(buildRefer(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.reject
 */
fun VoiceResponse.Builder.reject(block: RejectBlock = {}) = this.apply { reject(buildReject(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.say
 */
fun VoiceResponse.Builder.say(block: SayBlock = {}) = this.apply { say(buildSay(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.say
 */
fun VoiceResponse.Builder.say(message: String, block: SayBlock = {}) = this.apply { say(buildSay(message, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.sms
 */
fun VoiceResponse.Builder.sms(message: String, block: SmsBlock = {}) = this.apply { sms(buildSms(message, block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.start
 */
fun VoiceResponse.Builder.start(block: StartBlock = {}) = this.apply { start(buildStart(block)) }

/**
 * @see com.twilio.twiml.VoiceResponse.Builder.stop
 */
fun VoiceResponse.Builder.stop(block: StopBlock = {}) = this.apply { stop(buildStop(block)) }


/**
 * Build a [com.twilio.twiml.voice.Connect]
 */
fun buildConnect(block: ConnectBlock = {}): Connect = Connect.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Connect.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Connect.Builder.autopilot
 */
fun Connect.Builder.autopilot(name: String, block: AutopilotBlock = {}) = this.apply { autopilot(buildAutopilot(name, block)) }

/**
 * @see com.twilio.twiml.voice.Connect.Builder.conversation
 */
fun Connect.Builder.conversation(block: ConversationBlock = {}) = this.apply { conversation(buildConversation(block)) }

/**
 * @see com.twilio.twiml.voice.Connect.Builder.room
 */
fun Connect.Builder.room(name: String, block: RoomBlock = {}) = this.apply { room(buildRoom(name, block)) }

/**
 * @see com.twilio.twiml.voice.Connect.Builder.stream
 */
fun Connect.Builder.stream(block: StreamBlock = {}) = this.apply { stream(buildStream(block)) }

/**
 * @see com.twilio.twiml.voice.Connect.Builder.virtualAgent
 */
fun Connect.Builder.virtualAgent(block: VirtualAgentBlock = {}) = this.apply { virtualAgent(buildVirtualAgent(block)) }


/**
 * Build a [com.twilio.twiml.voice.Autopilot]
 */
fun buildAutopilot(name: String, block: AutopilotBlock = {}): Autopilot = Autopilot.Builder(name).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Autopilot.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Conversation]
 */
fun buildConversation(block: ConversationBlock = {}): Conversation = Conversation.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Conversation.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Room]
 */
fun buildRoom(name: String, block: RoomBlock = {}): Room = Room.Builder(name).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Room.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Stream]
 */
fun buildStream(block: StreamBlock = {}): Stream = Stream.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Stream.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Stream.Builder.parameter
 */
fun Stream.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }


/**
 * Build a [com.twilio.twiml.voice.Parameter]
 */
fun buildParameter(block: ParameterBlock = {}): Parameter = Parameter.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Parameter.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.VirtualAgent]
 */
fun buildVirtualAgent(block: VirtualAgentBlock = {}): VirtualAgent = VirtualAgent.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun VirtualAgent.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.VirtualAgent.Builder.config
 */
fun VirtualAgent.Builder.config(block: ConfigBlock = {}) = this.apply { config(buildConfig(block)) }

/**
 * @see com.twilio.twiml.voice.VirtualAgent.Builder.parameter
 */
fun VirtualAgent.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }


/**
 * Build a [com.twilio.twiml.voice.Config]
 */
fun buildConfig(block: ConfigBlock = {}): Config = Config.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Config.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Dial]
 */
fun buildDial(block: DialBlock = {}): Dial = Dial.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Dial]
 */
fun buildDial(number: String, block: DialBlock = {}): Dial = Dial.Builder(number).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Dial.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.application
 */
fun Dial.Builder.application(block: ApplicationBlock = {}) = this.apply { application(buildApplication(block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.application
 */
fun Dial.Builder.application(applicationSid: String, block: ApplicationBlock = {}) = this.apply { application(buildApplication(applicationSid, block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.client
 */
fun Dial.Builder.client(block: ClientBlock = {}) = this.apply { client(buildClient(block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.client
 */
fun Dial.Builder.client(identity: String, block: ClientBlock = {}) = this.apply { client(buildClient(identity, block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.conference
 */
fun Dial.Builder.conference(name: String, block: ConferenceBlock = {}) = this.apply { conference(buildConference(name, block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.number
 */
fun Dial.Builder.number(phoneNumber: PhoneNumber, block: NumberBlock = {}) = this.apply { number(buildNumber(phoneNumber, block)) }

/**
 * NOTE: The 'block' parameter is not optional, an attempt to call this function without 'block' would be shadowed by Dial.Builder.number(number: String)
 *
 * @see com.twilio.twiml.voice.Dial.Builder.number
 */
fun Dial.Builder.number(phoneNumber: String, block: NumberBlock) = this.apply { number(buildNumber(phoneNumber, block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.queue
 */
fun Dial.Builder.queue(name: String, block: QueueBlock = {}) = this.apply { queue(buildQueue(name, block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.sim
 */
fun Dial.Builder.sim(simSid: String, block: SimBlock = {}) = this.apply { sim(buildSim(simSid, block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.sip
 */
fun Dial.Builder.sip(sipUrl: String, block: SipBlock = {}) = this.apply { sip(buildSip(sipUrl, block)) }

/**
 * @see com.twilio.twiml.voice.Dial.Builder.sip
 */
fun Dial.Builder.sip(sipUrl: URI, block: SipBlock = {}) = this.apply { sip(buildSip(sipUrl, block)) }


/**
 * Build a [com.twilio.twiml.voice.Application]
 */
fun buildApplication(block: ApplicationBlock = {}): Application = Application.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Application]
 */
fun buildApplication(applicationSid: String, block: ApplicationBlock = {}): Application = Application.Builder(applicationSid).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Application.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * NOTE: The 'block' parameter is not optional, an attempt to call this function without 'block' would be shadowed by Application.Builder.applicationSid(applicationSid: String)
 *
 * @see com.twilio.twiml.voice.Application.Builder.applicationSid
 */
fun Application.Builder.applicationSid(sid: String, block: ApplicationSidBlock) = this.apply { applicationSid(buildApplicationSid(sid, block)) }

/**
 * @see com.twilio.twiml.voice.Application.Builder.parameter
 */
fun Application.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }


/**
 * Build a [com.twilio.twiml.voice.ApplicationSid]
 */
fun buildApplicationSid(sid: String, block: ApplicationSidBlock = {}): ApplicationSid = ApplicationSid.Builder(sid).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun ApplicationSid.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Client]
 */
fun buildClient(block: ClientBlock = {}): Client = Client.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Client]
 */
fun buildClient(identity: String, block: ClientBlock = {}): Client = Client.Builder(identity).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Client.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * NOTE: The 'block' parameter is not optional, an attempt to call this function without 'block' would be shadowed by Client.Builder.identity(identity: String)
 *
 * @see com.twilio.twiml.voice.Client.Builder.identity
 */
fun Client.Builder.identity(clientIdentity: String, block: IdentityBlock) = this.apply { identity(buildIdentity(clientIdentity, block)) }

/**
 * @see com.twilio.twiml.voice.Client.Builder.parameter
 */
fun Client.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }


/**
 * Build a [com.twilio.twiml.voice.Identity]
 */
fun buildIdentity(clientIdentity: String, block: IdentityBlock = {}): Identity = Identity.Builder(clientIdentity).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Identity.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Conference]
 */
fun buildConference(name: String, block: ConferenceBlock = {}): Conference = Conference.Builder(name).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Conference.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Number]
 */
fun buildNumber(phoneNumber: PhoneNumber, block: NumberBlock = {}): Number = Number.Builder(phoneNumber).apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Number]
 */
fun buildNumber(phoneNumber: String, block: NumberBlock = {}): Number = Number.Builder(phoneNumber).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Number.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Queue]
 */
fun buildQueue(name: String, block: QueueBlock = {}): Queue = Queue.Builder(name).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Queue.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Sim]
 */
fun buildSim(simSid: String, block: SimBlock = {}): Sim = Sim.Builder(simSid).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Sim.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Sip]
 */
fun buildSip(sipUrl: String, block: SipBlock = {}): Sip = Sip.Builder(sipUrl).apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Sip]
 */
fun buildSip(sipUrl: URI, block: SipBlock = {}): Sip = Sip.Builder(sipUrl).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Sip.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Echo]
 */
fun buildEcho(block: EchoBlock = {}): Echo = Echo.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Echo.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Enqueue]
 */
fun buildEnqueue(block: EnqueueBlock = {}): Enqueue = Enqueue.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Enqueue]
 */
fun buildEnqueue(name: String, block: EnqueueBlock = {}): Enqueue = Enqueue.Builder(name).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Enqueue.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Enqueue.Builder.task
 */
fun Enqueue.Builder.task(body: String, block: TaskBlock = {}) = this.apply { task(buildTask(body, block)) }


/**
 * Build a [com.twilio.twiml.voice.Task]
 */
fun buildTask(body: String, block: TaskBlock = {}): Task = Task.Builder(body).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Task.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Gather]
 */
fun buildGather(block: GatherBlock = {}): Gather = Gather.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Gather.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Gather.Builder.pause
 */
fun Gather.Builder.pause(block: PauseBlock = {}) = this.apply { pause(buildPause(block)) }

/**
 * @see com.twilio.twiml.voice.Gather.Builder.play
 */
fun Gather.Builder.play(block: PlayBlock = {}) = this.apply { play(buildPlay(block)) }

/**
 * @see com.twilio.twiml.voice.Gather.Builder.play
 */
fun Gather.Builder.play(url: String, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }

/**
 * @see com.twilio.twiml.voice.Gather.Builder.play
 */
fun Gather.Builder.play(url: URI, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }

/**
 * @see com.twilio.twiml.voice.Gather.Builder.say
 */
fun Gather.Builder.say(block: SayBlock = {}) = this.apply { say(buildSay(block)) }

/**
 * @see com.twilio.twiml.voice.Gather.Builder.say
 */
fun Gather.Builder.say(message: String, block: SayBlock = {}) = this.apply { say(buildSay(message, block)) }


/**
 * Build a [com.twilio.twiml.voice.Pause]
 */
fun buildPause(block: PauseBlock = {}): Pause = Pause.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Pause.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Play]
 */
fun buildPlay(block: PlayBlock = {}): Play = Play.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Play]
 */
fun buildPlay(url: String, block: PlayBlock = {}): Play = Play.Builder(url).apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Play]
 */
fun buildPlay(url: URI, block: PlayBlock = {}): Play = Play.Builder(url).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Play.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Say]
 */
fun buildSay(block: SayBlock = {}): Say = Say.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Say]
 */
fun buildSay(message: String, block: SayBlock = {}): Say = Say.Builder(message).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Say.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.break_
 */
fun Say.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.emphasis
 */
fun Say.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.emphasis
 */
fun Say.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.lang
 */
fun Say.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.lang
 */
fun Say.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.p
 */
fun Say.Builder.p(block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.p
 */
fun Say.Builder.p(words: String, block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(words, block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.phoneme
 */
fun Say.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.prosody
 */
fun Say.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.prosody
 */
fun Say.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.s
 */
fun Say.Builder.s(block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.s
 */
fun Say.Builder.s(words: String, block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(words, block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.sayAs
 */
fun Say.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.sub
 */
fun Say.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.w
 */
fun Say.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }

/**
 * @see com.twilio.twiml.voice.Say.Builder.w
 */
fun Say.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlBreak]
 */
fun buildSsmlBreak(block: SsmlBreakBlock = {}): SsmlBreak = SsmlBreak.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlBreak.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlEmphasis]
 */
fun buildSsmlEmphasis(block: SsmlEmphasisBlock = {}): SsmlEmphasis = SsmlEmphasis.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.SsmlEmphasis]
 */
fun buildSsmlEmphasis(words: String, block: SsmlEmphasisBlock = {}): SsmlEmphasis = SsmlEmphasis.Builder(words).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlEmphasis.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.break_
 */
fun SsmlEmphasis.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.emphasis
 */
fun SsmlEmphasis.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.emphasis
 */
fun SsmlEmphasis.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.lang
 */
fun SsmlEmphasis.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.lang
 */
fun SsmlEmphasis.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.phoneme
 */
fun SsmlEmphasis.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.prosody
 */
fun SsmlEmphasis.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.prosody
 */
fun SsmlEmphasis.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.sayAs
 */
fun SsmlEmphasis.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.sub
 */
fun SsmlEmphasis.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.w
 */
fun SsmlEmphasis.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlEmphasis.Builder.w
 */
fun SsmlEmphasis.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlLang]
 */
fun buildSsmlLang(block: SsmlLangBlock = {}): SsmlLang = SsmlLang.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.SsmlLang]
 */
fun buildSsmlLang(words: String, block: SsmlLangBlock = {}): SsmlLang = SsmlLang.Builder(words).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlLang.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.break_
 */
fun SsmlLang.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.emphasis
 */
fun SsmlLang.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.emphasis
 */
fun SsmlLang.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.lang
 */
fun SsmlLang.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.lang
 */
fun SsmlLang.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.p
 */
fun SsmlLang.Builder.p(block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.p
 */
fun SsmlLang.Builder.p(words: String, block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.phoneme
 */
fun SsmlLang.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.prosody
 */
fun SsmlLang.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.prosody
 */
fun SsmlLang.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.s
 */
fun SsmlLang.Builder.s(block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.s
 */
fun SsmlLang.Builder.s(words: String, block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.sayAs
 */
fun SsmlLang.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.sub
 */
fun SsmlLang.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.w
 */
fun SsmlLang.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlLang.Builder.w
 */
fun SsmlLang.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlP]
 */
fun buildSsmlP(block: SsmlPBlock = {}): SsmlP = SsmlP.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.SsmlP]
 */
fun buildSsmlP(words: String, block: SsmlPBlock = {}): SsmlP = SsmlP.Builder(words).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlP.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.break_
 */
fun SsmlP.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.emphasis
 */
fun SsmlP.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.emphasis
 */
fun SsmlP.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.lang
 */
fun SsmlP.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.lang
 */
fun SsmlP.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.phoneme
 */
fun SsmlP.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.prosody
 */
fun SsmlP.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.prosody
 */
fun SsmlP.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.s
 */
fun SsmlP.Builder.s(block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.s
 */
fun SsmlP.Builder.s(words: String, block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.sayAs
 */
fun SsmlP.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.sub
 */
fun SsmlP.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.w
 */
fun SsmlP.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlP.Builder.w
 */
fun SsmlP.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlPhoneme]
 */
fun buildSsmlPhoneme(words: String, block: SsmlPhonemeBlock = {}): SsmlPhoneme = SsmlPhoneme.Builder(words).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlPhoneme.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlProsody]
 */
fun buildSsmlProsody(block: SsmlProsodyBlock = {}): SsmlProsody = SsmlProsody.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.SsmlProsody]
 */
fun buildSsmlProsody(words: String, block: SsmlProsodyBlock = {}): SsmlProsody = SsmlProsody.Builder(words).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlProsody.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.break_
 */
fun SsmlProsody.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.emphasis
 */
fun SsmlProsody.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.emphasis
 */
fun SsmlProsody.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.lang
 */
fun SsmlProsody.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.lang
 */
fun SsmlProsody.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.p
 */
fun SsmlProsody.Builder.p(block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.p
 */
fun SsmlProsody.Builder.p(words: String, block: SsmlPBlock = {}) = this.apply { p(buildSsmlP(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.phoneme
 */
fun SsmlProsody.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.prosody
 */
fun SsmlProsody.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.prosody
 */
fun SsmlProsody.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.s
 */
fun SsmlProsody.Builder.s(block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.s
 */
fun SsmlProsody.Builder.s(words: String, block: SsmlSBlock = {}) = this.apply { s(buildSsmlS(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.sayAs
 */
fun SsmlProsody.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.sub
 */
fun SsmlProsody.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.w
 */
fun SsmlProsody.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlProsody.Builder.w
 */
fun SsmlProsody.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlS]
 */
fun buildSsmlS(block: SsmlSBlock = {}): SsmlS = SsmlS.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.SsmlS]
 */
fun buildSsmlS(words: String, block: SsmlSBlock = {}): SsmlS = SsmlS.Builder(words).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlS.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.break_
 */
fun SsmlS.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.emphasis
 */
fun SsmlS.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.emphasis
 */
fun SsmlS.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.lang
 */
fun SsmlS.Builder.lang(block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.lang
 */
fun SsmlS.Builder.lang(words: String, block: SsmlLangBlock = {}) = this.apply { lang(buildSsmlLang(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.phoneme
 */
fun SsmlS.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.prosody
 */
fun SsmlS.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.prosody
 */
fun SsmlS.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.sayAs
 */
fun SsmlS.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.sub
 */
fun SsmlS.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.w
 */
fun SsmlS.Builder.w(block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlS.Builder.w
 */
fun SsmlS.Builder.w(words: String, block: SsmlWBlock = {}) = this.apply { w(buildSsmlW(words, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlSayAs]
 */
fun buildSsmlSayAs(words: String, block: SsmlSayAsBlock = {}): SsmlSayAs = SsmlSayAs.Builder(words).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlSayAs.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlSub]
 */
fun buildSsmlSub(words: String, block: SsmlSubBlock = {}): SsmlSub = SsmlSub.Builder(words).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlSub.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.SsmlW]
 */
fun buildSsmlW(block: SsmlWBlock = {}): SsmlW = SsmlW.Builder().apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.SsmlW]
 */
fun buildSsmlW(words: String, block: SsmlWBlock = {}): SsmlW = SsmlW.Builder(words).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun SsmlW.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlW.Builder.break_
 */
fun SsmlW.Builder.break_(block: SsmlBreakBlock = {}) = this.apply { break_(buildSsmlBreak(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlW.Builder.emphasis
 */
fun SsmlW.Builder.emphasis(block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlW.Builder.emphasis
 */
fun SsmlW.Builder.emphasis(words: String, block: SsmlEmphasisBlock = {}) = this.apply { emphasis(buildSsmlEmphasis(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlW.Builder.phoneme
 */
fun SsmlW.Builder.phoneme(words: String, block: SsmlPhonemeBlock = {}) = this.apply { phoneme(buildSsmlPhoneme(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlW.Builder.prosody
 */
fun SsmlW.Builder.prosody(block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(block)) }

/**
 * @see com.twilio.twiml.voice.SsmlW.Builder.prosody
 */
fun SsmlW.Builder.prosody(words: String, block: SsmlProsodyBlock = {}) = this.apply { prosody(buildSsmlProsody(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlW.Builder.sayAs
 */
fun SsmlW.Builder.sayAs(words: String, block: SsmlSayAsBlock = {}) = this.apply { sayAs(buildSsmlSayAs(words, block)) }

/**
 * @see com.twilio.twiml.voice.SsmlW.Builder.sub
 */
fun SsmlW.Builder.sub(words: String, block: SsmlSubBlock = {}) = this.apply { sub(buildSsmlSub(words, block)) }


/**
 * Build a [com.twilio.twiml.voice.Hangup]
 */
fun buildHangup(block: HangupBlock = {}): Hangup = Hangup.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Hangup.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Hangup.Builder.parameter
 */
fun Hangup.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }


/**
 * Build a [com.twilio.twiml.voice.Leave]
 */
fun buildLeave(block: LeaveBlock = {}): Leave = Leave.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Leave.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Pay]
 */
fun buildPay(block: PayBlock = {}): Pay = Pay.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Pay.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Pay.Builder.parameter
 */
fun Pay.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }

/**
 * @see com.twilio.twiml.voice.Pay.Builder.prompt
 */
fun Pay.Builder.prompt(block: PromptBlock = {}) = this.apply { prompt(buildPrompt(block)) }


/**
 * Build a [com.twilio.twiml.voice.Prompt]
 */
fun buildPrompt(block: PromptBlock = {}): Prompt = Prompt.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Prompt.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Prompt.Builder.pause
 */
fun Prompt.Builder.pause(block: PauseBlock = {}) = this.apply { pause(buildPause(block)) }

/**
 * @see com.twilio.twiml.voice.Prompt.Builder.play
 */
fun Prompt.Builder.play(block: PlayBlock = {}) = this.apply { play(buildPlay(block)) }

/**
 * @see com.twilio.twiml.voice.Prompt.Builder.play
 */
fun Prompt.Builder.play(url: String, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }

/**
 * @see com.twilio.twiml.voice.Prompt.Builder.play
 */
fun Prompt.Builder.play(url: URI, block: PlayBlock = {}) = this.apply { play(buildPlay(url, block)) }

/**
 * @see com.twilio.twiml.voice.Prompt.Builder.say
 */
fun Prompt.Builder.say(block: SayBlock = {}) = this.apply { say(buildSay(block)) }

/**
 * @see com.twilio.twiml.voice.Prompt.Builder.say
 */
fun Prompt.Builder.say(message: String, block: SayBlock = {}) = this.apply { say(buildSay(message, block)) }


/**
 * Build a [com.twilio.twiml.voice.Record]
 */
fun buildRecord(block: RecordBlock = {}): Record = Record.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Record.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Redirect]
 */
fun buildRedirect(url: String, block: RedirectBlock = {}): Redirect = Redirect.Builder(url).apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.Redirect]
 */
fun buildRedirect(url: URI, block: RedirectBlock = {}): Redirect = Redirect.Builder(url).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Redirect.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Refer]
 */
fun buildRefer(block: ReferBlock = {}): Refer = Refer.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Refer.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Refer.Builder.sip
 */
fun Refer.Builder.sip(sipUrl: String, block: ReferSipBlock = {}) = this.apply { sip(buildReferSip(sipUrl, block)) }

/**
 * @see com.twilio.twiml.voice.Refer.Builder.sip
 */
fun Refer.Builder.sip(sipUrl: URI, block: ReferSipBlock = {}) = this.apply { sip(buildReferSip(sipUrl, block)) }


/**
 * Build a [com.twilio.twiml.voice.ReferSip]
 */
fun buildReferSip(sipUrl: String, block: ReferSipBlock = {}): ReferSip = ReferSip.Builder(sipUrl).apply(block).build() 


/**
 * Build a [com.twilio.twiml.voice.ReferSip]
 */
fun buildReferSip(sipUrl: URI, block: ReferSipBlock = {}): ReferSip = ReferSip.Builder(sipUrl).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun ReferSip.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Reject]
 */
fun buildReject(block: RejectBlock = {}): Reject = Reject.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Reject.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Reject.Builder.parameter
 */
fun Reject.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }


/**
 * Build a [com.twilio.twiml.voice.Sms]
 */
fun buildSms(message: String, block: SmsBlock = {}): Sms = Sms.Builder(message).apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Sms.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }


/**
 * Build a [com.twilio.twiml.voice.Start]
 */
fun buildStart(block: StartBlock = {}): Start = Start.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Start.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Start.Builder.siprec
 */
fun Start.Builder.siprec(block: SiprecBlock = {}) = this.apply { siprec(buildSiprec(block)) }

/**
 * @see com.twilio.twiml.voice.Start.Builder.stream
 */
fun Start.Builder.stream(block: StreamBlock = {}) = this.apply { stream(buildStream(block)) }


/**
 * Build a [com.twilio.twiml.voice.Siprec]
 */
fun buildSiprec(block: SiprecBlock = {}): Siprec = Siprec.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Siprec.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Siprec.Builder.parameter
 */
fun Siprec.Builder.parameter(block: ParameterBlock = {}) = this.apply { parameter(buildParameter(block)) }


/**
 * Build a [com.twilio.twiml.voice.Stop]
 */
fun buildStop(block: StopBlock = {}): Stop = Stop.Builder().apply(block).build() 

/**
 * @see com.twilio.twiml.TwiML.Builder.addChild
 */
fun Stop.Builder.addChild(tag: String, block: GenericNodeBlock = {}) = this.apply { addChild(buildGenericNode(tag, block)) }

/**
 * @see com.twilio.twiml.voice.Stop.Builder.siprec
 */
fun Stop.Builder.siprec(block: SiprecBlock = {}) = this.apply { siprec(buildSiprec(block)) }

/**
 * @see com.twilio.twiml.voice.Stop.Builder.stream
 */
fun Stop.Builder.stream(block: StreamBlock = {}) = this.apply { stream(buildStream(block)) }
