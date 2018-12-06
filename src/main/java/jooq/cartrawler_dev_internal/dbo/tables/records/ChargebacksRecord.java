/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Chargebacks;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class ChargebacksRecord extends UpdatableRecordImpl<ChargebacksRecord> implements Record5<UUID, Integer, Integer, String, Timestamp> {

    private static final long serialVersionUID = 1678930299;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.chargebacks.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.chargebacks.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.chargebacks.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.chargebacks.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.chargebacks.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.chargebacks.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.chargebacks.remarks</code>.
     */
    public void setRemarks(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.chargebacks.remarks</code>.
     */
    public String getRemarks() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.chargebacks.createDate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.chargebacks.createDate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, Integer, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, Integer, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Chargebacks.CHARGEBACKS.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Chargebacks.CHARGEBACKS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Chargebacks.CHARGEBACKS.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Chargebacks.CHARGEBACKS.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Chargebacks.CHARGEBACKS.CREATEDATE;
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
    public Integer component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedate();
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
    public Integer value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargebacksRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargebacksRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargebacksRecord value3(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargebacksRecord value4(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargebacksRecord value5(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargebacksRecord values(UUID value1, Integer value2, Integer value3, String value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChargebacksRecord
     */
    public ChargebacksRecord() {
        super(Chargebacks.CHARGEBACKS);
    }

    /**
     * Create a detached, initialised ChargebacksRecord
     */
    public ChargebacksRecord(UUID guid, Integer id, Integer fkReservation, String remarks, Timestamp createdate) {
        super(Chargebacks.CHARGEBACKS);

        set(0, guid);
        set(1, id);
        set(2, fkReservation);
        set(3, remarks);
        set(4, createdate);
    }
}
