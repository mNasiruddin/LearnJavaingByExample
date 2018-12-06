/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Payee;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;


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
public class PayeeRecord extends TableRecordImpl<PayeeRecord> implements Record8<Integer, Integer, String, String, UByte, Integer, Integer, String> {

    private static final long serialVersionUID = 1400714919;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payee.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payee.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payee.fk_ax</code>.
     */
    public void setFkAx(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payee.fk_ax</code>.
     */
    public Integer getFkAx() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payee.payee_name</code>.
     */
    public void setPayeeName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payee.payee_name</code>.
     */
    public String getPayeeName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payee.currency</code>.
     */
    public void setCurrency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payee.currency</code>.
     */
    public String getCurrency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payee.payee_type</code>.
     */
    public void setPayeeType(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payee.payee_type</code>.
     */
    public UByte getPayeeType() {
        return (UByte) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payee.fk_associated</code>.
     */
    public void setFkAssociated(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payee.fk_associated</code>.
     */
    public Integer getFkAssociated() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payee.fk_legalagreement</code>.
     */
    public void setFkLegalagreement(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payee.fk_legalagreement</code>.
     */
    public Integer getFkLegalagreement() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.payee.ax_entity</code>.
     */
    public void setAxEntity(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.payee.ax_entity</code>.
     */
    public String getAxEntity() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, UByte, Integer, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, UByte, Integer, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Payee.PAYEE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Payee.PAYEE.FK_AX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Payee.PAYEE.PAYEE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Payee.PAYEE.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field5() {
        return Payee.PAYEE.PAYEE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Payee.PAYEE.FK_ASSOCIATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Payee.PAYEE.FK_LEGALAGREEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Payee.PAYEE.AX_ENTITY;
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
        return getFkAx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPayeeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component5() {
        return getPayeeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getFkAssociated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getFkLegalagreement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getAxEntity();
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
        return getFkAx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPayeeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value5() {
        return getPayeeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getFkAssociated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getFkLegalagreement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAxEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayeeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayeeRecord value2(Integer value) {
        setFkAx(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayeeRecord value3(String value) {
        setPayeeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayeeRecord value4(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayeeRecord value5(UByte value) {
        setPayeeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayeeRecord value6(Integer value) {
        setFkAssociated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayeeRecord value7(Integer value) {
        setFkLegalagreement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayeeRecord value8(String value) {
        setAxEntity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayeeRecord values(Integer value1, Integer value2, String value3, String value4, UByte value5, Integer value6, Integer value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PayeeRecord
     */
    public PayeeRecord() {
        super(Payee.PAYEE);
    }

    /**
     * Create a detached, initialised PayeeRecord
     */
    public PayeeRecord(Integer id, Integer fkAx, String payeeName, String currency, UByte payeeType, Integer fkAssociated, Integer fkLegalagreement, String axEntity) {
        super(Payee.PAYEE);

        set(0, id);
        set(1, fkAx);
        set(2, payeeName);
        set(3, currency);
        set(4, payeeType);
        set(5, fkAssociated);
        set(6, fkLegalagreement);
        set(7, axEntity);
    }
}
