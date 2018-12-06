/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ScheduledalertsRecord;

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
public class Scheduledalerts extends TableImpl<ScheduledalertsRecord> {

    private static final long serialVersionUID = -1052944715;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.scheduledAlerts</code>
     */
    public static final Scheduledalerts SCHEDULEDALERTS = new Scheduledalerts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScheduledalertsRecord> getRecordType() {
        return ScheduledalertsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.guid</code>.
     */
    public final TableField<ScheduledalertsRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.id</code>.
     */
    public final TableField<ScheduledalertsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.fk_savedReport</code>.
     */
    public final TableField<ScheduledalertsRecord, Integer> FK_SAVEDREPORT = createField("fk_savedReport", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.rowsWith</code>.
     */
    public final TableField<ScheduledalertsRecord, String> ROWSWITH = createField("rowsWith", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.equalTo</code>.
     */
    public final TableField<ScheduledalertsRecord, String> EQUALTO = createField("equalTo", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.triggerField</code>.
     */
    public final TableField<ScheduledalertsRecord, String> TRIGGERFIELD = createField("triggerField", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.triggerMode</code>.
     */
    public final TableField<ScheduledalertsRecord, Integer> TRIGGERMODE = createField("triggerMode", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.triggerValue</code>.
     */
    public final TableField<ScheduledalertsRecord, BigDecimal> TRIGGERVALUE = createField("triggerValue", org.jooq.impl.SQLDataType.NUMERIC(18, 2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.email</code>.
     */
    public final TableField<ScheduledalertsRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.sms</code>.
     */
    public final TableField<ScheduledalertsRecord, String> SMS = createField("sms", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.minimumActivity</code>.
     */
    public final TableField<ScheduledalertsRecord, Integer> MINIMUMACTIVITY = createField("minimumActivity", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.fk_user</code>.
     */
    public final TableField<ScheduledalertsRecord, Integer> FK_USER = createField("fk_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.plugin</code>.
     */
    public final TableField<ScheduledalertsRecord, String> PLUGIN = createField("plugin", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.notes</code>.
     */
    public final TableField<ScheduledalertsRecord, String> NOTES = createField("notes", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.enhanced</code>.
     */
    public final TableField<ScheduledalertsRecord, Boolean> ENHANCED = createField("enhanced", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("((1))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.responsible</code>.
     */
    public final TableField<ScheduledalertsRecord, Integer> RESPONSIBLE = createField("responsible", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.priority</code>.
     */
    public final TableField<ScheduledalertsRecord, Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scheduledAlerts.ignoreUntil</code>.
     */
    public final TableField<ScheduledalertsRecord, Timestamp> IGNOREUNTIL = createField("ignoreUntil", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.scheduledAlerts</code> table reference
     */
    public Scheduledalerts() {
        this(DSL.name("scheduledAlerts"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.scheduledAlerts</code> table reference
     */
    public Scheduledalerts(String alias) {
        this(DSL.name(alias), SCHEDULEDALERTS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.scheduledAlerts</code> table reference
     */
    public Scheduledalerts(Name alias) {
        this(alias, SCHEDULEDALERTS);
    }

    private Scheduledalerts(Name alias, Table<ScheduledalertsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Scheduledalerts(Name alias, Table<ScheduledalertsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Scheduledalerts(Table<O> child, ForeignKey<O, ScheduledalertsRecord> key) {
        super(child, key, SCHEDULEDALERTS);
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
        return Arrays.<Index>asList(Indexes.SCHEDULEDALERTS_PK_SCHEDULEDALERTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ScheduledalertsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SCHEDULEDALERTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ScheduledalertsRecord> getPrimaryKey() {
        return Keys.PK_SCHEDULEDALERTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScheduledalertsRecord>> getKeys() {
        return Arrays.<UniqueKey<ScheduledalertsRecord>>asList(Keys.PK_SCHEDULEDALERTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scheduledalerts as(String alias) {
        return new Scheduledalerts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scheduledalerts as(Name alias) {
        return new Scheduledalerts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Scheduledalerts rename(String name) {
        return new Scheduledalerts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scheduledalerts rename(Name name) {
        return new Scheduledalerts(name, null);
    }
}
