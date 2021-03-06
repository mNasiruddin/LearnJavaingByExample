/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Plancontract;

import org.jooq.Record1;
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
public class PlancontractRecord extends UpdatableRecordImpl<PlancontractRecord> {

    private static final long serialVersionUID = -1620676575;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.convenienceid</code>.
     */
    public void setConvenienceid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.convenienceid</code>.
     */
    public Integer getConvenienceid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.fk_client</code>.
     */
    public void setFkClient(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.fk_client</code>.
     */
    public Integer getFkClient() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.Description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.Description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.PrepaidAcc</code>.
     */
    public void setPrepaidacc(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.PrepaidAcc</code>.
     */
    public String getPrepaidacc() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.Contract</code>.
     */
    public void setContract(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.Contract</code>.
     */
    public String getContract() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.associatedAgent</code>.
     */
    public void setAssociatedagent(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.associatedAgent</code>.
     */
    public Integer getAssociatedagent() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.NA2NA</code>.
     */
    public void setNa2na(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.NA2NA</code>.
     */
    public Boolean getNa2na() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.NA2EU</code>.
     */
    public void setNa2eu(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.NA2EU</code>.
     */
    public Boolean getNa2eu() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.EU2NA</code>.
     */
    public void setEu2na(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.EU2NA</code>.
     */
    public Boolean getEu2na() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.EU2EU</code>.
     */
    public void setEu2eu(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.EU2EU</code>.
     */
    public Boolean getEu2eu() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.ROWSource</code>.
     */
    public void setRowsource(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.ROWSource</code>.
     */
    public Boolean getRowsource() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.ROWpickup</code>.
     */
    public void setRowpickup(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.ROWpickup</code>.
     */
    public Boolean getRowpickup() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.postPaid</code>.
     */
    public void setPostpaid(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.postPaid</code>.
     */
    public Boolean getPostpaid() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.prePaid</code>.
     */
    public void setPrepaid(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.prePaid</code>.
     */
    public Boolean getPrepaid() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.net</code>.
     */
    public void setNet(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.net</code>.
     */
    public Boolean getNet() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.crossSellOnly</code>.
     */
    public void setCrosssellonly(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.crossSellOnly</code>.
     */
    public Boolean getCrosssellonly() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.opaqueOnly</code>.
     */
    public void setOpaqueonly(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.opaqueOnly</code>.
     */
    public Boolean getOpaqueonly() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.airlinesOnly</code>.
     */
    public void setAirlinesonly(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.airlinesOnly</code>.
     */
    public Boolean getAirlinesonly() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.global</code>.
     */
    public void setGlobal(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.global</code>.
     */
    public Boolean getGlobal() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.contractRulesType</code>.
     */
    public void setContractrulestype(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.contractRulesType</code>.
     */
    public String getContractrulestype() {
        return (String) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.OFF</code>.
     */
    public void setOff(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.OFF</code>.
     */
    public Boolean getOff() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.exclusiveToThisCountry</code>.
     */
    public void setExclusivetothiscountry(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.exclusiveToThisCountry</code>.
     */
    public String getExclusivetothiscountry() {
        return (String) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.exclusiveToThisResidency</code>.
     */
    public void setExclusivetothisresidency(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.exclusiveToThisResidency</code>.
     */
    public String getExclusivetothisresidency() {
        return (String) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.useDefaultRules</code>.
     */
    public void setUsedefaultrules(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.useDefaultRules</code>.
     */
    public Boolean getUsedefaultrules() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.showInRc</code>.
     */
    public void setShowinrc(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.showInRc</code>.
     */
    public Boolean getShowinrc() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.rcContractID</code>.
     */
    public void setRccontractid(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.rcContractID</code>.
     */
    public Integer getRccontractid() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.exclusiveToAgent</code>.
     */
    public void setExclusivetoagent(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.exclusiveToAgent</code>.
     */
    public Boolean getExclusivetoagent() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.domesticOnly</code>.
     */
    public void setDomesticonly(Boolean value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.domesticOnly</code>.
     */
    public Boolean getDomesticonly() {
        return (Boolean) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.notForDomesticUse</code>.
     */
    public void setNotfordomesticuse(Boolean value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.notForDomesticUse</code>.
     */
    public Boolean getNotfordomesticuse() {
        return (Boolean) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.showRawFeeBreakdown</code>.
     */
    public void setShowrawfeebreakdown(Boolean value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.showRawFeeBreakdown</code>.
     */
    public Boolean getShowrawfeebreakdown() {
        return (Boolean) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.domesticExclusions</code>.
     */
    public void setDomesticexclusions(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.domesticExclusions</code>.
     */
    public String getDomesticexclusions() {
        return (String) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.useDynamicConditions</code>.
     */
    public void setUsedynamicconditions(Boolean value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.useDynamicConditions</code>.
     */
    public Boolean getUsedynamicconditions() {
        return (Boolean) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.IATA</code>.
     */
    public void setIata(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.IATA</code>.
     */
    public String getIata() {
        return (String) get(34);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.fk_virtualLocation</code>.
     */
    public void setFkVirtuallocation(Integer value) {
        set(35, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.fk_virtualLocation</code>.
     */
    public Integer getFkVirtuallocation() {
        return (Integer) get(35);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.filterSIPPList</code>.
     */
    public void setFiltersipplist(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.filterSIPPList</code>.
     */
    public String getFiltersipplist() {
        return (String) get(36);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.minDays</code>.
     */
    public void setMindays(Integer value) {
        set(37, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.minDays</code>.
     */
    public Integer getMindays() {
        return (Integer) get(37);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.maxDays</code>.
     */
    public void setMaxdays(Integer value) {
        set(38, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.maxDays</code>.
     */
    public Integer getMaxdays() {
        return (Integer) get(38);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(39, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(39);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.retail_commission</code>.
     */
    public void setRetailCommission(BigDecimal value) {
        set(40, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.retail_commission</code>.
     */
    public BigDecimal getRetailCommission() {
        return (BigDecimal) get(40);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.allowAncillaryInsurance</code>.
     */
    public void setAllowancillaryinsurance(Boolean value) {
        set(41, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.allowAncillaryInsurance</code>.
     */
    public Boolean getAllowancillaryinsurance() {
        return (Boolean) get(41);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.productType</code>.
     */
    public void setProducttype(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.productType</code>.
     */
    public String getProducttype() {
        return (String) get(42);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.effectiveFrom</code>.
     */
    public void setEffectivefrom(Timestamp value) {
        set(43, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.effectiveFrom</code>.
     */
    public Timestamp getEffectivefrom() {
        return (Timestamp) get(43);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.effectiveTo</code>.
     */
    public void setEffectiveto(Timestamp value) {
        set(44, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.effectiveTo</code>.
     */
    public Timestamp getEffectiveto() {
        return (Timestamp) get(44);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.pickupFrom</code>.
     */
    public void setPickupfrom(Timestamp value) {
        set(45, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.pickupFrom</code>.
     */
    public Timestamp getPickupfrom() {
        return (Timestamp) get(45);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.pickupTo</code>.
     */
    public void setPickupto(Timestamp value) {
        set(46, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.pickupTo</code>.
     */
    public Timestamp getPickupto() {
        return (Timestamp) get(46);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.countryExclusions</code>.
     */
    public void setCountryexclusions(String value) {
        set(47, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.countryExclusions</code>.
     */
    public String getCountryexclusions() {
        return (String) get(47);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.rateCode</code>.
     */
    public void setRatecode(String value) {
        set(48, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.rateCode</code>.
     */
    public String getRatecode() {
        return (String) get(48);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.amendedBy</code>.
     */
    public void setAmendedby(Integer value) {
        set(49, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.amendedBy</code>.
     */
    public Integer getAmendedby() {
        return (Integer) get(49);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.extendedProperties</code>.
     */
    public void setExtendedproperties(String value) {
        set(50, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.extendedProperties</code>.
     */
    public String getExtendedproperties() {
        return (String) get(50);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiRetail</code>.
     */
    public void setFlexiretail(Boolean value) {
        set(51, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiRetail</code>.
     */
    public Boolean getFlexiretail() {
        return (Boolean) get(51);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.cacheLongevityInSeconds</code>.
     */
    public void setCachelongevityinseconds(Integer value) {
        set(52, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.cacheLongevityInSeconds</code>.
     */
    public Integer getCachelongevityinseconds() {
        return (Integer) get(52);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.rebateAmount</code>.
     */
    public void setRebateamount(BigDecimal value) {
        set(53, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.rebateAmount</code>.
     */
    public BigDecimal getRebateamount() {
        return (BigDecimal) get(53);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.rebateCurrency</code>.
     */
    public void setRebatecurrency(String value) {
        set(54, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.rebateCurrency</code>.
     */
    public String getRebatecurrency() {
        return (String) get(54);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.rebateIsPerDay</code>.
     */
    public void setRebateisperday(Boolean value) {
        set(55, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.rebateIsPerDay</code>.
     */
    public Boolean getRebateisperday() {
        return (Boolean) get(55);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.residencyExclusions</code>.
     */
    public void setResidencyexclusions(String value) {
        set(56, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.residencyExclusions</code>.
     */
    public String getResidencyexclusions() {
        return (String) get(56);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.mixin</code>.
     */
    public void setMixin(Boolean value) {
        set(57, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.mixin</code>.
     */
    public Boolean getMixin() {
        return (Boolean) get(57);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiRetailUpwards</code>.
     */
    public void setFlexiretailupwards(Boolean value) {
        set(58, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiRetailUpwards</code>.
     */
    public Boolean getFlexiretailupwards() {
        return (Boolean) get(58);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiRetailDownwards</code>.
     */
    public void setFlexiretaildownwards(Boolean value) {
        set(59, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiRetailDownwards</code>.
     */
    public Boolean getFlexiretaildownwards() {
        return (Boolean) get(59);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.GDS</code>.
     */
    public void setGds(Boolean value) {
        set(60, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.GDS</code>.
     */
    public Boolean getGds() {
        return (Boolean) get(60);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.noshowFee</code>.
     */
    public void setNoshowfee(BigDecimal value) {
        set(61, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.noshowFee</code>.
     */
    public BigDecimal getNoshowfee() {
        return (BigDecimal) get(61);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.noshowCurrency</code>.
     */
    public void setNoshowcurrency(String value) {
        set(62, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.noshowCurrency</code>.
     */
    public String getNoshowcurrency() {
        return (String) get(62);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.promotions</code>.
     */
    public void setPromotions(String value) {
        set(63, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.promotions</code>.
     */
    public String getPromotions() {
        return (String) get(63);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.isCorporate</code>.
     */
    public void setIscorporate(Boolean value) {
        set(64, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.isCorporate</code>.
     */
    public Boolean getIscorporate() {
        return (Boolean) get(64);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.isSpecialContract</code>.
     */
    public void setIsspecialcontract(Boolean value) {
        set(65, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.isSpecialContract</code>.
     */
    public Boolean getIsspecialcontract() {
        return (Boolean) get(65);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.isSwitchContract</code>.
     */
    public void setIsswitchcontract(Boolean value) {
        set(66, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.isSwitchContract</code>.
     */
    public Boolean getIsswitchcontract() {
        return (Boolean) get(66);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.vehicleWithDriver</code>.
     */
    public void setVehiclewithdriver(Boolean value) {
        set(67, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.vehicleWithDriver</code>.
     */
    public Boolean getVehiclewithdriver() {
        return (Boolean) get(67);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.partpaid</code>.
     */
    public void setPartpaid(Boolean value) {
        set(68, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.partpaid</code>.
     */
    public Boolean getPartpaid() {
        return (Boolean) get(68);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.isDynamicFleet</code>.
     */
    public void setIsdynamicfleet(Boolean value) {
        set(69, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.isDynamicFleet</code>.
     */
    public Boolean getIsdynamicfleet() {
        return (Boolean) get(69);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.noVATReport</code>.
     */
    public void setNovatreport(Boolean value) {
        set(70, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.noVATReport</code>.
     */
    public Boolean getNovatreport() {
        return (Boolean) get(70);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.opacity</code>.
     */
    public void setOpacity(Short value) {
        set(71, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.opacity</code>.
     */
    public Short getOpacity() {
        return (Short) get(71);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.associatedReplacementContract</code>.
     */
    public void setAssociatedreplacementcontract(Integer value) {
        set(72, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.associatedReplacementContract</code>.
     */
    public Integer getAssociatedreplacementcontract() {
        return (Integer) get(72);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiRetailupwardsBackup</code>.
     */
    public void setFlexiretailupwardsbackup(Boolean value) {
        set(73, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiRetailupwardsBackup</code>.
     */
    public Boolean getFlexiretailupwardsbackup() {
        return (Boolean) get(73);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiUpWithinPlan</code>.
     */
    public void setFlexiupwithinplan(Boolean value) {
        set(74, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.flexiUpWithinPlan</code>.
     */
    public Boolean getFlexiupwithinplan() {
        return (Boolean) get(74);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.fk_brandplatform</code>.
     */
    public void setFkBrandplatform(Integer value) {
        set(75, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.fk_brandplatform</code>.
     */
    public Integer getFkBrandplatform() {
        return (Integer) get(75);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.fk_supplierbrandplatform</code>.
     */
    public void setFkSupplierbrandplatform(Integer value) {
        set(76, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.fk_supplierbrandplatform</code>.
     */
    public Integer getFkSupplierbrandplatform() {
        return (Integer) get(76);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.isRetail_comm_dynamic</code>.
     */
    public void setIsretailCommDynamic(Boolean value) {
        set(77, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.isRetail_comm_dynamic</code>.
     */
    public Boolean getIsretailCommDynamic() {
        return (Boolean) get(77);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.opaqueLogoUrl</code>.
     */
    public void setOpaquelogourl(String value) {
        set(78, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.opaqueLogoUrl</code>.
     */
    public String getOpaquelogourl() {
        return (String) get(78);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.opaqueVendorName</code>.
     */
    public void setOpaquevendorname(String value) {
        set(79, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.opaqueVendorName</code>.
     */
    public String getOpaquevendorname() {
        return (String) get(79);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.fuelPolicy</code>.
     */
    public void setFuelpolicy(String value) {
        set(80, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.fuelPolicy</code>.
     */
    public String getFuelpolicy() {
        return (String) get(80);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.mileageType</code>.
     */
    public void setMileagetype(String value) {
        set(81, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.mileageType</code>.
     */
    public String getMileagetype() {
        return (String) get(81);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.businessType</code>.
     */
    public void setBusinesstype(String value) {
        set(82, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.businessType</code>.
     */
    public String getBusinesstype() {
        return (String) get(82);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.isDistressedFilter</code>.
     */
    public void setIsdistressedfilter(Boolean value) {
        set(83, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.isDistressedFilter</code>.
     */
    public Boolean getIsdistressedfilter() {
        return (Boolean) get(83);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.xmlAgentType</code>.
     */
    public void setXmlagenttype(String value) {
        set(84, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.xmlAgentType</code>.
     */
    public String getXmlagenttype() {
        return (String) get(84);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.contractCarAgentMode</code>.
     */
    public void setContractcaragentmode(String value) {
        set(85, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.contractCarAgentMode</code>.
     */
    public String getContractcaragentmode() {
        return (String) get(85);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.isContractSwitchedON</code>.
     */
    public void setIscontractswitchedon(Boolean value) {
        set(86, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.isContractSwitchedON</code>.
     */
    public Boolean getIscontractswitchedon() {
        return (Boolean) get(86);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.xmlAgentType_CountryID</code>.
     */
    public void setXmlagenttypeCountryid(String value) {
        set(87, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.xmlAgentType_CountryID</code>.
     */
    public String getXmlagenttypeCountryid() {
        return (String) get(87);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.isClosedUserGroup</code>.
     */
    public void setIsclosedusergroup(Boolean value) {
        set(88, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.isClosedUserGroup</code>.
     */
    public Boolean getIsclosedusergroup() {
        return (Boolean) get(88);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContract.demotion_contracts</code>.
     */
    public void setDemotionContracts(String value) {
        set(89, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContract.demotion_contracts</code>.
     */
    public String getDemotionContracts() {
        return (String) get(89);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlancontractRecord
     */
    public PlancontractRecord() {
        super(Plancontract.PLANCONTRACT);
    }

    /**
     * Create a detached, initialised PlancontractRecord
     */
    public PlancontractRecord(UUID guid, Integer convenienceid, String title, Integer fkClient, String description, String prepaidacc, String contract, Integer associatedagent, Boolean na2na, Boolean na2eu, Boolean eu2na, Boolean eu2eu, Boolean rowsource, Boolean rowpickup, Boolean postpaid, Boolean prepaid, Boolean net, Boolean crosssellonly, Boolean opaqueonly, Boolean airlinesonly, Boolean global, String contractrulestype, Boolean off, String exclusivetothiscountry, String exclusivetothisresidency, Boolean usedefaultrules, Boolean showinrc, Integer rccontractid, Boolean exclusivetoagent, Boolean domesticonly, Boolean notfordomesticuse, Boolean showrawfeebreakdown, String domesticexclusions, Boolean usedynamicconditions, String iata, Integer fkVirtuallocation, String filtersipplist, Integer mindays, Integer maxdays, Boolean deleted, BigDecimal retailCommission, Boolean allowancillaryinsurance, String producttype, Timestamp effectivefrom, Timestamp effectiveto, Timestamp pickupfrom, Timestamp pickupto, String countryexclusions, String ratecode, Integer amendedby, String extendedproperties, Boolean flexiretail, Integer cachelongevityinseconds, BigDecimal rebateamount, String rebatecurrency, Boolean rebateisperday, String residencyexclusions, Boolean mixin, Boolean flexiretailupwards, Boolean flexiretaildownwards, Boolean gds, BigDecimal noshowfee, String noshowcurrency, String promotions, Boolean iscorporate, Boolean isspecialcontract, Boolean isswitchcontract, Boolean vehiclewithdriver, Boolean partpaid, Boolean isdynamicfleet, Boolean novatreport, Short opacity, Integer associatedreplacementcontract, Boolean flexiretailupwardsbackup, Boolean flexiupwithinplan, Integer fkBrandplatform, Integer fkSupplierbrandplatform, Boolean isretailCommDynamic, String opaquelogourl, String opaquevendorname, String fuelpolicy, String mileagetype, String businesstype, Boolean isdistressedfilter, String xmlagenttype, String contractcaragentmode, Boolean iscontractswitchedon, String xmlagenttypeCountryid, Boolean isclosedusergroup, String demotionContracts) {
        super(Plancontract.PLANCONTRACT);

        set(0, guid);
        set(1, convenienceid);
        set(2, title);
        set(3, fkClient);
        set(4, description);
        set(5, prepaidacc);
        set(6, contract);
        set(7, associatedagent);
        set(8, na2na);
        set(9, na2eu);
        set(10, eu2na);
        set(11, eu2eu);
        set(12, rowsource);
        set(13, rowpickup);
        set(14, postpaid);
        set(15, prepaid);
        set(16, net);
        set(17, crosssellonly);
        set(18, opaqueonly);
        set(19, airlinesonly);
        set(20, global);
        set(21, contractrulestype);
        set(22, off);
        set(23, exclusivetothiscountry);
        set(24, exclusivetothisresidency);
        set(25, usedefaultrules);
        set(26, showinrc);
        set(27, rccontractid);
        set(28, exclusivetoagent);
        set(29, domesticonly);
        set(30, notfordomesticuse);
        set(31, showrawfeebreakdown);
        set(32, domesticexclusions);
        set(33, usedynamicconditions);
        set(34, iata);
        set(35, fkVirtuallocation);
        set(36, filtersipplist);
        set(37, mindays);
        set(38, maxdays);
        set(39, deleted);
        set(40, retailCommission);
        set(41, allowancillaryinsurance);
        set(42, producttype);
        set(43, effectivefrom);
        set(44, effectiveto);
        set(45, pickupfrom);
        set(46, pickupto);
        set(47, countryexclusions);
        set(48, ratecode);
        set(49, amendedby);
        set(50, extendedproperties);
        set(51, flexiretail);
        set(52, cachelongevityinseconds);
        set(53, rebateamount);
        set(54, rebatecurrency);
        set(55, rebateisperday);
        set(56, residencyexclusions);
        set(57, mixin);
        set(58, flexiretailupwards);
        set(59, flexiretaildownwards);
        set(60, gds);
        set(61, noshowfee);
        set(62, noshowcurrency);
        set(63, promotions);
        set(64, iscorporate);
        set(65, isspecialcontract);
        set(66, isswitchcontract);
        set(67, vehiclewithdriver);
        set(68, partpaid);
        set(69, isdynamicfleet);
        set(70, novatreport);
        set(71, opacity);
        set(72, associatedreplacementcontract);
        set(73, flexiretailupwardsbackup);
        set(74, flexiupwithinplan);
        set(75, fkBrandplatform);
        set(76, fkSupplierbrandplatform);
        set(77, isretailCommDynamic);
        set(78, opaquelogourl);
        set(79, opaquevendorname);
        set(80, fuelpolicy);
        set(81, mileagetype);
        set(82, businesstype);
        set(83, isdistressedfilter);
        set(84, xmlagenttype);
        set(85, contractcaragentmode);
        set(86, iscontractswitchedon);
        set(87, xmlagenttypeCountryid);
        set(88, isclosedusergroup);
        set(89, demotionContracts);
    }
}
