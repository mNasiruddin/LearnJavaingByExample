/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Date;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.LegalagreementRecord;

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
public class Legalagreement extends TableImpl<LegalagreementRecord> {

    private static final long serialVersionUID = 160541561;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.LegalAgreement</code>
     */
    public static final Legalagreement LEGALAGREEMENT = new Legalagreement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LegalagreementRecord> getRecordType() {
        return LegalagreementRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.id</code>.
     */
    public final TableField<LegalagreementRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.fk_ax</code>.
     */
    public final TableField<LegalagreementRecord, Integer> FK_AX = createField("fk_ax", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.la_name</code>.
     */
    public final TableField<LegalagreementRecord, String> LA_NAME = createField("la_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.la_long_name</code>.
     */
    public final TableField<LegalagreementRecord, String> LA_LONG_NAME = createField("la_long_name", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.fk_suppliers</code>.
     */
    public final TableField<LegalagreementRecord, Integer> FK_SUPPLIERS = createField("fk_suppliers", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.provider_type</code>.
     */
    public final TableField<LegalagreementRecord, Integer> PROVIDER_TYPE = createField("provider_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.provider_id</code>.
     */
    public final TableField<LegalagreementRecord, Integer> PROVIDER_ID = createField("provider_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.ax_owner</code>.
     */
    public final TableField<LegalagreementRecord, String> AX_OWNER = createField("ax_owner", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.creation_date</code>.
     */
    public final TableField<LegalagreementRecord, Date> CREATION_DATE = createField("creation_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.start_date</code>.
     */
    public final TableField<LegalagreementRecord, Date> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.end_date</code>.
     */
    public final TableField<LegalagreementRecord, Date> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.company_name</code>.
     */
    public final TableField<LegalagreementRecord, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.paym_term_cust</code>.
     */
    public final TableField<LegalagreementRecord, String> PAYM_TERM_CUST = createField("paym_term_cust", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.paym_term_vend</code>.
     */
    public final TableField<LegalagreementRecord, String> PAYM_TERM_VEND = createField("paym_term_vend", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.noshow_status</code>.
     */
    public final TableField<LegalagreementRecord, Boolean> NOSHOW_STATUS = createField("noshow_status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.chargeback_status</code>.
     */
    public final TableField<LegalagreementRecord, Boolean> CHARGEBACK_STATUS = createField("chargeback_status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.cancellation_status</code>.
     */
    public final TableField<LegalagreementRecord, Boolean> CANCELLATION_STATUS = createField("cancellation_status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.rebate_status</code>.
     */
    public final TableField<LegalagreementRecord, Boolean> REBATE_STATUS = createField("rebate_status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LegalAgreement.commission_status</code>.
     */
    public final TableField<LegalagreementRecord, Boolean> COMMISSION_STATUS = createField("commission_status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.LegalAgreement</code> table reference
     */
    public Legalagreement() {
        this(DSL.name("LegalAgreement"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.LegalAgreement</code> table reference
     */
    public Legalagreement(String alias) {
        this(DSL.name(alias), LEGALAGREEMENT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.LegalAgreement</code> table reference
     */
    public Legalagreement(Name alias) {
        this(alias, LEGALAGREEMENT);
    }

    private Legalagreement(Name alias, Table<LegalagreementRecord> aliased) {
        this(alias, aliased, null);
    }

    private Legalagreement(Name alias, Table<LegalagreementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Legalagreement(Table<O> child, ForeignKey<O, LegalagreementRecord> key) {
        super(child, key, LEGALAGREEMENT);
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
    public Identity<LegalagreementRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LEGALAGREEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Legalagreement as(String alias) {
        return new Legalagreement(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Legalagreement as(Name alias) {
        return new Legalagreement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Legalagreement rename(String name) {
        return new Legalagreement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Legalagreement rename(Name name) {
        return new Legalagreement(name, null);
    }
}