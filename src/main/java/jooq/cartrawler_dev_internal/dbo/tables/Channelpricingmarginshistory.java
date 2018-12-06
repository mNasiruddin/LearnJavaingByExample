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
import jooq.cartrawler_dev_internal.dbo.tables.records.ChannelpricingmarginshistoryRecord;

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
public class Channelpricingmarginshistory extends TableImpl<ChannelpricingmarginshistoryRecord> {

    private static final long serialVersionUID = -1428602380;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory</code>
     */
    public static final Channelpricingmarginshistory CHANNELPRICINGMARGINSHISTORY = new Channelpricingmarginshistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChannelpricingmarginshistoryRecord> getRecordType() {
        return ChannelpricingmarginshistoryRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.id</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.ref_channelPricingControls</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, Integer> REF_CHANNELPRICINGCONTROLS = createField("ref_channelPricingControls", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.baserate_low</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, BigDecimal> BASERATE_LOW = createField("baserate_low", org.jooq.impl.SQLDataType.NUMERIC(10, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.baserate_high</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, BigDecimal> BASERATE_HIGH = createField("baserate_high", org.jooq.impl.SQLDataType.NUMERIC(10, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.min_margin</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, BigDecimal> MIN_MARGIN = createField("min_margin", org.jooq.impl.SQLDataType.NUMERIC(10, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.default_margin</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, BigDecimal> DEFAULT_MARGIN = createField("default_margin", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.max_margin</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, BigDecimal> MAX_MARGIN = createField("max_margin", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.min_amount</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, BigDecimal> MIN_AMOUNT = createField("min_amount", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.min_amount_currency</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, String> MIN_AMOUNT_CURRENCY = createField("min_amount_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.marginType</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, Short> MARGINTYPE = createField("marginType", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.deletionDate</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, Timestamp> DELETIONDATE = createField("deletionDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory.historyID</code>.
     */
    public final TableField<ChannelpricingmarginshistoryRecord, Integer> HISTORYID = createField("historyID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory</code> table reference
     */
    public Channelpricingmarginshistory() {
        this(DSL.name("ChannelPricingMarginsHistory"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory</code> table reference
     */
    public Channelpricingmarginshistory(String alias) {
        this(DSL.name(alias), CHANNELPRICINGMARGINSHISTORY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ChannelPricingMarginsHistory</code> table reference
     */
    public Channelpricingmarginshistory(Name alias) {
        this(alias, CHANNELPRICINGMARGINSHISTORY);
    }

    private Channelpricingmarginshistory(Name alias, Table<ChannelpricingmarginshistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Channelpricingmarginshistory(Name alias, Table<ChannelpricingmarginshistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Channelpricingmarginshistory(Table<O> child, ForeignKey<O, ChannelpricingmarginshistoryRecord> key) {
        super(child, key, CHANNELPRICINGMARGINSHISTORY);
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
        return Arrays.<Index>asList(Indexes.CHANNELPRICINGMARGINSHISTORY_PK__CHANNELP__19BDBDB36E24801A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ChannelpricingmarginshistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CHANNELPRICINGMARGINSHISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChannelpricingmarginshistoryRecord> getPrimaryKey() {
        return Keys.PK__CHANNELP__19BDBDB36E24801A;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChannelpricingmarginshistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<ChannelpricingmarginshistoryRecord>>asList(Keys.PK__CHANNELP__19BDBDB36E24801A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Channelpricingmarginshistory as(String alias) {
        return new Channelpricingmarginshistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Channelpricingmarginshistory as(Name alias) {
        return new Channelpricingmarginshistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelpricingmarginshistory rename(String name) {
        return new Channelpricingmarginshistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelpricingmarginshistory rename(Name name) {
        return new Channelpricingmarginshistory(name, null);
    }
}
