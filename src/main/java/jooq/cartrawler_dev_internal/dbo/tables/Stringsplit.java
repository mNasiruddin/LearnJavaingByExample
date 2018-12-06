/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.StringsplitRecord;

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
public class Stringsplit extends TableImpl<StringsplitRecord> {

    private static final long serialVersionUID = -19896719;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.StringSplit</code>
     */
    public static final Stringsplit STRINGSPLIT = new Stringsplit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StringsplitRecord> getRecordType() {
        return StringsplitRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.StringSplit.Value</code>.
     */
    public final TableField<StringsplitRecord, String> VALUE = createField("Value", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.StringSplit</code> table reference
     */
    public Stringsplit() {
        this(DSL.name("StringSplit"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.StringSplit</code> table reference
     */
    public Stringsplit(String alias) {
        this(DSL.name(alias), STRINGSPLIT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.StringSplit</code> table reference
     */
    public Stringsplit(Name alias) {
        this(alias, STRINGSPLIT);
    }

    private Stringsplit(Name alias, Table<StringsplitRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private Stringsplit(Name alias, Table<StringsplitRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Stringsplit(Table<O> child, ForeignKey<O, StringsplitRecord> key) {
        super(child, key, STRINGSPLIT);
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
    public Stringsplit as(String alias) {
        return new Stringsplit(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Stringsplit as(Name alias) {
        return new Stringsplit(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Stringsplit rename(String name) {
        return new Stringsplit(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Stringsplit rename(Name name) {
        return new Stringsplit(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public Stringsplit call(String string, String separator) {
        return new Stringsplit(DSL.name(getName()), null, new Field[] { 
              DSL.val(string, org.jooq.impl.SQLDataType.VARCHAR)
            , DSL.val(separator, org.jooq.impl.SQLDataType.CHAR(1))
        });
    }

    /**
     * Call this table-valued function
     */
    public Stringsplit call(Field<String> string, Field<String> separator) {
        return new Stringsplit(DSL.name(getName()), null, new Field[] { 
              string
            , separator
        });
    }
}
