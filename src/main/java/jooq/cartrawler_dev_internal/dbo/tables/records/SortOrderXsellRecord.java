/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SortOrderXsell;

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
public class SortOrderXsellRecord extends UpdatableRecordImpl<SortOrderXsellRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 665099422;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sort_order_xsell.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sort_order_xsell.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sort_order_xsell.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sort_order_xsell.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sort_order_xsell.xsell_display</code>.
     */
    public void setXsellDisplay(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sort_order_xsell.xsell_display</code>.
     */
    public Integer getXsellDisplay() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sort_order_xsell.min_supplier</code>.
     */
    public void setMinSupplier(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sort_order_xsell.min_supplier</code>.
     */
    public Integer getMinSupplier() {
        return (Integer) get(3);
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
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SortOrderXsell.SORT_ORDER_XSELL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SortOrderXsell.SORT_ORDER_XSELL.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SortOrderXsell.SORT_ORDER_XSELL.XSELL_DISPLAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SortOrderXsell.SORT_ORDER_XSELL.MIN_SUPPLIER;
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
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getXsellDisplay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getMinSupplier();
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
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getXsellDisplay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getMinSupplier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderXsellRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderXsellRecord value2(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderXsellRecord value3(Integer value) {
        setXsellDisplay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderXsellRecord value4(Integer value) {
        setMinSupplier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderXsellRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
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
     * Create a detached SortOrderXsellRecord
     */
    public SortOrderXsellRecord() {
        super(SortOrderXsell.SORT_ORDER_XSELL);
    }

    /**
     * Create a detached, initialised SortOrderXsellRecord
     */
    public SortOrderXsellRecord(Integer id, Integer clientId, Integer xsellDisplay, Integer minSupplier) {
        super(SortOrderXsell.SORT_ORDER_XSELL);

        set(0, id);
        set(1, clientId);
        set(2, xsellDisplay);
        set(3, minSupplier);
    }
}