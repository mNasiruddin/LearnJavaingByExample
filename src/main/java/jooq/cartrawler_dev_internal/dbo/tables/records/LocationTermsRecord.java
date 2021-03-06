/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.LocationTerms;

import org.jooq.Field;
import org.jooq.Record3;
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
public class LocationTermsRecord extends UpdatableRecordImpl<LocationTermsRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1251241949;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Location_Terms.Location_ID</code>.
     */
    public void setLocationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Location_Terms.Location_ID</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Location_Terms.TC_Master_ID</code>.
     */
    public void setTcMasterId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Location_Terms.TC_Master_ID</code>.
     */
    public Integer getTcMasterId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Location_Terms.GroupOrder</code>.
     */
    public void setGrouporder(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Location_Terms.GroupOrder</code>.
     */
    public Integer getGrouporder() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Location_Terms.Agency_ID</code>.
     */
    public void setAgencyId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Location_Terms.Agency_ID</code>.
     */
    public Integer getAgencyId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LocationTerms.LOCATION_TERMS.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LocationTerms.LOCATION_TERMS.TC_MASTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LocationTerms.LOCATION_TERMS.GROUPORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return LocationTerms.LOCATION_TERMS.AGENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getTcMasterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGrouporder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getTcMasterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGrouporder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationTermsRecord value1(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationTermsRecord value2(Integer value) {
        setTcMasterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationTermsRecord value3(Integer value) {
        setGrouporder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationTermsRecord value4(Integer value) {
        setAgencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationTermsRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
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
     * Create a detached LocationTermsRecord
     */
    public LocationTermsRecord() {
        super(LocationTerms.LOCATION_TERMS);
    }

    /**
     * Create a detached, initialised LocationTermsRecord
     */
    public LocationTermsRecord(Integer locationId, Integer tcMasterId, Integer grouporder, Integer agencyId) {
        super(LocationTerms.LOCATION_TERMS);

        set(0, locationId);
        set(1, tcMasterId);
        set(2, grouporder);
        set(3, agencyId);
    }
}
