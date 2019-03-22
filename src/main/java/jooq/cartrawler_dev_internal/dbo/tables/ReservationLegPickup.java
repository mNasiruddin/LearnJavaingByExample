/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationLegPickupRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class ReservationLegPickup extends TableImpl<ReservationLegPickupRecord> {

    private static final long serialVersionUID = -411982810;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_leg_pickup</code>
     */
    public static final ReservationLegPickup RESERVATION_LEG_PICKUP = new ReservationLegPickup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationLegPickupRecord> getRecordType() {
        return ReservationLegPickupRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg_pickup.wait_minutes</code>.
     */
    public final TableField<ReservationLegPickupRecord, Integer> WAIT_MINUTES = createField("wait_minutes", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg_pickup.place</code>.
     */
    public final TableField<ReservationLegPickupRecord, String> PLACE = createField("place", org.jooq.impl.SQLDataType.NVARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg_pickup.instructions</code>.
     */
    public final TableField<ReservationLegPickupRecord, String> INSTRUCTIONS = createField("instructions", org.jooq.impl.SQLDataType.NVARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg_pickup.meeting_kind</code>.
     */
    public final TableField<ReservationLegPickupRecord, String> MEETING_KIND = createField("meeting_kind", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_leg_pickup.id</code>.
     */
    public final TableField<ReservationLegPickupRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_leg_pickup</code> table reference
     */
    public ReservationLegPickup() {
        this(DSL.name("reservation_leg_pickup"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_leg_pickup</code> table reference
     */
    public ReservationLegPickup(String alias) {
        this(DSL.name(alias), RESERVATION_LEG_PICKUP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_leg_pickup</code> table reference
     */
    public ReservationLegPickup(Name alias) {
        this(alias, RESERVATION_LEG_PICKUP);
    }

    private ReservationLegPickup(Name alias, Table<ReservationLegPickupRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationLegPickup(Name alias, Table<ReservationLegPickupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationLegPickup(Table<O> child, ForeignKey<O, ReservationLegPickupRecord> key) {
        super(child, key, RESERVATION_LEG_PICKUP);
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
    public Identity<ReservationLegPickupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_LEG_PICKUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegPickup as(String alias) {
        return new ReservationLegPickup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegPickup as(Name alias) {
        return new ReservationLegPickup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationLegPickup rename(String name) {
        return new ReservationLegPickup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationLegPickup rename(Name name) {
        return new ReservationLegPickup(name, null);
    }
}