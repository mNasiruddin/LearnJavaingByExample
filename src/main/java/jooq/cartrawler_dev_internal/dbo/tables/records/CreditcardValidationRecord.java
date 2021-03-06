/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CreditcardValidation;

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
public class CreditcardValidationRecord extends UpdatableRecordImpl<CreditcardValidationRecord> implements Record5<Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -595487244;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.card_type</code>.
     */
    public void setCardType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.card_type</code>.
     */
    public Integer getCardType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.leading_digits</code>.
     */
    public void setLeadingDigits(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.leading_digits</code>.
     */
    public Integer getLeadingDigits() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.length</code>.
     */
    public void setLength(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.length</code>.
     */
    public Integer getLength() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.issue_no</code>.
     */
    public void setIssueNo(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CreditCard_Validation.issue_no</code>.
     */
    public Integer getIssueNo() {
        return (Integer) get(4);
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
    public Row5<Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CreditcardValidation.CREDITCARD_VALIDATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CreditcardValidation.CREDITCARD_VALIDATION.CARD_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CreditcardValidation.CREDITCARD_VALIDATION.LEADING_DIGITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CreditcardValidation.CREDITCARD_VALIDATION.LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CreditcardValidation.CREDITCARD_VALIDATION.ISSUE_NO;
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
        return getCardType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLeadingDigits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getIssueNo();
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
        return getCardType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLeadingDigits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getIssueNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditcardValidationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditcardValidationRecord value2(Integer value) {
        setCardType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditcardValidationRecord value3(Integer value) {
        setLeadingDigits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditcardValidationRecord value4(Integer value) {
        setLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditcardValidationRecord value5(Integer value) {
        setIssueNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditcardValidationRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5) {
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
     * Create a detached CreditcardValidationRecord
     */
    public CreditcardValidationRecord() {
        super(CreditcardValidation.CREDITCARD_VALIDATION);
    }

    /**
     * Create a detached, initialised CreditcardValidationRecord
     */
    public CreditcardValidationRecord(Integer id, Integer cardType, Integer leadingDigits, Integer length, Integer issueNo) {
        super(CreditcardValidation.CREDITCARD_VALIDATION);

        set(0, id);
        set(1, cardType);
        set(2, leadingDigits);
        set(3, length);
        set(4, issueNo);
    }
}
