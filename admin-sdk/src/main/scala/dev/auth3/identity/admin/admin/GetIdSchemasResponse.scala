// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dev.auth3.identity.admin.admin

@SerialVersionUID(0L)
final case class GetIdSchemasResponse(
    jsonschemas: _root_.scala.Seq[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[GetIdSchemasResponse] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      jsonschemas.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      jsonschemas.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def clearJsonschemas = copy(jsonschemas = _root_.scala.Seq.empty)
    def addJsonschemas(__vs: dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema *): GetIdSchemasResponse = addAllJsonschemas(__vs)
    def addAllJsonschemas(__vs: Iterable[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema]): GetIdSchemasResponse = copy(jsonschemas = jsonschemas ++ __vs)
    def withJsonschemas(__v: _root_.scala.Seq[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema]): GetIdSchemasResponse = copy(jsonschemas = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => jsonschemas
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(jsonschemas.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: dev.auth3.identity.admin.admin.GetIdSchemasResponse.type = dev.auth3.identity.admin.admin.GetIdSchemasResponse
    // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse])
}

object GetIdSchemasResponse extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.GetIdSchemasResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.GetIdSchemasResponse] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.GetIdSchemasResponse = {
    val __jsonschemas: _root_.scala.collection.immutable.VectorBuilder[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema] = new _root_.scala.collection.immutable.VectorBuilder[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __jsonschemas += _root_.scalapb.LiteParser.readMessage[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema](_input__)
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    dev.auth3.identity.admin.admin.GetIdSchemasResponse(
        jsonschemas = __jsonschemas.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.GetIdSchemasResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      dev.auth3.identity.admin.admin.GetIdSchemasResponse(
        jsonschemas = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AdminProto.javaDescriptor.getMessageTypes().get(49)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AdminProto.scalaDescriptor.messages(49)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = dev.auth3.identity.admin.admin.GetIdSchemasResponse(
    jsonschemas = _root_.scala.Seq.empty
  )
  @SerialVersionUID(0L)
  final case class JsonSchema(
      id: _root_.scala.Predef.String = "",
      name: _root_.scala.Predef.String = "",
      content: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None,
      createdAt: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = _root_.scala.None,
      updatedAt: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = _root_.scala.None,
      isDefault: _root_.scala.Boolean = false,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[JsonSchema] {
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
        
        {
          val __value = name
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
          }
        };
        if (content.isDefined) {
          val __value = content.get
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
        };
        if (createdAt.isDefined) {
          val __value = createdAt.get
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
        };
        if (updatedAt.isDefined) {
          val __value = updatedAt.get
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
        };
        
        {
          val __value = isDefault
          if (__value != false) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(6, __value)
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
          val __v = id
          if (!__v.isEmpty) {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = name
          if (!__v.isEmpty) {
            _output__.writeString(2, __v)
          }
        };
        content.foreach { __v =>
          val __m = __v
          _output__.writeTag(3, 2)
          _output__.writeUInt32NoTag(__m.serializedSize)
          __m.writeTo(_output__)
        };
        createdAt.foreach { __v =>
          val __m = __v
          _output__.writeTag(4, 2)
          _output__.writeUInt32NoTag(__m.serializedSize)
          __m.writeTo(_output__)
        };
        updatedAt.foreach { __v =>
          val __m = __v
          _output__.writeTag(5, 2)
          _output__.writeUInt32NoTag(__m.serializedSize)
          __m.writeTo(_output__)
        };
        {
          val __v = isDefault
          if (__v != false) {
            _output__.writeBool(6, __v)
          }
        };
        unknownFields.writeTo(_output__)
      }
      def withId(__v: _root_.scala.Predef.String): JsonSchema = copy(id = __v)
      def withName(__v: _root_.scala.Predef.String): JsonSchema = copy(name = __v)
      def getContent: com.google.protobuf.struct.Struct = content.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)
      def clearContent: JsonSchema = copy(content = _root_.scala.None)
      def withContent(__v: com.google.protobuf.struct.Struct): JsonSchema = copy(content = Option(__v))
      def getCreatedAt: com.google.protobuf.timestamp.Timestamp = createdAt.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)
      def clearCreatedAt: JsonSchema = copy(createdAt = _root_.scala.None)
      def withCreatedAt(__v: com.google.protobuf.timestamp.Timestamp): JsonSchema = copy(createdAt = Option(__v))
      def getUpdatedAt: com.google.protobuf.timestamp.Timestamp = updatedAt.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)
      def clearUpdatedAt: JsonSchema = copy(updatedAt = _root_.scala.None)
      def withUpdatedAt(__v: com.google.protobuf.timestamp.Timestamp): JsonSchema = copy(updatedAt = Option(__v))
      def withIsDefault(__v: _root_.scala.Boolean): JsonSchema = copy(isDefault = __v)
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = id
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = name
            if (__t != "") __t else null
          }
          case 3 => content.orNull
          case 4 => createdAt.orNull
          case 5 => updatedAt.orNull
          case 6 => {
            val __t = isDefault
            if (__t != false) __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(id)
          case 2 => _root_.scalapb.descriptors.PString(name)
          case 3 => content.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 4 => createdAt.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 5 => updatedAt.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 6 => _root_.scalapb.descriptors.PBoolean(isDefault)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion: dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema.type = dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema
      // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse.JsonSchema])
  }
  
  object JsonSchema extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema] = this
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema = {
      var __id: _root_.scala.Predef.String = ""
      var __name: _root_.scala.Predef.String = ""
      var __content: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None
      var __createdAt: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = _root_.scala.None
      var __updatedAt: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = _root_.scala.None
      var __isDefault: _root_.scala.Boolean = false
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __id = _input__.readStringRequireUtf8()
          case 18 =>
            __name = _input__.readStringRequireUtf8()
          case 26 =>
            __content = Option(__content.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.struct.Struct](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 34 =>
            __createdAt = Option(__createdAt.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.timestamp.Timestamp](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 42 =>
            __updatedAt = Option(__updatedAt.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.timestamp.Timestamp](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 48 =>
            __isDefault = _input__.readBool()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema(
          id = __id,
          name = __name,
          content = __content,
          createdAt = __createdAt,
          updatedAt = __updatedAt,
          isDefault = __isDefault,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema(
          id = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          content = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.struct.Struct]]),
          createdAt = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]]),
          updatedAt = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]]),
          isDefault = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = dev.auth3.identity.admin.admin.GetIdSchemasResponse.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = dev.auth3.identity.admin.admin.GetIdSchemasResponse.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 3 => __out = com.google.protobuf.struct.Struct
        case 4 => __out = com.google.protobuf.timestamp.Timestamp
        case 5 => __out = com.google.protobuf.timestamp.Timestamp
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema(
      id = "",
      name = "",
      content = _root_.scala.None,
      createdAt = _root_.scala.None,
      updatedAt = _root_.scala.None,
      isDefault = false
    )
    implicit class JsonSchemaLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema](_l) {
      def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.id)((c_, f_) => c_.copy(id = f_))
      def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
      def content: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct] = field(_.getContent)((c_, f_) => c_.copy(content = Option(f_)))
      def optionalContent: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.struct.Struct]] = field(_.content)((c_, f_) => c_.copy(content = f_))
      def createdAt: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.timestamp.Timestamp] = field(_.getCreatedAt)((c_, f_) => c_.copy(createdAt = Option(f_)))
      def optionalCreatedAt: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.timestamp.Timestamp]] = field(_.createdAt)((c_, f_) => c_.copy(createdAt = f_))
      def updatedAt: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.timestamp.Timestamp] = field(_.getUpdatedAt)((c_, f_) => c_.copy(updatedAt = Option(f_)))
      def optionalUpdatedAt: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.timestamp.Timestamp]] = field(_.updatedAt)((c_, f_) => c_.copy(updatedAt = f_))
      def isDefault: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.isDefault)((c_, f_) => c_.copy(isDefault = f_))
    }
    final val ID_FIELD_NUMBER = 1
    final val NAME_FIELD_NUMBER = 2
    final val CONTENT_FIELD_NUMBER = 3
    final val CREATED_AT_FIELD_NUMBER = 4
    final val UPDATED_AT_FIELD_NUMBER = 5
    final val IS_DEFAULT_FIELD_NUMBER = 6
    def of(
      id: _root_.scala.Predef.String,
      name: _root_.scala.Predef.String,
      content: _root_.scala.Option[com.google.protobuf.struct.Struct],
      createdAt: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp],
      updatedAt: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp],
      isDefault: _root_.scala.Boolean
    ): _root_.dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema = _root_.dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema(
      id,
      name,
      content,
      createdAt,
      updatedAt,
      isDefault
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse.JsonSchema])
  }
  
  implicit class GetIdSchemasResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.GetIdSchemasResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.GetIdSchemasResponse](_l) {
    def jsonschemas: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema]] = field(_.jsonschemas)((c_, f_) => c_.copy(jsonschemas = f_))
  }
  final val JSONSCHEMAS_FIELD_NUMBER = 1
  def of(
    jsonschemas: _root_.scala.Seq[dev.auth3.identity.admin.admin.GetIdSchemasResponse.JsonSchema]
  ): _root_.dev.auth3.identity.admin.admin.GetIdSchemasResponse = _root_.dev.auth3.identity.admin.admin.GetIdSchemasResponse(
    jsonschemas
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.GetIdSchemasResponse])
}
