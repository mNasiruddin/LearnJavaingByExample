/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SyncReservationPaymentInfo_1__119;

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
public class SyncReservationPaymentInfo_1__119Record extends TableRecordImpl<SyncReservationPaymentInfo_1__119Record> {

    private static final long serialVersionUID = 777003391;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.payment_model</code>.
     */
    public void setPaymentModel(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.payment_model</code>.
     */
    public UByte getPaymentModel() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_name</code>.
     */
    public void setCardName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_name</code>.
     */
    public String getCardName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_number</code>.
     */
    public void setCardNumber(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_number</code>.
     */
    public String getCardNumber() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_id</code>.
     */
    public void setCardId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_id</code>.
     */
    public Integer getCardId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_date</code>.
     */
    public void setCardDate(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_date</code>.
     */
    public String getCardDate() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.realex_pass_ref</code>.
     */
    public void setRealexPassRef(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.realex_pass_ref</code>.
     */
    public String getRealexPassRef() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.realex_card_ref</code>.
     */
    public void setRealexCardRef(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.realex_card_ref</code>.
     */
    public String getRealexCardRef() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.narrative</code>.
     */
    public void setNarrative(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.narrative</code>.
     */
    public String getNarrative() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.charge_amount</code>.
     */
    public void setChargeAmount(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.charge_amount</code>.
     */
    public BigDecimal getChargeAmount() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.charge_currency</code>.
     */
    public void setChargeCurrency(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.charge_currency</code>.
     */
    public String getChargeCurrency() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.retail_price</code>.
     */
    public void setRetailPrice(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.retail_price</code>.
     */
    public BigDecimal getRetailPrice() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.retail_price_currency</code>.
     */
    public void setRetailPriceCurrency(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.retail_price_currency</code>.
     */
    public String getRetailPriceCurrency() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.retail_price_currency_rate</code>.
     */
    public void setRetailPriceCurrencyRate(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.retail_price_currency_rate</code>.
     */
    public BigDecimal getRetailPriceCurrencyRate() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.promotion_code</code>.
     */
    public void setPromotionCode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.promotion_code</code>.
     */
    public String getPromotionCode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.transaction_id</code>.
     */
    public void setTransactionId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.cancel_fee</code>.
     */
    public void setCancelFee(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.cancel_fee</code>.
     */
    public BigDecimal getCancelFee() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.cancel_fee_currency</code>.
     */
    public void setCancelFeeCurrency(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.cancel_fee_currency</code>.
     */
    public String getCancelFeeCurrency() {
        return (String) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.partner_selling_currency</code>.
     */
    public void setPartnerSellingCurrency(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.partner_selling_currency</code>.
     */
    public String getPartnerSellingCurrency() {
        return (String) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.partner_selling_price</code>.
     */
    public void setPartnerSellingPrice(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.partner_selling_price</code>.
     */
    public BigDecimal getPartnerSellingPrice() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.supplier_voucher_reference</code>.
     */
    public void setSupplierVoucherReference(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.supplier_voucher_reference</code>.
     */
    public String getSupplierVoucherReference() {
        return (String) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.supplier_voucher_amount</code>.
     */
    public void setSupplierVoucherAmount(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.supplier_voucher_amount</code>.
     */
    public BigDecimal getSupplierVoucherAmount() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.supplier_voucher_currency</code>.
     */
    public void setSupplierVoucherCurrency(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.supplier_voucher_currency</code>.
     */
    public String getSupplierVoucherCurrency() {
        return (String) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.charge_paylater_amount</code>.
     */
    public void setChargePaylaterAmount(BigDecimal value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.charge_paylater_amount</code>.
     */
    public BigDecimal getChargePaylaterAmount() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.payment_method_type</code>.
     */
    public void setPaymentMethodType(UByte value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.payment_method_type</code>.
     */
    public UByte getPaymentMethodType() {
        return (UByte) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.charge_paylater_days</code>.
     */
    public void setChargePaylaterDays(UByte value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.charge_paylater_days</code>.
     */
    public UByte getChargePaylaterDays() {
        return (UByte) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_first_six</code>.
     */
    public void setCardFirstSix(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.card_first_six</code>.
     */
    public String getCardFirstSix() {
        return (String) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.delayed_payment_hours</code>.
     */
    public void setDelayedPaymentHours(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.delayed_payment_hours</code>.
     */
    public Integer getDelayedPaymentHours() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.voucher_amount</code>.
     */
    public void setVoucherAmount(BigDecimal value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.voucher_amount</code>.
     */
    public BigDecimal getVoucherAmount() {
        return (BigDecimal) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.is_debit_card</code>.
     */
    public void setIsDebitCard(Boolean value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.is_debit_card</code>.
     */
    public Boolean getIsDebitCard() {
        return (Boolean) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.is_debit</code>.
     */
    public void setIsDebit(Boolean value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.is_debit</code>.
     */
    public Boolean getIsDebit() {
        return (Boolean) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.payment_provider</code>.
     */
    public void setPaymentProvider(Short value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.payment_provider</code>.
     */
    public Short getPaymentProvider() {
        return (Short) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.encrypted_card_number</code>.
     */
    public void setEncryptedCardNumber(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SYNC_reservation_payment_info_1__119.encrypted_card_number</code>.
     */
    public String getEncryptedCardNumber() {
        return (String) get(34);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SyncReservationPaymentInfo_1__119Record
     */
    public SyncReservationPaymentInfo_1__119Record() {
        super(SyncReservationPaymentInfo_1__119.SYNC_RESERVATION_PAYMENT_INFO_1__119);
    }

    /**
     * Create a detached, initialised SyncReservationPaymentInfo_1__119Record
     */
    public SyncReservationPaymentInfo_1__119Record(UUID guid, Integer id, Integer fkReservation, UByte paymentModel, String cardName, String cardNumber, Integer cardId, String cardDate, String realexPassRef, String realexCardRef, String narrative, BigDecimal chargeAmount, String chargeCurrency, BigDecimal retailPrice, String retailPriceCurrency, BigDecimal retailPriceCurrencyRate, String promotionCode, Integer transactionId, BigDecimal cancelFee, String cancelFeeCurrency, String partnerSellingCurrency, BigDecimal partnerSellingPrice, String supplierVoucherReference, BigDecimal supplierVoucherAmount, String supplierVoucherCurrency, BigDecimal chargePaylaterAmount, UByte paymentMethodType, UByte chargePaylaterDays, String cardFirstSix, Integer delayedPaymentHours, BigDecimal voucherAmount, Boolean isDebitCard, Boolean isDebit, Short paymentProvider, String encryptedCardNumber) {
        super(SyncReservationPaymentInfo_1__119.SYNC_RESERVATION_PAYMENT_INFO_1__119);

        set(0, guid);
        set(1, id);
        set(2, fkReservation);
        set(3, paymentModel);
        set(4, cardName);
        set(5, cardNumber);
        set(6, cardId);
        set(7, cardDate);
        set(8, realexPassRef);
        set(9, realexCardRef);
        set(10, narrative);
        set(11, chargeAmount);
        set(12, chargeCurrency);
        set(13, retailPrice);
        set(14, retailPriceCurrency);
        set(15, retailPriceCurrencyRate);
        set(16, promotionCode);
        set(17, transactionId);
        set(18, cancelFee);
        set(19, cancelFeeCurrency);
        set(20, partnerSellingCurrency);
        set(21, partnerSellingPrice);
        set(22, supplierVoucherReference);
        set(23, supplierVoucherAmount);
        set(24, supplierVoucherCurrency);
        set(25, chargePaylaterAmount);
        set(26, paymentMethodType);
        set(27, chargePaylaterDays);
        set(28, cardFirstSix);
        set(29, delayedPaymentHours);
        set(30, voucherAmount);
        set(31, isDebitCard);
        set(32, isDebit);
        set(33, paymentProvider);
        set(34, encryptedCardNumber);
    }
}
