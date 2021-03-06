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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationCompanyInfoRecord;

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
public class ReservationCompanyInfo extends TableImpl<ReservationCompanyInfoRecord> {

    private static final long serialVersionUID = -1933269902;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Reservation_company_info</code>
     */
    public static final ReservationCompanyInfo RESERVATION_COMPANY_INFO = new ReservationCompanyInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationCompanyInfoRecord> getRecordType() {
        return ReservationCompanyInfoRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_company_info.ref</code>.
     */
    public final TableField<ReservationCompanyInfoRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_company_info.order_id</code>.
     */
    public final TableField<ReservationCompanyInfoRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(65), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_company_info.company_name</code>.
     */
    public final TableField<ReservationCompanyInfoRecord, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_company_info.vat</code>.
     */
    public final TableField<ReservationCompanyInfoRecord, String> VAT = createField("vat", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Reservation_company_info</code> table reference
     */
    public ReservationCompanyInfo() {
        this(DSL.name("Reservation_company_info"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Reservation_company_info</code> table reference
     */
    public ReservationCompanyInfo(String alias) {
        this(DSL.name(alias), RESERVATION_COMPANY_INFO);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Reservation_company_info</code> table reference
     */
    public ReservationCompanyInfo(Name alias) {
        this(alias, RESERVATION_COMPANY_INFO);
    }

    private ReservationCompanyInfo(Name alias, Table<ReservationCompanyInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationCompanyInfo(Name alias, Table<ReservationCompanyInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationCompanyInfo(Table<O> child, ForeignKey<O, ReservationCompanyInfoRecord> key) {
        super(child, key, RESERVATION_COMPANY_INFO);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_COMPANY_INFO_PK_RESERVATION_COMPANY_INFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationCompanyInfoRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_COMPANY_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationCompanyInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationCompanyInfoRecord>>asList(Keys.PK_RESERVATION_COMPANY_INFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCompanyInfo as(String alias) {
        return new ReservationCompanyInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCompanyInfo as(Name alias) {
        return new ReservationCompanyInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationCompanyInfo rename(String name) {
        return new ReservationCompanyInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationCompanyInfo rename(Name name) {
        return new ReservationCompanyInfo(name, null);
    }
}
