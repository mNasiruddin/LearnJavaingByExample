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
import jooq.cartrawler_dev_internal.dbo.tables.records.ChannelvirtuallocationsRecord;

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
public class Channelvirtuallocations extends TableImpl<ChannelvirtuallocationsRecord> {

    private static final long serialVersionUID = 1248846445;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ChannelVirtualLocations</code>
     */
    public static final Channelvirtuallocations CHANNELVIRTUALLOCATIONS = new Channelvirtuallocations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChannelvirtuallocationsRecord> getRecordType() {
        return ChannelvirtuallocationsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelVirtualLocations.id</code>.
     */
    public final TableField<ChannelvirtuallocationsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelVirtualLocations.ref</code>.
     */
    public final TableField<ChannelvirtuallocationsRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelVirtualLocations.vloc_id</code>.
     */
    public final TableField<ChannelvirtuallocationsRecord, Integer> VLOC_ID = createField("vloc_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelVirtualLocations.type</code>.
     */
    public final TableField<ChannelvirtuallocationsRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ChannelVirtualLocations</code> table reference
     */
    public Channelvirtuallocations() {
        this(DSL.name("ChannelVirtualLocations"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ChannelVirtualLocations</code> table reference
     */
    public Channelvirtuallocations(String alias) {
        this(DSL.name(alias), CHANNELVIRTUALLOCATIONS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ChannelVirtualLocations</code> table reference
     */
    public Channelvirtuallocations(Name alias) {
        this(alias, CHANNELVIRTUALLOCATIONS);
    }

    private Channelvirtuallocations(Name alias, Table<ChannelvirtuallocationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Channelvirtuallocations(Name alias, Table<ChannelvirtuallocationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Channelvirtuallocations(Table<O> child, ForeignKey<O, ChannelvirtuallocationsRecord> key) {
        super(child, key, CHANNELVIRTUALLOCATIONS);
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
        return Arrays.<Index>asList(Indexes.CHANNELVIRTUALLOCATIONS_PK_CHANNELVIRTUALLOCATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ChannelvirtuallocationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CHANNELVIRTUALLOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChannelvirtuallocationsRecord> getPrimaryKey() {
        return Keys.PK_CHANNELVIRTUALLOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChannelvirtuallocationsRecord>> getKeys() {
        return Arrays.<UniqueKey<ChannelvirtuallocationsRecord>>asList(Keys.PK_CHANNELVIRTUALLOCATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Channelvirtuallocations as(String alias) {
        return new Channelvirtuallocations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Channelvirtuallocations as(Name alias) {
        return new Channelvirtuallocations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelvirtuallocations rename(String name) {
        return new Channelvirtuallocations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelvirtuallocations rename(Name name) {
        return new Channelvirtuallocations(name, null);
    }
}