/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Syncobj_0x4343453642364235;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class Syncobj_0x4343453642364235Record extends TableRecordImpl<Syncobj_0x4343453642364235Record> implements Record4<Integer, Date, String, BigDecimal> {

    private static final long serialVersionUID = -1670505545;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4343453642364235.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4343453642364235.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4343453642364235.Rate_date</code>.
     */
    public void setRateDate(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4343453642364235.Rate_date</code>.
     */
    public Date getRateDate() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4343453642364235.code</code>.
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4343453642364235.code</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4343453642364235.Currency_Rate</code>.
     */
    public void setCurrencyRate(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4343453642364235.Currency_Rate</code>.
     */
    public BigDecimal getCurrencyRate() {
        return (BigDecimal) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Date, String, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Date, String, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Syncobj_0x4343453642364235.SYNCOBJ_0X4343453642364235.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return Syncobj_0x4343453642364235.SYNCOBJ_0X4343453642364235.RATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Syncobj_0x4343453642364235.SYNCOBJ_0X4343453642364235.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Syncobj_0x4343453642364235.SYNCOBJ_0X4343453642364235.CURRENCY_RATE;
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
    public Date component2() {
        return getRateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getCurrencyRate();
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
    public Date value2() {
        return getRateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getCurrencyRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4343453642364235Record value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4343453642364235Record value2(Date value) {
        setRateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4343453642364235Record value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4343453642364235Record value4(BigDecimal value) {
        setCurrencyRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4343453642364235Record values(Integer value1, Date value2, String value3, BigDecimal value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Syncobj_0x4343453642364235Record
     */
    public Syncobj_0x4343453642364235Record() {
        super(Syncobj_0x4343453642364235.SYNCOBJ_0X4343453642364235);
    }

    /**
     * Create a detached, initialised Syncobj_0x4343453642364235Record
     */
    public Syncobj_0x4343453642364235Record(Integer id, Date rateDate, String code, BigDecimal currencyRate) {
        super(Syncobj_0x4343453642364235.SYNCOBJ_0X4343453642364235);

        set(0, id);
        set(1, rateDate);
        set(2, code);
        set(3, currencyRate);
    }
}
