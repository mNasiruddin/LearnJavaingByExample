/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.CountryregionRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Countryregion extends TableImpl<CountryregionRecord> {

    private static final long serialVersionUID = -1877092354;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.CountryRegion</code>
     */
    public static final Countryregion COUNTRYREGION = new Countryregion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryregionRecord> getRecordType() {
        return CountryregionRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CountryRegion.country_id</code>.
     */
    public final TableField<CountryregionRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CountryRegion.MM_Region</code>.
     */
    public final TableField<CountryregionRecord, String> MM_REGION = createField("MM_Region", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.CountryRegion</code> table reference
     */
    public Countryregion() {
        this(DSL.name("CountryRegion"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CountryRegion</code> table reference
     */
    public Countryregion(String alias) {
        this(DSL.name(alias), COUNTRYREGION);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CountryRegion</code> table reference
     */
    public Countryregion(Name alias) {
        this(alias, COUNTRYREGION);
    }

    private Countryregion(Name alias, Table<CountryregionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Countryregion(Name alias, Table<CountryregionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Countryregion(Table<O> child, ForeignKey<O, CountryregionRecord> key) {
        super(child, key, COUNTRYREGION);
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
    public Countryregion as(String alias) {
        return new Countryregion(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Countryregion as(Name alias) {
        return new Countryregion(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Countryregion rename(String name) {
        return new Countryregion(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Countryregion rename(Name name) {
        return new Countryregion(name, null);
    }
}
