/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CarAgentGroupRates;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class CarAgentGroupRatesRecord extends UpdatableRecordImpl<CarAgentGroupRatesRecord> implements Record7<String, String, String, Integer, Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = -15014181;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Group_ID</code>.
     */
    public void setGroupId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Group_ID</code>.
     */
    public String getGroupId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Country_ID</code>.
     */
    public void setCountryId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Country_ID</code>.
     */
    public String getCountryId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Season_ID</code>.
     */
    public void setSeasonId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Season_ID</code>.
     */
    public String getSeasonId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Days_From</code>.
     */
    public void setDaysFrom(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Days_From</code>.
     */
    public Integer getDaysFrom() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Days_To</code>.
     */
    public void setDaysTo(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Days_To</code>.
     */
    public Integer getDaysTo() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Car_Agent_ID</code>.
     */
    public void setCarAgentId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Car_Agent_ID</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Rate</code>.
     */
    public void setRate(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Group_Rates.Rate</code>.
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record5<String, String, String, Integer, Integer> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Integer, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Integer, Integer, Integer, BigDecimal> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CarAgentGroupRates.CAR_AGENT_GROUP_RATES.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CarAgentGroupRates.CAR_AGENT_GROUP_RATES.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CarAgentGroupRates.CAR_AGENT_GROUP_RATES.SEASON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CarAgentGroupRates.CAR_AGENT_GROUP_RATES.DAYS_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CarAgentGroupRates.CAR_AGENT_GROUP_RATES.DAYS_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CarAgentGroupRates.CAR_AGENT_GROUP_RATES.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return CarAgentGroupRates.CAR_AGENT_GROUP_RATES.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSeasonId();
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
    public Integer component5() {
        return getDaysTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCarAgentId();
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
    public String value1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSeasonId();
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
    public Integer value5() {
        return getDaysTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCarAgentId();
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
    public CarAgentGroupRatesRecord value1(String value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentGroupRatesRecord value2(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentGroupRatesRecord value3(String value) {
        setSeasonId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentGroupRatesRecord value4(Integer value) {
        setDaysFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentGroupRatesRecord value5(Integer value) {
        setDaysTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentGroupRatesRecord value6(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentGroupRatesRecord value7(BigDecimal value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentGroupRatesRecord values(String value1, String value2, String value3, Integer value4, Integer value5, Integer value6, BigDecimal value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarAgentGroupRatesRecord
     */
    public CarAgentGroupRatesRecord() {
        super(CarAgentGroupRates.CAR_AGENT_GROUP_RATES);
    }

    /**
     * Create a detached, initialised CarAgentGroupRatesRecord
     */
    public CarAgentGroupRatesRecord(String groupId, String countryId, String seasonId, Integer daysFrom, Integer daysTo, Integer carAgentId, BigDecimal rate) {
        super(CarAgentGroupRates.CAR_AGENT_GROUP_RATES);

        set(0, groupId);
        set(1, countryId);
        set(2, seasonId);
        set(3, daysFrom);
        set(4, daysTo);
        set(5, carAgentId);
        set(6, rate);
    }
}
