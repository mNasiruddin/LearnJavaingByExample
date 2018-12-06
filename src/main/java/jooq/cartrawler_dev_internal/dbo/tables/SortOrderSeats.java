/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.SortOrderSeatsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class SortOrderSeats extends TableImpl<SortOrderSeatsRecord> {

    private static final long serialVersionUID = -541458354;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.sort_order_seats</code>
     */
    public static final SortOrderSeats SORT_ORDER_SEATS = new SortOrderSeats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SortOrderSeatsRecord> getRecordType() {
        return SortOrderSeatsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_seats.pax</code>.
     */
    public final TableField<SortOrderSeatsRecord, Integer> PAX = createField("pax", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_seats.adult</code>.
     */
    public final TableField<SortOrderSeatsRecord, Integer> ADULT = createField("adult", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_seats.children</code>.
     */
    public final TableField<SortOrderSeatsRecord, Integer> CHILDREN = createField("children", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_seats.seats</code>.
     */
    public final TableField<SortOrderSeatsRecord, Integer> SEATS = createField("seats", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_seats.score</code>.
     */
    public final TableField<SortOrderSeatsRecord, Double> SCORE = createField("score", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.sort_order_seats</code> table reference
     */
    public SortOrderSeats() {
        this(DSL.name("sort_order_seats"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.sort_order_seats</code> table reference
     */
    public SortOrderSeats(String alias) {
        this(DSL.name(alias), SORT_ORDER_SEATS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.sort_order_seats</code> table reference
     */
    public SortOrderSeats(Name alias) {
        this(alias, SORT_ORDER_SEATS);
    }

    private SortOrderSeats(Name alias, Table<SortOrderSeatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SortOrderSeats(Name alias, Table<SortOrderSeatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SortOrderSeats(Table<O> child, ForeignKey<O, SortOrderSeatsRecord> key) {
        super(child, key, SORT_ORDER_SEATS);
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
    public SortOrderSeats as(String alias) {
        return new SortOrderSeats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderSeats as(Name alias) {
        return new SortOrderSeats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SortOrderSeats rename(String name) {
        return new SortOrderSeats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SortOrderSeats rename(Name name) {
        return new SortOrderSeats(name, null);
    }
}
