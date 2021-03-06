/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Vehaveragepricecountry;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class VehaveragepricecountryRecord extends TableRecordImpl<VehaveragepricecountryRecord> implements Record8<Integer, String, String, Timestamp, Integer, String, Integer, BigDecimal> {

    private static final long serialVersionUID = 1647535298;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.countryCode</code>.
     */
    public void setCountrycode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.countryCode</code>.
     */
    public String getCountrycode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.carType</code>.
     */
    public void setCartype(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.carType</code>.
     */
    public String getCartype() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.pickUpDate</code>.
     */
    public void setPickupdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.pickUpDate</code>.
     */
    public Timestamp getPickupdate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.duration</code>.
     */
    public void setDuration(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.duration</code>.
     */
    public Integer getDuration() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.currencyCode</code>.
     */
    public void setCurrencycode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.currencyCode</code>.
     */
    public String getCurrencycode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.resultsCount</code>.
     */
    public void setResultscount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.resultsCount</code>.
     */
    public Integer getResultscount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.averagePrice</code>.
     */
    public void setAverageprice(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.averagePrice</code>.
     */
    public BigDecimal getAverageprice() {
        return (BigDecimal) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Timestamp, Integer, String, Integer, BigDecimal> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Timestamp, Integer, String, Integer, BigDecimal> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY.COUNTRYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY.CARTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY.PICKUPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY.CURRENCYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY.RESULTSCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY.AVERAGEPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCountrycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCartype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getPickupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCurrencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getResultscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getAverageprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCountrycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCartype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getPickupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCurrencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getResultscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getAverageprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehaveragepricecountryRecord value1(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehaveragepricecountryRecord value2(String value) {
        setCountrycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehaveragepricecountryRecord value3(String value) {
        setCartype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehaveragepricecountryRecord value4(Timestamp value) {
        setPickupdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehaveragepricecountryRecord value5(Integer value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehaveragepricecountryRecord value6(String value) {
        setCurrencycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehaveragepricecountryRecord value7(Integer value) {
        setResultscount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehaveragepricecountryRecord value8(BigDecimal value) {
        setAverageprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehaveragepricecountryRecord values(Integer value1, String value2, String value3, Timestamp value4, Integer value5, String value6, Integer value7, BigDecimal value8) {
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
     * Create a detached VehaveragepricecountryRecord
     */
    public VehaveragepricecountryRecord() {
        super(Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY);
    }

    /**
     * Create a detached, initialised VehaveragepricecountryRecord
     */
    public VehaveragepricecountryRecord(Integer parentId, String countrycode, String cartype, Timestamp pickupdate, Integer duration, String currencycode, Integer resultscount, BigDecimal averageprice) {
        super(Vehaveragepricecountry.VEHAVERAGEPRICECOUNTRY);

        set(0, parentId);
        set(1, countrycode);
        set(2, cartype);
        set(3, pickupdate);
        set(4, duration);
        set(5, currencycode);
        set(6, resultscount);
        set(7, averageprice);
    }
}
