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
import jooq.cartrawler_dev_internal.dbo.tables.records.SortOrderWeightingsRecord;

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
public class SortOrderWeightings extends TableImpl<SortOrderWeightingsRecord> {

    private static final long serialVersionUID = -319481433;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.sort_order_weightings</code>
     */
    public static final SortOrderWeightings SORT_ORDER_WEIGHTINGS = new SortOrderWeightings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SortOrderWeightingsRecord> getRecordType() {
        return SortOrderWeightingsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.id</code>.
     */
    public final TableField<SortOrderWeightingsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.client_id</code>.
     */
    public final TableField<SortOrderWeightingsRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.weighting_type</code>.
     */
    public final TableField<SortOrderWeightingsRecord, String> WEIGHTING_TYPE = createField("weighting_type", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.weighting_subtype</code>.
     */
    public final TableField<SortOrderWeightingsRecord, String> WEIGHTING_SUBTYPE = createField("weighting_subtype", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.trip_type</code>.
     */
    public final TableField<SortOrderWeightingsRecord, String> TRIP_TYPE = createField("trip_type", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.weighting</code>.
     */
    public final TableField<SortOrderWeightingsRecord, Double> WEIGHTING = createField("weighting", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.client_type</code>.
     */
    public final TableField<SortOrderWeightingsRecord, String> CLIENT_TYPE = createField("client_type", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.dest_country</code>.
     */
    public final TableField<SortOrderWeightingsRecord, String> DEST_COUNTRY = createField("dest_country", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.source_country</code>.
     */
    public final TableField<SortOrderWeightingsRecord, String> SOURCE_COUNTRY = createField("source_country", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.cust_segment</code>.
     */
    public final TableField<SortOrderWeightingsRecord, Integer> CUST_SEGMENT = createField("cust_segment", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_weightings.sensitivity_level</code>.
     */
    public final TableField<SortOrderWeightingsRecord, Integer> SENSITIVITY_LEVEL = createField("sensitivity_level", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.sort_order_weightings</code> table reference
     */
    public SortOrderWeightings() {
        this(DSL.name("sort_order_weightings"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.sort_order_weightings</code> table reference
     */
    public SortOrderWeightings(String alias) {
        this(DSL.name(alias), SORT_ORDER_WEIGHTINGS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.sort_order_weightings</code> table reference
     */
    public SortOrderWeightings(Name alias) {
        this(alias, SORT_ORDER_WEIGHTINGS);
    }

    private SortOrderWeightings(Name alias, Table<SortOrderWeightingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SortOrderWeightings(Name alias, Table<SortOrderWeightingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SortOrderWeightings(Table<O> child, ForeignKey<O, SortOrderWeightingsRecord> key) {
        super(child, key, SORT_ORDER_WEIGHTINGS);
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
        return Arrays.<Index>asList(Indexes.SORT_ORDER_WEIGHTINGS_PK__SORT_ORD__3213E83F36109EE1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SortOrderWeightingsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SORT_ORDER_WEIGHTINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SortOrderWeightingsRecord> getPrimaryKey() {
        return Keys.PK__SORT_ORD__3213E83F36109EE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SortOrderWeightingsRecord>> getKeys() {
        return Arrays.<UniqueKey<SortOrderWeightingsRecord>>asList(Keys.PK__SORT_ORD__3213E83F36109EE1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderWeightings as(String alias) {
        return new SortOrderWeightings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderWeightings as(Name alias) {
        return new SortOrderWeightings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SortOrderWeightings rename(String name) {
        return new SortOrderWeightings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SortOrderWeightings rename(Name name) {
        return new SortOrderWeightings(name, null);
    }
}
