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
import jooq.cartrawler_dev_internal.dbo.tables.records.PhysicalLocationRecord;

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
public class PhysicalLocation extends TableImpl<PhysicalLocationRecord> {

    private static final long serialVersionUID = 1925709117;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.physical_location</code>
     */
    public static final PhysicalLocation PHYSICAL_LOCATION = new PhysicalLocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PhysicalLocationRecord> getRecordType() {
        return PhysicalLocationRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.physical_location_id</code>.
     */
    public final TableField<PhysicalLocationRecord, Integer> PHYSICAL_LOCATION_ID = createField("physical_location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.country_id</code>.
     */
    public final TableField<PhysicalLocationRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.latitude</code>.
     */
    public final TableField<PhysicalLocationRecord, BigDecimal> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.NUMERIC(18, 8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.longitude</code>.
     */
    public final TableField<PhysicalLocationRecord, BigDecimal> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.NUMERIC(18, 8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.addressline1</code>.
     */
    public final TableField<PhysicalLocationRecord, String> ADDRESSLINE1 = createField("addressline1", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.addressline2</code>.
     */
    public final TableField<PhysicalLocationRecord, String> ADDRESSLINE2 = createField("addressline2", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.cityname</code>.
     */
    public final TableField<PhysicalLocationRecord, String> CITYNAME = createField("cityname", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.postalcode</code>.
     */
    public final TableField<PhysicalLocationRecord, String> POSTALCODE = createField("postalcode", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.county</code>.
     */
    public final TableField<PhysicalLocationRecord, String> COUNTY = createField("county", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.stateprov</code>.
     */
    public final TableField<PhysicalLocationRecord, String> STATEPROV = createField("stateprov", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.statecode</code>.
     */
    public final TableField<PhysicalLocationRecord, String> STATECODE = createField("statecode", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.telephone</code>.
     */
    public final TableField<PhysicalLocationRecord, String> TELEPHONE = createField("telephone", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.airport</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> AIRPORT = createField("airport", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.railway</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> RAILWAY = createField("railway", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.ferryport</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> FERRYPORT = createField("ferryport", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.iata_airport_code</code>.
     */
    public final TableField<PhysicalLocationRecord, String> IATA_AIRPORT_CODE = createField("iata_airport_code", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.iata_city_code</code>.
     */
    public final TableField<PhysicalLocationRecord, String> IATA_CITY_CODE = createField("iata_city_code", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.pickup_type_id</code>.
     */
    public final TableField<PhysicalLocationRecord, Integer> PICKUP_TYPE_ID = createField("pickup_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.timezone</code>.
     */
    public final TableField<PhysicalLocationRecord, String> TIMEZONE = createField("timezone", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.pickup_only</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> PICKUP_ONLY = createField("pickup_only", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.return_only</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> RETURN_ONLY = createField("return_only", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.outofhours_return</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> OUTOFHOURS_RETURN = createField("outofhours_return", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.directions</code>.
     */
    public final TableField<PhysicalLocationRecord, String> DIRECTIONS = createField("directions", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.temp_cityname</code>.
     */
    public final TableField<PhysicalLocationRecord, String> TEMP_CITYNAME = createField("temp_cityname", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.temp_last_user</code>.
     */
    public final TableField<PhysicalLocationRecord, Integer> TEMP_LAST_USER = createField("temp_last_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.dropbox</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> DROPBOX = createField("dropbox", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.autoCalculatedTimezone</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> AUTOCALCULATEDTIMEZONE = createField("autoCalculatedTimezone", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.delivery_collection</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> DELIVERY_COLLECTION = createField("delivery_collection", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.pl_email</code>.
     */
    public final TableField<PhysicalLocationRecord, String> PL_EMAIL = createField("pl_email", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.physical_location.debitCardAccepted</code>.
     */
    public final TableField<PhysicalLocationRecord, Boolean> DEBITCARDACCEPTED = createField("debitCardAccepted", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.physical_location</code> table reference
     */
    public PhysicalLocation() {
        this(DSL.name("physical_location"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.physical_location</code> table reference
     */
    public PhysicalLocation(String alias) {
        this(DSL.name(alias), PHYSICAL_LOCATION);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.physical_location</code> table reference
     */
    public PhysicalLocation(Name alias) {
        this(alias, PHYSICAL_LOCATION);
    }

    private PhysicalLocation(Name alias, Table<PhysicalLocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private PhysicalLocation(Name alias, Table<PhysicalLocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PhysicalLocation(Table<O> child, ForeignKey<O, PhysicalLocationRecord> key) {
        super(child, key, PHYSICAL_LOCATION);
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
        return Arrays.<Index>asList(Indexes.PHYSICAL_LOCATION_PK_PHYSICAL_LOCATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PhysicalLocationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PHYSICAL_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PhysicalLocationRecord> getPrimaryKey() {
        return Keys.PK_PHYSICAL_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PhysicalLocationRecord>> getKeys() {
        return Arrays.<UniqueKey<PhysicalLocationRecord>>asList(Keys.PK_PHYSICAL_LOCATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalLocation as(String alias) {
        return new PhysicalLocation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalLocation as(Name alias) {
        return new PhysicalLocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PhysicalLocation rename(String name) {
        return new PhysicalLocation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PhysicalLocation rename(Name name) {
        return new PhysicalLocation(name, null);
    }
}
