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
import jooq.cartrawler_dev_internal.dbo.tables.records.CtFomDataCrmcaseRecord;

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
public class CtFomDataCrmcase extends TableImpl<CtFomDataCrmcaseRecord> {

    private static final long serialVersionUID = 1840789756;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase</code>
     */
    public static final CtFomDataCrmcase CT_FOM_DATA_CRMCASE = new CtFomDataCrmcase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtFomDataCrmcaseRecord> getRecordType() {
        return CtFomDataCrmcaseRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase.pkid</code>.
     */
    public final TableField<CtFomDataCrmcaseRecord, Long> PKID = createField("pkid", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase.SYS_CHANGE_VERSION</code>.
     */
    public final TableField<CtFomDataCrmcaseRecord, Long> SYS_CHANGE_VERSION = createField("SYS_CHANGE_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public final TableField<CtFomDataCrmcaseRecord, Long> SYS_CHANGE_CREATION_VERSION = createField("SYS_CHANGE_CREATION_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase.SYS_CHANGE_OPERATION</code>.
     */
    public final TableField<CtFomDataCrmcaseRecord, String> SYS_CHANGE_OPERATION = createField("SYS_CHANGE_OPERATION", org.jooq.impl.SQLDataType.NCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase.SYS_CHANGE_COLUMNS</code>.
     */
    public final TableField<CtFomDataCrmcaseRecord, byte[]> SYS_CHANGE_COLUMNS = createField("SYS_CHANGE_COLUMNS", org.jooq.impl.SQLDataType.VARBINARY(4100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase.SYS_CHANGE_CONTEXT</code>.
     */
    public final TableField<CtFomDataCrmcaseRecord, byte[]> SYS_CHANGE_CONTEXT = createField("SYS_CHANGE_CONTEXT", org.jooq.impl.SQLDataType.VARBINARY(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase.id</code>.
     */
    public final TableField<CtFomDataCrmcaseRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase</code> table reference
     */
    public CtFomDataCrmcase() {
        this(DSL.name("CT_fom_data_crmcase"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase</code> table reference
     */
    public CtFomDataCrmcase(String alias) {
        this(DSL.name(alias), CT_FOM_DATA_CRMCASE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CT_fom_data_crmcase</code> table reference
     */
    public CtFomDataCrmcase(Name alias) {
        this(alias, CT_FOM_DATA_CRMCASE);
    }

    private CtFomDataCrmcase(Name alias, Table<CtFomDataCrmcaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private CtFomDataCrmcase(Name alias, Table<CtFomDataCrmcaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CtFomDataCrmcase(Table<O> child, ForeignKey<O, CtFomDataCrmcaseRecord> key) {
        super(child, key, CT_FOM_DATA_CRMCASE);
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
        return Arrays.<Index>asList(Indexes.CT_FOM_DATA_CRMCASE_PK_CT_FOM_DATA_CRMCASE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CtFomDataCrmcaseRecord, Long> getIdentity() {
        return Keys.IDENTITY_CT_FOM_DATA_CRMCASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CtFomDataCrmcaseRecord> getPrimaryKey() {
        return Keys.PK_CT_FOM_DATA_CRMCASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CtFomDataCrmcaseRecord>> getKeys() {
        return Arrays.<UniqueKey<CtFomDataCrmcaseRecord>>asList(Keys.PK_CT_FOM_DATA_CRMCASE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtFomDataCrmcase as(String alias) {
        return new CtFomDataCrmcase(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtFomDataCrmcase as(Name alias) {
        return new CtFomDataCrmcase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CtFomDataCrmcase rename(String name) {
        return new CtFomDataCrmcase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CtFomDataCrmcase rename(Name name) {
        return new CtFomDataCrmcase(name, null);
    }
}
