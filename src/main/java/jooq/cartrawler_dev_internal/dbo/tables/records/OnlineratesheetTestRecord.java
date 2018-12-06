/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.OnlineratesheetTest;

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
public class OnlineratesheetTestRecord extends UpdatableRecordImpl<OnlineratesheetTestRecord> implements Record13<Long, Long, Long, String, String, String, Long, Long, Long, Long, Short, String, String> {

    private static final long serialVersionUID = 774049140;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.rate_id</code>.
     */
    public void setRateId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.rate_id</code>.
     */
    public Long getRateId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.car_agent_id</code>.
     */
    public void setCarAgentId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.car_agent_id</code>.
     */
    public Long getCarAgentId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.SIPP</code>.
     */
    public void setSipp(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.SIPP</code>.
     */
    public String getSipp() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.rate_code_str</code>.
     */
    public void setRateCodeStr(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.rate_code_str</code>.
     */
    public String getRateCodeStr() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.locations</code>.
     */
    public void setLocations(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.locations</code>.
     */
    public String getLocations() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.booking_from</code>.
     */
    public void setBookingFrom(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.booking_from</code>.
     */
    public Long getBookingFrom() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.booking_to</code>.
     */
    public void setBookingTo(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.booking_to</code>.
     */
    public Long getBookingTo() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.pickup_from</code>.
     */
    public void setPickupFrom(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.pickup_from</code>.
     */
    public Long getPickupFrom() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.pickup_to</code>.
     */
    public void setPickupTo(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.pickup_to</code>.
     */
    public Long getPickupTo() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.priority</code>.
     */
    public void setPriority(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.priority</code>.
     */
    public Short getPriority() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.rate_match</code>.
     */
    public void setRateMatch(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.rate_match</code>.
     */
    public String getRateMatch() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.restriction</code>.
     */
    public void setRestriction(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.restriction</code>.
     */
    public String getRestriction() {
        return (String) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, Long, String, String, String, Long, Long, Long, Long, Short, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, Long, String, String, String, Long, Long, Long, Long, Short, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.RATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.SIPP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.RATE_CODE_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.LOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.BOOKING_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.BOOKING_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.PICKUP_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.PICKUP_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.RATE_MATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return OnlineratesheetTest.ONLINERATESHEET_TEST.RESTRICTION;
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
    public Long component3() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRateCodeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getBookingFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getBookingTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getPickupFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getPickupTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component11() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getRateMatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getRestriction();
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
    public Long value3() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRateCodeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getBookingFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getBookingTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getPickupFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getPickupTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value11() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRateMatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getRestriction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value2(Long value) {
        setRateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value3(Long value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value4(String value) {
        setSipp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value5(String value) {
        setRateCodeStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value6(String value) {
        setLocations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value7(Long value) {
        setBookingFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value8(Long value) {
        setBookingTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value9(Long value) {
        setPickupFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value10(Long value) {
        setPickupTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value11(Short value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value12(String value) {
        setRateMatch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord value13(String value) {
        setRestriction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTestRecord values(Long value1, Long value2, Long value3, String value4, String value5, String value6, Long value7, Long value8, Long value9, Long value10, Short value11, String value12, String value13) {
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
     * Create a detached OnlineratesheetTestRecord
     */
    public OnlineratesheetTestRecord() {
        super(OnlineratesheetTest.ONLINERATESHEET_TEST);
    }

    /**
     * Create a detached, initialised OnlineratesheetTestRecord
     */
    public OnlineratesheetTestRecord(Long id, Long rateId, Long carAgentId, String sipp, String rateCodeStr, String locations, Long bookingFrom, Long bookingTo, Long pickupFrom, Long pickupTo, Short priority, String rateMatch, String restriction) {
        super(OnlineratesheetTest.ONLINERATESHEET_TEST);

        set(0, id);
        set(1, rateId);
        set(2, carAgentId);
        set(3, sipp);
        set(4, rateCodeStr);
        set(5, locations);
        set(6, bookingFrom);
        set(7, bookingTo);
        set(8, pickupFrom);
        set(9, pickupTo);
        set(10, priority);
        set(11, rateMatch);
        set(12, restriction);
    }
}
