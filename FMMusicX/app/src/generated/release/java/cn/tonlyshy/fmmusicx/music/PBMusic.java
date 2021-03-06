// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Music.proto

package cn.tonlyshy.fmmusicx.music;

/**
 * <pre>
 *音乐
 * </pre>
 *
 * Protobuf type {@code PBMusic}
 */
public  final class PBMusic extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PBMusic)
    PBMusicOrBuilder {
  // Use PBMusic.newBuilder() to construct.
  private PBMusic(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PBMusic() {
    id_ = "";
    title_ = "";
    album_ = "";
    artist_ = "";
    path_ = "";
    duration_ = "";
    albumUri_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PBMusic(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            album_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            artist_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            duration_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            albumUri_ = s;
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
    return cn.tonlyshy.fmmusicx.music.Music.internal_static_PBMusic_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.tonlyshy.fmmusicx.music.Music.internal_static_PBMusic_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.tonlyshy.fmmusicx.music.PBMusic.class, cn.tonlyshy.fmmusicx.music.PBMusic.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 2;</code>
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALBUM_FIELD_NUMBER = 3;
  private volatile java.lang.Object album_;
  /**
   * <code>string album = 3;</code>
   */
  public java.lang.String getAlbum() {
    java.lang.Object ref = album_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      album_ = s;
      return s;
    }
  }
  /**
   * <code>string album = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAlbumBytes() {
    java.lang.Object ref = album_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      album_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARTIST_FIELD_NUMBER = 4;
  private volatile java.lang.Object artist_;
  /**
   * <code>string artist = 4;</code>
   */
  public java.lang.String getArtist() {
    java.lang.Object ref = artist_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      artist_ = s;
      return s;
    }
  }
  /**
   * <code>string artist = 4;</code>
   */
  public com.google.protobuf.ByteString
      getArtistBytes() {
    java.lang.Object ref = artist_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      artist_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 5;
  private volatile java.lang.Object path_;
  /**
   * <code>string path = 5;</code>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <code>string path = 5;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_FIELD_NUMBER = 6;
  private volatile java.lang.Object duration_;
  /**
   * <code>string duration = 6;</code>
   */
  public java.lang.String getDuration() {
    java.lang.Object ref = duration_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      duration_ = s;
      return s;
    }
  }
  /**
   * <code>string duration = 6;</code>
   */
  public com.google.protobuf.ByteString
      getDurationBytes() {
    java.lang.Object ref = duration_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      duration_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALBUMURI_FIELD_NUMBER = 7;
  private volatile java.lang.Object albumUri_;
  /**
   * <code>string albumUri = 7;</code>
   */
  public java.lang.String getAlbumUri() {
    java.lang.Object ref = albumUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      albumUri_ = s;
      return s;
    }
  }
  /**
   * <code>string albumUri = 7;</code>
   */
  public com.google.protobuf.ByteString
      getAlbumUriBytes() {
    java.lang.Object ref = albumUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      albumUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!getAlbumBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, album_);
    }
    if (!getArtistBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, artist_);
    }
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, path_);
    }
    if (!getDurationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, duration_);
    }
    if (!getAlbumUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, albumUri_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!getAlbumBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, album_);
    }
    if (!getArtistBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, artist_);
    }
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, path_);
    }
    if (!getDurationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, duration_);
    }
    if (!getAlbumUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, albumUri_);
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
    if (!(obj instanceof cn.tonlyshy.fmmusicx.music.PBMusic)) {
      return super.equals(obj);
    }
    cn.tonlyshy.fmmusicx.music.PBMusic other = (cn.tonlyshy.fmmusicx.music.PBMusic) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && getTitle()
        .equals(other.getTitle());
    result = result && getAlbum()
        .equals(other.getAlbum());
    result = result && getArtist()
        .equals(other.getArtist());
    result = result && getPath()
        .equals(other.getPath());
    result = result && getDuration()
        .equals(other.getDuration());
    result = result && getAlbumUri()
        .equals(other.getAlbumUri());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + ALBUM_FIELD_NUMBER;
    hash = (53 * hash) + getAlbum().hashCode();
    hash = (37 * hash) + ARTIST_FIELD_NUMBER;
    hash = (53 * hash) + getArtist().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + getDuration().hashCode();
    hash = (37 * hash) + ALBUMURI_FIELD_NUMBER;
    hash = (53 * hash) + getAlbumUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.tonlyshy.fmmusicx.music.PBMusic parseFrom(
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
  public static Builder newBuilder(cn.tonlyshy.fmmusicx.music.PBMusic prototype) {
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
   * <pre>
   *音乐
   * </pre>
   *
   * Protobuf type {@code PBMusic}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PBMusic)
      cn.tonlyshy.fmmusicx.music.PBMusicOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.tonlyshy.fmmusicx.music.Music.internal_static_PBMusic_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.tonlyshy.fmmusicx.music.Music.internal_static_PBMusic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.tonlyshy.fmmusicx.music.PBMusic.class, cn.tonlyshy.fmmusicx.music.PBMusic.Builder.class);
    }

    // Construct using cn.tonlyshy.fmmusicx.music.PBMusic.newBuilder()
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
      id_ = "";

      title_ = "";

      album_ = "";

      artist_ = "";

      path_ = "";

      duration_ = "";

      albumUri_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.tonlyshy.fmmusicx.music.Music.internal_static_PBMusic_descriptor;
    }

    public cn.tonlyshy.fmmusicx.music.PBMusic getDefaultInstanceForType() {
      return cn.tonlyshy.fmmusicx.music.PBMusic.getDefaultInstance();
    }

    public cn.tonlyshy.fmmusicx.music.PBMusic build() {
      cn.tonlyshy.fmmusicx.music.PBMusic result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.tonlyshy.fmmusicx.music.PBMusic buildPartial() {
      cn.tonlyshy.fmmusicx.music.PBMusic result = new cn.tonlyshy.fmmusicx.music.PBMusic(this);
      result.id_ = id_;
      result.title_ = title_;
      result.album_ = album_;
      result.artist_ = artist_;
      result.path_ = path_;
      result.duration_ = duration_;
      result.albumUri_ = albumUri_;
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
      if (other instanceof cn.tonlyshy.fmmusicx.music.PBMusic) {
        return mergeFrom((cn.tonlyshy.fmmusicx.music.PBMusic)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.tonlyshy.fmmusicx.music.PBMusic other) {
      if (other == cn.tonlyshy.fmmusicx.music.PBMusic.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getAlbum().isEmpty()) {
        album_ = other.album_;
        onChanged();
      }
      if (!other.getArtist().isEmpty()) {
        artist_ = other.artist_;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (!other.getDuration().isEmpty()) {
        duration_ = other.duration_;
        onChanged();
      }
      if (!other.getAlbumUri().isEmpty()) {
        albumUri_ = other.albumUri_;
        onChanged();
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
      cn.tonlyshy.fmmusicx.music.PBMusic parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.tonlyshy.fmmusicx.music.PBMusic) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object album_ = "";
    /**
     * <code>string album = 3;</code>
     */
    public java.lang.String getAlbum() {
      java.lang.Object ref = album_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        album_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string album = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAlbumBytes() {
      java.lang.Object ref = album_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        album_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string album = 3;</code>
     */
    public Builder setAlbum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      album_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string album = 3;</code>
     */
    public Builder clearAlbum() {
      
      album_ = getDefaultInstance().getAlbum();
      onChanged();
      return this;
    }
    /**
     * <code>string album = 3;</code>
     */
    public Builder setAlbumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      album_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object artist_ = "";
    /**
     * <code>string artist = 4;</code>
     */
    public java.lang.String getArtist() {
      java.lang.Object ref = artist_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        artist_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string artist = 4;</code>
     */
    public com.google.protobuf.ByteString
        getArtistBytes() {
      java.lang.Object ref = artist_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        artist_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string artist = 4;</code>
     */
    public Builder setArtist(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      artist_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string artist = 4;</code>
     */
    public Builder clearArtist() {
      
      artist_ = getDefaultInstance().getArtist();
      onChanged();
      return this;
    }
    /**
     * <code>string artist = 4;</code>
     */
    public Builder setArtistBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      artist_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>string path = 5;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string path = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string path = 5;</code>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string path = 5;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <code>string path = 5;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object duration_ = "";
    /**
     * <code>string duration = 6;</code>
     */
    public java.lang.String getDuration() {
      java.lang.Object ref = duration_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        duration_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string duration = 6;</code>
     */
    public com.google.protobuf.ByteString
        getDurationBytes() {
      java.lang.Object ref = duration_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        duration_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string duration = 6;</code>
     */
    public Builder setDuration(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string duration = 6;</code>
     */
    public Builder clearDuration() {
      
      duration_ = getDefaultInstance().getDuration();
      onChanged();
      return this;
    }
    /**
     * <code>string duration = 6;</code>
     */
    public Builder setDurationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      duration_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object albumUri_ = "";
    /**
     * <code>string albumUri = 7;</code>
     */
    public java.lang.String getAlbumUri() {
      java.lang.Object ref = albumUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        albumUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string albumUri = 7;</code>
     */
    public com.google.protobuf.ByteString
        getAlbumUriBytes() {
      java.lang.Object ref = albumUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        albumUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string albumUri = 7;</code>
     */
    public Builder setAlbumUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      albumUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string albumUri = 7;</code>
     */
    public Builder clearAlbumUri() {
      
      albumUri_ = getDefaultInstance().getAlbumUri();
      onChanged();
      return this;
    }
    /**
     * <code>string albumUri = 7;</code>
     */
    public Builder setAlbumUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      albumUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:PBMusic)
  }

  // @@protoc_insertion_point(class_scope:PBMusic)
  private static final cn.tonlyshy.fmmusicx.music.PBMusic DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.tonlyshy.fmmusicx.music.PBMusic();
  }

  public static cn.tonlyshy.fmmusicx.music.PBMusic getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PBMusic>
      PARSER = new com.google.protobuf.AbstractParser<PBMusic>() {
    public PBMusic parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PBMusic(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PBMusic> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PBMusic> getParserForType() {
    return PARSER;
  }

  public cn.tonlyshy.fmmusicx.music.PBMusic getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

