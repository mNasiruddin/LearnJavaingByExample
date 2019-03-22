/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SvocContacts;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SvocContactsRecord extends UpdatableRecordImpl<SvocContactsRecord> implements Record11<Integer, String, Integer, String, String, String, String, String, String, Boolean, Timestamp> {

    private static final long serialVersionUID = -1223410113;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.fk_parent</code>.
     */
    public void setFkParent(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.fk_parent</code>.
     */
    public Integer getFkParent() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.brand_type</code>.
     */
    public void setBrandType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.brand_type</code>.
     */
    public String getBrandType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.firstname</code>.
     */
    public void setFirstname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.surname</code>.
     */
    public void setSurname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.surname</code>.
     */
    public String getSurname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.residence</code>.
     */
    public void setResidence(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.residence</code>.
     */
    public String getResidence() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.lang</code>.
     */
    public void setLang(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.lang</code>.
     */
    public String getLang() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.curr</code>.
     */
    public void setCurr(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.curr</code>.
     */
    public String getCurr() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.marketing_consent</code>.
     */
    public void setMarketingConsent(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.marketing_consent</code>.
     */
    public Boolean getMarketingConsent() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.mc_subscribe_date</code>.
     */
    public void setMcSubscribeDate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_contacts.mc_subscribe_date</code>.
     */
    public Timestamp getMcSubscribeDate() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Integer, String, String, String, String, String, String, Boolean, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Integer, String, String, String, String, String, String, Boolean, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SvocContacts.SVOC_CONTACTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SvocContacts.SVOC_CONTACTS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SvocContacts.SVOC_CONTACTS.FK_PARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SvocContacts.SVOC_CONTACTS.BRAND_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SvocContacts.SVOC_CONTACTS.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SvocContacts.SVOC_CONTACTS.SURNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SvocContacts.SVOC_CONTACTS.RESIDENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SvocContacts.SVOC_CONTACTS.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SvocContacts.SVOC_CONTACTS.CURR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return SvocContacts.SVOC_CONTACTS.MARKETING_CONSENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return SvocContacts.SVOC_CONTACTS.MC_SUBSCRIBE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBrandType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getResidence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCurr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getMarketingConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getMcSubscribeDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBrandType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getResidence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCurr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getMarketingConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getMcSubscribeDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value3(Integer value) {
        setFkParent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value4(String value) {
        setBrandType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value5(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value6(String value) {
        setSurname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value7(String value) {
        setResidence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value8(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value9(String value) {
        setCurr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value10(Boolean value) {
        setMarketingConsent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord value11(Timestamp value) {
        setMcSubscribeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocContactsRecord values(Integer value1, String value2, Integer value3, String value4, String value5, String value6, String value7, String value8, String value9, Boolean value10, Timestamp value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SvocContactsRecord
     */
    public SvocContactsRecord() {
        super(SvocContacts.SVOC_CONTACTS);
    }

    /**
     * Create a detached, initialised SvocContactsRecord
     */
    public SvocContactsRecord(Integer id, String email, Integer fkParent, String brandType, String firstname, String surname, String residence, String lang, String curr, Boolean marketingConsent, Timestamp mcSubscribeDate) {
        super(SvocContacts.SVOC_CONTACTS);

        set(0, id);
        set(1, email);
        set(2, fkParent);
        set(3, brandType);
        set(4, firstname);
        set(5, surname);
        set(6, residence);
        set(7, lang);
        set(8, curr);
        set(9, marketingConsent);
        set(10, mcSubscribeDate);
    }
}