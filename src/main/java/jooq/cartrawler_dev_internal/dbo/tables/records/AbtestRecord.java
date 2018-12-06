/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Abtest;

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
public class AbtestRecord extends UpdatableRecordImpl<AbtestRecord> implements Record5<Integer, Integer, Integer, Integer, Boolean> {

    private static final long serialVersionUID = -1463932330;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abtest.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abtest.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abtest.fk_abtests</code>.
     */
    public void setFkAbtests(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abtest.fk_abtests</code>.
     */
    public Integer getFkAbtests() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abtest.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abtest.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abtest.testtoken</code>.
     */
    public void setTesttoken(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abtest.testtoken</code>.
     */
    public Integer getTesttoken() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abtest.query_id</code>.
     */
    public void setQueryId(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abtest.query_id</code>.
     */
    public Boolean getQueryId() {
        return (Boolean) get(4);
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
    public Row5<Integer, Integer, Integer, Integer, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Abtest.ABTEST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Abtest.ABTEST.FK_ABTESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Abtest.ABTEST.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Abtest.ABTEST.TESTTOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Abtest.ABTEST.QUERY_ID;
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
        return getFkAbtests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getTesttoken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getQueryId();
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
        return getFkAbtests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTesttoken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getQueryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbtestRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbtestRecord value2(Integer value) {
        setFkAbtests(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbtestRecord value3(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbtestRecord value4(Integer value) {
        setTesttoken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbtestRecord value5(Boolean value) {
        setQueryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbtestRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Boolean value5) {
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
     * Create a detached AbtestRecord
     */
    public AbtestRecord() {
        super(Abtest.ABTEST);
    }

    /**
     * Create a detached, initialised AbtestRecord
     */
    public AbtestRecord(Integer id, Integer fkAbtests, Integer clientId, Integer testtoken, Boolean queryId) {
        super(Abtest.ABTEST);

        set(0, id);
        set(1, fkAbtests);
        set(2, clientId);
        set(3, testtoken);
        set(4, queryId);
    }
}
