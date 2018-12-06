/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationChargeableProductRecord;

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
public class ReservationChargeableProduct extends TableImpl<ReservationChargeableProductRecord> {

    private static final long serialVersionUID = -321672371;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product</code>
     */
    public static final ReservationChargeableProduct RESERVATION_CHARGEABLE_PRODUCT = new ReservationChargeableProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationChargeableProductRecord> getRecordType() {
        return ReservationChargeableProductRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.id</code>.
     */
    public final TableField<ReservationChargeableProductRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.fk_reservation</code>.
     */
    public final TableField<ReservationChargeableProductRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.product_type</code>.
     */
    public final TableField<ReservationChargeableProductRecord, Integer> PRODUCT_TYPE = createField("product_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.ancillary_type</code>.
     */
    public final TableField<ReservationChargeableProductRecord, Integer> ANCILLARY_TYPE = createField("ancillary_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.charge_amount</code>.
     */
    public final TableField<ReservationChargeableProductRecord, BigDecimal> CHARGE_AMOUNT = createField("charge_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.charge_currency</code>.
     */
    public final TableField<ReservationChargeableProductRecord, String> CHARGE_CURRENCY = createField("charge_currency", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.rate_amount</code>.
     */
    public final TableField<ReservationChargeableProductRecord, BigDecimal> RATE_AMOUNT = createField("rate_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.rate_currency</code>.
     */
    public final TableField<ReservationChargeableProductRecord, String> RATE_CURRENCY = createField("rate_currency", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.rate_charge_xe</code>.
     */
    public final TableField<ReservationChargeableProductRecord, BigDecimal> RATE_CHARGE_XE = createField("rate_charge_xe", org.jooq.impl.SQLDataType.NUMERIC(10, 6).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.lifecycle</code>.
     */
    public final TableField<ReservationChargeableProductRecord, Integer> LIFECYCLE = createField("lifecycle", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.create_date</code>.
     */
    public final TableField<ReservationChargeableProductRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.cancelled_date</code>.
     */
    public final TableField<ReservationChargeableProductRecord, Timestamp> CANCELLED_DATE = createField("cancelled_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product</code> table reference
     */
    public ReservationChargeableProduct() {
        this(DSL.name("reservation_chargeable_product"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product</code> table reference
     */
    public ReservationChargeableProduct(String alias) {
        this(DSL.name(alias), RESERVATION_CHARGEABLE_PRODUCT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product</code> table reference
     */
    public ReservationChargeableProduct(Name alias) {
        this(alias, RESERVATION_CHARGEABLE_PRODUCT);
    }

    private ReservationChargeableProduct(Name alias, Table<ReservationChargeableProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationChargeableProduct(Name alias, Table<ReservationChargeableProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationChargeableProduct(Table<O> child, ForeignKey<O, ReservationChargeableProductRecord> key) {
        super(child, key, RESERVATION_CHARGEABLE_PRODUCT);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_CHARGEABLE_PRODUCT_PK_RESERVATION_CHARGEABLE_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationChargeableProductRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_CHARGEABLE_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationChargeableProductRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_CHARGEABLE_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationChargeableProductRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationChargeableProductRecord>>asList(Keys.PK_RESERVATION_CHARGEABLE_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProduct as(String alias) {
        return new ReservationChargeableProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProduct as(Name alias) {
        return new ReservationChargeableProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationChargeableProduct rename(String name) {
        return new ReservationChargeableProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationChargeableProduct rename(Name name) {
        return new ReservationChargeableProduct(name, null);
    }
}
