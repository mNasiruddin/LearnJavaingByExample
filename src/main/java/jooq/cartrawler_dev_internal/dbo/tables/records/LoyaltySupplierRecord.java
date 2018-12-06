/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.LoyaltySupplier;

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
public class LoyaltySupplierRecord extends UpdatableRecordImpl<LoyaltySupplierRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 705145097;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.loyalty_supplier.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.loyalty_supplier.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.loyalty_supplier.supplier_name</code>.
     */
    public void setSupplierName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.loyalty_supplier.supplier_name</code>.
     */
    public String getSupplierName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.loyalty_supplier.xml_type</code>.
     */
    public void setXmlType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.loyalty_supplier.xml_type</code>.
     */
    public String getXmlType() {
        return (String) get(2);
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
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LoyaltySupplier.LOYALTY_SUPPLIER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LoyaltySupplier.LOYALTY_SUPPLIER.SUPPLIER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LoyaltySupplier.LOYALTY_SUPPLIER.XML_TYPE;
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
    public String component2() {
        return getSupplierName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getXmlType();
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
    public String value2() {
        return getSupplierName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getXmlType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoyaltySupplierRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoyaltySupplierRecord value2(String value) {
        setSupplierName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoyaltySupplierRecord value3(String value) {
        setXmlType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoyaltySupplierRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LoyaltySupplierRecord
     */
    public LoyaltySupplierRecord() {
        super(LoyaltySupplier.LOYALTY_SUPPLIER);
    }

    /**
     * Create a detached, initialised LoyaltySupplierRecord
     */
    public LoyaltySupplierRecord(Integer id, String supplierName, String xmlType) {
        super(LoyaltySupplier.LOYALTY_SUPPLIER);

        set(0, id);
        set(1, supplierName);
        set(2, xmlType);
    }
}
