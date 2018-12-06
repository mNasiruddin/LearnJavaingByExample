/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationThirdPartyInfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class ReservationThirdPartyInfoRecord extends UpdatableRecordImpl<ReservationThirdPartyInfoRecord> implements Record7<Integer, Integer, String, Timestamp, String, String, Timestamp> {

    private static final long serialVersionUID = 1212163898;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.hcom_order_id</code>.
     */
    public void setHcomOrderId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.hcom_order_id</code>.
     */
    public String getHcomOrderId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.hcom_booking_time</code>.
     */
    public void setHcomBookingTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.hcom_booking_time</code>.
     */
    public Timestamp getHcomBookingTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.hcom_residency_id</code>.
     */
    public void setHcomResidencyId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.hcom_residency_id</code>.
     */
    public String getHcomResidencyId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.hcom_language</code>.
     */
    public void setHcomLanguage(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.hcom_language</code>.
     */
    public String getHcomLanguage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.ct_booking_time</code>.
     */
    public void setCtBookingTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_third_party_info.ct_booking_time</code>.
     */
    public Timestamp getCtBookingTime() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Timestamp, String, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Timestamp, String, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationThirdPartyInfo.RESERVATION_THIRD_PARTY_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationThirdPartyInfo.RESERVATION_THIRD_PARTY_INFO.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReservationThirdPartyInfo.RESERVATION_THIRD_PARTY_INFO.HCOM_ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ReservationThirdPartyInfo.RESERVATION_THIRD_PARTY_INFO.HCOM_BOOKING_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReservationThirdPartyInfo.RESERVATION_THIRD_PARTY_INFO.HCOM_RESIDENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReservationThirdPartyInfo.RESERVATION_THIRD_PARTY_INFO.HCOM_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ReservationThirdPartyInfo.RESERVATION_THIRD_PARTY_INFO.CT_BOOKING_TIME;
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
    public String component3() {
        return getHcomOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getHcomBookingTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getHcomResidencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getHcomLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCtBookingTime();
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
    public String value3() {
        return getHcomOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getHcomBookingTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getHcomResidencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHcomLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCtBookingTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationThirdPartyInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationThirdPartyInfoRecord value2(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationThirdPartyInfoRecord value3(String value) {
        setHcomOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationThirdPartyInfoRecord value4(Timestamp value) {
        setHcomBookingTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationThirdPartyInfoRecord value5(String value) {
        setHcomResidencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationThirdPartyInfoRecord value6(String value) {
        setHcomLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationThirdPartyInfoRecord value7(Timestamp value) {
        setCtBookingTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationThirdPartyInfoRecord values(Integer value1, Integer value2, String value3, Timestamp value4, String value5, String value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationThirdPartyInfoRecord
     */
    public ReservationThirdPartyInfoRecord() {
        super(ReservationThirdPartyInfo.RESERVATION_THIRD_PARTY_INFO);
    }

    /**
     * Create a detached, initialised ReservationThirdPartyInfoRecord
     */
    public ReservationThirdPartyInfoRecord(Integer id, Integer fkReservation, String hcomOrderId, Timestamp hcomBookingTime, String hcomResidencyId, String hcomLanguage, Timestamp ctBookingTime) {
        super(ReservationThirdPartyInfo.RESERVATION_THIRD_PARTY_INFO);

        set(0, id);
        set(1, fkReservation);
        set(2, hcomOrderId);
        set(3, hcomBookingTime);
        set(4, hcomResidencyId);
        set(5, hcomLanguage);
        set(6, ctBookingTime);
    }
}
