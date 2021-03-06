// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.qqing.grpc;

/**
 * Protobuf type {@code com.qqing.grpc.HealthCheckResponse}
 */
public  final class HealthCheckResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.qqing.grpc.HealthCheckResponse)
    HealthCheckResponseOrBuilder {
  // Use HealthCheckResponse.newBuilder() to construct.
  private HealthCheckResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HealthCheckResponse() {
    healthy_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private HealthCheckResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            healthy_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.qqing.grpc.HelloWorldProto.internal_static_com_qqing_grpc_HealthCheckResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.qqing.grpc.HelloWorldProto.internal_static_com_qqing_grpc_HealthCheckResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.qqing.grpc.HealthCheckResponse.class, com.qqing.grpc.HealthCheckResponse.Builder.class);
  }

  public static final int HEALTHY_FIELD_NUMBER = 1;
  private boolean healthy_;
  /**
   * <code>bool healthy = 1;</code>
   */
  public boolean getHealthy() {
    return healthy_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (healthy_ != false) {
      output.writeBool(1, healthy_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (healthy_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, healthy_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.qqing.grpc.HealthCheckResponse)) {
      return super.equals(obj);
    }
    com.qqing.grpc.HealthCheckResponse other = (com.qqing.grpc.HealthCheckResponse) obj;

    boolean result = true;
    result = result && (getHealthy()
        == other.getHealthy());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HEALTHY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHealthy());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.qqing.grpc.HealthCheckResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.qqing.grpc.HealthCheckResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.qqing.grpc.HealthCheckResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.qqing.grpc.HealthCheckResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.qqing.grpc.HealthCheckResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.qqing.grpc.HealthCheckResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.qqing.grpc.HealthCheckResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.qqing.grpc.HealthCheckResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.qqing.grpc.HealthCheckResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.qqing.grpc.HealthCheckResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.qqing.grpc.HealthCheckResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.qqing.grpc.HealthCheckResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.qqing.grpc.HealthCheckResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.qqing.grpc.HealthCheckResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.qqing.grpc.HealthCheckResponse)
      com.qqing.grpc.HealthCheckResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.qqing.grpc.HelloWorldProto.internal_static_com_qqing_grpc_HealthCheckResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.qqing.grpc.HelloWorldProto.internal_static_com_qqing_grpc_HealthCheckResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.qqing.grpc.HealthCheckResponse.class, com.qqing.grpc.HealthCheckResponse.Builder.class);
    }

    // Construct using com.qqing.grpc.HealthCheckResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      healthy_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.qqing.grpc.HelloWorldProto.internal_static_com_qqing_grpc_HealthCheckResponse_descriptor;
    }

    public com.qqing.grpc.HealthCheckResponse getDefaultInstanceForType() {
      return com.qqing.grpc.HealthCheckResponse.getDefaultInstance();
    }

    public com.qqing.grpc.HealthCheckResponse build() {
      com.qqing.grpc.HealthCheckResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.qqing.grpc.HealthCheckResponse buildPartial() {
      com.qqing.grpc.HealthCheckResponse result = new com.qqing.grpc.HealthCheckResponse(this);
      result.healthy_ = healthy_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.qqing.grpc.HealthCheckResponse) {
        return mergeFrom((com.qqing.grpc.HealthCheckResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.qqing.grpc.HealthCheckResponse other) {
      if (other == com.qqing.grpc.HealthCheckResponse.getDefaultInstance()) return this;
      if (other.getHealthy() != false) {
        setHealthy(other.getHealthy());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.qqing.grpc.HealthCheckResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.qqing.grpc.HealthCheckResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean healthy_ ;
    /**
     * <code>bool healthy = 1;</code>
     */
    public boolean getHealthy() {
      return healthy_;
    }
    /**
     * <code>bool healthy = 1;</code>
     */
    public Builder setHealthy(boolean value) {
      
      healthy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool healthy = 1;</code>
     */
    public Builder clearHealthy() {
      
      healthy_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.qqing.grpc.HealthCheckResponse)
  }

  // @@protoc_insertion_point(class_scope:com.qqing.grpc.HealthCheckResponse)
  private static final com.qqing.grpc.HealthCheckResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.qqing.grpc.HealthCheckResponse();
  }

  public static com.qqing.grpc.HealthCheckResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HealthCheckResponse>
      PARSER = new com.google.protobuf.AbstractParser<HealthCheckResponse>() {
    public HealthCheckResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HealthCheckResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HealthCheckResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HealthCheckResponse> getParserForType() {
    return PARSER;
  }

  public com.qqing.grpc.HealthCheckResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

