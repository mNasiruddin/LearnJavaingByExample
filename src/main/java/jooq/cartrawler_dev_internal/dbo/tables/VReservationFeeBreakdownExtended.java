/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.VReservationFeeBreakdownExtendedRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class VReservationFeeBreakdownExtended extends TableImpl<VReservationFeeBreakdownExtendedRecord> {

    private static final long serialVersionUID = 700931459;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended</code>
     */
    public static final VReservationFeeBreakdownExtended V_RESERVATION_FEE_BREAKDOWN_EXTENDED = new VReservationFeeBreakdownExtended();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VReservationFeeBreakdownExtendedRecord> getRecordType() {
        return VReservationFeeBreakdownExtendedRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.fk_id</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, Integer> FK_ID = createField("fk_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.fk_feebreakdown</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, UUID> FK_FEEBREAKDOWN = createField("fk_feebreakdown", org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.fuel_policy</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, String> FUEL_POLICY = createField("fuel_policy", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.mileage_type</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, String> MILEAGE_TYPE = createField("mileage_type", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.mileage_unit</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, String> MILEAGE_UNIT = createField("mileage_unit", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.mileage_period</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, String> MILEAGE_PERIOD = createField("mileage_period", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.mileage_currency</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, String> MILEAGE_CURRENCY = createField("mileage_currency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.mileage_tax_inc</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, Boolean> MILEAGE_TAX_INC = createField("mileage_tax_inc", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.mileage_limit</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, BigDecimal> MILEAGE_LIMIT = createField("mileage_limit", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.mileage_unit_rate</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, BigDecimal> MILEAGE_UNIT_RATE = createField("mileage_unit_rate", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.deposit_amount</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, BigDecimal> DEPOSIT_AMOUNT = createField("deposit_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.deposit</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, Boolean> DEPOSIT = createField("deposit", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.min_amount</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, BigDecimal> MIN_AMOUNT = createField("min_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended.max_amount</code>.
     */
    public final TableField<VReservationFeeBreakdownExtendedRecord, BigDecimal> MAX_AMOUNT = createField("max_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended</code> table reference
     */
    public VReservationFeeBreakdownExtended() {
        this(DSL.name("v_reservation_fee_breakdown_extended"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended</code> table reference
     */
    public VReservationFeeBreakdownExtended(String alias) {
        this(DSL.name(alias), V_RESERVATION_FEE_BREAKDOWN_EXTENDED);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.v_reservation_fee_breakdown_extended</code> table reference
     */
    public VReservationFeeBreakdownExtended(Name alias) {
        this(alias, V_RESERVATION_FEE_BREAKDOWN_EXTENDED);
    }

    private VReservationFeeBreakdownExtended(Name alias, Table<VReservationFeeBreakdownExtendedRecord> aliased) {
        this(alias, aliased, null);
    }

    private VReservationFeeBreakdownExtended(Name alias, Table<VReservationFeeBreakdownExtendedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> VReservationFeeBreakdownExtended(Table<O> child, ForeignKey<O, VReservationFeeBreakdownExtendedRecord> key) {
        super(child, key, V_RESERVATION_FEE_BREAKDOWN_EXTENDED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VReservationFeeBreakdownExtended as(String alias) {
        return new VReservationFeeBreakdownExtended(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VReservationFeeBreakdownExtended as(Name alias) {
        return new VReservationFeeBreakdownExtended(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VReservationFeeBreakdownExtended rename(String name) {
        return new VReservationFeeBreakdownExtended(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VReservationFeeBreakdownExtended rename(Name name) {
        return new VReservationFeeBreakdownExtended(name, null);
    }
}
