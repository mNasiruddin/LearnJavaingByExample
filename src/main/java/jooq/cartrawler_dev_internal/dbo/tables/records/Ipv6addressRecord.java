/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Ipv6address;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class Ipv6addressRecord extends TableRecordImpl<Ipv6addressRecord> implements Record2<Integer, byte[]> {

    private static final long serialVersionUID = -1599929398;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ipv6address.ref</code>.
     */
    public void setRef(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ipv6address.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ipv6address.address</code>.
     */
    public void setAddress(byte... value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ipv6address.address</code>.
     */
    public byte[] getAddress() {
        return (byte[]) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, byte[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, byte[]> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Ipv6address.IPV6ADDRESS.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return Ipv6address.IPV6ADDRESS.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component2() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value2() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ipv6addressRecord value1(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ipv6addressRecord value2(byte... value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ipv6addressRecord values(Integer value1, byte[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Ipv6addressRecord
     */
    public Ipv6addressRecord() {
        super(Ipv6address.IPV6ADDRESS);
    }

    /**
     * Create a detached, initialised Ipv6addressRecord
     */
    public Ipv6addressRecord(Integer ref, byte[] address) {
        super(Ipv6address.IPV6ADDRESS);

        set(0, ref);
        set(1, address);
    }
}
