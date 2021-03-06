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
import jooq.cartrawler_dev_internal.dbo.tables.records.CarGroupBaggageRuleRecord;

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
public class CarGroupBaggageRule extends TableImpl<CarGroupBaggageRuleRecord> {

    private static final long serialVersionUID = -396100805;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule</code>
     */
    public static final CarGroupBaggageRule CAR_GROUP_BAGGAGE_RULE = new CarGroupBaggageRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarGroupBaggageRuleRecord> getRecordType() {
        return CarGroupBaggageRuleRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.id</code>.
     */
    public final TableField<CarGroupBaggageRuleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.region_id</code>.
     */
    public final TableField<CarGroupBaggageRuleRecord, Integer> REGION_ID = createField("region_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.sippFirstChar</code>.
     */
    public final TableField<CarGroupBaggageRuleRecord, String> SIPPFIRSTCHAR = createField("sippFirstChar", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.sippSecondChar</code>.
     */
    public final TableField<CarGroupBaggageRuleRecord, String> SIPPSECONDCHAR = createField("sippSecondChar", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.bags</code>.
     */
    public final TableField<CarGroupBaggageRuleRecord, UByte> BAGS = createField("bags", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule</code> table reference
     */
    public CarGroupBaggageRule() {
        this(DSL.name("car_group_baggage_rule"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule</code> table reference
     */
    public CarGroupBaggageRule(String alias) {
        this(DSL.name(alias), CAR_GROUP_BAGGAGE_RULE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule</code> table reference
     */
    public CarGroupBaggageRule(Name alias) {
        this(alias, CAR_GROUP_BAGGAGE_RULE);
    }

    private CarGroupBaggageRule(Name alias, Table<CarGroupBaggageRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private CarGroupBaggageRule(Name alias, Table<CarGroupBaggageRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CarGroupBaggageRule(Table<O> child, ForeignKey<O, CarGroupBaggageRuleRecord> key) {
        super(child, key, CAR_GROUP_BAGGAGE_RULE);
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
        return Arrays.<Index>asList(Indexes.CAR_GROUP_BAGGAGE_RULE_PK__CAR_GROU__3213E83F5020B295);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CarGroupBaggageRuleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CAR_GROUP_BAGGAGE_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CarGroupBaggageRuleRecord> getPrimaryKey() {
        return Keys.PK__CAR_GROU__3213E83F5020B295;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CarGroupBaggageRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<CarGroupBaggageRuleRecord>>asList(Keys.PK__CAR_GROU__3213E83F5020B295);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarGroupBaggageRule as(String alias) {
        return new CarGroupBaggageRule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarGroupBaggageRule as(Name alias) {
        return new CarGroupBaggageRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarGroupBaggageRule rename(String name) {
        return new CarGroupBaggageRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarGroupBaggageRule rename(Name name) {
        return new CarGroupBaggageRule(name, null);
    }
}
