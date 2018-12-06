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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationFeeBreakdown_2017Record;

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
import org.jooq.types.UByte;


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
public class ReservationFeeBreakdown_2017 extends TableImpl<ReservationFeeBreakdown_2017Record> {

    private static final long serialVersionUID = -322303691;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017</code>
     */
    public static final ReservationFeeBreakdown_2017 RESERVATION_FEE_BREAKDOWN_2017 = new ReservationFeeBreakdown_2017();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationFeeBreakdown_2017Record> getRecordType() {
        return ReservationFeeBreakdown_2017Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.id</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.guid</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.fk_reservation</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.type</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, UByte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.status</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, UByte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.amount_status</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, UByte> AMOUNT_STATUS = createField("amount_status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.fee_amount</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, BigDecimal> FEE_AMOUNT = createField("fee_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.sales_tax</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, UByte> SALES_TAX = createField("sales_tax", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.payment_terms</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, UByte> PAYMENT_TERMS = createField("payment_terms", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017.fk_rawdescription</code>.
     */
    public final TableField<ReservationFeeBreakdown_2017Record, Integer> FK_RAWDESCRIPTION = createField("fk_rawdescription", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017</code> table reference
     */
    public ReservationFeeBreakdown_2017() {
        this(DSL.name("reservation_fee_breakdown_2017"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017</code> table reference
     */
    public ReservationFeeBreakdown_2017(String alias) {
        this(DSL.name(alias), RESERVATION_FEE_BREAKDOWN_2017);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2017</code> table reference
     */
    public ReservationFeeBreakdown_2017(Name alias) {
        this(alias, RESERVATION_FEE_BREAKDOWN_2017);
    }

    private ReservationFeeBreakdown_2017(Name alias, Table<ReservationFeeBreakdown_2017Record> aliased) {
        this(alias, aliased, null);
    }

    private ReservationFeeBreakdown_2017(Name alias, Table<ReservationFeeBreakdown_2017Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationFeeBreakdown_2017(Table<O> child, ForeignKey<O, ReservationFeeBreakdown_2017Record> key) {
        super(child, key, RESERVATION_FEE_BREAKDOWN_2017);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_FEE_BREAKDOWN_2017_PK_RESERVATION_FEE_BREAKDOWN_2017_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationFeeBreakdown_2017Record, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_FEE_BREAKDOWN_2017;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationFeeBreakdown_2017Record> getPrimaryKey() {
        return Keys.PK_RESERVATION_FEE_BREAKDOWN_2017_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationFeeBreakdown_2017Record>> getKeys() {
        return Arrays.<UniqueKey<ReservationFeeBreakdown_2017Record>>asList(Keys.PK_RESERVATION_FEE_BREAKDOWN_2017_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2017 as(String alias) {
        return new ReservationFeeBreakdown_2017(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2017 as(Name alias) {
        return new ReservationFeeBreakdown_2017(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationFeeBreakdown_2017 rename(String name) {
        return new ReservationFeeBreakdown_2017(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationFeeBreakdown_2017 rename(Name name) {
        return new ReservationFeeBreakdown_2017(name, null);
    }
}
