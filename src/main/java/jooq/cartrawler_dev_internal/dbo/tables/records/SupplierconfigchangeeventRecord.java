/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Supplierconfigchangeevent;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class SupplierconfigchangeeventRecord extends UpdatableRecordImpl<SupplierconfigchangeeventRecord> implements Record6<Long, Integer, String, String, String, Long> {

    private static final long serialVersionUID = 432030017;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.configFeature</code>.
     */
    public void setConfigfeature(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.configFeature</code>.
     */
    public String getConfigfeature() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.fromValue</code>.
     */
    public void setFromvalue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.fromValue</code>.
     */
    public String getFromvalue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.toValue</code>.
     */
    public void setTovalue(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.toValue</code>.
     */
    public String getTovalue() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.timeStamp</code>.
     */
    public void setTimestamp(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierConfigChangeEvent.timeStamp</code>.
     */
    public Long getTimestamp() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Integer, String, String, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Integer, String, String, String, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Supplierconfigchangeevent.SUPPLIERCONFIGCHANGEEVENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Supplierconfigchangeevent.SUPPLIERCONFIGCHANGEEVENT.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Supplierconfigchangeevent.SUPPLIERCONFIGCHANGEEVENT.CONFIGFEATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Supplierconfigchangeevent.SUPPLIERCONFIGCHANGEEVENT.FROMVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Supplierconfigchangeevent.SUPPLIERCONFIGCHANGEEVENT.TOVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Supplierconfigchangeevent.SUPPLIERCONFIGCHANGEEVENT.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getConfigfeature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFromvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTovalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getConfigfeature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFromvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTovalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierconfigchangeeventRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierconfigchangeeventRecord value2(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierconfigchangeeventRecord value3(String value) {
        setConfigfeature(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierconfigchangeeventRecord value4(String value) {
        setFromvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierconfigchangeeventRecord value5(String value) {
        setTovalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierconfigchangeeventRecord value6(Long value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierconfigchangeeventRecord values(Long value1, Integer value2, String value3, String value4, String value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SupplierconfigchangeeventRecord
     */
    public SupplierconfigchangeeventRecord() {
        super(Supplierconfigchangeevent.SUPPLIERCONFIGCHANGEEVENT);
    }

    /**
     * Create a detached, initialised SupplierconfigchangeeventRecord
     */
    public SupplierconfigchangeeventRecord(Long id, Integer carAgentId, String configfeature, String fromvalue, String tovalue, Long timestamp) {
        super(Supplierconfigchangeevent.SUPPLIERCONFIGCHANGEEVENT);

        set(0, id);
        set(1, carAgentId);
        set(2, configfeature);
        set(3, fromvalue);
        set(4, tovalue);
        set(5, timestamp);
    }
}
