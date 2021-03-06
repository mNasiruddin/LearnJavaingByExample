/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.CurrencyRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Currency extends TableImpl<CurrencyRecord> {

    private static final long serialVersionUID = -621188935;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Currency</code>
     */
    public static final Currency CURRENCY = new Currency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CurrencyRecord> getRecordType() {
        return CurrencyRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.Currency_Name</code>.
     */
    public final TableField<CurrencyRecord, String> CURRENCY_NAME = createField("Currency_Name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.Currency_Rate</code>.
     */
    public final TableField<CurrencyRecord, BigDecimal> CURRENCY_RATE = createField("Currency_Rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.Date_Changed</code>.
     */
    public final TableField<CurrencyRecord, Timestamp> DATE_CHANGED = createField("Date_Changed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.Live</code>.
     */
    public final TableField<CurrencyRecord, Boolean> LIVE = createField("Live", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.Code</code>.
     */
    public final TableField<CurrencyRecord, String> CODE = createField("Code", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.Description</code>.
     */
    public final TableField<CurrencyRecord, String> DESCRIPTION = createField("Description", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.symbol</code>.
     */
    public final TableField<CurrencyRecord, String> SYMBOL = createField("symbol", org.jooq.impl.SQLDataType.NVARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.exchange_updated</code>.
     */
    public final TableField<CurrencyRecord, Timestamp> EXCHANGE_UPDATED = createField("exchange_updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.charge_currency</code>.
     */
    public final TableField<CurrencyRecord, Boolean> CHARGE_CURRENCY = createField("charge_currency", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency.display</code>.
     */
    public final TableField<CurrencyRecord, Boolean> DISPLAY = createField("display", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Currency</code> table reference
     */
    public Currency() {
        this(DSL.name("Currency"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Currency</code> table reference
     */
    public Currency(String alias) {
        this(DSL.name(alias), CURRENCY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Currency</code> table reference
     */
    public Currency(Name alias) {
        this(alias, CURRENCY);
    }

    private Currency(Name alias, Table<CurrencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Currency(Name alias, Table<CurrencyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Currency(Table<O> child, ForeignKey<O, CurrencyRecord> key) {
        super(child, key, CURRENCY);
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
        return Arrays.<Index>asList(Indexes.CURRENCY_PK_CURRENCY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CurrencyRecord> getPrimaryKey() {
        return Keys.PK_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CurrencyRecord>> getKeys() {
        return Arrays.<UniqueKey<CurrencyRecord>>asList(Keys.PK_CURRENCY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Currency as(String alias) {
        return new Currency(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Currency as(Name alias) {
        return new Currency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Currency rename(String name) {
        return new Currency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Currency rename(Name name) {
        return new Currency(name, null);
    }
}
