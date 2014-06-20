/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cassandraclient.beans;

import org.apache.commons.lang3.builder.HashCodeBuilder;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Device implements org.apache.thrift.TBase<Device, Device._Fields>, java.io.Serializable, Cloneable, Comparable<Device> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Device");

  private static final org.apache.thrift.protocol.TField UDID_FIELD_DESC = new org.apache.thrift.protocol.TField("udid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FRIENDLYNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("friendlyname", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SERIALNUM_FIELD_DESC = new org.apache.thrift.protocol.TField("serialnum", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField MANIDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("manidate", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField L_FIELD_DESC = new org.apache.thrift.protocol.TField("l", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeviceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeviceTupleSchemeFactory());
  }

  public String udid; // required
  public String friendlyname; // required
  public int serialnum; // required
  public String manidate; // required
  public List<String> l; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UDID((short)1, "udid"),
    FRIENDLYNAME((short)2, "friendlyname"),
    SERIALNUM((short)3, "serialnum"),
    MANIDATE((short)4, "manidate"),
    L((short)5, "l");

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
        case 1: // UDID
          return UDID;
        case 2: // FRIENDLYNAME
          return FRIENDLYNAME;
        case 3: // SERIALNUM
          return SERIALNUM;
        case 4: // MANIDATE
          return MANIDATE;
        case 5: // L
          return L;
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
  private static final int __SERIALNUM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UDID, new org.apache.thrift.meta_data.FieldMetaData("udid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FRIENDLYNAME, new org.apache.thrift.meta_data.FieldMetaData("friendlyname", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERIALNUM, new org.apache.thrift.meta_data.FieldMetaData("serialnum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MANIDATE, new org.apache.thrift.meta_data.FieldMetaData("manidate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Date")));
    tmpMap.put(_Fields.L, new org.apache.thrift.meta_data.FieldMetaData("l", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Device.class, metaDataMap);
  }

  public Device() {
  }

  public Device(
    String udid,
    String friendlyname,
    int serialnum,
    String manidate,
    List<String> l)
  {
    this();
    this.udid = udid;
    this.friendlyname = friendlyname;
    this.serialnum = serialnum;
    setSerialnumIsSet(true);
    this.manidate = manidate;
    this.l = l;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Device(Device other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUdid()) {
      this.udid = other.udid;
    }
    if (other.isSetFriendlyname()) {
      this.friendlyname = other.friendlyname;
    }
    this.serialnum = other.serialnum;
    if (other.isSetManidate()) {
      this.manidate = other.manidate;
    }
    if (other.isSetL()) {
      List<String> __this__l = new ArrayList<String>(other.l);
      this.l = __this__l;
    }
  }

  public Device deepCopy() {
    return new Device(this);
  }

  @Override
  public void clear() {
    this.udid = null;
    this.friendlyname = null;
    setSerialnumIsSet(false);
    this.serialnum = 0;
    this.manidate = null;
    this.l = null;
  }

  public String getUdid() {
    return this.udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  //  return this;
  }

  public void unsetUdid() {
    this.udid = null;
  }

  /** Returns true if field udid is set (has been assigned a value) and false otherwise */
  public boolean isSetUdid() {
    return this.udid != null;
  }

  public void setUdidIsSet(boolean value) {
    if (!value) {
      this.udid = null;
    }
  }

  public String getFriendlyname() {
    return this.friendlyname;
  }

  public Device setFriendlyname(String friendlyname) {
    this.friendlyname = friendlyname;
    return this;
  }

  public void unsetFriendlyname() {
    this.friendlyname = null;
  }

  /** Returns true if field friendlyname is set (has been assigned a value) and false otherwise */
  public boolean isSetFriendlyname() {
    return this.friendlyname != null;
  }

  public void setFriendlynameIsSet(boolean value) {
    if (!value) {
      this.friendlyname = null;
    }
  }

  public int getSerialnum() {
    return this.serialnum;
  }

  public Device setSerialnum(int serialnum) {
    this.serialnum = serialnum;
    setSerialnumIsSet(true);
    return this;
  }

  public void unsetSerialnum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SERIALNUM_ISSET_ID);
  }

  /** Returns true if field serialnum is set (has been assigned a value) and false otherwise */
  public boolean isSetSerialnum() {
    return EncodingUtils.testBit(__isset_bitfield, __SERIALNUM_ISSET_ID);
  }

  public void setSerialnumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SERIALNUM_ISSET_ID, value);
  }

  public String getManidate() {
    return this.manidate;
  }

  public Device setManidate(String manidate) {
    this.manidate = manidate;
    return this;
  }

  public void unsetManidate() {
    this.manidate = null;
  }

  /** Returns true if field manidate is set (has been assigned a value) and false otherwise */
  public boolean isSetManidate() {
    return this.manidate != null;
  }

  public void setManidateIsSet(boolean value) {
    if (!value) {
      this.manidate = null;
    }
  }

  public int getLSize() {
    return (this.l == null) ? 0 : this.l.size();
  }

  public java.util.Iterator<String> getLIterator() {
    return (this.l == null) ? null : this.l.iterator();
  }

  public void addToL(String elem) {
    if (this.l == null) {
      this.l = new ArrayList<String>();
    }
    this.l.add(elem);
  }

  public List<String> getL() {
    return this.l;
  }

  public Device setL(List<String> l) {
    this.l = l;
    return this;
  }

  public void unsetL() {
    this.l = null;
  }

  /** Returns true if field l is set (has been assigned a value) and false otherwise */
  public boolean isSetL() {
    return this.l != null;
  }

  public void setLIsSet(boolean value) {
    if (!value) {
      this.l = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UDID:
      if (value == null) {
        unsetUdid();
      } else {
        setUdid((String)value);
      }
      break;

    case FRIENDLYNAME:
      if (value == null) {
        unsetFriendlyname();
      } else {
        setFriendlyname((String)value);
      }
      break;

    case SERIALNUM:
      if (value == null) {
        unsetSerialnum();
      } else {
        setSerialnum((Integer)value);
      }
      break;

    case MANIDATE:
      if (value == null) {
        unsetManidate();
      } else {
        setManidate((String)value);
      }
      break;

    case L:
      if (value == null) {
        unsetL();
      } else {
        setL((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UDID:
      return getUdid();

    case FRIENDLYNAME:
      return getFriendlyname();

    case SERIALNUM:
      return Integer.valueOf(getSerialnum());

    case MANIDATE:
      return getManidate();

    case L:
      return getL();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UDID:
      return isSetUdid();
    case FRIENDLYNAME:
      return isSetFriendlyname();
    case SERIALNUM:
      return isSetSerialnum();
    case MANIDATE:
      return isSetManidate();
    case L:
      return isSetL();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Device)
      return this.equals((Device)that);
    return false;
  }

  public boolean equals(Device that) {
    if (that == null)
      return false;

    boolean this_present_udid = true && this.isSetUdid();
    boolean that_present_udid = true && that.isSetUdid();
    if (this_present_udid || that_present_udid) {
      if (!(this_present_udid && that_present_udid))
        return false;
      if (!this.udid.equals(that.udid))
        return false;
    }

    boolean this_present_friendlyname = true && this.isSetFriendlyname();
    boolean that_present_friendlyname = true && that.isSetFriendlyname();
    if (this_present_friendlyname || that_present_friendlyname) {
      if (!(this_present_friendlyname && that_present_friendlyname))
        return false;
      if (!this.friendlyname.equals(that.friendlyname))
        return false;
    }

    boolean this_present_serialnum = true;
    boolean that_present_serialnum = true;
    if (this_present_serialnum || that_present_serialnum) {
      if (!(this_present_serialnum && that_present_serialnum))
        return false;
      if (this.serialnum != that.serialnum)
        return false;
    }

    boolean this_present_manidate = true && this.isSetManidate();
    boolean that_present_manidate = true && that.isSetManidate();
    if (this_present_manidate || that_present_manidate) {
      if (!(this_present_manidate && that_present_manidate))
        return false;
      if (!this.manidate.equals(that.manidate))
        return false;
    }

    boolean this_present_l = true && this.isSetL();
    boolean that_present_l = true && that.isSetL();
    if (this_present_l || that_present_l) {
      if (!(this_present_l && that_present_l))
        return false;
      if (!this.l.equals(that.l))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_udid = true && (isSetUdid());
    builder.append(present_udid);
    if (present_udid)
      builder.append(udid);

    boolean present_friendlyname = true && (isSetFriendlyname());
    builder.append(present_friendlyname);
    if (present_friendlyname)
      builder.append(friendlyname);

    boolean present_serialnum = true;
    builder.append(present_serialnum);
    if (present_serialnum)
      builder.append(serialnum);

    boolean present_manidate = true && (isSetManidate());
    builder.append(present_manidate);
    if (present_manidate)
      builder.append(manidate);

    boolean present_l = true && (isSetL());
    builder.append(present_l);
    if (present_l)
      builder.append(l);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(Device other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUdid()).compareTo(other.isSetUdid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUdid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.udid, other.udid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFriendlyname()).compareTo(other.isSetFriendlyname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFriendlyname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.friendlyname, other.friendlyname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSerialnum()).compareTo(other.isSetSerialnum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSerialnum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serialnum, other.serialnum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetManidate()).compareTo(other.isSetManidate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetManidate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.manidate, other.manidate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetL()).compareTo(other.isSetL());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetL()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.l, other.l);
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
    StringBuilder sb = new StringBuilder("Device(");
    boolean first = true;

    sb.append("udid:");
    if (this.udid == null) {
      sb.append("null");
    } else {
      sb.append(this.udid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("friendlyname:");
    if (this.friendlyname == null) {
      sb.append("null");
    } else {
      sb.append(this.friendlyname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serialnum:");
    sb.append(this.serialnum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("manidate:");
    if (this.manidate == null) {
      sb.append("null");
    } else {
      sb.append(this.manidate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("l:");
    if (this.l == null) {
      sb.append("null");
    } else {
      sb.append(this.l);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class DeviceStandardSchemeFactory implements SchemeFactory {
    public DeviceStandardScheme getScheme() {
      return new DeviceStandardScheme();
    }
  }

  private static class DeviceStandardScheme extends StandardScheme<Device> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Device struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UDID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.udid = iprot.readString();
              struct.setUdidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FRIENDLYNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.friendlyname = iprot.readString();
              struct.setFriendlynameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SERIALNUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.serialnum = iprot.readI32();
              struct.setSerialnumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MANIDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.manidate = iprot.readString();
              struct.setManidateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // L
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.l = new ArrayList<String>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  String _elem2;
                  _elem2 = iprot.readString();
                  struct.l.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setLIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Device struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.udid != null) {
        oprot.writeFieldBegin(UDID_FIELD_DESC);
        oprot.writeString(struct.udid);
        oprot.writeFieldEnd();
      }
      if (struct.friendlyname != null) {
        oprot.writeFieldBegin(FRIENDLYNAME_FIELD_DESC);
        oprot.writeString(struct.friendlyname);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SERIALNUM_FIELD_DESC);
      oprot.writeI32(struct.serialnum);
      oprot.writeFieldEnd();
      if (struct.manidate != null) {
        oprot.writeFieldBegin(MANIDATE_FIELD_DESC);
        oprot.writeString(struct.manidate);
        oprot.writeFieldEnd();
      }
      if (struct.l != null) {
        oprot.writeFieldBegin(L_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.l.size()));
          for (String _iter3 : struct.l)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeviceTupleSchemeFactory implements SchemeFactory {
    public DeviceTupleScheme getScheme() {
      return new DeviceTupleScheme();
    }
  }

  private static class DeviceTupleScheme extends TupleScheme<Device> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Device struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUdid()) {
        optionals.set(0);
      }
      if (struct.isSetFriendlyname()) {
        optionals.set(1);
      }
      if (struct.isSetSerialnum()) {
        optionals.set(2);
      }
      if (struct.isSetManidate()) {
        optionals.set(3);
      }
      if (struct.isSetL()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetUdid()) {
        oprot.writeString(struct.udid);
      }
      if (struct.isSetFriendlyname()) {
        oprot.writeString(struct.friendlyname);
      }
      if (struct.isSetSerialnum()) {
        oprot.writeI32(struct.serialnum);
      }
      if (struct.isSetManidate()) {
        oprot.writeString(struct.manidate);
      }
      if (struct.isSetL()) {
        {
          oprot.writeI32(struct.l.size());
          for (String _iter4 : struct.l)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Device struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.udid = iprot.readString();
        struct.setUdidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.friendlyname = iprot.readString();
        struct.setFriendlynameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.serialnum = iprot.readI32();
        struct.setSerialnumIsSet(true);
      }
      if (incoming.get(3)) {
        struct.manidate = iprot.readString();
        struct.setManidateIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.l = new ArrayList<String>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            String _elem7;
            _elem7 = iprot.readString();
            struct.l.add(_elem7);
          }
        }
        struct.setLIsSet(true);
      }
    }
  }

}
