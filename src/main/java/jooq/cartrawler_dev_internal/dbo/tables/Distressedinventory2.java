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
import jooq.cartrawler_dev_internal.dbo.tables.records.Distressedinventory2Record;

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
public class Distressedinventory2 extends TableImpl<Distressedinventory2Record> {

    private static final long serialVersionUID = -1891089013;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.DistressedInventory2</code>
     */
    public static final Distressedinventory2 DISTRESSEDINVENTORY2 = new Distressedinventory2();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Distressedinventory2Record> getRecordType() {
        return Distressedinventory2Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.id</code>.
     */
    public final TableField<Distressedinventory2Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.car_agent_id</code>.
     */
    public final TableField<Distressedinventory2Record, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.car_agent_location_code</code>.
     */
    public final TableField<Distressedinventory2Record, Integer> CAR_AGENT_LOCATION_CODE = createField("car_agent_location_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.active_from</code>.
     */
    public final TableField<Distressedinventory2Record, Timestamp> ACTIVE_FROM = createField("active_from", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.active_to</code>.
     */
    public final TableField<Distressedinventory2Record, Timestamp> ACTIVE_TO = createField("active_to", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.pickupFrom</code>.
     */
    public final TableField<Distressedinventory2Record, Timestamp> PICKUPFROM = createField("pickupFrom", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.pickupTo</code>.
     */
    public final TableField<Distressedinventory2Record, Timestamp> PICKUPTO = createField("pickupTo", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.supplierGroup</code>.
     */
    public final TableField<Distressedinventory2Record, String> SUPPLIERGROUP = createField("supplierGroup", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.mappedSIPP</code>.
     */
    public final TableField<Distressedinventory2Record, String> MAPPEDSIPP = createField("mappedSIPP", org.jooq.impl.SQLDataType.CHAR(4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.rentalDaysRangeStart</code>.
     */
    public final TableField<Distressedinventory2Record, Integer> RENTALDAYSRANGESTART = createField("rentalDaysRangeStart", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.rentalDaysRangeEnd</code>.
     */
    public final TableField<Distressedinventory2Record, Integer> RENTALDAYSRANGEEND = createField("rentalDaysRangeEnd", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.exclusive</code>.
     */
    public final TableField<Distressedinventory2Record, Boolean> EXCLUSIVE = createField("exclusive", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.email</code>.
     */
    public final TableField<Distressedinventory2Record, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.SMS</code>.
     */
    public final TableField<Distressedinventory2Record, String> SMS = createField("SMS", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.maxBookings</code>.
     */
    public final TableField<Distressedinventory2Record, Integer> MAXBOOKINGS = createField("maxBookings", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.dailyBaseRateEUR</code>.
     */
    public final TableField<Distressedinventory2Record, BigDecimal> DAILYBASERATEEUR = createField("dailyBaseRateEUR", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory2.createDate</code>.
     */
    public final TableField<Distressedinventory2Record, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.DistressedInventory2</code> table reference
     */
    public Distressedinventory2() {
        this(DSL.name("DistressedInventory2"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.DistressedInventory2</code> table reference
     */
    public Distressedinventory2(String alias) {
        this(DSL.name(alias), DISTRESSEDINVENTORY2);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.DistressedInventory2</code> table reference
     */
    public Distressedinventory2(Name alias) {
        this(alias, DISTRESSEDINVENTORY2);
    }

    private Distressedinventory2(Name alias, Table<Distressedinventory2Record> aliased) {
        this(alias, aliased, null);
    }

    private Distressedinventory2(Name alias, Table<Distressedinventory2Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Distressedinventory2(Table<O> child, ForeignKey<O, Distressedinventory2Record> key) {
        super(child, key, DISTRESSEDINVENTORY2);
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
        return Arrays.<Index>asList(Indexes.DISTRESSEDINVENTORY2_PK_DISTRESSEDINVENTORY2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<Distressedinventory2Record, Integer> getIdentity() {
        return Keys.IDENTITY_DISTRESSEDINVENTORY2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Distressedinventory2Record> getPrimaryKey() {
        return Keys.PK_DISTRESSEDINVENTORY2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Distressedinventory2Record>> getKeys() {
        return Arrays.<UniqueKey<Distressedinventory2Record>>asList(Keys.PK_DISTRESSEDINVENTORY2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Distressedinventory2 as(String alias) {
        return new Distressedinventory2(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Distressedinventory2 as(Name alias) {
        return new Distressedinventory2(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Distressedinventory2 rename(String name) {
        return new Distressedinventory2(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Distressedinventory2 rename(Name name) {
        return new Distressedinventory2(name, null);
    }
}
