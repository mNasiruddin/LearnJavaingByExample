/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Clientbookenginelayout;

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
public class ClientbookenginelayoutRecord extends UpdatableRecordImpl<ClientbookenginelayoutRecord> implements Record6<UUID, Integer, Integer, String, String, String> {

    private static final long serialVersionUID = -406959662;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.fk_client</code>.
     */
    public void setFkClient(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.fk_client</code>.
     */
    public Integer getFkClient() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.residency</code>.
     */
    public void setResidency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.residency</code>.
     */
    public String getResidency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.pickupCountry</code>.
     */
    public void setPickupcountry(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.pickupCountry</code>.
     */
    public String getPickupcountry() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.layout</code>.
     */
    public void setLayout(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ClientBookEngineLayout.layout</code>.
     */
    public String getLayout() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, Integer, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, Integer, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Clientbookenginelayout.CLIENTBOOKENGINELAYOUT.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Clientbookenginelayout.CLIENTBOOKENGINELAYOUT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Clientbookenginelayout.CLIENTBOOKENGINELAYOUT.FK_CLIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Clientbookenginelayout.CLIENTBOOKENGINELAYOUT.RESIDENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Clientbookenginelayout.CLIENTBOOKENGINELAYOUT.PICKUPCOUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Clientbookenginelayout.CLIENTBOOKENGINELAYOUT.LAYOUT;
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
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getResidency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPickupcountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLayout();
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
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getResidency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPickupcountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLayout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientbookenginelayoutRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientbookenginelayoutRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientbookenginelayoutRecord value3(Integer value) {
        setFkClient(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientbookenginelayoutRecord value4(String value) {
        setResidency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientbookenginelayoutRecord value5(String value) {
        setPickupcountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientbookenginelayoutRecord value6(String value) {
        setLayout(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientbookenginelayoutRecord values(UUID value1, Integer value2, Integer value3, String value4, String value5, String value6) {
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
     * Create a detached ClientbookenginelayoutRecord
     */
    public ClientbookenginelayoutRecord() {
        super(Clientbookenginelayout.CLIENTBOOKENGINELAYOUT);
    }

    /**
     * Create a detached, initialised ClientbookenginelayoutRecord
     */
    public ClientbookenginelayoutRecord(UUID guid, Integer id, Integer fkClient, String residency, String pickupcountry, String layout) {
        super(Clientbookenginelayout.CLIENTBOOKENGINELAYOUT);

        set(0, guid);
        set(1, id);
        set(2, fkClient);
        set(3, residency);
        set(4, pickupcountry);
        set(5, layout);
    }
}
