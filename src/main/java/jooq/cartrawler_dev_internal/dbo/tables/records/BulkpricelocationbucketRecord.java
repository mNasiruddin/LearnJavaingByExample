/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Bulkpricelocationbucket;

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
public class BulkpricelocationbucketRecord extends UpdatableRecordImpl<BulkpricelocationbucketRecord> implements Record4<Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 600036201;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BulkPriceLocationBucket.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BulkPriceLocationBucket.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BulkPriceLocationBucket.channel_id</code>.
     */
    public void setChannelId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BulkPriceLocationBucket.channel_id</code>.
     */
    public Integer getChannelId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BulkPriceLocationBucket.location_id</code>.
     */
    public void setLocationId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BulkPriceLocationBucket.location_id</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BulkPriceLocationBucket.currency</code>.
     */
    public void setCurrency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BulkPriceLocationBucket.currency</code>.
     */
    public String getCurrency() {
        return (String) get(3);
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
    public Row4<Integer, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Bulkpricelocationbucket.BULKPRICELOCATIONBUCKET.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Bulkpricelocationbucket.BULKPRICELOCATIONBUCKET.CHANNEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Bulkpricelocationbucket.BULKPRICELOCATIONBUCKET.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Bulkpricelocationbucket.BULKPRICELOCATIONBUCKET.CURRENCY;
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
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCurrency();
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
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricelocationbucketRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricelocationbucketRecord value2(Integer value) {
        setChannelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricelocationbucketRecord value3(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricelocationbucketRecord value4(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricelocationbucketRecord values(Integer value1, Integer value2, Integer value3, String value4) {
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
     * Create a detached BulkpricelocationbucketRecord
     */
    public BulkpricelocationbucketRecord() {
        super(Bulkpricelocationbucket.BULKPRICELOCATIONBUCKET);
    }

    /**
     * Create a detached, initialised BulkpricelocationbucketRecord
     */
    public BulkpricelocationbucketRecord(Integer id, Integer channelId, Integer locationId, String currency) {
        super(Bulkpricelocationbucket.BULKPRICELOCATIONBUCKET);

        set(0, id);
        set(1, channelId);
        set(2, locationId);
        set(3, currency);
    }
}
