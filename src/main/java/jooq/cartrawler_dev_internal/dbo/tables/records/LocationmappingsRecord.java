/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Locationmappings;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class LocationmappingsRecord extends UpdatableRecordImpl<LocationmappingsRecord> implements Record5<String, Integer, String, String, String> {

    private static final long serialVersionUID = -210732340;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LocationMappings.source</code>.
     */
    public void setSource(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LocationMappings.source</code>.
     */
    public String getSource() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LocationMappings.location_id</code>.
     */
    public void setLocationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LocationMappings.location_id</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LocationMappings.source_name</code>.
     */
    public void setSourceName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LocationMappings.source_name</code>.
     */
    public String getSourceName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LocationMappings.source_country</code>.
     */
    public void setSourceCountry(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LocationMappings.source_country</code>.
     */
    public String getSourceCountry() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LocationMappings.source_city</code>.
     */
    public void setSourceCity(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LocationMappings.source_city</code>.
     */
    public String getSourceCity() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Integer, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Integer, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Locationmappings.LOCATIONMAPPINGS.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Locationmappings.LOCATIONMAPPINGS.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Locationmappings.LOCATIONMAPPINGS.SOURCE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Locationmappings.LOCATIONMAPPINGS.SOURCE_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Locationmappings.LOCATIONMAPPINGS.SOURCE_CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSourceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSourceCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSourceCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSourceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSourceCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSourceCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationmappingsRecord value1(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationmappingsRecord value2(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationmappingsRecord value3(String value) {
        setSourceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationmappingsRecord value4(String value) {
        setSourceCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationmappingsRecord value5(String value) {
        setSourceCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationmappingsRecord values(String value1, Integer value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocationmappingsRecord
     */
    public LocationmappingsRecord() {
        super(Locationmappings.LOCATIONMAPPINGS);
    }

    /**
     * Create a detached, initialised LocationmappingsRecord
     */
    public LocationmappingsRecord(String source, Integer locationId, String sourceName, String sourceCountry, String sourceCity) {
        super(Locationmappings.LOCATIONMAPPINGS);

        set(0, source);
        set(1, locationId);
        set(2, sourceName);
        set(3, sourceCountry);
        set(4, sourceCity);
    }
}
