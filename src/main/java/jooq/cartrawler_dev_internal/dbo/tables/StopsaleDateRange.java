/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.StopsaleDateRangeRecord;

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
public class StopsaleDateRange extends TableImpl<StopsaleDateRangeRecord> {

    private static final long serialVersionUID = 615838703;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.stopsale_date_range</code>
     */
    public static final StopsaleDateRange STOPSALE_DATE_RANGE = new StopsaleDateRange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StopsaleDateRangeRecord> getRecordType() {
        return StopsaleDateRangeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale_date_range.guid</code>.
     */
    public final TableField<StopsaleDateRangeRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale_date_range.stopsale_id</code>.
     */
    public final TableField<StopsaleDateRangeRecord, Integer> STOPSALE_ID = createField("stopsale_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale_date_range.date_range_from</code>.
     */
    public final TableField<StopsaleDateRangeRecord, Timestamp> DATE_RANGE_FROM = createField("date_range_from", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale_date_range.date_range_to</code>.
     */
    public final TableField<StopsaleDateRangeRecord, Timestamp> DATE_RANGE_TO = createField("date_range_to", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale_date_range.rv</code>.
     */
    public final TableField<StopsaleDateRangeRecord, byte[]> RV = createField("rv", org.jooq.impl.SQLDataType.BINARY(8), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.stopsale_date_range</code> table reference
     */
    public StopsaleDateRange() {
        this(DSL.name("stopsale_date_range"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.stopsale_date_range</code> table reference
     */
    public StopsaleDateRange(String alias) {
        this(DSL.name(alias), STOPSALE_DATE_RANGE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.stopsale_date_range</code> table reference
     */
    public StopsaleDateRange(Name alias) {
        this(alias, STOPSALE_DATE_RANGE);
    }

    private StopsaleDateRange(Name alias, Table<StopsaleDateRangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private StopsaleDateRange(Name alias, Table<StopsaleDateRangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> StopsaleDateRange(Table<O> child, ForeignKey<O, StopsaleDateRangeRecord> key) {
        super(child, key, STOPSALE_DATE_RANGE);
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
        return Arrays.<Index>asList(Indexes.STOPSALE_DATE_RANGE_PK_STOPSALE_DATE_RANGE, Indexes.STOPSALE_DATE_RANGE_PK_STOPSALE_DATE_RANGE_1, Indexes.STOPSALE_DATE_RANGE_WW);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StopsaleDateRangeRecord> getPrimaryKey() {
        return Keys.PK_STOPSALE_DATE_RANGE_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StopsaleDateRangeRecord>> getKeys() {
        return Arrays.<UniqueKey<StopsaleDateRangeRecord>>asList(Keys.PK_STOPSALE_DATE_RANGE_1, Keys.PK_STOPSALE_DATE_RANGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleDateRange as(String alias) {
        return new StopsaleDateRange(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleDateRange as(Name alias) {
        return new StopsaleDateRange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StopsaleDateRange rename(String name) {
        return new StopsaleDateRange(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StopsaleDateRange rename(Name name) {
        return new StopsaleDateRange(name, null);
    }
}
