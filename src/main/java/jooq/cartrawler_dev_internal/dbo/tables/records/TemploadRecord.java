/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Tempload;

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
public class TemploadRecord extends TableRecordImpl<TemploadRecord> implements Record1<String> {

    private static final long serialVersionUID = -1809593115;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.tempload.thedata</code>.
     */
    public void setThedata(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.tempload.thedata</code>.
     */
    public String getThedata() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Tempload.TEMPLOAD.THEDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getThedata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getThedata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TemploadRecord value1(String value) {
        setThedata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TemploadRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TemploadRecord
     */
    public TemploadRecord() {
        super(Tempload.TEMPLOAD);
    }

    /**
     * Create a detached, initialised TemploadRecord
     */
    public TemploadRecord(String thedata) {
        super(Tempload.TEMPLOAD);

        set(0, thedata);
    }
}