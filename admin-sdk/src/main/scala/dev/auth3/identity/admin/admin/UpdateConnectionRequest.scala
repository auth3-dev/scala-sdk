// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dev.auth3.identity.admin.admin

@SerialVersionUID(0L)
final case class UpdateConnectionRequest(
    clientId: _root_.scala.Predef.String = "",
    clientSecret: _root_.scala.Predef.String = "",
    buttonImageUrl: _root_.scala.Predef.String = "",
    provider: dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers.NONE,
    oidcDiscoveryUrl: _root_.scala.Predef.String = "",
    mfa: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    `type`: dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types.UNSET,
    id: _root_.scala.Predef.String = "",
    scopes: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[UpdateConnectionRequest] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = clientId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = clientSecret
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = buttonImageUrl
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = provider.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(6, __value)
        }
      };
      
      {
        val __value = oidcDiscoveryUrl
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, __value)
        }
      };
      mfa.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
      }
      
      {
        val __value = `type`.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(9, __value)
        }
      };
      
      {
        val __value = id
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, __value)
        }
      };
      
      {
        val __value = scopes
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(11, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = clientId
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = clientSecret
        if (!__v.isEmpty) {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = buttonImageUrl
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = provider.value
        if (__v != 0) {
          _output__.writeEnum(6, __v)
        }
      };
      {
        val __v = oidcDiscoveryUrl
        if (!__v.isEmpty) {
          _output__.writeString(7, __v)
        }
      };
      mfa.foreach { __v =>
        val __m = __v
        _output__.writeString(8, __m)
      };
      {
        val __v = `type`.value
        if (__v != 0) {
          _output__.writeEnum(9, __v)
        }
      };
      {
        val __v = id
        if (!__v.isEmpty) {
          _output__.writeString(10, __v)
        }
      };
      {
        val __v = scopes
        if (!__v.isEmpty) {
          _output__.writeString(11, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withClientId(__v: _root_.scala.Predef.String): UpdateConnectionRequest = copy(clientId = __v)
    def withClientSecret(__v: _root_.scala.Predef.String): UpdateConnectionRequest = copy(clientSecret = __v)
    def withButtonImageUrl(__v: _root_.scala.Predef.String): UpdateConnectionRequest = copy(buttonImageUrl = __v)
    def withProvider(__v: dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers): UpdateConnectionRequest = copy(provider = __v)
    def withOidcDiscoveryUrl(__v: _root_.scala.Predef.String): UpdateConnectionRequest = copy(oidcDiscoveryUrl = __v)
    def clearMfa = copy(mfa = _root_.scala.Seq.empty)
    def addMfa(__vs: _root_.scala.Predef.String *): UpdateConnectionRequest = addAllMfa(__vs)
    def addAllMfa(__vs: Iterable[_root_.scala.Predef.String]): UpdateConnectionRequest = copy(mfa = mfa ++ __vs)
    def withMfa(__v: _root_.scala.Seq[_root_.scala.Predef.String]): UpdateConnectionRequest = copy(mfa = __v)
    def withType(__v: dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types): UpdateConnectionRequest = copy(`type` = __v)
    def withId(__v: _root_.scala.Predef.String): UpdateConnectionRequest = copy(id = __v)
    def withScopes(__v: _root_.scala.Predef.String): UpdateConnectionRequest = copy(scopes = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 2 => {
          val __t = clientId
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = clientSecret
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = buttonImageUrl
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = provider.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 7 => {
          val __t = oidcDiscoveryUrl
          if (__t != "") __t else null
        }
        case 8 => mfa
        case 9 => {
          val __t = `type`.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 10 => {
          val __t = id
          if (__t != "") __t else null
        }
        case 11 => {
          val __t = scopes
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 2 => _root_.scalapb.descriptors.PString(clientId)
        case 3 => _root_.scalapb.descriptors.PString(clientSecret)
        case 4 => _root_.scalapb.descriptors.PString(buttonImageUrl)
        case 6 => _root_.scalapb.descriptors.PEnum(provider.scalaValueDescriptor)
        case 7 => _root_.scalapb.descriptors.PString(oidcDiscoveryUrl)
        case 8 => _root_.scalapb.descriptors.PRepeated(mfa.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 9 => _root_.scalapb.descriptors.PEnum(`type`.scalaValueDescriptor)
        case 10 => _root_.scalapb.descriptors.PString(id)
        case 11 => _root_.scalapb.descriptors.PString(scopes)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: dev.auth3.identity.admin.admin.UpdateConnectionRequest.type = dev.auth3.identity.admin.admin.UpdateConnectionRequest
    // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.UpdateConnectionRequest])
}

object UpdateConnectionRequest extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateConnectionRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateConnectionRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.UpdateConnectionRequest = {
    var __clientId: _root_.scala.Predef.String = ""
    var __clientSecret: _root_.scala.Predef.String = ""
    var __buttonImageUrl: _root_.scala.Predef.String = ""
    var __provider: dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers.NONE
    var __oidcDiscoveryUrl: _root_.scala.Predef.String = ""
    val __mfa: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    var __type: dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types.UNSET
    var __id: _root_.scala.Predef.String = ""
    var __scopes: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 18 =>
          __clientId = _input__.readStringRequireUtf8()
        case 26 =>
          __clientSecret = _input__.readStringRequireUtf8()
        case 34 =>
          __buttonImageUrl = _input__.readStringRequireUtf8()
        case 48 =>
          __provider = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers.fromValue(_input__.readEnum())
        case 58 =>
          __oidcDiscoveryUrl = _input__.readStringRequireUtf8()
        case 66 =>
          __mfa += _input__.readStringRequireUtf8()
        case 72 =>
          __type = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types.fromValue(_input__.readEnum())
        case 82 =>
          __id = _input__.readStringRequireUtf8()
        case 90 =>
          __scopes = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    dev.auth3.identity.admin.admin.UpdateConnectionRequest(
        clientId = __clientId,
        clientSecret = __clientSecret,
        buttonImageUrl = __buttonImageUrl,
        provider = __provider,
        oidcDiscoveryUrl = __oidcDiscoveryUrl,
        mfa = __mfa.result(),
        `type` = __type,
        id = __id,
        scopes = __scopes,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.UpdateConnectionRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      dev.auth3.identity.admin.admin.UpdateConnectionRequest(
        clientId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        clientSecret = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        buttonImageUrl = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        provider = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers.NONE.scalaValueDescriptor).number),
        oidcDiscoveryUrl = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        mfa = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        `type` = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types.UNSET.scalaValueDescriptor).number),
        id = __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        scopes = __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AdminProto.javaDescriptor.getMessageTypes().get(22)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AdminProto.scalaDescriptor.messages(22)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 6 => dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers
      case 9 => dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types
    }
  }
  lazy val defaultInstance = dev.auth3.identity.admin.admin.UpdateConnectionRequest(
    clientId = "",
    clientSecret = "",
    buttonImageUrl = "",
    provider = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers.NONE,
    oidcDiscoveryUrl = "",
    mfa = _root_.scala.Seq.empty,
    `type` = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types.UNSET,
    id = "",
    scopes = ""
  )
  sealed abstract class Providers(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
    type EnumType = Providers
    def isNone: _root_.scala.Boolean = false
    def isOpenid: _root_.scala.Boolean = false
    def isAmazon: _root_.scala.Boolean = false
    def isBitbucket: _root_.scala.Boolean = false
    def isBox: _root_.scala.Boolean = false
    def isDailymotion: _root_.scala.Boolean = false
    def isDeezer: _root_.scala.Boolean = false
    def isDigitalocean: _root_.scala.Boolean = false
    def isDiscord: _root_.scala.Boolean = false
    def isDropbox: _root_.scala.Boolean = false
    def isEveonline: _root_.scala.Boolean = false
    def isFacebook: _root_.scala.Boolean = false
    def isFitbit: _root_.scala.Boolean = false
    def isGitea: _root_.scala.Boolean = false
    def isGithub: _root_.scala.Boolean = false
    def isGitlab: _root_.scala.Boolean = false
    def isGoogle: _root_.scala.Boolean = false
    def isShopify: _root_.scala.Boolean = false
    def isSoundcloud: _root_.scala.Boolean = false
    def isSpotify: _root_.scala.Boolean = false
    def isSteam: _root_.scala.Boolean = false
    def isStripe: _root_.scala.Boolean = false
    def isTwitch: _root_.scala.Boolean = false
    def isUber: _root_.scala.Boolean = false
    def isWepay: _root_.scala.Boolean = false
    def isYahoo: _root_.scala.Boolean = false
    def isYammer: _root_.scala.Boolean = false
    def isHeroku: _root_.scala.Boolean = false
    def isInstagram: _root_.scala.Boolean = false
    def isIntercom: _root_.scala.Boolean = false
    def isKakao: _root_.scala.Boolean = false
    def isLastfm: _root_.scala.Boolean = false
    def isLinkedin: _root_.scala.Boolean = false
    def isLine: _root_.scala.Boolean = false
    def isOnedrive: _root_.scala.Boolean = false
    def isAzuread: _root_.scala.Boolean = false
    def isMicrosoftonline: _root_.scala.Boolean = false
    def isBattlenet: _root_.scala.Boolean = false
    def isPaypal: _root_.scala.Boolean = false
    def isTwitter: _root_.scala.Boolean = false
    def isSalesforce: _root_.scala.Boolean = false
    def isTypetalk: _root_.scala.Boolean = false
    def isSlack: _root_.scala.Boolean = false
    def isMeetup: _root_.scala.Boolean = false
    def isXero: _root_.scala.Boolean = false
    def isVk: _root_.scala.Boolean = false
    def isNaver: _root_.scala.Boolean = false
    def isYandex: _root_.scala.Boolean = false
    def isNextcloud: _root_.scala.Boolean = false
    def isApple: _root_.scala.Boolean = false
    def isStrava: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Providers] = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers
    final def asRecognized: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers.Recognized])
  }
  
  object Providers extends _root_.scalapb.GeneratedEnumCompanion[Providers] {
    sealed trait Recognized extends Providers
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Providers] = this
    
    @SerialVersionUID(0L)
    case object NONE extends Providers(0) with Providers.Recognized {
      val index = 0
      val name = "NONE"
      override def isNone: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object OPENID extends Providers(1) with Providers.Recognized {
      val index = 1
      val name = "OPENID"
      override def isOpenid: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object AMAZON extends Providers(2) with Providers.Recognized {
      val index = 2
      val name = "AMAZON"
      override def isAmazon: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object BITBUCKET extends Providers(3) with Providers.Recognized {
      val index = 3
      val name = "BITBUCKET"
      override def isBitbucket: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object BOX extends Providers(4) with Providers.Recognized {
      val index = 4
      val name = "BOX"
      override def isBox: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object DAILYMOTION extends Providers(5) with Providers.Recognized {
      val index = 5
      val name = "DAILYMOTION"
      override def isDailymotion: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object DEEZER extends Providers(6) with Providers.Recognized {
      val index = 6
      val name = "DEEZER"
      override def isDeezer: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object DIGITALOCEAN extends Providers(7) with Providers.Recognized {
      val index = 7
      val name = "DIGITALOCEAN"
      override def isDigitalocean: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object DISCORD extends Providers(8) with Providers.Recognized {
      val index = 8
      val name = "DISCORD"
      override def isDiscord: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object DROPBOX extends Providers(9) with Providers.Recognized {
      val index = 9
      val name = "DROPBOX"
      override def isDropbox: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object EVEONLINE extends Providers(10) with Providers.Recognized {
      val index = 10
      val name = "EVEONLINE"
      override def isEveonline: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object FACEBOOK extends Providers(11) with Providers.Recognized {
      val index = 11
      val name = "FACEBOOK"
      override def isFacebook: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object FITBIT extends Providers(12) with Providers.Recognized {
      val index = 12
      val name = "FITBIT"
      override def isFitbit: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object GITEA extends Providers(13) with Providers.Recognized {
      val index = 13
      val name = "GITEA"
      override def isGitea: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object GITHUB extends Providers(14) with Providers.Recognized {
      val index = 14
      val name = "GITHUB"
      override def isGithub: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object GITLAB extends Providers(15) with Providers.Recognized {
      val index = 15
      val name = "GITLAB"
      override def isGitlab: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object GOOGLE extends Providers(16) with Providers.Recognized {
      val index = 16
      val name = "GOOGLE"
      override def isGoogle: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object SHOPIFY extends Providers(18) with Providers.Recognized {
      val index = 17
      val name = "SHOPIFY"
      override def isShopify: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object SOUNDCLOUD extends Providers(19) with Providers.Recognized {
      val index = 18
      val name = "SOUNDCLOUD"
      override def isSoundcloud: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object SPOTIFY extends Providers(20) with Providers.Recognized {
      val index = 19
      val name = "SPOTIFY"
      override def isSpotify: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object STEAM extends Providers(21) with Providers.Recognized {
      val index = 20
      val name = "STEAM"
      override def isSteam: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object STRIPE extends Providers(22) with Providers.Recognized {
      val index = 21
      val name = "STRIPE"
      override def isStripe: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TWITCH extends Providers(23) with Providers.Recognized {
      val index = 22
      val name = "TWITCH"
      override def isTwitch: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object UBER extends Providers(24) with Providers.Recognized {
      val index = 23
      val name = "UBER"
      override def isUber: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object WEPAY extends Providers(25) with Providers.Recognized {
      val index = 24
      val name = "WEPAY"
      override def isWepay: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object YAHOO extends Providers(26) with Providers.Recognized {
      val index = 25
      val name = "YAHOO"
      override def isYahoo: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object YAMMER extends Providers(27) with Providers.Recognized {
      val index = 26
      val name = "YAMMER"
      override def isYammer: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object HEROKU extends Providers(28) with Providers.Recognized {
      val index = 27
      val name = "HEROKU"
      override def isHeroku: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object INSTAGRAM extends Providers(29) with Providers.Recognized {
      val index = 28
      val name = "INSTAGRAM"
      override def isInstagram: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object INTERCOM extends Providers(30) with Providers.Recognized {
      val index = 29
      val name = "INTERCOM"
      override def isIntercom: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object KAKAO extends Providers(31) with Providers.Recognized {
      val index = 30
      val name = "KAKAO"
      override def isKakao: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object LASTFM extends Providers(32) with Providers.Recognized {
      val index = 31
      val name = "LASTFM"
      override def isLastfm: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object LINKEDIN extends Providers(33) with Providers.Recognized {
      val index = 32
      val name = "LINKEDIN"
      override def isLinkedin: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object LINE extends Providers(34) with Providers.Recognized {
      val index = 33
      val name = "LINE"
      override def isLine: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object ONEDRIVE extends Providers(35) with Providers.Recognized {
      val index = 34
      val name = "ONEDRIVE"
      override def isOnedrive: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object AZUREAD extends Providers(36) with Providers.Recognized {
      val index = 35
      val name = "AZUREAD"
      override def isAzuread: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object MICROSOFTONLINE extends Providers(37) with Providers.Recognized {
      val index = 36
      val name = "MICROSOFTONLINE"
      override def isMicrosoftonline: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object BATTLENET extends Providers(38) with Providers.Recognized {
      val index = 37
      val name = "BATTLENET"
      override def isBattlenet: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object PAYPAL extends Providers(39) with Providers.Recognized {
      val index = 38
      val name = "PAYPAL"
      override def isPaypal: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TWITTER extends Providers(40) with Providers.Recognized {
      val index = 39
      val name = "TWITTER"
      override def isTwitter: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object SALESFORCE extends Providers(41) with Providers.Recognized {
      val index = 40
      val name = "SALESFORCE"
      override def isSalesforce: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPETALK extends Providers(42) with Providers.Recognized {
      val index = 41
      val name = "TYPETALK"
      override def isTypetalk: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object SLACK extends Providers(43) with Providers.Recognized {
      val index = 42
      val name = "SLACK"
      override def isSlack: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object MEETUP extends Providers(44) with Providers.Recognized {
      val index = 43
      val name = "MEETUP"
      override def isMeetup: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object XERO extends Providers(46) with Providers.Recognized {
      val index = 44
      val name = "XERO"
      override def isXero: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object VK extends Providers(47) with Providers.Recognized {
      val index = 45
      val name = "VK"
      override def isVk: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object NAVER extends Providers(48) with Providers.Recognized {
      val index = 46
      val name = "NAVER"
      override def isNaver: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object YANDEX extends Providers(49) with Providers.Recognized {
      val index = 47
      val name = "YANDEX"
      override def isYandex: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object NEXTCLOUD extends Providers(50) with Providers.Recognized {
      val index = 48
      val name = "NEXTCLOUD"
      override def isNextcloud: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object APPLE extends Providers(52) with Providers.Recognized {
      val index = 49
      val name = "APPLE"
      override def isApple: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object STRAVA extends Providers(53) with Providers.Recognized {
      val index = 50
      val name = "STRAVA"
      override def isStrava: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends Providers(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
    lazy val values = scala.collection.immutable.Seq(NONE, OPENID, AMAZON, BITBUCKET, BOX, DAILYMOTION, DEEZER, DIGITALOCEAN, DISCORD, DROPBOX, EVEONLINE, FACEBOOK, FITBIT, GITEA, GITHUB, GITLAB, GOOGLE, SHOPIFY, SOUNDCLOUD, SPOTIFY, STEAM, STRIPE, TWITCH, UBER, WEPAY, YAHOO, YAMMER, HEROKU, INSTAGRAM, INTERCOM, KAKAO, LASTFM, LINKEDIN, LINE, ONEDRIVE, AZUREAD, MICROSOFTONLINE, BATTLENET, PAYPAL, TWITTER, SALESFORCE, TYPETALK, SLACK, MEETUP, XERO, VK, NAVER, YANDEX, NEXTCLOUD, APPLE, STRAVA)
    def fromValue(__value: _root_.scala.Int): Providers = __value match {
      case 0 => NONE
      case 1 => OPENID
      case 2 => AMAZON
      case 3 => BITBUCKET
      case 4 => BOX
      case 5 => DAILYMOTION
      case 6 => DEEZER
      case 7 => DIGITALOCEAN
      case 8 => DISCORD
      case 9 => DROPBOX
      case 10 => EVEONLINE
      case 11 => FACEBOOK
      case 12 => FITBIT
      case 13 => GITEA
      case 14 => GITHUB
      case 15 => GITLAB
      case 16 => GOOGLE
      case 18 => SHOPIFY
      case 19 => SOUNDCLOUD
      case 20 => SPOTIFY
      case 21 => STEAM
      case 22 => STRIPE
      case 23 => TWITCH
      case 24 => UBER
      case 25 => WEPAY
      case 26 => YAHOO
      case 27 => YAMMER
      case 28 => HEROKU
      case 29 => INSTAGRAM
      case 30 => INTERCOM
      case 31 => KAKAO
      case 32 => LASTFM
      case 33 => LINKEDIN
      case 34 => LINE
      case 35 => ONEDRIVE
      case 36 => AZUREAD
      case 37 => MICROSOFTONLINE
      case 38 => BATTLENET
      case 39 => PAYPAL
      case 40 => TWITTER
      case 41 => SALESFORCE
      case 42 => TYPETALK
      case 43 => SLACK
      case 44 => MEETUP
      case 46 => XERO
      case 47 => VK
      case 48 => NAVER
      case 49 => YANDEX
      case 50 => NEXTCLOUD
      case 52 => APPLE
      case 53 => STRAVA
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = dev.auth3.identity.admin.admin.UpdateConnectionRequest.javaDescriptor.getEnumTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = dev.auth3.identity.admin.admin.UpdateConnectionRequest.scalaDescriptor.enums(0)
  }
  sealed abstract class Types(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
    type EnumType = Types
    def isUnset: _root_.scala.Boolean = false
    def isPassword: _root_.scala.Boolean = false
    def isOtp: _root_.scala.Boolean = false
    def isTotp: _root_.scala.Boolean = false
    def isOidc: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Types] = dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types
    final def asRecognized: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types.Recognized])
  }
  
  object Types extends _root_.scalapb.GeneratedEnumCompanion[Types] {
    sealed trait Recognized extends Types
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Types] = this
    
    @SerialVersionUID(0L)
    case object UNSET extends Types(0) with Types.Recognized {
      val index = 0
      val name = "UNSET"
      override def isUnset: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object PASSWORD extends Types(1) with Types.Recognized {
      val index = 1
      val name = "PASSWORD"
      override def isPassword: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object OTP extends Types(2) with Types.Recognized {
      val index = 2
      val name = "OTP"
      override def isOtp: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TOTP extends Types(3) with Types.Recognized {
      val index = 3
      val name = "TOTP"
      override def isTotp: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object OIDC extends Types(4) with Types.Recognized {
      val index = 4
      val name = "OIDC"
      override def isOidc: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends Types(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
    lazy val values = scala.collection.immutable.Seq(UNSET, PASSWORD, OTP, TOTP, OIDC)
    def fromValue(__value: _root_.scala.Int): Types = __value match {
      case 0 => UNSET
      case 1 => PASSWORD
      case 2 => OTP
      case 3 => TOTP
      case 4 => OIDC
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = dev.auth3.identity.admin.admin.UpdateConnectionRequest.javaDescriptor.getEnumTypes().get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = dev.auth3.identity.admin.admin.UpdateConnectionRequest.scalaDescriptor.enums(1)
  }
  implicit class UpdateConnectionRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateConnectionRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.UpdateConnectionRequest](_l) {
    def clientId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.clientId)((c_, f_) => c_.copy(clientId = f_))
    def clientSecret: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.clientSecret)((c_, f_) => c_.copy(clientSecret = f_))
    def buttonImageUrl: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.buttonImageUrl)((c_, f_) => c_.copy(buttonImageUrl = f_))
    def provider: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers] = field(_.provider)((c_, f_) => c_.copy(provider = f_))
    def oidcDiscoveryUrl: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.oidcDiscoveryUrl)((c_, f_) => c_.copy(oidcDiscoveryUrl = f_))
    def mfa: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.mfa)((c_, f_) => c_.copy(mfa = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def scopes: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.scopes)((c_, f_) => c_.copy(scopes = f_))
  }
  final val CLIENT_ID_FIELD_NUMBER = 2
  final val CLIENT_SECRET_FIELD_NUMBER = 3
  final val BUTTON_IMAGE_URL_FIELD_NUMBER = 4
  final val PROVIDER_FIELD_NUMBER = 6
  final val OIDC_DISCOVERY_URL_FIELD_NUMBER = 7
  final val MFA_FIELD_NUMBER = 8
  final val TYPE_FIELD_NUMBER = 9
  final val ID_FIELD_NUMBER = 10
  final val SCOPES_FIELD_NUMBER = 11
  def of(
    clientId: _root_.scala.Predef.String,
    clientSecret: _root_.scala.Predef.String,
    buttonImageUrl: _root_.scala.Predef.String,
    provider: dev.auth3.identity.admin.admin.UpdateConnectionRequest.Providers,
    oidcDiscoveryUrl: _root_.scala.Predef.String,
    mfa: _root_.scala.Seq[_root_.scala.Predef.String],
    `type`: dev.auth3.identity.admin.admin.UpdateConnectionRequest.Types,
    id: _root_.scala.Predef.String,
    scopes: _root_.scala.Predef.String
  ): _root_.dev.auth3.identity.admin.admin.UpdateConnectionRequest = _root_.dev.auth3.identity.admin.admin.UpdateConnectionRequest(
    clientId,
    clientSecret,
    buttonImageUrl,
    provider,
    oidcDiscoveryUrl,
    mfa,
    `type`,
    id,
    scopes
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.UpdateConnectionRequest])
}
