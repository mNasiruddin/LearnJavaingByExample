/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Otalanguagetypedescription;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class OtalanguagetypedescriptionRecord extends TableRecordImpl<OtalanguagetypedescriptionRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1057597067;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OTALanguageTypeDescription.type_id</code>.
     */
    public void setTypeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OTALanguageTypeDescription.type_id</code>.
     */
    public Integer getTypeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OTALanguageTypeDescription.Description</code>.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OTALanguageTypeDescription.Description</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Otalanguagetypedescription.OTALANGUAGETYPEDESCRIPTION.TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Otalanguagetypedescription.OTALANGUAGETYPEDESCRIPTION.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagetypedescriptionRecord value1(Integer value) {
        setTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagetypedescriptionRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagetypedescriptionRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OtalanguagetypedescriptionRecord
     */
    public OtalanguagetypedescriptionRecord() {
        super(Otalanguagetypedescription.OTALANGUAGETYPEDESCRIPTION);
    }

    /**
     * Create a detached, initialised OtalanguagetypedescriptionRecord
     */
    public OtalanguagetypedescriptionRecord(Integer typeId, String description) {
        super(Otalanguagetypedescription.OTALANGUAGETYPEDESCRIPTION);

        set(0, typeId);
        set(1, description);
    }
}
