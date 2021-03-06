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
import jooq.cartrawler_dev_internal.dbo.tables.records.MarketingCarAgentLocationRecord;

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
public class MarketingCarAgentLocation extends TableImpl<MarketingCarAgentLocationRecord> {

    private static final long serialVersionUID = -1926362527;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location</code>
     */
    public static final MarketingCarAgentLocation MARKETING_CAR_AGENT_LOCATION = new MarketingCarAgentLocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MarketingCarAgentLocationRecord> getRecordType() {
        return MarketingCarAgentLocationRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location.marketing_car_agent_location_id</code>.
     */
    public final TableField<MarketingCarAgentLocationRecord, Integer> MARKETING_CAR_AGENT_LOCATION_ID = createField("marketing_car_agent_location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location.marketing_location_id</code>.
     */
    public final TableField<MarketingCarAgentLocationRecord, Integer> MARKETING_LOCATION_ID = createField("marketing_location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location.car_agent_location_id</code>.
     */
    public final TableField<MarketingCarAgentLocationRecord, Integer> CAR_AGENT_LOCATION_ID = createField("car_agent_location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location</code> table reference
     */
    public MarketingCarAgentLocation() {
        this(DSL.name("marketing_car_agent_location"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location</code> table reference
     */
    public MarketingCarAgentLocation(String alias) {
        this(DSL.name(alias), MARKETING_CAR_AGENT_LOCATION);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location</code> table reference
     */
    public MarketingCarAgentLocation(Name alias) {
        this(alias, MARKETING_CAR_AGENT_LOCATION);
    }

    private MarketingCarAgentLocation(Name alias, Table<MarketingCarAgentLocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private MarketingCarAgentLocation(Name alias, Table<MarketingCarAgentLocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MarketingCarAgentLocation(Table<O> child, ForeignKey<O, MarketingCarAgentLocationRecord> key) {
        super(child, key, MARKETING_CAR_AGENT_LOCATION);
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
        return Arrays.<Index>asList(Indexes.MARKETING_CAR_AGENT_LOCATION_PK_MARKETING_CAR_AGENT_LOCATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MarketingCarAgentLocationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MARKETING_CAR_AGENT_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MarketingCarAgentLocationRecord> getPrimaryKey() {
        return Keys.PK_MARKETING_CAR_AGENT_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MarketingCarAgentLocationRecord>> getKeys() {
        return Arrays.<UniqueKey<MarketingCarAgentLocationRecord>>asList(Keys.PK_MARKETING_CAR_AGENT_LOCATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingCarAgentLocation as(String alias) {
        return new MarketingCarAgentLocation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingCarAgentLocation as(Name alias) {
        return new MarketingCarAgentLocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MarketingCarAgentLocation rename(String name) {
        return new MarketingCarAgentLocation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MarketingCarAgentLocation rename(Name name) {
        return new MarketingCarAgentLocation(name, null);
    }
}
