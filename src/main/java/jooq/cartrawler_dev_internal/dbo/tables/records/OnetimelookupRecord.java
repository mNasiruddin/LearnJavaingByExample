/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Onetimelookup;

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
public class OnetimelookupRecord extends UpdatableRecordImpl<OnetimelookupRecord> implements Record4<Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -1103839213;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OneTimeLookup.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OneTimeLookup.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OneTimeLookup.oneTimeKey</code>.
     */
    public void setOnetimekey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OneTimeLookup.oneTimeKey</code>.
     */
    public String getOnetimekey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OneTimeLookup.oneTimeValue</code>.
     */
    public void setOnetimevalue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OneTimeLookup.oneTimeValue</code>.
     */
    public String getOnetimevalue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OneTimeLookup.expiryDate</code>.
     */
    public void setExpirydate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OneTimeLookup.expiryDate</code>.
     */
    public Timestamp getExpirydate() {
        return (Timestamp) get(3);
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
    public Row4<Integer, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Onetimelookup.ONETIMELOOKUP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Onetimelookup.ONETIMELOOKUP.ONETIMEKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Onetimelookup.ONETIMELOOKUP.ONETIMEVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Onetimelookup.ONETIMELOOKUP.EXPIRYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getOnetimekey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOnetimevalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getExpirydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOnetimekey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOnetimevalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getExpirydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimelookupRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimelookupRecord value2(String value) {
        setOnetimekey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimelookupRecord value3(String value) {
        setOnetimevalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimelookupRecord value4(Timestamp value) {
        setExpirydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimelookupRecord values(Integer value1, String value2, String value3, Timestamp value4) {
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
     * Create a detached OnetimelookupRecord
     */
    public OnetimelookupRecord() {
        super(Onetimelookup.ONETIMELOOKUP);
    }

    /**
     * Create a detached, initialised OnetimelookupRecord
     */
    public OnetimelookupRecord(Integer id, String onetimekey, String onetimevalue, Timestamp expirydate) {
        super(Onetimelookup.ONETIMELOOKUP);

        set(0, id);
        set(1, onetimekey);
        set(2, onetimevalue);
        set(3, expirydate);
    }
}