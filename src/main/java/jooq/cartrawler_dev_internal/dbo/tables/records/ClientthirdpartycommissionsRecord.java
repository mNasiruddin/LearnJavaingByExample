/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Clientthirdpartycommissions;

import org.jooq.Field;
import org.jooq.Record1;
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
public class ClientthirdpartycommissionsRecord extends UpdatableRecordImpl<ClientthirdpartycommissionsRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -1120421914;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions.referenceClientId</code>.
     */
    public void setReferenceclientid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions.referenceClientId</code>.
     */
    public Integer getReferenceclientid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions.thirdPartyClientId</code>.
     */
    public void setThirdpartyclientid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions.thirdPartyClientId</code>.
     */
    public Integer getThirdpartyclientid() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Clientthirdpartycommissions.CLIENTTHIRDPARTYCOMMISSIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Clientthirdpartycommissions.CLIENTTHIRDPARTYCOMMISSIONS.REFERENCECLIENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Clientthirdpartycommissions.CLIENTTHIRDPARTYCOMMISSIONS.THIRDPARTYCLIENTID;
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
        return getReferenceclientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getThirdpartyclientid();
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
        return getReferenceclientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getThirdpartyclientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientthirdpartycommissionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientthirdpartycommissionsRecord value2(Integer value) {
        setReferenceclientid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientthirdpartycommissionsRecord value3(Integer value) {
        setThirdpartyclientid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientthirdpartycommissionsRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClientthirdpartycommissionsRecord
     */
    public ClientthirdpartycommissionsRecord() {
        super(Clientthirdpartycommissions.CLIENTTHIRDPARTYCOMMISSIONS);
    }

    /**
     * Create a detached, initialised ClientthirdpartycommissionsRecord
     */
    public ClientthirdpartycommissionsRecord(Integer id, Integer referenceclientid, Integer thirdpartyclientid) {
        super(Clientthirdpartycommissions.CLIENTTHIRDPARTYCOMMISSIONS);

        set(0, id);
        set(1, referenceclientid);
        set(2, thirdpartyclientid);
    }
}
