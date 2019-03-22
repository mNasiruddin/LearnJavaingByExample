/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.AmendReasons;

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
public class AmendReasonsRecord extends UpdatableRecordImpl<AmendReasonsRecord> implements Record4<Integer, String, Timestamp, Boolean> {

    private static final long serialVersionUID = 860429780;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Amend_reasons.amend_id</code>.
     */
    public void setAmendId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Amend_reasons.amend_id</code>.
     */
    public Integer getAmendId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Amend_reasons.amend_name</code>.
     */
    public void setAmendName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Amend_reasons.amend_name</code>.
     */
    public String getAmendName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Amend_reasons.date_added</code>.
     */
    public void setDateAdded(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Amend_reasons.date_added</code>.
     */
    public Timestamp getDateAdded() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Amend_reasons.status</code>.
     */
    public void setStatus(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Amend_reasons.status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(3);
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
    public Row4<Integer, String, Timestamp, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AmendReasons.AMEND_REASONS.AMEND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AmendReasons.AMEND_REASONS.AMEND_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return AmendReasons.AMEND_REASONS.DATE_ADDED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return AmendReasons.AMEND_REASONS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAmendId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAmendName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getDateAdded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAmendId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAmendName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateAdded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmendReasonsRecord value1(Integer value) {
        setAmendId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmendReasonsRecord value2(String value) {
        setAmendName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmendReasonsRecord value3(Timestamp value) {
        setDateAdded(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmendReasonsRecord value4(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmendReasonsRecord values(Integer value1, String value2, Timestamp value3, Boolean value4) {
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
     * Create a detached AmendReasonsRecord
     */
    public AmendReasonsRecord() {
        super(AmendReasons.AMEND_REASONS);
    }

    /**
     * Create a detached, initialised AmendReasonsRecord
     */
    public AmendReasonsRecord(Integer amendId, String amendName, Timestamp dateAdded, Boolean status) {
        super(AmendReasons.AMEND_REASONS);

        set(0, amendId);
        set(1, amendName);
        set(2, dateAdded);
        set(3, status);
    }
}