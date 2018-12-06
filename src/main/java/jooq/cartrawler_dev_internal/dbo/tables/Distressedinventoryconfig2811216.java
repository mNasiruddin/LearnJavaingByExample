/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.Distressedinventoryconfig2811216Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Distressedinventoryconfig2811216 extends TableImpl<Distressedinventoryconfig2811216Record> {

    private static final long serialVersionUID = -1157911004;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216</code>
     */
    public static final Distressedinventoryconfig2811216 DISTRESSEDINVENTORYCONFIG2811216 = new Distressedinventoryconfig2811216();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Distressedinventoryconfig2811216Record> getRecordType() {
        return Distressedinventoryconfig2811216Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.guid</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.car_agent_id</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, Long> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.separator</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, String> SEPARATOR = createField("separator", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.protocol</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.user_id</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.password</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.prod_url</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, String> PROD_URL = createField("prod_url", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.file_name</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.isActive</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, Boolean> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.CreatedDate</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, Long> CREATEDDATE = createField("CreatedDate", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.lastReadTime</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, Long> LASTREADTIME = createField("lastReadTime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.lastReadStatus</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, String> LASTREADSTATUS = createField("lastReadStatus", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216.Type</code>.
     */
    public final TableField<Distressedinventoryconfig2811216Record, String> TYPE = createField("Type", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216</code> table reference
     */
    public Distressedinventoryconfig2811216() {
        this(DSL.name("distressedinventoryconfig2811216"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216</code> table reference
     */
    public Distressedinventoryconfig2811216(String alias) {
        this(DSL.name(alias), DISTRESSEDINVENTORYCONFIG2811216);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.distressedinventoryconfig2811216</code> table reference
     */
    public Distressedinventoryconfig2811216(Name alias) {
        this(alias, DISTRESSEDINVENTORYCONFIG2811216);
    }

    private Distressedinventoryconfig2811216(Name alias, Table<Distressedinventoryconfig2811216Record> aliased) {
        this(alias, aliased, null);
    }

    private Distressedinventoryconfig2811216(Name alias, Table<Distressedinventoryconfig2811216Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Distressedinventoryconfig2811216(Table<O> child, ForeignKey<O, Distressedinventoryconfig2811216Record> key) {
        super(child, key, DISTRESSEDINVENTORYCONFIG2811216);
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
    public Distressedinventoryconfig2811216 as(String alias) {
        return new Distressedinventoryconfig2811216(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Distressedinventoryconfig2811216 as(Name alias) {
        return new Distressedinventoryconfig2811216(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Distressedinventoryconfig2811216 rename(String name) {
        return new Distressedinventoryconfig2811216(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Distressedinventoryconfig2811216 rename(Name name) {
        return new Distressedinventoryconfig2811216(name, null);
    }
}
