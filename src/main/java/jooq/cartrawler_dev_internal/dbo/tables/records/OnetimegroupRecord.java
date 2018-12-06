/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Onetimegroup;

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
public class OnetimegroupRecord extends UpdatableRecordImpl<OnetimegroupRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1078428857;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OneTimeGroup.offerCode</code>.
     */
    public void setOffercode(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OneTimeGroup.offerCode</code>.
     */
    public Integer getOffercode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OneTimeGroup.nextReference</code>.
     */
    public void setNextreference(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OneTimeGroup.nextReference</code>.
     */
    public Integer getNextreference() {
        return (Integer) get(1);
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
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Onetimegroup.ONETIMEGROUP.OFFERCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Onetimegroup.ONETIMEGROUP.NEXTREFERENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getOffercode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getNextreference();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOffercode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getNextreference();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimegroupRecord value1(Integer value) {
        setOffercode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimegroupRecord value2(Integer value) {
        setNextreference(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimegroupRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OnetimegroupRecord
     */
    public OnetimegroupRecord() {
        super(Onetimegroup.ONETIMEGROUP);
    }

    /**
     * Create a detached, initialised OnetimegroupRecord
     */
    public OnetimegroupRecord(Integer offercode, Integer nextreference) {
        super(Onetimegroup.ONETIMEGROUP);

        set(0, offercode);
        set(1, nextreference);
    }
}
