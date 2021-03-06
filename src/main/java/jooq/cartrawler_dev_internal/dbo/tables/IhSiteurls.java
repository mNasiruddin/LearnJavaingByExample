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
import jooq.cartrawler_dev_internal.dbo.tables.records.IhSiteurlsRecord;

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
public class IhSiteurls extends TableImpl<IhSiteurlsRecord> {

    private static final long serialVersionUID = -654609733;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ih_siteurls</code>
     */
    public static final IhSiteurls IH_SITEURLS = new IhSiteurls();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IhSiteurlsRecord> getRecordType() {
        return IhSiteurlsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ih_siteurls.id</code>.
     */
    public final TableField<IhSiteurlsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ih_siteurls.url</code>.
     */
    public final TableField<IhSiteurlsRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ih_siteurls</code> table reference
     */
    public IhSiteurls() {
        this(DSL.name("ih_siteurls"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ih_siteurls</code> table reference
     */
    public IhSiteurls(String alias) {
        this(DSL.name(alias), IH_SITEURLS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ih_siteurls</code> table reference
     */
    public IhSiteurls(Name alias) {
        this(alias, IH_SITEURLS);
    }

    private IhSiteurls(Name alias, Table<IhSiteurlsRecord> aliased) {
        this(alias, aliased, null);
    }

    private IhSiteurls(Name alias, Table<IhSiteurlsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IhSiteurls(Table<O> child, ForeignKey<O, IhSiteurlsRecord> key) {
        super(child, key, IH_SITEURLS);
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
        return Arrays.<Index>asList(Indexes.IH_SITEURLS_PK_IH_SITEURLS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IhSiteurlsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_IH_SITEURLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IhSiteurlsRecord> getPrimaryKey() {
        return Keys.PK_IH_SITEURLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IhSiteurlsRecord>> getKeys() {
        return Arrays.<UniqueKey<IhSiteurlsRecord>>asList(Keys.PK_IH_SITEURLS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhSiteurls as(String alias) {
        return new IhSiteurls(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhSiteurls as(Name alias) {
        return new IhSiteurls(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IhSiteurls rename(String name) {
        return new IhSiteurls(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IhSiteurls rename(Name name) {
        return new IhSiteurls(name, null);
    }
}
