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
import jooq.cartrawler_dev_internal.dbo.tables.records.TechpartnerRecord;

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
public class Techpartner extends TableImpl<TechpartnerRecord> {

    private static final long serialVersionUID = -1421363022;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.TechPartner</code>
     */
    public static final Techpartner TECHPARTNER = new Techpartner();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TechpartnerRecord> getRecordType() {
        return TechpartnerRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.TechPartner.pk_id</code>.
     */
    public final TableField<TechpartnerRecord, Integer> PK_ID = createField("pk_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.TechPartner.id</code>.
     */
    public final TableField<TechpartnerRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.TechPartner.partner_name</code>.
     */
    public final TableField<TechpartnerRecord, String> PARTNER_NAME = createField("partner_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.TechPartner</code> table reference
     */
    public Techpartner() {
        this(DSL.name("TechPartner"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.TechPartner</code> table reference
     */
    public Techpartner(String alias) {
        this(DSL.name(alias), TECHPARTNER);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.TechPartner</code> table reference
     */
    public Techpartner(Name alias) {
        this(alias, TECHPARTNER);
    }

    private Techpartner(Name alias, Table<TechpartnerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Techpartner(Name alias, Table<TechpartnerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Techpartner(Table<O> child, ForeignKey<O, TechpartnerRecord> key) {
        super(child, key, TECHPARTNER);
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
        return Arrays.<Index>asList(Indexes.TECHPARTNER_PK_TECHPARTNER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TechpartnerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TECHPARTNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TechpartnerRecord> getPrimaryKey() {
        return Keys.PK_TECHPARTNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TechpartnerRecord>> getKeys() {
        return Arrays.<UniqueKey<TechpartnerRecord>>asList(Keys.PK_TECHPARTNER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Techpartner as(String alias) {
        return new Techpartner(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Techpartner as(Name alias) {
        return new Techpartner(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Techpartner rename(String name) {
        return new Techpartner(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Techpartner rename(Name name) {
        return new Techpartner(name, null);
    }
}
