/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.IhDiscounts;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class IhDiscountsRecord extends UpdatableRecordImpl<IhDiscountsRecord> implements Record14<Integer, Integer, Integer, Integer, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, String, Timestamp, Long, Long> {

    private static final long serialVersionUID = 789400540;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.fk_ih_partnername</code>.
     */
    public void setFkIhPartnername(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.fk_ih_partnername</code>.
     */
    public Integer getFkIhPartnername() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.fk_ih_siteurl</code>.
     */
    public void setFkIhSiteurl(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.fk_ih_siteurl</code>.
     */
    public Integer getFkIhSiteurl() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.fk_ih_title</code>.
     */
    public void setFkIhTitle(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.fk_ih_title</code>.
     */
    public Integer getFkIhTitle() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.sipp</code>.
     */
    public void setSipp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.sipp</code>.
     */
    public String getSipp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.partner_amount</code>.
     */
    public void setPartnerAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.partner_amount</code>.
     */
    public BigDecimal getPartnerAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.partner_currency</code>.
     */
    public void setPartnerCurrency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.partner_currency</code>.
     */
    public String getPartnerCurrency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.request_discount</code>.
     */
    public void setRequestDiscount(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.request_discount</code>.
     */
    public BigDecimal getRequestDiscount() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.actual_discount</code>.
     */
    public void setActualDiscount(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.actual_discount</code>.
     */
    public BigDecimal getActualDiscount() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.discounted_rental_cost</code>.
     */
    public void setDiscountedRentalCost(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.discounted_rental_cost</code>.
     */
    public BigDecimal getDiscountedRentalCost() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.discounted_rental_currency</code>.
     */
    public void setDiscountedRentalCurrency(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.discounted_rental_currency</code>.
     */
    public String getDiscountedRentalCurrency() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.query_date</code>.
     */
    public void setQueryDate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.query_date</code>.
     */
    public Timestamp getQueryDate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.query_id</code>.
     */
    public void setQueryId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.query_id</code>.
     */
    public Long getQueryId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ih_discounts.discount_ref</code>.
     */
    public void setDiscountRef(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ih_discounts.discount_ref</code>.
     */
    public Long getDiscountRef() {
        return (Long) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Integer, Integer, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, String, Timestamp, Long, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Integer, Integer, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, String, Timestamp, Long, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return IhDiscounts.IH_DISCOUNTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return IhDiscounts.IH_DISCOUNTS.FK_IH_PARTNERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return IhDiscounts.IH_DISCOUNTS.FK_IH_SITEURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return IhDiscounts.IH_DISCOUNTS.FK_IH_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return IhDiscounts.IH_DISCOUNTS.SIPP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return IhDiscounts.IH_DISCOUNTS.PARTNER_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return IhDiscounts.IH_DISCOUNTS.PARTNER_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return IhDiscounts.IH_DISCOUNTS.REQUEST_DISCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return IhDiscounts.IH_DISCOUNTS.ACTUAL_DISCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return IhDiscounts.IH_DISCOUNTS.DISCOUNTED_RENTAL_COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return IhDiscounts.IH_DISCOUNTS.DISCOUNTED_RENTAL_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return IhDiscounts.IH_DISCOUNTS.QUERY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return IhDiscounts.IH_DISCOUNTS.QUERY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return IhDiscounts.IH_DISCOUNTS.DISCOUNT_REF;
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
        return getFkIhPartnername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkIhSiteurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getFkIhTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getPartnerAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPartnerCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getRequestDiscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getActualDiscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getDiscountedRentalCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getDiscountedRentalCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getQueryDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
        return getQueryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getDiscountRef();
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
        return getFkIhPartnername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkIhSiteurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFkIhTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getPartnerAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPartnerCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getRequestDiscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getActualDiscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getDiscountedRentalCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDiscountedRentalCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getQueryDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getQueryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getDiscountRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value2(Integer value) {
        setFkIhPartnername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value3(Integer value) {
        setFkIhSiteurl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value4(Integer value) {
        setFkIhTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value5(String value) {
        setSipp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value6(BigDecimal value) {
        setPartnerAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value7(String value) {
        setPartnerCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value8(BigDecimal value) {
        setRequestDiscount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value9(BigDecimal value) {
        setActualDiscount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value10(BigDecimal value) {
        setDiscountedRentalCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value11(String value) {
        setDiscountedRentalCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value12(Timestamp value) {
        setQueryDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value13(Long value) {
        setQueryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord value14(Long value) {
        setDiscountRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IhDiscountsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, BigDecimal value6, String value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, String value11, Timestamp value12, Long value13, Long value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IhDiscountsRecord
     */
    public IhDiscountsRecord() {
        super(IhDiscounts.IH_DISCOUNTS);
    }

    /**
     * Create a detached, initialised IhDiscountsRecord
     */
    public IhDiscountsRecord(Integer id, Integer fkIhPartnername, Integer fkIhSiteurl, Integer fkIhTitle, String sipp, BigDecimal partnerAmount, String partnerCurrency, BigDecimal requestDiscount, BigDecimal actualDiscount, BigDecimal discountedRentalCost, String discountedRentalCurrency, Timestamp queryDate, Long queryId, Long discountRef) {
        super(IhDiscounts.IH_DISCOUNTS);

        set(0, id);
        set(1, fkIhPartnername);
        set(2, fkIhSiteurl);
        set(3, fkIhTitle);
        set(4, sipp);
        set(5, partnerAmount);
        set(6, partnerCurrency);
        set(7, requestDiscount);
        set(8, actualDiscount);
        set(9, discountedRentalCost);
        set(10, discountedRentalCurrency);
        set(11, queryDate);
        set(12, queryId);
        set(13, discountRef);
    }
}
