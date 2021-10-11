// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dev.auth3.identity.admin.admin

sealed abstract class RequestObjectSigningAlg(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
  type EnumType = RequestObjectSigningAlg
  def isRequestObjectSigningAlgUnset: _root_.scala.Boolean = false
  def isRequestObjectSigningAlgNone: _root_.scala.Boolean = false
  def isRequestObjectSigningAlgRs256: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[RequestObjectSigningAlg] = dev.auth3.identity.admin.admin.RequestObjectSigningAlg
  final def asRecognized: _root_.scala.Option[dev.auth3.identity.admin.admin.RequestObjectSigningAlg.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[dev.auth3.identity.admin.admin.RequestObjectSigningAlg.Recognized])
}

object RequestObjectSigningAlg extends _root_.scalapb.GeneratedEnumCompanion[RequestObjectSigningAlg] {
  sealed trait Recognized extends RequestObjectSigningAlg
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[RequestObjectSigningAlg] = this
  
  @SerialVersionUID(0L)
  case object REQUEST_OBJECT_SIGNING_ALG_UNSET extends RequestObjectSigningAlg(0) with RequestObjectSigningAlg.Recognized {
    val index = 0
    val name = "REQUEST_OBJECT_SIGNING_ALG_UNSET"
    override def isRequestObjectSigningAlgUnset: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object REQUEST_OBJECT_SIGNING_ALG_NONE extends RequestObjectSigningAlg(1) with RequestObjectSigningAlg.Recognized {
    val index = 1
    val name = "REQUEST_OBJECT_SIGNING_ALG_NONE"
    override def isRequestObjectSigningAlgNone: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object REQUEST_OBJECT_SIGNING_ALG_RS256 extends RequestObjectSigningAlg(2) with RequestObjectSigningAlg.Recognized {
    val index = 2
    val name = "REQUEST_OBJECT_SIGNING_ALG_RS256"
    override def isRequestObjectSigningAlgRs256: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends RequestObjectSigningAlg(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
  lazy val values = scala.collection.immutable.Seq(REQUEST_OBJECT_SIGNING_ALG_UNSET, REQUEST_OBJECT_SIGNING_ALG_NONE, REQUEST_OBJECT_SIGNING_ALG_RS256)
  def fromValue(__value: _root_.scala.Int): RequestObjectSigningAlg = __value match {
    case 0 => REQUEST_OBJECT_SIGNING_ALG_UNSET
    case 1 => REQUEST_OBJECT_SIGNING_ALG_NONE
    case 2 => REQUEST_OBJECT_SIGNING_ALG_RS256
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = AdminProto.javaDescriptor.getEnumTypes().get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = AdminProto.scalaDescriptor.enums(6)
}