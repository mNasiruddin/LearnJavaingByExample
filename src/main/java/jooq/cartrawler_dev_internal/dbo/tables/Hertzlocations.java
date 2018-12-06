/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.HertzlocationsRecord;

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
public class Hertzlocations extends TableImpl<HertzlocationsRecord> {

    private static final long serialVersionUID = 176700608;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.HertzLocations</code>
     */
    public static final Hertzlocations HERTZLOCATIONS = new Hertzlocations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HertzlocationsRecord> getRecordType() {
        return HertzlocationsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.name</code>.
     */
    public final TableField<HertzlocationsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.address</code>.
     */
    public final TableField<HertzlocationsRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.OAG</code>.
     */
    public final TableField<HertzlocationsRecord, String> OAG = createField("OAG", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.hours</code>.
     */
    public final TableField<HertzlocationsRecord, String> HOURS = createField("hours", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.country_code</code>.
     */
    public final TableField<HertzlocationsRecord, String> COUNTRY_CODE = createField("country_code", org.jooq.impl.SQLDataType.CHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.cartrawlerloc_id</code>.
     */
    public final TableField<HertzlocationsRecord, Integer> CARTRAWLERLOC_ID = createField("cartrawlerloc_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.sitename</code>.
     */
    public final TableField<HertzlocationsRecord, String> SITENAME = createField("sitename", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.city</code>.
     */
    public final TableField<HertzlocationsRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.ziporpostcode</code>.
     */
    public final TableField<HertzlocationsRecord, String> ZIPORPOSTCODE = createField("ziporpostcode", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.siteaddress1</code>.
     */
    public final TableField<HertzlocationsRecord, String> SITEADDRESS1 = createField("siteaddress1", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.siteaddress2</code>.
     */
    public final TableField<HertzlocationsRecord, String> SITEADDRESS2 = createField("siteaddress2", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HertzLocations.stateorprov</code>.
     */
    public final TableField<HertzlocationsRecord, String> STATEORPROV = createField("stateorprov", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.HertzLocations</code> table reference
     */
    public Hertzlocations() {
        this(DSL.name("HertzLocations"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.HertzLocations</code> table reference
     */
    public Hertzlocations(String alias) {
        this(DSL.name(alias), HERTZLOCATIONS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.HertzLocations</code> table reference
     */
    public Hertzlocations(Name alias) {
        this(alias, HERTZLOCATIONS);
    }

    private Hertzlocations(Name alias, Table<HertzlocationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Hertzlocations(Name alias, Table<HertzlocationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Hertzlocations(Table<O> child, ForeignKey<O, HertzlocationsRecord> key) {
        super(child, key, HERTZLOCATIONS);
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
        return Arrays.<Index>asList(Indexes.HERTZLOCATIONS_PK_HERTZLOCATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HertzlocationsRecord> getPrimaryKey() {
        return Keys.PK_HERTZLOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HertzlocationsRecord>> getKeys() {
        return Arrays.<UniqueKey<HertzlocationsRecord>>asList(Keys.PK_HERTZLOCATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Hertzlocations as(String alias) {
        return new Hertzlocations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Hertzlocations as(Name alias) {
        return new Hertzlocations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Hertzlocations rename(String name) {
        return new Hertzlocations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Hertzlocations rename(Name name) {
        return new Hertzlocations(name, null);
    }
}
