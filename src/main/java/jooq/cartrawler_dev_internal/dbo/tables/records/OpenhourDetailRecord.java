/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.OpenhourDetail;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class OpenhourDetailRecord extends UpdatableRecordImpl<OpenhourDetailRecord> implements Record12<UUID, Integer, String, Short, Short, BigDecimal, String, Boolean, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = -1145216443;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.openhour_id</code>.
     */
    public void setOpenhourId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.openhour_id</code>.
     */
    public Integer getOpenhourId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.min_from</code>.
     */
    public void setMinFrom(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.min_from</code>.
     */
    public Short getMinFrom() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.min_to</code>.
     */
    public void setMinTo(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.min_to</code>.
     */
    public Short getMinTo() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.currency</code>.
     */
    public void setCurrency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.currency</code>.
     */
    public String getCurrency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.free</code>.
     */
    public void setFree(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.free</code>.
     */
    public Boolean getFree() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.in_rate</code>.
     */
    public void setInRate(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.in_rate</code>.
     */
    public Boolean getInRate() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.payable_at_counter</code>.
     */
    public void setPayableAtCounter(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.payable_at_counter</code>.
     */
    public Boolean getPayableAtCounter() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.on_request</code>.
     */
    public void setOnRequest(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.on_request</code>.
     */
    public Boolean getOnRequest() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.openhour_detail.tax_exclusive</code>.
     */
    public void setTaxExclusive(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.openhour_detail.tax_exclusive</code>.
     */
    public Boolean getTaxExclusive() {
        return (Boolean) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<UUID, Integer, String, Short, Short, BigDecimal, String, Boolean, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<UUID, Integer, String, Short, Short, BigDecimal, String, Boolean, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return OpenhourDetail.OPENHOUR_DETAIL.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OpenhourDetail.OPENHOUR_DETAIL.OPENHOUR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OpenhourDetail.OPENHOUR_DETAIL.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return OpenhourDetail.OPENHOUR_DETAIL.MIN_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return OpenhourDetail.OPENHOUR_DETAIL.MIN_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return OpenhourDetail.OPENHOUR_DETAIL.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return OpenhourDetail.OPENHOUR_DETAIL.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return OpenhourDetail.OPENHOUR_DETAIL.FREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return OpenhourDetail.OPENHOUR_DETAIL.IN_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return OpenhourDetail.OPENHOUR_DETAIL.PAYABLE_AT_COUNTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return OpenhourDetail.OPENHOUR_DETAIL.ON_REQUEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return OpenhourDetail.OPENHOUR_DETAIL.TAX_EXCLUSIVE;
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
        return getOpenhourId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getMinFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getMinTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getFree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getInRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getPayableAtCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getOnRequest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getTaxExclusive();
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
        return getOpenhourId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getMinFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getMinTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getFree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getInRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getPayableAtCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getOnRequest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getTaxExclusive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value2(Integer value) {
        setOpenhourId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value4(Short value) {
        setMinFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value5(Short value) {
        setMinTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value6(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value7(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value8(Boolean value) {
        setFree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value9(Boolean value) {
        setInRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value10(Boolean value) {
        setPayableAtCounter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value11(Boolean value) {
        setOnRequest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord value12(Boolean value) {
        setTaxExclusive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpenhourDetailRecord values(UUID value1, Integer value2, String value3, Short value4, Short value5, BigDecimal value6, String value7, Boolean value8, Boolean value9, Boolean value10, Boolean value11, Boolean value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OpenhourDetailRecord
     */
    public OpenhourDetailRecord() {
        super(OpenhourDetail.OPENHOUR_DETAIL);
    }

    /**
     * Create a detached, initialised OpenhourDetailRecord
     */
    public OpenhourDetailRecord(UUID guid, Integer openhourId, String type, Short minFrom, Short minTo, BigDecimal amount, String currency, Boolean free, Boolean inRate, Boolean payableAtCounter, Boolean onRequest, Boolean taxExclusive) {
        super(OpenhourDetail.OPENHOUR_DETAIL);

        set(0, guid);
        set(1, openhourId);
        set(2, type);
        set(3, minFrom);
        set(4, minTo);
        set(5, amount);
        set(6, currency);
        set(7, free);
        set(8, inRate);
        set(9, payableAtCounter);
        set(10, onRequest);
        set(11, taxExclusive);
    }
}
