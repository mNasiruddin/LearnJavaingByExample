/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Marketplace;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class MarketplaceRecord extends UpdatableRecordImpl<MarketplaceRecord> implements Record19<Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp, String, String, Integer, Integer, Boolean, String, String, Integer, BigDecimal, Timestamp, Integer, Boolean> {

    private static final long serialVersionUID = -1652744528;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.car_agent_location_id</code>.
     */
    public void setCarAgentLocationId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.car_agent_location_id</code>.
     */
    public Integer getCarAgentLocationId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.active_from</code>.
     */
    public void setActiveFrom(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.active_from</code>.
     */
    public Timestamp getActiveFrom() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.active_to</code>.
     */
    public void setActiveTo(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.active_to</code>.
     */
    public Timestamp getActiveTo() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.pickupFrom</code>.
     */
    public void setPickupfrom(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.pickupFrom</code>.
     */
    public Timestamp getPickupfrom() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.pickupTo</code>.
     */
    public void setPickupto(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.pickupTo</code>.
     */
    public Timestamp getPickupto() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.supplierGroup</code>.
     */
    public void setSuppliergroup(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.supplierGroup</code>.
     */
    public String getSuppliergroup() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.mappedSIPP</code>.
     */
    public void setMappedsipp(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.mappedSIPP</code>.
     */
    public String getMappedsipp() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.rentalDaysRangeStart</code>.
     */
    public void setRentaldaysrangestart(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.rentalDaysRangeStart</code>.
     */
    public Integer getRentaldaysrangestart() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.rentalDaysRangeEnd</code>.
     */
    public void setRentaldaysrangeend(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.rentalDaysRangeEnd</code>.
     */
    public Integer getRentaldaysrangeend() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.exclusive</code>.
     */
    public void setExclusive(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.exclusive</code>.
     */
    public Boolean getExclusive() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.market_rate_email</code>.
     */
    public void setMarketRateEmail(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.market_rate_email</code>.
     */
    public String getMarketRateEmail() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.SMS</code>.
     */
    public void setSms(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.SMS</code>.
     */
    public String getSms() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.maxBookings</code>.
     */
    public void setMaxbookings(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.maxBookings</code>.
     */
    public Integer getMaxbookings() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.dailyBaseRate</code>.
     */
    public void setDailybaserate(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.dailyBaseRate</code>.
     */
    public BigDecimal getDailybaserate() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.createDate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.createDate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.bookingsCount</code>.
     */
    public void setBookingscount(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.bookingsCount</code>.
     */
    public Integer getBookingscount() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlace.active</code>.
     */
    public void setActive(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlace.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp, String, String, Integer, Integer, Boolean, String, String, Integer, BigDecimal, Timestamp, Integer, Boolean> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp, String, String, Integer, Integer, Boolean, String, String, Integer, BigDecimal, Timestamp, Integer, Boolean> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Marketplace.MARKETPLACE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Marketplace.MARKETPLACE.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Marketplace.MARKETPLACE.CAR_AGENT_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Marketplace.MARKETPLACE.ACTIVE_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Marketplace.MARKETPLACE.ACTIVE_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Marketplace.MARKETPLACE.PICKUPFROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Marketplace.MARKETPLACE.PICKUPTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Marketplace.MARKETPLACE.SUPPLIERGROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Marketplace.MARKETPLACE.MAPPEDSIPP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Marketplace.MARKETPLACE.RENTALDAYSRANGESTART;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Marketplace.MARKETPLACE.RENTALDAYSRANGEEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return Marketplace.MARKETPLACE.EXCLUSIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Marketplace.MARKETPLACE.MARKET_RATE_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Marketplace.MARKETPLACE.SMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return Marketplace.MARKETPLACE.MAXBOOKINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field16() {
        return Marketplace.MARKETPLACE.DAILYBASERATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return Marketplace.MARKETPLACE.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return Marketplace.MARKETPLACE.BOOKINGSCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field19() {
        return Marketplace.MARKETPLACE.ACTIVE;
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
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getActiveFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getActiveTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getPickupfrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getPickupto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSuppliergroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMappedsipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getRentaldaysrangestart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getRentaldaysrangeend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getExclusive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getMarketRateEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getSms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getMaxbookings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component16() {
        return getDailybaserate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getBookingscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component19() {
        return getActive();
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
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getActiveFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getActiveTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getPickupfrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getPickupto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSuppliergroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMappedsipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getRentaldaysrangestart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getRentaldaysrangeend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getExclusive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getMarketRateEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getMaxbookings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value16() {
        return getDailybaserate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getBookingscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value19() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value2(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value3(Integer value) {
        setCarAgentLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value4(Timestamp value) {
        setActiveFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value5(Timestamp value) {
        setActiveTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value6(Timestamp value) {
        setPickupfrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value7(Timestamp value) {
        setPickupto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value8(String value) {
        setSuppliergroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value9(String value) {
        setMappedsipp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value10(Integer value) {
        setRentaldaysrangestart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value11(Integer value) {
        setRentaldaysrangeend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value12(Boolean value) {
        setExclusive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value13(String value) {
        setMarketRateEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value14(String value) {
        setSms(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value15(Integer value) {
        setMaxbookings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value16(BigDecimal value) {
        setDailybaserate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value17(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value18(Integer value) {
        setBookingscount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord value19(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplaceRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5, Timestamp value6, Timestamp value7, String value8, String value9, Integer value10, Integer value11, Boolean value12, String value13, String value14, Integer value15, BigDecimal value16, Timestamp value17, Integer value18, Boolean value19) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MarketplaceRecord
     */
    public MarketplaceRecord() {
        super(Marketplace.MARKETPLACE);
    }

    /**
     * Create a detached, initialised MarketplaceRecord
     */
    public MarketplaceRecord(Integer id, Integer carAgentId, Integer carAgentLocationId, Timestamp activeFrom, Timestamp activeTo, Timestamp pickupfrom, Timestamp pickupto, String suppliergroup, String mappedsipp, Integer rentaldaysrangestart, Integer rentaldaysrangeend, Boolean exclusive, String marketRateEmail, String sms, Integer maxbookings, BigDecimal dailybaserate, Timestamp createdate, Integer bookingscount, Boolean active) {
        super(Marketplace.MARKETPLACE);

        set(0, id);
        set(1, carAgentId);
        set(2, carAgentLocationId);
        set(3, activeFrom);
        set(4, activeTo);
        set(5, pickupfrom);
        set(6, pickupto);
        set(7, suppliergroup);
        set(8, mappedsipp);
        set(9, rentaldaysrangestart);
        set(10, rentaldaysrangeend);
        set(11, exclusive);
        set(12, marketRateEmail);
        set(13, sms);
        set(14, maxbookings);
        set(15, dailybaserate);
        set(16, createdate);
        set(17, bookingscount);
        set(18, active);
    }
}
