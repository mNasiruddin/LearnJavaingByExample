/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.HistoricExchangeRates;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class HistoricExchangeRatesRecord extends UpdatableRecordImpl<HistoricExchangeRatesRecord> implements Record4<Integer, Timestamp, BigDecimal, String> {

    private static final long serialVersionUID = -2106264814;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.historic_exchange_rates.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.historic_exchange_rates.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.historic_exchange_rates.datetime</code>.
     */
    public void setDatetime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.historic_exchange_rates.datetime</code>.
     */
    public Timestamp getDatetime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.historic_exchange_rates.to_eur_rate</code>.
     */
    public void setToEurRate(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.historic_exchange_rates.to_eur_rate</code>.
     */
    public BigDecimal getToEurRate() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.historic_exchange_rates.currency</code>.
     */
    public void setCurrency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.historic_exchange_rates.currency</code>.
     */
    public String getCurrency() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, BigDecimal, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, BigDecimal, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HistoricExchangeRates.HISTORIC_EXCHANGE_RATES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return HistoricExchangeRates.HISTORIC_EXCHANGE_RATES.DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return HistoricExchangeRates.HISTORIC_EXCHANGE_RATES.TO_EUR_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HistoricExchangeRates.HISTORIC_EXCHANGE_RATES.CURRENCY;
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
    public Timestamp component2() {
        return getDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getToEurRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCurrency();
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
    public Timestamp value2() {
        return getDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getToEurRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoricExchangeRatesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoricExchangeRatesRecord value2(Timestamp value) {
        setDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoricExchangeRatesRecord value3(BigDecimal value) {
        setToEurRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoricExchangeRatesRecord value4(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoricExchangeRatesRecord values(Integer value1, Timestamp value2, BigDecimal value3, String value4) {
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
     * Create a detached HistoricExchangeRatesRecord
     */
    public HistoricExchangeRatesRecord() {
        super(HistoricExchangeRates.HISTORIC_EXCHANGE_RATES);
    }

    /**
     * Create a detached, initialised HistoricExchangeRatesRecord
     */
    public HistoricExchangeRatesRecord(Integer id, Timestamp datetime, BigDecimal toEurRate, String currency) {
        super(HistoricExchangeRates.HISTORIC_EXCHANGE_RATES);

        set(0, id);
        set(1, datetime);
        set(2, toEurRate);
        set(3, currency);
    }
}