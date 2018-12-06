/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.Syncobj_0x3736444333313842Record;

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
public class Syncobj_0x3736444333313842 extends TableImpl<Syncobj_0x3736444333313842Record> {

    private static final long serialVersionUID = -1687455168;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842</code>
     */
    public static final Syncobj_0x3736444333313842 SYNCOBJ_0X3736444333313842 = new Syncobj_0x3736444333313842();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Syncobj_0x3736444333313842Record> getRecordType() {
        return Syncobj_0x3736444333313842Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.guid</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.id</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.fk_reservation</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.booking_language</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, String> BOOKING_LANGUAGE = createField("booking_language", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.rate_code</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, String> RATE_CODE = createField("rate_code", org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.agent_assigned_number</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, String> AGENT_ASSIGNED_NUMBER = createField("agent_assigned_number", org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.noshow</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Boolean> NOSHOW = createField("noshow", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.fk_user</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Integer> FK_USER = createField("fk_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.trackingAcquiredBy</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Integer> TRACKINGACQUIREDBY = createField("trackingAcquiredBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.trackingAmendedBy</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Integer> TRACKINGAMENDEDBY = createField("trackingAmendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.trackingConfirmedBy</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Integer> TRACKINGCONFIRMEDBY = createField("trackingConfirmedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.trackingDeniedBy</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Integer> TRACKINGDENIEDBY = createField("trackingDeniedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.trackingCancelledBy</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Integer> TRACKINGCANCELLEDBY = createField("trackingCancelledBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.pp_noshow</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Boolean> PP_NOSHOW = createField("pp_noshow", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842.non_rental</code>.
     */
    public final TableField<Syncobj_0x3736444333313842Record, Boolean> NON_RENTAL = createField("non_rental", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842</code> table reference
     */
    public Syncobj_0x3736444333313842() {
        this(DSL.name("syncobj_0x3736444333313842"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842</code> table reference
     */
    public Syncobj_0x3736444333313842(String alias) {
        this(DSL.name(alias), SYNCOBJ_0X3736444333313842);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x3736444333313842</code> table reference
     */
    public Syncobj_0x3736444333313842(Name alias) {
        this(alias, SYNCOBJ_0X3736444333313842);
    }

    private Syncobj_0x3736444333313842(Name alias, Table<Syncobj_0x3736444333313842Record> aliased) {
        this(alias, aliased, null);
    }

    private Syncobj_0x3736444333313842(Name alias, Table<Syncobj_0x3736444333313842Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Syncobj_0x3736444333313842(Table<O> child, ForeignKey<O, Syncobj_0x3736444333313842Record> key) {
        super(child, key, SYNCOBJ_0X3736444333313842);
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
    public Identity<Syncobj_0x3736444333313842Record, Integer> getIdentity() {
        return Keys.IDENTITY_SYNCOBJ_0X3736444333313842;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3736444333313842 as(String alias) {
        return new Syncobj_0x3736444333313842(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3736444333313842 as(Name alias) {
        return new Syncobj_0x3736444333313842(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x3736444333313842 rename(String name) {
        return new Syncobj_0x3736444333313842(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x3736444333313842 rename(Name name) {
        return new Syncobj_0x3736444333313842(name, null);
    }
}
