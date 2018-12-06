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
import jooq.cartrawler_dev_internal.dbo.tables.records.GeneratedopeninghoursfordcrobotRecord;

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
public class Generatedopeninghoursfordcrobot extends TableImpl<GeneratedopeninghoursfordcrobotRecord> {

    private static final long serialVersionUID = -799219398;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot</code>
     */
    public static final Generatedopeninghoursfordcrobot GENERATEDOPENINGHOURSFORDCROBOT = new Generatedopeninghoursfordcrobot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GeneratedopeninghoursfordcrobotRecord> getRecordType() {
        return GeneratedopeninghoursfordcrobotRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot.id</code>.
     */
    public final TableField<GeneratedopeninghoursfordcrobotRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot.agent</code>.
     */
    public final TableField<GeneratedopeninghoursfordcrobotRecord, Integer> AGENT = createField("agent", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot.location</code>.
     */
    public final TableField<GeneratedopeninghoursfordcrobotRecord, Integer> LOCATION = createField("location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot.dow</code>.
     */
    public final TableField<GeneratedopeninghoursfordcrobotRecord, Integer> DOW = createField("dow", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot.open</code>.
     */
    public final TableField<GeneratedopeninghoursfordcrobotRecord, Integer> OPEN = createField("open", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot.close</code>.
     */
    public final TableField<GeneratedopeninghoursfordcrobotRecord, Integer> CLOSE = createField("close", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot</code> table reference
     */
    public Generatedopeninghoursfordcrobot() {
        this(DSL.name("generatedOpeningHoursForDCRobot"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot</code> table reference
     */
    public Generatedopeninghoursfordcrobot(String alias) {
        this(DSL.name(alias), GENERATEDOPENINGHOURSFORDCROBOT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.generatedOpeningHoursForDCRobot</code> table reference
     */
    public Generatedopeninghoursfordcrobot(Name alias) {
        this(alias, GENERATEDOPENINGHOURSFORDCROBOT);
    }

    private Generatedopeninghoursfordcrobot(Name alias, Table<GeneratedopeninghoursfordcrobotRecord> aliased) {
        this(alias, aliased, null);
    }

    private Generatedopeninghoursfordcrobot(Name alias, Table<GeneratedopeninghoursfordcrobotRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Generatedopeninghoursfordcrobot(Table<O> child, ForeignKey<O, GeneratedopeninghoursfordcrobotRecord> key) {
        super(child, key, GENERATEDOPENINGHOURSFORDCROBOT);
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
        return Arrays.<Index>asList(Indexes.GENERATEDOPENINGHOURSFORDCROBOT_PK_GENERATEDOPENINGHOURSFORDCROBOT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GeneratedopeninghoursfordcrobotRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GENERATEDOPENINGHOURSFORDCROBOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GeneratedopeninghoursfordcrobotRecord> getPrimaryKey() {
        return Keys.PK_GENERATEDOPENINGHOURSFORDCROBOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GeneratedopeninghoursfordcrobotRecord>> getKeys() {
        return Arrays.<UniqueKey<GeneratedopeninghoursfordcrobotRecord>>asList(Keys.PK_GENERATEDOPENINGHOURSFORDCROBOT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Generatedopeninghoursfordcrobot as(String alias) {
        return new Generatedopeninghoursfordcrobot(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Generatedopeninghoursfordcrobot as(Name alias) {
        return new Generatedopeninghoursfordcrobot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Generatedopeninghoursfordcrobot rename(String name) {
        return new Generatedopeninghoursfordcrobot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Generatedopeninghoursfordcrobot rename(Name name) {
        return new Generatedopeninghoursfordcrobot(name, null);
    }
}
