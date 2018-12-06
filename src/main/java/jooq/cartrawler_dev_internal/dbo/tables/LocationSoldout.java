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
import jooq.cartrawler_dev_internal.dbo.tables.records.LocationSoldoutRecord;

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
public class LocationSoldout extends TableImpl<LocationSoldoutRecord> {

    private static final long serialVersionUID = -1537624900;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Location_Soldout</code>
     */
    public static final LocationSoldout LOCATION_SOLDOUT = new LocationSoldout();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocationSoldoutRecord> getRecordType() {
        return LocationSoldoutRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Soldout.soldout_id</code>.
     */
    public final TableField<LocationSoldoutRecord, Integer> SOLDOUT_ID = createField("soldout_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Soldout.location_id</code>.
     */
    public final TableField<LocationSoldoutRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Soldout.soldout_name</code>.
     */
    public final TableField<LocationSoldoutRecord, String> SOLDOUT_NAME = createField("soldout_name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Soldout.start_date</code>.
     */
    public final TableField<LocationSoldoutRecord, Timestamp> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Soldout.end_date</code>.
     */
    public final TableField<LocationSoldoutRecord, Timestamp> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Soldout.user_id</code>.
     */
    public final TableField<LocationSoldoutRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Soldout.createDate</code>.
     */
    public final TableField<LocationSoldoutRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Soldout.overrideDays</code>.
     */
    public final TableField<LocationSoldoutRecord, Integer> OVERRIDEDAYS = createField("overrideDays", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Soldout.entireDuration</code>.
     */
    public final TableField<LocationSoldoutRecord, Boolean> ENTIREDURATION = createField("entireDuration", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Location_Soldout</code> table reference
     */
    public LocationSoldout() {
        this(DSL.name("Location_Soldout"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Location_Soldout</code> table reference
     */
    public LocationSoldout(String alias) {
        this(DSL.name(alias), LOCATION_SOLDOUT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Location_Soldout</code> table reference
     */
    public LocationSoldout(Name alias) {
        this(alias, LOCATION_SOLDOUT);
    }

    private LocationSoldout(Name alias, Table<LocationSoldoutRecord> aliased) {
        this(alias, aliased, null);
    }

    private LocationSoldout(Name alias, Table<LocationSoldoutRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LocationSoldout(Table<O> child, ForeignKey<O, LocationSoldoutRecord> key) {
        super(child, key, LOCATION_SOLDOUT);
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
        return Arrays.<Index>asList(Indexes.LOCATION_SOLDOUT_PK_LOCATION_GROUPS_CLOSED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LocationSoldoutRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOCATION_SOLDOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LocationSoldoutRecord> getPrimaryKey() {
        return Keys.PK_LOCATION_GROUPS_CLOSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LocationSoldoutRecord>> getKeys() {
        return Arrays.<UniqueKey<LocationSoldoutRecord>>asList(Keys.PK_LOCATION_GROUPS_CLOSED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LocationSoldoutRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LocationSoldoutRecord, ?>>asList(Keys.FK_LOCATION_SOLDOUT_USERS);
    }

    public Users users() {
        return new Users(this, Keys.FK_LOCATION_SOLDOUT_USERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationSoldout as(String alias) {
        return new LocationSoldout(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationSoldout as(Name alias) {
        return new LocationSoldout(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LocationSoldout rename(String name) {
        return new LocationSoldout(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LocationSoldout rename(Name name) {
        return new LocationSoldout(name, null);
    }
}
