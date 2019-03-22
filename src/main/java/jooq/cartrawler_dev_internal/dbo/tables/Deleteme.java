/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.DeletemeRecord;

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
public class Deleteme extends TableImpl<DeletemeRecord> {

    private static final long serialVersionUID = -903209541;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.deleteme</code>
     */
    public static final Deleteme DELETEME = new Deleteme();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeletemeRecord> getRecordType() {
        return DeletemeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.deleteme.group_id</code>.
     */
    public final TableField<DeletemeRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.deleteme.rule_id</code>.
     */
    public final TableField<DeletemeRecord, Integer> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.deleteme</code> table reference
     */
    public Deleteme() {
        this(DSL.name("deleteme"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.deleteme</code> table reference
     */
    public Deleteme(String alias) {
        this(DSL.name(alias), DELETEME);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.deleteme</code> table reference
     */
    public Deleteme(Name alias) {
        this(alias, DELETEME);
    }

    private Deleteme(Name alias, Table<DeletemeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Deleteme(Name alias, Table<DeletemeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Deleteme(Table<O> child, ForeignKey<O, DeletemeRecord> key) {
        super(child, key, DELETEME);
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
    public Deleteme as(String alias) {
        return new Deleteme(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Deleteme as(Name alias) {
        return new Deleteme(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Deleteme rename(String name) {
        return new Deleteme(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Deleteme rename(Name name) {
        return new Deleteme(name, null);
    }
}