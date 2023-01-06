// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dev.auth3.identity.admin.admin

@SerialVersionUID(0L)
final case class GetIdentityByIdentifierRequest(
    attribute: _root_.scala.Predef.String = "",
    value: _root_.scala.Predef.String = "",
    connectionId: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[GetIdentityByIdentifierRequest] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = attribute
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = value
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = connectionId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
        val __v = attribute
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = value
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = connectionId
        if (!__v.isEmpty) {
          _output__.writeString(3, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withAttribute(__v: _root_.scala.Predef.String): GetIdentityByIdentifierRequest = copy(attribute = __v)
    def withValue(__v: _root_.scala.Predef.String): GetIdentityByIdentifierRequest = copy(value = __v)
    def withConnectionId(__v: _root_.scala.Predef.String): GetIdentityByIdentifierRequest = copy(connectionId = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = attribute
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = value
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = connectionId
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(attribute)
        case 2 => _root_.scalapb.descriptors.PString(value)
        case 3 => _root_.scalapb.descriptors.PString(connectionId)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest.type = dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest
    // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.GetIdentityByIdentifierRequest])
}

object GetIdentityByIdentifierRequest extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest = {
    var __attribute: _root_.scala.Predef.String = ""
    var __value: _root_.scala.Predef.String = ""
    var __connectionId: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __attribute = _input__.readStringRequireUtf8()
        case 18 =>
          __value = _input__.readStringRequireUtf8()
        case 26 =>
          __connectionId = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest(
        attribute = __attribute,
        value = __value,
        connectionId = __connectionId,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest(
        attribute = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        connectionId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AdminProto.javaDescriptor.getMessageTypes().get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AdminProto.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest(
    attribute = "",
    value = "",
    connectionId = ""
  )
  implicit class GetIdentityByIdentifierRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest](_l) {
    def attribute: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.attribute)((c_, f_) => c_.copy(attribute = f_))
    def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
    def connectionId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.connectionId)((c_, f_) => c_.copy(connectionId = f_))
  }
  final val ATTRIBUTE_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  final val CONNECTION_ID_FIELD_NUMBER = 3
  def of(
    attribute: _root_.scala.Predef.String,
    value: _root_.scala.Predef.String,
    connectionId: _root_.scala.Predef.String
  ): _root_.dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest = _root_.dev.auth3.identity.admin.admin.GetIdentityByIdentifierRequest(
    attribute,
    value,
    connectionId
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.GetIdentityByIdentifierRequest])
}