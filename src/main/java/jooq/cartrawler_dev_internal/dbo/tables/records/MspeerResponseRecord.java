/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.MspeerResponse;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class MspeerResponseRecord extends TableRecordImpl<MspeerResponseRecord> implements Record4<Integer, String, String, Timestamp> {

    private static final long serialVersionUID = 1906720749;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_response.request_id</code>.
     */
    public void setRequestId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_response.request_id</code>.
     */
    public Integer getRequestId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_response.peer</code>.
     */
    public void setPeer(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_response.peer</code>.
     */
    public String getPeer() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_response.peer_db</code>.
     */
    public void setPeerDb(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_response.peer_db</code>.
     */
    public String getPeerDb() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_response.received_date</code>.
     */
    public void setReceivedDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_response.received_date</code>.
     */
    public Timestamp getReceivedDate() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MspeerResponse.MSPEER_RESPONSE.REQUEST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MspeerResponse.MSPEER_RESPONSE.PEER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MspeerResponse.MSPEER_RESPONSE.PEER_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return MspeerResponse.MSPEER_RESPONSE.RECEIVED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRequestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPeer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPeerDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getReceivedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRequestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPeer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPeerDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getReceivedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerResponseRecord value1(Integer value) {
        setRequestId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerResponseRecord value2(String value) {
        setPeer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerResponseRecord value3(String value) {
        setPeerDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerResponseRecord value4(Timestamp value) {
        setReceivedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerResponseRecord values(Integer value1, String value2, String value3, Timestamp value4) {
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
     * Create a detached MspeerResponseRecord
     */
    public MspeerResponseRecord() {
        super(MspeerResponse.MSPEER_RESPONSE);
    }

    /**
     * Create a detached, initialised MspeerResponseRecord
     */
    public MspeerResponseRecord(Integer requestId, String peer, String peerDb, Timestamp receivedDate) {
        super(MspeerResponse.MSPEER_RESPONSE);

        set(0, requestId);
        set(1, peer);
        set(2, peerDb);
        set(3, receivedDate);
    }
}
