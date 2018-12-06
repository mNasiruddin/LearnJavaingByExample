/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Planitems_111016;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class Planitems_111016Record extends TableRecordImpl<Planitems_111016Record> implements Record4<UUID, Integer, UUID, UUID> {

    private static final long serialVersionUID = 2004922603;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.planitems_111016.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.planitems_111016.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.planitems_111016.ID</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.planitems_111016.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.planitems_111016.fk_plan</code>.
     */
    public void setFkPlan(UUID value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.planitems_111016.fk_plan</code>.
     */
    public UUID getFkPlan() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.planitems_111016.fk_contract</code>.
     */
    public void setFkContract(UUID value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.planitems_111016.fk_contract</code>.
     */
    public UUID getFkContract() {
        return (UUID) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, UUID, UUID> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, UUID, UUID> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Planitems_111016.PLANITEMS_111016.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Planitems_111016.PLANITEMS_111016.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field3() {
        return Planitems_111016.PLANITEMS_111016.FK_PLAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field4() {
        return Planitems_111016.PLANITEMS_111016.FK_CONTRACT;
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
    public UUID component3() {
        return getFkPlan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component4() {
        return getFkContract();
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
    public UUID value3() {
        return getFkPlan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value4() {
        return getFkContract();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Planitems_111016Record value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Planitems_111016Record value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Planitems_111016Record value3(UUID value) {
        setFkPlan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Planitems_111016Record value4(UUID value) {
        setFkContract(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Planitems_111016Record values(UUID value1, Integer value2, UUID value3, UUID value4) {
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
     * Create a detached Planitems_111016Record
     */
    public Planitems_111016Record() {
        super(Planitems_111016.PLANITEMS_111016);
    }

    /**
     * Create a detached, initialised Planitems_111016Record
     */
    public Planitems_111016Record(UUID guid, Integer id, UUID fkPlan, UUID fkContract) {
        super(Planitems_111016.PLANITEMS_111016);

        set(0, guid);
        set(1, id);
        set(2, fkPlan);
        set(3, fkContract);
    }
}
