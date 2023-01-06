// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dev.auth3.identity.admin.admin

@SerialVersionUID(0L)
final case class UpdateAddressRequest(
    id: _root_.scala.Predef.String = "",
    attribute: dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[UpdateAddressRequest] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = id
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (attribute.verified.isDefined) {
        val __value = attribute.verified.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
      };
      if (attribute.address.isDefined) {
        val __value = attribute.address.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
        val __v = id
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      attribute.verified.foreach { __v =>
        val __m = __v
        _output__.writeBool(2, __m)
      };
      attribute.address.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def withId(__v: _root_.scala.Predef.String): UpdateAddressRequest = copy(id = __v)
    def getVerified: _root_.scala.Boolean = attribute.verified.getOrElse(false)
    def withVerified(__v: _root_.scala.Boolean): UpdateAddressRequest = copy(attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Verified(__v))
    def getAddress: _root_.scala.Predef.String = attribute.address.getOrElse("")
    def withAddress(__v: _root_.scala.Predef.String): UpdateAddressRequest = copy(attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Address(__v))
    def clearAttribute: UpdateAddressRequest = copy(attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Empty)
    def withAttribute(__v: dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute): UpdateAddressRequest = copy(attribute = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = id
          if (__t != "") __t else null
        }
        case 2 => attribute.verified.orNull
        case 3 => attribute.address.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(id)
        case 2 => attribute.verified.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => attribute.address.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: dev.auth3.identity.admin.admin.UpdateAddressRequest.type = dev.auth3.identity.admin.admin.UpdateAddressRequest
    // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.UpdateAddressRequest])
}

object UpdateAddressRequest extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateAddressRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateAddressRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.UpdateAddressRequest = {
    var __id: _root_.scala.Predef.String = ""
    var __attribute: dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Empty
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __id = _input__.readStringRequireUtf8()
        case 16 =>
          __attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Verified(_input__.readBool())
        case 26 =>
          __attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Address(_input__.readStringRequireUtf8())
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    dev.auth3.identity.admin.admin.UpdateAddressRequest(
        id = __id,
        attribute = __attribute,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.UpdateAddressRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      dev.auth3.identity.admin.admin.UpdateAddressRequest(
        id = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        attribute = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]).map(dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Verified(_))
            .orElse[dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute](__fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]).map(dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Address(_)))
            .getOrElse(dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AdminProto.javaDescriptor.getMessageTypes().get(38)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AdminProto.scalaDescriptor.messages(38)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = dev.auth3.identity.admin.admin.UpdateAddressRequest(
    id = "",
    attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Empty
  )
  sealed trait Attribute extends _root_.scalapb.GeneratedOneof {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isVerified: _root_.scala.Boolean = false
    def isAddress: _root_.scala.Boolean = false
    def verified: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    def address: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
  }
  object Attribute {
    @SerialVersionUID(0L)
    case object Empty extends dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class Verified(value: _root_.scala.Boolean) extends dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute {
      type ValueType = _root_.scala.Boolean
      override def isVerified: _root_.scala.Boolean = true
      override def verified: _root_.scala.Option[_root_.scala.Boolean] = Some(value)
      override def number: _root_.scala.Int = 2
    }
    @SerialVersionUID(0L)
    final case class Address(value: _root_.scala.Predef.String) extends dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute {
      type ValueType = _root_.scala.Predef.String
      override def isAddress: _root_.scala.Boolean = true
      override def address: _root_.scala.Option[_root_.scala.Predef.String] = Some(value)
      override def number: _root_.scala.Int = 3
    }
  }
  implicit class UpdateAddressRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateAddressRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.UpdateAddressRequest](_l) {
    def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def verified: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getVerified)((c_, f_) => c_.copy(attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Verified(f_)))
    def address: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getAddress)((c_, f_) => c_.copy(attribute = dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute.Address(f_)))
    def attribute: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute] = field(_.attribute)((c_, f_) => c_.copy(attribute = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val VERIFIED_FIELD_NUMBER = 2
  final val ADDRESS_FIELD_NUMBER = 3
  def of(
    id: _root_.scala.Predef.String,
    attribute: dev.auth3.identity.admin.admin.UpdateAddressRequest.Attribute
  ): _root_.dev.auth3.identity.admin.admin.UpdateAddressRequest = _root_.dev.auth3.identity.admin.admin.UpdateAddressRequest(
    id,
    attribute
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.UpdateAddressRequest])
}
