/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.SalesforceBookingsRecord;

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
public class SalesforceBookings extends TableImpl<SalesforceBookingsRecord> {

    private static final long serialVersionUID = 1225098000;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings</code>
     */
    public static final SalesforceBookings SALESFORCE_BOOKINGS = new SalesforceBookings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesforceBookingsRecord> getRecordType() {
        return SalesforceBookingsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.customer_id</code>.
     */
    public final TableField<SalesforceBookingsRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.customer_last_name</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> CUSTOMER_LAST_NAME = createField("customer_last_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.customer_first_name</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> CUSTOMER_FIRST_NAME = createField("customer_first_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.customer_email</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> CUSTOMER_EMAIL = createField("customer_email", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.ref</code>.
     */
    public final TableField<SalesforceBookingsRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.Booking_id</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> BOOKING_ID = createField("Booking_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.Supplier_Reference</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> SUPPLIER_REFERENCE = createField("Supplier_Reference", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.Supplier_Name</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> SUPPLIER_NAME = createField("Supplier_Name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.FirstName</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> FIRSTNAME = createField("FirstName", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.Surname</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> SURNAME = createField("Surname", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.Pickup_Date</code>.
     */
    public final TableField<SalesforceBookingsRecord, Timestamp> PICKUP_DATE = createField("Pickup_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.Pickup_Time</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> PICKUP_TIME = createField("Pickup_Time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.card_number</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> CARD_NUMBER = createField("card_number", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.Email</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> EMAIL = createField("Email", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.BookingDate</code>.
     */
    public final TableField<SalesforceBookingsRecord, Timestamp> BOOKINGDATE = createField("BookingDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.Country_of_Residence</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> COUNTRY_OF_RESIDENCE = createField("Country_of_Residence", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.pickup_location_name</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> PICKUP_LOCATION_NAME = createField("pickup_location_name", org.jooq.impl.SQLDataType.VARCHAR(265), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.brand_type</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> BRAND_TYPE = createField("brand_type", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.client_id</code>.
     */
    public final TableField<SalesforceBookingsRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.Booking_Status</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> BOOKING_STATUS = createField("Booking_Status", org.jooq.impl.SQLDataType.VARCHAR(18).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.searchable_Email</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> SEARCHABLE_EMAIL = createField("searchable_Email", org.jooq.impl.SQLDataType.VARCHAR(8000), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings.searchable_supplier_ref</code>.
     */
    public final TableField<SalesforceBookingsRecord, String> SEARCHABLE_SUPPLIER_REF = createField("searchable_supplier_ref", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings</code> table reference
     */
    public SalesforceBookings() {
        this(DSL.name("SalesForce_Bookings"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings</code> table reference
     */
    public SalesforceBookings(String alias) {
        this(DSL.name(alias), SALESFORCE_BOOKINGS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings</code> table reference
     */
    public SalesforceBookings(Name alias) {
        this(alias, SALESFORCE_BOOKINGS);
    }

    private SalesforceBookings(Name alias, Table<SalesforceBookingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SalesforceBookings(Name alias, Table<SalesforceBookingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SalesforceBookings(Table<O> child, ForeignKey<O, SalesforceBookingsRecord> key) {
        super(child, key, SALESFORCE_BOOKINGS);
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
    public SalesforceBookings as(String alias) {
        return new SalesforceBookings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookings as(Name alias) {
        return new SalesforceBookings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceBookings rename(String name) {
        return new SalesforceBookings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceBookings rename(Name name) {
        return new SalesforceBookings(name, null);
    }
}
