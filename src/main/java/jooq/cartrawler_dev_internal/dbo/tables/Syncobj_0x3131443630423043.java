/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.Syncobj_0x3131443630423043Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Syncobj_0x3131443630423043 extends TableImpl<Syncobj_0x3131443630423043Record> {

    private static final long serialVersionUID = -122656445;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043</code>
     */
    public static final Syncobj_0x3131443630423043 SYNCOBJ_0X3131443630423043 = new Syncobj_0x3131443630423043();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Syncobj_0x3131443630423043Record> getRecordType() {
        return Syncobj_0x3131443630423043Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043.id</code>.
     */
    public final TableField<Syncobj_0x3131443630423043Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043.SYS_CHANGE_VERSION</code>.
     */
    public final TableField<Syncobj_0x3131443630423043Record, Long> SYS_CHANGE_VERSION = createField("SYS_CHANGE_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public final TableField<Syncobj_0x3131443630423043Record, Long> SYS_CHANGE_CREATION_VERSION = createField("SYS_CHANGE_CREATION_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043.SYS_CHANGE_OPERATION</code>.
     */
    public final TableField<Syncobj_0x3131443630423043Record, String> SYS_CHANGE_OPERATION = createField("SYS_CHANGE_OPERATION", org.jooq.impl.SQLDataType.NCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043.SYS_CHANGE_COLUMNS</code>.
     */
    public final TableField<Syncobj_0x3131443630423043Record, byte[]> SYS_CHANGE_COLUMNS = createField("SYS_CHANGE_COLUMNS", org.jooq.impl.SQLDataType.VARBINARY(4100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043.SYS_CHANGE_CONTEXT</code>.
     */
    public final TableField<Syncobj_0x3131443630423043Record, byte[]> SYS_CHANGE_CONTEXT = createField("SYS_CHANGE_CONTEXT", org.jooq.impl.SQLDataType.VARBINARY(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043.user_id</code>.
     */
    public final TableField<Syncobj_0x3131443630423043Record, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043</code> table reference
     */
    public Syncobj_0x3131443630423043() {
        this(DSL.name("syncobj_0x3131443630423043"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043</code> table reference
     */
    public Syncobj_0x3131443630423043(String alias) {
        this(DSL.name(alias), SYNCOBJ_0X3131443630423043);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x3131443630423043</code> table reference
     */
    public Syncobj_0x3131443630423043(Name alias) {
        this(alias, SYNCOBJ_0X3131443630423043);
    }

    private Syncobj_0x3131443630423043(Name alias, Table<Syncobj_0x3131443630423043Record> aliased) {
        this(alias, aliased, null);
    }

    private Syncobj_0x3131443630423043(Name alias, Table<Syncobj_0x3131443630423043Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Syncobj_0x3131443630423043(Table<O> child, ForeignKey<O, Syncobj_0x3131443630423043Record> key) {
        super(child, key, SYNCOBJ_0X3131443630423043);
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
    public Identity<Syncobj_0x3131443630423043Record, Long> getIdentity() {
        return Keys.IDENTITY_SYNCOBJ_0X3131443630423043;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3131443630423043 as(String alias) {
        return new Syncobj_0x3131443630423043(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3131443630423043 as(Name alias) {
        return new Syncobj_0x3131443630423043(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x3131443630423043 rename(String name) {
        return new Syncobj_0x3131443630423043(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x3131443630423043 rename(Name name) {
        return new Syncobj_0x3131443630423043(name, null);
    }
}
