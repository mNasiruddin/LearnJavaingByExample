/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationFeeBreakdownExtended_2020Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class ReservationFeeBreakdownExtended_2020 extends TableImpl<ReservationFeeBreakdownExtended_2020Record> {

    private static final long serialVersionUID = 1240045225;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020</code>
     */
    public static final ReservationFeeBreakdownExtended_2020 RESERVATION_FEE_BREAKDOWN_EXTENDED_2020 = new ReservationFeeBreakdownExtended_2020();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationFeeBreakdownExtended_2020Record> getRecordType() {
        return ReservationFeeBreakdownExtended_2020Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.fk_id</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, Integer> FK_ID = createField("fk_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.fk_feebreakdown</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, UUID> FK_FEEBREAKDOWN = createField("fk_feebreakdown", org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.fuel_policy</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, String> FUEL_POLICY = createField("fuel_policy", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.mileage_type</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, String> MILEAGE_TYPE = createField("mileage_type", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.mileage_unit</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, String> MILEAGE_UNIT = createField("mileage_unit", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.mileage_period</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, String> MILEAGE_PERIOD = createField("mileage_period", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.mileage_currency</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, String> MILEAGE_CURRENCY = createField("mileage_currency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.mileage_tax_inc</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, Boolean> MILEAGE_TAX_INC = createField("mileage_tax_inc", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.mileage_limit</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, BigDecimal> MILEAGE_LIMIT = createField("mileage_limit", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.mileage_unit_rate</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, BigDecimal> MILEAGE_UNIT_RATE = createField("mileage_unit_rate", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.deposit_amount</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, BigDecimal> DEPOSIT_AMOUNT = createField("deposit_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.deposit</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, Boolean> DEPOSIT = createField("deposit", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.min_amount</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, BigDecimal> MIN_AMOUNT = createField("min_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020.max_amount</code>.
     */
    public final TableField<ReservationFeeBreakdownExtended_2020Record, BigDecimal> MAX_AMOUNT = createField("max_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020</code> table reference
     */
    public ReservationFeeBreakdownExtended_2020() {
        this(DSL.name("reservation_fee_breakdown_extended_2020"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020</code> table reference
     */
    public ReservationFeeBreakdownExtended_2020(String alias) {
        this(DSL.name(alias), RESERVATION_FEE_BREAKDOWN_EXTENDED_2020);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_extended_2020</code> table reference
     */
    public ReservationFeeBreakdownExtended_2020(Name alias) {
        this(alias, RESERVATION_FEE_BREAKDOWN_EXTENDED_2020);
    }

    private ReservationFeeBreakdownExtended_2020(Name alias, Table<ReservationFeeBreakdownExtended_2020Record> aliased) {
        this(alias, aliased, null);
    }

    private ReservationFeeBreakdownExtended_2020(Name alias, Table<ReservationFeeBreakdownExtended_2020Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationFeeBreakdownExtended_2020(Table<O> child, ForeignKey<O, ReservationFeeBreakdownExtended_2020Record> key) {
        super(child, key, RESERVATION_FEE_BREAKDOWN_EXTENDED_2020);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RESERVATION_FEE_BREAKDOWN_EXTENDED_2020_PK_RESERVATION_FEE_BREAKDOWN_EXTENDED_2020_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationFeeBreakdownExtended_2020Record> getPrimaryKey() {
        return Keys.PK_RESERVATION_FEE_BREAKDOWN_EXTENDED_2020_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationFeeBreakdownExtended_2020Record>> getKeys() {
        return Arrays.<UniqueKey<ReservationFeeBreakdownExtended_2020Record>>asList(Keys.PK_RESERVATION_FEE_BREAKDOWN_EXTENDED_2020_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2020 as(String alias) {
        return new ReservationFeeBreakdownExtended_2020(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdownExtended_2020 as(Name alias) {
        return new ReservationFeeBreakdownExtended_2020(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationFeeBreakdownExtended_2020 rename(String name) {
        return new ReservationFeeBreakdownExtended_2020(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationFeeBreakdownExtended_2020 rename(Name name) {
        return new ReservationFeeBreakdownExtended_2020(name, null);
    }
}
