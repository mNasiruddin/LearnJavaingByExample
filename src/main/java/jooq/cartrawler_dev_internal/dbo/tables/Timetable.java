/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.TimetableRecord;

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
public class Timetable extends TableImpl<TimetableRecord> {

    private static final long serialVersionUID = -979076555;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.timetable</code>
     */
    public static final Timetable TIMETABLE = new Timetable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TimetableRecord> getRecordType() {
        return TimetableRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.timetable.guid</code>.
     */
    public final TableField<TimetableRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.timetable.id</code>.
     */
    public final TableField<TimetableRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.timetable.name</code>.
     */
    public final TableField<TimetableRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.timetable.negativeFilter</code>.
     */
    public final TableField<TimetableRecord, Boolean> NEGATIVEFILTER = createField("negativeFilter", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.timetable.from</code>.
     */
    public final TableField<TimetableRecord, Timestamp> FROM = createField("from", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.timetable.to</code>.
     */
    public final TableField<TimetableRecord, Timestamp> TO = createField("to", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.timetable</code> table reference
     */
    public Timetable() {
        this(DSL.name("timetable"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.timetable</code> table reference
     */
    public Timetable(String alias) {
        this(DSL.name(alias), TIMETABLE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.timetable</code> table reference
     */
    public Timetable(Name alias) {
        this(alias, TIMETABLE);
    }

    private Timetable(Name alias, Table<TimetableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Timetable(Name alias, Table<TimetableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Timetable(Table<O> child, ForeignKey<O, TimetableRecord> key) {
        super(child, key, TIMETABLE);
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
        return Arrays.<Index>asList(Indexes.TIMETABLE_IX_TIMETABLE, Indexes.TIMETABLE_PK_TIMETABLE, Indexes.TIMETABLE_PK_TIMETABLE_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TimetableRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TIMETABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TimetableRecord> getPrimaryKey() {
        return Keys.PK_TIMETABLE_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TimetableRecord>> getKeys() {
        return Arrays.<UniqueKey<TimetableRecord>>asList(Keys.PK_TIMETABLE_1, Keys.PK_TIMETABLE, Keys.IX_TIMETABLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timetable as(String alias) {
        return new Timetable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timetable as(Name alias) {
        return new Timetable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Timetable rename(String name) {
        return new Timetable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Timetable rename(Name name) {
        return new Timetable(name, null);
    }
}
