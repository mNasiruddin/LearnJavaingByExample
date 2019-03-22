/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Onlineratesheetitem;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class OnlineratesheetitemRecord extends UpdatableRecordImpl<OnlineratesheetitemRecord> implements Record8<Long, Long, Boolean, String, Short, Short, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -1539924440;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.rate_id</code>.
     */
    public void setRateId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.rate_id</code>.
     */
    public Long getRateId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.package</code>.
     */
    public void setPackage(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.package</code>.
     */
    public Boolean getPackage() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.weekend</code>.
     */
    public void setWeekend(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.weekend</code>.
     */
    public String getWeekend() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.from_days</code>.
     */
    public void setFromDays(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.from_days</code>.
     */
    public Short getFromDays() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.to_days</code>.
     */
    public void setToDays(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.to_days</code>.
     */
    public Short getToDays() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.rate</code>.
     */
    public void setRate(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.rate</code>.
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.commissionable_amount</code>.
     */
    public void setCommissionableAmount(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheetItem.commissionable_amount</code>.
     */
    public BigDecimal getCommissionableAmount() {
        return (BigDecimal) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Boolean, String, Short, Short, BigDecimal, BigDecimal> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Boolean, String, Short, Short, BigDecimal, BigDecimal> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Onlineratesheetitem.ONLINERATESHEETITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Onlineratesheetitem.ONLINERATESHEETITEM.RATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Onlineratesheetitem.ONLINERATESHEETITEM.PACKAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Onlineratesheetitem.ONLINERATESHEETITEM.WEEKEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Onlineratesheetitem.ONLINERATESHEETITEM.FROM_DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Onlineratesheetitem.ONLINERATESHEETITEM.TO_DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Onlineratesheetitem.ONLINERATESHEETITEM.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return Onlineratesheetitem.ONLINERATESHEETITEM.COMMISSIONABLE_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getRateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getPackage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getWeekend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getFromDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getToDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getCommissionableAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getRateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getPackage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getWeekend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getFromDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getToDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getCommissionableAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetitemRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetitemRecord value2(Long value) {
        setRateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetitemRecord value3(Boolean value) {
        setPackage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetitemRecord value4(String value) {
        setWeekend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetitemRecord value5(Short value) {
        setFromDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetitemRecord value6(Short value) {
        setToDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetitemRecord value7(BigDecimal value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetitemRecord value8(BigDecimal value) {
        setCommissionableAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetitemRecord values(Long value1, Long value2, Boolean value3, String value4, Short value5, Short value6, BigDecimal value7, BigDecimal value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OnlineratesheetitemRecord
     */
    public OnlineratesheetitemRecord() {
        super(Onlineratesheetitem.ONLINERATESHEETITEM);
    }

    /**
     * Create a detached, initialised OnlineratesheetitemRecord
     */
    public OnlineratesheetitemRecord(Long id, Long rateId, Boolean package_, String weekend, Short fromDays, Short toDays, BigDecimal rate, BigDecimal commissionableAmount) {
        super(Onlineratesheetitem.ONLINERATESHEETITEM);

        set(0, id);
        set(1, rateId);
        set(2, package_);
        set(3, weekend);
        set(4, fromDays);
        set(5, toDays);
        set(6, rate);
        set(7, commissionableAmount);
    }
}