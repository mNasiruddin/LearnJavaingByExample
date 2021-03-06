/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Channelpricingcalendar;

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
public class ChannelpricingcalendarRecord extends UpdatableRecordImpl<ChannelpricingcalendarRecord> implements Record7<Integer, Integer, Short, Short, Short, Short, Short> {

    private static final long serialVersionUID = 1359880470;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.ref_channelPricingControls</code>.
     */
    public void setRefChannelpricingcontrols(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.ref_channelPricingControls</code>.
     */
    public Integer getRefChannelpricingcontrols() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.type</code>.
     */
    public void setType(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.type</code>.
     */
    public Short getType() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.dow_start</code>.
     */
    public void setDowStart(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.dow_start</code>.
     */
    public Short getDowStart() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.start_time</code>.
     */
    public void setStartTime(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.start_time</code>.
     */
    public Short getStartTime() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.dow_end</code>.
     */
    public void setDowEnd(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.dow_end</code>.
     */
    public Short getDowEnd() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.end_time</code>.
     */
    public void setEndTime(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingCalendar.end_time</code>.
     */
    public Short getEndTime() {
        return (Short) get(6);
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
    public Row7<Integer, Integer, Short, Short, Short, Short, Short> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Short, Short, Short, Short, Short> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Channelpricingcalendar.CHANNELPRICINGCALENDAR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Channelpricingcalendar.CHANNELPRICINGCALENDAR.REF_CHANNELPRICINGCONTROLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Channelpricingcalendar.CHANNELPRICINGCALENDAR.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Channelpricingcalendar.CHANNELPRICINGCALENDAR.DOW_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Channelpricingcalendar.CHANNELPRICINGCALENDAR.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Channelpricingcalendar.CHANNELPRICINGCALENDAR.DOW_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return Channelpricingcalendar.CHANNELPRICINGCALENDAR.END_TIME;
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
        return getRefChannelpricingcontrols();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getDowStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getDowEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getEndTime();
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
        return getRefChannelpricingcontrols();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getDowStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getDowEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcalendarRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcalendarRecord value2(Integer value) {
        setRefChannelpricingcontrols(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcalendarRecord value3(Short value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcalendarRecord value4(Short value) {
        setDowStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcalendarRecord value5(Short value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcalendarRecord value6(Short value) {
        setDowEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcalendarRecord value7(Short value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcalendarRecord values(Integer value1, Integer value2, Short value3, Short value4, Short value5, Short value6, Short value7) {
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
     * Create a detached ChannelpricingcalendarRecord
     */
    public ChannelpricingcalendarRecord() {
        super(Channelpricingcalendar.CHANNELPRICINGCALENDAR);
    }

    /**
     * Create a detached, initialised ChannelpricingcalendarRecord
     */
    public ChannelpricingcalendarRecord(Integer id, Integer refChannelpricingcontrols, Short type, Short dowStart, Short startTime, Short dowEnd, Short endTime) {
        super(Channelpricingcalendar.CHANNELPRICINGCALENDAR);

        set(0, id);
        set(1, refChannelpricingcontrols);
        set(2, type);
        set(3, dowStart);
        set(4, startTime);
        set(5, dowEnd);
        set(6, endTime);
    }
}
