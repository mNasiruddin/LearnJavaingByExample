/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationLegRehouseAttempt;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class ReservationLegRehouseAttemptRecord extends TableRecordImpl<ReservationLegRehouseAttemptRecord> implements Record15<Integer, Integer, Integer, String, Timestamp, String, String, Integer, String, BigDecimal, String, String, String, BigDecimal, String> {

    private static final long serialVersionUID = -1210195735;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.fk_leg</code>.
     */
    public void setFkLeg(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.fk_leg</code>.
     */
    public Integer getFkLeg() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.rehouse_attempt_status</code>.
     */
    public void setRehouseAttemptStatus(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.rehouse_attempt_status</code>.
     */
    public String getRehouseAttemptStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.rehouse_attempt_date</code>.
     */
    public void setRehouseAttemptDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.rehouse_attempt_date</code>.
     */
    public Timestamp getRehouseAttemptDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.rehouse_attempt_time</code>.
     */
    public void setRehouseAttemptTime(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.rehouse_attempt_time</code>.
     */
    public String getRehouseAttemptTime() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_supplier_ref</code>.
     */
    public void setOrigSupplierRef(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_supplier_ref</code>.
     */
    public String getOrigSupplierRef() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_car_agent_id</code>.
     */
    public void setOrigCarAgentId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_car_agent_id</code>.
     */
    public Integer getOrigCarAgentId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_api_ref</code>.
     */
    public void setOrigApiRef(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_api_ref</code>.
     */
    public String getOrigApiRef() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_cost</code>.
     */
    public void setOrigCost(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_cost</code>.
     */
    public BigDecimal getOrigCost() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_currency</code>.
     */
    public void setOrigCurrency(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_currency</code>.
     */
    public String getOrigCurrency() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_service_level</code>.
     */
    public void setOrigServiceLevel(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_service_level</code>.
     */
    public String getOrigServiceLevel() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_vehicle_kind</code>.
     */
    public void setOrigVehicleKind(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_vehicle_kind</code>.
     */
    public String getOrigVehicleKind() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_emv</code>.
     */
    public void setOrigEmv(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_emv</code>.
     */
    public BigDecimal getOrigEmv() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_txid</code>.
     */
    public void setOrigTxid(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Leg_Rehouse_Attempt.orig_txid</code>.
     */
    public String getOrigTxid() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, String, Timestamp, String, String, Integer, String, BigDecimal, String, String, String, BigDecimal, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, String, Timestamp, String, String, Integer, String, BigDecimal, String, String, String, BigDecimal, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.FK_LEG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.REHOUSE_ATTEMPT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.REHOUSE_ATTEMPT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.REHOUSE_ATTEMPT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ORIG_SUPPLIER_REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ORIG_CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ORIG_API_REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ORIG_COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ORIG_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ORIG_SERVICE_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ORIG_VEHICLE_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ORIG_EMV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT.ORIG_TXID;
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
        return getFkLeg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRehouseAttemptStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getRehouseAttemptDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRehouseAttemptTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOrigSupplierRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getOrigCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOrigApiRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getOrigCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getOrigCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getOrigServiceLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getOrigVehicleKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getOrigEmv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getOrigTxid();
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
        return getFkLeg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRehouseAttemptStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getRehouseAttemptDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRehouseAttemptTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOrigSupplierRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOrigCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOrigApiRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getOrigCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getOrigCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getOrigServiceLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getOrigVehicleKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getOrigEmv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getOrigTxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value2(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value3(Integer value) {
        setFkLeg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value4(String value) {
        setRehouseAttemptStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value5(Timestamp value) {
        setRehouseAttemptDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value6(String value) {
        setRehouseAttemptTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value7(String value) {
        setOrigSupplierRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value8(Integer value) {
        setOrigCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value9(String value) {
        setOrigApiRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value10(BigDecimal value) {
        setOrigCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value11(String value) {
        setOrigCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value12(String value) {
        setOrigServiceLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value13(String value) {
        setOrigVehicleKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value14(BigDecimal value) {
        setOrigEmv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord value15(String value) {
        setOrigTxid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLegRehouseAttemptRecord values(Integer value1, Integer value2, Integer value3, String value4, Timestamp value5, String value6, String value7, Integer value8, String value9, BigDecimal value10, String value11, String value12, String value13, BigDecimal value14, String value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationLegRehouseAttemptRecord
     */
    public ReservationLegRehouseAttemptRecord() {
        super(ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT);
    }

    /**
     * Create a detached, initialised ReservationLegRehouseAttemptRecord
     */
    public ReservationLegRehouseAttemptRecord(Integer id, Integer fkReservation, Integer fkLeg, String rehouseAttemptStatus, Timestamp rehouseAttemptDate, String rehouseAttemptTime, String origSupplierRef, Integer origCarAgentId, String origApiRef, BigDecimal origCost, String origCurrency, String origServiceLevel, String origVehicleKind, BigDecimal origEmv, String origTxid) {
        super(ReservationLegRehouseAttempt.RESERVATION_LEG_REHOUSE_ATTEMPT);

        set(0, id);
        set(1, fkReservation);
        set(2, fkLeg);
        set(3, rehouseAttemptStatus);
        set(4, rehouseAttemptDate);
        set(5, rehouseAttemptTime);
        set(6, origSupplierRef);
        set(7, origCarAgentId);
        set(8, origApiRef);
        set(9, origCost);
        set(10, origCurrency);
        set(11, origServiceLevel);
        set(12, origVehicleKind);
        set(13, origEmv);
        set(14, origTxid);
    }
}
