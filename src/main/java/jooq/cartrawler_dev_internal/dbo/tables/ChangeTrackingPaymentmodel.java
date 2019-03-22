/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ChangeTrackingPaymentmodelRecord;

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
public class ChangeTrackingPaymentmodel extends TableImpl<ChangeTrackingPaymentmodelRecord> {

    private static final long serialVersionUID = -1160458170;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel</code>
     */
    public static final ChangeTrackingPaymentmodel CHANGE_TRACKING_PAYMENTMODEL = new ChangeTrackingPaymentmodel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChangeTrackingPaymentmodelRecord> getRecordType() {
        return ChangeTrackingPaymentmodelRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel.pk_id</code>.
     */
    public final TableField<ChangeTrackingPaymentmodelRecord, Long> PK_ID = createField("pk_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel.SYS_CHANGE_VERSION</code>.
     */
    public final TableField<ChangeTrackingPaymentmodelRecord, Long> SYS_CHANGE_VERSION = createField("SYS_CHANGE_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public final TableField<ChangeTrackingPaymentmodelRecord, Long> SYS_CHANGE_CREATION_VERSION = createField("SYS_CHANGE_CREATION_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel.SYS_CHANGE_OPERATION</code>.
     */
    public final TableField<ChangeTrackingPaymentmodelRecord, String> SYS_CHANGE_OPERATION = createField("SYS_CHANGE_OPERATION", org.jooq.impl.SQLDataType.NCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel.SYS_CHANGE_COLUMNS</code>.
     */
    public final TableField<ChangeTrackingPaymentmodelRecord, byte[]> SYS_CHANGE_COLUMNS = createField("SYS_CHANGE_COLUMNS", org.jooq.impl.SQLDataType.VARBINARY(4100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel.SYS_CHANGE_CONTEXT</code>.
     */
    public final TableField<ChangeTrackingPaymentmodelRecord, byte[]> SYS_CHANGE_CONTEXT = createField("SYS_CHANGE_CONTEXT", org.jooq.impl.SQLDataType.VARBINARY(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel.Ref</code>.
     */
    public final TableField<ChangeTrackingPaymentmodelRecord, Integer> REF = createField("Ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel</code> table reference
     */
    public ChangeTrackingPaymentmodel() {
        this(DSL.name("change_tracking_PaymentModel"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel</code> table reference
     */
    public ChangeTrackingPaymentmodel(String alias) {
        this(DSL.name(alias), CHANGE_TRACKING_PAYMENTMODEL);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.change_tracking_PaymentModel</code> table reference
     */
    public ChangeTrackingPaymentmodel(Name alias) {
        this(alias, CHANGE_TRACKING_PAYMENTMODEL);
    }

    private ChangeTrackingPaymentmodel(Name alias, Table<ChangeTrackingPaymentmodelRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChangeTrackingPaymentmodel(Name alias, Table<ChangeTrackingPaymentmodelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ChangeTrackingPaymentmodel(Table<O> child, ForeignKey<O, ChangeTrackingPaymentmodelRecord> key) {
        super(child, key, CHANGE_TRACKING_PAYMENTMODEL);
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
        return Arrays.<Index>asList(Indexes.CHANGE_TRACKING_PAYMENTMODEL_PK_PAYMENTMODEL1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ChangeTrackingPaymentmodelRecord, Long> getIdentity() {
        return Keys.IDENTITY_CHANGE_TRACKING_PAYMENTMODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChangeTrackingPaymentmodelRecord> getPrimaryKey() {
        return Keys.PK_PAYMENTMODEL1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChangeTrackingPaymentmodelRecord>> getKeys() {
        return Arrays.<UniqueKey<ChangeTrackingPaymentmodelRecord>>asList(Keys.PK_PAYMENTMODEL1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeTrackingPaymentmodel as(String alias) {
        return new ChangeTrackingPaymentmodel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeTrackingPaymentmodel as(Name alias) {
        return new ChangeTrackingPaymentmodel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeTrackingPaymentmodel rename(String name) {
        return new ChangeTrackingPaymentmodel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeTrackingPaymentmodel rename(Name name) {
        return new ChangeTrackingPaymentmodel(name, null);
    }
}