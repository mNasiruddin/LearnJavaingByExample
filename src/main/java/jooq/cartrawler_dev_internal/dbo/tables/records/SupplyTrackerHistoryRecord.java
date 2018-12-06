/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SupplyTrackerHistory;

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
public class SupplyTrackerHistoryRecord extends TableRecordImpl<SupplyTrackerHistoryRecord> implements Record15<Integer, String, String, String, Date, Date, Date, Double, String, String, String, Double, Double, String, Date> {

    private static final long serialVersionUID = 1095773658;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.flag_id</code>.
     */
    public void setFlagId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.flag_id</code>.
     */
    public Integer getFlagId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.destination</code>.
     */
    public void setDestination(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.destination</code>.
     */
    public String getDestination() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.region</code>.
     */
    public void setRegion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.region</code>.
     */
    public String getRegion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.supplier</code>.
     */
    public void setSupplier(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.supplier</code>.
     */
    public String getSupplier() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.pickup_month</code>.
     */
    public void setPickupMonth(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.pickup_month</code>.
     */
    public Date getPickupMonth() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.start_date</code>.
     */
    public void setStartDate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.start_date</code>.
     */
    public Date getStartDate() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.end_date</code>.
     */
    public void setEndDate(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.end_date</code>.
     */
    public Date getEndDate() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.swap_threshold</code>.
     */
    public void setSwapThreshold(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.swap_threshold</code>.
     */
    public Double getSwapThreshold() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.sipp_code_filter</code>.
     */
    public void setSippCodeFilter(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.sipp_code_filter</code>.
     */
    public String getSippCodeFilter() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.channel_filter</code>.
     */
    public void setChannelFilter(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.channel_filter</code>.
     */
    public String getChannelFilter() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.pickup_location_filter</code>.
     */
    public void setPickupLocationFilter(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.pickup_location_filter</code>.
     */
    public String getPickupLocationFilter() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.tracker_estimate</code>.
     */
    public void setTrackerEstimate(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.tracker_estimate</code>.
     */
    public Double getTrackerEstimate() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.total_additional_cost</code>.
     */
    public void setTotalAdditionalCost(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.total_additional_cost</code>.
     */
    public Double getTotalAdditionalCost() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.date_created</code>.
     */
    public void setDateCreated(Date value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.supply_tracker_history.date_created</code>.
     */
    public Date getDateCreated() {
        return (Date) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, String, String, Date, Date, Date, Double, String, String, String, Double, Double, String, Date> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, String, String, Date, Date, Date, Double, String, String, String, Double, Double, String, Date> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.FLAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.DESTINATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.REGION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.SUPPLIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.PICKUP_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.SWAP_THRESHOLD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.SIPP_CODE_FILTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.CHANNEL_FILTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.PICKUP_LOCATION_FILTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.TRACKER_ESTIMATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field13() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.TOTAL_ADDITIONAL_COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field15() {
        return SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY.DATE_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFlagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDestination();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRegion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSupplier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component5() {
        return getPickupMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component6() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component7() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getSwapThreshold();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getSippCodeFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getChannelFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getPickupLocationFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component12() {
        return getTrackerEstimate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component13() {
        return getTotalAdditionalCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component15() {
        return getDateCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFlagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDestination();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRegion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSupplier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getPickupMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getSwapThreshold();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSippCodeFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getChannelFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPickupLocationFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getTrackerEstimate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value13() {
        return getTotalAdditionalCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value15() {
        return getDateCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value1(Integer value) {
        setFlagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value2(String value) {
        setDestination(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value3(String value) {
        setRegion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value4(String value) {
        setSupplier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value5(Date value) {
        setPickupMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value6(Date value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value7(Date value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value8(Double value) {
        setSwapThreshold(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value9(String value) {
        setSippCodeFilter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value10(String value) {
        setChannelFilter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value11(String value) {
        setPickupLocationFilter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value12(Double value) {
        setTrackerEstimate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value13(Double value) {
        setTotalAdditionalCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value14(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord value15(Date value) {
        setDateCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplyTrackerHistoryRecord values(Integer value1, String value2, String value3, String value4, Date value5, Date value6, Date value7, Double value8, String value9, String value10, String value11, Double value12, Double value13, String value14, Date value15) {
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
     * Create a detached SupplyTrackerHistoryRecord
     */
    public SupplyTrackerHistoryRecord() {
        super(SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY);
    }

    /**
     * Create a detached, initialised SupplyTrackerHistoryRecord
     */
    public SupplyTrackerHistoryRecord(Integer flagId, String destination, String region, String supplier, Date pickupMonth, Date startDate, Date endDate, Double swapThreshold, String sippCodeFilter, String channelFilter, String pickupLocationFilter, Double trackerEstimate, Double totalAdditionalCost, String createdBy, Date dateCreated) {
        super(SupplyTrackerHistory.SUPPLY_TRACKER_HISTORY);

        set(0, flagId);
        set(1, destination);
        set(2, region);
        set(3, supplier);
        set(4, pickupMonth);
        set(5, startDate);
        set(6, endDate);
        set(7, swapThreshold);
        set(8, sippCodeFilter);
        set(9, channelFilter);
        set(10, pickupLocationFilter);
        set(11, trackerEstimate);
        set(12, totalAdditionalCost);
        set(13, createdBy);
        set(14, dateCreated);
    }
}
