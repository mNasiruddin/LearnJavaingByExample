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
import jooq.cartrawler_dev_internal.dbo.tables.records.AbeLoaderRuleIpRecord;

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
public class AbeLoaderRuleIp extends TableImpl<AbeLoaderRuleIpRecord> {

    private static final long serialVersionUID = -1130778371;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.abe_loader_rule_ip</code>
     */
    public static final AbeLoaderRuleIp ABE_LOADER_RULE_IP = new AbeLoaderRuleIp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AbeLoaderRuleIpRecord> getRecordType() {
        return AbeLoaderRuleIpRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_loader_rule_ip.id</code>.
     */
    public final TableField<AbeLoaderRuleIpRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_loader_rule_ip.fk_abe_loader_rule</code>.
     */
    public final TableField<AbeLoaderRuleIpRecord, Integer> FK_ABE_LOADER_RULE = createField("fk_abe_loader_rule", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_loader_rule_ip.ip</code>.
     */
    public final TableField<AbeLoaderRuleIpRecord, Integer> IP = createField("ip", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_loader_rule_ip.excluded</code>.
     */
    public final TableField<AbeLoaderRuleIpRecord, Boolean> EXCLUDED = createField("excluded", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.abe_loader_rule_ip</code> table reference
     */
    public AbeLoaderRuleIp() {
        this(DSL.name("abe_loader_rule_ip"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.abe_loader_rule_ip</code> table reference
     */
    public AbeLoaderRuleIp(String alias) {
        this(DSL.name(alias), ABE_LOADER_RULE_IP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.abe_loader_rule_ip</code> table reference
     */
    public AbeLoaderRuleIp(Name alias) {
        this(alias, ABE_LOADER_RULE_IP);
    }

    private AbeLoaderRuleIp(Name alias, Table<AbeLoaderRuleIpRecord> aliased) {
        this(alias, aliased, null);
    }

    private AbeLoaderRuleIp(Name alias, Table<AbeLoaderRuleIpRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AbeLoaderRuleIp(Table<O> child, ForeignKey<O, AbeLoaderRuleIpRecord> key) {
        super(child, key, ABE_LOADER_RULE_IP);
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
        return Arrays.<Index>asList(Indexes.ABE_LOADER_RULE_IP_PK_ABE_LOADER_RULE_IP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AbeLoaderRuleIpRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ABE_LOADER_RULE_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AbeLoaderRuleIpRecord> getPrimaryKey() {
        return Keys.PK_ABE_LOADER_RULE_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AbeLoaderRuleIpRecord>> getKeys() {
        return Arrays.<UniqueKey<AbeLoaderRuleIpRecord>>asList(Keys.PK_ABE_LOADER_RULE_IP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeLoaderRuleIp as(String alias) {
        return new AbeLoaderRuleIp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeLoaderRuleIp as(Name alias) {
        return new AbeLoaderRuleIp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AbeLoaderRuleIp rename(String name) {
        return new AbeLoaderRuleIp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AbeLoaderRuleIp rename(Name name) {
        return new AbeLoaderRuleIp(name, null);
    }
}