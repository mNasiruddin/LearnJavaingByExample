/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SyncClient_1__167;

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
public class SyncClient_1__167Record extends TableRecordImpl<SyncClient_1__167Record> implements Record18<Integer, String, Integer, Integer, Timestamp, String, Boolean, Integer, String, String, Boolean, String, String, String, String, Integer, String, BigDecimal> {

    private static final long serialVersionUID = 1938550446;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.Client_ID</code>.
     */
    public void setClientId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.Client_ID</code>.
     */
    public Integer getClientId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.Client_Name</code>.
     */
    public void setClientName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.Client_Name</code>.
     */
    public String getClientName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.fk_reportingChannel</code>.
     */
    public void setFkReportingchannel(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.fk_reportingChannel</code>.
     */
    public Integer getFkReportingchannel() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.otaFlags</code>.
     */
    public void setOtaflags(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.otaFlags</code>.
     */
    public Integer getOtaflags() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.last_updated_date</code>.
     */
    public void setLastUpdatedDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.last_updated_date</code>.
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.sortOrdering</code>.
     */
    public void setSortordering(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.sortOrdering</code>.
     */
    public String getSortordering() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.isDBInstantConfirm</code>.
     */
    public void setIsdbinstantconfirm(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.isDBInstantConfirm</code>.
     */
    public Boolean getIsdbinstantconfirm() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.partner_tier</code>.
     */
    public void setPartnerTier(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.partner_tier</code>.
     */
    public Integer getPartnerTier() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.branding_logo</code>.
     */
    public void setBrandingLogo(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.branding_logo</code>.
     */
    public String getBrandingLogo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.gturl</code>.
     */
    public void setGturl(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.gturl</code>.
     */
    public String getGturl() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.show_package_directive</code>.
     */
    public void setShowPackageDirective(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.show_package_directive</code>.
     */
    public Boolean getShowPackageDirective() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.partner_legal_name</code>.
     */
    public void setPartnerLegalName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.partner_legal_name</code>.
     */
    public String getPartnerLegalName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.insolvency_provider_name</code>.
     */
    public void setInsolvencyProviderName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.insolvency_provider_name</code>.
     */
    public String getInsolvencyProviderName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.legislation_url</code>.
     */
    public void setLegislationUrl(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.legislation_url</code>.
     */
    public String getLegislationUrl() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.carrier_legal_country_id</code>.
     */
    public void setCarrierLegalCountryId(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.carrier_legal_country_id</code>.
     */
    public String getCarrierLegalCountryId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.hotel_delivery</code>.
     */
    public void setHotelDelivery(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.hotel_delivery</code>.
     */
    public Integer getHotelDelivery() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.competent_authority_contact_details</code>.
     */
    public void setCompetentAuthorityContactDetails(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.competent_authority_contact_details</code>.
     */
    public String getCompetentAuthorityContactDetails() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.tripart_commission</code>.
     */
    public void setTripartCommission(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_Client_1__167.tripart_commission</code>.
     */
    public BigDecimal getTripartCommission() {
        return (BigDecimal) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, String, Integer, Integer, Timestamp, String, Boolean, Integer, String, String, Boolean, String, String, String, String, Integer, String, BigDecimal> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, String, Integer, Integer, Timestamp, String, Boolean, Integer, String, String, Boolean, String, String, String, String, Integer, String, BigDecimal> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.CLIENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.FK_REPORTINGCHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.OTAFLAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.LAST_UPDATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.SORTORDERING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.ISDBINSTANTCONFIRM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.PARTNER_TIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.BRANDING_LOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.GTURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.SHOW_PACKAGE_DIRECTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.PARTNER_LEGAL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.INSOLVENCY_PROVIDER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.LEGISLATION_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.CARRIER_LEGAL_COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.HOTEL_DELIVERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.COMPETENT_AUTHORITY_CONTACT_DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field18() {
        return SyncClient_1__167.SYNC_CLIENT_1__167.TRIPART_COMMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getClientName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkReportingchannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getOtaflags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getLastUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSortordering();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getIsdbinstantconfirm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getPartnerTier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBrandingLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getGturl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getShowPackageDirective();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getPartnerLegalName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getInsolvencyProviderName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getLegislationUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCarrierLegalCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getHotelDelivery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCompetentAuthorityContactDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component18() {
        return getTripartCommission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getClientName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkReportingchannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getOtaflags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getLastUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSortordering();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getIsdbinstantconfirm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getPartnerTier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBrandingLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getGturl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getShowPackageDirective();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPartnerLegalName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getInsolvencyProviderName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getLegislationUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCarrierLegalCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getHotelDelivery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCompetentAuthorityContactDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value18() {
        return getTripartCommission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value1(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value2(String value) {
        setClientName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value3(Integer value) {
        setFkReportingchannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value4(Integer value) {
        setOtaflags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value5(Timestamp value) {
        setLastUpdatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value6(String value) {
        setSortordering(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value7(Boolean value) {
        setIsdbinstantconfirm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value8(Integer value) {
        setPartnerTier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value9(String value) {
        setBrandingLogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value10(String value) {
        setGturl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value11(Boolean value) {
        setShowPackageDirective(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value12(String value) {
        setPartnerLegalName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value13(String value) {
        setInsolvencyProviderName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value14(String value) {
        setLegislationUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value15(String value) {
        setCarrierLegalCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value16(Integer value) {
        setHotelDelivery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value17(String value) {
        setCompetentAuthorityContactDetails(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record value18(BigDecimal value) {
        setTripartCommission(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncClient_1__167Record values(Integer value1, String value2, Integer value3, Integer value4, Timestamp value5, String value6, Boolean value7, Integer value8, String value9, String value10, Boolean value11, String value12, String value13, String value14, String value15, Integer value16, String value17, BigDecimal value18) {
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
     * Create a detached SyncClient_1__167Record
     */
    public SyncClient_1__167Record() {
        super(SyncClient_1__167.SYNC_CLIENT_1__167);
    }

    /**
     * Create a detached, initialised SyncClient_1__167Record
     */
    public SyncClient_1__167Record(Integer clientId, String clientName, Integer fkReportingchannel, Integer otaflags, Timestamp lastUpdatedDate, String sortordering, Boolean isdbinstantconfirm, Integer partnerTier, String brandingLogo, String gturl, Boolean showPackageDirective, String partnerLegalName, String insolvencyProviderName, String legislationUrl, String carrierLegalCountryId, Integer hotelDelivery, String competentAuthorityContactDetails, BigDecimal tripartCommission) {
        super(SyncClient_1__167.SYNC_CLIENT_1__167);

        set(0, clientId);
        set(1, clientName);
        set(2, fkReportingchannel);
        set(3, otaflags);
        set(4, lastUpdatedDate);
        set(5, sortordering);
        set(6, isdbinstantconfirm);
        set(7, partnerTier);
        set(8, brandingLogo);
        set(9, gturl);
        set(10, showPackageDirective);
        set(11, partnerLegalName);
        set(12, insolvencyProviderName);
        set(13, legislationUrl);
        set(14, carrierLegalCountryId);
        set(15, hotelDelivery);
        set(16, competentAuthorityContactDetails);
        set(17, tripartCommission);
    }
}
