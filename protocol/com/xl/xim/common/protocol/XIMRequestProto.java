// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseRequestProto.proto

package com.xl.xim.common.protocol;

public final class XIMRequestProto {
  private XIMRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface XIMReqProtocolOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.XIMReqProtocol)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 requestId = 2;</code>
     * @return Whether the requestId field is set.
     */
    boolean hasRequestId();
    /**
     * <code>required int64 requestId = 2;</code>
     * @return The requestId.
     */
    long getRequestId();

    /**
     * <code>required string reqMsg = 1;</code>
     * @return Whether the reqMsg field is set.
     */
    boolean hasReqMsg();
    /**
     * <code>required string reqMsg = 1;</code>
     * @return The reqMsg.
     */
    java.lang.String getReqMsg();
    /**
     * <code>required string reqMsg = 1;</code>
     * @return The bytes for reqMsg.
     */
    com.google.protobuf.ByteString
        getReqMsgBytes();

    /**
     * <code>required int32 type = 3;</code>
     * @return Whether the type field is set.
     */
    boolean hasType();
    /**
     * <code>required int32 type = 3;</code>
     * @return The type.
     */
    int getType();
  }
  /**
   * Protobuf type {@code protocol.XIMReqProtocol}
   */
  public static final class XIMReqProtocol extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.XIMReqProtocol)
      XIMReqProtocolOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use XIMReqProtocol.newBuilder() to construct.
    private XIMReqProtocol(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private XIMReqProtocol() {
      reqMsg_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new XIMReqProtocol();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private XIMReqProtocol(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              reqMsg_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              requestId_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              type_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xl.xim.common.protocol.XIMRequestProto.internal_static_protocol_XIMReqProtocol_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xl.xim.common.protocol.XIMRequestProto.internal_static_protocol_XIMReqProtocol_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol.class, com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol.Builder.class);
    }

    private int bitField0_;
    public static final int REQUESTID_FIELD_NUMBER = 2;
    private long requestId_;
    /**
     * <code>required int64 requestId = 2;</code>
     * @return Whether the requestId field is set.
     */
    @java.lang.Override
    public boolean hasRequestId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int64 requestId = 2;</code>
     * @return The requestId.
     */
    @java.lang.Override
    public long getRequestId() {
      return requestId_;
    }

    public static final int REQMSG_FIELD_NUMBER = 1;
    private volatile java.lang.Object reqMsg_;
    /**
     * <code>required string reqMsg = 1;</code>
     * @return Whether the reqMsg field is set.
     */
    @java.lang.Override
    public boolean hasReqMsg() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string reqMsg = 1;</code>
     * @return The reqMsg.
     */
    @java.lang.Override
    public java.lang.String getReqMsg() {
      java.lang.Object ref = reqMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reqMsg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string reqMsg = 1;</code>
     * @return The bytes for reqMsg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReqMsgBytes() {
      java.lang.Object ref = reqMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reqMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>required int32 type = 3;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int32 type = 3;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRequestId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasReqMsg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reqMsg_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt64(2, requestId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt32(3, type_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reqMsg_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, requestId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, type_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol)) {
        return super.equals(obj);
      }
      com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol other = (com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol) obj;

      if (hasRequestId() != other.hasRequestId()) return false;
      if (hasRequestId()) {
        if (getRequestId()
            != other.getRequestId()) return false;
      }
      if (hasReqMsg() != other.hasReqMsg()) return false;
      if (hasReqMsg()) {
        if (!getReqMsg()
            .equals(other.getReqMsg())) return false;
      }
      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (getType()
            != other.getType()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRequestId()) {
        hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRequestId());
      }
      if (hasReqMsg()) {
        hash = (37 * hash) + REQMSG_FIELD_NUMBER;
        hash = (53 * hash) + getReqMsg().hashCode();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code protocol.XIMReqProtocol}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.XIMReqProtocol)
        com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocolOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xl.xim.common.protocol.XIMRequestProto.internal_static_protocol_XIMReqProtocol_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xl.xim.common.protocol.XIMRequestProto.internal_static_protocol_XIMReqProtocol_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol.class, com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol.Builder.class);
      }

      // Construct using com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        requestId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        reqMsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xl.xim.common.protocol.XIMRequestProto.internal_static_protocol_XIMReqProtocol_descriptor;
      }

      @java.lang.Override
      public com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol getDefaultInstanceForType() {
        return com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol.getDefaultInstance();
      }

      @java.lang.Override
      public com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol build() {
        com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol buildPartial() {
        com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol result = new com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.requestId_ = requestId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.reqMsg_ = reqMsg_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.type_ = type_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol) {
          return mergeFrom((com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol other) {
        if (other == com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasReqMsg()) {
          bitField0_ |= 0x00000002;
          reqMsg_ = other.reqMsg_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasRequestId()) {
          return false;
        }
        if (!hasReqMsg()) {
          return false;
        }
        if (!hasType()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long requestId_ ;
      /**
       * <code>required int64 requestId = 2;</code>
       * @return Whether the requestId field is set.
       */
      @java.lang.Override
      public boolean hasRequestId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required int64 requestId = 2;</code>
       * @return The requestId.
       */
      @java.lang.Override
      public long getRequestId() {
        return requestId_;
      }
      /**
       * <code>required int64 requestId = 2;</code>
       * @param value The requestId to set.
       * @return This builder for chaining.
       */
      public Builder setRequestId(long value) {
        bitField0_ |= 0x00000001;
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 requestId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        requestId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object reqMsg_ = "";
      /**
       * <code>required string reqMsg = 1;</code>
       * @return Whether the reqMsg field is set.
       */
      public boolean hasReqMsg() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string reqMsg = 1;</code>
       * @return The reqMsg.
       */
      public java.lang.String getReqMsg() {
        java.lang.Object ref = reqMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reqMsg_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string reqMsg = 1;</code>
       * @return The bytes for reqMsg.
       */
      public com.google.protobuf.ByteString
          getReqMsgBytes() {
        java.lang.Object ref = reqMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reqMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string reqMsg = 1;</code>
       * @param value The reqMsg to set.
       * @return This builder for chaining.
       */
      public Builder setReqMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        reqMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string reqMsg = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReqMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        reqMsg_ = getDefaultInstance().getReqMsg();
        onChanged();
        return this;
      }
      /**
       * <code>required string reqMsg = 1;</code>
       * @param value The bytes for reqMsg to set.
       * @return This builder for chaining.
       */
      public Builder setReqMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        reqMsg_ = value;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>required int32 type = 3;</code>
       * @return Whether the type field is set.
       */
      @java.lang.Override
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required int32 type = 3;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 3;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.XIMReqProtocol)
    }

    // @@protoc_insertion_point(class_scope:protocol.XIMReqProtocol)
    private static final com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol();
    }

    public static com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<XIMReqProtocol>
        PARSER = new com.google.protobuf.AbstractParser<XIMReqProtocol>() {
      @java.lang.Override
      public XIMReqProtocol parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new XIMReqProtocol(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<XIMReqProtocol> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<XIMReqProtocol> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.xl.xim.common.protocol.XIMRequestProto.XIMReqProtocol getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_XIMReqProtocol_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_XIMReqProtocol_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026BaseRequestProto.proto\022\010protocol\"A\n\016XI" +
      "MReqProtocol\022\021\n\trequestId\030\002 \002(\003\022\016\n\006reqMs" +
      "g\030\001 \002(\t\022\014\n\004type\030\003 \002(\005B-\n\032com.xl.xim.comm" +
      "on.protocolB\017XIMRequestProto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protocol_XIMReqProtocol_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_XIMReqProtocol_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_XIMReqProtocol_descriptor,
        new java.lang.String[] { "RequestId", "ReqMsg", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
