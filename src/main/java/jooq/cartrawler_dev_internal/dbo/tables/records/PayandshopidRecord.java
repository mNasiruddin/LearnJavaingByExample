/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Payandshopid;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class PayandshopidRecord extends UpdatableRecordImpl<PayandshopidRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -730748941;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payandshopid.payandshop_id</code>.
     */
    public void setPayandshopId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payandshopid.payandshop_id</code>.
     */
    public Integer getPayandshopId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payandshopid.reservation_id</code>.
     */
    public void setReservationId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payandshopid.reservation_id</code>.
     */
    public String getReservationId() {
        return (String) get(1);
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
        return Payandshopid.PAYANDSHOPID.PAYANDSHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Payandshopid.PAYANDSHOPID.RESERVATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPayandshopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getReservationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPayandshopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getReservationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayandshopidRecord value1(Integer value) {
        setPayandshopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayandshopidRecord value2(String value) {
        setReservationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayandshopidRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PayandshopidRecord
     */
    public PayandshopidRecord() {
        super(Payandshopid.PAYANDSHOPID);
    }

    /**
     * Create a detached, initialised PayandshopidRecord
     */
    public PayandshopidRecord(Integer payandshopId, String reservationId) {
        super(Payandshopid.PAYANDSHOPID);

        set(0, payandshopId);
        set(1, reservationId);
    }
}
