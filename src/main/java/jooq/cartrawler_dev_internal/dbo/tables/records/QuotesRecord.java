/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Quotes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class QuotesRecord extends UpdatableRecordImpl<QuotesRecord> implements Record10<Integer, String, String, String, String, BigDecimal, String, Integer, String, Integer> {

    private static final long serialVersionUID = 1599736299;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.Ix</code>.
     */
    public void setIx(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.Ix</code>.
     */
    public Integer getIx() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.ReferenceDateTime</code>.
     */
    public void setReferencedatetime(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.ReferenceDateTime</code>.
     */
    public String getReferencedatetime() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.ReferenceId</code>.
     */
    public void setReferenceid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.ReferenceId</code>.
     */
    public String getReferenceid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.OtaSummary</code>.
     */
    public void setOtasummary(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.OtaSummary</code>.
     */
    public String getOtasummary() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.Currency</code>.
     */
    public void setCurrency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.Currency</code>.
     */
    public String getCurrency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.Amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.Amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.XmlType</code>.
     */
    public void setXmltype(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.XmlType</code>.
     */
    public String getXmltype() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.CarAgentId</code>.
     */
    public void setCaragentid(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.CarAgentId</code>.
     */
    public Integer getCaragentid() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.OurReferenceId</code>.
     */
    public void setOurreferenceid(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.OurReferenceId</code>.
     */
    public String getOurreferenceid() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Quotes.ReservationRef</code>.
     */
    public void setReservationref(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Quotes.ReservationRef</code>.
     */
    public Integer getReservationref() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, BigDecimal, String, Integer, String, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, BigDecimal, String, Integer, String, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Quotes.QUOTES.IX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Quotes.QUOTES.REFERENCEDATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Quotes.QUOTES.REFERENCEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Quotes.QUOTES.OTASUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Quotes.QUOTES.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Quotes.QUOTES.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Quotes.QUOTES.XMLTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Quotes.QUOTES.CARAGENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Quotes.QUOTES.OURREFERENCEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Quotes.QUOTES.RESERVATIONREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getReferencedatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getReferenceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOtasummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getXmltype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getCaragentid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOurreferenceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getReservationref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getReferencedatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReferenceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOtasummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getXmltype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCaragentid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOurreferenceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getReservationref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value1(Integer value) {
        setIx(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value2(String value) {
        setReferencedatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value3(String value) {
        setReferenceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value4(String value) {
        setOtasummary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value5(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value6(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value7(String value) {
        setXmltype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value8(Integer value) {
        setCaragentid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value9(String value) {
        setOurreferenceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord value10(Integer value) {
        setReservationref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotesRecord values(Integer value1, String value2, String value3, String value4, String value5, BigDecimal value6, String value7, Integer value8, String value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuotesRecord
     */
    public QuotesRecord() {
        super(Quotes.QUOTES);
    }

    /**
     * Create a detached, initialised QuotesRecord
     */
    public QuotesRecord(Integer ix, String referencedatetime, String referenceid, String otasummary, String currency, BigDecimal amount, String xmltype, Integer caragentid, String ourreferenceid, Integer reservationref) {
        super(Quotes.QUOTES);

        set(0, ix);
        set(1, referencedatetime);
        set(2, referenceid);
        set(3, otasummary);
        set(4, currency);
        set(5, amount);
        set(6, xmltype);
        set(7, caragentid);
        set(8, ourreferenceid);
        set(9, reservationref);
    }
}
