/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.DropinRates;

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
public class DropinRatesRecord extends UpdatableRecordImpl<DropinRatesRecord> implements Record5<UUID, Integer, String, Integer, BigDecimal> {

    private static final long serialVersionUID = -307335756;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.Agency_ID</code>.
     */
    public void setAgencyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.Agency_ID</code>.
     */
    public Integer getAgencyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.Group_ID</code>.
     */
    public void setGroupId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.Group_ID</code>.
     */
    public String getGroupId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.Days_From</code>.
     */
    public void setDaysFrom(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.Days_From</code>.
     */
    public Integer getDaysFrom() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.Rate</code>.
     */
    public void setRate(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropIn_Rates.Rate</code>.
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(4);
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
    public Row5<UUID, Integer, String, Integer, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, String, Integer, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return DropinRates.DROPIN_RATES.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DropinRates.DROPIN_RATES.AGENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DropinRates.DROPIN_RATES.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DropinRates.DROPIN_RATES.DAYS_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return DropinRates.DROPIN_RATES.RATE;
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
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDaysFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getRate();
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
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDaysFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropinRatesRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropinRatesRecord value2(Integer value) {
        setAgencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropinRatesRecord value3(String value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropinRatesRecord value4(Integer value) {
        setDaysFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropinRatesRecord value5(BigDecimal value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropinRatesRecord values(UUID value1, Integer value2, String value3, Integer value4, BigDecimal value5) {
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
     * Create a detached DropinRatesRecord
     */
    public DropinRatesRecord() {
        super(DropinRates.DROPIN_RATES);
    }

    /**
     * Create a detached, initialised DropinRatesRecord
     */
    public DropinRatesRecord(UUID guid, Integer agencyId, String groupId, Integer daysFrom, BigDecimal rate) {
        super(DropinRates.DROPIN_RATES);

        set(0, guid);
        set(1, agencyId);
        set(2, groupId);
        set(3, daysFrom);
        set(4, rate);
    }
}
