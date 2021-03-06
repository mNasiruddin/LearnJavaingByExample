/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.RcHeading;

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
public class RcHeadingRecord extends UpdatableRecordImpl<RcHeadingRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 1332877673;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.RC_Heading.H_ID</code>.
     */
    public void setHId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.RC_Heading.H_ID</code>.
     */
    public Integer getHId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.RC_Heading.Title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.RC_Heading.Title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.RC_Heading.Detail_Text</code>.
     */
    public void setDetailText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.RC_Heading.Detail_Text</code>.
     */
    public String getDetailText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.RC_Heading.sortorder</code>.
     */
    public void setSortorder(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.RC_Heading.sortorder</code>.
     */
    public String getSortorder() {
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
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RcHeading.RC_HEADING.H_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RcHeading.RC_HEADING.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RcHeading.RC_HEADING.DETAIL_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RcHeading.RC_HEADING.SORTORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getHId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDetailText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSortorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getHId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDetailText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSortorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RcHeadingRecord value1(Integer value) {
        setHId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RcHeadingRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RcHeadingRecord value3(String value) {
        setDetailText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RcHeadingRecord value4(String value) {
        setSortorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RcHeadingRecord values(Integer value1, String value2, String value3, String value4) {
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
     * Create a detached RcHeadingRecord
     */
    public RcHeadingRecord() {
        super(RcHeading.RC_HEADING);
    }

    /**
     * Create a detached, initialised RcHeadingRecord
     */
    public RcHeadingRecord(Integer hId, String title, String detailText, String sortorder) {
        super(RcHeading.RC_HEADING);

        set(0, hId);
        set(1, title);
        set(2, detailText);
        set(3, sortorder);
    }
}
