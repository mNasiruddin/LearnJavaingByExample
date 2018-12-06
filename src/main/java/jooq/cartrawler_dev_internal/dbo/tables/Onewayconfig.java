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
import jooq.cartrawler_dev_internal.dbo.tables.records.OnewayconfigRecord;

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
public class Onewayconfig extends TableImpl<OnewayconfigRecord> {

    private static final long serialVersionUID = -2013980291;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.OneWayConfig</code>
     */
    public static final Onewayconfig ONEWAYCONFIG = new Onewayconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OnewayconfigRecord> getRecordType() {
        return OnewayconfigRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.id</code>.
     */
    public final TableField<OnewayconfigRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.car_agent_id</code>.
     */
    public final TableField<OnewayconfigRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.name</code>.
     */
    public final TableField<OnewayconfigRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.from_days</code>.
     */
    public final TableField<OnewayconfigRecord, Short> FROM_DAYS = createField("from_days", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.to_days</code>.
     */
    public final TableField<OnewayconfigRecord, Short> TO_DAYS = createField("to_days", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.charge</code>.
     */
    public final TableField<OnewayconfigRecord, BigDecimal> CHARGE = createField("charge", org.jooq.impl.SQLDataType.NUMERIC(16, 6).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.currency</code>.
     */
    public final TableField<OnewayconfigRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.tax_exclusive</code>.
     */
    public final TableField<OnewayconfigRecord, Boolean> TAX_EXCLUSIVE = createField("tax_exclusive", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.rerverse</code>.
     */
    public final TableField<OnewayconfigRecord, Boolean> RERVERSE = createField("rerverse", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.exclude_car_groups</code>.
     */
    public final TableField<OnewayconfigRecord, Boolean> EXCLUDE_CAR_GROUPS = createField("exclude_car_groups", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.onrequest</code>.
     */
    public final TableField<OnewayconfigRecord, Boolean> ONREQUEST = createField("onrequest", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.booking_from</code>.
     */
    public final TableField<OnewayconfigRecord, Long> BOOKING_FROM = createField("booking_from", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.booking_to</code>.
     */
    public final TableField<OnewayconfigRecord, Long> BOOKING_TO = createField("booking_to", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.pickup_from</code>.
     */
    public final TableField<OnewayconfigRecord, Long> PICKUP_FROM = createField("pickup_from", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.pickup_to</code>.
     */
    public final TableField<OnewayconfigRecord, Long> PICKUP_TO = createField("pickup_to", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.all_car_groups</code>.
     */
    public final TableField<OnewayconfigRecord, Boolean> ALL_CAR_GROUPS = createField("all_car_groups", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.last_updated</code>.
     */
    public final TableField<OnewayconfigRecord, Long> LAST_UPDATED = createField("last_updated", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.free</code>.
     */
    public final TableField<OnewayconfigRecord, Boolean> FREE = createField("free", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneWayConfig.disallowed</code>.
     */
    public final TableField<OnewayconfigRecord, Boolean> DISALLOWED = createField("disallowed", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.OneWayConfig</code> table reference
     */
    public Onewayconfig() {
        this(DSL.name("OneWayConfig"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OneWayConfig</code> table reference
     */
    public Onewayconfig(String alias) {
        this(DSL.name(alias), ONEWAYCONFIG);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OneWayConfig</code> table reference
     */
    public Onewayconfig(Name alias) {
        this(alias, ONEWAYCONFIG);
    }

    private Onewayconfig(Name alias, Table<OnewayconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private Onewayconfig(Name alias, Table<OnewayconfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Onewayconfig(Table<O> child, ForeignKey<O, OnewayconfigRecord> key) {
        super(child, key, ONEWAYCONFIG);
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
        return Arrays.<Index>asList(Indexes.ONEWAYCONFIG_PK_ONEWAYCONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OnewayconfigRecord, Long> getIdentity() {
        return Keys.IDENTITY_ONEWAYCONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OnewayconfigRecord> getPrimaryKey() {
        return Keys.PK_ONEWAYCONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OnewayconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<OnewayconfigRecord>>asList(Keys.PK_ONEWAYCONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onewayconfig as(String alias) {
        return new Onewayconfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onewayconfig as(Name alias) {
        return new Onewayconfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Onewayconfig rename(String name) {
        return new Onewayconfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Onewayconfig rename(Name name) {
        return new Onewayconfig(name, null);
    }
}
