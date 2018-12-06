/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Syncobj_0x3436393932313342;

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
public class Syncobj_0x3436393932313342Record extends TableRecordImpl<Syncobj_0x3436393932313342Record> {

    private static final long serialVersionUID = 358628719;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.bonus_commission</code>.
     */
    public void setBonusCommission(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.bonus_commission</code>.
     */
    public BigDecimal getBonusCommission() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.retail_commission_amount</code>.
     */
    public void setRetailCommissionAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.retail_commission_amount</code>.
     */
    public BigDecimal getRetailCommissionAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_bill_exchange</code>.
     */
    public void setRateBillExchange(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_bill_exchange</code>.
     */
    public BigDecimal getRateBillExchange() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.bill_currency</code>.
     */
    public void setBillCurrency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.bill_currency</code>.
     */
    public String getBillCurrency() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_supplier_creditor</code>.
     */
    public void setFkSupplierCreditor(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_supplier_creditor</code>.
     */
    public Integer getFkSupplierCreditor() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_supplier_billing_rule</code>.
     */
    public void setFkSupplierBillingRule(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_supplier_billing_rule</code>.
     */
    public Integer getFkSupplierBillingRule() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_supplier_debtor</code>.
     */
    public void setFkSupplierDebtor(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_supplier_debtor</code>.
     */
    public Integer getFkSupplierDebtor() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rebate_value</code>.
     */
    public void setRebateValue(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rebate_value</code>.
     */
    public BigDecimal getRebateValue() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rebate_currency</code>.
     */
    public void setRebateCurrency(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rebate_currency</code>.
     */
    public String getRebateCurrency() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_rebate_exchange</code>.
     */
    public void setRateRebateExchange(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_rebate_exchange</code>.
     */
    public BigDecimal getRateRebateExchange() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_rebate_identifier</code>.
     */
    public void setFkRebateIdentifier(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_rebate_identifier</code>.
     */
    public Integer getFkRebateIdentifier() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_comm_percentage</code>.
     */
    public void setInsCommPercentage(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_comm_percentage</code>.
     */
    public BigDecimal getInsCommPercentage() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.supplier_entity</code>.
     */
    public void setSupplierEntity(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.supplier_entity</code>.
     */
    public String getSupplierEntity() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.techpartner_entity</code>.
     */
    public void setTechpartnerEntity(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.techpartner_entity</code>.
     */
    public String getTechpartnerEntity() {
        return (String) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_techpartner_creditor</code>.
     */
    public void setAxTechpartnerCreditor(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_techpartner_creditor</code>.
     */
    public String getAxTechpartnerCreditor() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_techpartner_debtor</code>.
     */
    public void setAxTechpartnerDebtor(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_techpartner_debtor</code>.
     */
    public String getAxTechpartnerDebtor() {
        return (String) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.bill_euro_exchange</code>.
     */
    public void setBillEuroExchange(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.bill_euro_exchange</code>.
     */
    public BigDecimal getBillEuroExchange() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.partner_bill_currency</code>.
     */
    public void setPartnerBillCurrency(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.partner_bill_currency</code>.
     */
    public String getPartnerBillCurrency() {
        return (String) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_partner_bill_exchange</code>.
     */
    public void setRatePartnerBillExchange(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_partner_bill_exchange</code>.
     */
    public BigDecimal getRatePartnerBillExchange() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.partner_bill_euro_exchange</code>.
     */
    public void setPartnerBillEuroExchange(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.partner_bill_euro_exchange</code>.
     */
    public BigDecimal getPartnerBillEuroExchange() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.tech_bill_currency</code>.
     */
    public void setTechBillCurrency(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.tech_bill_currency</code>.
     */
    public String getTechBillCurrency() {
        return (String) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_tech_bill_exchange</code>.
     */
    public void setRateTechBillExchange(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_tech_bill_exchange</code>.
     */
    public BigDecimal getRateTechBillExchange() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.tech_bill_euro_exchange</code>.
     */
    public void setTechBillEuroExchange(BigDecimal value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.tech_bill_euro_exchange</code>.
     */
    public BigDecimal getTechBillEuroExchange() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.franchisee_entity</code>.
     */
    public void setFranchiseeEntity(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.franchisee_entity</code>.
     */
    public String getFranchiseeEntity() {
        return (String) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_franchisee_creditor</code>.
     */
    public void setAxFranchiseeCreditor(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_franchisee_creditor</code>.
     */
    public String getAxFranchiseeCreditor() {
        return (String) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_franchisee_debtor</code>.
     */
    public void setAxFranchiseeDebtor(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_franchisee_debtor</code>.
     */
    public String getAxFranchiseeDebtor() {
        return (String) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.franchisee_bill_currency</code>.
     */
    public void setFranchiseeBillCurrency(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.franchisee_bill_currency</code>.
     */
    public String getFranchiseeBillCurrency() {
        return (String) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_franchisee_bill_exchange</code>.
     */
    public void setRateFranchiseeBillExchange(BigDecimal value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_franchisee_bill_exchange</code>.
     */
    public BigDecimal getRateFranchiseeBillExchange() {
        return (BigDecimal) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.franchisee_bill_euro_exchange</code>.
     */
    public void setFranchiseeBillEuroExchange(BigDecimal value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.franchisee_bill_euro_exchange</code>.
     */
    public BigDecimal getFranchiseeBillEuroExchange() {
        return (BigDecimal) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_amt_pd</code>.
     */
    public void setInsAmtPd(BigDecimal value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_amt_pd</code>.
     */
    public BigDecimal getInsAmtPd() {
        return (BigDecimal) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_amt_pd_curr</code>.
     */
    public void setInsAmtPdCurr(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_amt_pd_curr</code>.
     */
    public String getInsAmtPdCurr() {
        return (String) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_share_type</code>.
     */
    public void setInsShareType(Short value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_share_type</code>.
     */
    public Short getInsShareType() {
        return (Short) get(33);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Syncobj_0x3436393932313342Record
     */
    public Syncobj_0x3436393932313342Record() {
        super(Syncobj_0x3436393932313342.SYNCOBJ_0X3436393932313342);
    }

    /**
     * Create a detached, initialised Syncobj_0x3436393932313342Record
     */
    public Syncobj_0x3436393932313342Record(Integer id, Integer fkReservation, BigDecimal bonusCommission, BigDecimal retailCommissionAmount, BigDecimal rateBillExchange, String billCurrency, Integer fkSupplierCreditor, Integer fkSupplierBillingRule, Integer fkSupplierDebtor, BigDecimal rebateValue, String rebateCurrency, BigDecimal rateRebateExchange, Integer fkRebateIdentifier, BigDecimal insCommPercentage, String supplierEntity, String techpartnerEntity, String axTechpartnerCreditor, String axTechpartnerDebtor, BigDecimal billEuroExchange, String partnerBillCurrency, BigDecimal ratePartnerBillExchange, BigDecimal partnerBillEuroExchange, String techBillCurrency, BigDecimal rateTechBillExchange, BigDecimal techBillEuroExchange, String franchiseeEntity, String axFranchiseeCreditor, String axFranchiseeDebtor, String franchiseeBillCurrency, BigDecimal rateFranchiseeBillExchange, BigDecimal franchiseeBillEuroExchange, BigDecimal insAmtPd, String insAmtPdCurr, Short insShareType) {
        super(Syncobj_0x3436393932313342.SYNCOBJ_0X3436393932313342);

        set(0, id);
        set(1, fkReservation);
        set(2, bonusCommission);
        set(3, retailCommissionAmount);
        set(4, rateBillExchange);
        set(5, billCurrency);
        set(6, fkSupplierCreditor);
        set(7, fkSupplierBillingRule);
        set(8, fkSupplierDebtor);
        set(9, rebateValue);
        set(10, rebateCurrency);
        set(11, rateRebateExchange);
        set(12, fkRebateIdentifier);
        set(13, insCommPercentage);
        set(14, supplierEntity);
        set(15, techpartnerEntity);
        set(16, axTechpartnerCreditor);
        set(17, axTechpartnerDebtor);
        set(18, billEuroExchange);
        set(19, partnerBillCurrency);
        set(20, ratePartnerBillExchange);
        set(21, partnerBillEuroExchange);
        set(22, techBillCurrency);
        set(23, rateTechBillExchange);
        set(24, techBillEuroExchange);
        set(25, franchiseeEntity);
        set(26, axFranchiseeCreditor);
        set(27, axFranchiseeDebtor);
        set(28, franchiseeBillCurrency);
        set(29, rateFranchiseeBillExchange);
        set(30, franchiseeBillEuroExchange);
        set(31, insAmtPd);
        set(32, insAmtPdCurr);
        set(33, insShareType);
    }
}
