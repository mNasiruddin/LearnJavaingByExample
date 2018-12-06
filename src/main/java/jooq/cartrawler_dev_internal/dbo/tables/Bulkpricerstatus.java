/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.BulkpricerstatusRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Bulkpricerstatus extends TableImpl<BulkpricerstatusRecord> {

    private static final long serialVersionUID = 920580404;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.bulkPricerStatus</code>
     */
    public static final Bulkpricerstatus BULKPRICERSTATUS = new Bulkpricerstatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BulkpricerstatusRecord> getRecordType() {
        return BulkpricerstatusRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.guid</code>.
     */
    public final TableField<BulkpricerstatusRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.totalMemory</code>.
     */
    public final TableField<BulkpricerstatusRecord, Long> TOTALMEMORY = createField("totalMemory", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.freeMemory</code>.
     */
    public final TableField<BulkpricerstatusRecord, Long> FREEMEMORY = createField("freeMemory", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.bytesPerSec</code>.
     */
    public final TableField<BulkpricerstatusRecord, Integer> BYTESPERSEC = createField("bytesPerSec", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.maxMemory</code>.
     */
    public final TableField<BulkpricerstatusRecord, Long> MAXMEMORY = createField("maxMemory", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.message</code>.
     */
    public final TableField<BulkpricerstatusRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.jobsAlive</code>.
     */
    public final TableField<BulkpricerstatusRecord, Integer> JOBSALIVE = createField("jobsAlive", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.bulkPricerStatus</code> table reference
     */
    public Bulkpricerstatus() {
        this(DSL.name("bulkPricerStatus"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.bulkPricerStatus</code> table reference
     */
    public Bulkpricerstatus(String alias) {
        this(DSL.name(alias), BULKPRICERSTATUS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.bulkPricerStatus</code> table reference
     */
    public Bulkpricerstatus(Name alias) {
        this(alias, BULKPRICERSTATUS);
    }

    private Bulkpricerstatus(Name alias, Table<BulkpricerstatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private Bulkpricerstatus(Name alias, Table<BulkpricerstatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Bulkpricerstatus(Table<O> child, ForeignKey<O, BulkpricerstatusRecord> key) {
        super(child, key, BULKPRICERSTATUS);
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
        return Arrays.<Index>asList(Indexes.BULKPRICERSTATUS_PK_BULKPRICERSTATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BulkpricerstatusRecord> getPrimaryKey() {
        return Keys.PK_BULKPRICERSTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BulkpricerstatusRecord>> getKeys() {
        return Arrays.<UniqueKey<BulkpricerstatusRecord>>asList(Keys.PK_BULKPRICERSTATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bulkpricerstatus as(String alias) {
        return new Bulkpricerstatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bulkpricerstatus as(Name alias) {
        return new Bulkpricerstatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Bulkpricerstatus rename(String name) {
        return new Bulkpricerstatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Bulkpricerstatus rename(Name name) {
        return new Bulkpricerstatus(name, null);
    }
}
