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
import jooq.cartrawler_dev_internal.dbo.tables.records.CampaignindexRecord;

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
public class Campaignindex extends TableImpl<CampaignindexRecord> {

    private static final long serialVersionUID = -1012421492;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.CampaignIndex</code>
     */
    public static final Campaignindex CAMPAIGNINDEX = new Campaignindex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CampaignindexRecord> getRecordType() {
        return CampaignindexRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CampaignIndex.id</code>.
     */
    public final TableField<CampaignindexRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CampaignIndex.client_id</code>.
     */
    public final TableField<CampaignindexRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CampaignIndex.disclaimer</code>.
     */
    public final TableField<CampaignindexRecord, String> DISCLAIMER = createField("disclaimer", org.jooq.impl.SQLDataType.VARCHAR(400), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CampaignIndex.campaign_code</code>.
     */
    public final TableField<CampaignindexRecord, String> CAMPAIGN_CODE = createField("campaign_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CampaignIndex.live</code>.
     */
    public final TableField<CampaignindexRecord, Boolean> LIVE = createField("live", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CampaignIndex.currency</code>.
     */
    public final TableField<CampaignindexRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CampaignIndex.language</code>.
     */
    public final TableField<CampaignindexRecord, String> LANGUAGE = createField("language", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CampaignIndex.residency</code>.
     */
    public final TableField<CampaignindexRecord, String> RESIDENCY = createField("residency", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.CampaignIndex</code> table reference
     */
    public Campaignindex() {
        this(DSL.name("CampaignIndex"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CampaignIndex</code> table reference
     */
    public Campaignindex(String alias) {
        this(DSL.name(alias), CAMPAIGNINDEX);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CampaignIndex</code> table reference
     */
    public Campaignindex(Name alias) {
        this(alias, CAMPAIGNINDEX);
    }

    private Campaignindex(Name alias, Table<CampaignindexRecord> aliased) {
        this(alias, aliased, null);
    }

    private Campaignindex(Name alias, Table<CampaignindexRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Campaignindex(Table<O> child, ForeignKey<O, CampaignindexRecord> key) {
        super(child, key, CAMPAIGNINDEX);
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
        return Arrays.<Index>asList(Indexes.CAMPAIGNINDEX_PK_CAMPAIGNINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CampaignindexRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CAMPAIGNINDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CampaignindexRecord> getPrimaryKey() {
        return Keys.PK_CAMPAIGNINDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CampaignindexRecord>> getKeys() {
        return Arrays.<UniqueKey<CampaignindexRecord>>asList(Keys.PK_CAMPAIGNINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Campaignindex as(String alias) {
        return new Campaignindex(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Campaignindex as(Name alias) {
        return new Campaignindex(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Campaignindex rename(String name) {
        return new Campaignindex(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Campaignindex rename(Name name) {
        return new Campaignindex(name, null);
    }
}
