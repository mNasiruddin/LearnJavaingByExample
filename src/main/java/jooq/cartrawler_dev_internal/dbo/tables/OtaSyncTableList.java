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
import jooq.cartrawler_dev_internal.dbo.tables.records.OtaSyncTableListRecord;

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
public class OtaSyncTableList extends TableImpl<OtaSyncTableListRecord> {

    private static final long serialVersionUID = -1581821806;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ota_sync_table_list</code>
     */
    public static final OtaSyncTableList OTA_SYNC_TABLE_LIST = new OtaSyncTableList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OtaSyncTableListRecord> getRecordType() {
        return OtaSyncTableListRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ota_sync_table_list.id</code>.
     */
    public final TableField<OtaSyncTableListRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ota_sync_table_list.table_name</code>.
     */
    public final TableField<OtaSyncTableListRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ota_sync_table_list</code> table reference
     */
    public OtaSyncTableList() {
        this(DSL.name("ota_sync_table_list"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ota_sync_table_list</code> table reference
     */
    public OtaSyncTableList(String alias) {
        this(DSL.name(alias), OTA_SYNC_TABLE_LIST);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ota_sync_table_list</code> table reference
     */
    public OtaSyncTableList(Name alias) {
        this(alias, OTA_SYNC_TABLE_LIST);
    }

    private OtaSyncTableList(Name alias, Table<OtaSyncTableListRecord> aliased) {
        this(alias, aliased, null);
    }

    private OtaSyncTableList(Name alias, Table<OtaSyncTableListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OtaSyncTableList(Table<O> child, ForeignKey<O, OtaSyncTableListRecord> key) {
        super(child, key, OTA_SYNC_TABLE_LIST);
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
        return Arrays.<Index>asList(Indexes.OTA_SYNC_TABLE_LIST_PK__OTA_SYNC__3213E83F23D750AC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OtaSyncTableListRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OTA_SYNC_TABLE_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OtaSyncTableListRecord> getPrimaryKey() {
        return Keys.PK__OTA_SYNC__3213E83F23D750AC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OtaSyncTableListRecord>> getKeys() {
        return Arrays.<UniqueKey<OtaSyncTableListRecord>>asList(Keys.PK__OTA_SYNC__3213E83F23D750AC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaSyncTableList as(String alias) {
        return new OtaSyncTableList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaSyncTableList as(Name alias) {
        return new OtaSyncTableList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OtaSyncTableList rename(String name) {
        return new OtaSyncTableList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OtaSyncTableList rename(Name name) {
        return new OtaSyncTableList(name, null);
    }
}
