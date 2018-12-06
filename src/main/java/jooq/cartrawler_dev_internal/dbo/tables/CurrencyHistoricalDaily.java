/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.CurrencyHistoricalDailyRecord;

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
public class CurrencyHistoricalDaily extends TableImpl<CurrencyHistoricalDailyRecord> {

    private static final long serialVersionUID = -1281260031;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.currency_historical_daily</code>
     */
    public static final CurrencyHistoricalDaily CURRENCY_HISTORICAL_DAILY = new CurrencyHistoricalDaily();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CurrencyHistoricalDailyRecord> getRecordType() {
        return CurrencyHistoricalDailyRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.currency_historical_daily.id</code>.
     */
    public final TableField<CurrencyHistoricalDailyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.currency_historical_daily.Rate_date</code>.
     */
    public final TableField<CurrencyHistoricalDailyRecord, Date> RATE_DATE = createField("Rate_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.currency_historical_daily.code</code>.
     */
    public final TableField<CurrencyHistoricalDailyRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.currency_historical_daily.Currency_Rate</code>.
     */
    public final TableField<CurrencyHistoricalDailyRecord, BigDecimal> CURRENCY_RATE = createField("Currency_Rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.currency_historical_daily</code> table reference
     */
    public CurrencyHistoricalDaily() {
        this(DSL.name("currency_historical_daily"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.currency_historical_daily</code> table reference
     */
    public CurrencyHistoricalDaily(String alias) {
        this(DSL.name(alias), CURRENCY_HISTORICAL_DAILY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.currency_historical_daily</code> table reference
     */
    public CurrencyHistoricalDaily(Name alias) {
        this(alias, CURRENCY_HISTORICAL_DAILY);
    }

    private CurrencyHistoricalDaily(Name alias, Table<CurrencyHistoricalDailyRecord> aliased) {
        this(alias, aliased, null);
    }

    private CurrencyHistoricalDaily(Name alias, Table<CurrencyHistoricalDailyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CurrencyHistoricalDaily(Table<O> child, ForeignKey<O, CurrencyHistoricalDailyRecord> key) {
        super(child, key, CURRENCY_HISTORICAL_DAILY);
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
        return Arrays.<Index>asList(Indexes.CURRENCY_HISTORICAL_DAILY_PK_CURRENCY_HISTORICAL_DAILY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CurrencyHistoricalDailyRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CURRENCY_HISTORICAL_DAILY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CurrencyHistoricalDailyRecord> getPrimaryKey() {
        return Keys.PK_CURRENCY_HISTORICAL_DAILY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CurrencyHistoricalDailyRecord>> getKeys() {
        return Arrays.<UniqueKey<CurrencyHistoricalDailyRecord>>asList(Keys.PK_CURRENCY_HISTORICAL_DAILY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyHistoricalDaily as(String alias) {
        return new CurrencyHistoricalDaily(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyHistoricalDaily as(Name alias) {
        return new CurrencyHistoricalDaily(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CurrencyHistoricalDaily rename(String name) {
        return new CurrencyHistoricalDaily(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CurrencyHistoricalDaily rename(Name name) {
        return new CurrencyHistoricalDaily(name, null);
    }
}
