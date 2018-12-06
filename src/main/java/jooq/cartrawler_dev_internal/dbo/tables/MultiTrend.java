/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.MultiTrendRecord;

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
public class MultiTrend extends TableImpl<MultiTrendRecord> {

    private static final long serialVersionUID = -1887980177;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.multi_trend</code>
     */
    public static final MultiTrend MULTI_TREND = new MultiTrend();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MultiTrendRecord> getRecordType() {
        return MultiTrendRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.multi_trend.id</code>.
     */
    public final TableField<MultiTrendRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.multi_trend.description</code>.
     */
    public final TableField<MultiTrendRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.multi_trend.fk_user</code>.
     */
    public final TableField<MultiTrendRecord, Integer> FK_USER = createField("fk_user", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.multi_trend.updated</code>.
     */
    public final TableField<MultiTrendRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.multi_trend.score_value</code>.
     */
    public final TableField<MultiTrendRecord, Short> SCORE_VALUE = createField("score_value", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.multi_trend.enabled</code>.
     */
    public final TableField<MultiTrendRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.multi_trend.from_hr</code>.
     */
    public final TableField<MultiTrendRecord, Integer> FROM_HR = createField("from_hr", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.multi_trend.to_hr</code>.
     */
    public final TableField<MultiTrendRecord, Integer> TO_HR = createField("to_hr", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.multi_trend</code> table reference
     */
    public MultiTrend() {
        this(DSL.name("multi_trend"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.multi_trend</code> table reference
     */
    public MultiTrend(String alias) {
        this(DSL.name(alias), MULTI_TREND);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.multi_trend</code> table reference
     */
    public MultiTrend(Name alias) {
        this(alias, MULTI_TREND);
    }

    private MultiTrend(Name alias, Table<MultiTrendRecord> aliased) {
        this(alias, aliased, null);
    }

    private MultiTrend(Name alias, Table<MultiTrendRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MultiTrend(Table<O> child, ForeignKey<O, MultiTrendRecord> key) {
        super(child, key, MULTI_TREND);
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
        return Arrays.<Index>asList(Indexes.MULTI_TREND_PK_MULTI_TREND);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MultiTrendRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MULTI_TREND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MultiTrendRecord> getPrimaryKey() {
        return Keys.PK_MULTI_TREND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MultiTrendRecord>> getKeys() {
        return Arrays.<UniqueKey<MultiTrendRecord>>asList(Keys.PK_MULTI_TREND);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MultiTrend as(String alias) {
        return new MultiTrend(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MultiTrend as(Name alias) {
        return new MultiTrend(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MultiTrend rename(String name) {
        return new MultiTrend(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MultiTrend rename(Name name) {
        return new MultiTrend(name, null);
    }
}
