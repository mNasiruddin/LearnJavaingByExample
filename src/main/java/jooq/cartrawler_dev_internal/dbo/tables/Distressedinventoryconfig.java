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
import jooq.cartrawler_dev_internal.dbo.tables.records.DistressedinventoryconfigRecord;

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
public class Distressedinventoryconfig extends TableImpl<DistressedinventoryconfigRecord> {

    private static final long serialVersionUID = -1271424094;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig</code>
     */
    public static final Distressedinventoryconfig DISTRESSEDINVENTORYCONFIG = new Distressedinventoryconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DistressedinventoryconfigRecord> getRecordType() {
        return DistressedinventoryconfigRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.guid</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.car_agent_id</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, Long> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.separator</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> SEPARATOR = createField("separator", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.protocol</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.user_id</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.password</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.prod_url</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> PROD_URL = createField("prod_url", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.file_name</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.isActive</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, Boolean> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.CreatedDate</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, Long> CREATEDDATE = createField("CreatedDate", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.lastReadTime</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, Long> LASTREADTIME = createField("lastReadTime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.lastReadStatus</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> LASTREADSTATUS = createField("lastReadStatus", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.Type</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> TYPE = createField("Type", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.sendReport</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, Boolean> SENDREPORT = createField("sendReport", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.reportEmail</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> REPORTEMAIL = createField("reportEmail", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig.car_group_match</code>.
     */
    public final TableField<DistressedinventoryconfigRecord, String> CAR_GROUP_MATCH = createField("car_group_match", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig</code> table reference
     */
    public Distressedinventoryconfig() {
        this(DSL.name("DistressedInventoryConfig"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig</code> table reference
     */
    public Distressedinventoryconfig(String alias) {
        this(DSL.name(alias), DISTRESSEDINVENTORYCONFIG);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.DistressedInventoryConfig</code> table reference
     */
    public Distressedinventoryconfig(Name alias) {
        this(alias, DISTRESSEDINVENTORYCONFIG);
    }

    private Distressedinventoryconfig(Name alias, Table<DistressedinventoryconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private Distressedinventoryconfig(Name alias, Table<DistressedinventoryconfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Distressedinventoryconfig(Table<O> child, ForeignKey<O, DistressedinventoryconfigRecord> key) {
        super(child, key, DISTRESSEDINVENTORYCONFIG);
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
        return Arrays.<Index>asList(Indexes.DISTRESSEDINVENTORYCONFIG_PK_DISTRESSEDINVENTORYCONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DistressedinventoryconfigRecord> getPrimaryKey() {
        return Keys.PK_DISTRESSEDINVENTORYCONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DistressedinventoryconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<DistressedinventoryconfigRecord>>asList(Keys.PK_DISTRESSEDINVENTORYCONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Distressedinventoryconfig as(String alias) {
        return new Distressedinventoryconfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Distressedinventoryconfig as(Name alias) {
        return new Distressedinventoryconfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Distressedinventoryconfig rename(String name) {
        return new Distressedinventoryconfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Distressedinventoryconfig rename(Name name) {
        return new Distressedinventoryconfig(name, null);
    }
}
