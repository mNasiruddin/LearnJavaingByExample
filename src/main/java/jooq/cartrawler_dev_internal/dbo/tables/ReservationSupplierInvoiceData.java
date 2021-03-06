/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationSupplierInvoiceDataRecord;

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
public class ReservationSupplierInvoiceData extends TableImpl<ReservationSupplierInvoiceDataRecord> {

    private static final long serialVersionUID = 769124512;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data</code>
     */
    public static final ReservationSupplierInvoiceData RESERVATION_SUPPLIER_INVOICE_DATA = new ReservationSupplierInvoiceData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationSupplierInvoiceDataRecord> getRecordType() {
        return ReservationSupplierInvoiceDataRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.guid</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fk_reservation</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.amount</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.adjustment</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, BigDecimal> ADJUSTMENT = createField("adjustment", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.notes</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, String> NOTES = createField("notes", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.pickup</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, Timestamp> PICKUP = createField("pickup", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.dropoff</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, Timestamp> DROPOFF = createField("dropoff", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fk_user</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, Integer> FK_USER = createField("fk_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.commissionableAmount</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, BigDecimal> COMMISSIONABLEAMOUNT = createField("commissionableAmount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.amount2</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, BigDecimal> AMOUNT2 = createField("amount2", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.invoice_amount_billing_currency</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, BigDecimal> INVOICE_AMOUNT_BILLING_CURRENCY = createField("invoice_amount_billing_currency", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.commissionableAmount2</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, BigDecimal> COMMISSIONABLEAMOUNT2 = createField("commissionableAmount2", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.invoice_amount_billing_currency2</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, BigDecimal> INVOICE_AMOUNT_BILLING_CURRENCY2 = createField("invoice_amount_billing_currency2", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.bill_currency</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, String> BILL_CURRENCY = createField("bill_currency", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fx_diff_1</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, BigDecimal> FX_DIFF_1 = createField("fx_diff_1", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fx_diff_2</code>.
     */
    public final TableField<ReservationSupplierInvoiceDataRecord, BigDecimal> FX_DIFF_2 = createField("fx_diff_2", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data</code> table reference
     */
    public ReservationSupplierInvoiceData() {
        this(DSL.name("reservation_supplier_invoice_data"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data</code> table reference
     */
    public ReservationSupplierInvoiceData(String alias) {
        this(DSL.name(alias), RESERVATION_SUPPLIER_INVOICE_DATA);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data</code> table reference
     */
    public ReservationSupplierInvoiceData(Name alias) {
        this(alias, RESERVATION_SUPPLIER_INVOICE_DATA);
    }

    private ReservationSupplierInvoiceData(Name alias, Table<ReservationSupplierInvoiceDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationSupplierInvoiceData(Name alias, Table<ReservationSupplierInvoiceDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationSupplierInvoiceData(Table<O> child, ForeignKey<O, ReservationSupplierInvoiceDataRecord> key) {
        super(child, key, RESERVATION_SUPPLIER_INVOICE_DATA);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_SUPPLIER_INVOICE_DATA_PK_RESERVATION_SUPPLIER_INVOICE_DATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationSupplierInvoiceDataRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_SUPPLIER_INVOICE_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationSupplierInvoiceDataRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationSupplierInvoiceDataRecord>>asList(Keys.PK_RESERVATION_SUPPLIER_INVOICE_DATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceData as(String alias) {
        return new ReservationSupplierInvoiceData(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceData as(Name alias) {
        return new ReservationSupplierInvoiceData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationSupplierInvoiceData rename(String name) {
        return new ReservationSupplierInvoiceData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationSupplierInvoiceData rename(Name name) {
        return new ReservationSupplierInvoiceData(name, null);
    }
}
