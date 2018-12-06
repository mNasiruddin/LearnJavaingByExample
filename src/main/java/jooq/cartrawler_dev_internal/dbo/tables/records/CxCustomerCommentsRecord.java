/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CxCustomerComments;

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
public class CxCustomerCommentsRecord extends TableRecordImpl<CxCustomerCommentsRecord> implements Record4<Timestamp, Integer, Integer, String> {

    private static final long serialVersionUID = 1242260290;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CX_Customer_Comments.review_date</code>.
     */
    public void setReviewDate(Timestamp value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CX_Customer_Comments.review_date</code>.
     */
    public Timestamp getReviewDate() {
        return (Timestamp) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CX_Customer_Comments.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CX_Customer_Comments.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CX_Customer_Comments.feedback</code>.
     */
    public void setFeedback(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CX_Customer_Comments.feedback</code>.
     */
    public Integer getFeedback() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CX_Customer_Comments.comments</code>.
     */
    public void setComments(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CX_Customer_Comments.comments</code>.
     */
    public String getComments() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Timestamp, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Timestamp, Integer, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field1() {
        return CxCustomerComments.CX_CUSTOMER_COMMENTS.REVIEW_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CxCustomerComments.CX_CUSTOMER_COMMENTS.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CxCustomerComments.CX_CUSTOMER_COMMENTS.FEEDBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CxCustomerComments.CX_CUSTOMER_COMMENTS.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component1() {
        return getReviewDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFeedback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value1() {
        return getReviewDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFeedback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CxCustomerCommentsRecord value1(Timestamp value) {
        setReviewDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CxCustomerCommentsRecord value2(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CxCustomerCommentsRecord value3(Integer value) {
        setFeedback(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CxCustomerCommentsRecord value4(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CxCustomerCommentsRecord values(Timestamp value1, Integer value2, Integer value3, String value4) {
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
     * Create a detached CxCustomerCommentsRecord
     */
    public CxCustomerCommentsRecord() {
        super(CxCustomerComments.CX_CUSTOMER_COMMENTS);
    }

    /**
     * Create a detached, initialised CxCustomerCommentsRecord
     */
    public CxCustomerCommentsRecord(Timestamp reviewDate, Integer fkReservation, Integer feedback, String comments) {
        super(CxCustomerComments.CX_CUSTOMER_COMMENTS);

        set(0, reviewDate);
        set(1, fkReservation);
        set(2, feedback);
        set(3, comments);
    }
}
