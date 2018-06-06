/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.api.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class TSentryConfigValueRequest implements org.apache.thrift.TBase<TSentryConfigValueRequest, TSentryConfigValueRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TSentryConfigValueRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSentryConfigValueRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PROPERTY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("propertyName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DEFAULT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("defaultValue", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSentryConfigValueRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSentryConfigValueRequestTupleSchemeFactory());
  }

  private int protocol_version; // required
  private String propertyName; // required
  private String defaultValue; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROTOCOL_VERSION((short)1, "protocol_version"),
    PROPERTY_NAME((short)2, "propertyName"),
    DEFAULT_VALUE((short)3, "defaultValue");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // PROPERTY_NAME
          return PROPERTY_NAME;
        case 3: // DEFAULT_VALUE
          return DEFAULT_VALUE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PROTOCOL_VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DEFAULT_VALUE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PROPERTY_NAME, new org.apache.thrift.meta_data.FieldMetaData("propertyName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEFAULT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("defaultValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSentryConfigValueRequest.class, metaDataMap);
  }

  public TSentryConfigValueRequest() {
    this.protocol_version = 2;

  }

  public TSentryConfigValueRequest(
    int protocol_version,
    String propertyName)
  {
    this();
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
    this.propertyName = propertyName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSentryConfigValueRequest(TSentryConfigValueRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.protocol_version = other.protocol_version;
    if (other.isSetPropertyName()) {
      this.propertyName = other.propertyName;
    }
    if (other.isSetDefaultValue()) {
      this.defaultValue = other.defaultValue;
    }
  }

  public TSentryConfigValueRequest deepCopy() {
    return new TSentryConfigValueRequest(this);
  }

  @Override
  public void clear() {
    this.protocol_version = 2;

    this.propertyName = null;
    this.defaultValue = null;
  }

  public int getProtocol_version() {
    return this.protocol_version;
  }

  public void setProtocol_version(int protocol_version) {
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
  }

  public void unsetProtocol_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return EncodingUtils.testBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  public void setProtocol_versionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID, value);
  }

  public String getPropertyName() {
    return this.propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public void unsetPropertyName() {
    this.propertyName = null;
  }

  /** Returns true if field propertyName is set (has been assigned a value) and false otherwise */
  public boolean isSetPropertyName() {
    return this.propertyName != null;
  }

  public void setPropertyNameIsSet(boolean value) {
    if (!value) {
      this.propertyName = null;
    }
  }

  public String getDefaultValue() {
    return this.defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public void unsetDefaultValue() {
    this.defaultValue = null;
  }

  /** Returns true if field defaultValue is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaultValue() {
    return this.defaultValue != null;
  }

  public void setDefaultValueIsSet(boolean value) {
    if (!value) {
      this.defaultValue = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((Integer)value);
      }
      break;

    case PROPERTY_NAME:
      if (value == null) {
        unsetPropertyName();
      } else {
        setPropertyName((String)value);
      }
      break;

    case DEFAULT_VALUE:
      if (value == null) {
        unsetDefaultValue();
      } else {
        setDefaultValue((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocol_version();

    case PROPERTY_NAME:
      return getPropertyName();

    case DEFAULT_VALUE:
      return getDefaultValue();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocol_version();
    case PROPERTY_NAME:
      return isSetPropertyName();
    case DEFAULT_VALUE:
      return isSetDefaultValue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSentryConfigValueRequest)
      return this.equals((TSentryConfigValueRequest)that);
    return false;
  }

  public boolean equals(TSentryConfigValueRequest that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true;
    boolean that_present_protocol_version = true;
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (this.protocol_version != that.protocol_version)
        return false;
    }

    boolean this_present_propertyName = true && this.isSetPropertyName();
    boolean that_present_propertyName = true && that.isSetPropertyName();
    if (this_present_propertyName || that_present_propertyName) {
      if (!(this_present_propertyName && that_present_propertyName))
        return false;
      if (!this.propertyName.equals(that.propertyName))
        return false;
    }

    boolean this_present_defaultValue = true && this.isSetDefaultValue();
    boolean that_present_defaultValue = true && that.isSetDefaultValue();
    if (this_present_defaultValue || that_present_defaultValue) {
      if (!(this_present_defaultValue && that_present_defaultValue))
        return false;
      if (!this.defaultValue.equals(that.defaultValue))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_protocol_version = true;
    list.add(present_protocol_version);
    if (present_protocol_version)
      list.add(protocol_version);

    boolean present_propertyName = true && (isSetPropertyName());
    list.add(present_propertyName);
    if (present_propertyName)
      list.add(propertyName);

    boolean present_defaultValue = true && (isSetDefaultValue());
    list.add(present_defaultValue);
    if (present_defaultValue)
      list.add(defaultValue);

    return list.hashCode();
  }

  @Override
  public int compareTo(TSentryConfigValueRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(other.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, other.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropertyName()).compareTo(other.isSetPropertyName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropertyName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propertyName, other.propertyName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDefaultValue()).compareTo(other.isSetDefaultValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaultValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaultValue, other.defaultValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TSentryConfigValueRequest(");
    boolean first = true;

    sb.append("protocol_version:");
    sb.append(this.protocol_version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("propertyName:");
    if (this.propertyName == null) {
      sb.append("null");
    } else {
      sb.append(this.propertyName);
    }
    first = false;
    if (isSetDefaultValue()) {
      if (!first) sb.append(", ");
      sb.append("defaultValue:");
      if (this.defaultValue == null) {
        sb.append("null");
      } else {
        sb.append(this.defaultValue);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetProtocol_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' is unset! Struct:" + toString());
    }

    if (!isSetPropertyName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'propertyName' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSentryConfigValueRequestStandardSchemeFactory implements SchemeFactory {
    public TSentryConfigValueRequestStandardScheme getScheme() {
      return new TSentryConfigValueRequestStandardScheme();
    }
  }

  private static class TSentryConfigValueRequestStandardScheme extends StandardScheme<TSentryConfigValueRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSentryConfigValueRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = iprot.readI32();
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROPERTY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.propertyName = iprot.readString();
              struct.setPropertyNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEFAULT_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.defaultValue = iprot.readString();
              struct.setDefaultValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSentryConfigValueRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
      oprot.writeI32(struct.protocol_version);
      oprot.writeFieldEnd();
      if (struct.propertyName != null) {
        oprot.writeFieldBegin(PROPERTY_NAME_FIELD_DESC);
        oprot.writeString(struct.propertyName);
        oprot.writeFieldEnd();
      }
      if (struct.defaultValue != null) {
        if (struct.isSetDefaultValue()) {
          oprot.writeFieldBegin(DEFAULT_VALUE_FIELD_DESC);
          oprot.writeString(struct.defaultValue);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSentryConfigValueRequestTupleSchemeFactory implements SchemeFactory {
    public TSentryConfigValueRequestTupleScheme getScheme() {
      return new TSentryConfigValueRequestTupleScheme();
    }
  }

  private static class TSentryConfigValueRequestTupleScheme extends TupleScheme<TSentryConfigValueRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSentryConfigValueRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version);
      oprot.writeString(struct.propertyName);
      BitSet optionals = new BitSet();
      if (struct.isSetDefaultValue()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDefaultValue()) {
        oprot.writeString(struct.defaultValue);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSentryConfigValueRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = iprot.readI32();
      struct.setProtocol_versionIsSet(true);
      struct.propertyName = iprot.readString();
      struct.setPropertyNameIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.defaultValue = iprot.readString();
        struct.setDefaultValueIsSet(true);
      }
    }
  }

}
