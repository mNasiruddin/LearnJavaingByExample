/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.XmlHistory;

import org.jooq.Field;
import org.jooq.Record1;
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
public class XmlHistoryRecord extends UpdatableRecordImpl<XmlHistoryRecord> implements Record5<Integer, String, String, String, Timestamp> {

    private static final long serialVersionUID = 848017856;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_History.History_Id</code>.
     */
    public void setHistoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_History.History_Id</code>.
     */
    public Integer getHistoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_History.Reservation_ID</code>.
     */
    public void setReservationId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_History.Reservation_ID</code>.
     */
    public String getReservationId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_History.XML_Res_ID</code>.
     */
    public void setXmlResId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_History.XML_Res_ID</code>.
     */
    public String getXmlResId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_History.Response_Text</code>.
     */
    public void setResponseText(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_History.Response_Text</code>.
     */
    public String getResponseText() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_History.XML_Date</code>.
     */
    public void setXmlDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_History.XML_Date</code>.
     */
    public Timestamp getXmlDate() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return XmlHistory.XML_HISTORY.HISTORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return XmlHistory.XML_HISTORY.RESERVATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return XmlHistory.XML_HISTORY.XML_RES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return XmlHistory.XML_HISTORY.RESPONSE_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return XmlHistory.XML_HISTORY.XML_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getHistoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getReservationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getXmlResId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getResponseText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getXmlDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getHistoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getReservationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getXmlResId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getResponseText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getXmlDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlHistoryRecord value1(Integer value) {
        setHistoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlHistoryRecord value2(String value) {
        setReservationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlHistoryRecord value3(String value) {
        setXmlResId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlHistoryRecord value4(String value) {
        setResponseText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlHistoryRecord value5(Timestamp value) {
        setXmlDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlHistoryRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5) {
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
     * Create a detached XmlHistoryRecord
     */
    public XmlHistoryRecord() {
        super(XmlHistory.XML_HISTORY);
    }

    /**
     * Create a detached, initialised XmlHistoryRecord
     */
    public XmlHistoryRecord(Integer historyId, String reservationId, String xmlResId, String responseText, Timestamp xmlDate) {
        super(XmlHistory.XML_HISTORY);

        set(0, historyId);
        set(1, reservationId);
        set(2, xmlResId);
        set(3, responseText);
        set(4, xmlDate);
    }
}
