/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.NewCalendar;

import org.jooq.Field;
import org.jooq.Record1;
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
public class NewCalendarRecord extends UpdatableRecordImpl<NewCalendarRecord> implements Record7<Integer, Integer, Integer, String, Integer, String, String> {

    private static final long serialVersionUID = -1655446170;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.New_Calendar.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.New_Calendar.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.New_Calendar.cal_day</code>.
     */
    public void setCalDay(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.New_Calendar.cal_day</code>.
     */
    public Integer getCalDay() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.New_Calendar.cal_month</code>.
     */
    public void setCalMonth(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.New_Calendar.cal_month</code>.
     */
    public Integer getCalMonth() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.New_Calendar.season_id</code>.
     */
    public void setSeasonId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.New_Calendar.season_id</code>.
     */
    public String getSeasonId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.New_Calendar.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.New_Calendar.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.New_Calendar.group_id</code>.
     */
    public void setGroupId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.New_Calendar.group_id</code>.
     */
    public String getGroupId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.New_Calendar.country_id</code>.
     */
    public void setCountryId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.New_Calendar.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, String, Integer, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, String, Integer, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return NewCalendar.NEW_CALENDAR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return NewCalendar.NEW_CALENDAR.CAL_DAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return NewCalendar.NEW_CALENDAR.CAL_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return NewCalendar.NEW_CALENDAR.SEASON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return NewCalendar.NEW_CALENDAR.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return NewCalendar.NEW_CALENDAR.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return NewCalendar.NEW_CALENDAR.COUNTRY_ID;
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
        return getCalDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCalMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSeasonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCountryId();
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
        return getCalDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCalMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSeasonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewCalendarRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewCalendarRecord value2(Integer value) {
        setCalDay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewCalendarRecord value3(Integer value) {
        setCalMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewCalendarRecord value4(String value) {
        setSeasonId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewCalendarRecord value5(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewCalendarRecord value6(String value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewCalendarRecord value7(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewCalendarRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5, String value6, String value7) {
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
     * Create a detached NewCalendarRecord
     */
    public NewCalendarRecord() {
        super(NewCalendar.NEW_CALENDAR);
    }

    /**
     * Create a detached, initialised NewCalendarRecord
     */
    public NewCalendarRecord(Integer id, Integer calDay, Integer calMonth, String seasonId, Integer carAgentId, String groupId, String countryId) {
        super(NewCalendar.NEW_CALENDAR);

        set(0, id);
        set(1, calDay);
        set(2, calMonth);
        set(3, seasonId);
        set(4, carAgentId);
        set(5, groupId);
        set(6, countryId);
    }
}
