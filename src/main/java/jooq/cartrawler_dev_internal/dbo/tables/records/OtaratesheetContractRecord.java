/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.OtaratesheetContract;

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
public class OtaratesheetContractRecord extends UpdatableRecordImpl<OtaratesheetContractRecord> implements Record3<UUID, Integer, Integer> {

    private static final long serialVersionUID = -273374710;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet_contract.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet_contract.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet_contract.ratesheet_id</code>.
     */
    public void setRatesheetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet_contract.ratesheet_id</code>.
     */
    public Integer getRatesheetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet_contract.contract_id</code>.
     */
    public void setContractId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet_contract.contract_id</code>.
     */
    public Integer getContractId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UUID, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UUID, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return OtaratesheetContract.OTARATESHEET_CONTRACT.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OtaratesheetContract.OTARATESHEET_CONTRACT.RATESHEET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OtaratesheetContract.OTARATESHEET_CONTRACT.CONTRACT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRatesheetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getContractId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRatesheetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getContractId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetContractRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetContractRecord value2(Integer value) {
        setRatesheetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetContractRecord value3(Integer value) {
        setContractId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetContractRecord values(UUID value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OtaratesheetContractRecord
     */
    public OtaratesheetContractRecord() {
        super(OtaratesheetContract.OTARATESHEET_CONTRACT);
    }

    /**
     * Create a detached, initialised OtaratesheetContractRecord
     */
    public OtaratesheetContractRecord(UUID guid, Integer ratesheetId, Integer contractId) {
        super(OtaratesheetContract.OTARATESHEET_CONTRACT);

        set(0, guid);
        set(1, ratesheetId);
        set(2, contractId);
    }
}
