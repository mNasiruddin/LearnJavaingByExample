/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.tables.records.MssavedforeignkeycolumnsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class Mssavedforeignkeycolumns extends TableImpl<MssavedforeignkeycolumnsRecord> {

    private static final long serialVersionUID = -1330894539;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns</code>
     */
    public static final Mssavedforeignkeycolumns MSSAVEDFOREIGNKEYCOLUMNS = new Mssavedforeignkeycolumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MssavedforeignkeycolumnsRecord> getRecordType() {
        return MssavedforeignkeycolumnsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.program_name</code>.
     */
    public final TableField<MssavedforeignkeycolumnsRecord, String> PROGRAM_NAME = createField("program_name", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.constraint_name</code>.
     */
    public final TableField<MssavedforeignkeycolumnsRecord, String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.parent_schema</code>.
     */
    public final TableField<MssavedforeignkeycolumnsRecord, String> PARENT_SCHEMA = createField("parent_schema", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.constraint_column_id</code>.
     */
    public final TableField<MssavedforeignkeycolumnsRecord, Integer> CONSTRAINT_COLUMN_ID = createField("constraint_column_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.referencing_column_name</code>.
     */
    public final TableField<MssavedforeignkeycolumnsRecord, String> REFERENCING_COLUMN_NAME = createField("referencing_column_name", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.referenced_column_name</code>.
     */
    public final TableField<MssavedforeignkeycolumnsRecord, String> REFERENCED_COLUMN_NAME = createField("referenced_column_name", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.timestamp</code>.
     */
    public final TableField<MssavedforeignkeycolumnsRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns</code> table reference
     */
    public Mssavedforeignkeycolumns() {
        this(DSL.name("MSsavedforeignkeycolumns"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns</code> table reference
     */
    public Mssavedforeignkeycolumns(String alias) {
        this(DSL.name(alias), MSSAVEDFOREIGNKEYCOLUMNS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns</code> table reference
     */
    public Mssavedforeignkeycolumns(Name alias) {
        this(alias, MSSAVEDFOREIGNKEYCOLUMNS);
    }

    private Mssavedforeignkeycolumns(Name alias, Table<MssavedforeignkeycolumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mssavedforeignkeycolumns(Name alias, Table<MssavedforeignkeycolumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Mssavedforeignkeycolumns(Table<O> child, ForeignKey<O, MssavedforeignkeycolumnsRecord> key) {
        super(child, key, MSSAVEDFOREIGNKEYCOLUMNS);
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
        return Arrays.<Index>asList(Indexes.MSSAVEDFOREIGNKEYCOLUMNS_CI_MSSAVEDFOREIGNKEYCOLUMNS, Indexes.MSSAVEDFOREIGNKEYCOLUMNS_NCI_MSSAVEDFOREIGNKEYCOLUMNS_TIMESTAMP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mssavedforeignkeycolumns as(String alias) {
        return new Mssavedforeignkeycolumns(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mssavedforeignkeycolumns as(Name alias) {
        return new Mssavedforeignkeycolumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mssavedforeignkeycolumns rename(String name) {
        return new Mssavedforeignkeycolumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mssavedforeignkeycolumns rename(Name name) {
        return new Mssavedforeignkeycolumns(name, null);
    }
}
