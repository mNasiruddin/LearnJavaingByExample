/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.T1Record;

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
public class T1 extends TableImpl<T1Record> {

    private static final long serialVersionUID = -185135737;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.t1</code>
     */
    public static final T1 T1 = new T1();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<T1Record> getRecordType() {
        return T1Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.t1.a</code>.
     */
    public final TableField<T1Record, String> A = createField("a", org.jooq.impl.SQLDataType.NCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.t1.b</code>.
     */
    public final TableField<T1Record, String> B = createField("b", org.jooq.impl.SQLDataType.NCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.t1.c</code>.
     */
    public final TableField<T1Record, String> C = createField("c", org.jooq.impl.SQLDataType.NCHAR(10), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.t1</code> table reference
     */
    public T1() {
        this(DSL.name("t1"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.t1</code> table reference
     */
    public T1(String alias) {
        this(DSL.name(alias), T1);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.t1</code> table reference
     */
    public T1(Name alias) {
        this(alias, T1);
    }

    private T1(Name alias, Table<T1Record> aliased) {
        this(alias, aliased, null);
    }

    private T1(Name alias, Table<T1Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> T1(Table<O> child, ForeignKey<O, T1Record> key) {
        super(child, key, T1);
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
    public T1 as(String alias) {
        return new T1(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T1 as(Name alias) {
        return new T1(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public T1 rename(String name) {
        return new T1(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public T1 rename(Name name) {
        return new T1(name, null);
    }
}
