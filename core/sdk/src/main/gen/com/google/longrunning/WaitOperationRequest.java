// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/longrunning/operations.proto
// Protobuf Java Version: 4.28.3

package com.google.longrunning;

/**
 * <pre>
 * The request message for
 * [Operations.WaitOperation][google.longrunning.Operations.WaitOperation].
 * </pre>
 *
 * Protobuf type {@code google.longrunning.WaitOperationRequest}
 */
public  final class WaitOperationRequest extends
    com.google.protobuf.GeneratedMessageLite<
        WaitOperationRequest, WaitOperationRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.longrunning.WaitOperationRequest)
    WaitOperationRequestOrBuilder {
  private WaitOperationRequest() {
    name_ = "";
  }
  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * The name of the operation resource to wait on.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The name of the operation resource to wait on.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The name of the operation resource to wait on.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * The name of the operation resource to wait on.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   */
  private void clearName() {

    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The name of the operation resource to wait on.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();

  }

  public static final int TIMEOUT_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration timeout_;
  /**
   * <pre>
   * The maximum duration to wait before timing out. If left blank, the wait
   * will be at most the time permitted by the underlying HTTP/RPC protocol.
   * If RPC context deadline is also specified, the shorter one will be used.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
   */
  @java.lang.Override
  public boolean hasTimeout() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The maximum duration to wait before timing out. If left blank, the wait
   * will be at most the time permitted by the underlying HTTP/RPC protocol.
   * If RPC context deadline is also specified, the shorter one will be used.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTimeout() {
    return timeout_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeout_;
  }
  /**
   * <pre>
   * The maximum duration to wait before timing out. If left blank, the wait
   * will be at most the time permitted by the underlying HTTP/RPC protocol.
   * If RPC context deadline is also specified, the shorter one will be used.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
   */
  private void setTimeout(com.google.protobuf.Duration value) {
    value.getClass();
  timeout_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The maximum duration to wait before timing out. If left blank, the wait
   * will be at most the time permitted by the underlying HTTP/RPC protocol.
   * If RPC context deadline is also specified, the shorter one will be used.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimeout(com.google.protobuf.Duration value) {
    value.getClass();
  if (timeout_ != null &&
        timeout_ != com.google.protobuf.Duration.getDefaultInstance()) {
      timeout_ =
        com.google.protobuf.Duration.newBuilder(timeout_).mergeFrom(value).buildPartial();
    } else {
      timeout_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The maximum duration to wait before timing out. If left blank, the wait
   * will be at most the time permitted by the underlying HTTP/RPC protocol.
   * If RPC context deadline is also specified, the shorter one will be used.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
   */
  private void clearTimeout() {  timeout_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static com.google.longrunning.WaitOperationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.WaitOperationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.WaitOperationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.WaitOperationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.WaitOperationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.WaitOperationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.WaitOperationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.WaitOperationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.longrunning.WaitOperationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.longrunning.WaitOperationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.longrunning.WaitOperationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.WaitOperationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.longrunning.WaitOperationRequest prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The request message for
   * [Operations.WaitOperation][google.longrunning.Operations.WaitOperation].
   * </pre>
   *
   * Protobuf type {@code google.longrunning.WaitOperationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.longrunning.WaitOperationRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.longrunning.WaitOperationRequest)
      com.google.longrunning.WaitOperationRequestOrBuilder {
    // Construct using com.google.longrunning.WaitOperationRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The name of the operation resource to wait on.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The name of the operation resource to wait on.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The name of the operation resource to wait on.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the operation resource to wait on.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The name of the operation resource to wait on.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * The maximum duration to wait before timing out. If left blank, the wait
     * will be at most the time permitted by the underlying HTTP/RPC protocol.
     * If RPC context deadline is also specified, the shorter one will be used.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
     */
    @java.lang.Override
    public boolean hasTimeout() {
      return instance.hasTimeout();
    }
    /**
     * <pre>
     * The maximum duration to wait before timing out. If left blank, the wait
     * will be at most the time permitted by the underlying HTTP/RPC protocol.
     * If RPC context deadline is also specified, the shorter one will be used.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.Duration getTimeout() {
      return instance.getTimeout();
    }
    /**
     * <pre>
     * The maximum duration to wait before timing out. If left blank, the wait
     * will be at most the time permitted by the underlying HTTP/RPC protocol.
     * If RPC context deadline is also specified, the shorter one will be used.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
     */
    public Builder setTimeout(com.google.protobuf.Duration value) {
      copyOnWrite();
      instance.setTimeout(value);
      return this;
      }
    /**
     * <pre>
     * The maximum duration to wait before timing out. If left blank, the wait
     * will be at most the time permitted by the underlying HTTP/RPC protocol.
     * If RPC context deadline is also specified, the shorter one will be used.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
     */
    public Builder setTimeout(
        com.google.protobuf.Duration.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeout(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The maximum duration to wait before timing out. If left blank, the wait
     * will be at most the time permitted by the underlying HTTP/RPC protocol.
     * If RPC context deadline is also specified, the shorter one will be used.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
     */
    public Builder mergeTimeout(com.google.protobuf.Duration value) {
      copyOnWrite();
      instance.mergeTimeout(value);
      return this;
    }
    /**
     * <pre>
     * The maximum duration to wait before timing out. If left blank, the wait
     * will be at most the time permitted by the underlying HTTP/RPC protocol.
     * If RPC context deadline is also specified, the shorter one will be used.
     * </pre>
     *
     * <code>.google.protobuf.Duration timeout = 2 [json_name = "timeout"];</code>
     */
    public Builder clearTimeout() {  copyOnWrite();
      instance.clearTimeout();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.longrunning.WaitOperationRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.longrunning.WaitOperationRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "name_",
            "timeout_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009" +
              "\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.longrunning.WaitOperationRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.longrunning.WaitOperationRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.longrunning.WaitOperationRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.longrunning.WaitOperationRequest)
  private static final com.google.longrunning.WaitOperationRequest DEFAULT_INSTANCE;
  static {
    WaitOperationRequest defaultInstance = new WaitOperationRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      WaitOperationRequest.class, defaultInstance);
  }

  public static com.google.longrunning.WaitOperationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<WaitOperationRequest> PARSER;

  public static com.google.protobuf.Parser<WaitOperationRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

