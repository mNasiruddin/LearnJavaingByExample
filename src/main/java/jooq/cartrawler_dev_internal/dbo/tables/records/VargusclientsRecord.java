/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Vargusclients;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class VargusclientsRecord extends TableRecordImpl<VargusclientsRecord> implements Record1<Integer> {

    private static final long serialVersionUID = 1292524294;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.vArgusClients.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.vArgusClients.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Vargusclients.VARGUSCLIENTS.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VargusclientsRecord value1(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VargusclientsRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VargusclientsRecord
     */
    public VargusclientsRecord() {
        super(Vargusclients.VARGUSCLIENTS);
    }

    /**
     * Create a detached, initialised VargusclientsRecord
     */
    public VargusclientsRecord(Integer clientId) {
        super(Vargusclients.VARGUSCLIENTS);

        set(0, clientId);
    }
}
