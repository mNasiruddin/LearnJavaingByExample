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
import jooq.cartrawler_dev_internal.dbo.tables.records.HolidaysRecord;

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
public class Holidays extends TableImpl<HolidaysRecord> {

    private static final long serialVersionUID = 656729660;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.holidays</code>
     */
    public static final Holidays HOLIDAYS = new Holidays();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HolidaysRecord> getRecordType() {
        return HolidaysRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.holidays.guid</code>.
     */
    public final TableField<HolidaysRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.holidays.ISO Code</code>.
     */
    public final TableField<HolidaysRecord, String> ISO_CODE = createField("ISO Code", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.holidays.Country Name</code>.
     */
    public final TableField<HolidaysRecord, String> COUNTRY_NAME = createField("Country Name", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.holidays.Holiday Date</code>.
     */
    public final TableField<HolidaysRecord, Timestamp> HOLIDAY_DATE = createField("Holiday Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.holidays.Holiday ID</code>.
     */
    public final TableField<HolidaysRecord, Double> HOLIDAY_ID = createField("Holiday ID", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.holidays.Holiday Name</code>.
     */
    public final TableField<HolidaysRecord, String> HOLIDAY_NAME = createField("Holiday Name", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.holidays.Holiday Observance</code>.
     */
    public final TableField<HolidaysRecord, String> HOLIDAY_OBSERVANCE = createField("Holiday Observance", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.holidays.Calendar</code>.
     */
    public final TableField<HolidaysRecord, String> CALENDAR = createField("Calendar", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.holidays.Rule Last Updated</code>.
     */
    public final TableField<HolidaysRecord, Timestamp> RULE_LAST_UPDATED = createField("Rule Last Updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.holidays</code> table reference
     */
    public Holidays() {
        this(DSL.name("holidays"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.holidays</code> table reference
     */
    public Holidays(String alias) {
        this(DSL.name(alias), HOLIDAYS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.holidays</code> table reference
     */
    public Holidays(Name alias) {
        this(alias, HOLIDAYS);
    }

    private Holidays(Name alias, Table<HolidaysRecord> aliased) {
        this(alias, aliased, null);
    }

    private Holidays(Name alias, Table<HolidaysRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Holidays(Table<O> child, ForeignKey<O, HolidaysRecord> key) {
        super(child, key, HOLIDAYS);
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
        return Arrays.<Index>asList(Indexes.HOLIDAYS_PK_HOLIDAYS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HolidaysRecord> getPrimaryKey() {
        return Keys.PK_HOLIDAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HolidaysRecord>> getKeys() {
        return Arrays.<UniqueKey<HolidaysRecord>>asList(Keys.PK_HOLIDAYS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Holidays as(String alias) {
        return new Holidays(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Holidays as(Name alias) {
        return new Holidays(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Holidays rename(String name) {
        return new Holidays(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Holidays rename(Name name) {
        return new Holidays(name, null);
    }
}
