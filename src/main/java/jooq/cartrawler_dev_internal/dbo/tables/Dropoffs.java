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
import jooq.cartrawler_dev_internal.dbo.tables.records.DropoffsRecord;

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
public class Dropoffs extends TableImpl<DropoffsRecord> {

    private static final long serialVersionUID = -1482595197;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.DropOffs</code>
     */
    public static final Dropoffs DROPOFFS = new Dropoffs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DropoffsRecord> getRecordType() {
        return DropoffsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DropOffs.dropoff_id</code>.
     */
    public final TableField<DropoffsRecord, Integer> DROPOFF_ID = createField("dropoff_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DropOffs.location_id</code>.
     */
    public final TableField<DropoffsRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DropOffs.droploc_id</code>.
     */
    public final TableField<DropoffsRecord, Integer> DROPLOC_ID = createField("droploc_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DropOffs.charge</code>.
     */
    public final TableField<DropoffsRecord, Long> CHARGE = createField("charge", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.DropOffs</code> table reference
     */
    public Dropoffs() {
        this(DSL.name("DropOffs"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.DropOffs</code> table reference
     */
    public Dropoffs(String alias) {
        this(DSL.name(alias), DROPOFFS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.DropOffs</code> table reference
     */
    public Dropoffs(Name alias) {
        this(alias, DROPOFFS);
    }

    private Dropoffs(Name alias, Table<DropoffsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dropoffs(Name alias, Table<DropoffsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Dropoffs(Table<O> child, ForeignKey<O, DropoffsRecord> key) {
        super(child, key, DROPOFFS);
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
        return Arrays.<Index>asList(Indexes.DROPOFFS_PK_DROPOFFS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DropoffsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DROPOFFS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DropoffsRecord> getPrimaryKey() {
        return Keys.PK_DROPOFFS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DropoffsRecord>> getKeys() {
        return Arrays.<UniqueKey<DropoffsRecord>>asList(Keys.PK_DROPOFFS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dropoffs as(String alias) {
        return new Dropoffs(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dropoffs as(Name alias) {
        return new Dropoffs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dropoffs rename(String name) {
        return new Dropoffs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dropoffs rename(Name name) {
        return new Dropoffs(name, null);
    }
}
