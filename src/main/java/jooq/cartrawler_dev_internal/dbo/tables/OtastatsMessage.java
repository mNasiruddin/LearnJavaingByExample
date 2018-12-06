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
import jooq.cartrawler_dev_internal.dbo.tables.records.OtastatsMessageRecord;

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
public class OtastatsMessage extends TableImpl<OtastatsMessageRecord> {

    private static final long serialVersionUID = -1027739102;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.otastats_message</code>
     */
    public static final OtastatsMessage OTASTATS_MESSAGE = new OtastatsMessage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OtastatsMessageRecord> getRecordType() {
        return OtastatsMessageRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.id</code>.
     */
    public final TableField<OtastatsMessageRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.query_id</code>.
     */
    public final TableField<OtastatsMessageRecord, Integer> QUERY_ID = createField("query_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.name</code>.
     */
    public final TableField<OtastatsMessageRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.counter</code>.
     */
    public final TableField<OtastatsMessageRecord, Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.maxconcurrent</code>.
     */
    public final TableField<OtastatsMessageRecord, Integer> MAXCONCURRENT = createField("maxconcurrent", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.time</code>.
     */
    public final TableField<OtastatsMessageRecord, Long> TIME = createField("time", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.maxtime</code>.
     */
    public final TableField<OtastatsMessageRecord, Integer> MAXTIME = createField("maxtime", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.errorcounter</code>.
     */
    public final TableField<OtastatsMessageRecord, Integer> ERRORCOUNTER = createField("errorcounter", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.requestsize</code>.
     */
    public final TableField<OtastatsMessageRecord, Long> REQUESTSIZE = createField("requestsize", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.responsesize</code>.
     */
    public final TableField<OtastatsMessageRecord, Long> RESPONSESIZE = createField("responsesize", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.messageerrorcounter</code>.
     */
    public final TableField<OtastatsMessageRecord, Integer> MESSAGEERRORCOUNTER = createField("messageerrorcounter", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otastats_message.concurrent</code>.
     */
    public final TableField<OtastatsMessageRecord, Integer> CONCURRENT = createField("concurrent", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.otastats_message</code> table reference
     */
    public OtastatsMessage() {
        this(DSL.name("otastats_message"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.otastats_message</code> table reference
     */
    public OtastatsMessage(String alias) {
        this(DSL.name(alias), OTASTATS_MESSAGE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.otastats_message</code> table reference
     */
    public OtastatsMessage(Name alias) {
        this(alias, OTASTATS_MESSAGE);
    }

    private OtastatsMessage(Name alias, Table<OtastatsMessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private OtastatsMessage(Name alias, Table<OtastatsMessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OtastatsMessage(Table<O> child, ForeignKey<O, OtastatsMessageRecord> key) {
        super(child, key, OTASTATS_MESSAGE);
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
        return Arrays.<Index>asList(Indexes.OTASTATS_MESSAGE_PK_OTASTATS_MESSAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OtastatsMessageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OTASTATS_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OtastatsMessageRecord> getPrimaryKey() {
        return Keys.PK_OTASTATS_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OtastatsMessageRecord>> getKeys() {
        return Arrays.<UniqueKey<OtastatsMessageRecord>>asList(Keys.PK_OTASTATS_MESSAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtastatsMessage as(String alias) {
        return new OtastatsMessage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtastatsMessage as(Name alias) {
        return new OtastatsMessage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OtastatsMessage rename(String name) {
        return new OtastatsMessage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OtastatsMessage rename(Name name) {
        return new OtastatsMessage(name, null);
    }
}
