/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Channelpricingmargins;

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
public class ChannelpricingmarginsRecord extends UpdatableRecordImpl<ChannelpricingmarginsRecord> implements Record10<Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Short> {

    private static final long serialVersionUID = -951365190;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.ref_channelPricingControls</code>.
     */
    public void setRefChannelpricingcontrols(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.ref_channelPricingControls</code>.
     */
    public Integer getRefChannelpricingcontrols() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.baserate_low</code>.
     */
    public void setBaserateLow(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.baserate_low</code>.
     */
    public BigDecimal getBaserateLow() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.baserate_high</code>.
     */
    public void setBaserateHigh(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.baserate_high</code>.
     */
    public BigDecimal getBaserateHigh() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.min_margin</code>.
     */
    public void setMinMargin(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.min_margin</code>.
     */
    public BigDecimal getMinMargin() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.default_margin</code>.
     */
    public void setDefaultMargin(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.default_margin</code>.
     */
    public BigDecimal getDefaultMargin() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.max_margin</code>.
     */
    public void setMaxMargin(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.max_margin</code>.
     */
    public BigDecimal getMaxMargin() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.min_amount</code>.
     */
    public void setMinAmount(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.min_amount</code>.
     */
    public BigDecimal getMinAmount() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.min_amount_currency</code>.
     */
    public void setMinAmountCurrency(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.min_amount_currency</code>.
     */
    public String getMinAmountCurrency() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.marginType</code>.
     */
    public void setMargintype(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingMargins.marginType</code>.
     */
    public Short getMargintype() {
        return (Short) get(9);
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
    public Row10<Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Short> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Short> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.REF_CHANNELPRICINGCONTROLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.BASERATE_LOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.BASERATE_HIGH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.MIN_MARGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.DEFAULT_MARGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.MAX_MARGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.MIN_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.MIN_AMOUNT_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return Channelpricingmargins.CHANNELPRICINGMARGINS.MARGINTYPE;
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
        return getRefChannelpricingcontrols();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getBaserateLow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getBaserateHigh();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getMinMargin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getDefaultMargin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getMaxMargin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getMinAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMinAmountCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getMargintype();
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
        return getRefChannelpricingcontrols();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getBaserateLow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getBaserateHigh();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getMinMargin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getDefaultMargin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getMaxMargin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getMinAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMinAmountCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getMargintype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value2(Integer value) {
        setRefChannelpricingcontrols(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value3(BigDecimal value) {
        setBaserateLow(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value4(BigDecimal value) {
        setBaserateHigh(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value5(BigDecimal value) {
        setMinMargin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value6(BigDecimal value) {
        setDefaultMargin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value7(BigDecimal value) {
        setMaxMargin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value8(BigDecimal value) {
        setMinAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value9(String value) {
        setMinAmountCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord value10(Short value) {
        setMargintype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingmarginsRecord values(Integer value1, Integer value2, BigDecimal value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, String value9, Short value10) {
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
     * Create a detached ChannelpricingmarginsRecord
     */
    public ChannelpricingmarginsRecord() {
        super(Channelpricingmargins.CHANNELPRICINGMARGINS);
    }

    /**
     * Create a detached, initialised ChannelpricingmarginsRecord
     */
    public ChannelpricingmarginsRecord(Integer id, Integer refChannelpricingcontrols, BigDecimal baserateLow, BigDecimal baserateHigh, BigDecimal minMargin, BigDecimal defaultMargin, BigDecimal maxMargin, BigDecimal minAmount, String minAmountCurrency, Short margintype) {
        super(Channelpricingmargins.CHANNELPRICINGMARGINS);

        set(0, id);
        set(1, refChannelpricingcontrols);
        set(2, baserateLow);
        set(3, baserateHigh);
        set(4, minMargin);
        set(5, defaultMargin);
        set(6, maxMargin);
        set(7, minAmount);
        set(8, minAmountCurrency);
        set(9, margintype);
    }
}
