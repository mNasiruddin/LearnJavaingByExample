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
import jooq.cartrawler_dev_internal.dbo.tables.records.AgencyCalendarRecord;

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
public class AgencyCalendar extends TableImpl<AgencyCalendarRecord> {

    private static final long serialVersionUID = 547824974;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Agency_Calendar</code>
     */
    public static final AgencyCalendar AGENCY_CALENDAR = new AgencyCalendar();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AgencyCalendarRecord> getRecordType() {
        return AgencyCalendarRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Calendar.Agency_ID</code>.
     */
    public final TableField<AgencyCalendarRecord, Integer> AGENCY_ID = createField("Agency_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Calendar.Day</code>.
     */
    public final TableField<AgencyCalendarRecord, Integer> DAY = createField("Day", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Calendar.Month</code>.
     */
    public final TableField<AgencyCalendarRecord, Integer> MONTH = createField("Month", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Calendar.Season_ID</code>.
     */
    public final TableField<AgencyCalendarRecord, String> SEASON_ID = createField("Season_ID", org.jooq.impl.SQLDataType.CHAR(1).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Agency_Calendar</code> table reference
     */
    public AgencyCalendar() {
        this(DSL.name("Agency_Calendar"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Agency_Calendar</code> table reference
     */
    public AgencyCalendar(String alias) {
        this(DSL.name(alias), AGENCY_CALENDAR);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Agency_Calendar</code> table reference
     */
    public AgencyCalendar(Name alias) {
        this(alias, AGENCY_CALENDAR);
    }

    private AgencyCalendar(Name alias, Table<AgencyCalendarRecord> aliased) {
        this(alias, aliased, null);
    }

    private AgencyCalendar(Name alias, Table<AgencyCalendarRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AgencyCalendar(Table<O> child, ForeignKey<O, AgencyCalendarRecord> key) {
        super(child, key, AGENCY_CALENDAR);
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
        return Arrays.<Index>asList(Indexes.AGENCY_CALENDAR_AGENCY_CALENDAR_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AgencyCalendarRecord> getPrimaryKey() {
        return Keys.AGENCY_CALENDAR_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AgencyCalendarRecord>> getKeys() {
        return Arrays.<UniqueKey<AgencyCalendarRecord>>asList(Keys.AGENCY_CALENDAR_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyCalendar as(String alias) {
        return new AgencyCalendar(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyCalendar as(Name alias) {
        return new AgencyCalendar(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AgencyCalendar rename(String name) {
        return new AgencyCalendar(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AgencyCalendar rename(Name name) {
        return new AgencyCalendar(name, null);
    }
}
