/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.SalesforceBookingsExtendedRecord;

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
public class SalesforceBookingsExtended extends TableImpl<SalesforceBookingsExtendedRecord> {

    private static final long serialVersionUID = -1247587283;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended</code>
     */
    public static final SalesforceBookingsExtended SALESFORCE_BOOKINGS_EXTENDED = new SalesforceBookingsExtended();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesforceBookingsExtendedRecord> getRecordType() {
        return SalesforceBookingsExtendedRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_id</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_last_name</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> CUSTOMER_LAST_NAME = createField("customer_last_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_first_name</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> CUSTOMER_FIRST_NAME = createField("customer_first_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_email</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> CUSTOMER_EMAIL = createField("customer_email", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.ref</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Booking_id</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> BOOKING_ID = createField("Booking_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Supplier_Reference</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> SUPPLIER_REFERENCE = createField("Supplier_Reference", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.FirstName</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> FIRSTNAME = createField("FirstName", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Surname</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> SURNAME = createField("Surname", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Pickup_Date</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, Timestamp> PICKUP_DATE = createField("Pickup_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Pickup_Time</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> PICKUP_TIME = createField("Pickup_Time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.card_number</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> CARD_NUMBER = createField("card_number", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Email</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> EMAIL = createField("Email", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.BookingDate</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, Timestamp> BOOKINGDATE = createField("BookingDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Country_of_Residence</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> COUNTRY_OF_RESIDENCE = createField("Country_of_Residence", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.pickup_location_name</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> PICKUP_LOCATION_NAME = createField("pickup_location_name", org.jooq.impl.SQLDataType.VARCHAR(265), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.brand_type</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> BRAND_TYPE = createField("brand_type", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.client_id</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Booking Status</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> BOOKING_STATUS = createField("Booking Status", org.jooq.impl.SQLDataType.VARCHAR(18).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.searchable_Email</code>.
     */
    public final TableField<SalesforceBookingsExtendedRecord, String> SEARCHABLE_EMAIL = createField("searchable_Email", org.jooq.impl.SQLDataType.VARCHAR(8000), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended</code> table reference
     */
    public SalesforceBookingsExtended() {
        this(DSL.name("SalesForce_Bookings_extended"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended</code> table reference
     */
    public SalesforceBookingsExtended(String alias) {
        this(DSL.name(alias), SALESFORCE_BOOKINGS_EXTENDED);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended</code> table reference
     */
    public SalesforceBookingsExtended(Name alias) {
        this(alias, SALESFORCE_BOOKINGS_EXTENDED);
    }

    private SalesforceBookingsExtended(Name alias, Table<SalesforceBookingsExtendedRecord> aliased) {
        this(alias, aliased, null);
    }

    private SalesforceBookingsExtended(Name alias, Table<SalesforceBookingsExtendedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SalesforceBookingsExtended(Table<O> child, ForeignKey<O, SalesforceBookingsExtendedRecord> key) {
        super(child, key, SALESFORCE_BOOKINGS_EXTENDED);
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
    public SalesforceBookingsExtended as(String alias) {
        return new SalesforceBookingsExtended(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtended as(Name alias) {
        return new SalesforceBookingsExtended(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceBookingsExtended rename(String name) {
        return new SalesforceBookingsExtended(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceBookingsExtended rename(Name name) {
        return new SalesforceBookingsExtended(name, null);
    }
}
