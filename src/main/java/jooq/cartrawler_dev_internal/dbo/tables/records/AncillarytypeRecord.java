/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Ancillarytype;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class AncillarytypeRecord extends UpdatableRecordImpl<AncillarytypeRecord> implements Record4<Integer, Integer, String, String> {

    private static final long serialVersionUID = -689579000;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AncillaryType.pk_id</code>.
     */
    public void setPkId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AncillaryType.pk_id</code>.
     */
    public Integer getPkId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AncillaryType.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AncillaryType.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AncillaryType.type_name</code>.
     */
    public void setTypeName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AncillaryType.type_name</code>.
     */
    public String getTypeName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AncillaryType.type_code</code>.
     */
    public void setTypeCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AncillaryType.type_code</code>.
     */
    public String getTypeCode() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Ancillarytype.ANCILLARYTYPE.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Ancillarytype.ANCILLARYTYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Ancillarytype.ANCILLARYTYPE.TYPE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Ancillarytype.ANCILLARYTYPE.TYPE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AncillarytypeRecord value1(Integer value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AncillarytypeRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AncillarytypeRecord value3(String value) {
        setTypeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AncillarytypeRecord value4(String value) {
        setTypeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AncillarytypeRecord values(Integer value1, Integer value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AncillarytypeRecord
     */
    public AncillarytypeRecord() {
        super(Ancillarytype.ANCILLARYTYPE);
    }

    /**
     * Create a detached, initialised AncillarytypeRecord
     */
    public AncillarytypeRecord(Integer pkId, Integer id, String typeName, String typeCode) {
        super(Ancillarytype.ANCILLARYTYPE);

        set(0, pkId);
        set(1, id);
        set(2, typeName);
        set(3, typeCode);
    }
}
