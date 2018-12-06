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
import jooq.cartrawler_dev_internal.dbo.tables.records.OnlineratesheetTestRecord;

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
public class OnlineratesheetTest extends TableImpl<OnlineratesheetTestRecord> {

    private static final long serialVersionUID = -833751586;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test</code>
     */
    public static final OnlineratesheetTest ONLINERATESHEET_TEST = new OnlineratesheetTest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OnlineratesheetTestRecord> getRecordType() {
        return OnlineratesheetTestRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.id</code>.
     */
    public final TableField<OnlineratesheetTestRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.rate_id</code>.
     */
    public final TableField<OnlineratesheetTestRecord, Long> RATE_ID = createField("rate_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.car_agent_id</code>.
     */
    public final TableField<OnlineratesheetTestRecord, Long> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.SIPP</code>.
     */
    public final TableField<OnlineratesheetTestRecord, String> SIPP = createField("SIPP", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.rate_code_str</code>.
     */
    public final TableField<OnlineratesheetTestRecord, String> RATE_CODE_STR = createField("rate_code_str", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.locations</code>.
     */
    public final TableField<OnlineratesheetTestRecord, String> LOCATIONS = createField("locations", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.booking_from</code>.
     */
    public final TableField<OnlineratesheetTestRecord, Long> BOOKING_FROM = createField("booking_from", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.booking_to</code>.
     */
    public final TableField<OnlineratesheetTestRecord, Long> BOOKING_TO = createField("booking_to", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.pickup_from</code>.
     */
    public final TableField<OnlineratesheetTestRecord, Long> PICKUP_FROM = createField("pickup_from", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.pickup_to</code>.
     */
    public final TableField<OnlineratesheetTestRecord, Long> PICKUP_TO = createField("pickup_to", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.priority</code>.
     */
    public final TableField<OnlineratesheetTestRecord, Short> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.rate_match</code>.
     */
    public final TableField<OnlineratesheetTestRecord, String> RATE_MATCH = createField("rate_match", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test.restriction</code>.
     */
    public final TableField<OnlineratesheetTestRecord, String> RESTRICTION = createField("restriction", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test</code> table reference
     */
    public OnlineratesheetTest() {
        this(DSL.name("OnlineRateSheet_test"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test</code> table reference
     */
    public OnlineratesheetTest(String alias) {
        this(DSL.name(alias), ONLINERATESHEET_TEST);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineRateSheet_test</code> table reference
     */
    public OnlineratesheetTest(Name alias) {
        this(alias, ONLINERATESHEET_TEST);
    }

    private OnlineratesheetTest(Name alias, Table<OnlineratesheetTestRecord> aliased) {
        this(alias, aliased, null);
    }

    private OnlineratesheetTest(Name alias, Table<OnlineratesheetTestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OnlineratesheetTest(Table<O> child, ForeignKey<O, OnlineratesheetTestRecord> key) {
        super(child, key, ONLINERATESHEET_TEST);
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
        return Arrays.<Index>asList(Indexes.ONLINERATESHEET_TEST_PK_ONLINERATESHEET_TEST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OnlineratesheetTestRecord, Long> getIdentity() {
        return Keys.IDENTITY_ONLINERATESHEET_TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OnlineratesheetTestRecord> getPrimaryKey() {
        return Keys.PK_ONLINERATESHEET_TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OnlineratesheetTestRecord>> getKeys() {
        return Arrays.<UniqueKey<OnlineratesheetTestRecord>>asList(Keys.PK_ONLINERATESHEET_TEST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTest as(String alias) {
        return new OnlineratesheetTest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetTest as(Name alias) {
        return new OnlineratesheetTest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OnlineratesheetTest rename(String name) {
        return new OnlineratesheetTest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OnlineratesheetTest rename(Name name) {
        return new OnlineratesheetTest(name, null);
    }
}
