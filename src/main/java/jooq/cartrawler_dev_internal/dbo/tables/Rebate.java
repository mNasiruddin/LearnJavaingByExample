/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.RebateRecord;

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
public class Rebate extends TableImpl<RebateRecord> {

    private static final long serialVersionUID = -1647898013;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Rebate</code>
     */
    public static final Rebate REBATE = new Rebate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RebateRecord> getRecordType() {
        return RebateRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.guid</code>.
     */
    public final TableField<RebateRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.id</code>.
     */
    public final TableField<RebateRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.description</code>.
     */
    public final TableField<RebateRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.effectiveFrom</code>.
     */
    public final TableField<RebateRecord, Timestamp> EFFECTIVEFROM = createField("effectiveFrom", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.effectiveTo</code>.
     */
    public final TableField<RebateRecord, Timestamp> EFFECTIVETO = createField("effectiveTo", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.pickupFrom</code>.
     */
    public final TableField<RebateRecord, Timestamp> PICKUPFROM = createField("pickupFrom", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.pickupTo</code>.
     */
    public final TableField<RebateRecord, Timestamp> PICKUPTO = createField("pickupTo", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.sipps</code>.
     */
    public final TableField<RebateRecord, String> SIPPS = createField("sipps", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.car_agent_id</code>.
     */
    public final TableField<RebateRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.brand_id</code>.
     */
    public final TableField<RebateRecord, String> BRAND_ID = createField("brand_id", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.fk_virtualLocation</code>.
     */
    public final TableField<RebateRecord, Integer> FK_VIRTUALLOCATION = createField("fk_virtualLocation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.min_rental_days</code>.
     */
    public final TableField<RebateRecord, Integer> MIN_RENTAL_DAYS = createField("min_rental_days", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.max_rental_days</code>.
     */
    public final TableField<RebateRecord, Integer> MAX_RENTAL_DAYS = createField("max_rental_days", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.rebate_type</code>.
     */
    public final TableField<RebateRecord, String> REBATE_TYPE = createField("rebate_type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.rebate_amount</code>.
     */
    public final TableField<RebateRecord, BigDecimal> REBATE_AMOUNT = createField("rebate_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.rebate_currency</code>.
     */
    public final TableField<RebateRecord, String> REBATE_CURRENCY = createField("rebate_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.rebate_in_price</code>.
     */
    public final TableField<RebateRecord, Boolean> REBATE_IN_PRICE = createField("rebate_in_price", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.rebate_activated</code>.
     */
    public final TableField<RebateRecord, Boolean> REBATE_ACTIVATED = createField("rebate_activated", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.min_bookings</code>.
     */
    public final TableField<RebateRecord, Integer> MIN_BOOKINGS = createField("min_bookings", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.max_bookings</code>.
     */
    public final TableField<RebateRecord, Integer> MAX_BOOKINGS = createField("max_bookings", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.rateType</code>.
     */
    public final TableField<RebateRecord, String> RATETYPE = createField("rateType", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.country_id</code>.
     */
    public final TableField<RebateRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Rebate.gradiatedTiers</code>.
     */
    public final TableField<RebateRecord, Boolean> GRADIATEDTIERS = createField("gradiatedTiers", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Rebate</code> table reference
     */
    public Rebate() {
        this(DSL.name("Rebate"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Rebate</code> table reference
     */
    public Rebate(String alias) {
        this(DSL.name(alias), REBATE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Rebate</code> table reference
     */
    public Rebate(Name alias) {
        this(alias, REBATE);
    }

    private Rebate(Name alias, Table<RebateRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rebate(Name alias, Table<RebateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rebate(Table<O> child, ForeignKey<O, RebateRecord> key) {
        super(child, key, REBATE);
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
        return Arrays.<Index>asList(Indexes.REBATE_PK_REBATE_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RebateRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REBATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RebateRecord> getPrimaryKey() {
        return Keys.PK_REBATE_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RebateRecord>> getKeys() {
        return Arrays.<UniqueKey<RebateRecord>>asList(Keys.PK_REBATE_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rebate as(String alias) {
        return new Rebate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rebate as(Name alias) {
        return new Rebate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rebate rename(String name) {
        return new Rebate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rebate rename(Name name) {
        return new Rebate(name, null);
    }
}
