/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.TermsGroups;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class TermsGroupsRecord extends UpdatableRecordImpl<TermsGroupsRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -994897192;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Terms_Groups.Group_ID</code>.
     */
    public void setGroupId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Terms_Groups.Group_ID</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Terms_Groups.Heading</code>.
     */
    public void setHeading(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Terms_Groups.Heading</code>.
     */
    public String getHeading() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TermsGroups.TERMS_GROUPS.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TermsGroups.TERMS_GROUPS.HEADING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getHeading();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getHeading();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TermsGroupsRecord value1(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TermsGroupsRecord value2(String value) {
        setHeading(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TermsGroupsRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TermsGroupsRecord
     */
    public TermsGroupsRecord() {
        super(TermsGroups.TERMS_GROUPS);
    }

    /**
     * Create a detached, initialised TermsGroupsRecord
     */
    public TermsGroupsRecord(Integer groupId, String heading) {
        super(TermsGroups.TERMS_GROUPS);

        set(0, groupId);
        set(1, heading);
    }
}
