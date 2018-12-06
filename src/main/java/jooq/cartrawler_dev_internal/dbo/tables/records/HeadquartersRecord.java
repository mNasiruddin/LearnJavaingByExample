/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Headquarters;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class HeadquartersRecord extends UpdatableRecordImpl<HeadquartersRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = -159752351;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.HeadQuarters.Ref</code>.
     */
    public void setRef(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.HeadQuarters.Ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.HeadQuarters.location_id</code>.
     */
    public void setLocationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.HeadQuarters.location_id</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.HeadQuarters.country_id</code>.
     */
    public void setCountryId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.HeadQuarters.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Headquarters.HEADQUARTERS.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Headquarters.HEADQUARTERS.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Headquarters.HEADQUARTERS.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRef();
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
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRef();
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
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HeadquartersRecord value1(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HeadquartersRecord value2(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HeadquartersRecord value3(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HeadquartersRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HeadquartersRecord
     */
    public HeadquartersRecord() {
        super(Headquarters.HEADQUARTERS);
    }

    /**
     * Create a detached, initialised HeadquartersRecord
     */
    public HeadquartersRecord(Integer ref, Integer locationId, String countryId) {
        super(Headquarters.HEADQUARTERS);

        set(0, ref);
        set(1, locationId);
        set(2, countryId);
    }
}
