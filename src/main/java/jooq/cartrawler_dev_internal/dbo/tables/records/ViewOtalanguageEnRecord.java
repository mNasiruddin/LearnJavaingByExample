/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ViewOtalanguageEn;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class ViewOtalanguageEnRecord extends TableRecordImpl<ViewOtalanguageEnRecord> implements Record3<Integer, String, byte[]> {

    private static final long serialVersionUID = -759562609;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_otalanguage_en.type</code>.
     */
    public void setType(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_otalanguage_en.type</code>.
     */
    public Integer getType() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_otalanguage_en.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_otalanguage_en.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_otalanguage_en.value</code>.
     */
    public void setValue(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_otalanguage_en.value</code>.
     */
    public byte[] getValue() {
        return (byte[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, byte[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewOtalanguageEn.VIEW_OTALANGUAGE_EN.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewOtalanguageEn.VIEW_OTALANGUAGE_EN.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field3() {
        return ViewOtalanguageEn.VIEW_OTALANGUAGE_EN.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component3() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value3() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewOtalanguageEnRecord value1(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewOtalanguageEnRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewOtalanguageEnRecord value3(byte... value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewOtalanguageEnRecord values(Integer value1, String value2, byte[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewOtalanguageEnRecord
     */
    public ViewOtalanguageEnRecord() {
        super(ViewOtalanguageEn.VIEW_OTALANGUAGE_EN);
    }

    /**
     * Create a detached, initialised ViewOtalanguageEnRecord
     */
    public ViewOtalanguageEnRecord(Integer type, String name, byte[] value) {
        super(ViewOtalanguageEn.VIEW_OTALANGUAGE_EN);

        set(0, type);
        set(1, name);
        set(2, value);
    }
}
