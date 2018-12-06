/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.MerchantDuplicateClickthrus;

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
public class MerchantDuplicateClickthrusRecord extends UpdatableRecordImpl<MerchantDuplicateClickthrusRecord> implements Record4<Integer, BigInteger, String, Timestamp> {

    private static final long serialVersionUID = 1034161792;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Merchant_Duplicate_ClickThrus.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Merchant_Duplicate_ClickThrus.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Merchant_Duplicate_ClickThrus.Merchant_ID</code>.
     */
    public void setMerchantId(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Merchant_Duplicate_ClickThrus.Merchant_ID</code>.
     */
    public BigInteger getMerchantId() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Merchant_Duplicate_ClickThrus.Merchant_Ref</code>.
     */
    public void setMerchantRef(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Merchant_Duplicate_ClickThrus.Merchant_Ref</code>.
     */
    public String getMerchantRef() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Merchant_Duplicate_ClickThrus.Click_Time</code>.
     */
    public void setClickTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Merchant_Duplicate_ClickThrus.Click_Time</code>.
     */
    public Timestamp getClickTime() {
        return (Timestamp) get(3);
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
    public Row4<Integer, BigInteger, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, BigInteger, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MerchantDuplicateClickthrus.MERCHANT_DUPLICATE_CLICKTHRUS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return MerchantDuplicateClickthrus.MERCHANT_DUPLICATE_CLICKTHRUS.MERCHANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MerchantDuplicateClickthrus.MERCHANT_DUPLICATE_CLICKTHRUS.MERCHANT_REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return MerchantDuplicateClickthrus.MERCHANT_DUPLICATE_CLICKTHRUS.CLICK_TIME;
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
    public BigInteger component2() {
        return getMerchantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMerchantRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getClickTime();
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
    public BigInteger value2() {
        return getMerchantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMerchantRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getClickTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MerchantDuplicateClickthrusRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MerchantDuplicateClickthrusRecord value2(BigInteger value) {
        setMerchantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MerchantDuplicateClickthrusRecord value3(String value) {
        setMerchantRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MerchantDuplicateClickthrusRecord value4(Timestamp value) {
        setClickTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MerchantDuplicateClickthrusRecord values(Integer value1, BigInteger value2, String value3, Timestamp value4) {
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
     * Create a detached MerchantDuplicateClickthrusRecord
     */
    public MerchantDuplicateClickthrusRecord() {
        super(MerchantDuplicateClickthrus.MERCHANT_DUPLICATE_CLICKTHRUS);
    }

    /**
     * Create a detached, initialised MerchantDuplicateClickthrusRecord
     */
    public MerchantDuplicateClickthrusRecord(Integer id, BigInteger merchantId, String merchantRef, Timestamp clickTime) {
        super(MerchantDuplicateClickthrus.MERCHANT_DUPLICATE_CLICKTHRUS);

        set(0, id);
        set(1, merchantId);
        set(2, merchantRef);
        set(3, clickTime);
    }
}
