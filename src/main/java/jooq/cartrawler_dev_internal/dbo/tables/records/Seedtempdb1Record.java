/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigInteger;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Seedtempdb1;

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
public class Seedtempdb1Record extends TableRecordImpl<Seedtempdb1Record> implements Record4<BigInteger, BigInteger, BigInteger, String> {

    private static final long serialVersionUID = -1159678120;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.seedtempdb1.Seed</code>.
     */
    public void setSeed(BigInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.seedtempdb1.Seed</code>.
     */
    public BigInteger getSeed() {
        return (BigInteger) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.seedtempdb1.Increment</code>.
     */
    public void setIncrement(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.seedtempdb1.Increment</code>.
     */
    public BigInteger getIncrement() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.seedtempdb1.Current_Identity</code>.
     */
    public void setCurrentIdentity(BigInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.seedtempdb1.Current_Identity</code>.
     */
    public BigInteger getCurrentIdentity() {
        return (BigInteger) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.seedtempdb1.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.seedtempdb1.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<BigInteger, BigInteger, BigInteger, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<BigInteger, BigInteger, BigInteger, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field1() {
        return Seedtempdb1.SEEDTEMPDB1.SEED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return Seedtempdb1.SEEDTEMPDB1.INCREMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field3() {
        return Seedtempdb1.SEEDTEMPDB1.CURRENT_IDENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Seedtempdb1.SEEDTEMPDB1.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component1() {
        return getSeed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component2() {
        return getIncrement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component3() {
        return getCurrentIdentity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value1() {
        return getSeed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value2() {
        return getIncrement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value3() {
        return getCurrentIdentity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seedtempdb1Record value1(BigInteger value) {
        setSeed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seedtempdb1Record value2(BigInteger value) {
        setIncrement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seedtempdb1Record value3(BigInteger value) {
        setCurrentIdentity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seedtempdb1Record value4(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seedtempdb1Record values(BigInteger value1, BigInteger value2, BigInteger value3, String value4) {
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
     * Create a detached Seedtempdb1Record
     */
    public Seedtempdb1Record() {
        super(Seedtempdb1.SEEDTEMPDB1);
    }

    /**
     * Create a detached, initialised Seedtempdb1Record
     */
    public Seedtempdb1Record(BigInteger seed, BigInteger increment, BigInteger currentIdentity, String tableName) {
        super(Seedtempdb1.SEEDTEMPDB1);

        set(0, seed);
        set(1, increment);
        set(2, currentIdentity);
        set(3, tableName);
    }
}
