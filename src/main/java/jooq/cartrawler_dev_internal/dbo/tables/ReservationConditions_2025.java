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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationConditions_2025Record;

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
public class ReservationConditions_2025 extends TableImpl<ReservationConditions_2025Record> {

    private static final long serialVersionUID = 632958441;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025</code>
     */
    public static final ReservationConditions_2025 RESERVATION_CONDITIONS_2025 = new ReservationConditions_2025();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationConditions_2025Record> getRecordType() {
        return ReservationConditions_2025Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025.id</code>.
     */
    public final TableField<ReservationConditions_2025Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025.fk_reservation</code>.
     */
    public final TableField<ReservationConditions_2025Record, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025.order</code>.
     */
    public final TableField<ReservationConditions_2025Record, Integer> ORDER = createField("order", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025.summary</code>.
     */
    public final TableField<ReservationConditions_2025Record, Boolean> SUMMARY = createField("summary", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025.lang</code>.
     */
    public final TableField<ReservationConditions_2025Record, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025.titleHash</code>.
     */
    public final TableField<ReservationConditions_2025Record, String> TITLEHASH = createField("titleHash", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025.textHash</code>.
     */
    public final TableField<ReservationConditions_2025Record, String> TEXTHASH = createField("textHash", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025.titleNameId</code>.
     */
    public final TableField<ReservationConditions_2025Record, Integer> TITLENAMEID = createField("titleNameId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025</code> table reference
     */
    public ReservationConditions_2025() {
        this(DSL.name("reservation_conditions_2025"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025</code> table reference
     */
    public ReservationConditions_2025(String alias) {
        this(DSL.name(alias), RESERVATION_CONDITIONS_2025);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_conditions_2025</code> table reference
     */
    public ReservationConditions_2025(Name alias) {
        this(alias, RESERVATION_CONDITIONS_2025);
    }

    private ReservationConditions_2025(Name alias, Table<ReservationConditions_2025Record> aliased) {
        this(alias, aliased, null);
    }

    private ReservationConditions_2025(Name alias, Table<ReservationConditions_2025Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationConditions_2025(Table<O> child, ForeignKey<O, ReservationConditions_2025Record> key) {
        super(child, key, RESERVATION_CONDITIONS_2025);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_CONDITIONS_2025_FKRES, Indexes.RESERVATION_CONDITIONS_2025_IDX_TITLEHASH, Indexes.RESERVATION_CONDITIONS_2025_PK_RESERVATION_CONDITIONS_2025);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationConditions_2025Record, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_CONDITIONS_2025;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationConditions_2025Record> getPrimaryKey() {
        return Keys.PK_RESERVATION_CONDITIONS_2025;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationConditions_2025Record>> getKeys() {
        return Arrays.<UniqueKey<ReservationConditions_2025Record>>asList(Keys.PK_RESERVATION_CONDITIONS_2025);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2025 as(String alias) {
        return new ReservationConditions_2025(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2025 as(Name alias) {
        return new ReservationConditions_2025(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConditions_2025 rename(String name) {
        return new ReservationConditions_2025(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConditions_2025 rename(Name name) {
        return new ReservationConditions_2025(name, null);
    }
}