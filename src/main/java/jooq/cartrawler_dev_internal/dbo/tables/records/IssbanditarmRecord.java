/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Issbanditarm;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class IssbanditarmRecord extends UpdatableRecordImpl<IssbanditarmRecord> implements Record12<Integer, Integer, Integer, Integer, Double, Double, Double, Double, Double, Double, Double, Timestamp> {

    private static final long serialVersionUID = 2093190084;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.fkIss</code>.
     */
    public void setFkiss(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.fkIss</code>.
     */
    public Integer getFkiss() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.armIx</code>.
     */
    public void setArmix(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.armIx</code>.
     */
    public Integer getArmix() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.hitcount</code>.
     */
    public void setHitcount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.hitcount</code>.
     */
    public Integer getHitcount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.biasReward</code>.
     */
    public void setBiasreward(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.biasReward</code>.
     */
    public Double getBiasreward() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p1</code>.
     */
    public void setP1(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p1</code>.
     */
    public Double getP1() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p2</code>.
     */
    public void setP2(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p2</code>.
     */
    public Double getP2() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p3</code>.
     */
    public void setP3(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p3</code>.
     */
    public Double getP3() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p4</code>.
     */
    public void setP4(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p4</code>.
     */
    public Double getP4() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p5</code>.
     */
    public void setP5(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p5</code>.
     */
    public Double getP5() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p6</code>.
     */
    public void setP6(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.p6</code>.
     */
    public Double getP6() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issBanditArm.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issBanditArm.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, Double, Double, Double, Double, Double, Double, Double, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, Double, Double, Double, Double, Double, Double, Double, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Issbanditarm.ISSBANDITARM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Issbanditarm.ISSBANDITARM.FKISS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Issbanditarm.ISSBANDITARM.ARMIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Issbanditarm.ISSBANDITARM.HITCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Issbanditarm.ISSBANDITARM.BIASREWARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return Issbanditarm.ISSBANDITARM.P1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return Issbanditarm.ISSBANDITARM.P2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return Issbanditarm.ISSBANDITARM.P3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return Issbanditarm.ISSBANDITARM.P4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field10() {
        return Issbanditarm.ISSBANDITARM.P5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field11() {
        return Issbanditarm.ISSBANDITARM.P6;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Issbanditarm.ISSBANDITARM.CREATED;
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
        return getFkiss();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getArmix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getHitcount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getBiasreward();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getP1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getP2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getP3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component9() {
        return getP4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component10() {
        return getP5();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component11() {
        return getP6();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCreated();
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
        return getFkiss();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getArmix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getHitcount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getBiasreward();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getP1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getP2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getP3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getP4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value10() {
        return getP5();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value11() {
        return getP6();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value2(Integer value) {
        setFkiss(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value3(Integer value) {
        setArmix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value4(Integer value) {
        setHitcount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value5(Double value) {
        setBiasreward(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value6(Double value) {
        setP1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value7(Double value) {
        setP2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value8(Double value) {
        setP3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value9(Double value) {
        setP4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value10(Double value) {
        setP5(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value11(Double value) {
        setP6(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord value12(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssbanditarmRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Double value5, Double value6, Double value7, Double value8, Double value9, Double value10, Double value11, Timestamp value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IssbanditarmRecord
     */
    public IssbanditarmRecord() {
        super(Issbanditarm.ISSBANDITARM);
    }

    /**
     * Create a detached, initialised IssbanditarmRecord
     */
    public IssbanditarmRecord(Integer id, Integer fkiss, Integer armix, Integer hitcount, Double biasreward, Double p1, Double p2, Double p3, Double p4, Double p5, Double p6, Timestamp created) {
        super(Issbanditarm.ISSBANDITARM);

        set(0, id);
        set(1, fkiss);
        set(2, armix);
        set(3, hitcount);
        set(4, biasreward);
        set(5, p1);
        set(6, p2);
        set(7, p3);
        set(8, p4);
        set(9, p5);
        set(10, p6);
        set(11, created);
    }
}
