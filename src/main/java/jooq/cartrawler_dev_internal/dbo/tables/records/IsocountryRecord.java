/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Isocountry;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class IsocountryRecord extends UpdatableRecordImpl<IsocountryRecord> implements Record6<Integer, String, String, Integer, Integer, String> {

    private static final long serialVersionUID = 973548699;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.isocountry.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.isocountry.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.isocountry.country_id</code>.
     */
    public void setCountryId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.isocountry.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.isocountry.country_name</code>.
     */
    public void setCountryName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.isocountry.country_name</code>.
     */
    public String getCountryName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.isocountry.residence_region_id</code>.
     */
    public void setResidenceRegionId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.isocountry.residence_region_id</code>.
     */
    public Integer getResidenceRegionId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.isocountry.phoneCode</code>.
     */
    public void setPhonecode(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.isocountry.phoneCode</code>.
     */
    public Integer getPhonecode() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.isocountry.ISO3</code>.
     */
    public void setIso3(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.isocountry.ISO3</code>.
     */
    public String getIso3() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Isocountry.ISOCOUNTRY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Isocountry.ISOCOUNTRY.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Isocountry.ISOCOUNTRY.COUNTRY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Isocountry.ISOCOUNTRY.RESIDENCE_REGION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Isocountry.ISOCOUNTRY.PHONECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Isocountry.ISOCOUNTRY.ISO3;
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
    public String component2() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCountryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getResidenceRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPhonecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getIso3();
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
    public String value2() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCountryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getResidenceRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPhonecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIso3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsocountryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsocountryRecord value2(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsocountryRecord value3(String value) {
        setCountryName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsocountryRecord value4(Integer value) {
        setResidenceRegionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsocountryRecord value5(Integer value) {
        setPhonecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsocountryRecord value6(String value) {
        setIso3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsocountryRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IsocountryRecord
     */
    public IsocountryRecord() {
        super(Isocountry.ISOCOUNTRY);
    }

    /**
     * Create a detached, initialised IsocountryRecord
     */
    public IsocountryRecord(Integer id, String countryId, String countryName, Integer residenceRegionId, Integer phonecode, String iso3) {
        super(Isocountry.ISOCOUNTRY);

        set(0, id);
        set(1, countryId);
        set(2, countryName);
        set(3, residenceRegionId);
        set(4, phonecode);
        set(5, iso3);
    }
}