/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.LocalTaxRatesRecord;

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
public class LocalTaxRates extends TableImpl<LocalTaxRatesRecord> {

    private static final long serialVersionUID = 958692743;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.local_tax_rates</code>
     */
    public static final LocalTaxRates LOCAL_TAX_RATES = new LocalTaxRates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocalTaxRatesRecord> getRecordType() {
        return LocalTaxRatesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.local_tax_rates.id</code>.
     */
    public final TableField<LocalTaxRatesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.local_tax_rates.guid</code>.
     */
    public final TableField<LocalTaxRatesRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.local_tax_rates.title</code>.
     */
    public final TableField<LocalTaxRatesRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.local_tax_rates.fk_country</code>.
     */
    public final TableField<LocalTaxRatesRecord, String> FK_COUNTRY = createField("fk_country", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.local_tax_rates.fk_virtualLocation</code>.
     */
    public final TableField<LocalTaxRatesRecord, Integer> FK_VIRTUALLOCATION = createField("fk_virtualLocation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.local_tax_rates.local_tax_rate</code>.
     */
    public final TableField<LocalTaxRatesRecord, BigDecimal> LOCAL_TAX_RATE = createField("local_tax_rate", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.local_tax_rates</code> table reference
     */
    public LocalTaxRates() {
        this(DSL.name("local_tax_rates"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.local_tax_rates</code> table reference
     */
    public LocalTaxRates(String alias) {
        this(DSL.name(alias), LOCAL_TAX_RATES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.local_tax_rates</code> table reference
     */
    public LocalTaxRates(Name alias) {
        this(alias, LOCAL_TAX_RATES);
    }

    private LocalTaxRates(Name alias, Table<LocalTaxRatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private LocalTaxRates(Name alias, Table<LocalTaxRatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LocalTaxRates(Table<O> child, ForeignKey<O, LocalTaxRatesRecord> key) {
        super(child, key, LOCAL_TAX_RATES);
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
        return Arrays.<Index>asList(Indexes.LOCAL_TAX_RATES_PK_LOCAL_TAX_RATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LocalTaxRatesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOCAL_TAX_RATES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LocalTaxRatesRecord> getPrimaryKey() {
        return Keys.PK_LOCAL_TAX_RATES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LocalTaxRatesRecord>> getKeys() {
        return Arrays.<UniqueKey<LocalTaxRatesRecord>>asList(Keys.PK_LOCAL_TAX_RATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalTaxRates as(String alias) {
        return new LocalTaxRates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalTaxRates as(Name alias) {
        return new LocalTaxRates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LocalTaxRates rename(String name) {
        return new LocalTaxRates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LocalTaxRates rename(Name name) {
        return new LocalTaxRates(name, null);
    }
}
