/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.I4chfails;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class I4chfailsRecord extends UpdatableRecordImpl<I4chfailsRecord> implements Record6<UUID, String, String, String, Integer, Boolean> {

    private static final long serialVersionUID = 742440543;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails.i4chref</code>.
     */
    public void setI4chref(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails.i4chref</code>.
     */
    public String getI4chref() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails.ctref</code>.
     */
    public void setCtref(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails.ctref</code>.
     */
    public String getCtref() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails.clientname</code>.
     */
    public void setClientname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails.clientname</code>.
     */
    public String getClientname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails.days</code>.
     */
    public void setDays(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails.days</code>.
     */
    public Integer getDays() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails.isvoid</code>.
     */
    public void setIsvoid(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails.isvoid</code>.
     */
    public Boolean getIsvoid() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, String, String, String, Integer, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, String, String, String, Integer, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return I4chfails.I4CHFAILS.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return I4chfails.I4CHFAILS.I4CHREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return I4chfails.I4CHFAILS.CTREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return I4chfails.I4CHFAILS.CLIENTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return I4chfails.I4CHFAILS.DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return I4chfails.I4CHFAILS.ISVOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getI4chref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCtref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getClientname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getIsvoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getI4chref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCtref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getClientname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getIsvoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfailsRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfailsRecord value2(String value) {
        setI4chref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfailsRecord value3(String value) {
        setCtref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfailsRecord value4(String value) {
        setClientname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfailsRecord value5(Integer value) {
        setDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfailsRecord value6(Boolean value) {
        setIsvoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfailsRecord values(UUID value1, String value2, String value3, String value4, Integer value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached I4chfailsRecord
     */
    public I4chfailsRecord() {
        super(I4chfails.I4CHFAILS);
    }

    /**
     * Create a detached, initialised I4chfailsRecord
     */
    public I4chfailsRecord(UUID guid, String i4chref, String ctref, String clientname, Integer days, Boolean isvoid) {
        super(I4chfails.I4CHFAILS);

        set(0, guid);
        set(1, i4chref);
        set(2, ctref);
        set(3, clientname);
        set(4, days);
        set(5, isvoid);
    }
}
