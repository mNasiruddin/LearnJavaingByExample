/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Ctest;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class CtestRecord extends TableRecordImpl<CtestRecord> implements Record5<Timestamp, Double, Double, Double, Double> {

    private static final long serialVersionUID = 2131365844;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ctest.dt</code>.
     */
    public void setDt(Timestamp value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ctest.dt</code>.
     */
    public Timestamp getDt() {
        return (Timestamp) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ctest.a</code>.
     */
    public void setA(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ctest.a</code>.
     */
    public Double getA() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ctest.b</code>.
     */
    public void setB(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ctest.b</code>.
     */
    public Double getB() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ctest.c</code>.
     */
    public void setC(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ctest.c</code>.
     */
    public Double getC() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ctest.d</code>.
     */
    public void setD(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ctest.d</code>.
     */
    public Double getD() {
        return (Double) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Timestamp, Double, Double, Double, Double> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Timestamp, Double, Double, Double, Double> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field1() {
        return Ctest.CTEST.DT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field2() {
        return Ctest.CTEST.A;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return Ctest.CTEST.B;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Ctest.CTEST.C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Ctest.CTEST.D;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component1() {
        return getDt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component2() {
        return getA();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getB();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getD();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value1() {
        return getDt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value2() {
        return getA();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getB();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getD();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtestRecord value1(Timestamp value) {
        setDt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtestRecord value2(Double value) {
        setA(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtestRecord value3(Double value) {
        setB(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtestRecord value4(Double value) {
        setC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtestRecord value5(Double value) {
        setD(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtestRecord values(Timestamp value1, Double value2, Double value3, Double value4, Double value5) {
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
     * Create a detached CtestRecord
     */
    public CtestRecord() {
        super(Ctest.CTEST);
    }

    /**
     * Create a detached, initialised CtestRecord
     */
    public CtestRecord(Timestamp dt, Double a, Double b, Double c, Double d) {
        super(Ctest.CTEST);

        set(0, dt);
        set(1, a);
        set(2, b);
        set(3, c);
        set(4, d);
    }
}
