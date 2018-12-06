/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationLeg;

import org.jooq.Record1;
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
public class ReservationLegRecord extends UpdatableRecordImpl<ReservationLegRecord> {

    private static final long serialVersionUID = -1243122671;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.status</code>.
     */
    public void setStatus(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.complete</code>.
     */
    public void setComplete(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.complete</code>.
     */
    public Boolean getComplete() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.supplier_ref</code>.
     */
    public void setSupplierRef(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.supplier_ref</code>.
     */
    public String getSupplierRef() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_date</code>.
     */
    public void setCollectDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_date</code>.
     */
    public Timestamp getCollectDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_time</code>.
     */
    public void setCollectTime(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_time</code>.
     */
    public String getCollectTime() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_lat</code>.
     */
    public void setCollectLat(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_lat</code>.
     */
    public BigDecimal getCollectLat() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_lng</code>.
     */
    public void setCollectLng(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_lng</code>.
     */
    public BigDecimal getCollectLng() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_iata</code>.
     */
    public void setCollectIata(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_iata</code>.
     */
    public String getCollectIata() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_resort</code>.
     */
    public void setCollectResort(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_resort</code>.
     */
    public String getCollectResort() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_resort_id</code>.
     */
    public void setCollectResortId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_resort_id</code>.
     */
    public String getCollectResortId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_addr_id</code>.
     */
    public void setCollectAddrId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_addr_id</code>.
     */
    public Integer getCollectAddrId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_date</code>.
     */
    public void setDestDate(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_date</code>.
     */
    public Timestamp getDestDate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_time</code>.
     */
    public void setDestTime(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_time</code>.
     */
    public String getDestTime() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_lat</code>.
     */
    public void setDestLat(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_lat</code>.
     */
    public BigDecimal getDestLat() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_lng</code>.
     */
    public void setDestLng(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_lng</code>.
     */
    public BigDecimal getDestLng() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_iata</code>.
     */
    public void setDestIata(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_iata</code>.
     */
    public String getDestIata() {
        return (String) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_resort</code>.
     */
    public void setDestResort(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_resort</code>.
     */
    public String getDestResort() {
        return (String) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_resort_id</code>.
     */
    public void setDestResortId(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_resort_id</code>.
     */
    public String getDestResortId() {
        return (String) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_addr_id</code>.
     */
    public void setDestAddrId(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_addr_id</code>.
     */
    public Integer getDestAddrId() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.api_reference</code>.
     */
    public void setApiReference(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.api_reference</code>.
     */
    public String getApiReference() {
        return (String) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.invoice_amount</code>.
     */
    public void setInvoiceAmount(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.invoice_amount</code>.
     */
    public BigDecimal getInvoiceAmount() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.invoice_currency</code>.
     */
    public void setInvoiceCurrency(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.invoice_currency</code>.
     */
    public String getInvoiceCurrency() {
        return (String) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.route_id</code>.
     */
    public void setRouteId(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.route_id</code>.
     */
    public String getRouteId() {
        return (String) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.party</code>.
     */
    public void setParty(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.party</code>.
     */
    public String getParty() {
        return (String) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.service_level</code>.
     */
    public void setServiceLevel(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.service_level</code>.
     */
    public String getServiceLevel() {
        return (String) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.Vehicle_kind</code>.
     */
    public void setVehicleKind(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.Vehicle_kind</code>.
     */
    public String getVehicleKind() {
        return (String) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_place_kind</code>.
     */
    public void setCollectPlaceKind(UByte value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_place_kind</code>.
     */
    public UByte getCollectPlaceKind() {
        return (UByte) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_place_kind</code>.
     */
    public void setDestPlaceKind(UByte value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_place_kind</code>.
     */
    public UByte getDestPlaceKind() {
        return (UByte) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.carrier_service_ref</code>.
     */
    public void setCarrierServiceRef(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.carrier_service_ref</code>.
     */
    public String getCarrierServiceRef() {
        return (String) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_flight_code</code>.
     */
    public void setCollectFlightCode(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_flight_code</code>.
     */
    public String getCollectFlightCode() {
        return (String) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_flight_date_time</code>.
     */
    public void setCollectFlightDateTime(Timestamp value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.collect_flight_date_time</code>.
     */
    public Timestamp getCollectFlightDateTime() {
        return (Timestamp) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_flight_code</code>.
     */
    public void setDestFlightCode(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_flight_code</code>.
     */
    public String getDestFlightCode() {
        return (String) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_flight_date_time</code>.
     */
    public void setDestFlightDateTime(Timestamp value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.dest_flight_date_time</code>.
     */
    public Timestamp getDestFlightDateTime() {
        return (Timestamp) get(34);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.decline_reason</code>.
     */
    public void setDeclineReason(Integer value) {
        set(35, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.decline_reason</code>.
     */
    public Integer getDeclineReason() {
        return (Integer) get(35);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.bookedPax</code>.
     */
    public void setBookedpax(UByte value) {
        set(36, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.bookedPax</code>.
     */
    public UByte getBookedpax() {
        return (UByte) get(36);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.updated_date</code>.
     */
    public void setUpdatedDate(Timestamp value) {
        set(37, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.updated_date</code>.
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) get(37);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.inserted_date</code>.
     */
    public void setInsertedDate(Timestamp value) {
        set(38, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.inserted_date</code>.
     */
    public Timestamp getInsertedDate() {
        return (Timestamp) get(38);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.pickup_id</code>.
     */
    public void setPickupId(Integer value) {
        set(39, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.pickup_id</code>.
     */
    public Integer getPickupId() {
        return (Integer) get(39);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.max_passengers</code>.
     */
    public void setMaxPassengers(UByte value) {
        set(40, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.max_passengers</code>.
     */
    public UByte getMaxPassengers() {
        return (UByte) get(40);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_leg.max_luggage</code>.
     */
    public void setMaxLuggage(UByte value) {
        set(41, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_leg.max_luggage</code>.
     */
    public UByte getMaxLuggage() {
        return (UByte) get(41);
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
     * Create a detached ReservationLegRecord
     */
    public ReservationLegRecord() {
        super(ReservationLeg.RESERVATION_LEG);
    }

    /**
     * Create a detached, initialised ReservationLegRecord
     */
    public ReservationLegRecord(Integer id, Integer fkReservation, Integer status, Boolean complete, String supplierRef, Timestamp collectDate, String collectTime, BigDecimal collectLat, BigDecimal collectLng, String collectIata, String collectResort, String collectResortId, Integer collectAddrId, Timestamp destDate, String destTime, BigDecimal destLat, BigDecimal destLng, String destIata, String destResort, String destResortId, Integer destAddrId, String apiReference, BigDecimal invoiceAmount, String invoiceCurrency, String routeId, String party, String serviceLevel, String vehicleKind, UByte collectPlaceKind, UByte destPlaceKind, String carrierServiceRef, String collectFlightCode, Timestamp collectFlightDateTime, String destFlightCode, Timestamp destFlightDateTime, Integer declineReason, UByte bookedpax, Timestamp updatedDate, Timestamp insertedDate, Integer pickupId, UByte maxPassengers, UByte maxLuggage) {
        super(ReservationLeg.RESERVATION_LEG);

        set(0, id);
        set(1, fkReservation);
        set(2, status);
        set(3, complete);
        set(4, supplierRef);
        set(5, collectDate);
        set(6, collectTime);
        set(7, collectLat);
        set(8, collectLng);
        set(9, collectIata);
        set(10, collectResort);
        set(11, collectResortId);
        set(12, collectAddrId);
        set(13, destDate);
        set(14, destTime);
        set(15, destLat);
        set(16, destLng);
        set(17, destIata);
        set(18, destResort);
        set(19, destResortId);
        set(20, destAddrId);
        set(21, apiReference);
        set(22, invoiceAmount);
        set(23, invoiceCurrency);
        set(24, routeId);
        set(25, party);
        set(26, serviceLevel);
        set(27, vehicleKind);
        set(28, collectPlaceKind);
        set(29, destPlaceKind);
        set(30, carrierServiceRef);
        set(31, collectFlightCode);
        set(32, collectFlightDateTime);
        set(33, destFlightCode);
        set(34, destFlightDateTime);
        set(35, declineReason);
        set(36, bookedpax);
        set(37, updatedDate);
        set(38, insertedDate);
        set(39, pickupId);
        set(40, maxPassengers);
        set(41, maxLuggage);
    }
}
