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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationLegRehouseAttemptRecord;

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
public class ReservationLegRehouseAttempt extends TableImpl<ReservationLegRehouseAttemptRecord> {

    private static final long serialVersionUID = 1925001225;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt</code>
     */
    public static final ReservationLegRehouseAttempt RESERVATION_LEG_REHOUSE_ATTEMPT = new ReservationLegRehouseAttempt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationLegRehouseAttemptRecord> getRecordType() {
        return ReservationLegRehouseAttemptRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.id</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.fk_reservation</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.fk_leg</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, Integer> FK_LEG = createField("fk_leg", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.rehouse_attempt_status</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, String> REHOUSE_ATTEMPT_STATUS = createField("rehouse_attempt_status", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.rehouse_attempt_date</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, Timestamp> REHOUSE_ATTEMPT_DATE = createField("rehouse_attempt_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.rehouse_attempt_time</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, String> REHOUSE_ATTEMPT_TIME = createField("rehouse_attempt_time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_supplier_ref</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, String> ORIG_SUPPLIER_REF = createField("orig_supplier_ref", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_car_agent_id</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, Integer> ORIG_CAR_AGENT_ID = createField("orig_car_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_api_ref</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, String> ORIG_API_REF = createField("orig_api_ref", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_cost</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, BigDecimal> ORIG_COST = createField("orig_cost", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_currency</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, String> ORIG_CURRENCY = createField("orig_currency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_service_level</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, String> ORIG_SERVICE_LEVEL = createField("orig_service_level", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_vehicle_kind</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, String> ORIG_VEHICLE_KIND = createField("orig_vehicle_kind", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_emv</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, BigDecimal> ORIG_EMV = createField("orig_emv", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_txid</code>.
     */
    public final TableField<ReservationLegRehouseAttemptRecord, String> ORIG_TXID = createField("orig_txid", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt</code> table reference
     */
    public ReservationLegRehouseAttempt() {
        this(DSL.name("Reservation_Leg_Rehouse_Attempt"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt</code> table reference
     */
    public ReservationLegRehouseAttempt(String alias) {
        this(DSL.name(alias), RESERVATION_LEG_REHOUSE_ATTEMPT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt</code> table reference
     */
    public ReservationLegRehouseAttempt(Name alias) {
        this(alias, RESERVATION_LEG_REHOUSE_ATTEMPT);
    }

    private ReservationLegRehouseAttempt(Name alias, Table<ReservationLegRehouseAttemptRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationLegRehouseAttempt(Name alias, Table<ReservationLegRehouseAttemptRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationLegRehouseAttempt(Table<O> child, ForeignKey<O, ReservationLegRehouseAttemptRecord> key) {
        super(child, key, RESERVATION_LEG_REHOUSE_ATTEMPT);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_LEG_REHOUSE_ATTEMPT_IDX_FK_LEG_ORIG_SUPPLIER_REF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationLegRehouseAttemptRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_LEG_REHOUSE_ATTEMPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationLegRehouseAttemptRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationLegRehouseAttemptRecord>>asList(Keys.IDX_FK_LEG_ORIG_SUPPLIER_REF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttempt as(String alias) {
        return new ReservationLegRehouseAttempt(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttempt as(Name alias) {
        return new ReservationLegRehouseAttempt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationLegRehouseAttempt rename(String name) {
        return new ReservationLegRehouseAttempt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationLegRehouseAttempt rename(Name name) {
        return new ReservationLegRehouseAttempt(name, null);
    }
}
