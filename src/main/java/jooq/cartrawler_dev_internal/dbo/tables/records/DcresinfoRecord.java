/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Dcresinfo;

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
public class DcresinfoRecord extends UpdatableRecordImpl<DcresinfoRecord> implements Record4<Integer, Integer, String, String> {

    private static final long serialVersionUID = 176655490;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DCResInfo.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DCResInfo.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DCResInfo.plan_id</code>.
     */
    public void setPlanId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DCResInfo.plan_id</code>.
     */
    public Integer getPlanId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DCResInfo.plan_ids</code>.
     */
    public void setPlanIds(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DCResInfo.plan_ids</code>.
     */
    public String getPlanIds() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DCResInfo.contractId</code>.
     */
    public void setContractid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DCResInfo.contractId</code>.
     */
    public String getContractid() {
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
        return Dcresinfo.DCRESINFO.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Dcresinfo.DCRESINFO.PLAN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Dcresinfo.DCRESINFO.PLAN_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Dcresinfo.DCRESINFO.CONTRACTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getPlanId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPlanIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getContractid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getPlanId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPlanIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getContractid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DcresinfoRecord value1(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DcresinfoRecord value2(Integer value) {
        setPlanId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DcresinfoRecord value3(String value) {
        setPlanIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DcresinfoRecord value4(String value) {
        setContractid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DcresinfoRecord values(Integer value1, Integer value2, String value3, String value4) {
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
     * Create a detached DcresinfoRecord
     */
    public DcresinfoRecord() {
        super(Dcresinfo.DCRESINFO);
    }

    /**
     * Create a detached, initialised DcresinfoRecord
     */
    public DcresinfoRecord(Integer fkReservation, Integer planId, String planIds, String contractid) {
        super(Dcresinfo.DCRESINFO);

        set(0, fkReservation);
        set(1, planId);
        set(2, planIds);
        set(3, contractid);
    }
}
