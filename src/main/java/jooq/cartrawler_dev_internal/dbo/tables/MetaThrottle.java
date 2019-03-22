/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.MetaThrottleRecord;

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
public class MetaThrottle extends TableImpl<MetaThrottleRecord> {

    private static final long serialVersionUID = -776555920;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.meta_throttle</code>
     */
    public static final MetaThrottle META_THROTTLE = new MetaThrottle();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MetaThrottleRecord> getRecordType() {
        return MetaThrottleRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.meta_throttle.id</code>.
     */
    public final TableField<MetaThrottleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.meta_throttle.client_id</code>.
     */
    public final TableField<MetaThrottleRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.meta_throttle.pickup_loc</code>.
     */
    public final TableField<MetaThrottleRecord, Integer> PICKUP_LOC = createField("pickup_loc", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.meta_throttle.Duration_low</code>.
     */
    public final TableField<MetaThrottleRecord, Short> DURATION_LOW = createField("Duration_low", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.meta_throttle.Duration_high</code>.
     */
    public final TableField<MetaThrottleRecord, Short> DURATION_HIGH = createField("Duration_high", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.meta_throttle.Pickup_start</code>.
     */
    public final TableField<MetaThrottleRecord, Date> PICKUP_START = createField("Pickup_start", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.meta_throttle.Pickup_end</code>.
     */
    public final TableField<MetaThrottleRecord, Date> PICKUP_END = createField("Pickup_end", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.meta_throttle</code> table reference
     */
    public MetaThrottle() {
        this(DSL.name("meta_throttle"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.meta_throttle</code> table reference
     */
    public MetaThrottle(String alias) {
        this(DSL.name(alias), META_THROTTLE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.meta_throttle</code> table reference
     */
    public MetaThrottle(Name alias) {
        this(alias, META_THROTTLE);
    }

    private MetaThrottle(Name alias, Table<MetaThrottleRecord> aliased) {
        this(alias, aliased, null);
    }

    private MetaThrottle(Name alias, Table<MetaThrottleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MetaThrottle(Table<O> child, ForeignKey<O, MetaThrottleRecord> key) {
        super(child, key, META_THROTTLE);
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
        return Arrays.<Index>asList(Indexes.META_THROTTLE_PK__META_THR__3213E83F78421BDA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MetaThrottleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_META_THROTTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MetaThrottleRecord> getPrimaryKey() {
        return Keys.PK__META_THR__3213E83F78421BDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MetaThrottleRecord>> getKeys() {
        return Arrays.<UniqueKey<MetaThrottleRecord>>asList(Keys.PK__META_THR__3213E83F78421BDA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetaThrottle as(String alias) {
        return new MetaThrottle(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetaThrottle as(Name alias) {
        return new MetaThrottle(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MetaThrottle rename(String name) {
        return new MetaThrottle(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MetaThrottle rename(Name name) {
        return new MetaThrottle(name, null);
    }
}