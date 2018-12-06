/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Syncobj_0x4131453644313341;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Syncobj_0x4131453644313341Record extends TableRecordImpl<Syncobj_0x4131453644313341Record> implements Record7<Long, Long, Long, String, byte[], byte[], Integer> {

    private static final long serialVersionUID = -304697343;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.pkid</code>.
     */
    public void setPkid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.pkid</code>.
     */
    public Long getPkid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_VERSION</code>.
     */
    public void setSysChangeVersion(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_VERSION</code>.
     */
    public Long getSysChangeVersion() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public void setSysChangeCreationVersion(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public Long getSysChangeCreationVersion() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_OPERATION</code>.
     */
    public void setSysChangeOperation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_OPERATION</code>.
     */
    public String getSysChangeOperation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_COLUMNS</code>.
     */
    public void setSysChangeColumns(byte... value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_COLUMNS</code>.
     */
    public byte[] getSysChangeColumns() {
        return (byte[]) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_CONTEXT</code>.
     */
    public void setSysChangeContext(byte... value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.SYS_CHANGE_CONTEXT</code>.
     */
    public byte[] getSysChangeContext() {
        return (byte[]) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.id</code>.
     */
    public void setId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4131453644313341.id</code>.
     */
    public Integer getId() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, String, byte[], byte[], Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, String, byte[], byte[], Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Syncobj_0x4131453644313341.SYNCOBJ_0X4131453644313341.PKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Syncobj_0x4131453644313341.SYNCOBJ_0X4131453644313341.SYS_CHANGE_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Syncobj_0x4131453644313341.SYNCOBJ_0X4131453644313341.SYS_CHANGE_CREATION_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Syncobj_0x4131453644313341.SYNCOBJ_0X4131453644313341.SYS_CHANGE_OPERATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field5() {
        return Syncobj_0x4131453644313341.SYNCOBJ_0X4131453644313341.SYS_CHANGE_COLUMNS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field6() {
        return Syncobj_0x4131453644313341.SYNCOBJ_0X4131453644313341.SYS_CHANGE_CONTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Syncobj_0x4131453644313341.SYNCOBJ_0X4131453644313341.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getPkid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getSysChangeVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getSysChangeCreationVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSysChangeOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component5() {
        return getSysChangeColumns();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component6() {
        return getSysChangeContext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPkid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getSysChangeVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getSysChangeCreationVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSysChangeOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value5() {
        return getSysChangeColumns();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value6() {
        return getSysChangeContext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4131453644313341Record value1(Long value) {
        setPkid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4131453644313341Record value2(Long value) {
        setSysChangeVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4131453644313341Record value3(Long value) {
        setSysChangeCreationVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4131453644313341Record value4(String value) {
        setSysChangeOperation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4131453644313341Record value5(byte... value) {
        setSysChangeColumns(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4131453644313341Record value6(byte... value) {
        setSysChangeContext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4131453644313341Record value7(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4131453644313341Record values(Long value1, Long value2, Long value3, String value4, byte[] value5, byte[] value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Syncobj_0x4131453644313341Record
     */
    public Syncobj_0x4131453644313341Record() {
        super(Syncobj_0x4131453644313341.SYNCOBJ_0X4131453644313341);
    }

    /**
     * Create a detached, initialised Syncobj_0x4131453644313341Record
     */
    public Syncobj_0x4131453644313341Record(Long pkid, Long sysChangeVersion, Long sysChangeCreationVersion, String sysChangeOperation, byte[] sysChangeColumns, byte[] sysChangeContext, Integer id) {
        super(Syncobj_0x4131453644313341.SYNCOBJ_0X4131453644313341);

        set(0, pkid);
        set(1, sysChangeVersion);
        set(2, sysChangeCreationVersion);
        set(3, sysChangeOperation);
        set(4, sysChangeColumns);
        set(5, sysChangeContext);
        set(6, id);
    }
}
