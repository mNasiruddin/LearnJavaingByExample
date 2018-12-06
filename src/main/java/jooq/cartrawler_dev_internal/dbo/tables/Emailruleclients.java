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
import jooq.cartrawler_dev_internal.dbo.tables.records.EmailruleclientsRecord;

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
public class Emailruleclients extends TableImpl<EmailruleclientsRecord> {

    private static final long serialVersionUID = -661804433;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.EmailRuleClients</code>
     */
    public static final Emailruleclients EMAILRULECLIENTS = new Emailruleclients();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailruleclientsRecord> getRecordType() {
        return EmailruleclientsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailRuleClients.id</code>.
     */
    public final TableField<EmailruleclientsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailRuleClients.fk_emailrule</code>.
     */
    public final TableField<EmailruleclientsRecord, Integer> FK_EMAILRULE = createField("fk_emailrule", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailRuleClients.fk_client</code>.
     */
    public final TableField<EmailruleclientsRecord, Integer> FK_CLIENT = createField("fk_client", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.EmailRuleClients</code> table reference
     */
    public Emailruleclients() {
        this(DSL.name("EmailRuleClients"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.EmailRuleClients</code> table reference
     */
    public Emailruleclients(String alias) {
        this(DSL.name(alias), EMAILRULECLIENTS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.EmailRuleClients</code> table reference
     */
    public Emailruleclients(Name alias) {
        this(alias, EMAILRULECLIENTS);
    }

    private Emailruleclients(Name alias, Table<EmailruleclientsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Emailruleclients(Name alias, Table<EmailruleclientsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Emailruleclients(Table<O> child, ForeignKey<O, EmailruleclientsRecord> key) {
        super(child, key, EMAILRULECLIENTS);
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
        return Arrays.<Index>asList(Indexes.EMAILRULECLIENTS_PK_EMAILRULECLIENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EmailruleclientsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EMAILRULECLIENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmailruleclientsRecord> getPrimaryKey() {
        return Keys.PK_EMAILRULECLIENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmailruleclientsRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailruleclientsRecord>>asList(Keys.PK_EMAILRULECLIENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Emailruleclients as(String alias) {
        return new Emailruleclients(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Emailruleclients as(Name alias) {
        return new Emailruleclients(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Emailruleclients rename(String name) {
        return new Emailruleclients(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Emailruleclients rename(Name name) {
        return new Emailruleclients(name, null);
    }
}
