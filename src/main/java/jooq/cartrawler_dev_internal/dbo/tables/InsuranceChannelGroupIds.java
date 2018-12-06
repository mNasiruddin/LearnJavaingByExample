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
import jooq.cartrawler_dev_internal.dbo.tables.records.InsuranceChannelGroupIdsRecord;

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
public class InsuranceChannelGroupIds extends TableImpl<InsuranceChannelGroupIdsRecord> {

    private static final long serialVersionUID = -13741629;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.insurance_channel_group_ids</code>
     */
    public static final InsuranceChannelGroupIds INSURANCE_CHANNEL_GROUP_IDS = new InsuranceChannelGroupIds();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InsuranceChannelGroupIdsRecord> getRecordType() {
        return InsuranceChannelGroupIdsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_channel_group_ids.id</code>.
     */
    public final TableField<InsuranceChannelGroupIdsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_channel_group_ids.ref</code>.
     */
    public final TableField<InsuranceChannelGroupIdsRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_channel_group_ids.channel_id</code>.
     */
    public final TableField<InsuranceChannelGroupIdsRecord, Integer> CHANNEL_ID = createField("channel_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.insurance_channel_group_ids</code> table reference
     */
    public InsuranceChannelGroupIds() {
        this(DSL.name("insurance_channel_group_ids"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.insurance_channel_group_ids</code> table reference
     */
    public InsuranceChannelGroupIds(String alias) {
        this(DSL.name(alias), INSURANCE_CHANNEL_GROUP_IDS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.insurance_channel_group_ids</code> table reference
     */
    public InsuranceChannelGroupIds(Name alias) {
        this(alias, INSURANCE_CHANNEL_GROUP_IDS);
    }

    private InsuranceChannelGroupIds(Name alias, Table<InsuranceChannelGroupIdsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InsuranceChannelGroupIds(Name alias, Table<InsuranceChannelGroupIdsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InsuranceChannelGroupIds(Table<O> child, ForeignKey<O, InsuranceChannelGroupIdsRecord> key) {
        super(child, key, INSURANCE_CHANNEL_GROUP_IDS);
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
        return Arrays.<Index>asList(Indexes.INSURANCE_CHANNEL_GROUP_IDS_PK__INSURANC__3213E83F123D52BF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<InsuranceChannelGroupIdsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INSURANCE_CHANNEL_GROUP_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InsuranceChannelGroupIdsRecord> getPrimaryKey() {
        return Keys.PK__INSURANC__3213E83F123D52BF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InsuranceChannelGroupIdsRecord>> getKeys() {
        return Arrays.<UniqueKey<InsuranceChannelGroupIdsRecord>>asList(Keys.PK__INSURANC__3213E83F123D52BF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceChannelGroupIds as(String alias) {
        return new InsuranceChannelGroupIds(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceChannelGroupIds as(Name alias) {
        return new InsuranceChannelGroupIds(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InsuranceChannelGroupIds rename(String name) {
        return new InsuranceChannelGroupIds(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InsuranceChannelGroupIds rename(Name name) {
        return new InsuranceChannelGroupIds(name, null);
    }
}
