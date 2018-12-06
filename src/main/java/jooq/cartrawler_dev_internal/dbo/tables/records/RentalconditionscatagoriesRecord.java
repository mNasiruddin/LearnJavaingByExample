/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Rentalconditionscatagories;

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
public class RentalconditionscatagoriesRecord extends UpdatableRecordImpl<RentalconditionscatagoriesRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -1801403715;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories.fk_name_id</code>.
     */
    public void setFkNameId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories.fk_name_id</code>.
     */
    public Integer getFkNameId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories.category_id</code>.
     */
    public void setCategoryId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories.category_id</code>.
     */
    public Integer getCategoryId() {
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
        return Rentalconditionscatagories.RENTALCONDITIONSCATAGORIES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Rentalconditionscatagories.RENTALCONDITIONSCATAGORIES.FK_NAME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Rentalconditionscatagories.RENTALCONDITIONSCATAGORIES.CATEGORY_ID;
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
        return getFkNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCategoryId();
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
        return getFkNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalconditionscatagoriesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalconditionscatagoriesRecord value2(Integer value) {
        setFkNameId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalconditionscatagoriesRecord value3(Integer value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RentalconditionscatagoriesRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RentalconditionscatagoriesRecord
     */
    public RentalconditionscatagoriesRecord() {
        super(Rentalconditionscatagories.RENTALCONDITIONSCATAGORIES);
    }

    /**
     * Create a detached, initialised RentalconditionscatagoriesRecord
     */
    public RentalconditionscatagoriesRecord(Integer id, Integer fkNameId, Integer categoryId) {
        super(Rentalconditionscatagories.RENTALCONDITIONSCATAGORIES);

        set(0, id);
        set(1, fkNameId);
        set(2, categoryId);
    }
}
