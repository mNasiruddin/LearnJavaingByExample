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
import jooq.cartrawler_dev_internal.dbo.tables.records.SupplierconfigchangeeventRecord;

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
public class Supplierconfigchangeevent extends TableImpl<SupplierconfigchangeeventRecord> {

    private static final long serialVersionUID = -1887320894;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent</code>
     */
    public static final Supplierconfigchangeevent SUPPLIERCONFIGCHANGEEVENT = new Supplierconfigchangeevent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SupplierconfigchangeeventRecord> getRecordType() {
        return SupplierconfigchangeeventRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.id</code>.
     */
    public final TableField<SupplierconfigchangeeventRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.car_agent_id</code>.
     */
    public final TableField<SupplierconfigchangeeventRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.configFeature</code>.
     */
    public final TableField<SupplierconfigchangeeventRecord, String> CONFIGFEATURE = createField("configFeature", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.fromValue</code>.
     */
    public final TableField<SupplierconfigchangeeventRecord, String> FROMVALUE = createField("fromValue", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.toValue</code>.
     */
    public final TableField<SupplierconfigchangeeventRecord, String> TOVALUE = createField("toValue", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.timeStamp</code>.
     */
    public final TableField<SupplierconfigchangeeventRecord, Long> TIMESTAMP = createField("timeStamp", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent</code> table reference
     */
    public Supplierconfigchangeevent() {
        this(DSL.name("SupplierConfigChangeEvent"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent</code> table reference
     */
    public Supplierconfigchangeevent(String alias) {
        this(DSL.name(alias), SUPPLIERCONFIGCHANGEEVENT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent</code> table reference
     */
    public Supplierconfigchangeevent(Name alias) {
        this(alias, SUPPLIERCONFIGCHANGEEVENT);
    }

    private Supplierconfigchangeevent(Name alias, Table<SupplierconfigchangeeventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Supplierconfigchangeevent(Name alias, Table<SupplierconfigchangeeventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Supplierconfigchangeevent(Table<O> child, ForeignKey<O, SupplierconfigchangeeventRecord> key) {
        super(child, key, SUPPLIERCONFIGCHANGEEVENT);
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
        return Arrays.<Index>asList(Indexes.SUPPLIERCONFIGCHANGEEVENT_PK__SUPPLIER__3213E83F36D44B30);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SupplierconfigchangeeventRecord, Long> getIdentity() {
        return Keys.IDENTITY_SUPPLIERCONFIGCHANGEEVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SupplierconfigchangeeventRecord> getPrimaryKey() {
        return Keys.PK__SUPPLIER__3213E83F36D44B30;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SupplierconfigchangeeventRecord>> getKeys() {
        return Arrays.<UniqueKey<SupplierconfigchangeeventRecord>>asList(Keys.PK__SUPPLIER__3213E83F36D44B30);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Supplierconfigchangeevent as(String alias) {
        return new Supplierconfigchangeevent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Supplierconfigchangeevent as(Name alias) {
        return new Supplierconfigchangeevent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Supplierconfigchangeevent rename(String name) {
        return new Supplierconfigchangeevent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Supplierconfigchangeevent rename(Name name) {
        return new Supplierconfigchangeevent(name, null);
    }
}
