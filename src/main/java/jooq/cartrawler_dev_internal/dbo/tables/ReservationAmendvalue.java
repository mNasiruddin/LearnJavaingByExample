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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationAmendvalueRecord;

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
public class ReservationAmendvalue extends TableImpl<ReservationAmendvalueRecord> {

    private static final long serialVersionUID = -618596285;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_amendvalue</code>
     */
    public static final ReservationAmendvalue RESERVATION_AMENDVALUE = new ReservationAmendvalue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationAmendvalueRecord> getRecordType() {
        return ReservationAmendvalueRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amendvalue.id</code>.
     */
    public final TableField<ReservationAmendvalueRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amendvalue.fk_amend</code>.
     */
    public final TableField<ReservationAmendvalueRecord, Integer> FK_AMEND = createField("fk_amend", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amendvalue.value_type</code>.
     */
    public final TableField<ReservationAmendvalueRecord, Integer> VALUE_TYPE = createField("value_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amendvalue.new_value</code>.
     */
    public final TableField<ReservationAmendvalueRecord, String> NEW_VALUE = createField("new_value", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amendvalue.old_value</code>.
     */
    public final TableField<ReservationAmendvalueRecord, String> OLD_VALUE = createField("old_value", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_amendvalue</code> table reference
     */
    public ReservationAmendvalue() {
        this(DSL.name("reservation_amendvalue"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_amendvalue</code> table reference
     */
    public ReservationAmendvalue(String alias) {
        this(DSL.name(alias), RESERVATION_AMENDVALUE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_amendvalue</code> table reference
     */
    public ReservationAmendvalue(Name alias) {
        this(alias, RESERVATION_AMENDVALUE);
    }

    private ReservationAmendvalue(Name alias, Table<ReservationAmendvalueRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationAmendvalue(Name alias, Table<ReservationAmendvalueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationAmendvalue(Table<O> child, ForeignKey<O, ReservationAmendvalueRecord> key) {
        super(child, key, RESERVATION_AMENDVALUE);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_AMENDVALUE_PK_RESERVATION_AMENDVALUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationAmendvalueRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_AMENDVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationAmendvalueRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_AMENDVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationAmendvalueRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationAmendvalueRecord>>asList(Keys.PK_RESERVATION_AMENDVALUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendvalue as(String alias) {
        return new ReservationAmendvalue(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendvalue as(Name alias) {
        return new ReservationAmendvalue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationAmendvalue rename(String name) {
        return new ReservationAmendvalue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationAmendvalue rename(Name name) {
        return new ReservationAmendvalue(name, null);
    }
}
