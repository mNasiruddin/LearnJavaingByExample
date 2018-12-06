/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.OnlineratesheetconfigBak200818Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class OnlineratesheetconfigBak200818 extends TableImpl<OnlineratesheetconfigBak200818Record> {

    private static final long serialVersionUID = -2038191373;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818</code>
     */
    public static final OnlineratesheetconfigBak200818 ONLINERATESHEETCONFIG_BAK200818 = new OnlineratesheetconfigBak200818();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OnlineratesheetconfigBak200818Record> getRecordType() {
        return OnlineratesheetconfigBak200818Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.guid</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.car_agent_id</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, Long> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.currency</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.time_zone_id</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> TIME_ZONE_ID = createField("time_zone_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.separator</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> SEPARATOR = createField("separator", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.money_separator</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> MONEY_SEPARATOR = createField("money_separator", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.rate_code</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, Boolean> RATE_CODE = createField("rate_code", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.protocol</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.user_id</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.password</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.prod_url</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> PROD_URL = createField("prod_url", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.file_name</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.weekend_pickup</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> WEEKEND_PICKUP = createField("weekend_pickup", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.weekend_return</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> WEEKEND_RETURN = createField("weekend_return", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.car_group_match</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> CAR_GROUP_MATCH = createField("car_group_match", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.isActive</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, Boolean> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.config_match_kind</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> CONFIG_MATCH_KIND = createField("config_match_kind", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.config_match</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> CONFIG_MATCH = createField("config_match", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.CreatedDate</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, Long> CREATEDDATE = createField("CreatedDate", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.UseOldBookingDC</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, Boolean> USEOLDBOOKINGDC = createField("UseOldBookingDC", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.lastReadTime</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, Long> LASTREADTIME = createField("lastReadTime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.lastReadStatus</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, String> LASTREADSTATUS = createField("lastReadStatus", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818.is_retail</code>.
     */
    public final TableField<OnlineratesheetconfigBak200818Record, Boolean> IS_RETAIL = createField("is_retail", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818</code> table reference
     */
    public OnlineratesheetconfigBak200818() {
        this(DSL.name("OnlineRateSheetConfig_bak200818"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818</code> table reference
     */
    public OnlineratesheetconfigBak200818(String alias) {
        this(DSL.name(alias), ONLINERATESHEETCONFIG_BAK200818);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineRateSheetConfig_bak200818</code> table reference
     */
    public OnlineratesheetconfigBak200818(Name alias) {
        this(alias, ONLINERATESHEETCONFIG_BAK200818);
    }

    private OnlineratesheetconfigBak200818(Name alias, Table<OnlineratesheetconfigBak200818Record> aliased) {
        this(alias, aliased, null);
    }

    private OnlineratesheetconfigBak200818(Name alias, Table<OnlineratesheetconfigBak200818Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OnlineratesheetconfigBak200818(Table<O> child, ForeignKey<O, OnlineratesheetconfigBak200818Record> key) {
        super(child, key, ONLINERATESHEETCONFIG_BAK200818);
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
    public OnlineratesheetconfigBak200818 as(String alias) {
        return new OnlineratesheetconfigBak200818(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheetconfigBak200818 as(Name alias) {
        return new OnlineratesheetconfigBak200818(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OnlineratesheetconfigBak200818 rename(String name) {
        return new OnlineratesheetconfigBak200818(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OnlineratesheetconfigBak200818 rename(Name name) {
        return new OnlineratesheetconfigBak200818(name, null);
    }
}
