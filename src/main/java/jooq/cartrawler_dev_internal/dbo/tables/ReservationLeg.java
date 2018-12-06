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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationLegRecord;

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
import org.jooq.types.UByte;


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
public class ReservationLeg extends TableImpl<ReservationLegRecord> {

    private static final long serialVersionUID = -893741277;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_leg</code>
     */
    public static final ReservationLeg RESERVATION_LEG = new ReservationLeg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationLegRecord> getRecordType() {
        return ReservationLegRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.id</code>.
     */
    public final TableField<ReservationLegRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.fk_reservation</code>.
     */
    public final TableField<ReservationLegRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.status</code>.
     */
    public final TableField<ReservationLegRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.complete</code>.
     */
    public final TableField<ReservationLegRecord, Boolean> COMPLETE = createField("complete", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.supplier_ref</code>.
     */
    public final TableField<ReservationLegRecord, String> SUPPLIER_REF = createField("supplier_ref", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_date</code>.
     */
    public final TableField<ReservationLegRecord, Timestamp> COLLECT_DATE = createField("collect_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_time</code>.
     */
    public final TableField<ReservationLegRecord, String> COLLECT_TIME = createField("collect_time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_lat</code>.
     */
    public final TableField<ReservationLegRecord, BigDecimal> COLLECT_LAT = createField("collect_lat", org.jooq.impl.SQLDataType.NUMERIC(18, 8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_lng</code>.
     */
    public final TableField<ReservationLegRecord, BigDecimal> COLLECT_LNG = createField("collect_lng", org.jooq.impl.SQLDataType.NUMERIC(18, 8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_iata</code>.
     */
    public final TableField<ReservationLegRecord, String> COLLECT_IATA = createField("collect_iata", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_resort</code>.
     */
    public final TableField<ReservationLegRecord, String> COLLECT_RESORT = createField("collect_resort", org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_resort_id</code>.
     */
    public final TableField<ReservationLegRecord, String> COLLECT_RESORT_ID = createField("collect_resort_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_addr_id</code>.
     */
    public final TableField<ReservationLegRecord, Integer> COLLECT_ADDR_ID = createField("collect_addr_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_date</code>.
     */
    public final TableField<ReservationLegRecord, Timestamp> DEST_DATE = createField("dest_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_time</code>.
     */
    public final TableField<ReservationLegRecord, String> DEST_TIME = createField("dest_time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_lat</code>.
     */
    public final TableField<ReservationLegRecord, BigDecimal> DEST_LAT = createField("dest_lat", org.jooq.impl.SQLDataType.NUMERIC(18, 8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_lng</code>.
     */
    public final TableField<ReservationLegRecord, BigDecimal> DEST_LNG = createField("dest_lng", org.jooq.impl.SQLDataType.NUMERIC(18, 8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_iata</code>.
     */
    public final TableField<ReservationLegRecord, String> DEST_IATA = createField("dest_iata", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_resort</code>.
     */
    public final TableField<ReservationLegRecord, String> DEST_RESORT = createField("dest_resort", org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_resort_id</code>.
     */
    public final TableField<ReservationLegRecord, String> DEST_RESORT_ID = createField("dest_resort_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_addr_id</code>.
     */
    public final TableField<ReservationLegRecord, Integer> DEST_ADDR_ID = createField("dest_addr_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.api_reference</code>.
     */
    public final TableField<ReservationLegRecord, String> API_REFERENCE = createField("api_reference", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.invoice_amount</code>.
     */
    public final TableField<ReservationLegRecord, BigDecimal> INVOICE_AMOUNT = createField("invoice_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.invoice_currency</code>.
     */
    public final TableField<ReservationLegRecord, String> INVOICE_CURRENCY = createField("invoice_currency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.route_id</code>.
     */
    public final TableField<ReservationLegRecord, String> ROUTE_ID = createField("route_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.party</code>.
     */
    public final TableField<ReservationLegRecord, String> PARTY = createField("party", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.service_level</code>.
     */
    public final TableField<ReservationLegRecord, String> SERVICE_LEVEL = createField("service_level", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.Vehicle_kind</code>.
     */
    public final TableField<ReservationLegRecord, String> VEHICLE_KIND = createField("Vehicle_kind", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_place_kind</code>.
     */
    public final TableField<ReservationLegRecord, UByte> COLLECT_PLACE_KIND = createField("collect_place_kind", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_place_kind</code>.
     */
    public final TableField<ReservationLegRecord, UByte> DEST_PLACE_KIND = createField("dest_place_kind", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.carrier_service_ref</code>.
     */
    public final TableField<ReservationLegRecord, String> CARRIER_SERVICE_REF = createField("carrier_service_ref", org.jooq.impl.SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_flight_code</code>.
     */
    public final TableField<ReservationLegRecord, String> COLLECT_FLIGHT_CODE = createField("collect_flight_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_flight_date_time</code>.
     */
    public final TableField<ReservationLegRecord, Timestamp> COLLECT_FLIGHT_DATE_TIME = createField("collect_flight_date_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_flight_code</code>.
     */
    public final TableField<ReservationLegRecord, String> DEST_FLIGHT_CODE = createField("dest_flight_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_flight_date_time</code>.
     */
    public final TableField<ReservationLegRecord, Timestamp> DEST_FLIGHT_DATE_TIME = createField("dest_flight_date_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.decline_reason</code>.
     */
    public final TableField<ReservationLegRecord, Integer> DECLINE_REASON = createField("decline_reason", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.bookedPax</code>.
     */
    public final TableField<ReservationLegRecord, UByte> BOOKEDPAX = createField("bookedPax", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.updated_date</code>.
     */
    public final TableField<ReservationLegRecord, Timestamp> UPDATED_DATE = createField("updated_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.inserted_date</code>.
     */
    public final TableField<ReservationLegRecord, Timestamp> INSERTED_DATE = createField("inserted_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.pickup_id</code>.
     */
    public final TableField<ReservationLegRecord, Integer> PICKUP_ID = createField("pickup_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.max_passengers</code>.
     */
    public final TableField<ReservationLegRecord, UByte> MAX_PASSENGERS = createField("max_passengers", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg.max_luggage</code>.
     */
    public final TableField<ReservationLegRecord, UByte> MAX_LUGGAGE = createField("max_luggage", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_leg</code> table reference
     */
    public ReservationLeg() {
        this(DSL.name("reservation_leg"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_leg</code> table reference
     */
    public ReservationLeg(String alias) {
        this(DSL.name(alias), RESERVATION_LEG);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_leg</code> table reference
     */
    public ReservationLeg(Name alias) {
        this(alias, RESERVATION_LEG);
    }

    private ReservationLeg(Name alias, Table<ReservationLegRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationLeg(Name alias, Table<ReservationLegRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationLeg(Table<O> child, ForeignKey<O, ReservationLegRecord> key) {
        super(child, key, RESERVATION_LEG);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_LEG_PK_RESERVATION_LEG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationLegRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_LEG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationLegRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_LEG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationLegRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationLegRecord>>asList(Keys.PK_RESERVATION_LEG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLeg as(String alias) {
        return new ReservationLeg(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLeg as(Name alias) {
        return new ReservationLeg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationLeg rename(String name) {
        return new ReservationLeg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationLeg rename(Name name) {
        return new ReservationLeg(name, null);
    }
}
