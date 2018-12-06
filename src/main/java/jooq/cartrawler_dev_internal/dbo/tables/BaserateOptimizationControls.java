/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.BaserateOptimizationControlsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class BaserateOptimizationControls extends TableImpl<BaserateOptimizationControlsRecord> {

    private static final long serialVersionUID = 1385904642;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls</code>
     */
    public static final BaserateOptimizationControls BASERATE_OPTIMIZATION_CONTROLS = new BaserateOptimizationControls();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BaserateOptimizationControlsRecord> getRecordType() {
        return BaserateOptimizationControlsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.id</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.country_orig</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, String> COUNTRY_ORIG = createField("country_orig", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.country_dest</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, String> COUNTRY_DEST = createField("country_dest", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.segment</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, String> SEGMENT = createField("segment", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.elasticity_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> ELASTICITY_GROUP_A = createField("elasticity_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_prepaid_rate_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_PREPAID_RATE_GROUP_A = createField("coeff_prepaid_rate_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_partpaid_rate_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_PARTPAID_RATE_GROUP_A = createField("coeff_partpaid_rate_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_breakage_rate_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_BREAKAGE_RATE_GROUP_A = createField("coeff_breakage_rate_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_rebate_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_REBATE_GROUP_A = createField("coeff_avg_rebate_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_procfee_rate_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_PROCFEE_RATE_GROUP_A = createField("coeff_procfee_rate_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_flat_comm_rate_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_FLAT_COMM_RATE_GROUP_A = createField("coeff_flat_comm_rate_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_rev_share_rate_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_REV_SHARE_RATE_GROUP_A = createField("coeff_rev_share_rate_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_affiliates_cost_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_AFFILIATES_COST_GROUP_A = createField("coeff_avg_affiliates_cost_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_marketing_cost_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_MARKETING_COST_GROUP_A = createField("coeff_avg_marketing_cost_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_bank_comm_rate_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_BANK_COMM_RATE_GROUP_A = createField("coeff_bank_comm_rate_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_customer_serv_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_CUSTOMER_SERV_GROUP_A = createField("coeff_avg_customer_serv_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_daily_insurance_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_DAILY_INSURANCE_GROUP_A = createField("coeff_avg_daily_insurance_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_insurance_rate_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_INSURANCE_RATE_GROUP_A = createField("coeff_insurance_rate_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_meta_cost_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_META_COST_GROUP_A = createField("coeff_avg_meta_cost_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_ppc_cost_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_PPC_COST_GROUP_A = createField("coeff_avg_ppc_cost_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.elasticity_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> ELASTICITY_GROUP_B = createField("elasticity_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_prepaid_rate_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_PREPAID_RATE_GROUP_B = createField("coeff_prepaid_rate_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_partpaid_rate_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_PARTPAID_RATE_GROUP_B = createField("coeff_partpaid_rate_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_breakage_rate_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_BREAKAGE_RATE_GROUP_B = createField("coeff_breakage_rate_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_rebate_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_REBATE_GROUP_B = createField("coeff_avg_rebate_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_proc_fee_rate_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_PROC_FEE_RATE_GROUP_B = createField("coeff_proc_fee_rate_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_flat_commrate_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_FLAT_COMMRATE_GROUP_B = createField("coeff_flat_commrate_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_rev_share_rate_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_REV_SHARE_RATE_GROUP_B = createField("coeff_rev_share_rate_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_affiliates_cost_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_AFFILIATES_COST_GROUP_B = createField("coeff_avg_affiliates_cost_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_marketing_cost_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_MARKETING_COST_GROUP_B = createField("coeff_avg_marketing_cost_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_bank_comm_rate_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_BANK_COMM_RATE_GROUP_B = createField("coeff_bank_comm_rate_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_customer_serv_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_CUSTOMER_SERV_GROUP_B = createField("coeff_avg_customer_serv_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_daily_insurance_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_DAILY_INSURANCE_GROUP_B = createField("coeff_avg_daily_insurance_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_insurance_rate_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_INSURANCE_RATE_GROUP_B = createField("coeff_insurance_rate_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_meta_cost_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_META_COST_GROUP_B = createField("coeff_avg_meta_cost_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.coeff_avg_ppc_cost_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> COEFF_AVG_PPC_COST_GROUP_B = createField("coeff_avg_ppc_cost_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.markup_group_a</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> MARKUP_GROUP_A = createField("markup_group_a", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls.markup_group_b</code>.
     */
    public final TableField<BaserateOptimizationControlsRecord, BigDecimal> MARKUP_GROUP_B = createField("markup_group_b", org.jooq.impl.SQLDataType.NUMERIC(12, 9), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls</code> table reference
     */
    public BaserateOptimizationControls() {
        this(DSL.name("baserate_optimization_controls"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls</code> table reference
     */
    public BaserateOptimizationControls(String alias) {
        this(DSL.name(alias), BASERATE_OPTIMIZATION_CONTROLS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.baserate_optimization_controls</code> table reference
     */
    public BaserateOptimizationControls(Name alias) {
        this(alias, BASERATE_OPTIMIZATION_CONTROLS);
    }

    private BaserateOptimizationControls(Name alias, Table<BaserateOptimizationControlsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BaserateOptimizationControls(Name alias, Table<BaserateOptimizationControlsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BaserateOptimizationControls(Table<O> child, ForeignKey<O, BaserateOptimizationControlsRecord> key) {
        super(child, key, BASERATE_OPTIMIZATION_CONTROLS);
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
        return Arrays.<Index>asList(Indexes.BASERATE_OPTIMIZATION_CONTROLS_PK_BASERATE_OPTIMIZATION_CONTROLS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BaserateOptimizationControlsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BASERATE_OPTIMIZATION_CONTROLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BaserateOptimizationControlsRecord> getPrimaryKey() {
        return Keys.PK_BASERATE_OPTIMIZATION_CONTROLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BaserateOptimizationControlsRecord>> getKeys() {
        return Arrays.<UniqueKey<BaserateOptimizationControlsRecord>>asList(Keys.PK_BASERATE_OPTIMIZATION_CONTROLS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BaserateOptimizationControls as(String alias) {
        return new BaserateOptimizationControls(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BaserateOptimizationControls as(Name alias) {
        return new BaserateOptimizationControls(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BaserateOptimizationControls rename(String name) {
        return new BaserateOptimizationControls(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BaserateOptimizationControls rename(Name name) {
        return new BaserateOptimizationControls(name, null);
    }
}
