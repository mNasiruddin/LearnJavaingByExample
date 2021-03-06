/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigInteger;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.Seedtempdb2Record;

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
public class Seedtempdb2 extends TableImpl<Seedtempdb2Record> {

    private static final long serialVersionUID = -189686425;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.seedtempdb2</code>
     */
    public static final Seedtempdb2 SEEDTEMPDB2 = new Seedtempdb2();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Seedtempdb2Record> getRecordType() {
        return Seedtempdb2Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.seedtempdb2.Seed</code>.
     */
    public final TableField<Seedtempdb2Record, BigInteger> SEED = createField("Seed", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.seedtempdb2.Increment</code>.
     */
    public final TableField<Seedtempdb2Record, BigInteger> INCREMENT = createField("Increment", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.seedtempdb2.Current_Identity</code>.
     */
    public final TableField<Seedtempdb2Record, BigInteger> CURRENT_IDENTITY = createField("Current_Identity", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.seedtempdb2.TABLE_NAME</code>.
     */
    public final TableField<Seedtempdb2Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.seedtempdb2</code> table reference
     */
    public Seedtempdb2() {
        this(DSL.name("seedtempdb2"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.seedtempdb2</code> table reference
     */
    public Seedtempdb2(String alias) {
        this(DSL.name(alias), SEEDTEMPDB2);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.seedtempdb2</code> table reference
     */
    public Seedtempdb2(Name alias) {
        this(alias, SEEDTEMPDB2);
    }

    private Seedtempdb2(Name alias, Table<Seedtempdb2Record> aliased) {
        this(alias, aliased, null);
    }

    private Seedtempdb2(Name alias, Table<Seedtempdb2Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Seedtempdb2(Table<O> child, ForeignKey<O, Seedtempdb2Record> key) {
        super(child, key, SEEDTEMPDB2);
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
    public Seedtempdb2 as(String alias) {
        return new Seedtempdb2(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seedtempdb2 as(Name alias) {
        return new Seedtempdb2(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Seedtempdb2 rename(String name) {
        return new Seedtempdb2(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Seedtempdb2 rename(Name name) {
        return new Seedtempdb2(name, null);
    }
}
