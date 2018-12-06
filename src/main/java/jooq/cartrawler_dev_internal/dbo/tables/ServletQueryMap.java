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
import jooq.cartrawler_dev_internal.dbo.tables.records.ServletQueryMapRecord;

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
public class ServletQueryMap extends TableImpl<ServletQueryMapRecord> {

    private static final long serialVersionUID = -62918228;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.servlet_query_map</code>
     */
    public static final ServletQueryMap SERVLET_QUERY_MAP = new ServletQueryMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServletQueryMapRecord> getRecordType() {
        return ServletQueryMapRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.servlet_query_map.id</code>.
     */
    public final TableField<ServletQueryMapRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.servlet_query_map.fk_servlet_queries</code>.
     */
    public final TableField<ServletQueryMapRecord, Integer> FK_SERVLET_QUERIES = createField("fk_servlet_queries", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.servlet_query_map.provider</code>.
     */
    public final TableField<ServletQueryMapRecord, String> PROVIDER = createField("provider", org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.servlet_query_map.poiType</code>.
     */
    public final TableField<ServletQueryMapRecord, String> POITYPE = createField("poiType", org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.servlet_query_map.poiRef</code>.
     */
    public final TableField<ServletQueryMapRecord, String> POIREF = createField("poiRef", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.servlet_query_map.size</code>.
     */
    public final TableField<ServletQueryMapRecord, String> SIZE = createField("size", org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.servlet_query_map</code> table reference
     */
    public ServletQueryMap() {
        this(DSL.name("servlet_query_map"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.servlet_query_map</code> table reference
     */
    public ServletQueryMap(String alias) {
        this(DSL.name(alias), SERVLET_QUERY_MAP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.servlet_query_map</code> table reference
     */
    public ServletQueryMap(Name alias) {
        this(alias, SERVLET_QUERY_MAP);
    }

    private ServletQueryMap(Name alias, Table<ServletQueryMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServletQueryMap(Name alias, Table<ServletQueryMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ServletQueryMap(Table<O> child, ForeignKey<O, ServletQueryMapRecord> key) {
        super(child, key, SERVLET_QUERY_MAP);
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
        return Arrays.<Index>asList(Indexes.SERVLET_QUERY_MAP_PK_SERVLET_QUERY_MAP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ServletQueryMapRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SERVLET_QUERY_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServletQueryMapRecord> getPrimaryKey() {
        return Keys.PK_SERVLET_QUERY_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServletQueryMapRecord>> getKeys() {
        return Arrays.<UniqueKey<ServletQueryMapRecord>>asList(Keys.PK_SERVLET_QUERY_MAP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletQueryMap as(String alias) {
        return new ServletQueryMap(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletQueryMap as(Name alias) {
        return new ServletQueryMap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServletQueryMap rename(String name) {
        return new ServletQueryMap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ServletQueryMap rename(Name name) {
        return new ServletQueryMap(name, null);
    }
}
