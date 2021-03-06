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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationInvoicingRecord;

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
public class ReservationInvoicing extends TableImpl<ReservationInvoicingRecord> {

    private static final long serialVersionUID = 1713722883;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_invoicing</code>
     */
    public static final ReservationInvoicing RESERVATION_INVOICING = new ReservationInvoicing();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationInvoicingRecord> getRecordType() {
        return ReservationInvoicingRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.guid</code>.
     */
    public final TableField<ReservationInvoicingRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.id</code>.
     */
    public final TableField<ReservationInvoicingRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.invoice_date</code>.
     */
    public final TableField<ReservationInvoicingRecord, Timestamp> INVOICE_DATE = createField("invoice_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.invoice_number</code>.
     */
    public final TableField<ReservationInvoicingRecord, String> INVOICE_NUMBER = createField("invoice_number", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.remarks</code>.
     */
    public final TableField<ReservationInvoicingRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.company</code>.
     */
    public final TableField<ReservationInvoicingRecord, String> COMPANY = createField("company", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.fxMonthEnd</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> FXMONTHEND = createField("fxMonthEnd", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.fxInvoice</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> FXINVOICE = createField("fxInvoice", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.periodFrom</code>.
     */
    public final TableField<ReservationInvoicingRecord, Timestamp> PERIODFROM = createField("periodFrom", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.periodTo</code>.
     */
    public final TableField<ReservationInvoicingRecord, Timestamp> PERIODTO = createField("periodTo", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.fk_user</code>.
     */
    public final TableField<ReservationInvoicingRecord, Integer> FK_USER = createField("fk_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.createDate</code>.
     */
    public final TableField<ReservationInvoicingRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.prepaid</code>.
     */
    public final TableField<ReservationInvoicingRecord, Boolean> PREPAID = createField("prepaid", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.invoice_amount</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> INVOICE_AMOUNT = createField("invoice_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.billing_currency</code>.
     */
    public final TableField<ReservationInvoicingRecord, String> BILLING_CURRENCY = createField("billing_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.invoice_amount_local_currency</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> INVOICE_AMOUNT_LOCAL_CURRENCY = createField("invoice_amount_local_currency", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.numRes</code>.
     */
    public final TableField<ReservationInvoicingRecord, Integer> NUMRES = createField("numRes", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.invdBySupCTFXRate</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> INVDBYSUPCTFXRATE = createField("invdBySupCTFXRate", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.ctLiabilityCTFXRate</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> CTLIABILITYCTFXRATE = createField("ctLiabilityCTFXRate", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.totalDiffInclFX</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> TOTALDIFFINCLFX = createField("totalDiffInclFX", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.invRateDiff</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> INVRATEDIFF = createField("invRateDiff", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.fxDiff</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> FXDIFF = createField("fxDiff", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.fxCurrencyRate</code>.
     */
    public final TableField<ReservationInvoicingRecord, String> FXCURRENCYRATE = createField("fxCurrencyRate", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.totalAmountBilled</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> TOTALAMOUNTBILLED = createField("totalAmountBilled", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.ctDueToSupplier</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> CTDUETOSUPPLIER = createField("ctDueToSupplier", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.billedBySupplier</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> BILLEDBYSUPPLIER = createField("billedBySupplier", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_invoicing.localCcyBilledBySupplier</code>.
     */
    public final TableField<ReservationInvoicingRecord, BigDecimal> LOCALCCYBILLEDBYSUPPLIER = createField("localCcyBilledBySupplier", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_invoicing</code> table reference
     */
    public ReservationInvoicing() {
        this(DSL.name("reservation_invoicing"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_invoicing</code> table reference
     */
    public ReservationInvoicing(String alias) {
        this(DSL.name(alias), RESERVATION_INVOICING);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_invoicing</code> table reference
     */
    public ReservationInvoicing(Name alias) {
        this(alias, RESERVATION_INVOICING);
    }

    private ReservationInvoicing(Name alias, Table<ReservationInvoicingRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationInvoicing(Name alias, Table<ReservationInvoicingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationInvoicing(Table<O> child, ForeignKey<O, ReservationInvoicingRecord> key) {
        super(child, key, RESERVATION_INVOICING);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_INVOICING_PK_RESERVATION_INVOICING, Indexes.RESERVATION_INVOICING_UNIQUEID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationInvoicingRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_INVOICING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationInvoicingRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_INVOICING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationInvoicingRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationInvoicingRecord>>asList(Keys.PK_RESERVATION_INVOICING, Keys.UNIQUEID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationInvoicing as(String alias) {
        return new ReservationInvoicing(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationInvoicing as(Name alias) {
        return new ReservationInvoicing(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationInvoicing rename(String name) {
        return new ReservationInvoicing(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationInvoicing rename(Name name) {
        return new ReservationInvoicing(name, null);
    }
}
