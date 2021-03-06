/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CustomerResHistory;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class CustomerResHistoryRecord extends TableRecordImpl<CustomerResHistoryRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = -2033523637;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_res_history.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_res_history.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_res_history.customer_email</code>.
     */
    public void setCustomerEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_res_history.customer_email</code>.
     */
    public String getCustomerEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_res_history.num_res</code>.
     */
    public void setNumRes(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_res_history.num_res</code>.
     */
    public Integer getNumRes() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CustomerResHistory.CUSTOMER_RES_HISTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CustomerResHistory.CUSTOMER_RES_HISTORY.CUSTOMER_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CustomerResHistory.CUSTOMER_RES_HISTORY.NUM_RES;
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
    public String component2() {
        return getCustomerEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getNumRes();
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
    public String value2() {
        return getCustomerEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getNumRes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerResHistoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerResHistoryRecord value2(String value) {
        setCustomerEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerResHistoryRecord value3(Integer value) {
        setNumRes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerResHistoryRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerResHistoryRecord
     */
    public CustomerResHistoryRecord() {
        super(CustomerResHistory.CUSTOMER_RES_HISTORY);
    }

    /**
     * Create a detached, initialised CustomerResHistoryRecord
     */
    public CustomerResHistoryRecord(Integer id, String customerEmail, Integer numRes) {
        super(CustomerResHistory.CUSTOMER_RES_HISTORY);

        set(0, id);
        set(1, customerEmail);
        set(2, numRes);
    }
}
