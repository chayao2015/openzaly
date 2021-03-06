// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: site/api_user_mute.proto

package com.akaxin.proto.site;

public final class ApiUserMuteProto {
  private ApiUserMuteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ApiUserMuteRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiUserMuteRequest)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiUserMuteRequest}
   */
  public  static final class ApiUserMuteRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiUserMuteRequest)
      ApiUserMuteRequestOrBuilder {
    // Use ApiUserMuteRequest.newBuilder() to construct.
    private ApiUserMuteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiUserMuteRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiUserMuteRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
      return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest.class, com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest.Builder.class);
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
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest other = (com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
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
    public static Builder newBuilder(com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest prototype) {
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
     * Protobuf type {@code site.ApiUserMuteRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiUserMuteRequest)
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest.class, com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteRequest_descriptor;
      }

      public com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest build() {
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest buildPartial() {
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest result = new com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest(this);
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
        if (other instanceof com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest) {
          return mergeFrom((com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest other) {
        if (other == com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest.getDefaultInstance()) return this;
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
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:site.ApiUserMuteRequest)
    }

    // @@protoc_insertion_point(class_scope:site.ApiUserMuteRequest)
    private static final com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest();
    }

    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiUserMuteRequest>
        PARSER = new com.google.protobuf.AbstractParser<ApiUserMuteRequest>() {
      public ApiUserMuteRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiUserMuteRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiUserMuteRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiUserMuteRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ApiUserMuteResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiUserMuteResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool mute = 1;</code>
     */
    boolean getMute();
  }
  /**
   * Protobuf type {@code site.ApiUserMuteResponse}
   */
  public  static final class ApiUserMuteResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiUserMuteResponse)
      ApiUserMuteResponseOrBuilder {
    // Use ApiUserMuteResponse.newBuilder() to construct.
    private ApiUserMuteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiUserMuteResponse() {
      mute_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiUserMuteResponse(
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

              mute_ = input.readBool();
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
      return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse.class, com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse.Builder.class);
    }

    public static final int MUTE_FIELD_NUMBER = 1;
    private boolean mute_;
    /**
     * <code>optional bool mute = 1;</code>
     */
    public boolean getMute() {
      return mute_;
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
      if (mute_ != false) {
        output.writeBool(1, mute_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mute_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, mute_);
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
      if (!(obj instanceof com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse other = (com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse) obj;

      boolean result = true;
      result = result && (getMute()
          == other.getMute());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + MUTE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMute());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
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
    public static Builder newBuilder(com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse prototype) {
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
     * Protobuf type {@code site.ApiUserMuteResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiUserMuteResponse)
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse.class, com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse.newBuilder()
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
        mute_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiUserMuteProto.internal_static_site_ApiUserMuteResponse_descriptor;
      }

      public com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse build() {
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse buildPartial() {
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse result = new com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse(this);
        result.mute_ = mute_;
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
        if (other instanceof com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse) {
          return mergeFrom((com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse other) {
        if (other == com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse.getDefaultInstance()) return this;
        if (other.getMute() != false) {
          setMute(other.getMute());
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
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean mute_ ;
      /**
       * <code>optional bool mute = 1;</code>
       */
      public boolean getMute() {
        return mute_;
      }
      /**
       * <code>optional bool mute = 1;</code>
       */
      public Builder setMute(boolean value) {
        
        mute_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool mute = 1;</code>
       */
      public Builder clearMute() {
        
        mute_ = false;
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


      // @@protoc_insertion_point(builder_scope:site.ApiUserMuteResponse)
    }

    // @@protoc_insertion_point(class_scope:site.ApiUserMuteResponse)
    private static final com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse();
    }

    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiUserMuteResponse>
        PARSER = new com.google.protobuf.AbstractParser<ApiUserMuteResponse>() {
      public ApiUserMuteResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiUserMuteResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiUserMuteResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiUserMuteResponse> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiUserMuteRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiUserMuteRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiUserMuteResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiUserMuteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030site/api_user_mute.proto\022\004site\"\024\n\022ApiU" +
      "serMuteRequest\"#\n\023ApiUserMuteResponse\022\014\n" +
      "\004mute\030\001 \001(\0102Q\n\022ApiUserMuteService\022;\n\004mut" +
      "e\022\030.site.ApiUserMuteRequest\032\031.site.ApiUs" +
      "erMuteResponseB)\n\025com.akaxin.proto.siteB" +
      "\020ApiUserMuteProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_site_ApiUserMuteRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_site_ApiUserMuteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiUserMuteRequest_descriptor,
        new java.lang.String[] { });
    internal_static_site_ApiUserMuteResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_site_ApiUserMuteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiUserMuteResponse_descriptor,
        new java.lang.String[] { "Mute", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
