// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/client.proto
// Protobuf Java Version: 4.28.3

package com.google.api;

public final class ClientProto {
  private ClientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ClientProto.apiVersion);
  }
  public static final int METHOD_SIGNATURE_FIELD_NUMBER = 1051;
  /**
   * <pre>
   * A definition of a client library method signature.
   *
   * In client libraries, each proto RPC corresponds to one or more methods
   * which the end user is able to call, and calls the underlying RPC.
   * Normally, this method receives a single argument (a struct or instance
   * corresponding to the RPC request object). Defining this field will
   * add one or more overloads providing flattened or simpler method signatures
   * in some languages.
   *
   * The fields on the method signature are provided as a comma-separated
   * string.
   *
   * For example, the proto RPC and annotation:
   *
   * rpc CreateSubscription(CreateSubscriptionRequest)
   * returns (Subscription) {
   * option (google.api.method_signature) = "name,topic";
   * }
   *
   * Would add the following Java overload (in addition to the method accepting
   * the request object):
   *
   * public final Subscription createSubscription(String name, String topic)
   *
   * The following backwards-compatibility guidelines apply:
   *
   * * Adding this annotation to an unannotated method is backwards
   * compatible.
   * * Adding this annotation to a method which already has existing
   * method signature annotations is backwards compatible if and only if
   * the new method signature annotation is last in the sequence.
   * * Modifying or removing an existing method signature annotation is
   * a breaking change.
   * * Re-ordering existing method signature annotations is a breaking
   * change.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      java.util.List<java.lang.String>> methodSignature = com.google.protobuf.GeneratedMessageLite
          .newRepeatedGeneratedExtension(
        com.google.protobuf.DescriptorProtos.MethodOptions.getDefaultInstance(),
        null,
        null,
        1051,
        com.google.protobuf.WireFormat.FieldType.STRING,
        false,
        java.lang.String.class);
  public static final int DEFAULT_HOST_FIELD_NUMBER = 1049;
  /**
   * <pre>
   * The hostname for this service.
   * This should be specified with no prefix or protocol.
   *
   * Example:
   *
   * service Foo {
   * option (google.api.default_host) = "foo.googleapi.com";
   * ...
   * }
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.String> defaultHost = com.google.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        com.google.protobuf.DescriptorProtos.ServiceOptions.getDefaultInstance(),
        "",
        null,
        null,
        1049,
        com.google.protobuf.WireFormat.FieldType.STRING,
        java.lang.String.class);
  public static final int OAUTH_SCOPES_FIELD_NUMBER = 1050;
  /**
   * <pre>
   * OAuth scopes needed for the client.
   *
   * Example:
   *
   * service Foo {
   * option (google.api.oauth_scopes) = &#92;
   * "https://www.googleapis.com/auth/cloud-platform";
   * ...
   * }
   *
   * If there is more than one scope, use a comma-separated string:
   *
   * Example:
   *
   * service Foo {
   * option (google.api.oauth_scopes) = &#92;
   * "https://www.googleapis.com/auth/cloud-platform,"
   * "https://www.googleapis.com/auth/monitoring";
   * ...
   * }
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.String> oauthScopes = com.google.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        com.google.protobuf.DescriptorProtos.ServiceOptions.getDefaultInstance(),
        "",
        null,
        null,
        1050,
        com.google.protobuf.WireFormat.FieldType.STRING,
        java.lang.String.class);
  public static final int API_VERSION_FIELD_NUMBER = 525000001;
  /**
   * <pre>
   * The API version of this service, which should be sent by version-aware
   * clients to the service. This allows services to abide by the schema and
   * behavior of the service at the time this API version was deployed.
   * The format of the API version must be treated as opaque by clients.
   * Services may use a format with an apparent structure, but clients must
   * not rely on this to determine components within an API version, or attempt
   * to construct other valid API versions. Note that this is for upcoming
   * functionality and may not be implemented for all services.
   *
   * Example:
   *
   * service Foo {
   * option (google.api.api_version) = "v1_20230821_preview";
   * }
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.String> apiVersion = com.google.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        com.google.protobuf.DescriptorProtos.ServiceOptions.getDefaultInstance(),
        "",
        null,
        null,
        525000001,
        com.google.protobuf.WireFormat.FieldType.STRING,
        java.lang.String.class);

  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
