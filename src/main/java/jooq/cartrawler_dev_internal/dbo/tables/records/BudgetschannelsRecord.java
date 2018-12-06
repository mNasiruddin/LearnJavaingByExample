/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Budgetschannels;

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
public class BudgetschannelsRecord extends UpdatableRecordImpl<BudgetschannelsRecord> implements Record5<UUID, Integer, Integer, Integer, Boolean> {

    private static final long serialVersionUID = -441195848;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.fk_Budgets</code>.
     */
    public void setFkBudgets(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.fk_Budgets</code>.
     */
    public Integer getFkBudgets() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.fk_Channels</code>.
     */
    public void setFkChannels(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.fk_Channels</code>.
     */
    public Integer getFkChannels() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.negativeFilter</code>.
     */
    public void setNegativefilter(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetsChannels.negativeFilter</code>.
     */
    public Boolean getNegativefilter() {
        return (Boolean) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, Integer, Integer, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, Integer, Integer, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Budgetschannels.BUDGETSCHANNELS.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Budgetschannels.BUDGETSCHANNELS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Budgetschannels.BUDGETSCHANNELS.FK_BUDGETS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Budgetschannels.BUDGETSCHANNELS.FK_CHANNELS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Budgetschannels.BUDGETSCHANNELS.NEGATIVEFILTER;
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
        return getFkBudgets();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getFkChannels();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getNegativefilter();
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
        return getFkBudgets();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFkChannels();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getNegativefilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetschannelsRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetschannelsRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetschannelsRecord value3(Integer value) {
        setFkBudgets(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetschannelsRecord value4(Integer value) {
        setFkChannels(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetschannelsRecord value5(Boolean value) {
        setNegativefilter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetschannelsRecord values(UUID value1, Integer value2, Integer value3, Integer value4, Boolean value5) {
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
     * Create a detached BudgetschannelsRecord
     */
    public BudgetschannelsRecord() {
        super(Budgetschannels.BUDGETSCHANNELS);
    }

    /**
     * Create a detached, initialised BudgetschannelsRecord
     */
    public BudgetschannelsRecord(UUID guid, Integer id, Integer fkBudgets, Integer fkChannels, Boolean negativefilter) {
        super(Budgetschannels.BUDGETSCHANNELS);

        set(0, guid);
        set(1, id);
        set(2, fkBudgets);
        set(3, fkChannels);
        set(4, negativefilter);
    }
}
