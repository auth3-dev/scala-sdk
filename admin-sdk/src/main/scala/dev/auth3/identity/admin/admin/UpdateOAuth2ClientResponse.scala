// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dev.auth3.identity.admin.admin

@SerialVersionUID(0L)
final case class UpdateOAuth2ClientResponse(
    clientId: _root_.scala.Predef.String = "",
    clientSecret: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[UpdateOAuth2ClientResponse] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = clientId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = clientSecret
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
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
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = clientSecret
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withClientId(__v: _root_.scala.Predef.String): UpdateOAuth2ClientResponse = copy(clientId = __v)
    def withClientSecret(__v: _root_.scala.Predef.String): UpdateOAuth2ClientResponse = copy(clientSecret = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = clientId
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = clientSecret
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(clientId)
        case 2 => _root_.scalapb.descriptors.PString(clientSecret)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse.type = dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse
    // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.UpdateOAuth2ClientResponse])
}

object UpdateOAuth2ClientResponse extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse = {
    var __clientId: _root_.scala.Predef.String = ""
    var __clientSecret: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __clientId = _input__.readStringRequireUtf8()
        case 18 =>
          __clientSecret = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse(
        clientId = __clientId,
        clientSecret = __clientSecret,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse(
        clientId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        clientSecret = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AdminProto.javaDescriptor.getMessageTypes().get(31)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AdminProto.scalaDescriptor.messages(31)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse(
    clientId = "",
    clientSecret = ""
  )
  implicit class UpdateOAuth2ClientResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse](_l) {
    def clientId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.clientId)((c_, f_) => c_.copy(clientId = f_))
    def clientSecret: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.clientSecret)((c_, f_) => c_.copy(clientSecret = f_))
  }
  final val CLIENT_ID_FIELD_NUMBER = 1
  final val CLIENT_SECRET_FIELD_NUMBER = 2
  def of(
    clientId: _root_.scala.Predef.String,
    clientSecret: _root_.scala.Predef.String
  ): _root_.dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse = _root_.dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse(
    clientId,
    clientSecret
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.UpdateOAuth2ClientResponse])
}
