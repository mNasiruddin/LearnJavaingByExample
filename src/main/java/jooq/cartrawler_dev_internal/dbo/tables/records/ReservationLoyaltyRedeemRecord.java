/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationLoyaltyRedeem;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class ReservationLoyaltyRedeemRecord extends UpdatableRecordImpl<ReservationLoyaltyRedeemRecord> implements Record9<Integer, Integer, Integer, BigDecimal, BigDecimal, String, String, String, String> {

    private static final long serialVersionUID = -1885488554;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.points</code>.
     */
    public void setPoints(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.points</code>.
     */
    public Integer getPoints() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.pointValue</code>.
     */
    public void setPointvalue(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.pointValue</code>.
     */
    public BigDecimal getPointvalue() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.paymentBalance</code>.
     */
    public void setPaymentbalance(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.paymentBalance</code>.
     */
    public BigDecimal getPaymentbalance() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.paymentCurrency</code>.
     */
    public void setPaymentcurrency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.paymentCurrency</code>.
     */
    public String getPaymentcurrency() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.program</code>.
     */
    public void setProgram(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.program</code>.
     */
    public String getProgram() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.loyaltyNum</code>.
     */
    public void setLoyaltynum(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.loyaltyNum</code>.
     */
    public String getLoyaltynum() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.transactionId</code>.
     */
    public void setTransactionid(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.transactionId</code>.
     */
    public String getTransactionid() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, BigDecimal, BigDecimal, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, BigDecimal, BigDecimal, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM.POINTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM.POINTVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM.PAYMENTBALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM.PAYMENTCURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM.PROGRAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM.LOYALTYNUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM.TRANSACTIONID;
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
    public Integer component2() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getPointvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getPaymentbalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPaymentcurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProgram();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getLoyaltynum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTransactionid();
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
    public Integer value2() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPointvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getPaymentbalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPaymentcurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProgram();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLoyaltynum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTransactionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord value2(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord value3(Integer value) {
        setPoints(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord value4(BigDecimal value) {
        setPointvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord value5(BigDecimal value) {
        setPaymentbalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord value6(String value) {
        setPaymentcurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord value7(String value) {
        setProgram(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord value8(String value) {
        setLoyaltynum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord value9(String value) {
        setTransactionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeemRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4, BigDecimal value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationLoyaltyRedeemRecord
     */
    public ReservationLoyaltyRedeemRecord() {
        super(ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM);
    }

    /**
     * Create a detached, initialised ReservationLoyaltyRedeemRecord
     */
    public ReservationLoyaltyRedeemRecord(Integer id, Integer fkReservation, Integer points, BigDecimal pointvalue, BigDecimal paymentbalance, String paymentcurrency, String program, String loyaltynum, String transactionid) {
        super(ReservationLoyaltyRedeem.RESERVATION_LOYALTY_REDEEM);

        set(0, id);
        set(1, fkReservation);
        set(2, points);
        set(3, pointvalue);
        set(4, paymentbalance);
        set(5, paymentcurrency);
        set(6, program);
        set(7, loyaltynum);
        set(8, transactionid);
    }
}
