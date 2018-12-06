/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ExchangeRatesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ExchangeRates extends TableImpl<ExchangeRatesRecord> {

    private static final long serialVersionUID = -1255309804;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Exchange_Rates</code>
     */
    public static final ExchangeRates EXCHANGE_RATES = new ExchangeRates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExchangeRatesRecord> getRecordType() {
        return ExchangeRatesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Exchange_Rates.id</code>.
     */
    public final TableField<ExchangeRatesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Exchange_Rates.primary_currency_code</code>.
     */
    public final TableField<ExchangeRatesRecord, String> PRIMARY_CURRENCY_CODE = createField("primary_currency_code", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Exchange_Rates.convert_currency_code</code>.
     */
    public final TableField<ExchangeRatesRecord, String> CONVERT_CURRENCY_CODE = createField("convert_currency_code", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Exchange_Rates.exchange_rate</code>.
     */
    public final TableField<ExchangeRatesRecord, BigDecimal> EXCHANGE_RATE = createField("exchange_rate", org.jooq.impl.SQLDataType.NUMERIC(10, 6), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Exchange_Rates</code> table reference
     */
    public ExchangeRates() {
        this(DSL.name("Exchange_Rates"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Exchange_Rates</code> table reference
     */
    public ExchangeRates(String alias) {
        this(DSL.name(alias), EXCHANGE_RATES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Exchange_Rates</code> table reference
     */
    public ExchangeRates(Name alias) {
        this(alias, EXCHANGE_RATES);
    }

    private ExchangeRates(Name alias, Table<ExchangeRatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExchangeRates(Name alias, Table<ExchangeRatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ExchangeRates(Table<O> child, ForeignKey<O, ExchangeRatesRecord> key) {
        super(child, key, EXCHANGE_RATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EXCHANGE_RATES_PK_EXCHANGE_RATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ExchangeRatesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EXCHANGE_RATES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExchangeRatesRecord> getPrimaryKey() {
        return Keys.PK_EXCHANGE_RATES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExchangeRatesRecord>> getKeys() {
        return Arrays.<UniqueKey<ExchangeRatesRecord>>asList(Keys.PK_EXCHANGE_RATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRates as(String alias) {
        return new ExchangeRates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRates as(Name alias) {
        return new ExchangeRates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExchangeRates rename(String name) {
        return new ExchangeRates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExchangeRates rename(Name name) {
        return new ExchangeRates(name, null);
    }
}
