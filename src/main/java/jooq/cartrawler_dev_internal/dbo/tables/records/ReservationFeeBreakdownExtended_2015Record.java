/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationFeeBreakdownExtended_2015;

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
public class ReservationFeeBreakdownExtended_2015Record extends UpdatableRecordImpl<ReservationFeeBreakdownExtended_2015Record> implements Record14<Integer, UUID, String, String, String, String, String, Boolean, BigDecimal, BigDecimal, BigDecimal, Boolean, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 960025569;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.fk_id</code>.
     */
    public void setFkId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.fk_id</code>.
     */
    public Integer getFkId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.fk_feebreakdown</code>.
     */
    public void setFkFeebreakdown(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.fk_feebreakdown</code>.
     */
    public UUID getFkFeebreakdown() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.fuel_policy</code>.
     */
    public void setFuelPolicy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.fuel_policy</code>.
     */
    public String getFuelPolicy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_type</code>.
     */
    public void setMileageType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_type</code>.
     */
    public String getMileageType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_unit</code>.
     */
    public void setMileageUnit(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_unit</code>.
     */
    public String getMileageUnit() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_period</code>.
     */
    public void setMileagePeriod(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_period</code>.
     */
    public String getMileagePeriod() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_currency</code>.
     */
    public void setMileageCurrency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_currency</code>.
     */
    public String getMileageCurrency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_tax_inc</code>.
     */
    public void setMileageTaxInc(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_tax_inc</code>.
     */
    public Boolean getMileageTaxInc() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_limit</code>.
     */
    public void setMileageLimit(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_limit</code>.
     */
    public BigDecimal getMileageLimit() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_unit_rate</code>.
     */
    public void setMileageUnitRate(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.mileage_unit_rate</code>.
     */
    public BigDecimal getMileageUnitRate() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.deposit_amount</code>.
     */
    public void setDepositAmount(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.deposit_amount</code>.
     */
    public BigDecimal getDepositAmount() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.deposit</code>.
     */
    public void setDeposit(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.deposit</code>.
     */
    public Boolean getDeposit() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.min_amount</code>.
     */
    public void setMinAmount(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.min_amount</code>.
     */
    public BigDecimal getMinAmount() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.max_amount</code>.
     */
    public void setMaxAmount(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2015.max_amount</code>.
     */
    public BigDecimal getMaxAmount() {
        return (BigDecimal) get(13);
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
    public Row14<Integer, UUID, String, String, String, String, String, Boolean, BigDecimal, BigDecimal, BigDecimal, Boolean, BigDecimal, BigDecimal> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, UUID, String, String, String, String, String, Boolean, BigDecimal, BigDecimal, BigDecimal, Boolean, BigDecimal, BigDecimal> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.FK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.FK_FEEBREAKDOWN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.FUEL_POLICY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.MILEAGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.MILEAGE_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.MILEAGE_PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.MILEAGE_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.MILEAGE_TAX_INC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.MILEAGE_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.MILEAGE_UNIT_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.DEPOSIT_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.DEPOSIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.MIN_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015.MAX_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component2() {
        return getFkFeebreakdown();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFuelPolicy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMileageType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMileageUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMileagePeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMileageCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getMileageTaxInc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getMileageLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getMileageUnitRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getDepositAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getDeposit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getMinAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getMaxAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value2() {
        return getFkFeebreakdown();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFuelPolicy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMileageType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMileageUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMileagePeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMileageCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getMileageTaxInc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getMileageLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getMileageUnitRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getDepositAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getDeposit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getMinAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getMaxAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value1(Integer value) {
        setFkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value2(UUID value) {
        setFkFeebreakdown(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value3(String value) {
        setFuelPolicy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value4(String value) {
        setMileageType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value5(String value) {
        setMileageUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value6(String value) {
        setMileagePeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value7(String value) {
        setMileageCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value8(Boolean value) {
        setMileageTaxInc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value9(BigDecimal value) {
        setMileageLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value10(BigDecimal value) {
        setMileageUnitRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value11(BigDecimal value) {
        setDepositAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value12(Boolean value) {
        setDeposit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value13(BigDecimal value) {
        setMinAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record value14(BigDecimal value) {
        setMaxAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2015Record values(Integer value1, UUID value2, String value3, String value4, String value5, String value6, String value7, Boolean value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, Boolean value12, BigDecimal value13, BigDecimal value14) {
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
     * Create a detached ReservationFeeBreakdownExtended_2015Record
     */
    public ReservationFeeBreakdownExtended_2015Record() {
        super(ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015);
    }

    /**
     * Create a detached, initialised ReservationFeeBreakdownExtended_2015Record
     */
    public ReservationFeeBreakdownExtended_2015Record(Integer fkId, UUID fkFeebreakdown, String fuelPolicy, String mileageType, String mileageUnit, String mileagePeriod, String mileageCurrency, Boolean mileageTaxInc, BigDecimal mileageLimit, BigDecimal mileageUnitRate, BigDecimal depositAmount, Boolean deposit, BigDecimal minAmount, BigDecimal maxAmount) {
        super(ReservationFeeBreakdownExtended_2015.RESERVATION_FEE_BREAKDOWN_EXTENDED_2015);

        set(0, fkId);
        set(1, fkFeebreakdown);
        set(2, fuelPolicy);
        set(3, mileageType);
        set(4, mileageUnit);
        set(5, mileagePeriod);
        set(6, mileageCurrency);
        set(7, mileageTaxInc);
        set(8, mileageLimit);
        set(9, mileageUnitRate);
        set(10, depositAmount);
        set(11, deposit);
        set(12, minAmount);
        set(13, maxAmount);
    }
}
