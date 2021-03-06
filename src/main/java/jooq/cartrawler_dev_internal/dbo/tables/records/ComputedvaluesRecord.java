/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Computedvalues;

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
public class ComputedvaluesRecord extends UpdatableRecordImpl<ComputedvaluesRecord> {

    private static final long serialVersionUID = -1580390301;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.revenue</code>.
     */
    public void setRevenue(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.revenue</code>.
     */
    public BigDecimal getRevenue() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.commission</code>.
     */
    public void setCommission(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.commission</code>.
     */
    public BigDecimal getCommission() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.ancillaries</code>.
     */
    public void setAncillaries(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.ancillaries</code>.
     */
    public BigDecimal getAncillaries() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.insurance_commission</code>.
     */
    public void setInsuranceCommission(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.insurance_commission</code>.
     */
    public BigDecimal getInsuranceCommission() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.netAmountBilledEuro</code>.
     */
    public void setNetamountbilledeuro(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.netAmountBilledEuro</code>.
     */
    public BigDecimal getNetamountbilledeuro() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.processingFeeEuro</code>.
     */
    public void setProcessingfeeeuro(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.processingFeeEuro</code>.
     */
    public BigDecimal getProcessingfeeeuro() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.pleaseRecompute</code>.
     */
    public void setPleaserecompute(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.pleaseRecompute</code>.
     */
    public Boolean getPleaserecompute() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.lastComputeTime</code>.
     */
    public void setLastcomputetime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.lastComputeTime</code>.
     */
    public Timestamp getLastcomputetime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.bookingFeeMistake</code>.
     */
    public void setBookingfeemistake(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.bookingFeeMistake</code>.
     */
    public Boolean getBookingfeemistake() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.due2supplier</code>.
     */
    public void setDue2supplier(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.due2supplier</code>.
     */
    public BigDecimal getDue2supplier() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalRevenue</code>.
     */
    public void setProvisionalrevenue(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalRevenue</code>.
     */
    public BigDecimal getProvisionalrevenue() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalCommission</code>.
     */
    public void setProvisionalcommission(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalCommission</code>.
     */
    public BigDecimal getProvisionalcommission() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.commissionInSettlementCurrency</code>.
     */
    public void setCommissioninsettlementcurrency(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.commissionInSettlementCurrency</code>.
     */
    public BigDecimal getCommissioninsettlementcurrency() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.revenueInSettlementCurrency</code>.
     */
    public void setRevenueinsettlementcurrency(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.revenueInSettlementCurrency</code>.
     */
    public BigDecimal getRevenueinsettlementcurrency() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalCommissionInSettlementCurrency</code>.
     */
    public void setProvisionalcommissioninsettlementcurrency(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalCommissionInSettlementCurrency</code>.
     */
    public BigDecimal getProvisionalcommissioninsettlementcurrency() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.due2Franchisee</code>.
     */
    public void setDue2franchisee(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.due2Franchisee</code>.
     */
    public BigDecimal getDue2franchisee() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalInsuranceRevenue</code>.
     */
    public void setProvisionalinsurancerevenue(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalInsuranceRevenue</code>.
     */
    public BigDecimal getProvisionalinsurancerevenue() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.cash_balance</code>.
     */
    public void setCashBalance(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.cash_balance</code>.
     */
    public BigDecimal getCashBalance() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_fronting_fee</code>.
     */
    public void setAxaFrontingFee(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_fronting_fee</code>.
     */
    public BigDecimal getAxaFrontingFee() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_captive_ct</code>.
     */
    public void setAxaCaptiveCt(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_captive_ct</code>.
     */
    public BigDecimal getAxaCaptiveCt() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_captive_axa</code>.
     */
    public void setAxaCaptiveAxa(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_captive_axa</code>.
     */
    public BigDecimal getAxaCaptiveAxa() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_taxes</code>.
     */
    public void setAxaTaxes(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_taxes</code>.
     */
    public BigDecimal getAxaTaxes() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.refund_rev</code>.
     */
    public void setRefundRev(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.refund_rev</code>.
     */
    public BigDecimal getRefundRev() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.refund_cost</code>.
     */
    public void setRefundCost(BigDecimal value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.refund_cost</code>.
     */
    public BigDecimal getRefundCost() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.fin_details</code>.
     */
    public void setFinDetails(Short value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.fin_details</code>.
     */
    public Short getFinDetails() {
        return (Short) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.supplier_recharge</code>.
     */
    public void setSupplierRecharge(BigDecimal value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.supplier_recharge</code>.
     */
    public BigDecimal getSupplierRecharge() {
        return (BigDecimal) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.ins_refund_cost</code>.
     */
    public void setInsRefundCost(BigDecimal value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.ins_refund_cost</code>.
     */
    public BigDecimal getInsRefundCost() {
        return (BigDecimal) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalDue2supplier</code>.
     */
    public void setProvisionaldue2supplier(BigDecimal value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.provisionalDue2supplier</code>.
     */
    public BigDecimal getProvisionaldue2supplier() {
        return (BigDecimal) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_inv</code>.
     */
    public void setAxaInv(Boolean value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.computedValues.axa_inv</code>.
     */
    public Boolean getAxaInv() {
        return (Boolean) get(29);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ComputedvaluesRecord
     */
    public ComputedvaluesRecord() {
        super(Computedvalues.COMPUTEDVALUES);
    }

    /**
     * Create a detached, initialised ComputedvaluesRecord
     */
    public ComputedvaluesRecord(Integer fkReservation, BigDecimal revenue, BigDecimal commission, BigDecimal ancillaries, BigDecimal insuranceCommission, BigDecimal netamountbilledeuro, BigDecimal processingfeeeuro, Boolean pleaserecompute, Timestamp lastcomputetime, Boolean bookingfeemistake, BigDecimal due2supplier, BigDecimal provisionalrevenue, BigDecimal provisionalcommission, BigDecimal commissioninsettlementcurrency, BigDecimal revenueinsettlementcurrency, BigDecimal provisionalcommissioninsettlementcurrency, BigDecimal due2franchisee, BigDecimal provisionalinsurancerevenue, BigDecimal cashBalance, BigDecimal axaFrontingFee, BigDecimal axaCaptiveCt, BigDecimal axaCaptiveAxa, BigDecimal axaTaxes, BigDecimal refundRev, BigDecimal refundCost, Short finDetails, BigDecimal supplierRecharge, BigDecimal insRefundCost, BigDecimal provisionaldue2supplier, Boolean axaInv) {
        super(Computedvalues.COMPUTEDVALUES);

        set(0, fkReservation);
        set(1, revenue);
        set(2, commission);
        set(3, ancillaries);
        set(4, insuranceCommission);
        set(5, netamountbilledeuro);
        set(6, processingfeeeuro);
        set(7, pleaserecompute);
        set(8, lastcomputetime);
        set(9, bookingfeemistake);
        set(10, due2supplier);
        set(11, provisionalrevenue);
        set(12, provisionalcommission);
        set(13, commissioninsettlementcurrency);
        set(14, revenueinsettlementcurrency);
        set(15, provisionalcommissioninsettlementcurrency);
        set(16, due2franchisee);
        set(17, provisionalinsurancerevenue);
        set(18, cashBalance);
        set(19, axaFrontingFee);
        set(20, axaCaptiveCt);
        set(21, axaCaptiveAxa);
        set(22, axaTaxes);
        set(23, refundRev);
        set(24, refundCost);
        set(25, finDetails);
        set(26, supplierRecharge);
        set(27, insRefundCost);
        set(28, provisionaldue2supplier);
        set(29, axaInv);
    }
}
