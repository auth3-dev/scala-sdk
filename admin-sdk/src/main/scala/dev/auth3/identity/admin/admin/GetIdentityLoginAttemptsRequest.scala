// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dev.auth3.identity.admin.admin

@SerialVersionUID(0L)
final case class GetIdentityLoginAttemptsRequest(
    identityId: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[GetIdentityLoginAttemptsRequest] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = identityId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
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
        val __v = identityId
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withIdentityId(__v: _root_.scala.Predef.String): GetIdentityLoginAttemptsRequest = copy(identityId = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = identityId
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(identityId)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest.type = dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest
    // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.GetIdentityLoginAttemptsRequest])
}

object GetIdentityLoginAttemptsRequest extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest = {
    var __identityId: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __identityId = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest(
        identityId = __identityId,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest(
        identityId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AdminProto.javaDescriptor.getMessageTypes().get(42)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AdminProto.scalaDescriptor.messages(42)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest(
    identityId = ""
  )
  implicit class GetIdentityLoginAttemptsRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest](_l) {
    def identityId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.identityId)((c_, f_) => c_.copy(identityId = f_))
  }
  final val IDENTITY_ID_FIELD_NUMBER = 1
  def of(
    identityId: _root_.scala.Predef.String
  ): _root_.dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest = _root_.dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest(
    identityId
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.GetIdentityLoginAttemptsRequest])
}
