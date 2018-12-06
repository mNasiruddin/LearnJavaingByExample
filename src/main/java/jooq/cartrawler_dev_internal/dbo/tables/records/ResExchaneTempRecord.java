/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ResExchaneTemp;

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
public class ResExchaneTempRecord extends TableRecordImpl<ResExchaneTempRecord> implements Record4<Integer, BigDecimal, BigDecimal, Timestamp> {

    private static final long serialVersionUID = -1973072014;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.res_exchane_temp.ref</code>.
     */
    public void setRef(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.res_exchane_temp.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.res_exchane_temp.rate_display_exchange</code>.
     */
    public void setRateDisplayExchange(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.res_exchane_temp.rate_display_exchange</code>.
     */
    public BigDecimal getRateDisplayExchange() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.res_exchane_temp.rate_charge_exchange</code>.
     */
    public void setRateChargeExchange(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.res_exchane_temp.rate_charge_exchange</code>.
     */
    public BigDecimal getRateChargeExchange() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.res_exchane_temp.res_date</code>.
     */
    public void setResDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.res_exchane_temp.res_date</code>.
     */
    public Timestamp getResDate() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, BigDecimal, BigDecimal, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, BigDecimal, BigDecimal, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ResExchaneTemp.RES_EXCHANE_TEMP.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return ResExchaneTemp.RES_EXCHANE_TEMP.RATE_DISPLAY_EXCHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return ResExchaneTemp.RES_EXCHANE_TEMP.RATE_CHARGE_EXCHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ResExchaneTemp.RES_EXCHANE_TEMP.RES_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getRateDisplayExchange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getRateChargeExchange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getResDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getRateDisplayExchange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getRateChargeExchange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getResDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResExchaneTempRecord value1(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResExchaneTempRecord value2(BigDecimal value) {
        setRateDisplayExchange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResExchaneTempRecord value3(BigDecimal value) {
        setRateChargeExchange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResExchaneTempRecord value4(Timestamp value) {
        setResDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResExchaneTempRecord values(Integer value1, BigDecimal value2, BigDecimal value3, Timestamp value4) {
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
     * Create a detached ResExchaneTempRecord
     */
    public ResExchaneTempRecord() {
        super(ResExchaneTemp.RES_EXCHANE_TEMP);
    }

    /**
     * Create a detached, initialised ResExchaneTempRecord
     */
    public ResExchaneTempRecord(Integer ref, BigDecimal rateDisplayExchange, BigDecimal rateChargeExchange, Timestamp resDate) {
        super(ResExchaneTemp.RES_EXCHANE_TEMP);

        set(0, ref);
        set(1, rateDisplayExchange);
        set(2, rateChargeExchange);
        set(3, resDate);
    }
}
