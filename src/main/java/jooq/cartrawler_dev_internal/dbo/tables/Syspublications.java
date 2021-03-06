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
import jooq.cartrawler_dev_internal.dbo.tables.records.SyspublicationsRecord;

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
public class Syspublications extends TableImpl<SyspublicationsRecord> {

    private static final long serialVersionUID = -1172512718;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.syspublications</code>
     */
    public static final Syspublications SYSPUBLICATIONS = new Syspublications();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SyspublicationsRecord> getRecordType() {
        return SyspublicationsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.description</code>.
     */
    public final TableField<SyspublicationsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.name</code>.
     */
    public final TableField<SyspublicationsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.pubid</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> PUBID = createField("pubid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.repl_freq</code>.
     */
    public final TableField<SyspublicationsRecord, UByte> REPL_FREQ = createField("repl_freq", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.status</code>.
     */
    public final TableField<SyspublicationsRecord, UByte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.sync_method</code>.
     */
    public final TableField<SyspublicationsRecord, UByte> SYNC_METHOD = createField("sync_method", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.snapshot_jobid</code>.
     */
    public final TableField<SyspublicationsRecord, byte[]> SNAPSHOT_JOBID = createField("snapshot_jobid", org.jooq.impl.SQLDataType.BINARY(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.independent_agent</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> INDEPENDENT_AGENT = createField("independent_agent", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.immediate_sync</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> IMMEDIATE_SYNC = createField("immediate_sync", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.enabled_for_internet</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> ENABLED_FOR_INTERNET = createField("enabled_for_internet", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.allow_push</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> ALLOW_PUSH = createField("allow_push", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.allow_pull</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> ALLOW_PULL = createField("allow_pull", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.allow_anonymous</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> ALLOW_ANONYMOUS = createField("allow_anonymous", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.immediate_sync_ready</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> IMMEDIATE_SYNC_READY = createField("immediate_sync_ready", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.allow_sync_tran</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> ALLOW_SYNC_TRAN = createField("allow_sync_tran", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.autogen_sync_procs</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> AUTOGEN_SYNC_PROCS = createField("autogen_sync_procs", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.retention</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> RETENTION = createField("retention", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.allow_queued_tran</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> ALLOW_QUEUED_TRAN = createField("allow_queued_tran", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.snapshot_in_defaultfolder</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> SNAPSHOT_IN_DEFAULTFOLDER = createField("snapshot_in_defaultfolder", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((1))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.alt_snapshot_folder</code>.
     */
    public final TableField<SyspublicationsRecord, String> ALT_SNAPSHOT_FOLDER = createField("alt_snapshot_folder", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.pre_snapshot_script</code>.
     */
    public final TableField<SyspublicationsRecord, String> PRE_SNAPSHOT_SCRIPT = createField("pre_snapshot_script", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.post_snapshot_script</code>.
     */
    public final TableField<SyspublicationsRecord, String> POST_SNAPSHOT_SCRIPT = createField("post_snapshot_script", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.compress_snapshot</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> COMPRESS_SNAPSHOT = createField("compress_snapshot", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.ftp_address</code>.
     */
    public final TableField<SyspublicationsRecord, String> FTP_ADDRESS = createField("ftp_address", org.jooq.impl.SQLDataType.NVARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.ftp_port</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> FTP_PORT = createField("ftp_port", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("((21))", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.ftp_subdirectory</code>.
     */
    public final TableField<SyspublicationsRecord, String> FTP_SUBDIRECTORY = createField("ftp_subdirectory", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.ftp_login</code>.
     */
    public final TableField<SyspublicationsRecord, String> FTP_LOGIN = createField("ftp_login", org.jooq.impl.SQLDataType.NVARCHAR(128).defaultValue(org.jooq.impl.DSL.field("(N'anonymous')", org.jooq.impl.SQLDataType.NVARCHAR)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.ftp_password</code>.
     */
    public final TableField<SyspublicationsRecord, String> FTP_PASSWORD = createField("ftp_password", org.jooq.impl.SQLDataType.NVARCHAR(524), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.allow_dts</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> ALLOW_DTS = createField("allow_dts", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.allow_subscription_copy</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> ALLOW_SUBSCRIPTION_COPY = createField("allow_subscription_copy", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.centralized_conflicts</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> CENTRALIZED_CONFLICTS = createField("centralized_conflicts", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.conflict_retention</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> CONFLICT_RETENTION = createField("conflict_retention", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.conflict_policy</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> CONFLICT_POLICY = createField("conflict_policy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.queue_type</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> QUEUE_TYPE = createField("queue_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.ad_guidname</code>.
     */
    public final TableField<SyspublicationsRecord, String> AD_GUIDNAME = createField("ad_guidname", org.jooq.impl.SQLDataType.NVARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.backward_comp_level</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> BACKWARD_COMP_LEVEL = createField("backward_comp_level", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("((10))", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.allow_initialize_from_backup</code>.
     */
    public final TableField<SyspublicationsRecord, Boolean> ALLOW_INITIALIZE_FROM_BACKUP = createField("allow_initialize_from_backup", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.min_autonosync_lsn</code>.
     */
    public final TableField<SyspublicationsRecord, byte[]> MIN_AUTONOSYNC_LSN = createField("min_autonosync_lsn", org.jooq.impl.SQLDataType.BINARY(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.replicate_ddl</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> REPLICATE_DDL = createField("replicate_ddl", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("((1))", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.options</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> OPTIONS = createField("options", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syspublications.originator_id</code>.
     */
    public final TableField<SyspublicationsRecord, Integer> ORIGINATOR_ID = createField("originator_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.syspublications</code> table reference
     */
    public Syspublications() {
        this(DSL.name("syspublications"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syspublications</code> table reference
     */
    public Syspublications(String alias) {
        this(DSL.name(alias), SYSPUBLICATIONS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syspublications</code> table reference
     */
    public Syspublications(Name alias) {
        this(alias, SYSPUBLICATIONS);
    }

    private Syspublications(Name alias, Table<SyspublicationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Syspublications(Name alias, Table<SyspublicationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Syspublications(Table<O> child, ForeignKey<O, SyspublicationsRecord> key) {
        super(child, key, SYSPUBLICATIONS);
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
        return Arrays.<Index>asList(Indexes.SYSPUBLICATIONS_NC3SYSPUBLICATIONS, Indexes.SYSPUBLICATIONS_UC1SYSPUBLICATIONS, Indexes.SYSPUBLICATIONS_UNC2SYSPUBLICATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SyspublicationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SYSPUBLICATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SyspublicationsRecord>> getKeys() {
        return Arrays.<UniqueKey<SyspublicationsRecord>>asList(Keys.UNC2SYSPUBLICATIONS, Keys.UC1SYSPUBLICATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syspublications as(String alias) {
        return new Syspublications(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syspublications as(Name alias) {
        return new Syspublications(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syspublications rename(String name) {
        return new Syspublications(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Syspublications rename(Name name) {
        return new Syspublications(name, null);
    }
}
