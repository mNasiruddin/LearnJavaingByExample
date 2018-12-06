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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationConditions_2024Record;

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
public class ReservationConditions_2024 extends TableImpl<ReservationConditions_2024Record> {

    private static final long serialVersionUID = -672641009;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024</code>
     */
    public static final ReservationConditions_2024 RESERVATION_CONDITIONS_2024 = new ReservationConditions_2024();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationConditions_2024Record> getRecordType() {
        return ReservationConditions_2024Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024.id</code>.
     */
    public final TableField<ReservationConditions_2024Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024.fk_reservation</code>.
     */
    public final TableField<ReservationConditions_2024Record, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024.order</code>.
     */
    public final TableField<ReservationConditions_2024Record, Integer> ORDER = createField("order", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024.summary</code>.
     */
    public final TableField<ReservationConditions_2024Record, Boolean> SUMMARY = createField("summary", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024.lang</code>.
     */
    public final TableField<ReservationConditions_2024Record, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024.titleHash</code>.
     */
    public final TableField<ReservationConditions_2024Record, String> TITLEHASH = createField("titleHash", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024.textHash</code>.
     */
    public final TableField<ReservationConditions_2024Record, String> TEXTHASH = createField("textHash", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024.titleNameId</code>.
     */
    public final TableField<ReservationConditions_2024Record, Integer> TITLENAMEID = createField("titleNameId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024</code> table reference
     */
    public ReservationConditions_2024() {
        this(DSL.name("reservation_conditions_2024"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024</code> table reference
     */
    public ReservationConditions_2024(String alias) {
        this(DSL.name(alias), RESERVATION_CONDITIONS_2024);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_conditions_2024</code> table reference
     */
    public ReservationConditions_2024(Name alias) {
        this(alias, RESERVATION_CONDITIONS_2024);
    }

    private ReservationConditions_2024(Name alias, Table<ReservationConditions_2024Record> aliased) {
        this(alias, aliased, null);
    }

    private ReservationConditions_2024(Name alias, Table<ReservationConditions_2024Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationConditions_2024(Table<O> child, ForeignKey<O, ReservationConditions_2024Record> key) {
        super(child, key, RESERVATION_CONDITIONS_2024);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_CONDITIONS_2024_FKRES, Indexes.RESERVATION_CONDITIONS_2024_IDX_TITLEHASH, Indexes.RESERVATION_CONDITIONS_2024_PK_RESERVATION_CONDITIONS_2024);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationConditions_2024Record, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_CONDITIONS_2024;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationConditions_2024Record> getPrimaryKey() {
        return Keys.PK_RESERVATION_CONDITIONS_2024;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationConditions_2024Record>> getKeys() {
        return Arrays.<UniqueKey<ReservationConditions_2024Record>>asList(Keys.PK_RESERVATION_CONDITIONS_2024);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2024 as(String alias) {
        return new ReservationConditions_2024(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2024 as(Name alias) {
        return new ReservationConditions_2024(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConditions_2024 rename(String name) {
        return new ReservationConditions_2024(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConditions_2024 rename(Name name) {
        return new ReservationConditions_2024(name, null);
    }
}
