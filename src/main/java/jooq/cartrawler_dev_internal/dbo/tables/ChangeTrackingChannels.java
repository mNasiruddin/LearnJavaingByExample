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
import jooq.cartrawler_dev_internal.dbo.tables.records.ChangeTrackingChannelsRecord;

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
public class ChangeTrackingChannels extends TableImpl<ChangeTrackingChannelsRecord> {

    private static final long serialVersionUID = -1146124505;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.change_tracking_Channels</code>
     */
    public static final ChangeTrackingChannels CHANGE_TRACKING_CHANNELS = new ChangeTrackingChannels();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChangeTrackingChannelsRecord> getRecordType() {
        return ChangeTrackingChannelsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_Channels.car_agent_id</code>.
     */
    public final TableField<ChangeTrackingChannelsRecord, Long> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_Channels.SYS_CHANGE_VERSION</code>.
     */
    public final TableField<ChangeTrackingChannelsRecord, Long> SYS_CHANGE_VERSION = createField("SYS_CHANGE_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_Channels.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public final TableField<ChangeTrackingChannelsRecord, Long> SYS_CHANGE_CREATION_VERSION = createField("SYS_CHANGE_CREATION_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_Channels.SYS_CHANGE_OPERATION</code>.
     */
    public final TableField<ChangeTrackingChannelsRecord, String> SYS_CHANGE_OPERATION = createField("SYS_CHANGE_OPERATION", org.jooq.impl.SQLDataType.NCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_Channels.SYS_CHANGE_COLUMNS</code>.
     */
    public final TableField<ChangeTrackingChannelsRecord, byte[]> SYS_CHANGE_COLUMNS = createField("SYS_CHANGE_COLUMNS", org.jooq.impl.SQLDataType.VARBINARY(4100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_Channels.SYS_CHANGE_CONTEXT</code>.
     */
    public final TableField<ChangeTrackingChannelsRecord, byte[]> SYS_CHANGE_CONTEXT = createField("SYS_CHANGE_CONTEXT", org.jooq.impl.SQLDataType.VARBINARY(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_Channels.Ref</code>.
     */
    public final TableField<ChangeTrackingChannelsRecord, Integer> REF = createField("Ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.change_tracking_Channels</code> table reference
     */
    public ChangeTrackingChannels() {
        this(DSL.name("change_tracking_Channels"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.change_tracking_Channels</code> table reference
     */
    public ChangeTrackingChannels(String alias) {
        this(DSL.name(alias), CHANGE_TRACKING_CHANNELS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.change_tracking_Channels</code> table reference
     */
    public ChangeTrackingChannels(Name alias) {
        this(alias, CHANGE_TRACKING_CHANNELS);
    }

    private ChangeTrackingChannels(Name alias, Table<ChangeTrackingChannelsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChangeTrackingChannels(Name alias, Table<ChangeTrackingChannelsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ChangeTrackingChannels(Table<O> child, ForeignKey<O, ChangeTrackingChannelsRecord> key) {
        super(child, key, CHANGE_TRACKING_CHANNELS);
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
        return Arrays.<Index>asList(Indexes.CHANGE_TRACKING_CHANNELS_PK_CHANGE_CHANNELS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ChangeTrackingChannelsRecord, Long> getIdentity() {
        return Keys.IDENTITY_CHANGE_TRACKING_CHANNELS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChangeTrackingChannelsRecord> getPrimaryKey() {
        return Keys.PK_CHANGE_CHANNELS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChangeTrackingChannelsRecord>> getKeys() {
        return Arrays.<UniqueKey<ChangeTrackingChannelsRecord>>asList(Keys.PK_CHANGE_CHANNELS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeTrackingChannels as(String alias) {
        return new ChangeTrackingChannels(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeTrackingChannels as(Name alias) {
        return new ChangeTrackingChannels(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeTrackingChannels rename(String name) {
        return new ChangeTrackingChannels(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeTrackingChannels rename(Name name) {
        return new ChangeTrackingChannels(name, null);
    }
}
