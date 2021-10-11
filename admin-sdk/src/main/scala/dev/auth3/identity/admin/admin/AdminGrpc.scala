package dev.auth3.identity.admin.admin

object AdminGrpc {
  val METHOD_CREATE_IDENTITY: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.CreateIdentityRequest, dev.auth3.identity.admin.admin.CreateIdentityResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "CreateIdentity"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.CreateIdentityRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.CreateIdentityResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(0)))
      .build()
  
  val METHOD_GET_IDENTITY: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetIdentityRequest, dev.auth3.identity.admin.admin.GetIdentityResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetIdentity"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdentityRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdentityResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(1)))
      .build()
  
  val METHOD_GET_IDENTITIES_BY_ATTRIBUTE: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetIdentitiesByAttributeRequest, dev.auth3.identity.admin.admin.GetIdentitiesByAttributeResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetIdentitiesByAttribute"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdentitiesByAttributeRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdentitiesByAttributeResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(2)))
      .build()
  
  val METHOD_GET_IDENTITIES: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetIdentitiesRequest, dev.auth3.identity.admin.admin.GetIdentitiesResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetIdentities"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdentitiesRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdentitiesResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(3)))
      .build()
  
  val METHOD_UPDATE_IDENTITY: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.UpdateIdentityRequest, dev.auth3.identity.admin.admin.UpdateIdentityResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "UpdateIdentity"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateIdentityRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateIdentityResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(4)))
      .build()
  
  val METHOD_DELETE_IDENTITY: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.DeleteIdentityRequest, dev.auth3.identity.admin.admin.DeleteIdentityResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "DeleteIdentity"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.DeleteIdentityRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.DeleteIdentityResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(5)))
      .build()
  
  val METHOD_GET_ADDRESSES: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetAddressesRequest, dev.auth3.identity.admin.admin.GetAddressesResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetAddresses"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetAddressesRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetAddressesResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(6)))
      .build()
  
  val METHOD_GET_ADDRESS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetAddressRequest, dev.auth3.identity.admin.admin.GetAddressResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetAddress"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetAddressRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetAddressResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(7)))
      .build()
  
  val METHOD_UPDATE_ADDRESS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.UpdateAddressRequest, dev.auth3.identity.admin.admin.UpdateAddressResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "UpdateAddress"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateAddressRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateAddressResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(8)))
      .build()
  
  val METHOD_GET_TRAITS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetTraitsRequest, dev.auth3.identity.admin.admin.GetTraitsResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetTraits"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetTraitsRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetTraitsResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(9)))
      .build()
  
  val METHOD_UPDATE_TRAITS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.UpdateTraitsRequest, dev.auth3.identity.admin.admin.UpdateTraitsResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "UpdateTraits"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateTraitsRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateTraitsResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(10)))
      .build()
  
  val METHOD_GET_CREDENTIALS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetCredentialsRequest, dev.auth3.identity.admin.admin.GetCredentialsResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetCredentials"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetCredentialsRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetCredentialsResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(11)))
      .build()
  
  val METHOD_UPDATE_CREDENTIAL: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.UpdateCredentialRequest, dev.auth3.identity.admin.admin.UpdateCredentialResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "UpdateCredential"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateCredentialRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateCredentialResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(12)))
      .build()
  
  val METHOD_GET_IDENTITY_LOGIN_ATTEMPTS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest, dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetIdentityLoginAttempts"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(13)))
      .build()
  
  val METHOD_CREATE_CONNECTION: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.CreateConnectionRequest, dev.auth3.identity.admin.admin.CreateConnectionResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "CreateConnection"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.CreateConnectionRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.CreateConnectionResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(14)))
      .build()
  
  val METHOD_GET_CONNECTIONS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetConnectionsRequest, dev.auth3.identity.admin.admin.GetConnectionsResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetConnections"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetConnectionsRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetConnectionsResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(15)))
      .build()
  
  val METHOD_UPDATE_CONNECTION: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.UpdateConnectionRequest, dev.auth3.identity.admin.admin.UpdateConnectionResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "UpdateConnection"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateConnectionRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateConnectionResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(16)))
      .build()
  
  val METHOD_DELETE_CONNECTION: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.DeleteConnectionRequest, dev.auth3.identity.admin.admin.DeleteConnectionResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "DeleteConnection"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.DeleteConnectionRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.DeleteConnectionResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(17)))
      .build()
  
  val METHOD_CREATE_ID_SCHEMA: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.CreateIdSchemaRequest, dev.auth3.identity.admin.admin.CreateIdSchemaResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "CreateIdSchema"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.CreateIdSchemaRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.CreateIdSchemaResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(18)))
      .build()
  
  val METHOD_GET_ID_SCHEMAS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetIdSchemasRequest, dev.auth3.identity.admin.admin.GetIdSchemasResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetIdSchemas"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdSchemasRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdSchemasResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(19)))
      .build()
  
  val METHOD_GET_ID_SCHEMA: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetIdSchemaRequest, dev.auth3.identity.admin.admin.GetIdSchemaResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetIdSchema"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdSchemaRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetIdSchemaResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(20)))
      .build()
  
  val METHOD_GET_DEFAULT_ID_SCHEMA: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetDefaultIdSchemaRequest, dev.auth3.identity.admin.admin.GetDefaultIdSchemaResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetDefaultIdSchema"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetDefaultIdSchemaRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetDefaultIdSchemaResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(21)))
      .build()
  
  val METHOD_UPDATE_ID_SCHEMA: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.UpdateIdSchemaRequest, dev.auth3.identity.admin.admin.UpdateIdSchemaResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "UpdateIdSchema"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateIdSchemaRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateIdSchemaResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(22)))
      .build()
  
  val METHOD_MARK_DEFAULT_ID_SCHEMA: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.MarkDefaultIdSchemaRequest, dev.auth3.identity.admin.admin.MarkDefaultIdSchemaResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "MarkDefaultIdSchema"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.MarkDefaultIdSchemaRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.MarkDefaultIdSchemaResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(23)))
      .build()
  
  val METHOD_DELETE_ID_SCHEMA: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.DeleteIdSchemaRequest, dev.auth3.identity.admin.admin.DeleteIdSchemaResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "DeleteIdSchema"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.DeleteIdSchemaRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.DeleteIdSchemaResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(24)))
      .build()
  
  val METHOD_CREATE_OAUTH2CLIENT: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.CreateOAuth2ClientRequest, dev.auth3.identity.admin.admin.CreateOAuth2ClientResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "CreateOAuth2Client"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.CreateOAuth2ClientRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.CreateOAuth2ClientResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(25)))
      .build()
  
  val METHOD_GET_OAUTH2CLIENTS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetOAuth2ClientsRequest, dev.auth3.identity.admin.admin.GetOAuth2ClientsResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetOAuth2Clients"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetOAuth2ClientsRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetOAuth2ClientsResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(26)))
      .build()
  
  val METHOD_UPDATE_OAUTH2CLIENT: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.UpdateOAuth2ClientRequest, dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "UpdateOAuth2Client"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateOAuth2ClientRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(27)))
      .build()
  
  val METHOD_DELETE_OAUTH2CLIENT: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.DeleteOAuth2ClientRequest, dev.auth3.identity.admin.admin.DeleteOAuth2ClientResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "DeleteOAuth2Client"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.DeleteOAuth2ClientRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.DeleteOAuth2ClientResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(28)))
      .build()
  
  val METHOD_GET_EMAILS_SETUP: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetEmailsSetupRequest, dev.auth3.identity.admin.admin.GetEmailsSetupResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetEmailsSetup"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetEmailsSetupRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetEmailsSetupResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(29)))
      .build()
  
  val METHOD_UPDATE_EMAILS_SETUP: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest, dev.auth3.identity.admin.admin.UpdateEmailsSetupResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "UpdateEmailsSetup"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.UpdateEmailsSetupResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(30)))
      .build()
  
  val METHOD_GET_USER_BASE_STATISTICS: _root_.io.grpc.MethodDescriptor[dev.auth3.identity.admin.admin.GetUserBaseStatisticsRequest, dev.auth3.identity.admin.admin.GetUserBaseStatisticsResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("depot.devtools.auth.v0.identity.admin.Admin", "GetUserBaseStatistics"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetUserBaseStatisticsRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[dev.auth3.identity.admin.admin.GetUserBaseStatisticsResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0).getMethods().get(31)))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("depot.devtools.auth.v0.identity.admin.Admin")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(dev.auth3.identity.admin.admin.AdminProto.javaDescriptor))
      .addMethod(METHOD_CREATE_IDENTITY)
      .addMethod(METHOD_GET_IDENTITY)
      .addMethod(METHOD_GET_IDENTITIES_BY_ATTRIBUTE)
      .addMethod(METHOD_GET_IDENTITIES)
      .addMethod(METHOD_UPDATE_IDENTITY)
      .addMethod(METHOD_DELETE_IDENTITY)
      .addMethod(METHOD_GET_ADDRESSES)
      .addMethod(METHOD_GET_ADDRESS)
      .addMethod(METHOD_UPDATE_ADDRESS)
      .addMethod(METHOD_GET_TRAITS)
      .addMethod(METHOD_UPDATE_TRAITS)
      .addMethod(METHOD_GET_CREDENTIALS)
      .addMethod(METHOD_UPDATE_CREDENTIAL)
      .addMethod(METHOD_GET_IDENTITY_LOGIN_ATTEMPTS)
      .addMethod(METHOD_CREATE_CONNECTION)
      .addMethod(METHOD_GET_CONNECTIONS)
      .addMethod(METHOD_UPDATE_CONNECTION)
      .addMethod(METHOD_DELETE_CONNECTION)
      .addMethod(METHOD_CREATE_ID_SCHEMA)
      .addMethod(METHOD_GET_ID_SCHEMAS)
      .addMethod(METHOD_GET_ID_SCHEMA)
      .addMethod(METHOD_GET_DEFAULT_ID_SCHEMA)
      .addMethod(METHOD_UPDATE_ID_SCHEMA)
      .addMethod(METHOD_MARK_DEFAULT_ID_SCHEMA)
      .addMethod(METHOD_DELETE_ID_SCHEMA)
      .addMethod(METHOD_CREATE_OAUTH2CLIENT)
      .addMethod(METHOD_GET_OAUTH2CLIENTS)
      .addMethod(METHOD_UPDATE_OAUTH2CLIENT)
      .addMethod(METHOD_DELETE_OAUTH2CLIENT)
      .addMethod(METHOD_GET_EMAILS_SETUP)
      .addMethod(METHOD_UPDATE_EMAILS_SETUP)
      .addMethod(METHOD_GET_USER_BASE_STATISTICS)
      .build()
  
  trait Admin extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = Admin
    def createIdentity(request: dev.auth3.identity.admin.admin.CreateIdentityRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.CreateIdentityResponse]
    def getIdentity(request: dev.auth3.identity.admin.admin.GetIdentityRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdentityResponse]
    def getIdentitiesByAttribute(request: dev.auth3.identity.admin.admin.GetIdentitiesByAttributeRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdentitiesByAttributeResponse]
    def getIdentities(request: dev.auth3.identity.admin.admin.GetIdentitiesRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdentitiesResponse]
    def updateIdentity(request: dev.auth3.identity.admin.admin.UpdateIdentityRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateIdentityResponse]
    def deleteIdentity(request: dev.auth3.identity.admin.admin.DeleteIdentityRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.DeleteIdentityResponse]
    def getAddresses(request: dev.auth3.identity.admin.admin.GetAddressesRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetAddressesResponse]
    def getAddress(request: dev.auth3.identity.admin.admin.GetAddressRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetAddressResponse]
    def updateAddress(request: dev.auth3.identity.admin.admin.UpdateAddressRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateAddressResponse]
    def getTraits(request: dev.auth3.identity.admin.admin.GetTraitsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetTraitsResponse]
    def updateTraits(request: dev.auth3.identity.admin.admin.UpdateTraitsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateTraitsResponse]
    def getCredentials(request: dev.auth3.identity.admin.admin.GetCredentialsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetCredentialsResponse]
    def updateCredential(request: dev.auth3.identity.admin.admin.UpdateCredentialRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateCredentialResponse]
    def getIdentityLoginAttempts(request: dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsResponse]
    def createConnection(request: dev.auth3.identity.admin.admin.CreateConnectionRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.CreateConnectionResponse]
    def getConnections(request: dev.auth3.identity.admin.admin.GetConnectionsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetConnectionsResponse]
    def updateConnection(request: dev.auth3.identity.admin.admin.UpdateConnectionRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateConnectionResponse]
    def deleteConnection(request: dev.auth3.identity.admin.admin.DeleteConnectionRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.DeleteConnectionResponse]
    def createIdSchema(request: dev.auth3.identity.admin.admin.CreateIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.CreateIdSchemaResponse]
    def getIdSchemas(request: dev.auth3.identity.admin.admin.GetIdSchemasRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdSchemasResponse]
    def getIdSchema(request: dev.auth3.identity.admin.admin.GetIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdSchemaResponse]
    def getDefaultIdSchema(request: dev.auth3.identity.admin.admin.GetDefaultIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetDefaultIdSchemaResponse]
    def updateIdSchema(request: dev.auth3.identity.admin.admin.UpdateIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateIdSchemaResponse]
    def markDefaultIdSchema(request: dev.auth3.identity.admin.admin.MarkDefaultIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.MarkDefaultIdSchemaResponse]
    def deleteIdSchema(request: dev.auth3.identity.admin.admin.DeleteIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.DeleteIdSchemaResponse]
    def createOAuth2Client(request: dev.auth3.identity.admin.admin.CreateOAuth2ClientRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.CreateOAuth2ClientResponse]
    def getOAuth2Clients(request: dev.auth3.identity.admin.admin.GetOAuth2ClientsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetOAuth2ClientsResponse]
    def updateOAuth2Client(request: dev.auth3.identity.admin.admin.UpdateOAuth2ClientRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse]
    def deleteOAuth2Client(request: dev.auth3.identity.admin.admin.DeleteOAuth2ClientRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.DeleteOAuth2ClientResponse]
    def getEmailsSetup(request: dev.auth3.identity.admin.admin.GetEmailsSetupRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetEmailsSetupResponse]
    def updateEmailsSetup(request: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateEmailsSetupResponse]
    def getUserBaseStatistics(request: dev.auth3.identity.admin.admin.GetUserBaseStatisticsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetUserBaseStatisticsResponse]
  }
  
  object Admin extends _root_.scalapb.grpc.ServiceCompanion[Admin] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[Admin] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = dev.auth3.identity.admin.admin.AdminProto.scalaDescriptor.services(0)
    def bindService(serviceImpl: Admin, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
      _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
      .addMethod(
        METHOD_CREATE_IDENTITY,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.CreateIdentityRequest, dev.auth3.identity.admin.admin.CreateIdentityResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.CreateIdentityRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.CreateIdentityResponse]): _root_.scala.Unit =
            serviceImpl.createIdentity(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_IDENTITY,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetIdentityRequest, dev.auth3.identity.admin.admin.GetIdentityResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetIdentityRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetIdentityResponse]): _root_.scala.Unit =
            serviceImpl.getIdentity(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_IDENTITIES_BY_ATTRIBUTE,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetIdentitiesByAttributeRequest, dev.auth3.identity.admin.admin.GetIdentitiesByAttributeResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetIdentitiesByAttributeRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetIdentitiesByAttributeResponse]): _root_.scala.Unit =
            serviceImpl.getIdentitiesByAttribute(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_IDENTITIES,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetIdentitiesRequest, dev.auth3.identity.admin.admin.GetIdentitiesResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetIdentitiesRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetIdentitiesResponse]): _root_.scala.Unit =
            serviceImpl.getIdentities(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_UPDATE_IDENTITY,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.UpdateIdentityRequest, dev.auth3.identity.admin.admin.UpdateIdentityResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.UpdateIdentityRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.UpdateIdentityResponse]): _root_.scala.Unit =
            serviceImpl.updateIdentity(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_DELETE_IDENTITY,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.DeleteIdentityRequest, dev.auth3.identity.admin.admin.DeleteIdentityResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.DeleteIdentityRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.DeleteIdentityResponse]): _root_.scala.Unit =
            serviceImpl.deleteIdentity(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_ADDRESSES,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetAddressesRequest, dev.auth3.identity.admin.admin.GetAddressesResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetAddressesRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetAddressesResponse]): _root_.scala.Unit =
            serviceImpl.getAddresses(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_ADDRESS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetAddressRequest, dev.auth3.identity.admin.admin.GetAddressResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetAddressRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetAddressResponse]): _root_.scala.Unit =
            serviceImpl.getAddress(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_UPDATE_ADDRESS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.UpdateAddressRequest, dev.auth3.identity.admin.admin.UpdateAddressResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.UpdateAddressRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.UpdateAddressResponse]): _root_.scala.Unit =
            serviceImpl.updateAddress(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_TRAITS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetTraitsRequest, dev.auth3.identity.admin.admin.GetTraitsResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetTraitsRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetTraitsResponse]): _root_.scala.Unit =
            serviceImpl.getTraits(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_UPDATE_TRAITS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.UpdateTraitsRequest, dev.auth3.identity.admin.admin.UpdateTraitsResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.UpdateTraitsRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.UpdateTraitsResponse]): _root_.scala.Unit =
            serviceImpl.updateTraits(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_CREDENTIALS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetCredentialsRequest, dev.auth3.identity.admin.admin.GetCredentialsResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetCredentialsRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetCredentialsResponse]): _root_.scala.Unit =
            serviceImpl.getCredentials(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_UPDATE_CREDENTIAL,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.UpdateCredentialRequest, dev.auth3.identity.admin.admin.UpdateCredentialResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.UpdateCredentialRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.UpdateCredentialResponse]): _root_.scala.Unit =
            serviceImpl.updateCredential(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_IDENTITY_LOGIN_ATTEMPTS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest, dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsResponse]): _root_.scala.Unit =
            serviceImpl.getIdentityLoginAttempts(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_CREATE_CONNECTION,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.CreateConnectionRequest, dev.auth3.identity.admin.admin.CreateConnectionResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.CreateConnectionRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.CreateConnectionResponse]): _root_.scala.Unit =
            serviceImpl.createConnection(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_CONNECTIONS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetConnectionsRequest, dev.auth3.identity.admin.admin.GetConnectionsResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetConnectionsRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetConnectionsResponse]): _root_.scala.Unit =
            serviceImpl.getConnections(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_UPDATE_CONNECTION,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.UpdateConnectionRequest, dev.auth3.identity.admin.admin.UpdateConnectionResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.UpdateConnectionRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.UpdateConnectionResponse]): _root_.scala.Unit =
            serviceImpl.updateConnection(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_DELETE_CONNECTION,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.DeleteConnectionRequest, dev.auth3.identity.admin.admin.DeleteConnectionResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.DeleteConnectionRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.DeleteConnectionResponse]): _root_.scala.Unit =
            serviceImpl.deleteConnection(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_CREATE_ID_SCHEMA,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.CreateIdSchemaRequest, dev.auth3.identity.admin.admin.CreateIdSchemaResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.CreateIdSchemaRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.CreateIdSchemaResponse]): _root_.scala.Unit =
            serviceImpl.createIdSchema(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_ID_SCHEMAS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetIdSchemasRequest, dev.auth3.identity.admin.admin.GetIdSchemasResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetIdSchemasRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetIdSchemasResponse]): _root_.scala.Unit =
            serviceImpl.getIdSchemas(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_ID_SCHEMA,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetIdSchemaRequest, dev.auth3.identity.admin.admin.GetIdSchemaResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetIdSchemaRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetIdSchemaResponse]): _root_.scala.Unit =
            serviceImpl.getIdSchema(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_DEFAULT_ID_SCHEMA,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetDefaultIdSchemaRequest, dev.auth3.identity.admin.admin.GetDefaultIdSchemaResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetDefaultIdSchemaRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetDefaultIdSchemaResponse]): _root_.scala.Unit =
            serviceImpl.getDefaultIdSchema(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_UPDATE_ID_SCHEMA,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.UpdateIdSchemaRequest, dev.auth3.identity.admin.admin.UpdateIdSchemaResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.UpdateIdSchemaRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.UpdateIdSchemaResponse]): _root_.scala.Unit =
            serviceImpl.updateIdSchema(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_MARK_DEFAULT_ID_SCHEMA,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.MarkDefaultIdSchemaRequest, dev.auth3.identity.admin.admin.MarkDefaultIdSchemaResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.MarkDefaultIdSchemaRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.MarkDefaultIdSchemaResponse]): _root_.scala.Unit =
            serviceImpl.markDefaultIdSchema(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_DELETE_ID_SCHEMA,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.DeleteIdSchemaRequest, dev.auth3.identity.admin.admin.DeleteIdSchemaResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.DeleteIdSchemaRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.DeleteIdSchemaResponse]): _root_.scala.Unit =
            serviceImpl.deleteIdSchema(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_CREATE_OAUTH2CLIENT,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.CreateOAuth2ClientRequest, dev.auth3.identity.admin.admin.CreateOAuth2ClientResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.CreateOAuth2ClientRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.CreateOAuth2ClientResponse]): _root_.scala.Unit =
            serviceImpl.createOAuth2Client(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_OAUTH2CLIENTS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetOAuth2ClientsRequest, dev.auth3.identity.admin.admin.GetOAuth2ClientsResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetOAuth2ClientsRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetOAuth2ClientsResponse]): _root_.scala.Unit =
            serviceImpl.getOAuth2Clients(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_UPDATE_OAUTH2CLIENT,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.UpdateOAuth2ClientRequest, dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.UpdateOAuth2ClientRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse]): _root_.scala.Unit =
            serviceImpl.updateOAuth2Client(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_DELETE_OAUTH2CLIENT,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.DeleteOAuth2ClientRequest, dev.auth3.identity.admin.admin.DeleteOAuth2ClientResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.DeleteOAuth2ClientRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.DeleteOAuth2ClientResponse]): _root_.scala.Unit =
            serviceImpl.deleteOAuth2Client(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_EMAILS_SETUP,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetEmailsSetupRequest, dev.auth3.identity.admin.admin.GetEmailsSetupResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetEmailsSetupRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetEmailsSetupResponse]): _root_.scala.Unit =
            serviceImpl.getEmailsSetup(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_UPDATE_EMAILS_SETUP,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest, dev.auth3.identity.admin.admin.UpdateEmailsSetupResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.UpdateEmailsSetupResponse]): _root_.scala.Unit =
            serviceImpl.updateEmailsSetup(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_GET_USER_BASE_STATISTICS,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[dev.auth3.identity.admin.admin.GetUserBaseStatisticsRequest, dev.auth3.identity.admin.admin.GetUserBaseStatisticsResponse] {
          override def invoke(request: dev.auth3.identity.admin.admin.GetUserBaseStatisticsRequest, observer: _root_.io.grpc.stub.StreamObserver[dev.auth3.identity.admin.admin.GetUserBaseStatisticsResponse]): _root_.scala.Unit =
            serviceImpl.getUserBaseStatistics(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .build()
  }
  
  trait AdminBlockingClient {
    def serviceCompanion = Admin
    def createIdentity(request: dev.auth3.identity.admin.admin.CreateIdentityRequest): dev.auth3.identity.admin.admin.CreateIdentityResponse
    def getIdentity(request: dev.auth3.identity.admin.admin.GetIdentityRequest): dev.auth3.identity.admin.admin.GetIdentityResponse
    def getIdentitiesByAttribute(request: dev.auth3.identity.admin.admin.GetIdentitiesByAttributeRequest): dev.auth3.identity.admin.admin.GetIdentitiesByAttributeResponse
    def getIdentities(request: dev.auth3.identity.admin.admin.GetIdentitiesRequest): dev.auth3.identity.admin.admin.GetIdentitiesResponse
    def updateIdentity(request: dev.auth3.identity.admin.admin.UpdateIdentityRequest): dev.auth3.identity.admin.admin.UpdateIdentityResponse
    def deleteIdentity(request: dev.auth3.identity.admin.admin.DeleteIdentityRequest): dev.auth3.identity.admin.admin.DeleteIdentityResponse
    def getAddresses(request: dev.auth3.identity.admin.admin.GetAddressesRequest): dev.auth3.identity.admin.admin.GetAddressesResponse
    def getAddress(request: dev.auth3.identity.admin.admin.GetAddressRequest): dev.auth3.identity.admin.admin.GetAddressResponse
    def updateAddress(request: dev.auth3.identity.admin.admin.UpdateAddressRequest): dev.auth3.identity.admin.admin.UpdateAddressResponse
    def getTraits(request: dev.auth3.identity.admin.admin.GetTraitsRequest): dev.auth3.identity.admin.admin.GetTraitsResponse
    def updateTraits(request: dev.auth3.identity.admin.admin.UpdateTraitsRequest): dev.auth3.identity.admin.admin.UpdateTraitsResponse
    def getCredentials(request: dev.auth3.identity.admin.admin.GetCredentialsRequest): dev.auth3.identity.admin.admin.GetCredentialsResponse
    def updateCredential(request: dev.auth3.identity.admin.admin.UpdateCredentialRequest): dev.auth3.identity.admin.admin.UpdateCredentialResponse
    def getIdentityLoginAttempts(request: dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest): dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsResponse
    def createConnection(request: dev.auth3.identity.admin.admin.CreateConnectionRequest): dev.auth3.identity.admin.admin.CreateConnectionResponse
    def getConnections(request: dev.auth3.identity.admin.admin.GetConnectionsRequest): dev.auth3.identity.admin.admin.GetConnectionsResponse
    def updateConnection(request: dev.auth3.identity.admin.admin.UpdateConnectionRequest): dev.auth3.identity.admin.admin.UpdateConnectionResponse
    def deleteConnection(request: dev.auth3.identity.admin.admin.DeleteConnectionRequest): dev.auth3.identity.admin.admin.DeleteConnectionResponse
    def createIdSchema(request: dev.auth3.identity.admin.admin.CreateIdSchemaRequest): dev.auth3.identity.admin.admin.CreateIdSchemaResponse
    def getIdSchemas(request: dev.auth3.identity.admin.admin.GetIdSchemasRequest): dev.auth3.identity.admin.admin.GetIdSchemasResponse
    def getIdSchema(request: dev.auth3.identity.admin.admin.GetIdSchemaRequest): dev.auth3.identity.admin.admin.GetIdSchemaResponse
    def getDefaultIdSchema(request: dev.auth3.identity.admin.admin.GetDefaultIdSchemaRequest): dev.auth3.identity.admin.admin.GetDefaultIdSchemaResponse
    def updateIdSchema(request: dev.auth3.identity.admin.admin.UpdateIdSchemaRequest): dev.auth3.identity.admin.admin.UpdateIdSchemaResponse
    def markDefaultIdSchema(request: dev.auth3.identity.admin.admin.MarkDefaultIdSchemaRequest): dev.auth3.identity.admin.admin.MarkDefaultIdSchemaResponse
    def deleteIdSchema(request: dev.auth3.identity.admin.admin.DeleteIdSchemaRequest): dev.auth3.identity.admin.admin.DeleteIdSchemaResponse
    def createOAuth2Client(request: dev.auth3.identity.admin.admin.CreateOAuth2ClientRequest): dev.auth3.identity.admin.admin.CreateOAuth2ClientResponse
    def getOAuth2Clients(request: dev.auth3.identity.admin.admin.GetOAuth2ClientsRequest): dev.auth3.identity.admin.admin.GetOAuth2ClientsResponse
    def updateOAuth2Client(request: dev.auth3.identity.admin.admin.UpdateOAuth2ClientRequest): dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse
    def deleteOAuth2Client(request: dev.auth3.identity.admin.admin.DeleteOAuth2ClientRequest): dev.auth3.identity.admin.admin.DeleteOAuth2ClientResponse
    def getEmailsSetup(request: dev.auth3.identity.admin.admin.GetEmailsSetupRequest): dev.auth3.identity.admin.admin.GetEmailsSetupResponse
    def updateEmailsSetup(request: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest): dev.auth3.identity.admin.admin.UpdateEmailsSetupResponse
    def getUserBaseStatistics(request: dev.auth3.identity.admin.admin.GetUserBaseStatisticsRequest): dev.auth3.identity.admin.admin.GetUserBaseStatisticsResponse
  }
  
  class AdminBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[AdminBlockingStub](channel, options) with AdminBlockingClient {
    override def createIdentity(request: dev.auth3.identity.admin.admin.CreateIdentityRequest): dev.auth3.identity.admin.admin.CreateIdentityResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_CREATE_IDENTITY, options, request)
    }
    
    override def getIdentity(request: dev.auth3.identity.admin.admin.GetIdentityRequest): dev.auth3.identity.admin.admin.GetIdentityResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_IDENTITY, options, request)
    }
    
    override def getIdentitiesByAttribute(request: dev.auth3.identity.admin.admin.GetIdentitiesByAttributeRequest): dev.auth3.identity.admin.admin.GetIdentitiesByAttributeResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_IDENTITIES_BY_ATTRIBUTE, options, request)
    }
    
    override def getIdentities(request: dev.auth3.identity.admin.admin.GetIdentitiesRequest): dev.auth3.identity.admin.admin.GetIdentitiesResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_IDENTITIES, options, request)
    }
    
    override def updateIdentity(request: dev.auth3.identity.admin.admin.UpdateIdentityRequest): dev.auth3.identity.admin.admin.UpdateIdentityResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_UPDATE_IDENTITY, options, request)
    }
    
    override def deleteIdentity(request: dev.auth3.identity.admin.admin.DeleteIdentityRequest): dev.auth3.identity.admin.admin.DeleteIdentityResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_DELETE_IDENTITY, options, request)
    }
    
    override def getAddresses(request: dev.auth3.identity.admin.admin.GetAddressesRequest): dev.auth3.identity.admin.admin.GetAddressesResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ADDRESSES, options, request)
    }
    
    override def getAddress(request: dev.auth3.identity.admin.admin.GetAddressRequest): dev.auth3.identity.admin.admin.GetAddressResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ADDRESS, options, request)
    }
    
    override def updateAddress(request: dev.auth3.identity.admin.admin.UpdateAddressRequest): dev.auth3.identity.admin.admin.UpdateAddressResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_UPDATE_ADDRESS, options, request)
    }
    
    override def getTraits(request: dev.auth3.identity.admin.admin.GetTraitsRequest): dev.auth3.identity.admin.admin.GetTraitsResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_TRAITS, options, request)
    }
    
    override def updateTraits(request: dev.auth3.identity.admin.admin.UpdateTraitsRequest): dev.auth3.identity.admin.admin.UpdateTraitsResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_UPDATE_TRAITS, options, request)
    }
    
    override def getCredentials(request: dev.auth3.identity.admin.admin.GetCredentialsRequest): dev.auth3.identity.admin.admin.GetCredentialsResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_CREDENTIALS, options, request)
    }
    
    override def updateCredential(request: dev.auth3.identity.admin.admin.UpdateCredentialRequest): dev.auth3.identity.admin.admin.UpdateCredentialResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_UPDATE_CREDENTIAL, options, request)
    }
    
    override def getIdentityLoginAttempts(request: dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest): dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_IDENTITY_LOGIN_ATTEMPTS, options, request)
    }
    
    override def createConnection(request: dev.auth3.identity.admin.admin.CreateConnectionRequest): dev.auth3.identity.admin.admin.CreateConnectionResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_CREATE_CONNECTION, options, request)
    }
    
    override def getConnections(request: dev.auth3.identity.admin.admin.GetConnectionsRequest): dev.auth3.identity.admin.admin.GetConnectionsResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_CONNECTIONS, options, request)
    }
    
    override def updateConnection(request: dev.auth3.identity.admin.admin.UpdateConnectionRequest): dev.auth3.identity.admin.admin.UpdateConnectionResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_UPDATE_CONNECTION, options, request)
    }
    
    override def deleteConnection(request: dev.auth3.identity.admin.admin.DeleteConnectionRequest): dev.auth3.identity.admin.admin.DeleteConnectionResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_DELETE_CONNECTION, options, request)
    }
    
    override def createIdSchema(request: dev.auth3.identity.admin.admin.CreateIdSchemaRequest): dev.auth3.identity.admin.admin.CreateIdSchemaResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_CREATE_ID_SCHEMA, options, request)
    }
    
    override def getIdSchemas(request: dev.auth3.identity.admin.admin.GetIdSchemasRequest): dev.auth3.identity.admin.admin.GetIdSchemasResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ID_SCHEMAS, options, request)
    }
    
    override def getIdSchema(request: dev.auth3.identity.admin.admin.GetIdSchemaRequest): dev.auth3.identity.admin.admin.GetIdSchemaResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ID_SCHEMA, options, request)
    }
    
    override def getDefaultIdSchema(request: dev.auth3.identity.admin.admin.GetDefaultIdSchemaRequest): dev.auth3.identity.admin.admin.GetDefaultIdSchemaResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_DEFAULT_ID_SCHEMA, options, request)
    }
    
    override def updateIdSchema(request: dev.auth3.identity.admin.admin.UpdateIdSchemaRequest): dev.auth3.identity.admin.admin.UpdateIdSchemaResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_UPDATE_ID_SCHEMA, options, request)
    }
    
    override def markDefaultIdSchema(request: dev.auth3.identity.admin.admin.MarkDefaultIdSchemaRequest): dev.auth3.identity.admin.admin.MarkDefaultIdSchemaResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_MARK_DEFAULT_ID_SCHEMA, options, request)
    }
    
    override def deleteIdSchema(request: dev.auth3.identity.admin.admin.DeleteIdSchemaRequest): dev.auth3.identity.admin.admin.DeleteIdSchemaResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_DELETE_ID_SCHEMA, options, request)
    }
    
    override def createOAuth2Client(request: dev.auth3.identity.admin.admin.CreateOAuth2ClientRequest): dev.auth3.identity.admin.admin.CreateOAuth2ClientResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_CREATE_OAUTH2CLIENT, options, request)
    }
    
    override def getOAuth2Clients(request: dev.auth3.identity.admin.admin.GetOAuth2ClientsRequest): dev.auth3.identity.admin.admin.GetOAuth2ClientsResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_OAUTH2CLIENTS, options, request)
    }
    
    override def updateOAuth2Client(request: dev.auth3.identity.admin.admin.UpdateOAuth2ClientRequest): dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_UPDATE_OAUTH2CLIENT, options, request)
    }
    
    override def deleteOAuth2Client(request: dev.auth3.identity.admin.admin.DeleteOAuth2ClientRequest): dev.auth3.identity.admin.admin.DeleteOAuth2ClientResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_DELETE_OAUTH2CLIENT, options, request)
    }
    
    override def getEmailsSetup(request: dev.auth3.identity.admin.admin.GetEmailsSetupRequest): dev.auth3.identity.admin.admin.GetEmailsSetupResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_EMAILS_SETUP, options, request)
    }
    
    override def updateEmailsSetup(request: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest): dev.auth3.identity.admin.admin.UpdateEmailsSetupResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_UPDATE_EMAILS_SETUP, options, request)
    }
    
    override def getUserBaseStatistics(request: dev.auth3.identity.admin.admin.GetUserBaseStatisticsRequest): dev.auth3.identity.admin.admin.GetUserBaseStatisticsResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_USER_BASE_STATISTICS, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): AdminBlockingStub = new AdminBlockingStub(channel, options)
  }
  
  class AdminStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[AdminStub](channel, options) with Admin {
    override def createIdentity(request: dev.auth3.identity.admin.admin.CreateIdentityRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.CreateIdentityResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_CREATE_IDENTITY, options, request)
    }
    
    override def getIdentity(request: dev.auth3.identity.admin.admin.GetIdentityRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdentityResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_IDENTITY, options, request)
    }
    
    override def getIdentitiesByAttribute(request: dev.auth3.identity.admin.admin.GetIdentitiesByAttributeRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdentitiesByAttributeResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_IDENTITIES_BY_ATTRIBUTE, options, request)
    }
    
    override def getIdentities(request: dev.auth3.identity.admin.admin.GetIdentitiesRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdentitiesResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_IDENTITIES, options, request)
    }
    
    override def updateIdentity(request: dev.auth3.identity.admin.admin.UpdateIdentityRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateIdentityResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_UPDATE_IDENTITY, options, request)
    }
    
    override def deleteIdentity(request: dev.auth3.identity.admin.admin.DeleteIdentityRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.DeleteIdentityResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_DELETE_IDENTITY, options, request)
    }
    
    override def getAddresses(request: dev.auth3.identity.admin.admin.GetAddressesRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetAddressesResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ADDRESSES, options, request)
    }
    
    override def getAddress(request: dev.auth3.identity.admin.admin.GetAddressRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetAddressResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ADDRESS, options, request)
    }
    
    override def updateAddress(request: dev.auth3.identity.admin.admin.UpdateAddressRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateAddressResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_UPDATE_ADDRESS, options, request)
    }
    
    override def getTraits(request: dev.auth3.identity.admin.admin.GetTraitsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetTraitsResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_TRAITS, options, request)
    }
    
    override def updateTraits(request: dev.auth3.identity.admin.admin.UpdateTraitsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateTraitsResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_UPDATE_TRAITS, options, request)
    }
    
    override def getCredentials(request: dev.auth3.identity.admin.admin.GetCredentialsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetCredentialsResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_CREDENTIALS, options, request)
    }
    
    override def updateCredential(request: dev.auth3.identity.admin.admin.UpdateCredentialRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateCredentialResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_UPDATE_CREDENTIAL, options, request)
    }
    
    override def getIdentityLoginAttempts(request: dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdentityLoginAttemptsResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_IDENTITY_LOGIN_ATTEMPTS, options, request)
    }
    
    override def createConnection(request: dev.auth3.identity.admin.admin.CreateConnectionRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.CreateConnectionResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_CREATE_CONNECTION, options, request)
    }
    
    override def getConnections(request: dev.auth3.identity.admin.admin.GetConnectionsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetConnectionsResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_CONNECTIONS, options, request)
    }
    
    override def updateConnection(request: dev.auth3.identity.admin.admin.UpdateConnectionRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateConnectionResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_UPDATE_CONNECTION, options, request)
    }
    
    override def deleteConnection(request: dev.auth3.identity.admin.admin.DeleteConnectionRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.DeleteConnectionResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_DELETE_CONNECTION, options, request)
    }
    
    override def createIdSchema(request: dev.auth3.identity.admin.admin.CreateIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.CreateIdSchemaResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_CREATE_ID_SCHEMA, options, request)
    }
    
    override def getIdSchemas(request: dev.auth3.identity.admin.admin.GetIdSchemasRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdSchemasResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ID_SCHEMAS, options, request)
    }
    
    override def getIdSchema(request: dev.auth3.identity.admin.admin.GetIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetIdSchemaResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ID_SCHEMA, options, request)
    }
    
    override def getDefaultIdSchema(request: dev.auth3.identity.admin.admin.GetDefaultIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetDefaultIdSchemaResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_DEFAULT_ID_SCHEMA, options, request)
    }
    
    override def updateIdSchema(request: dev.auth3.identity.admin.admin.UpdateIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateIdSchemaResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_UPDATE_ID_SCHEMA, options, request)
    }
    
    override def markDefaultIdSchema(request: dev.auth3.identity.admin.admin.MarkDefaultIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.MarkDefaultIdSchemaResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_MARK_DEFAULT_ID_SCHEMA, options, request)
    }
    
    override def deleteIdSchema(request: dev.auth3.identity.admin.admin.DeleteIdSchemaRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.DeleteIdSchemaResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_DELETE_ID_SCHEMA, options, request)
    }
    
    override def createOAuth2Client(request: dev.auth3.identity.admin.admin.CreateOAuth2ClientRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.CreateOAuth2ClientResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_CREATE_OAUTH2CLIENT, options, request)
    }
    
    override def getOAuth2Clients(request: dev.auth3.identity.admin.admin.GetOAuth2ClientsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetOAuth2ClientsResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_OAUTH2CLIENTS, options, request)
    }
    
    override def updateOAuth2Client(request: dev.auth3.identity.admin.admin.UpdateOAuth2ClientRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateOAuth2ClientResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_UPDATE_OAUTH2CLIENT, options, request)
    }
    
    override def deleteOAuth2Client(request: dev.auth3.identity.admin.admin.DeleteOAuth2ClientRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.DeleteOAuth2ClientResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_DELETE_OAUTH2CLIENT, options, request)
    }
    
    override def getEmailsSetup(request: dev.auth3.identity.admin.admin.GetEmailsSetupRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetEmailsSetupResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_EMAILS_SETUP, options, request)
    }
    
    override def updateEmailsSetup(request: dev.auth3.identity.admin.admin.UpdateEmailsSetupRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.UpdateEmailsSetupResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_UPDATE_EMAILS_SETUP, options, request)
    }
    
    override def getUserBaseStatistics(request: dev.auth3.identity.admin.admin.GetUserBaseStatisticsRequest): scala.concurrent.Future[dev.auth3.identity.admin.admin.GetUserBaseStatisticsResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_USER_BASE_STATISTICS, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): AdminStub = new AdminStub(channel, options)
  }
  
  def bindService(serviceImpl: Admin, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition = Admin.bindService(serviceImpl, executionContext)
  
  def blockingStub(channel: _root_.io.grpc.Channel): AdminBlockingStub = new AdminBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): AdminStub = new AdminStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = dev.auth3.identity.admin.admin.AdminProto.javaDescriptor.getServices().get(0)
  
}