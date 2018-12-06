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
import jooq.cartrawler_dev_internal.dbo.tables.records.SysarticlesRecord;

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
public class Sysarticles extends TableImpl<SysarticlesRecord> {

    private static final long serialVersionUID = -1112752459;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.sysarticles</code>
     */
    public static final Sysarticles SYSARTICLES = new Sysarticles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysarticlesRecord> getRecordType() {
        return SysarticlesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.artid</code>.
     */
    public final TableField<SysarticlesRecord, Integer> ARTID = createField("artid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.creation_script</code>.
     */
    public final TableField<SysarticlesRecord, String> CREATION_SCRIPT = createField("creation_script", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.del_cmd</code>.
     */
    public final TableField<SysarticlesRecord, String> DEL_CMD = createField("del_cmd", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.description</code>.
     */
    public final TableField<SysarticlesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.dest_table</code>.
     */
    public final TableField<SysarticlesRecord, String> DEST_TABLE = createField("dest_table", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.filter</code>.
     */
    public final TableField<SysarticlesRecord, Integer> FILTER = createField("filter", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.filter_clause</code>.
     */
    public final TableField<SysarticlesRecord, String> FILTER_CLAUSE = createField("filter_clause", org.jooq.impl.SQLDataType.NCLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.ins_cmd</code>.
     */
    public final TableField<SysarticlesRecord, String> INS_CMD = createField("ins_cmd", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.name</code>.
     */
    public final TableField<SysarticlesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.objid</code>.
     */
    public final TableField<SysarticlesRecord, Integer> OBJID = createField("objid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.pubid</code>.
     */
    public final TableField<SysarticlesRecord, Integer> PUBID = createField("pubid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.pre_creation_cmd</code>.
     */
    public final TableField<SysarticlesRecord, UByte> PRE_CREATION_CMD = createField("pre_creation_cmd", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.status</code>.
     */
    public final TableField<SysarticlesRecord, UByte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.sync_objid</code>.
     */
    public final TableField<SysarticlesRecord, Integer> SYNC_OBJID = createField("sync_objid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.type</code>.
     */
    public final TableField<SysarticlesRecord, UByte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.upd_cmd</code>.
     */
    public final TableField<SysarticlesRecord, String> UPD_CMD = createField("upd_cmd", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.schema_option</code>.
     */
    public final TableField<SysarticlesRecord, byte[]> SCHEMA_OPTION = createField("schema_option", org.jooq.impl.SQLDataType.BINARY(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.dest_owner</code>.
     */
    public final TableField<SysarticlesRecord, String> DEST_OWNER = createField("dest_owner", org.jooq.impl.SQLDataType.NVARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.ins_scripting_proc</code>.
     */
    public final TableField<SysarticlesRecord, Integer> INS_SCRIPTING_PROC = createField("ins_scripting_proc", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.del_scripting_proc</code>.
     */
    public final TableField<SysarticlesRecord, Integer> DEL_SCRIPTING_PROC = createField("del_scripting_proc", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.upd_scripting_proc</code>.
     */
    public final TableField<SysarticlesRecord, Integer> UPD_SCRIPTING_PROC = createField("upd_scripting_proc", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.custom_script</code>.
     */
    public final TableField<SysarticlesRecord, String> CUSTOM_SCRIPT = createField("custom_script", org.jooq.impl.SQLDataType.NVARCHAR(2048), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sysarticles.fire_triggers_on_snapshot</code>.
     */
    public final TableField<SysarticlesRecord, Boolean> FIRE_TRIGGERS_ON_SNAPSHOT = createField("fire_triggers_on_snapshot", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.sysarticles</code> table reference
     */
    public Sysarticles() {
        this(DSL.name("sysarticles"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.sysarticles</code> table reference
     */
    public Sysarticles(String alias) {
        this(DSL.name(alias), SYSARTICLES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.sysarticles</code> table reference
     */
    public Sysarticles(Name alias) {
        this(alias, SYSARTICLES);
    }

    private Sysarticles(Name alias, Table<SysarticlesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sysarticles(Name alias, Table<SysarticlesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sysarticles(Table<O> child, ForeignKey<O, SysarticlesRecord> key) {
        super(child, key, SYSARTICLES);
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
        return Arrays.<Index>asList(Indexes.SYSARTICLES_C1SYSARTICLES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SysarticlesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SYSARTICLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysarticlesRecord>> getKeys() {
        return Arrays.<UniqueKey<SysarticlesRecord>>asList(Keys.C1SYSARTICLES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysarticles as(String alias) {
        return new Sysarticles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysarticles as(Name alias) {
        return new Sysarticles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sysarticles rename(String name) {
        return new Sysarticles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sysarticles rename(Name name) {
        return new Sysarticles(name, null);
    }
}
