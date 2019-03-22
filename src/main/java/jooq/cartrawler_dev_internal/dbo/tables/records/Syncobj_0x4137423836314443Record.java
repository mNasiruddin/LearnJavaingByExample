/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Syncobj_0x4137423836314443;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;


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
public class Syncobj_0x4137423836314443Record extends TableRecordImpl<Syncobj_0x4137423836314443Record> {

    private static final long serialVersionUID = -462568252;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_name</code>.
     */
    public void setCarAgentName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_name</code>.
     */
    public String getCarAgentName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.contact_phone</code>.
     */
    public void setContactPhone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.contact_phone</code>.
     */
    public String getContactPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.contact_fax</code>.
     */
    public void setContactFax(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.contact_fax</code>.
     */
    public String getContactFax() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.country_id</code>.
     */
    public void setCountryId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.booking_email</code>.
     */
    public void setBookingEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.booking_email</code>.
     */
    public String getBookingEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.airport_tax</code>.
     */
    public void setAirportTax(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.airport_tax</code>.
     */
    public BigDecimal getAirportTax() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.plan_code</code>.
     */
    public void setPlanCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.plan_code</code>.
     */
    public String getPlanCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.account_no</code>.
     */
    public void setAccountNo(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.account_no</code>.
     */
    public String getAccountNo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.rental_conditions</code>.
     */
    public void setRentalConditions(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.rental_conditions</code>.
     */
    public Integer getRentalConditions() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.rates_email</code>.
     */
    public void setRatesEmail(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.rates_email</code>.
     */
    public String getRatesEmail() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.password</code>.
     */
    public void setPassword(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.password</code>.
     */
    public String getPassword() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.Airport_Tax_Amt</code>.
     */
    public void setAirportTaxAmt(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.Airport_Tax_Amt</code>.
     */
    public BigDecimal getAirportTaxAmt() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.europe_rates</code>.
     */
    public void setEuropeRates(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.europe_rates</code>.
     */
    public Boolean getEuropeRates() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.freesale_code</code>.
     */
    public void setFreesaleCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.freesale_code</code>.
     */
    public String getFreesaleCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.markup_percent</code>.
     */
    public void setMarkupPercent(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.markup_percent</code>.
     */
    public BigDecimal getMarkupPercent() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fully_paid</code>.
     */
    public void setFullyPaid(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fully_paid</code>.
     */
    public Boolean getFullyPaid() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.markup_change_date</code>.
     */
    public void setMarkupChangeDate(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.markup_change_date</code>.
     */
    public Timestamp getMarkupChangeDate() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.markup_change_user</code>.
     */
    public void setMarkupChangeUser(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.markup_change_user</code>.
     */
    public Integer getMarkupChangeUser() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_desc</code>.
     */
    public void setCarAgentDesc(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_desc</code>.
     */
    public String getCarAgentDesc() {
        return (String) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_status</code>.
     */
    public void setCarAgentStatus(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_status</code>.
     */
    public Boolean getCarAgentStatus() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.image</code>.
     */
    public void setImage(byte... value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.image</code>.
     */
    public byte[] getImage() {
        return (byte[]) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.image_width</code>.
     */
    public void setImageWidth(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.image_width</code>.
     */
    public String getImageWidth() {
        return (String) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.image_height</code>.
     */
    public void setImageHeight(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.image_height</code>.
     */
    public String getImageHeight() {
        return (String) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.xml_agent_id</code>.
     */
    public void setXmlAgentId(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.xml_agent_id</code>.
     */
    public Integer getXmlAgentId() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.xml_agent_type</code>.
     */
    public void setXmlAgentType(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.xml_agent_type</code>.
     */
    public String getXmlAgentType() {
        return (String) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.year_loaded</code>.
     */
    public void setYearLoaded(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.year_loaded</code>.
     */
    public String getYearLoaded() {
        return (String) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.oneway_charge</code>.
     */
    public void setOnewayCharge(BigDecimal value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.oneway_charge</code>.
     */
    public BigDecimal getOnewayCharge() {
        return (BigDecimal) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.iscommercial</code>.
     */
    public void setIscommercial(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.iscommercial</code>.
     */
    public Boolean getIscommercial() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.priceless</code>.
     */
    public void setPriceless(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.priceless</code>.
     */
    public Integer getPriceless() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.picture</code>.
     */
    public void setPicture(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.picture</code>.
     */
    public String getPicture() {
        return (String) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.company_name</code>.
     */
    public void setCompanyName(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.percentage_bias</code>.
     */
    public void setPercentageBias(Integer value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.percentage_bias</code>.
     */
    public Integer getPercentageBias() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.technical_contact_email</code>.
     */
    public void setTechnicalContactEmail(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.technical_contact_email</code>.
     */
    public String getTechnicalContactEmail() {
        return (String) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.amendedBy</code>.
     */
    public void setAmendedby(Integer value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.amendedBy</code>.
     */
    public Integer getAmendedby() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.ui_token</code>.
     */
    public void setUiToken(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.ui_token</code>.
     */
    public String getUiToken() {
        return (String) get(35);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.reporting_email</code>.
     */
    public void setReportingEmail(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.reporting_email</code>.
     */
    public String getReportingEmail() {
        return (String) get(36);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.preferred_supplier</code>.
     */
    public void setPreferredSupplier(Boolean value) {
        set(37, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.preferred_supplier</code>.
     */
    public Boolean getPreferredSupplier() {
        return (Boolean) get(37);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.cxl_fee</code>.
     */
    public void setCxlFee(BigDecimal value) {
        set(38, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.cxl_fee</code>.
     */
    public BigDecimal getCxlFee() {
        return (BigDecimal) get(38);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.cxl_currency</code>.
     */
    public void setCxlCurrency(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.cxl_currency</code>.
     */
    public String getCxlCurrency() {
        return (String) get(39);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.pruning_category</code>.
     */
    public void setPruningCategory(Integer value) {
        set(40, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.pruning_category</code>.
     */
    public Integer getPruningCategory() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.ca_flags</code>.
     */
    public void setCaFlags(Integer value) {
        set(41, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.ca_flags</code>.
     */
    public Integer getCaFlags() {
        return (Integer) get(41);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fk_legalagreement</code>.
     */
    public void setFkLegalagreement(Integer value) {
        set(42, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fk_legalagreement</code>.
     */
    public Integer getFkLegalagreement() {
        return (Integer) get(42);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fk_supplierbrand</code>.
     */
    public void setFkSupplierbrand(Integer value) {
        set(43, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fk_supplierbrand</code>.
     */
    public Integer getFkSupplierbrand() {
        return (Integer) get(43);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fk_suppliers</code>.
     */
    public void setFkSuppliers(Integer value) {
        set(44, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fk_suppliers</code>.
     */
    public Integer getFkSuppliers() {
        return (Integer) get(44);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.last_updated_date</code>.
     */
    public void setLastUpdatedDate(Timestamp value) {
        set(45, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.last_updated_date</code>.
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) get(45);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.external_agent_id</code>.
     */
    public void setExternalAgentId(String value) {
        set(46, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.external_agent_id</code>.
     */
    public String getExternalAgentId() {
        return (String) get(46);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.aggregator_id</code>.
     */
    public void setAggregatorId(Integer value) {
        set(47, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.aggregator_id</code>.
     */
    public Integer getAggregatorId() {
        return (Integer) get(47);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.SP_OnewayRule</code>.
     */
    public void setSpOnewayrule(Boolean value) {
        set(48, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.SP_OnewayRule</code>.
     */
    public Boolean getSpOnewayrule() {
        return (Boolean) get(48);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.provider_type</code>.
     */
    public void setProviderType(UByte value) {
        set(49, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.provider_type</code>.
     */
    public UByte getProviderType() {
        return (UByte) get(49);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.caragent_rate_currency</code>.
     */
    public void setCaragentRateCurrency(String value) {
        set(50, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.caragent_rate_currency</code>.
     */
    public String getCaragentRateCurrency() {
        return (String) get(50);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_fee</code>.
     */
    public void setSupplierCancelFee(BigDecimal value) {
        set(51, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_fee</code>.
     */
    public BigDecimal getSupplierCancelFee() {
        return (BigDecimal) get(51);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_fee_currency</code>.
     */
    public void setSupplierCancelFeeCurrency(String value) {
        set(52, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_fee_currency</code>.
     */
    public String getSupplierCancelFeeCurrency() {
        return (String) get(52);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_free_days</code>.
     */
    public void setSupplierCancelFreeDays(Integer value) {
        set(53, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_free_days</code>.
     */
    public Integer getSupplierCancelFreeDays() {
        return (Integer) get(53);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_days_before_pickup</code>.
     */
    public void setSupplierCancelDaysBeforePickup(Integer value) {
        set(54, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_days_before_pickup</code>.
     */
    public Integer getSupplierCancelDaysBeforePickup() {
        return (Integer) get(54);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_fee_percent</code>.
     */
    public void setSupplierCancelFeePercent(BigDecimal value) {
        set(55, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_fee_percent</code>.
     */
    public BigDecimal getSupplierCancelFeePercent() {
        return (BigDecimal) get(55);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.test_xml_agent_type</code>.
     */
    public void setTestXmlAgentType(String value) {
        set(56, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.test_xml_agent_type</code>.
     */
    public String getTestXmlAgentType() {
        return (String) get(56);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Syncobj_0x4137423836314443Record
     */
    public Syncobj_0x4137423836314443Record() {
        super(Syncobj_0x4137423836314443.SYNCOBJ_0X4137423836314443);
    }

    /**
     * Create a detached, initialised Syncobj_0x4137423836314443Record
     */
    public Syncobj_0x4137423836314443Record(Integer carAgentId, String carAgentName, String contactPhone, String contactFax, String countryId, String bookingEmail, BigDecimal airportTax, String planCode, String accountNo, Integer rentalConditions, String ratesEmail, String password, BigDecimal airportTaxAmt, Boolean europeRates, String freesaleCode, BigDecimal markupPercent, Boolean fullyPaid, Timestamp markupChangeDate, Integer markupChangeUser, String carAgentDesc, Boolean carAgentStatus, byte[] image, String imageWidth, String imageHeight, Integer xmlAgentId, String xmlAgentType, String yearLoaded, BigDecimal onewayCharge, Boolean iscommercial, Integer priceless, String picture, String companyName, Integer percentageBias, String technicalContactEmail, Integer amendedby, String uiToken, String reportingEmail, Boolean preferredSupplier, BigDecimal cxlFee, String cxlCurrency, Integer pruningCategory, Integer caFlags, Integer fkLegalagreement, Integer fkSupplierbrand, Integer fkSuppliers, Timestamp lastUpdatedDate, String externalAgentId, Integer aggregatorId, Boolean spOnewayrule, UByte providerType, String caragentRateCurrency, BigDecimal supplierCancelFee, String supplierCancelFeeCurrency, Integer supplierCancelFreeDays, Integer supplierCancelDaysBeforePickup, BigDecimal supplierCancelFeePercent, String testXmlAgentType) {
        super(Syncobj_0x4137423836314443.SYNCOBJ_0X4137423836314443);

        set(0, carAgentId);
        set(1, carAgentName);
        set(2, contactPhone);
        set(3, contactFax);
        set(4, countryId);
        set(5, bookingEmail);
        set(6, airportTax);
        set(7, planCode);
        set(8, accountNo);
        set(9, rentalConditions);
        set(10, ratesEmail);
        set(11, password);
        set(12, airportTaxAmt);
        set(13, europeRates);
        set(14, freesaleCode);
        set(15, markupPercent);
        set(16, fullyPaid);
        set(17, markupChangeDate);
        set(18, markupChangeUser);
        set(19, carAgentDesc);
        set(20, carAgentStatus);
        set(21, image);
        set(22, imageWidth);
        set(23, imageHeight);
        set(24, xmlAgentId);
        set(25, xmlAgentType);
        set(26, yearLoaded);
        set(27, onewayCharge);
        set(28, iscommercial);
        set(29, priceless);
        set(30, picture);
        set(31, companyName);
        set(32, percentageBias);
        set(33, technicalContactEmail);
        set(34, amendedby);
        set(35, uiToken);
        set(36, reportingEmail);
        set(37, preferredSupplier);
        set(38, cxlFee);
        set(39, cxlCurrency);
        set(40, pruningCategory);
        set(41, caFlags);
        set(42, fkLegalagreement);
        set(43, fkSupplierbrand);
        set(44, fkSuppliers);
        set(45, lastUpdatedDate);
        set(46, externalAgentId);
        set(47, aggregatorId);
        set(48, spOnewayrule);
        set(49, providerType);
        set(50, caragentRateCurrency);
        set(51, supplierCancelFee);
        set(52, supplierCancelFeeCurrency);
        set(53, supplierCancelFreeDays);
        set(54, supplierCancelDaysBeforePickup);
        set(55, supplierCancelFeePercent);
        set(56, testXmlAgentType);
    }
}