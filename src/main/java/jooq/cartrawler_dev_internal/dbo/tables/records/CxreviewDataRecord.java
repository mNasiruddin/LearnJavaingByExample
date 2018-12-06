/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CxreviewData;

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
public class CxreviewDataRecord extends UpdatableRecordImpl<CxreviewDataRecord> {

    private static final long serialVersionUID = -916097943;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.review_date</code>.
     */
    public void setReviewDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.review_date</code>.
     */
    public Timestamp getReviewDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.nps_score</code>.
     */
    public void setNpsScore(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.nps_score</code>.
     */
    public Integer getNpsScore() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.ces_score</code>.
     */
    public void setCesScore(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.ces_score</code>.
     */
    public Integer getCesScore() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.csat_score</code>.
     */
    public void setCsatScore(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.csat_score</code>.
     */
    public Integer getCsatScore() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.car_review</code>.
     */
    public void setCarReview(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.car_review</code>.
     */
    public Integer getCarReview() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.desk_review</code>.
     */
    public void setDeskReview(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.desk_review</code>.
     */
    public Integer getDeskReview() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.dropoff_review</code>.
     */
    public void setDropoffReview(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.dropoff_review</code>.
     */
    public Integer getDropoffReview() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.price_review</code>.
     */
    public void setPriceReview(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.price_review</code>.
     */
    public Integer getPriceReview() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.car_agent_location_id</code>.
     */
    public void setCarAgentLocationId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.car_agent_location_id</code>.
     */
    public Integer getCarAgentLocationId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.location_name</code>.
     */
    public void setLocationName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.location_name</code>.
     */
    public String getLocationName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.country_code</code>.
     */
    public void setCountryCode(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.country_code</code>.
     */
    public String getCountryCode() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.pickup_review</code>.
     */
    public void setPickupReview(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.pickup_review</code>.
     */
    public Integer getPickupReview() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.wait_time</code>.
     */
    public void setWaitTime(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.wait_time</code>.
     */
    public Integer getWaitTime() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.nps_business</code>.
     */
    public void setNpsBusiness(Short value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.nps_business</code>.
     */
    public Short getNpsBusiness() {
        return (Short) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.nps_supplier</code>.
     */
    public void setNpsSupplier(Short value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.nps_supplier</code>.
     */
    public Short getNpsSupplier() {
        return (Short) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.PickUp_Date</code>.
     */
    public void setPickupDate(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.PickUp_Date</code>.
     */
    public Timestamp getPickupDate() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.pickup_time</code>.
     */
    public void setPickupTime(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.pickup_time</code>.
     */
    public String getPickupTime() {
        return (String) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.fuel_policy</code>.
     */
    public void setFuelPolicy(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.fuel_policy</code>.
     */
    public String getFuelPolicy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.product_type</code>.
     */
    public void setProductType(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.product_type</code>.
     */
    public String getProductType() {
        return (String) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.num_pax</code>.
     */
    public void setNumPax(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CXReview_Data.num_pax</code>.
     */
    public Integer getNumPax() {
        return (Integer) get(22);
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
     * Create a detached CxreviewDataRecord
     */
    public CxreviewDataRecord() {
        super(CxreviewData.CXREVIEW_DATA);
    }

    /**
     * Create a detached, initialised CxreviewDataRecord
     */
    public CxreviewDataRecord(Integer id, Timestamp reviewDate, Integer fkReservation, Integer npsScore, Integer cesScore, Integer csatScore, Integer carReview, Integer deskReview, Integer dropoffReview, Integer priceReview, Integer carAgentId, Integer carAgentLocationId, String locationName, String countryCode, Integer pickupReview, Integer waitTime, Short npsBusiness, Short npsSupplier, Timestamp pickupDate, String pickupTime, String fuelPolicy, String productType, Integer numPax) {
        super(CxreviewData.CXREVIEW_DATA);

        set(0, id);
        set(1, reviewDate);
        set(2, fkReservation);
        set(3, npsScore);
        set(4, cesScore);
        set(5, csatScore);
        set(6, carReview);
        set(7, deskReview);
        set(8, dropoffReview);
        set(9, priceReview);
        set(10, carAgentId);
        set(11, carAgentLocationId);
        set(12, locationName);
        set(13, countryCode);
        set(14, pickupReview);
        set(15, waitTime);
        set(16, npsBusiness);
        set(17, npsSupplier);
        set(18, pickupDate);
        set(19, pickupTime);
        set(20, fuelPolicy);
        set(21, productType);
        set(22, numPax);
    }
}
