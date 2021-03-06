/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.EmailqueueRecord;

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
public class Emailqueue extends TableImpl<EmailqueueRecord> {

    private static final long serialVersionUID = 332812608;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.EmailQueue</code>
     */
    public static final Emailqueue EMAILQUEUE = new Emailqueue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailqueueRecord> getRecordType() {
        return EmailqueueRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.guid</code>.
     */
    public final TableField<EmailqueueRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.id</code>.
     */
    public final TableField<EmailqueueRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.fk_reservation</code>.
     */
    public final TableField<EmailqueueRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.status</code>.
     */
    public final TableField<EmailqueueRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.type</code>.
     */
    public final TableField<EmailqueueRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.maildate</code>.
     */
    public final TableField<EmailqueueRecord, Timestamp> MAILDATE = createField("maildate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.count</code>.
     */
    public final TableField<EmailqueueRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.overrideEmail</code>.
     */
    public final TableField<EmailqueueRecord, String> OVERRIDEEMAIL = createField("overrideEmail", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.ignoreDepositCheck</code>.
     */
    public final TableField<EmailqueueRecord, Integer> IGNOREDEPOSITCHECK = createField("ignoreDepositCheck", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailQueue.overrideLanguage</code>.
     */
    public final TableField<EmailqueueRecord, String> OVERRIDELANGUAGE = createField("overrideLanguage", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.EmailQueue</code> table reference
     */
    public Emailqueue() {
        this(DSL.name("EmailQueue"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.EmailQueue</code> table reference
     */
    public Emailqueue(String alias) {
        this(DSL.name(alias), EMAILQUEUE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.EmailQueue</code> table reference
     */
    public Emailqueue(Name alias) {
        this(alias, EMAILQUEUE);
    }

    private Emailqueue(Name alias, Table<EmailqueueRecord> aliased) {
        this(alias, aliased, null);
    }

    private Emailqueue(Name alias, Table<EmailqueueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Emailqueue(Table<O> child, ForeignKey<O, EmailqueueRecord> key) {
        super(child, key, EMAILQUEUE);
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
        return Arrays.<Index>asList(Indexes.EMAILQUEUE_PK_EMAILQUEUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EmailqueueRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EMAILQUEUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmailqueueRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailqueueRecord>>asList(Keys.PK_EMAILQUEUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Emailqueue as(String alias) {
        return new Emailqueue(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Emailqueue as(Name alias) {
        return new Emailqueue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Emailqueue rename(String name) {
        return new Emailqueue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Emailqueue rename(Name name) {
        return new Emailqueue(name, null);
    }
}
