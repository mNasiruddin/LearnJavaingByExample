/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.EmailMarketing;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class EmailMarketingRecord extends TableRecordImpl<EmailMarketingRecord> implements Record18<UUID, String, String, String, Boolean, String, String, String, String, String, String, Boolean, Timestamp, String, String, Short, Long, String> {

    private static final long serialVersionUID = 1103482753;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Email_Add</code>.
     */
    public void setEmailAdd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Email_Add</code>.
     */
    public String getEmailAdd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.First_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.First_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Last_Name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Last_Name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Unsubscribe</code>.
     */
    public void setUnsubscribe(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Unsubscribe</code>.
     */
    public Boolean getUnsubscribe() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Competition</code>.
     */
    public void setCompetition(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Competition</code>.
     */
    public String getCompetition() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Affiliate_Id</code>.
     */
    public void setAffiliateId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Affiliate_Id</code>.
     */
    public String getAffiliateId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Coupon_Id</code>.
     */
    public void setCouponId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Coupon_Id</code>.
     */
    public String getCouponId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Country_From</code>.
     */
    public void setCountryFrom(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Country_From</code>.
     */
    public String getCountryFrom() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Booked_for</code>.
     */
    public void setBookedFor(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Booked_for</code>.
     */
    public String getBookedFor() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Pickup_Location</code>.
     */
    public void setPickupLocation(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Pickup_Location</code>.
     */
    public String getPickupLocation() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.ClubArgus</code>.
     */
    public void setClubargus(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.ClubArgus</code>.
     */
    public Boolean getClubargus() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.EntryDate</code>.
     */
    public void setEntrydate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.EntryDate</code>.
     */
    public Timestamp getEntrydate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.password</code>.
     */
    public void setPassword(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.password</code>.
     */
    public String getPassword() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.phone_number</code>.
     */
    public void setPhoneNumber(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.phone_number</code>.
     */
    public String getPhoneNumber() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Email_Type</code>.
     */
    public void setEmailType(Short value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Email_Type</code>.
     */
    public Short getEmailType() {
        return (Short) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Customer_Id</code>.
     */
    public void setCustomerId(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.Customer_Id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Email_marketing.language</code>.
     */
    public void setLanguage(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Email_marketing.language</code>.
     */
    public String getLanguage() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<UUID, String, String, String, Boolean, String, String, String, String, String, String, Boolean, Timestamp, String, String, Short, Long, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<UUID, String, String, String, Boolean, String, String, String, String, String, String, Boolean, Timestamp, String, String, Short, Long, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return EmailMarketing.EMAIL_MARKETING.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EmailMarketing.EMAIL_MARKETING.EMAIL_ADD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmailMarketing.EMAIL_MARKETING.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EmailMarketing.EMAIL_MARKETING.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return EmailMarketing.EMAIL_MARKETING.UNSUBSCRIBE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EmailMarketing.EMAIL_MARKETING.COMPETITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EmailMarketing.EMAIL_MARKETING.AFFILIATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EmailMarketing.EMAIL_MARKETING.COUPON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EmailMarketing.EMAIL_MARKETING.COUNTRY_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EmailMarketing.EMAIL_MARKETING.BOOKED_FOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EmailMarketing.EMAIL_MARKETING.PICKUP_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return EmailMarketing.EMAIL_MARKETING.CLUBARGUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return EmailMarketing.EMAIL_MARKETING.ENTRYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return EmailMarketing.EMAIL_MARKETING.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return EmailMarketing.EMAIL_MARKETING.PHONE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field16() {
        return EmailMarketing.EMAIL_MARKETING.EMAIL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field17() {
        return EmailMarketing.EMAIL_MARKETING.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return EmailMarketing.EMAIL_MARKETING.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEmailAdd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getUnsubscribe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCompetition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAffiliateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCouponId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCountryFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getBookedFor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getPickupLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getClubargus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getEntrydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getPhoneNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component16() {
        return getEmailType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component17() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmailAdd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getUnsubscribe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCompetition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAffiliateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCouponId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCountryFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBookedFor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPickupLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getClubargus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getEntrydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getPhoneNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value16() {
        return getEmailType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value17() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value2(String value) {
        setEmailAdd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value5(Boolean value) {
        setUnsubscribe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value6(String value) {
        setCompetition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value7(String value) {
        setAffiliateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value8(String value) {
        setCouponId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value9(String value) {
        setCountryFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value10(String value) {
        setBookedFor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value11(String value) {
        setPickupLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value12(Boolean value) {
        setClubargus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value13(Timestamp value) {
        setEntrydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value14(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value15(String value) {
        setPhoneNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value16(Short value) {
        setEmailType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value17(Long value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord value18(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketingRecord values(UUID value1, String value2, String value3, String value4, Boolean value5, String value6, String value7, String value8, String value9, String value10, String value11, Boolean value12, Timestamp value13, String value14, String value15, Short value16, Long value17, String value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailMarketingRecord
     */
    public EmailMarketingRecord() {
        super(EmailMarketing.EMAIL_MARKETING);
    }

    /**
     * Create a detached, initialised EmailMarketingRecord
     */
    public EmailMarketingRecord(UUID guid, String emailAdd, String firstName, String lastName, Boolean unsubscribe, String competition, String affiliateId, String couponId, String countryFrom, String bookedFor, String pickupLocation, Boolean clubargus, Timestamp entrydate, String password, String phoneNumber, Short emailType, Long customerId, String language) {
        super(EmailMarketing.EMAIL_MARKETING);

        set(0, guid);
        set(1, emailAdd);
        set(2, firstName);
        set(3, lastName);
        set(4, unsubscribe);
        set(5, competition);
        set(6, affiliateId);
        set(7, couponId);
        set(8, countryFrom);
        set(9, bookedFor);
        set(10, pickupLocation);
        set(11, clubargus);
        set(12, entrydate);
        set(13, password);
        set(14, phoneNumber);
        set(15, emailType);
        set(16, customerId);
        set(17, language);
    }
}
