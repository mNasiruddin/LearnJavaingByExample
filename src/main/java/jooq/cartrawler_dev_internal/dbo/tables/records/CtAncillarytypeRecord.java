/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CtAncillarytype;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CtAncillarytypeRecord extends UpdatableRecordImpl<CtAncillarytypeRecord> implements Record7<Long, Long, Long, String, byte[], byte[], Integer> {

    private static final long serialVersionUID = -187298479;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_VERSION</code>.
     */
    public void setSysChangeVersion(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_VERSION</code>.
     */
    public Long getSysChangeVersion() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public void setSysChangeCreationVersion(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public Long getSysChangeCreationVersion() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_OPERATION</code>.
     */
    public void setSysChangeOperation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_OPERATION</code>.
     */
    public String getSysChangeOperation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_COLUMNS</code>.
     */
    public void setSysChangeColumns(byte... value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_COLUMNS</code>.
     */
    public byte[] getSysChangeColumns() {
        return (byte[]) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_CONTEXT</code>.
     */
    public void setSysChangeContext(byte... value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.SYS_CHANGE_CONTEXT</code>.
     */
    public byte[] getSysChangeContext() {
        return (byte[]) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.pk_id</code>.
     */
    public void setPkId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CT_AncillaryType.pk_id</code>.
     */
    public Integer getPkId() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
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
        return CtAncillarytype.CT_ANCILLARYTYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return CtAncillarytype.CT_ANCILLARYTYPE.SYS_CHANGE_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return CtAncillarytype.CT_ANCILLARYTYPE.SYS_CHANGE_CREATION_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CtAncillarytype.CT_ANCILLARYTYPE.SYS_CHANGE_OPERATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field5() {
        return CtAncillarytype.CT_ANCILLARYTYPE.SYS_CHANGE_COLUMNS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field6() {
        return CtAncillarytype.CT_ANCILLARYTYPE.SYS_CHANGE_CONTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CtAncillarytype.CT_ANCILLARYTYPE.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
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
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
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
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtAncillarytypeRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtAncillarytypeRecord value2(Long value) {
        setSysChangeVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtAncillarytypeRecord value3(Long value) {
        setSysChangeCreationVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtAncillarytypeRecord value4(String value) {
        setSysChangeOperation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtAncillarytypeRecord value5(byte... value) {
        setSysChangeColumns(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtAncillarytypeRecord value6(byte... value) {
        setSysChangeContext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtAncillarytypeRecord value7(Integer value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtAncillarytypeRecord values(Long value1, Long value2, Long value3, String value4, byte[] value5, byte[] value6, Integer value7) {
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
     * Create a detached CtAncillarytypeRecord
     */
    public CtAncillarytypeRecord() {
        super(CtAncillarytype.CT_ANCILLARYTYPE);
    }

    /**
     * Create a detached, initialised CtAncillarytypeRecord
     */
    public CtAncillarytypeRecord(Long id, Long sysChangeVersion, Long sysChangeCreationVersion, String sysChangeOperation, byte[] sysChangeColumns, byte[] sysChangeContext, Integer pkId) {
        super(CtAncillarytype.CT_ANCILLARYTYPE);

        set(0, id);
        set(1, sysChangeVersion);
        set(2, sysChangeCreationVersion);
        set(3, sysChangeOperation);
        set(4, sysChangeColumns);
        set(5, sysChangeContext);
        set(6, pkId);
    }
}
