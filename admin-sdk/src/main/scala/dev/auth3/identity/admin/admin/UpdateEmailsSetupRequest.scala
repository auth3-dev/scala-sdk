// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dev.auth3.identity.admin.admin

@SerialVersionUID(0L)
final case class UpdateEmailsSetupRequest(
    welcome: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None,
    accountVerification: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None,
    accountRecovery: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None,
    accountRecovered: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None,
    otp: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None,
    smtp: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[UpdateEmailsSetupRequest] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      if (welcome.isDefined) {
        val __value = welcome.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (accountVerification.isDefined) {
        val __value = accountVerification.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (accountRecovery.isDefined) {
        val __value = accountRecovery.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (accountRecovered.isDefined) {
        val __value = accountRecovered.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (otp.isDefined) {
        val __value = otp.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (smtp.isDefined) {
        val __value = smtp.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      welcome.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      accountVerification.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      accountRecovery.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      accountRecovered.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      otp.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      smtp.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getWelcome: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate = welcome.getOrElse(dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate.defaultInstance)
    def clearWelcome: UpdateEmailsSetupRequest = copy(welcome = _root_.scala.None)
    def withWelcome(__v: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate): UpdateEmailsSetupRequest = copy(welcome = Option(__v))
    def getAccountVerification: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate = accountVerification.getOrElse(dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate.defaultInstance)
    def clearAccountVerification: UpdateEmailsSetupRequest = copy(accountVerification = _root_.scala.None)
    def withAccountVerification(__v: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate): UpdateEmailsSetupRequest = copy(accountVerification = Option(__v))
    def getAccountRecovery: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate = accountRecovery.getOrElse(dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate.defaultInstance)
    def clearAccountRecovery: UpdateEmailsSetupRequest = copy(accountRecovery = _root_.scala.None)
    def withAccountRecovery(__v: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate): UpdateEmailsSetupRequest = copy(accountRecovery = Option(__v))
    def getAccountRecovered: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate = accountRecovered.getOrElse(dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate.defaultInstance)
    def clearAccountRecovered: UpdateEmailsSetupRequest = copy(accountRecovered = _root_.scala.None)
    def withAccountRecovered(__v: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate): UpdateEmailsSetupRequest = copy(accountRecovered = Option(__v))
    def getOtp: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate = otp.getOrElse(dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate.defaultInstance)
    def clearOtp: UpdateEmailsSetupRequest = copy(otp = _root_.scala.None)
    def withOtp(__v: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate): UpdateEmailsSetupRequest = copy(otp = Option(__v))
    def getSmtp: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender = smtp.getOrElse(dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender.defaultInstance)
    def clearSmtp: UpdateEmailsSetupRequest = copy(smtp = _root_.scala.None)
    def withSmtp(__v: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender): UpdateEmailsSetupRequest = copy(smtp = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => welcome.orNull
        case 2 => accountVerification.orNull
        case 3 => accountRecovery.orNull
        case 4 => accountRecovered.orNull
        case 5 => otp.orNull
        case 6 => smtp.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => welcome.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => accountVerification.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => accountRecovery.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => accountRecovered.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => otp.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => smtp.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.type = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest
    // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.UpdateEmailsSetupRequest])
}

object UpdateEmailsSetupRequest extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest = {
    var __welcome: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None
    var __accountVerification: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None
    var __accountRecovery: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None
    var __accountRecovered: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None
    var __otp: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scala.None
    var __smtp: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __welcome = Option(__welcome.fold(_root_.scalapb.LiteParser.readMessage[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 18 =>
          __accountVerification = Option(__accountVerification.fold(_root_.scalapb.LiteParser.readMessage[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 26 =>
          __accountRecovery = Option(__accountRecovery.fold(_root_.scalapb.LiteParser.readMessage[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 34 =>
          __accountRecovered = Option(__accountRecovered.fold(_root_.scalapb.LiteParser.readMessage[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 42 =>
          __otp = Option(__otp.fold(_root_.scalapb.LiteParser.readMessage[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 50 =>
          __smtp = Option(__smtp.fold(_root_.scalapb.LiteParser.readMessage[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest(
        welcome = __welcome,
        accountVerification = __accountVerification,
        accountRecovery = __accountRecovery,
        accountRecovered = __accountRecovered,
        otp = __otp,
        smtp = __smtp,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest(
        welcome = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]]),
        accountVerification = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]]),
        accountRecovery = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]]),
        accountRecovered = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]]),
        otp = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]]),
        smtp = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AdminProto.javaDescriptor.getMessageTypes().get(60)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AdminProto.scalaDescriptor.messages(60)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate
      case 2 => __out = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate
      case 3 => __out = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate
      case 4 => __out = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate
      case 5 => __out = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate
      case 6 => __out = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate,
      _root_.dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest(
    welcome = _root_.scala.None,
    accountVerification = _root_.scala.None,
    accountRecovery = _root_.scala.None,
    accountRecovered = _root_.scala.None,
    otp = _root_.scala.None,
    smtp = _root_.scala.None
  )
  @SerialVersionUID(0L)
  final case class EmailTemplate(
      content: _root_.scala.Predef.String = "",
      subject: _root_.scala.Predef.String = "",
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[EmailTemplate] {
      @transient
      private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
      private[this] def __computeSerializedSize(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = content
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        
        {
          val __value = subject
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
          val __v = content
          if (!__v.isEmpty) {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = subject
          if (!__v.isEmpty) {
            _output__.writeString(2, __v)
          }
        };
        unknownFields.writeTo(_output__)
      }
      def withContent(__v: _root_.scala.Predef.String): EmailTemplate = copy(content = __v)
      def withSubject(__v: _root_.scala.Predef.String): EmailTemplate = copy(subject = __v)
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = content
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = subject
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(content)
          case 2 => _root_.scalapb.descriptors.PString(subject)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate.type = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate
      // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.UpdateEmailsSetupRequest.EmailTemplate])
  }
  
  object EmailTemplate extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = this
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate = {
      var __content: _root_.scala.Predef.String = ""
      var __subject: _root_.scala.Predef.String = ""
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __content = _input__.readStringRequireUtf8()
          case 18 =>
            __subject = _input__.readStringRequireUtf8()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate(
          content = __content,
          subject = __subject,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate(
          content = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          subject = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate(
      content = "",
      subject = ""
    )
    implicit class EmailTemplateLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate](_l) {
      def content: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.content)((c_, f_) => c_.copy(content = f_))
      def subject: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.subject)((c_, f_) => c_.copy(subject = f_))
    }
    final val CONTENT_FIELD_NUMBER = 1
    final val SUBJECT_FIELD_NUMBER = 2
    def of(
      content: _root_.scala.Predef.String,
      subject: _root_.scala.Predef.String
    ): _root_.dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate = _root_.dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate(
      content,
      subject
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.UpdateEmailsSetupRequest.EmailTemplate])
  }
  
  @SerialVersionUID(0L)
  final case class EmailSender(
      emailAddress: _root_.scala.Predef.String = "",
      smtpHost: _root_.scala.Predef.String = "",
      smtpPort: _root_.scala.Int = 0,
      smtpUsername: _root_.scala.Predef.String = "",
      smtpPassword: _root_.scala.Predef.String = "",
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[EmailSender] {
      @transient
      private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
      private[this] def __computeSerializedSize(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = emailAddress
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        
        {
          val __value = smtpHost
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
          }
        };
        
        {
          val __value = smtpPort
          if (__value != 0) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(3, __value)
          }
        };
        
        {
          val __value = smtpUsername
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
          }
        };
        
        {
          val __value = smtpPassword
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
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
          val __v = emailAddress
          if (!__v.isEmpty) {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = smtpHost
          if (!__v.isEmpty) {
            _output__.writeString(2, __v)
          }
        };
        {
          val __v = smtpPort
          if (__v != 0) {
            _output__.writeUInt32(3, __v)
          }
        };
        {
          val __v = smtpUsername
          if (!__v.isEmpty) {
            _output__.writeString(4, __v)
          }
        };
        {
          val __v = smtpPassword
          if (!__v.isEmpty) {
            _output__.writeString(5, __v)
          }
        };
        unknownFields.writeTo(_output__)
      }
      def withEmailAddress(__v: _root_.scala.Predef.String): EmailSender = copy(emailAddress = __v)
      def withSmtpHost(__v: _root_.scala.Predef.String): EmailSender = copy(smtpHost = __v)
      def withSmtpPort(__v: _root_.scala.Int): EmailSender = copy(smtpPort = __v)
      def withSmtpUsername(__v: _root_.scala.Predef.String): EmailSender = copy(smtpUsername = __v)
      def withSmtpPassword(__v: _root_.scala.Predef.String): EmailSender = copy(smtpPassword = __v)
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = emailAddress
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = smtpHost
            if (__t != "") __t else null
          }
          case 3 => {
            val __t = smtpPort
            if (__t != 0) __t else null
          }
          case 4 => {
            val __t = smtpUsername
            if (__t != "") __t else null
          }
          case 5 => {
            val __t = smtpPassword
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(emailAddress)
          case 2 => _root_.scalapb.descriptors.PString(smtpHost)
          case 3 => _root_.scalapb.descriptors.PInt(smtpPort)
          case 4 => _root_.scalapb.descriptors.PString(smtpUsername)
          case 5 => _root_.scalapb.descriptors.PString(smtpPassword)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender.type = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender
      // @@protoc_insertion_point(GeneratedMessage[depot.devtools.auth.v0.identity.admin.UpdateEmailsSetupRequest.EmailSender])
  }
  
  object EmailSender extends scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender] = this
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender = {
      var __emailAddress: _root_.scala.Predef.String = ""
      var __smtpHost: _root_.scala.Predef.String = ""
      var __smtpPort: _root_.scala.Int = 0
      var __smtpUsername: _root_.scala.Predef.String = ""
      var __smtpPassword: _root_.scala.Predef.String = ""
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __emailAddress = _input__.readStringRequireUtf8()
          case 18 =>
            __smtpHost = _input__.readStringRequireUtf8()
          case 24 =>
            __smtpPort = _input__.readUInt32()
          case 34 =>
            __smtpUsername = _input__.readStringRequireUtf8()
          case 42 =>
            __smtpPassword = _input__.readStringRequireUtf8()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender(
          emailAddress = __emailAddress,
          smtpHost = __smtpHost,
          smtpPort = __smtpPort,
          smtpUsername = __smtpUsername,
          smtpPassword = __smtpPassword,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender(
          emailAddress = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          smtpHost = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          smtpPort = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Int]).getOrElse(0),
          smtpUsername = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          smtpPassword = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.javaDescriptor.getNestedTypes().get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.scalaDescriptor.nestedMessages(1)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender(
      emailAddress = "",
      smtpHost = "",
      smtpPort = 0,
      smtpUsername = "",
      smtpPassword = ""
    )
    implicit class EmailSenderLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender](_l) {
      def emailAddress: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.emailAddress)((c_, f_) => c_.copy(emailAddress = f_))
      def smtpHost: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.smtpHost)((c_, f_) => c_.copy(smtpHost = f_))
      def smtpPort: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.smtpPort)((c_, f_) => c_.copy(smtpPort = f_))
      def smtpUsername: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.smtpUsername)((c_, f_) => c_.copy(smtpUsername = f_))
      def smtpPassword: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.smtpPassword)((c_, f_) => c_.copy(smtpPassword = f_))
    }
    final val EMAIL_ADDRESS_FIELD_NUMBER = 1
    final val SMTP_HOST_FIELD_NUMBER = 2
    final val SMTP_PORT_FIELD_NUMBER = 3
    final val SMTP_USERNAME_FIELD_NUMBER = 4
    final val SMTP_PASSWORD_FIELD_NUMBER = 5
    def of(
      emailAddress: _root_.scala.Predef.String,
      smtpHost: _root_.scala.Predef.String,
      smtpPort: _root_.scala.Int,
      smtpUsername: _root_.scala.Predef.String,
      smtpPassword: _root_.scala.Predef.String
    ): _root_.dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender = _root_.dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender(
      emailAddress,
      smtpHost,
      smtpPort,
      smtpUsername,
      smtpPassword
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.UpdateEmailsSetupRequest.EmailSender])
  }
  
  implicit class UpdateEmailsSetupRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest](_l) {
    def welcome: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = field(_.getWelcome)((c_, f_) => c_.copy(welcome = Option(f_)))
    def optionalWelcome: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]] = field(_.welcome)((c_, f_) => c_.copy(welcome = f_))
    def accountVerification: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = field(_.getAccountVerification)((c_, f_) => c_.copy(accountVerification = Option(f_)))
    def optionalAccountVerification: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]] = field(_.accountVerification)((c_, f_) => c_.copy(accountVerification = f_))
    def accountRecovery: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = field(_.getAccountRecovery)((c_, f_) => c_.copy(accountRecovery = Option(f_)))
    def optionalAccountRecovery: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]] = field(_.accountRecovery)((c_, f_) => c_.copy(accountRecovery = f_))
    def accountRecovered: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = field(_.getAccountRecovered)((c_, f_) => c_.copy(accountRecovered = Option(f_)))
    def optionalAccountRecovered: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]] = field(_.accountRecovered)((c_, f_) => c_.copy(accountRecovered = f_))
    def otp: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate] = field(_.getOtp)((c_, f_) => c_.copy(otp = Option(f_)))
    def optionalOtp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate]] = field(_.otp)((c_, f_) => c_.copy(otp = f_))
    def smtp: _root_.scalapb.lenses.Lens[UpperPB, dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender] = field(_.getSmtp)((c_, f_) => c_.copy(smtp = Option(f_)))
    def optionalSmtp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender]] = field(_.smtp)((c_, f_) => c_.copy(smtp = f_))
  }
  final val WELCOME_FIELD_NUMBER = 1
  final val ACCOUNT_VERIFICATION_FIELD_NUMBER = 2
  final val ACCOUNT_RECOVERY_FIELD_NUMBER = 3
  final val ACCOUNT_RECOVERED_FIELD_NUMBER = 4
  final val OTP_FIELD_NUMBER = 5
  final val SMTP_FIELD_NUMBER = 6
  def of(
    welcome: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate],
    accountVerification: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate],
    accountRecovery: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate],
    accountRecovered: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate],
    otp: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailTemplate],
    smtp: _root_.scala.Option[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest.EmailSender]
  ): _root_.dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest = _root_.dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest(
    welcome,
    accountVerification,
    accountRecovery,
    accountRecovered,
    otp,
    smtp
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[depot.devtools.auth.v0.identity.admin.UpdateEmailsSetupRequest])
}