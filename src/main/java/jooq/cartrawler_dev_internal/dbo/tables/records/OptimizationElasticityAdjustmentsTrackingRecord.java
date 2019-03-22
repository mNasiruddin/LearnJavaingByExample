/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.OptimizationElasticityAdjustmentsTracking;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
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
public class OptimizationElasticityAdjustmentsTrackingRecord extends UpdatableRecordImpl<OptimizationElasticityAdjustmentsTrackingRecord> implements Record22<Integer, Integer, Integer, String, Integer, BigDecimal, Integer, BigDecimal, String, String, Integer, Integer, Integer, Integer, Integer, String, Timestamp, Integer, Integer, Boolean, Integer, Boolean> {

    private static final long serialVersionUID = -2021526765;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.pk_id</code>.
     */
    public void setPkId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.pk_id</code>.
     */
    public Integer getPkId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.channel_group</code>.
     */
    public void setChannelGroup(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.channel_group</code>.
     */
    public Integer getChannelGroup() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.channel_corridor</code>.
     */
    public void setChannelCorridor(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.channel_corridor</code>.
     */
    public String getChannelCorridor() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.fk_channel</code>.
     */
    public void setFkChannel(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.fk_channel</code>.
     */
    public Integer getFkChannel() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.adjustment_final</code>.
     */
    public void setAdjustmentFinal(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.adjustment_final</code>.
     */
    public BigDecimal getAdjustmentFinal() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.fk_client</code>.
     */
    public void setFkClient(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.fk_client</code>.
     */
    public Integer getFkClient() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.adjustment_final_test</code>.
     */
    public void setAdjustmentFinalTest(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.adjustment_final_test</code>.
     */
    public BigDecimal getAdjustmentFinalTest() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.origin_country</code>.
     */
    public void setOriginCountry(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.origin_country</code>.
     */
    public String getOriginCountry() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.destination_country</code>.
     */
    public void setDestinationCountry(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.destination_country</code>.
     */
    public String getDestinationCountry() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.transition_flag</code>.
     */
    public void setTransitionFlag(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.transition_flag</code>.
     */
    public Integer getTransitionFlag() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.min_rental_duration</code>.
     */
    public void setMinRentalDuration(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.min_rental_duration</code>.
     */
    public Integer getMinRentalDuration() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.max_rental_duration</code>.
     */
    public void setMaxRentalDuration(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.max_rental_duration</code>.
     */
    public Integer getMaxRentalDuration() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.min_pickup_lead</code>.
     */
    public void setMinPickupLead(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.min_pickup_lead</code>.
     */
    public Integer getMinPickupLead() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.max_pickup_lead</code>.
     */
    public void setMaxPickupLead(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.max_pickup_lead</code>.
     */
    public Integer getMaxPickupLead() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.car_group</code>.
     */
    public void setCarGroup(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.car_group</code>.
     */
    public String getCarGroup() {
        return (String) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.amend_date</code>.
     */
    public void setAmendDate(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.amend_date</code>.
     */
    public Timestamp getAmendDate() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.amended_by</code>.
     */
    public void setAmendedBy(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.amended_by</code>.
     */
    public Integer getAmendedBy() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.location_id</code>.
     */
    public void setLocationId(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.location_id</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.ab_testing</code>.
     */
    public void setAbTesting(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.ab_testing</code>.
     */
    public Boolean getAbTesting() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.version</code>.
     */
    public void setVersion(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.hill_climbing</code>.
     */
    public void setHillClimbing(Boolean value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.optimization_elasticity_adjustments_tracking.hill_climbing</code>.
     */
    public Boolean getHillClimbing() {
        return (Boolean) get(21);
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
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, Integer, String, Integer, BigDecimal, Integer, BigDecimal, String, String, Integer, Integer, Integer, Integer, Integer, String, Timestamp, Integer, Integer, Boolean, Integer, Boolean> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, Integer, String, Integer, BigDecimal, Integer, BigDecimal, String, String, Integer, Integer, Integer, Integer, Integer, String, Timestamp, Integer, Integer, Boolean, Integer, Boolean> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.CHANNEL_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.CHANNEL_CORRIDOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.FK_CHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.ADJUSTMENT_FINAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.FK_CLIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.ADJUSTMENT_FINAL_TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.ORIGIN_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.DESTINATION_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.TRANSITION_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.MIN_RENTAL_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.MAX_RENTAL_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.MIN_PICKUP_LEAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.MAX_PICKUP_LEAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.CAR_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.AMEND_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.AMENDED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field20() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.AB_TESTING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field21() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field22() {
        return OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING.HILL_CLIMBING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getChannelGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getChannelCorridor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getFkChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getAdjustmentFinal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getFkClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getAdjustmentFinalTest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOriginCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getDestinationCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getTransitionFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getMinRentalDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getMaxRentalDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getMinPickupLead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getMaxPickupLead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getCarGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getAmendDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getAmendedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component20() {
        return getAbTesting();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component21() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component22() {
        return getHillClimbing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getChannelGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getChannelCorridor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFkChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getAdjustmentFinal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getFkClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getAdjustmentFinalTest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOriginCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDestinationCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getTransitionFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getMinRentalDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getMaxRentalDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getMinPickupLead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getMaxPickupLead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCarGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getAmendDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getAmendedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value20() {
        return getAbTesting();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value21() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value22() {
        return getHillClimbing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value1(Integer value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value3(Integer value) {
        setChannelGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value4(String value) {
        setChannelCorridor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value5(Integer value) {
        setFkChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value6(BigDecimal value) {
        setAdjustmentFinal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value7(Integer value) {
        setFkClient(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value8(BigDecimal value) {
        setAdjustmentFinalTest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value9(String value) {
        setOriginCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value10(String value) {
        setDestinationCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value11(Integer value) {
        setTransitionFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value12(Integer value) {
        setMinRentalDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value13(Integer value) {
        setMaxRentalDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value14(Integer value) {
        setMinPickupLead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value15(Integer value) {
        setMaxPickupLead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value16(String value) {
        setCarGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value17(Timestamp value) {
        setAmendDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value18(Integer value) {
        setAmendedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value19(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value20(Boolean value) {
        setAbTesting(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value21(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord value22(Boolean value) {
        setHillClimbing(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizationElasticityAdjustmentsTrackingRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5, BigDecimal value6, Integer value7, BigDecimal value8, String value9, String value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, String value16, Timestamp value17, Integer value18, Integer value19, Boolean value20, Integer value21, Boolean value22) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OptimizationElasticityAdjustmentsTrackingRecord
     */
    public OptimizationElasticityAdjustmentsTrackingRecord() {
        super(OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING);
    }

    /**
     * Create a detached, initialised OptimizationElasticityAdjustmentsTrackingRecord
     */
    public OptimizationElasticityAdjustmentsTrackingRecord(Integer pkId, Integer id, Integer channelGroup, String channelCorridor, Integer fkChannel, BigDecimal adjustmentFinal, Integer fkClient, BigDecimal adjustmentFinalTest, String originCountry, String destinationCountry, Integer transitionFlag, Integer minRentalDuration, Integer maxRentalDuration, Integer minPickupLead, Integer maxPickupLead, String carGroup, Timestamp amendDate, Integer amendedBy, Integer locationId, Boolean abTesting, Integer version, Boolean hillClimbing) {
        super(OptimizationElasticityAdjustmentsTracking.OPTIMIZATION_ELASTICITY_ADJUSTMENTS_TRACKING);

        set(0, pkId);
        set(1, id);
        set(2, channelGroup);
        set(3, channelCorridor);
        set(4, fkChannel);
        set(5, adjustmentFinal);
        set(6, fkClient);
        set(7, adjustmentFinalTest);
        set(8, originCountry);
        set(9, destinationCountry);
        set(10, transitionFlag);
        set(11, minRentalDuration);
        set(12, maxRentalDuration);
        set(13, minPickupLead);
        set(14, maxPickupLead);
        set(15, carGroup);
        set(16, amendDate);
        set(17, amendedBy);
        set(18, locationId);
        set(19, abTesting);
        set(20, version);
        set(21, hillClimbing);
    }
}