/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Myargusisangoregion;

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
public class MyargusisangoregionRecord extends UpdatableRecordImpl<MyargusisangoregionRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1524706345;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MyArgusIsangoRegion.region_id</code>.
     */
    public void setRegionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MyArgusIsangoRegion.region_id</code>.
     */
    public Integer getRegionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MyArgusIsangoRegion.region_name</code>.
     */
    public void setRegionName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MyArgusIsangoRegion.region_name</code>.
     */
    public String getRegionName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MyArgusIsangoRegion.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MyArgusIsangoRegion.type</code>.
     */
    public String getType() {
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
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Myargusisangoregion.MYARGUSISANGOREGION.REGION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Myargusisangoregion.MYARGUSISANGOREGION.REGION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Myargusisangoregion.MYARGUSISANGOREGION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRegionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRegionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyargusisangoregionRecord value1(Integer value) {
        setRegionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyargusisangoregionRecord value2(String value) {
        setRegionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyargusisangoregionRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyargusisangoregionRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MyargusisangoregionRecord
     */
    public MyargusisangoregionRecord() {
        super(Myargusisangoregion.MYARGUSISANGOREGION);
    }

    /**
     * Create a detached, initialised MyargusisangoregionRecord
     */
    public MyargusisangoregionRecord(Integer regionId, String regionName, String type) {
        super(Myargusisangoregion.MYARGUSISANGOREGION);

        set(0, regionId);
        set(1, regionName);
        set(2, type);
    }
}
