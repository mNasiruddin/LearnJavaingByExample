/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.Syncobj_0x3436393932313342Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Syncobj_0x3436393932313342 extends TableImpl<Syncobj_0x3436393932313342Record> {

    private static final long serialVersionUID = 974237993;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342</code>
     */
    public static final Syncobj_0x3436393932313342 SYNCOBJ_0X3436393932313342 = new Syncobj_0x3436393932313342();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Syncobj_0x3436393932313342Record> getRecordType() {
        return Syncobj_0x3436393932313342Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.id</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_reservation</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.bonus_commission</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> BONUS_COMMISSION = createField("bonus_commission", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.retail_commission_amount</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> RETAIL_COMMISSION_AMOUNT = createField("retail_commission_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_bill_exchange</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> RATE_BILL_EXCHANGE = createField("rate_bill_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.bill_currency</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> BILL_CURRENCY = createField("bill_currency", org.jooq.impl.SQLDataType.VARCHAR(94), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_supplier_creditor</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, Integer> FK_SUPPLIER_CREDITOR = createField("fk_supplier_creditor", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_supplier_billing_rule</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, Integer> FK_SUPPLIER_BILLING_RULE = createField("fk_supplier_billing_rule", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_supplier_debtor</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, Integer> FK_SUPPLIER_DEBTOR = createField("fk_supplier_debtor", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rebate_value</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> REBATE_VALUE = createField("rebate_value", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rebate_currency</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> REBATE_CURRENCY = createField("rebate_currency", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_rebate_exchange</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> RATE_REBATE_EXCHANGE = createField("rate_rebate_exchange", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.fk_rebate_identifier</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, Integer> FK_REBATE_IDENTIFIER = createField("fk_rebate_identifier", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_comm_percentage</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> INS_COMM_PERCENTAGE = createField("ins_comm_percentage", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.supplier_entity</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> SUPPLIER_ENTITY = createField("supplier_entity", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.techpartner_entity</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> TECHPARTNER_ENTITY = createField("techpartner_entity", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_techpartner_creditor</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> AX_TECHPARTNER_CREDITOR = createField("ax_techpartner_creditor", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_techpartner_debtor</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> AX_TECHPARTNER_DEBTOR = createField("ax_techpartner_debtor", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.bill_euro_exchange</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> BILL_EURO_EXCHANGE = createField("bill_euro_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.partner_bill_currency</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> PARTNER_BILL_CURRENCY = createField("partner_bill_currency", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_partner_bill_exchange</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> RATE_PARTNER_BILL_EXCHANGE = createField("rate_partner_bill_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.partner_bill_euro_exchange</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> PARTNER_BILL_EURO_EXCHANGE = createField("partner_bill_euro_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.tech_bill_currency</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> TECH_BILL_CURRENCY = createField("tech_bill_currency", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_tech_bill_exchange</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> RATE_TECH_BILL_EXCHANGE = createField("rate_tech_bill_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.tech_bill_euro_exchange</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> TECH_BILL_EURO_EXCHANGE = createField("tech_bill_euro_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.franchisee_entity</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> FRANCHISEE_ENTITY = createField("franchisee_entity", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_franchisee_creditor</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> AX_FRANCHISEE_CREDITOR = createField("ax_franchisee_creditor", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ax_franchisee_debtor</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> AX_FRANCHISEE_DEBTOR = createField("ax_franchisee_debtor", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.franchisee_bill_currency</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> FRANCHISEE_BILL_CURRENCY = createField("franchisee_bill_currency", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.rate_franchisee_bill_exchange</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> RATE_FRANCHISEE_BILL_EXCHANGE = createField("rate_franchisee_bill_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.franchisee_bill_euro_exchange</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> FRANCHISEE_BILL_EURO_EXCHANGE = createField("franchisee_bill_euro_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_amt_pd</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, BigDecimal> INS_AMT_PD = createField("ins_amt_pd", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_amt_pd_curr</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, String> INS_AMT_PD_CURR = createField("ins_amt_pd_curr", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342.ins_share_type</code>.
     */
    public final TableField<Syncobj_0x3436393932313342Record, Short> INS_SHARE_TYPE = createField("ins_share_type", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342</code> table reference
     */
    public Syncobj_0x3436393932313342() {
        this(DSL.name("syncobj_0x3436393932313342"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342</code> table reference
     */
    public Syncobj_0x3436393932313342(String alias) {
        this(DSL.name(alias), SYNCOBJ_0X3436393932313342);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x3436393932313342</code> table reference
     */
    public Syncobj_0x3436393932313342(Name alias) {
        this(alias, SYNCOBJ_0X3436393932313342);
    }

    private Syncobj_0x3436393932313342(Name alias, Table<Syncobj_0x3436393932313342Record> aliased) {
        this(alias, aliased, null);
    }

    private Syncobj_0x3436393932313342(Name alias, Table<Syncobj_0x3436393932313342Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Syncobj_0x3436393932313342(Table<O> child, ForeignKey<O, Syncobj_0x3436393932313342Record> key) {
        super(child, key, SYNCOBJ_0X3436393932313342);
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
    public Identity<Syncobj_0x3436393932313342Record, Integer> getIdentity() {
        return Keys.IDENTITY_SYNCOBJ_0X3436393932313342;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3436393932313342 as(String alias) {
        return new Syncobj_0x3436393932313342(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3436393932313342 as(Name alias) {
        return new Syncobj_0x3436393932313342(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x3436393932313342 rename(String name) {
        return new Syncobj_0x3436393932313342(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x3436393932313342 rename(Name name) {
        return new Syncobj_0x3436393932313342(name, null);
    }
}
