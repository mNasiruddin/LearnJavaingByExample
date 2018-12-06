/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Advertisingaffiliatesusers;

import org.jooq.Field;
import org.jooq.Record2;
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
public class AdvertisingaffiliatesusersRecord extends UpdatableRecordImpl<AdvertisingaffiliatesusersRecord> implements Record4<String, String, Integer, Boolean> {

    private static final long serialVersionUID = -1878840413;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AdvertisingAffiliatesUsers.user_code</code>.
     */
    public void setUserCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AdvertisingAffiliatesUsers.user_code</code>.
     */
    public String getUserCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AdvertisingAffiliatesUsers.access_time</code>.
     */
    public void setAccessTime(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AdvertisingAffiliatesUsers.access_time</code>.
     */
    public String getAccessTime() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AdvertisingAffiliatesUsers.affiliate_id</code>.
     */
    public void setAffiliateId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AdvertisingAffiliatesUsers.affiliate_id</code>.
     */
    public Integer getAffiliateId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AdvertisingAffiliatesUsers.original</code>.
     */
    public void setOriginal(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AdvertisingAffiliatesUsers.original</code>.
     */
    public Boolean getOriginal() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Integer, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Integer, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Advertisingaffiliatesusers.ADVERTISINGAFFILIATESUSERS.USER_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Advertisingaffiliatesusers.ADVERTISINGAFFILIATESUSERS.ACCESS_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Advertisingaffiliatesusers.ADVERTISINGAFFILIATESUSERS.AFFILIATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Advertisingaffiliatesusers.ADVERTISINGAFFILIATESUSERS.ORIGINAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUserCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAccessTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getAffiliateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getOriginal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUserCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAccessTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAffiliateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getOriginal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdvertisingaffiliatesusersRecord value1(String value) {
        setUserCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdvertisingaffiliatesusersRecord value2(String value) {
        setAccessTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdvertisingaffiliatesusersRecord value3(Integer value) {
        setAffiliateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdvertisingaffiliatesusersRecord value4(Boolean value) {
        setOriginal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdvertisingaffiliatesusersRecord values(String value1, String value2, Integer value3, Boolean value4) {
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
     * Create a detached AdvertisingaffiliatesusersRecord
     */
    public AdvertisingaffiliatesusersRecord() {
        super(Advertisingaffiliatesusers.ADVERTISINGAFFILIATESUSERS);
    }

    /**
     * Create a detached, initialised AdvertisingaffiliatesusersRecord
     */
    public AdvertisingaffiliatesusersRecord(String userCode, String accessTime, Integer affiliateId, Boolean original) {
        super(Advertisingaffiliatesusers.ADVERTISINGAFFILIATESUSERS);

        set(0, userCode);
        set(1, accessTime);
        set(2, affiliateId);
        set(3, original);
    }
}
