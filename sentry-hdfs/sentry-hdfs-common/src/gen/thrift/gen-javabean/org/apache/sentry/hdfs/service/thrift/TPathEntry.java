/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.hdfs.service.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TPathEntry implements org.apache.thrift.TBase<TPathEntry, TPathEntry._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPathEntry");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField PATH_ELEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("pathElement", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CHILDREN_FIELD_DESC = new org.apache.thrift.protocol.TField("children", org.apache.thrift.protocol.TType.SET, (short)4);
  private static final org.apache.thrift.protocol.TField AUTHZ_OBJS_FIELD_DESC = new org.apache.thrift.protocol.TField("authzObjs", org.apache.thrift.protocol.TType.SET, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPathEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPathEntryTupleSchemeFactory());
  }

  private byte type; // required
  private String pathElement; // required
  private Set<Integer> children; // required
  private Set<String> authzObjs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    PATH_ELEMENT((short)2, "pathElement"),
    CHILDREN((short)4, "children"),
    AUTHZ_OBJS((short)5, "authzObjs");

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
        case 1: // TYPE
          return TYPE;
        case 2: // PATH_ELEMENT
          return PATH_ELEMENT;
        case 4: // CHILDREN
          return CHILDREN;
        case 5: // AUTHZ_OBJS
          return AUTHZ_OBJS;
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
  private static final int __TYPE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.AUTHZ_OBJS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.PATH_ELEMENT, new org.apache.thrift.meta_data.FieldMetaData("pathElement", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHILDREN, new org.apache.thrift.meta_data.FieldMetaData("children", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.AUTHZ_OBJS, new org.apache.thrift.meta_data.FieldMetaData("authzObjs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPathEntry.class, metaDataMap);
  }

  public TPathEntry() {
  }

  public TPathEntry(
    byte type,
    String pathElement,
    Set<Integer> children)
  {
    this();
    this.type = type;
    setTypeIsSet(true);
    this.pathElement = pathElement;
    this.children = children;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPathEntry(TPathEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    this.type = other.type;
    if (other.isSetPathElement()) {
      this.pathElement = other.pathElement;
    }
    if (other.isSetChildren()) {
      Set<Integer> __this__children = new HashSet<Integer>();
      for (Integer other_element : other.children) {
        __this__children.add(other_element);
      }
      this.children = __this__children;
    }
    if (other.isSetAuthzObjs()) {
      Set<String> __this__authzObjs = new HashSet<String>();
      for (String other_element : other.authzObjs) {
        __this__authzObjs.add(other_element);
      }
      this.authzObjs = __this__authzObjs;
    }
  }

  public TPathEntry deepCopy() {
    return new TPathEntry(this);
  }

  @Override
  public void clear() {
    setTypeIsSet(false);
    this.type = 0;
    this.pathElement = null;
    this.children = null;
    this.authzObjs = null;
  }

  public byte getType() {
    return this.type;
  }

  public void setType(byte type) {
    this.type = type;
    setTypeIsSet(true);
  }

  public void unsetType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public String getPathElement() {
    return this.pathElement;
  }

  public void setPathElement(String pathElement) {
    this.pathElement = pathElement;
  }

  public void unsetPathElement() {
    this.pathElement = null;
  }

  /** Returns true if field pathElement is set (has been assigned a value) and false otherwise */
  public boolean isSetPathElement() {
    return this.pathElement != null;
  }

  public void setPathElementIsSet(boolean value) {
    if (!value) {
      this.pathElement = null;
    }
  }

  public int getChildrenSize() {
    return (this.children == null) ? 0 : this.children.size();
  }

  public java.util.Iterator<Integer> getChildrenIterator() {
    return (this.children == null) ? null : this.children.iterator();
  }

  public void addToChildren(int elem) {
    if (this.children == null) {
      this.children = new HashSet<Integer>();
    }
    this.children.add(elem);
  }

  public Set<Integer> getChildren() {
    return this.children;
  }

  public void setChildren(Set<Integer> children) {
    this.children = children;
  }

  public void unsetChildren() {
    this.children = null;
  }

  /** Returns true if field children is set (has been assigned a value) and false otherwise */
  public boolean isSetChildren() {
    return this.children != null;
  }

  public void setChildrenIsSet(boolean value) {
    if (!value) {
      this.children = null;
    }
  }

  public int getAuthzObjsSize() {
    return (this.authzObjs == null) ? 0 : this.authzObjs.size();
  }

  public java.util.Iterator<String> getAuthzObjsIterator() {
    return (this.authzObjs == null) ? null : this.authzObjs.iterator();
  }

  public void addToAuthzObjs(String elem) {
    if (this.authzObjs == null) {
      this.authzObjs = new HashSet<String>();
    }
    this.authzObjs.add(elem);
  }

  public Set<String> getAuthzObjs() {
    return this.authzObjs;
  }

  public void setAuthzObjs(Set<String> authzObjs) {
    this.authzObjs = authzObjs;
  }

  public void unsetAuthzObjs() {
    this.authzObjs = null;
  }

  /** Returns true if field authzObjs is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthzObjs() {
    return this.authzObjs != null;
  }

  public void setAuthzObjsIsSet(boolean value) {
    if (!value) {
      this.authzObjs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((Byte)value);
      }
      break;

    case PATH_ELEMENT:
      if (value == null) {
        unsetPathElement();
      } else {
        setPathElement((String)value);
      }
      break;

    case CHILDREN:
      if (value == null) {
        unsetChildren();
      } else {
        setChildren((Set<Integer>)value);
      }
      break;

    case AUTHZ_OBJS:
      if (value == null) {
        unsetAuthzObjs();
      } else {
        setAuthzObjs((Set<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return Byte.valueOf(getType());

    case PATH_ELEMENT:
      return getPathElement();

    case CHILDREN:
      return getChildren();

    case AUTHZ_OBJS:
      return getAuthzObjs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case PATH_ELEMENT:
      return isSetPathElement();
    case CHILDREN:
      return isSetChildren();
    case AUTHZ_OBJS:
      return isSetAuthzObjs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPathEntry)
      return this.equals((TPathEntry)that);
    return false;
  }

  public boolean equals(TPathEntry that) {
    if (that == null)
      return false;

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    boolean this_present_pathElement = true && this.isSetPathElement();
    boolean that_present_pathElement = true && that.isSetPathElement();
    if (this_present_pathElement || that_present_pathElement) {
      if (!(this_present_pathElement && that_present_pathElement))
        return false;
      if (!this.pathElement.equals(that.pathElement))
        return false;
    }

    boolean this_present_children = true && this.isSetChildren();
    boolean that_present_children = true && that.isSetChildren();
    if (this_present_children || that_present_children) {
      if (!(this_present_children && that_present_children))
        return false;
      if (!this.children.equals(that.children))
        return false;
    }

    boolean this_present_authzObjs = true && this.isSetAuthzObjs();
    boolean that_present_authzObjs = true && that.isSetAuthzObjs();
    if (this_present_authzObjs || that_present_authzObjs) {
      if (!(this_present_authzObjs && that_present_authzObjs))
        return false;
      if (!this.authzObjs.equals(that.authzObjs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_type = true;
    builder.append(present_type);
    if (present_type)
      builder.append(type);

    boolean present_pathElement = true && (isSetPathElement());
    builder.append(present_pathElement);
    if (present_pathElement)
      builder.append(pathElement);

    boolean present_children = true && (isSetChildren());
    builder.append(present_children);
    if (present_children)
      builder.append(children);

    boolean present_authzObjs = true && (isSetAuthzObjs());
    builder.append(present_authzObjs);
    if (present_authzObjs)
      builder.append(authzObjs);

    return builder.toHashCode();
  }

  public int compareTo(TPathEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TPathEntry typedOther = (TPathEntry)other;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPathElement()).compareTo(typedOther.isSetPathElement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPathElement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pathElement, typedOther.pathElement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChildren()).compareTo(typedOther.isSetChildren());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChildren()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.children, typedOther.children);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuthzObjs()).compareTo(typedOther.isSetAuthzObjs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthzObjs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authzObjs, typedOther.authzObjs);
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
    StringBuilder sb = new StringBuilder("TPathEntry(");
    boolean first = true;

    sb.append("type:");
    sb.append(this.type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pathElement:");
    if (this.pathElement == null) {
      sb.append("null");
    } else {
      sb.append(this.pathElement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("children:");
    if (this.children == null) {
      sb.append("null");
    } else {
      sb.append(this.children);
    }
    first = false;
    if (isSetAuthzObjs()) {
      if (!first) sb.append(", ");
      sb.append("authzObjs:");
      if (this.authzObjs == null) {
        sb.append("null");
      } else {
        sb.append(this.authzObjs);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' is unset! Struct:" + toString());
    }

    if (!isSetPathElement()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pathElement' is unset! Struct:" + toString());
    }

    if (!isSetChildren()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'children' is unset! Struct:" + toString());
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

  private static class TPathEntryStandardSchemeFactory implements SchemeFactory {
    public TPathEntryStandardScheme getScheme() {
      return new TPathEntryStandardScheme();
    }
  }

  private static class TPathEntryStandardScheme extends StandardScheme<TPathEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPathEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.type = iprot.readByte();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PATH_ELEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pathElement = iprot.readString();
              struct.setPathElementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHILDREN
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set32 = iprot.readSetBegin();
                struct.children = new HashSet<Integer>(2*_set32.size);
                for (int _i33 = 0; _i33 < _set32.size; ++_i33)
                {
                  int _elem34; // required
                  _elem34 = iprot.readI32();
                  struct.children.add(_elem34);
                }
                iprot.readSetEnd();
              }
              struct.setChildrenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AUTHZ_OBJS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set35 = iprot.readSetBegin();
                struct.authzObjs = new HashSet<String>(2*_set35.size);
                for (int _i36 = 0; _i36 < _set35.size; ++_i36)
                {
                  String _elem37; // required
                  _elem37 = iprot.readString();
                  struct.authzObjs.add(_elem37);
                }
                iprot.readSetEnd();
              }
              struct.setAuthzObjsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPathEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeByte(struct.type);
      oprot.writeFieldEnd();
      if (struct.pathElement != null) {
        oprot.writeFieldBegin(PATH_ELEMENT_FIELD_DESC);
        oprot.writeString(struct.pathElement);
        oprot.writeFieldEnd();
      }
      if (struct.children != null) {
        oprot.writeFieldBegin(CHILDREN_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.children.size()));
          for (int _iter38 : struct.children)
          {
            oprot.writeI32(_iter38);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.authzObjs != null) {
        if (struct.isSetAuthzObjs()) {
          oprot.writeFieldBegin(AUTHZ_OBJS_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.authzObjs.size()));
            for (String _iter39 : struct.authzObjs)
            {
              oprot.writeString(_iter39);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPathEntryTupleSchemeFactory implements SchemeFactory {
    public TPathEntryTupleScheme getScheme() {
      return new TPathEntryTupleScheme();
    }
  }

  private static class TPathEntryTupleScheme extends TupleScheme<TPathEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPathEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeByte(struct.type);
      oprot.writeString(struct.pathElement);
      {
        oprot.writeI32(struct.children.size());
        for (int _iter40 : struct.children)
        {
          oprot.writeI32(_iter40);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetAuthzObjs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAuthzObjs()) {
        {
          oprot.writeI32(struct.authzObjs.size());
          for (String _iter41 : struct.authzObjs)
          {
            oprot.writeString(_iter41);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPathEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = iprot.readByte();
      struct.setTypeIsSet(true);
      struct.pathElement = iprot.readString();
      struct.setPathElementIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set42 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.children = new HashSet<Integer>(2*_set42.size);
        for (int _i43 = 0; _i43 < _set42.size; ++_i43)
        {
          int _elem44; // required
          _elem44 = iprot.readI32();
          struct.children.add(_elem44);
        }
      }
      struct.setChildrenIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set45 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.authzObjs = new HashSet<String>(2*_set45.size);
          for (int _i46 = 0; _i46 < _set45.size; ++_i46)
          {
            String _elem47; // required
            _elem47 = iprot.readString();
            struct.authzObjs.add(_elem47);
          }
        }
        struct.setAuthzObjsIsSet(true);
      }
    }
  }

}

