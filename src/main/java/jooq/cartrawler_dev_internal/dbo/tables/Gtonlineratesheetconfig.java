/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.GtonlineratesheetconfigRecord;

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
public class Gtonlineratesheetconfig extends TableImpl<GtonlineratesheetconfigRecord> {

    private static final long serialVersionUID = -1186397701;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig</code>
     */
    public static final Gtonlineratesheetconfig GTONLINERATESHEETCONFIG = new Gtonlineratesheetconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GtonlineratesheetconfigRecord> getRecordType() {
        return GtonlineratesheetconfigRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.guid</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.car_agent_id</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.currency</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.time_zone_id</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> TIME_ZONE_ID = createField("time_zone_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.separator</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> SEPARATOR = createField("separator", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.money_separator</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> MONEY_SEPARATOR = createField("money_separator", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.rate_code</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, Boolean> RATE_CODE = createField("rate_code", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.protocol</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.user_id</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.password</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.prod_url</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> PROD_URL = createField("prod_url", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.file_name</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.isActive</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, Boolean> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.distance_measure</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> DISTANCE_MEASURE = createField("distance_measure", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.rate_calculation</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> RATE_CALCULATION = createField("rate_calculation", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.CreatedDate</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, Long> CREATEDDATE = createField("CreatedDate", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.lastReadTime</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, Long> LASTREADTIME = createField("lastReadTime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.lastReadStatus</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> LASTREADSTATUS = createField("lastReadStatus", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.car_group_match</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> CAR_GROUP_MATCH = createField("car_group_match", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.config_match_kind</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> CONFIG_MATCH_KIND = createField("config_match_kind", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.out_of_hours_range</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, String> OUT_OF_HOURS_RANGE = createField("out_of_hours_range", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig.out_of_hours_surcharge</code>.
     */
    public final TableField<GtonlineratesheetconfigRecord, BigDecimal> OUT_OF_HOURS_SURCHARGE = createField("out_of_hours_surcharge", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig</code> table reference
     */
    public Gtonlineratesheetconfig() {
        this(DSL.name("GTOnlineRateSheetConfig"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig</code> table reference
     */
    public Gtonlineratesheetconfig(String alias) {
        this(DSL.name(alias), GTONLINERATESHEETCONFIG);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetConfig</code> table reference
     */
    public Gtonlineratesheetconfig(Name alias) {
        this(alias, GTONLINERATESHEETCONFIG);
    }

    private Gtonlineratesheetconfig(Name alias, Table<GtonlineratesheetconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private Gtonlineratesheetconfig(Name alias, Table<GtonlineratesheetconfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Gtonlineratesheetconfig(Table<O> child, ForeignKey<O, GtonlineratesheetconfigRecord> key) {
        super(child, key, GTONLINERATESHEETCONFIG);
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
        return Arrays.<Index>asList(Indexes.GTONLINERATESHEETCONFIG_PK_GTONLINERATESHEETCONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GtonlineratesheetconfigRecord> getPrimaryKey() {
        return Keys.PK_GTONLINERATESHEETCONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GtonlineratesheetconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<GtonlineratesheetconfigRecord>>asList(Keys.PK_GTONLINERATESHEETCONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gtonlineratesheetconfig as(String alias) {
        return new Gtonlineratesheetconfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gtonlineratesheetconfig as(Name alias) {
        return new Gtonlineratesheetconfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Gtonlineratesheetconfig rename(String name) {
        return new Gtonlineratesheetconfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Gtonlineratesheetconfig rename(Name name) {
        return new Gtonlineratesheetconfig(name, null);
    }
}
