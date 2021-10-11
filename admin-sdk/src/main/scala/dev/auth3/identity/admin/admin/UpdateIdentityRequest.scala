// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dev.auth3.identity.admin.admin

@SerialVersionUID(0L)
final case class UpdateIdentityRequest(
    identityId: _root_.scala.Predef.String = "",
    lock: dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock = dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock.UNLOCKED,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[UpdateIdentityRequest] {
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
      
      {
        val __value = lock.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, __value)
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
      {
        val __v = lock.value
        if (__v != 0) {
          _output__.writeEnum(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withIdentityId(__v: _root_.scala.Predef.String): UpdateIdentityRequest = copy(identityId = __v)
    def withLock(__v: dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock): UpdateIdentityRequest = copy(lock = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = identityId
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = lock.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(identityId)
        case 2 => _root_.scalapb.descriptors.PEnum(lock.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: dev.auth3.identity.admin.admin.UpdateIdentityRequest.type = dev.auth3.identity.admin.admin.UpdateIdentityRequest
    // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.UpdateIdentityRequest])
}

object UpdateIdentityRequest extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateIdentityRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateIdentityRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.UpdateIdentityRequest = {
    var __identityId: _root_.scala.Predef.String = ""
    var __lock: dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock = dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock.UNLOCKED
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __identityId = _input__.readStringRequireUtf8()
        case 16 =>
          __lock = dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock.fromValue(_input__.readEnum())
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    dev.auth3.identity.admin.admin.UpdateIdentityRequest(
        identityId = __identityId,
        lock = __lock,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.UpdateIdentityRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      dev.auth3.identity.admin.admin.UpdateIdentityRequest(
        identityId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        lock = dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock.UNLOCKED.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AdminProto.javaDescriptor.getMessageTypes().get(8)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AdminProto.scalaDescriptor.messages(8)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock
    }
  }
  lazy val defaultInstance = dev.auth3.identity.admin.admin.UpdateIdentityRequest(
    identityId = "",
    lock = dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock.UNLOCKED
  )
  sealed abstract class Lock(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
    type EnumType = Lock
    def isUnlocked: _root_.scala.Boolean = false
    def isAdminLocked: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Lock] = dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock
    final def asRecognized: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock.Recognized])
  }
  
  object Lock extends _root_.scalapb.GeneratedEnumCompanion[Lock] {
    sealed trait Recognized extends Lock
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Lock] = this
    
    @SerialVersionUID(0L)
    case object UNLOCKED extends Lock(0) with Lock.Recognized {
      val index = 0
      val name = "UNLOCKED"
      override def isUnlocked: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object ADMIN_LOCKED extends Lock(1) with Lock.Recognized {
      val index = 1
      val name = "ADMIN_LOCKED"
      override def isAdminLocked: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends Lock(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
    lazy val values = scala.collection.immutable.Seq(UNLOCKED, ADMIN_LOCKED)
    def fromValue(__value: _root_.scala.Int): Lock = __value match {
      case 0 => UNLOCKED
      case 1 => ADMIN_LOCKED
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = dev.auth3.identity.admin.admin.UpdateIdentityRequest.javaDescriptor.getEnumTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = dev.auth3.identity.admin.admin.UpdateIdentityRequest.scalaDescriptor.enums(0)
  }
  implicit class UpdateIdentityRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateIdentityRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.UpdateIdentityRequest](_l) {
    def identityId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.identityId)((c_, f_) => c_.copy(identityId = f_))
    def lock: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock] = field(_.lock)((c_, f_) => c_.copy(lock = f_))
  }
  final val IDENTITY_ID_FIELD_NUMBER = 1
  final val LOCK_FIELD_NUMBER = 2
  def of(
    identityId: _root_.scala.Predef.String,
    lock: dev.auth3.identity.admin.admin.UpdateIdentityRequest.Lock
  ): _root_.dev.auth3.identity.admin.admin.UpdateIdentityRequest = _root_.dev.auth3.identity.admin.admin.UpdateIdentityRequest(
    identityId,
    lock
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.UpdateIdentityRequest])
}
