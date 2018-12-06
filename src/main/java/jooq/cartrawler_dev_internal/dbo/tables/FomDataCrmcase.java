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
import jooq.cartrawler_dev_internal.dbo.tables.records.FomDataCrmcaseRecord;

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
public class FomDataCrmcase extends TableImpl<FomDataCrmcaseRecord> {

    private static final long serialVersionUID = -1172914193;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.fom_data_crmcase</code>
     */
    public static final FomDataCrmcase FOM_DATA_CRMCASE = new FomDataCrmcase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FomDataCrmcaseRecord> getRecordType() {
        return FomDataCrmcaseRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fom_data_crmcase.id</code>.
     */
    public final TableField<FomDataCrmcaseRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fom_data_crmcase.fk_fom_data</code>.
     */
    public final TableField<FomDataCrmcaseRecord, Integer> FK_FOM_DATA = createField("fk_fom_data", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fom_data_crmcase.crm_case_id</code>.
     */
    public final TableField<FomDataCrmcaseRecord, String> CRM_CASE_ID = createField("crm_case_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.fom_data_crmcase</code> table reference
     */
    public FomDataCrmcase() {
        this(DSL.name("fom_data_crmcase"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.fom_data_crmcase</code> table reference
     */
    public FomDataCrmcase(String alias) {
        this(DSL.name(alias), FOM_DATA_CRMCASE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.fom_data_crmcase</code> table reference
     */
    public FomDataCrmcase(Name alias) {
        this(alias, FOM_DATA_CRMCASE);
    }

    private FomDataCrmcase(Name alias, Table<FomDataCrmcaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private FomDataCrmcase(Name alias, Table<FomDataCrmcaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FomDataCrmcase(Table<O> child, ForeignKey<O, FomDataCrmcaseRecord> key) {
        super(child, key, FOM_DATA_CRMCASE);
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
        return Arrays.<Index>asList(Indexes.FOM_DATA_CRMCASE_PK_FOM_DATA_CRMCASE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FomDataCrmcaseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FOM_DATA_CRMCASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FomDataCrmcaseRecord> getPrimaryKey() {
        return Keys.PK_FOM_DATA_CRMCASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FomDataCrmcaseRecord>> getKeys() {
        return Arrays.<UniqueKey<FomDataCrmcaseRecord>>asList(Keys.PK_FOM_DATA_CRMCASE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FomDataCrmcase as(String alias) {
        return new FomDataCrmcase(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FomDataCrmcase as(Name alias) {
        return new FomDataCrmcase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FomDataCrmcase rename(String name) {
        return new FomDataCrmcase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FomDataCrmcase rename(Name name) {
        return new FomDataCrmcase(name, null);
    }
}
