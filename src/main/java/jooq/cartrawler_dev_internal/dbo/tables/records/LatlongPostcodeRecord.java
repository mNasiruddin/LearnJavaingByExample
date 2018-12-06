/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.LatlongPostcode;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class LatlongPostcodeRecord extends UpdatableRecordImpl<LatlongPostcodeRecord> implements Record7<UUID, String, Boolean, BigDecimal, BigDecimal, String, String> {

    private static final long serialVersionUID = -1242500860;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.postcode</code>.
     */
    public void setPostcode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.postcode</code>.
     */
    public String getPostcode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.postcode_isprefix</code>.
     */
    public void setPostcodeIsprefix(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.postcode_isprefix</code>.
     */
    public Boolean getPostcodeIsprefix() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.latitude</code>.
     */
    public void setLatitude(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.longitude</code>.
     */
    public void setLongitude(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.country_id</code>.
     */
    public void setCountryId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.statecode</code>.
     */
    public void setStatecode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.latlong_postcode.statecode</code>.
     */
    public String getStatecode() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UUID, String, Boolean, BigDecimal, BigDecimal, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UUID, String, Boolean, BigDecimal, BigDecimal, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return LatlongPostcode.LATLONG_POSTCODE.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LatlongPostcode.LATLONG_POSTCODE.POSTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return LatlongPostcode.LATLONG_POSTCODE.POSTCODE_ISPREFIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return LatlongPostcode.LATLONG_POSTCODE.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return LatlongPostcode.LATLONG_POSTCODE.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return LatlongPostcode.LATLONG_POSTCODE.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return LatlongPostcode.LATLONG_POSTCODE.STATECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPostcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getPostcodeIsprefix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getStatecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPostcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getPostcodeIsprefix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getStatecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongPostcodeRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongPostcodeRecord value2(String value) {
        setPostcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongPostcodeRecord value3(Boolean value) {
        setPostcodeIsprefix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongPostcodeRecord value4(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongPostcodeRecord value5(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongPostcodeRecord value6(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongPostcodeRecord value7(String value) {
        setStatecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongPostcodeRecord values(UUID value1, String value2, Boolean value3, BigDecimal value4, BigDecimal value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LatlongPostcodeRecord
     */
    public LatlongPostcodeRecord() {
        super(LatlongPostcode.LATLONG_POSTCODE);
    }

    /**
     * Create a detached, initialised LatlongPostcodeRecord
     */
    public LatlongPostcodeRecord(UUID guid, String postcode, Boolean postcodeIsprefix, BigDecimal latitude, BigDecimal longitude, String countryId, String statecode) {
        super(LatlongPostcode.LATLONG_POSTCODE);

        set(0, guid);
        set(1, postcode);
        set(2, postcodeIsprefix);
        set(3, latitude);
        set(4, longitude);
        set(5, countryId);
        set(6, statecode);
    }
}
