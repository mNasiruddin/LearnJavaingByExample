/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.NotebookArchive2009;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class NotebookArchive2009Record extends UpdatableRecordImpl<NotebookArchive2009Record> implements Record8<Integer, String, Timestamp, String, Boolean, Boolean, Boolean, Integer> {

    private static final long serialVersionUID = 1265422734;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Seq_No</code>.
     */
    public void setSeqNo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Seq_No</code>.
     */
    public Integer getSeqNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Reservation_ID</code>.
     */
    public void setReservationId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Reservation_ID</code>.
     */
    public String getReservationId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Note_Date</code>.
     */
    public void setNoteDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Note_Date</code>.
     */
    public Timestamp getNoteDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Note_Detail</code>.
     */
    public void setNoteDetail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Note_Detail</code>.
     */
    public String getNoteDetail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Customer_Add</code>.
     */
    public void setCustomerAdd(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Customer_Add</code>.
     */
    public Boolean getCustomerAdd() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Complaint</code>.
     */
    public void setComplaint(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Complaint</code>.
     */
    public Boolean getComplaint() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Public_Text</code>.
     */
    public void setPublicText(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.Public_Text</code>.
     */
    public Boolean getPublicText() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.added_by</code>.
     */
    public void setAddedBy(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Notebook_archive2009.added_by</code>.
     */
    public Integer getAddedBy() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Timestamp, String, Boolean, Boolean, Boolean, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Timestamp, String, Boolean, Boolean, Boolean, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return NotebookArchive2009.NOTEBOOK_ARCHIVE2009.SEQ_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return NotebookArchive2009.NOTEBOOK_ARCHIVE2009.RESERVATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return NotebookArchive2009.NOTEBOOK_ARCHIVE2009.NOTE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return NotebookArchive2009.NOTEBOOK_ARCHIVE2009.NOTE_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return NotebookArchive2009.NOTEBOOK_ARCHIVE2009.CUSTOMER_ADD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return NotebookArchive2009.NOTEBOOK_ARCHIVE2009.COMPLAINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return NotebookArchive2009.NOTEBOOK_ARCHIVE2009.PUBLIC_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return NotebookArchive2009.NOTEBOOK_ARCHIVE2009.ADDED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSeqNo();
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
    public Timestamp component3() {
        return getNoteDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getNoteDetail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getCustomerAdd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getComplaint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getPublicText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getAddedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSeqNo();
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
    public Timestamp value3() {
        return getNoteDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNoteDetail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getCustomerAdd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getComplaint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getPublicText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getAddedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotebookArchive2009Record value1(Integer value) {
        setSeqNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotebookArchive2009Record value2(String value) {
        setReservationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotebookArchive2009Record value3(Timestamp value) {
        setNoteDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotebookArchive2009Record value4(String value) {
        setNoteDetail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotebookArchive2009Record value5(Boolean value) {
        setCustomerAdd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotebookArchive2009Record value6(Boolean value) {
        setComplaint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotebookArchive2009Record value7(Boolean value) {
        setPublicText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotebookArchive2009Record value8(Integer value) {
        setAddedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotebookArchive2009Record values(Integer value1, String value2, Timestamp value3, String value4, Boolean value5, Boolean value6, Boolean value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NotebookArchive2009Record
     */
    public NotebookArchive2009Record() {
        super(NotebookArchive2009.NOTEBOOK_ARCHIVE2009);
    }

    /**
     * Create a detached, initialised NotebookArchive2009Record
     */
    public NotebookArchive2009Record(Integer seqNo, String reservationId, Timestamp noteDate, String noteDetail, Boolean customerAdd, Boolean complaint, Boolean publicText, Integer addedBy) {
        super(NotebookArchive2009.NOTEBOOK_ARCHIVE2009);

        set(0, seqNo);
        set(1, reservationId);
        set(2, noteDate);
        set(3, noteDetail);
        set(4, customerAdd);
        set(5, complaint);
        set(6, publicText);
        set(7, addedBy);
    }
}