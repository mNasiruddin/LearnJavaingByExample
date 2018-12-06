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
import jooq.cartrawler_dev_internal.dbo.tables.records.IssarmMvTempRecord;

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
public class IssarmMvTemp extends TableImpl<IssarmMvTempRecord> {

    private static final long serialVersionUID = 908207245;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.issArm_mv_temp</code>
     */
    public static final IssarmMvTemp ISSARM_MV_TEMP = new IssarmMvTemp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IssarmMvTempRecord> getRecordType() {
        return IssarmMvTempRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.arm_id</code>.
     */
    public final TableField<IssarmMvTempRecord, Integer> ARM_ID = createField("arm_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.rule_id</code>.
     */
    public final TableField<IssarmMvTempRecord, Integer> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.armIx</code>.
     */
    public final TableField<IssarmMvTempRecord, Integer> ARMIX = createField("armIx", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.hitcount</code>.
     */
    public final TableField<IssarmMvTempRecord, Integer> HITCOUNT = createField("hitcount", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.biasReward</code>.
     */
    public final TableField<IssarmMvTempRecord, Integer> BIASREWARD = createField("biasReward", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p1</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P1 = createField("p1", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p2</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P2 = createField("p2", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p3</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P3 = createField("p3", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p4</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P4 = createField("p4", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p5</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P5 = createField("p5", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p6</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P6 = createField("p6", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p7</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P7 = createField("p7", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p8</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P8 = createField("p8", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p9</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P9 = createField("p9", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p10</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P10 = createField("p10", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p11</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P11 = createField("p11", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.p12</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> P12 = createField("p12", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.algorithm_id</code>.
     */
    public final TableField<IssarmMvTempRecord, Integer> ALGORITHM_ID = createField("algorithm_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.algorithm_name</code>.
     */
    public final TableField<IssarmMvTempRecord, String> ALGORITHM_NAME = createField("algorithm_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.algo_p1</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> ALGO_P1 = createField("algo_p1", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.algo_p2</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> ALGO_P2 = createField("algo_p2", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.algo_p3</code>.
     */
    public final TableField<IssarmMvTempRecord, Double> ALGO_P3 = createField("algo_p3", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issArm_mv_temp.clazz</code>.
     */
    public final TableField<IssarmMvTempRecord, String> CLAZZ = createField("clazz", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.issArm_mv_temp</code> table reference
     */
    public IssarmMvTemp() {
        this(DSL.name("issArm_mv_temp"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.issArm_mv_temp</code> table reference
     */
    public IssarmMvTemp(String alias) {
        this(DSL.name(alias), ISSARM_MV_TEMP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.issArm_mv_temp</code> table reference
     */
    public IssarmMvTemp(Name alias) {
        this(alias, ISSARM_MV_TEMP);
    }

    private IssarmMvTemp(Name alias, Table<IssarmMvTempRecord> aliased) {
        this(alias, aliased, null);
    }

    private IssarmMvTemp(Name alias, Table<IssarmMvTempRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IssarmMvTemp(Table<O> child, ForeignKey<O, IssarmMvTempRecord> key) {
        super(child, key, ISSARM_MV_TEMP);
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
        return Arrays.<Index>asList(Indexes.ISSARM_MV_TEMP_PK_ISSARM_MV_TEMP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IssarmMvTempRecord> getPrimaryKey() {
        return Keys.PK_ISSARM_MV_TEMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IssarmMvTempRecord>> getKeys() {
        return Arrays.<UniqueKey<IssarmMvTempRecord>>asList(Keys.PK_ISSARM_MV_TEMP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<IssarmMvTempRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<IssarmMvTempRecord, ?>>asList(Keys.FK_ISSARM_MV_TEMP_RULE_ID);
    }

    public IssruleMvTemp issruleMvTemp() {
        return new IssruleMvTemp(this, Keys.FK_ISSARM_MV_TEMP_RULE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssarmMvTemp as(String alias) {
        return new IssarmMvTemp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssarmMvTemp as(Name alias) {
        return new IssarmMvTemp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IssarmMvTemp rename(String name) {
        return new IssarmMvTemp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IssarmMvTemp rename(Name name) {
        return new IssarmMvTemp(name, null);
    }
}
