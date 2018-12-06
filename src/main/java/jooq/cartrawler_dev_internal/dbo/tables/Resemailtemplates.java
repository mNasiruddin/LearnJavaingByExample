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
import jooq.cartrawler_dev_internal.dbo.tables.records.ResemailtemplatesRecord;

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
public class Resemailtemplates extends TableImpl<ResemailtemplatesRecord> {

    private static final long serialVersionUID = 1783464595;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ResEmailTemplates</code>
     */
    public static final Resemailtemplates RESEMAILTEMPLATES = new Resemailtemplates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResemailtemplatesRecord> getRecordType() {
        return ResemailtemplatesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ResEmailTemplates.guid</code>.
     */
    public final TableField<ResemailtemplatesRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ResEmailTemplates.temp_name</code>.
     */
    public final TableField<ResemailtemplatesRecord, String> TEMP_NAME = createField("temp_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ResEmailTemplates.name_display</code>.
     */
    public final TableField<ResemailtemplatesRecord, String> NAME_DISPLAY = createField("name_display", org.jooq.impl.SQLDataType.VARCHAR(150).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ResEmailTemplates.email_subject</code>.
     */
    public final TableField<ResemailtemplatesRecord, String> EMAIL_SUBJECT = createField("email_subject", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ResEmailTemplates.email_body</code>.
     */
    public final TableField<ResemailtemplatesRecord, byte[]> EMAIL_BODY = createField("email_body", org.jooq.impl.SQLDataType.BINARY(2147483647), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ResEmailTemplates.temp_type</code>.
     */
    public final TableField<ResemailtemplatesRecord, String> TEMP_TYPE = createField("temp_type", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ResEmailTemplates.langCode</code>.
     */
    public final TableField<ResemailtemplatesRecord, String> LANGCODE = createField("langCode", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ResEmailTemplates.is_sms</code>.
     */
    public final TableField<ResemailtemplatesRecord, Boolean> IS_SMS = createField("is_sms", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ResEmailTemplates</code> table reference
     */
    public Resemailtemplates() {
        this(DSL.name("ResEmailTemplates"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ResEmailTemplates</code> table reference
     */
    public Resemailtemplates(String alias) {
        this(DSL.name(alias), RESEMAILTEMPLATES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ResEmailTemplates</code> table reference
     */
    public Resemailtemplates(Name alias) {
        this(alias, RESEMAILTEMPLATES);
    }

    private Resemailtemplates(Name alias, Table<ResemailtemplatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Resemailtemplates(Name alias, Table<ResemailtemplatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Resemailtemplates(Table<O> child, ForeignKey<O, ResemailtemplatesRecord> key) {
        super(child, key, RESEMAILTEMPLATES);
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
        return Arrays.<Index>asList(Indexes.RESEMAILTEMPLATES_PK_RESEMAILTEMPLATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ResemailtemplatesRecord> getPrimaryKey() {
        return Keys.PK_RESEMAILTEMPLATES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResemailtemplatesRecord>> getKeys() {
        return Arrays.<UniqueKey<ResemailtemplatesRecord>>asList(Keys.PK_RESEMAILTEMPLATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Resemailtemplates as(String alias) {
        return new Resemailtemplates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Resemailtemplates as(Name alias) {
        return new Resemailtemplates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Resemailtemplates rename(String name) {
        return new Resemailtemplates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Resemailtemplates rename(Name name) {
        return new Resemailtemplates(name, null);
    }
}
