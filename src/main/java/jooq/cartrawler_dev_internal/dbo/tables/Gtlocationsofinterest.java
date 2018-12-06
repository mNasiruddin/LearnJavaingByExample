/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.GtlocationsofinterestRecord;

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
public class Gtlocationsofinterest extends TableImpl<GtlocationsofinterestRecord> {

    private static final long serialVersionUID = 341042811;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest</code>
     */
    public static final Gtlocationsofinterest GTLOCATIONSOFINTEREST = new Gtlocationsofinterest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GtlocationsofinterestRecord> getRecordType() {
        return GtlocationsofinterestRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.id</code>.
     */
    public final TableField<GtlocationsofinterestRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.name</code>.
     */
    public final TableField<GtlocationsofinterestRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.latitude</code>.
     */
    public final TableField<GtlocationsofinterestRecord, String> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.longitude</code>.
     */
    public final TableField<GtlocationsofinterestRecord, String> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.gtLocationType_id</code>.
     */
    public final TableField<GtlocationsofinterestRecord, Integer> GTLOCATIONTYPE_ID = createField("gtLocationType_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.iata_code</code>.
     */
    public final TableField<GtlocationsofinterestRecord, String> IATA_CODE = createField("iata_code", org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("(NULL)", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.locationID</code>.
     */
    public final TableField<GtlocationsofinterestRecord, String> LOCATIONID = createField("locationID", org.jooq.impl.SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.lang_id</code>.
     */
    public final TableField<GtlocationsofinterestRecord, Integer> LANG_ID = createField("lang_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.address</code>.
     */
    public final TableField<GtlocationsofinterestRecord, byte[]> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.city</code>.
     */
    public final TableField<GtlocationsofinterestRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("('')", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.Updated_date</code>.
     */
    public final TableField<GtlocationsofinterestRecord, Timestamp> UPDATED_DATE = createField("Updated_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.Bookings</code>.
     */
    public final TableField<GtlocationsofinterestRecord, Integer> BOOKINGS = createField("Bookings", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest</code> table reference
     */
    public Gtlocationsofinterest() {
        this(DSL.name("GTLocationsOfInterest"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest</code> table reference
     */
    public Gtlocationsofinterest(String alias) {
        this(DSL.name(alias), GTLOCATIONSOFINTEREST);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest</code> table reference
     */
    public Gtlocationsofinterest(Name alias) {
        this(alias, GTLOCATIONSOFINTEREST);
    }

    private Gtlocationsofinterest(Name alias, Table<GtlocationsofinterestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Gtlocationsofinterest(Name alias, Table<GtlocationsofinterestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Gtlocationsofinterest(Table<O> child, ForeignKey<O, GtlocationsofinterestRecord> key) {
        super(child, key, GTLOCATIONSOFINTEREST);
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
        return Arrays.<Index>asList(Indexes.GTLOCATIONSOFINTEREST_PK__GTLOCATI__3213E83F76E579FB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GtlocationsofinterestRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GTLOCATIONSOFINTEREST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GtlocationsofinterestRecord> getPrimaryKey() {
        return Keys.PK__GTLOCATI__3213E83F76E579FB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GtlocationsofinterestRecord>> getKeys() {
        return Arrays.<UniqueKey<GtlocationsofinterestRecord>>asList(Keys.PK__GTLOCATI__3213E83F76E579FB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gtlocationsofinterest as(String alias) {
        return new Gtlocationsofinterest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gtlocationsofinterest as(Name alias) {
        return new Gtlocationsofinterest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Gtlocationsofinterest rename(String name) {
        return new Gtlocationsofinterest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Gtlocationsofinterest rename(Name name) {
        return new Gtlocationsofinterest(name, null);
    }
}
