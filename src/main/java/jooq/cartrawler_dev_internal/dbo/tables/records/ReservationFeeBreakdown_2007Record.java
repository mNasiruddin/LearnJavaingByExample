/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationFeeBreakdown_2007;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
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
public class ReservationFeeBreakdown_2007Record extends UpdatableRecordImpl<ReservationFeeBreakdown_2007Record> implements Record10<Integer, UUID, Integer, UByte, UByte, UByte, BigDecimal, UByte, UByte, Integer> {

    private static final long serialVersionUID = 1599644953;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.guid</code>.
     */
    public void setGuid(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.type</code>.
     */
    public void setType(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.type</code>.
     */
    public UByte getType() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.status</code>.
     */
    public void setStatus(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.status</code>.
     */
    public UByte getStatus() {
        return (UByte) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.amount_status</code>.
     */
    public void setAmountStatus(UByte value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.amount_status</code>.
     */
    public UByte getAmountStatus() {
        return (UByte) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.fee_amount</code>.
     */
    public void setFeeAmount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.fee_amount</code>.
     */
    public BigDecimal getFeeAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.sales_tax</code>.
     */
    public void setSalesTax(UByte value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.sales_tax</code>.
     */
    public UByte getSalesTax() {
        return (UByte) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.payment_terms</code>.
     */
    public void setPaymentTerms(UByte value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.payment_terms</code>.
     */
    public UByte getPaymentTerms() {
        return (UByte) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.fk_rawdescription</code>.
     */
    public void setFkRawdescription(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2007.fk_rawdescription</code>.
     */
    public Integer getFkRawdescription() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, UUID, Integer, UByte, UByte, UByte, BigDecimal, UByte, UByte, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, UUID, Integer, UByte, UByte, UByte, BigDecimal, UByte, UByte, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field4() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field5() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field6() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.AMOUNT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.FEE_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field8() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.SALES_TAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field9() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.PAYMENT_TERMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007.FK_RAWDESCRIPTION;
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
    public UUID component2() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component6() {
        return getAmountStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getFeeAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component8() {
        return getSalesTax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component9() {
        return getPaymentTerms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getFkRawdescription();
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
    public UUID value2() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value6() {
        return getAmountStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getFeeAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value8() {
        return getSalesTax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value9() {
        return getPaymentTerms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getFkRawdescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value2(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value3(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value4(UByte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value5(UByte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value6(UByte value) {
        setAmountStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value7(BigDecimal value) {
        setFeeAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value8(UByte value) {
        setSalesTax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value9(UByte value) {
        setPaymentTerms(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record value10(Integer value) {
        setFkRawdescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2007Record values(Integer value1, UUID value2, Integer value3, UByte value4, UByte value5, UByte value6, BigDecimal value7, UByte value8, UByte value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationFeeBreakdown_2007Record
     */
    public ReservationFeeBreakdown_2007Record() {
        super(ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007);
    }

    /**
     * Create a detached, initialised ReservationFeeBreakdown_2007Record
     */
    public ReservationFeeBreakdown_2007Record(Integer id, UUID guid, Integer fkReservation, UByte type, UByte status, UByte amountStatus, BigDecimal feeAmount, UByte salesTax, UByte paymentTerms, Integer fkRawdescription) {
        super(ReservationFeeBreakdown_2007.RESERVATION_FEE_BREAKDOWN_2007);

        set(0, id);
        set(1, guid);
        set(2, fkReservation);
        set(3, type);
        set(4, status);
        set(5, amountStatus);
        set(6, feeAmount);
        set(7, salesTax);
        set(8, paymentTerms);
        set(9, fkRawdescription);
    }
}
