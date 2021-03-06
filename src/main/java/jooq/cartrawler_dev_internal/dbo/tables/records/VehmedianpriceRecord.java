/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Vehmedianprice;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class VehmedianpriceRecord extends UpdatableRecordImpl<VehmedianpriceRecord> implements Record13<Integer, Integer, String, String, String, String, Timestamp, Integer, String, BigDecimal, Integer, Timestamp, Integer> {

    private static final long serialVersionUID = -965804789;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.residencyCode</code>.
     */
    public void setResidencycode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.residencyCode</code>.
     */
    public String getResidencycode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.countryCode</code>.
     */
    public void setCountrycode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.countryCode</code>.
     */
    public String getCountrycode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.iataAirportCode</code>.
     */
    public void setIataairportcode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.iataAirportCode</code>.
     */
    public String getIataairportcode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.carType</code>.
     */
    public void setCartype(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.carType</code>.
     */
    public String getCartype() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.pickUpDate</code>.
     */
    public void setPickupdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.pickUpDate</code>.
     */
    public Timestamp getPickupdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.duration</code>.
     */
    public void setDuration(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.duration</code>.
     */
    public Integer getDuration() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.currencyCode</code>.
     */
    public void setCurrencycode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.currencyCode</code>.
     */
    public String getCurrencycode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.medianPrice</code>.
     */
    public void setMedianprice(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.medianPrice</code>.
     */
    public BigDecimal getMedianprice() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.resultsCount</code>.
     */
    public void setResultscount(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.resultsCount</code>.
     */
    public Integer getResultscount() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.dateCreated</code>.
     */
    public void setDatecreated(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.dateCreated</code>.
     */
    public Timestamp getDatecreated() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.client_id_orig</code>.
     */
    public void setClientIdOrig(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VehMedianPrice.client_id_orig</code>.
     */
    public Integer getClientIdOrig() {
        return (Integer) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, String, String, String, String, Timestamp, Integer, String, BigDecimal, Integer, Timestamp, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, String, String, String, String, Timestamp, Integer, String, BigDecimal, Integer, Timestamp, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Vehmedianprice.VEHMEDIANPRICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Vehmedianprice.VEHMEDIANPRICE.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Vehmedianprice.VEHMEDIANPRICE.RESIDENCYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Vehmedianprice.VEHMEDIANPRICE.COUNTRYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Vehmedianprice.VEHMEDIANPRICE.IATAAIRPORTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Vehmedianprice.VEHMEDIANPRICE.CARTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Vehmedianprice.VEHMEDIANPRICE.PICKUPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Vehmedianprice.VEHMEDIANPRICE.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Vehmedianprice.VEHMEDIANPRICE.CURRENCYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return Vehmedianprice.VEHMEDIANPRICE.MEDIANPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Vehmedianprice.VEHMEDIANPRICE.RESULTSCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Vehmedianprice.VEHMEDIANPRICE.DATECREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Vehmedianprice.VEHMEDIANPRICE.CLIENT_ID_ORIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getResidencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCountrycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIataairportcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCartype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getPickupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCurrencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getMedianprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getResultscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getDatecreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getClientIdOrig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getResidencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCountrycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIataairportcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCartype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getPickupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCurrencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getMedianprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getResultscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getDatecreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getClientIdOrig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value2(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value3(String value) {
        setResidencycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value4(String value) {
        setCountrycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value5(String value) {
        setIataairportcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value6(String value) {
        setCartype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value7(Timestamp value) {
        setPickupdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value8(Integer value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value9(String value) {
        setCurrencycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value10(BigDecimal value) {
        setMedianprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value11(Integer value) {
        setResultscount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value12(Timestamp value) {
        setDatecreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord value13(Integer value) {
        setClientIdOrig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehmedianpriceRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, Timestamp value7, Integer value8, String value9, BigDecimal value10, Integer value11, Timestamp value12, Integer value13) {
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
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VehmedianpriceRecord
     */
    public VehmedianpriceRecord() {
        super(Vehmedianprice.VEHMEDIANPRICE);
    }

    /**
     * Create a detached, initialised VehmedianpriceRecord
     */
    public VehmedianpriceRecord(Integer id, Integer clientId, String residencycode, String countrycode, String iataairportcode, String cartype, Timestamp pickupdate, Integer duration, String currencycode, BigDecimal medianprice, Integer resultscount, Timestamp datecreated, Integer clientIdOrig) {
        super(Vehmedianprice.VEHMEDIANPRICE);

        set(0, id);
        set(1, clientId);
        set(2, residencycode);
        set(3, countrycode);
        set(4, iataairportcode);
        set(5, cartype);
        set(6, pickupdate);
        set(7, duration);
        set(8, currencycode);
        set(9, medianprice);
        set(10, resultscount);
        set(11, datecreated);
        set(12, clientIdOrig);
    }
}
