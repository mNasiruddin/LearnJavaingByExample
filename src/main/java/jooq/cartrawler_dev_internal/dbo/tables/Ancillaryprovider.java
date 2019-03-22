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
import jooq.cartrawler_dev_internal.dbo.tables.records.AncillaryproviderRecord;

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
public class Ancillaryprovider extends TableImpl<AncillaryproviderRecord> {

    private static final long serialVersionUID = -1286873467;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.AncillaryProvider</code>
     */
    public static final Ancillaryprovider ANCILLARYPROVIDER = new Ancillaryprovider();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AncillaryproviderRecord> getRecordType() {
        return AncillaryproviderRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AncillaryProvider.pk_id</code>.
     */
    public final TableField<AncillaryproviderRecord, Integer> PK_ID = createField("pk_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AncillaryProvider.id</code>.
     */
    public final TableField<AncillaryproviderRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AncillaryProvider.provider_name</code>.
     */
    public final TableField<AncillaryproviderRecord, String> PROVIDER_NAME = createField("provider_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AncillaryProvider.fk_ancillarytype</code>.
     */
    public final TableField<AncillaryproviderRecord, Integer> FK_ANCILLARYTYPE = createField("fk_ancillarytype", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.AncillaryProvider</code> table reference
     */
    public Ancillaryprovider() {
        this(DSL.name("AncillaryProvider"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AncillaryProvider</code> table reference
     */
    public Ancillaryprovider(String alias) {
        this(DSL.name(alias), ANCILLARYPROVIDER);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AncillaryProvider</code> table reference
     */
    public Ancillaryprovider(Name alias) {
        this(alias, ANCILLARYPROVIDER);
    }

    private Ancillaryprovider(Name alias, Table<AncillaryproviderRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ancillaryprovider(Name alias, Table<AncillaryproviderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Ancillaryprovider(Table<O> child, ForeignKey<O, AncillaryproviderRecord> key) {
        super(child, key, ANCILLARYPROVIDER);
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
        return Arrays.<Index>asList(Indexes.ANCILLARYPROVIDER_PK_ANCILLARYPROVIDER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AncillaryproviderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ANCILLARYPROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AncillaryproviderRecord> getPrimaryKey() {
        return Keys.PK_ANCILLARYPROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AncillaryproviderRecord>> getKeys() {
        return Arrays.<UniqueKey<AncillaryproviderRecord>>asList(Keys.PK_ANCILLARYPROVIDER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ancillaryprovider as(String alias) {
        return new Ancillaryprovider(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ancillaryprovider as(Name alias) {
        return new Ancillaryprovider(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ancillaryprovider rename(String name) {
        return new Ancillaryprovider(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ancillaryprovider rename(Name name) {
        return new Ancillaryprovider(name, null);
    }
}