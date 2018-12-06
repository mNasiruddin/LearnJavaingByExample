/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.OnlineratesheetconfigRecord;

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
public class Onlineratesheetconfig extends TableImpl<OnlineratesheetconfigRecord> {

    private static final long serialVersionUID = 1138486359;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig</code>
     */
    public static final Onlineratesheetconfig ONLINERATESHEETCONFIG = new Onlineratesheetconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OnlineratesheetconfigRecord> getRecordType() {
        return OnlineratesheetconfigRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.guid</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.car_agent_id</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, Long> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.currency</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.time_zone_id</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> TIME_ZONE_ID = createField("time_zone_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.separator</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> SEPARATOR = createField("separator", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.money_separator</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> MONEY_SEPARATOR = createField("money_separator", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.rate_code</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, Boolean> RATE_CODE = createField("rate_code", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.protocol</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.user_id</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.password</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.prod_url</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> PROD_URL = createField("prod_url", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.file_name</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.weekend_pickup</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> WEEKEND_PICKUP = createField("weekend_pickup", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.weekend_return</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> WEEKEND_RETURN = createField("weekend_return", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.car_group_match</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> CAR_GROUP_MATCH = createField("car_group_match", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.isActive</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, Boolean> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.config_match_kind</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> CONFIG_MATCH_KIND = createField("config_match_kind", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.config_match</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> CONFIG_MATCH = createField("config_match", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.CreatedDate</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, Long> CREATEDDATE = createField("CreatedDate", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.UseOldBookingDC</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, Boolean> USEOLDBOOKINGDC = createField("UseOldBookingDC", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.lastReadTime</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, Long> LASTREADTIME = createField("lastReadTime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.lastReadStatus</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, String> LASTREADSTATUS = createField("lastReadStatus", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig.is_retail</code>.
     */
    public final TableField<OnlineratesheetconfigRecord, Boolean> IS_RETAIL = createField("is_retail", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig</code> table reference
     */
    public Onlineratesheetconfig() {
        this(DSL.name("OnlineRateSheetConfig"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig</code> table reference
     */
    public Onlineratesheetconfig(String alias) {
        this(DSL.name(alias), ONLINERATESHEETCONFIG);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig</code> table reference
     */
    public Onlineratesheetconfig(Name alias) {
        this(alias, ONLINERATESHEETCONFIG);
    }

    private Onlineratesheetconfig(Name alias, Table<OnlineratesheetconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private Onlineratesheetconfig(Name alias, Table<OnlineratesheetconfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Onlineratesheetconfig(Table<O> child, ForeignKey<O, OnlineratesheetconfigRecord> key) {
        super(child, key, ONLINERATESHEETCONFIG);
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
        return Arrays.<Index>asList(Indexes.ONLINERATESHEETCONFIG_PK_ONLINERATESHEETCONFIG, Indexes.ONLINERATESHEETCONFIG_PK_ONLINERATESHEETCONFIG_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OnlineratesheetconfigRecord> getPrimaryKey() {
        return Keys.PK_ONLINERATESHEETCONFIG_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OnlineratesheetconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<OnlineratesheetconfigRecord>>asList(Keys.PK_ONLINERATESHEETCONFIG_1, Keys.PK_ONLINERATESHEETCONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onlineratesheetconfig as(String alias) {
        return new Onlineratesheetconfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onlineratesheetconfig as(Name alias) {
        return new Onlineratesheetconfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Onlineratesheetconfig rename(String name) {
        return new Onlineratesheetconfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Onlineratesheetconfig rename(Name name) {
        return new Onlineratesheetconfig(name, null);
    }
}
