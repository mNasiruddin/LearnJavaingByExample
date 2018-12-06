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
import jooq.cartrawler_dev_internal.dbo.tables.records.RuleCodeRecord;

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
public class RuleCode extends TableImpl<RuleCodeRecord> {

    private static final long serialVersionUID = -1277631929;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.rule_code</code>
     */
    public static final RuleCode RULE_CODE = new RuleCode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RuleCodeRecord> getRecordType() {
        return RuleCodeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_code.guid</code>.
     */
    public final TableField<RuleCodeRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_code.namecode</code>.
     */
    public final TableField<RuleCodeRecord, String> NAMECODE = createField("namecode", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_code.codevalue</code>.
     */
    public final TableField<RuleCodeRecord, String> CODEVALUE = createField("codevalue", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_code.description</code>.
     */
    public final TableField<RuleCodeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.rule_code</code> table reference
     */
    public RuleCode() {
        this(DSL.name("rule_code"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_code</code> table reference
     */
    public RuleCode(String alias) {
        this(DSL.name(alias), RULE_CODE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_code</code> table reference
     */
    public RuleCode(Name alias) {
        this(alias, RULE_CODE);
    }

    private RuleCode(Name alias, Table<RuleCodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private RuleCode(Name alias, Table<RuleCodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RuleCode(Table<O> child, ForeignKey<O, RuleCodeRecord> key) {
        super(child, key, RULE_CODE);
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
        return Arrays.<Index>asList(Indexes.RULE_CODE_PK_RULE_CODE, Indexes.RULE_CODE_PK_RULE_CODE_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RuleCodeRecord> getPrimaryKey() {
        return Keys.PK_RULE_CODE_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RuleCodeRecord>> getKeys() {
        return Arrays.<UniqueKey<RuleCodeRecord>>asList(Keys.PK_RULE_CODE_1, Keys.PK_RULE_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleCode as(String alias) {
        return new RuleCode(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleCode as(Name alias) {
        return new RuleCode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleCode rename(String name) {
        return new RuleCode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleCode rename(Name name) {
        return new RuleCode(name, null);
    }
}
