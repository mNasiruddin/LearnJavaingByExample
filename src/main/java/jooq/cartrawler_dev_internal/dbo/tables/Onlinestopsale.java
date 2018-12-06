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
import jooq.cartrawler_dev_internal.dbo.tables.records.OnlinestopsaleRecord;

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
import org.jooq.types.UByte;


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
public class Onlinestopsale extends TableImpl<OnlinestopsaleRecord> {

    private static final long serialVersionUID = 385305065;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.OnlineStopSale</code>
     */
    public static final Onlinestopsale ONLINESTOPSALE = new Onlinestopsale();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OnlinestopsaleRecord> getRecordType() {
        return OnlinestopsaleRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.stop_sale_id</code>.
     */
    public final TableField<OnlinestopsaleRecord, Long> STOP_SALE_ID = createField("stop_sale_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.car_agent_id</code>.
     */
    public final TableField<OnlinestopsaleRecord, Long> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.SIPP</code>.
     */
    public final TableField<OnlinestopsaleRecord, String> SIPP = createField("SIPP", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.rate_code_str</code>.
     */
    public final TableField<OnlinestopsaleRecord, String> RATE_CODE_STR = createField("rate_code_str", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.locations</code>.
     */
    public final TableField<OnlinestopsaleRecord, String> LOCATIONS = createField("locations", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.rate_match</code>.
     */
    public final TableField<OnlinestopsaleRecord, String> RATE_MATCH = createField("rate_match", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.restriction</code>.
     */
    public final TableField<OnlinestopsaleRecord, String> RESTRICTION = createField("restriction", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.active_from</code>.
     */
    public final TableField<OnlinestopsaleRecord, Long> ACTIVE_FROM = createField("active_from", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.active_to</code>.
     */
    public final TableField<OnlinestopsaleRecord, Long> ACTIVE_TO = createField("active_to", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineStopSale.match_type</code>.
     */
    public final TableField<OnlinestopsaleRecord, UByte> MATCH_TYPE = createField("match_type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.OnlineStopSale</code> table reference
     */
    public Onlinestopsale() {
        this(DSL.name("OnlineStopSale"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineStopSale</code> table reference
     */
    public Onlinestopsale(String alias) {
        this(DSL.name(alias), ONLINESTOPSALE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineStopSale</code> table reference
     */
    public Onlinestopsale(Name alias) {
        this(alias, ONLINESTOPSALE);
    }

    private Onlinestopsale(Name alias, Table<OnlinestopsaleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Onlinestopsale(Name alias, Table<OnlinestopsaleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Onlinestopsale(Table<O> child, ForeignKey<O, OnlinestopsaleRecord> key) {
        super(child, key, ONLINESTOPSALE);
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
        return Arrays.<Index>asList(Indexes.ONLINESTOPSALE_PK_ONLINESTOPSALE_1, Indexes.ONLINESTOPSALE_PK_ONLINESTOPSALE1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OnlinestopsaleRecord, Long> getIdentity() {
        return Keys.IDENTITY_ONLINESTOPSALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OnlinestopsaleRecord> getPrimaryKey() {
        return Keys.PK_ONLINESTOPSALE_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OnlinestopsaleRecord>> getKeys() {
        return Arrays.<UniqueKey<OnlinestopsaleRecord>>asList(Keys.PK_ONLINESTOPSALE_1, Keys.PK_ONLINESTOPSALE1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onlinestopsale as(String alias) {
        return new Onlinestopsale(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onlinestopsale as(Name alias) {
        return new Onlinestopsale(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Onlinestopsale rename(String name) {
        return new Onlinestopsale(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Onlinestopsale rename(Name name) {
        return new Onlinestopsale(name, null);
    }
}
