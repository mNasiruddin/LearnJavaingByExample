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
import jooq.cartrawler_dev_internal.dbo.tables.records.TablelistToSyncRecord;

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
public class TablelistToSync extends TableImpl<TablelistToSyncRecord> {

    private static final long serialVersionUID = 1805700615;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.tablelist_to_sync</code>
     */
    public static final TablelistToSync TABLELIST_TO_SYNC = new TablelistToSync();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablelistToSyncRecord> getRecordType() {
        return TablelistToSyncRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.tablelist_to_sync.id</code>.
     */
    public final TableField<TablelistToSyncRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.tablelist_to_sync.table_name</code>.
     */
    public final TableField<TablelistToSyncRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.tablelist_to_sync</code> table reference
     */
    public TablelistToSync() {
        this(DSL.name("tablelist_to_sync"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.tablelist_to_sync</code> table reference
     */
    public TablelistToSync(String alias) {
        this(DSL.name(alias), TABLELIST_TO_SYNC);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.tablelist_to_sync</code> table reference
     */
    public TablelistToSync(Name alias) {
        this(alias, TABLELIST_TO_SYNC);
    }

    private TablelistToSync(Name alias, Table<TablelistToSyncRecord> aliased) {
        this(alias, aliased, null);
    }

    private TablelistToSync(Name alias, Table<TablelistToSyncRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TablelistToSync(Table<O> child, ForeignKey<O, TablelistToSyncRecord> key) {
        super(child, key, TABLELIST_TO_SYNC);
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
        return Arrays.<Index>asList(Indexes.TABLELIST_TO_SYNC_PK_TABLELIST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TablelistToSyncRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TABLELIST_TO_SYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TablelistToSyncRecord> getPrimaryKey() {
        return Keys.PK_TABLELIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TablelistToSyncRecord>> getKeys() {
        return Arrays.<UniqueKey<TablelistToSyncRecord>>asList(Keys.PK_TABLELIST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablelistToSync as(String alias) {
        return new TablelistToSync(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablelistToSync as(Name alias) {
        return new TablelistToSync(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TablelistToSync rename(String name) {
        return new TablelistToSync(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TablelistToSync rename(Name name) {
        return new TablelistToSync(name, null);
    }
}
