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
import jooq.cartrawler_dev_internal.dbo.tables.records.PortaluserpermissionRecord;

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
public class Portaluserpermission extends TableImpl<PortaluserpermissionRecord> {

    private static final long serialVersionUID = -1141069941;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.PortalUserPermission</code>
     */
    public static final Portaluserpermission PORTALUSERPERMISSION = new Portaluserpermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PortaluserpermissionRecord> getRecordType() {
        return PortaluserpermissionRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PortalUserPermission.id</code>.
     */
    public final TableField<PortaluserpermissionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PortalUserPermission.supplierPortalUserId</code>.
     */
    public final TableField<PortaluserpermissionRecord, Integer> SUPPLIERPORTALUSERID = createField("supplierPortalUserId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PortalUserPermission.supplierPortalPermissionId</code>.
     */
    public final TableField<PortaluserpermissionRecord, Integer> SUPPLIERPORTALPERMISSIONID = createField("supplierPortalPermissionId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.PortalUserPermission</code> table reference
     */
    public Portaluserpermission() {
        this(DSL.name("PortalUserPermission"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PortalUserPermission</code> table reference
     */
    public Portaluserpermission(String alias) {
        this(DSL.name(alias), PORTALUSERPERMISSION);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PortalUserPermission</code> table reference
     */
    public Portaluserpermission(Name alias) {
        this(alias, PORTALUSERPERMISSION);
    }

    private Portaluserpermission(Name alias, Table<PortaluserpermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Portaluserpermission(Name alias, Table<PortaluserpermissionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Portaluserpermission(Table<O> child, ForeignKey<O, PortaluserpermissionRecord> key) {
        super(child, key, PORTALUSERPERMISSION);
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
        return Arrays.<Index>asList(Indexes.PORTALUSERPERMISSION_IDX_IGNORE_DUPLICATES, Indexes.PORTALUSERPERMISSION_PK_SUPPLIERPORTALUSERPERMISSION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PortaluserpermissionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PORTALUSERPERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PortaluserpermissionRecord> getPrimaryKey() {
        return Keys.PK_SUPPLIERPORTALUSERPERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PortaluserpermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<PortaluserpermissionRecord>>asList(Keys.PK_SUPPLIERPORTALUSERPERMISSION, Keys.IDX_IGNORE_DUPLICATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Portaluserpermission as(String alias) {
        return new Portaluserpermission(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Portaluserpermission as(Name alias) {
        return new Portaluserpermission(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Portaluserpermission rename(String name) {
        return new Portaluserpermission(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Portaluserpermission rename(Name name) {
        return new Portaluserpermission(name, null);
    }
}
