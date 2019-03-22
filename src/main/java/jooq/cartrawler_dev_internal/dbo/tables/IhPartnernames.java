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
import jooq.cartrawler_dev_internal.dbo.tables.records.IhPartnernamesRecord;

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
public class IhPartnernames extends TableImpl<IhPartnernamesRecord> {

    private static final long serialVersionUID = -745268397;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ih_partnernames</code>
     */
    public static final IhPartnernames IH_PARTNERNAMES = new IhPartnernames();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IhPartnernamesRecord> getRecordType() {
        return IhPartnernamesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ih_partnernames.id</code>.
     */
    public final TableField<IhPartnernamesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ih_partnernames.name</code>.
     */
    public final TableField<IhPartnernamesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ih_partnernames</code> table reference
     */
    public IhPartnernames() {
        this(DSL.name("ih_partnernames"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ih_partnernames</code> table reference
     */
    public IhPartnernames(String alias) {
        this(DSL.name(alias), IH_PARTNERNAMES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ih_partnernames</code> table reference
     */
    public IhPartnernames(Name alias) {
        this(alias, IH_PARTNERNAMES);
    }

    private IhPartnernames(Name alias, Table<IhPartnernamesRecord> aliased) {
        this(alias, aliased, null);
    }

    private IhPartnernames(Name alias, Table<IhPartnernamesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IhPartnernames(Table<O> child, ForeignKey<O, IhPartnernamesRecord> key) {
        super(child, key, IH_PARTNERNAMES);
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
        return Arrays.<Index>asList(Indexes.IH_PARTNERNAMES_PK_IH_PARTNERNAMES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IhPartnernamesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_IH_PARTNERNAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IhPartnernamesRecord> getPrimaryKey() {
        return Keys.PK_IH_PARTNERNAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IhPartnernamesRecord>> getKeys() {
        return Arrays.<UniqueKey<IhPartnernamesRecord>>asList(Keys.PK_IH_PARTNERNAMES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhPartnernames as(String alias) {
        return new IhPartnernames(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhPartnernames as(Name alias) {
        return new IhPartnernames(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IhPartnernames rename(String name) {
        return new IhPartnernames(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IhPartnernames rename(Name name) {
        return new IhPartnernames(name, null);
    }
}