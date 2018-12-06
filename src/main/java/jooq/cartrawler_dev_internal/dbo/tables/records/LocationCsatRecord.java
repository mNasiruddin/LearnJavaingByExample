/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.LocationCsat;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class LocationCsatRecord extends UpdatableRecordImpl<LocationCsatRecord> implements Record4<Integer, Integer, String, Double> {

    private static final long serialVersionUID = -873800399;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.location_csat.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.location_csat.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.location_csat.car_agent_location_id</code>.
     */
    public void setCarAgentLocationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.location_csat.car_agent_location_id</code>.
     */
    public Integer getCarAgentLocationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.location_csat.fuel_policy</code>.
     */
    public void setFuelPolicy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.location_csat.fuel_policy</code>.
     */
    public String getFuelPolicy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.location_csat.csat</code>.
     */
    public void setCsat(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.location_csat.csat</code>.
     */
    public Double getCsat() {
        return (Double) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LocationCsat.LOCATION_CSAT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LocationCsat.LOCATION_CSAT.CAR_AGENT_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LocationCsat.LOCATION_CSAT.FUEL_POLICY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return LocationCsat.LOCATION_CSAT.CSAT;
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
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFuelPolicy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getCsat();
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
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFuelPolicy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getCsat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationCsatRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationCsatRecord value2(Integer value) {
        setCarAgentLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationCsatRecord value3(String value) {
        setFuelPolicy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationCsatRecord value4(Double value) {
        setCsat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationCsatRecord values(Integer value1, Integer value2, String value3, Double value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocationCsatRecord
     */
    public LocationCsatRecord() {
        super(LocationCsat.LOCATION_CSAT);
    }

    /**
     * Create a detached, initialised LocationCsatRecord
     */
    public LocationCsatRecord(Integer id, Integer carAgentLocationId, String fuelPolicy, Double csat) {
        super(LocationCsat.LOCATION_CSAT);

        set(0, id);
        set(1, carAgentLocationId);
        set(2, fuelPolicy);
        set(3, csat);
    }
}
