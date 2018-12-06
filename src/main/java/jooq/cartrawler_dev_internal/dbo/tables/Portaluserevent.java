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
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.PortalusereventRecord;

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
public class Portaluserevent extends TableImpl<PortalusereventRecord> {

    private static final long serialVersionUID = 1958484870;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.PortalUserEvent</code>
     */
    public static final Portaluserevent PORTALUSEREVENT = new Portaluserevent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PortalusereventRecord> getRecordType() {
        return PortalusereventRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PortalUserEvent.id</code>.
     */
    public final TableField<PortalusereventRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PortalUserEvent.timestamp</code>.
     */
    public final TableField<PortalusereventRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PortalUserEvent.supplierPortalUserId</code>.
     */
    public final TableField<PortalusereventRecord, Integer> SUPPLIERPORTALUSERID = createField("supplierPortalUserId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PortalUserEvent.event</code>.
     */
    public final TableField<PortalusereventRecord, String> EVENT = createField("event", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.PortalUserEvent</code> table reference
     */
    public Portaluserevent() {
        this(DSL.name("PortalUserEvent"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PortalUserEvent</code> table reference
     */
    public Portaluserevent(String alias) {
        this(DSL.name(alias), PORTALUSEREVENT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PortalUserEvent</code> table reference
     */
    public Portaluserevent(Name alias) {
        this(alias, PORTALUSEREVENT);
    }

    private Portaluserevent(Name alias, Table<PortalusereventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Portaluserevent(Name alias, Table<PortalusereventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Portaluserevent(Table<O> child, ForeignKey<O, PortalusereventRecord> key) {
        super(child, key, PORTALUSEREVENT);
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
        return Arrays.<Index>asList(Indexes.PORTALUSEREVENT_PK_SUPPLIERPORTALUSEREVENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PortalusereventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PORTALUSEREVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PortalusereventRecord> getPrimaryKey() {
        return Keys.PK_SUPPLIERPORTALUSEREVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PortalusereventRecord>> getKeys() {
        return Arrays.<UniqueKey<PortalusereventRecord>>asList(Keys.PK_SUPPLIERPORTALUSEREVENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Portaluserevent as(String alias) {
        return new Portaluserevent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Portaluserevent as(Name alias) {
        return new Portaluserevent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Portaluserevent rename(String name) {
        return new Portaluserevent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Portaluserevent rename(Name name) {
        return new Portaluserevent(name, null);
    }
}
