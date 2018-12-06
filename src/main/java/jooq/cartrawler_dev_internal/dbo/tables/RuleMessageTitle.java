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
import jooq.cartrawler_dev_internal.dbo.tables.records.RuleMessageTitleRecord;

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
public class RuleMessageTitle extends TableImpl<RuleMessageTitleRecord> {

    private static final long serialVersionUID = -2017657787;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.rule_message_title</code>
     */
    public static final RuleMessageTitle RULE_MESSAGE_TITLE = new RuleMessageTitle();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RuleMessageTitleRecord> getRecordType() {
        return RuleMessageTitleRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_message_title.guid</code>.
     */
    public final TableField<RuleMessageTitleRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_message_title.rule_message_title_id</code>.
     */
    public final TableField<RuleMessageTitleRecord, Integer> RULE_MESSAGE_TITLE_ID = createField("rule_message_title_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_message_title.title</code>.
     */
    public final TableField<RuleMessageTitleRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.rule_message_title</code> table reference
     */
    public RuleMessageTitle() {
        this(DSL.name("rule_message_title"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_message_title</code> table reference
     */
    public RuleMessageTitle(String alias) {
        this(DSL.name(alias), RULE_MESSAGE_TITLE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_message_title</code> table reference
     */
    public RuleMessageTitle(Name alias) {
        this(alias, RULE_MESSAGE_TITLE);
    }

    private RuleMessageTitle(Name alias, Table<RuleMessageTitleRecord> aliased) {
        this(alias, aliased, null);
    }

    private RuleMessageTitle(Name alias, Table<RuleMessageTitleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RuleMessageTitle(Table<O> child, ForeignKey<O, RuleMessageTitleRecord> key) {
        super(child, key, RULE_MESSAGE_TITLE);
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
        return Arrays.<Index>asList(Indexes.RULE_MESSAGE_TITLE_PK_RULE_MESSAGE_TITLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RuleMessageTitleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RULE_MESSAGE_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RuleMessageTitleRecord> getPrimaryKey() {
        return Keys.PK_RULE_MESSAGE_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RuleMessageTitleRecord>> getKeys() {
        return Arrays.<UniqueKey<RuleMessageTitleRecord>>asList(Keys.PK_RULE_MESSAGE_TITLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleMessageTitle as(String alias) {
        return new RuleMessageTitle(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleMessageTitle as(Name alias) {
        return new RuleMessageTitle(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleMessageTitle rename(String name) {
        return new RuleMessageTitle(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleMessageTitle rename(Name name) {
        return new RuleMessageTitle(name, null);
    }
}
