/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.AgencyRatesRecord;

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
public class AgencyRates extends TableImpl<AgencyRatesRecord> {

    private static final long serialVersionUID = -753081616;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Agency_Rates</code>
     */
    public static final AgencyRates AGENCY_RATES = new AgencyRates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AgencyRatesRecord> getRecordType() {
        return AgencyRatesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Rates.Agency_ID</code>.
     */
    public final TableField<AgencyRatesRecord, Integer> AGENCY_ID = createField("Agency_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Rates.Group_ID</code>.
     */
    public final TableField<AgencyRatesRecord, String> GROUP_ID = createField("Group_ID", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Rates.Season_ID</code>.
     */
    public final TableField<AgencyRatesRecord, String> SEASON_ID = createField("Season_ID", org.jooq.impl.SQLDataType.CHAR(1).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Rates.Days_From</code>.
     */
    public final TableField<AgencyRatesRecord, Integer> DAYS_FROM = createField("Days_From", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Rates.Days_To</code>.
     */
    public final TableField<AgencyRatesRecord, Integer> DAYS_TO = createField("Days_To", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Agency_Rates.Rate</code>.
     */
    public final TableField<AgencyRatesRecord, BigDecimal> RATE = createField("Rate", org.jooq.impl.SQLDataType.NUMERIC(10, 2).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.NUMERIC)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Agency_Rates</code> table reference
     */
    public AgencyRates() {
        this(DSL.name("Agency_Rates"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Agency_Rates</code> table reference
     */
    public AgencyRates(String alias) {
        this(DSL.name(alias), AGENCY_RATES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Agency_Rates</code> table reference
     */
    public AgencyRates(Name alias) {
        this(alias, AGENCY_RATES);
    }

    private AgencyRates(Name alias, Table<AgencyRatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private AgencyRates(Name alias, Table<AgencyRatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AgencyRates(Table<O> child, ForeignKey<O, AgencyRatesRecord> key) {
        super(child, key, AGENCY_RATES);
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
        return Arrays.<Index>asList(Indexes.AGENCY_RATES_AGENCY_RATES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AgencyRatesRecord> getPrimaryKey() {
        return Keys.AGENCY_RATES_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AgencyRatesRecord>> getKeys() {
        return Arrays.<UniqueKey<AgencyRatesRecord>>asList(Keys.AGENCY_RATES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRates as(String alias) {
        return new AgencyRates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRates as(Name alias) {
        return new AgencyRates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AgencyRates rename(String name) {
        return new AgencyRates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AgencyRates rename(Name name) {
        return new AgencyRates(name, null);
    }
}
