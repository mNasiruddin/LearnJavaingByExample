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
import jooq.cartrawler_dev_internal.dbo.tables.records.OnlinestopsaleconfigRecord;

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
public class Onlinestopsaleconfig extends TableImpl<OnlinestopsaleconfigRecord> {

    private static final long serialVersionUID = 1425593847;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig</code>
     */
    public static final Onlinestopsaleconfig ONLINESTOPSALECONFIG = new Onlinestopsaleconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OnlinestopsaleconfigRecord> getRecordType() {
        return OnlinestopsaleconfigRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.guid</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.car_agent_id</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, Long> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.currency</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.time_zone_id</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> TIME_ZONE_ID = createField("time_zone_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.separator</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> SEPARATOR = createField("separator", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.money_separator</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> MONEY_SEPARATOR = createField("money_separator", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.rate_code</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, Boolean> RATE_CODE = createField("rate_code", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.protocol</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.user_id</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.password</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.prod_url</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> PROD_URL = createField("prod_url", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.file_name</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.weekend_pickup</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> WEEKEND_PICKUP = createField("weekend_pickup", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.weekend_return</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> WEEKEND_RETURN = createField("weekend_return", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.car_group_match</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> CAR_GROUP_MATCH = createField("car_group_match", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.isActive</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, Boolean> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.config_match_kind</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> CONFIG_MATCH_KIND = createField("config_match_kind", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.config_match</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> CONFIG_MATCH = createField("config_match", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.CreatedDate</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, Long> CREATEDDATE = createField("CreatedDate", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.lastReadTime</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, Long> LASTREADTIME = createField("lastReadTime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.lastReadStatus</code>.
     */
    public final TableField<OnlinestopsaleconfigRecord, String> LASTREADSTATUS = createField("lastReadStatus", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig</code> table reference
     */
    public Onlinestopsaleconfig() {
        this(DSL.name("OnlineStopSaleConfig"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig</code> table reference
     */
    public Onlinestopsaleconfig(String alias) {
        this(DSL.name(alias), ONLINESTOPSALECONFIG);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig</code> table reference
     */
    public Onlinestopsaleconfig(Name alias) {
        this(alias, ONLINESTOPSALECONFIG);
    }

    private Onlinestopsaleconfig(Name alias, Table<OnlinestopsaleconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private Onlinestopsaleconfig(Name alias, Table<OnlinestopsaleconfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Onlinestopsaleconfig(Table<O> child, ForeignKey<O, OnlinestopsaleconfigRecord> key) {
        super(child, key, ONLINESTOPSALECONFIG);
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
        return Arrays.<Index>asList(Indexes.ONLINESTOPSALECONFIG_PK_ONLINESTOPSALECONFIG, Indexes.ONLINESTOPSALECONFIG_PK_ONLINESTOPSALECONFIG_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OnlinestopsaleconfigRecord> getPrimaryKey() {
        return Keys.PK_ONLINESTOPSALECONFIG_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OnlinestopsaleconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<OnlinestopsaleconfigRecord>>asList(Keys.PK_ONLINESTOPSALECONFIG_1, Keys.PK_ONLINESTOPSALECONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onlinestopsaleconfig as(String alias) {
        return new Onlinestopsaleconfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onlinestopsaleconfig as(Name alias) {
        return new Onlinestopsaleconfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Onlinestopsaleconfig rename(String name) {
        return new Onlinestopsaleconfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Onlinestopsaleconfig rename(Name name) {
        return new Onlinestopsaleconfig(name, null);
    }
}
