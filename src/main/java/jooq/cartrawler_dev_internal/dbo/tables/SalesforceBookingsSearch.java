/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.SalesforceBookingsSearchRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class SalesforceBookingsSearch extends TableImpl<SalesforceBookingsSearchRecord> {

    private static final long serialVersionUID = -1935112048;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search</code>
     */
    public static final SalesforceBookingsSearch SALESFORCE_BOOKINGS_SEARCH = new SalesforceBookingsSearch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesforceBookingsSearchRecord> getRecordType() {
        return SalesforceBookingsSearchRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search.ref</code>.
     */
    public final TableField<SalesforceBookingsSearchRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search.Booking_id</code>.
     */
    public final TableField<SalesforceBookingsSearchRecord, String> BOOKING_ID = createField("Booking_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search.Supplier_Reference</code>.
     */
    public final TableField<SalesforceBookingsSearchRecord, String> SUPPLIER_REFERENCE = createField("Supplier_Reference", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search</code> table reference
     */
    public SalesforceBookingsSearch() {
        this(DSL.name("SalesForce_Bookings_search"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search</code> table reference
     */
    public SalesforceBookingsSearch(String alias) {
        this(DSL.name(alias), SALESFORCE_BOOKINGS_SEARCH);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search</code> table reference
     */
    public SalesforceBookingsSearch(Name alias) {
        this(alias, SALESFORCE_BOOKINGS_SEARCH);
    }

    private SalesforceBookingsSearch(Name alias, Table<SalesforceBookingsSearchRecord> aliased) {
        this(alias, aliased, null);
    }

    private SalesforceBookingsSearch(Name alias, Table<SalesforceBookingsSearchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SalesforceBookingsSearch(Table<O> child, ForeignKey<O, SalesforceBookingsSearchRecord> key) {
        super(child, key, SALESFORCE_BOOKINGS_SEARCH);
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
    public Identity<SalesforceBookingsSearchRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SALESFORCE_BOOKINGS_SEARCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsSearch as(String alias) {
        return new SalesforceBookingsSearch(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsSearch as(Name alias) {
        return new SalesforceBookingsSearch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceBookingsSearch rename(String name) {
        return new SalesforceBookingsSearch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceBookingsSearch rename(Name name) {
        return new SalesforceBookingsSearch(name, null);
    }
}
