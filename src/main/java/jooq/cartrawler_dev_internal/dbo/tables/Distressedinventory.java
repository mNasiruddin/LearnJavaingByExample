/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.DistressedinventoryRecord;

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
public class Distressedinventory extends TableImpl<DistressedinventoryRecord> {

    private static final long serialVersionUID = -1479834606;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.DistressedInventory</code>
     */
    public static final Distressedinventory DISTRESSEDINVENTORY = new Distressedinventory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DistressedinventoryRecord> getRecordType() {
        return DistressedinventoryRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.id</code>.
     */
    public final TableField<DistressedinventoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.car_agent_id</code>.
     */
    public final TableField<DistressedinventoryRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.car_agent_location_code</code>.
     */
    public final TableField<DistressedinventoryRecord, String> CAR_AGENT_LOCATION_CODE = createField("car_agent_location_code", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.active_from</code>.
     */
    public final TableField<DistressedinventoryRecord, Long> ACTIVE_FROM = createField("active_from", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.active_to</code>.
     */
    public final TableField<DistressedinventoryRecord, Long> ACTIVE_TO = createField("active_to", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.SIPP</code>.
     */
    public final TableField<DistressedinventoryRecord, String> SIPP = createField("SIPP", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.max_margin</code>.
     */
    public final TableField<DistressedinventoryRecord, UByte> MAX_MARGIN = createField("max_margin", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.min_duration</code>.
     */
    public final TableField<DistressedinventoryRecord, Short> MIN_DURATION = createField("min_duration", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.max_duration</code>.
     */
    public final TableField<DistressedinventoryRecord, Short> MAX_DURATION = createField("max_duration", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.contract</code>.
     */
    public final TableField<DistressedinventoryRecord, String> CONTRACT = createField("contract", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.max_rentals</code>.
     */
    public final TableField<DistressedinventoryRecord, Short> MAX_RENTALS = createField("max_rentals", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.BookingsCount</code>.
     */
    public final TableField<DistressedinventoryRecord, Short> BOOKINGSCOUNT = createField("BookingsCount", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventory.type</code>.
     */
    public final TableField<DistressedinventoryRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.DistressedInventory</code> table reference
     */
    public Distressedinventory() {
        this(DSL.name("DistressedInventory"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.DistressedInventory</code> table reference
     */
    public Distressedinventory(String alias) {
        this(DSL.name(alias), DISTRESSEDINVENTORY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.DistressedInventory</code> table reference
     */
    public Distressedinventory(Name alias) {
        this(alias, DISTRESSEDINVENTORY);
    }

    private Distressedinventory(Name alias, Table<DistressedinventoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Distressedinventory(Name alias, Table<DistressedinventoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Distressedinventory(Table<O> child, ForeignKey<O, DistressedinventoryRecord> key) {
        super(child, key, DISTRESSEDINVENTORY);
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
        return Arrays.<Index>asList(Indexes.DISTRESSEDINVENTORY_PK_DISTRESSEDINVENTORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DistressedinventoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DISTRESSEDINVENTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DistressedinventoryRecord> getPrimaryKey() {
        return Keys.PK_DISTRESSEDINVENTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DistressedinventoryRecord>> getKeys() {
        return Arrays.<UniqueKey<DistressedinventoryRecord>>asList(Keys.PK_DISTRESSEDINVENTORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Distressedinventory as(String alias) {
        return new Distressedinventory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Distressedinventory as(Name alias) {
        return new Distressedinventory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Distressedinventory rename(String name) {
        return new Distressedinventory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Distressedinventory rename(Name name) {
        return new Distressedinventory(name, null);
    }
}
