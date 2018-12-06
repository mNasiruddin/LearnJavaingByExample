/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.LookupGroup;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class LookupGroupRecord extends UpdatableRecordImpl<LookupGroupRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1842408181;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.lookup_group.source</code>.
     */
    public void setSource(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.lookup_group.source</code>.
     */
    public String getSource() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.lookup_group.source_val</code>.
     */
    public void setSourceVal(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.lookup_group.source_val</code>.
     */
    public String getSourceVal() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.lookup_group.common_val</code>.
     */
    public void setCommonVal(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.lookup_group.common_val</code>.
     */
    public String getCommonVal() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return LookupGroup.LOOKUP_GROUP.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LookupGroup.LOOKUP_GROUP.SOURCE_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LookupGroup.LOOKUP_GROUP.COMMON_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSourceVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCommonVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSourceVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCommonVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupGroupRecord value1(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupGroupRecord value2(String value) {
        setSourceVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupGroupRecord value3(String value) {
        setCommonVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LookupGroupRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LookupGroupRecord
     */
    public LookupGroupRecord() {
        super(LookupGroup.LOOKUP_GROUP);
    }

    /**
     * Create a detached, initialised LookupGroupRecord
     */
    public LookupGroupRecord(String source, String sourceVal, String commonVal) {
        super(LookupGroup.LOOKUP_GROUP);

        set(0, source);
        set(1, sourceVal);
        set(2, commonVal);
    }
}
