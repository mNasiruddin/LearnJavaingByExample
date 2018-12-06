/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SalesforceBookingsExtended;

import org.jooq.Field;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.TableRecordImpl;


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
public class SalesforceBookingsExtendedRecord extends TableRecordImpl<SalesforceBookingsExtendedRecord> implements Record20<Integer, String, String, String, Integer, String, String, String, String, Timestamp, String, String, String, Timestamp, String, String, String, Integer, String, String> {

    private static final long serialVersionUID = -1714706897;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_last_name</code>.
     */
    public void setCustomerLastName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_last_name</code>.
     */
    public String getCustomerLastName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_first_name</code>.
     */
    public void setCustomerFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_first_name</code>.
     */
    public String getCustomerFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_email</code>.
     */
    public void setCustomerEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.customer_email</code>.
     */
    public String getCustomerEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.ref</code>.
     */
    public void setRef(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Booking_id</code>.
     */
    public void setBookingId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Booking_id</code>.
     */
    public String getBookingId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Supplier_Reference</code>.
     */
    public void setSupplierReference(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Supplier_Reference</code>.
     */
    public String getSupplierReference() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.FirstName</code>.
     */
    public void setFirstname(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.FirstName</code>.
     */
    public String getFirstname() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Surname</code>.
     */
    public void setSurname(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Surname</code>.
     */
    public String getSurname() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Pickup_Date</code>.
     */
    public void setPickupDate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Pickup_Date</code>.
     */
    public Timestamp getPickupDate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Pickup_Time</code>.
     */
    public void setPickupTime(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Pickup_Time</code>.
     */
    public String getPickupTime() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.card_number</code>.
     */
    public void setCardNumber(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.card_number</code>.
     */
    public String getCardNumber() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Email</code>.
     */
    public void setEmail(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Email</code>.
     */
    public String getEmail() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.BookingDate</code>.
     */
    public void setBookingdate(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.BookingDate</code>.
     */
    public Timestamp getBookingdate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Country_of_Residence</code>.
     */
    public void setCountryOfResidence(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Country_of_Residence</code>.
     */
    public String getCountryOfResidence() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.pickup_location_name</code>.
     */
    public void setPickupLocationName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.pickup_location_name</code>.
     */
    public String getPickupLocationName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.brand_type</code>.
     */
    public void setBrandType(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.brand_type</code>.
     */
    public String getBrandType() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Booking Status</code>.
     */
    public void setBookingStatus(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.Booking Status</code>.
     */
    public String getBookingStatus() {
        return (String) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.searchable_Email</code>.
     */
    public void setSearchableEmail(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_extended.searchable_Email</code>.
     */
    public String getSearchableEmail() {
        return (String) get(19);
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, String, String, Integer, String, String, String, String, Timestamp, String, String, String, Timestamp, String, String, String, Integer, String, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, String, String, Integer, String, String, String, String, Timestamp, String, String, String, Timestamp, String, String, String, Integer, String, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.CUSTOMER_LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.CUSTOMER_FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.CUSTOMER_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.BOOKING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.SUPPLIER_REFERENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.SURNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.PICKUP_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.PICKUP_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.CARD_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.BOOKINGDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.COUNTRY_OF_RESIDENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.PICKUP_LOCATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.BRAND_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.BOOKING_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED.SEARCHABLE_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCustomerLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCustomerFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCustomerEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getBookingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSupplierReference();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getPickupDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getPickupTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCardNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getBookingdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCountryOfResidence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getPickupLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getBrandType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getBookingStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getSearchableEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCustomerLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCustomerFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCustomerEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBookingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSupplierReference();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getPickupDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPickupTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCardNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getBookingdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCountryOfResidence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getPickupLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getBrandType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getBookingStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getSearchableEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value1(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value2(String value) {
        setCustomerLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value3(String value) {
        setCustomerFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value4(String value) {
        setCustomerEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value5(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value6(String value) {
        setBookingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value7(String value) {
        setSupplierReference(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value8(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value9(String value) {
        setSurname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value10(Timestamp value) {
        setPickupDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value11(String value) {
        setPickupTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value12(String value) {
        setCardNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value13(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value14(Timestamp value) {
        setBookingdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value15(String value) {
        setCountryOfResidence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value16(String value) {
        setPickupLocationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value17(String value) {
        setBrandType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value18(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value19(String value) {
        setBookingStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord value20(String value) {
        setSearchableEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsExtendedRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, String value7, String value8, String value9, Timestamp value10, String value11, String value12, String value13, Timestamp value14, String value15, String value16, String value17, Integer value18, String value19, String value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SalesforceBookingsExtendedRecord
     */
    public SalesforceBookingsExtendedRecord() {
        super(SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED);
    }

    /**
     * Create a detached, initialised SalesforceBookingsExtendedRecord
     */
    public SalesforceBookingsExtendedRecord(Integer customerId, String customerLastName, String customerFirstName, String customerEmail, Integer ref, String bookingId, String supplierReference, String firstname, String surname, Timestamp pickupDate, String pickupTime, String cardNumber, String email, Timestamp bookingdate, String countryOfResidence, String pickupLocationName, String brandType, Integer clientId, String bookingStatus, String searchableEmail) {
        super(SalesforceBookingsExtended.SALESFORCE_BOOKINGS_EXTENDED);

        set(0, customerId);
        set(1, customerLastName);
        set(2, customerFirstName);
        set(3, customerEmail);
        set(4, ref);
        set(5, bookingId);
        set(6, supplierReference);
        set(7, firstname);
        set(8, surname);
        set(9, pickupDate);
        set(10, pickupTime);
        set(11, cardNumber);
        set(12, email);
        set(13, bookingdate);
        set(14, countryOfResidence);
        set(15, pickupLocationName);
        set(16, brandType);
        set(17, clientId);
        set(18, bookingStatus);
        set(19, searchableEmail);
    }
}
