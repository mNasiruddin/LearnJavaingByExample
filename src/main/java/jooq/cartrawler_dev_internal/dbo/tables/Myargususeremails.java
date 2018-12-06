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
import jooq.cartrawler_dev_internal.dbo.tables.records.MyargususeremailsRecord;

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
public class Myargususeremails extends TableImpl<MyargususeremailsRecord> {

    private static final long serialVersionUID = 1825851786;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MyArgusUserEmails</code>
     */
    public static final Myargususeremails MYARGUSUSEREMAILS = new Myargususeremails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MyargususeremailsRecord> getRecordType() {
        return MyargususeremailsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MyArgusUserEmails.id</code>.
     */
    public final TableField<MyargususeremailsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MyArgusUserEmails.user_id</code>.
     */
    public final TableField<MyargususeremailsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MyArgusUserEmails.email</code>.
     */
    public final TableField<MyargususeremailsRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.NVARCHAR(100), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MyArgusUserEmails</code> table reference
     */
    public Myargususeremails() {
        this(DSL.name("MyArgusUserEmails"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MyArgusUserEmails</code> table reference
     */
    public Myargususeremails(String alias) {
        this(DSL.name(alias), MYARGUSUSEREMAILS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MyArgusUserEmails</code> table reference
     */
    public Myargususeremails(Name alias) {
        this(alias, MYARGUSUSEREMAILS);
    }

    private Myargususeremails(Name alias, Table<MyargususeremailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Myargususeremails(Name alias, Table<MyargususeremailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Myargususeremails(Table<O> child, ForeignKey<O, MyargususeremailsRecord> key) {
        super(child, key, MYARGUSUSEREMAILS);
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
        return Arrays.<Index>asList(Indexes.MYARGUSUSEREMAILS_PK_MYARGUSUSEREMAILS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MyargususeremailsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MYARGUSUSEREMAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MyargususeremailsRecord> getPrimaryKey() {
        return Keys.PK_MYARGUSUSEREMAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MyargususeremailsRecord>> getKeys() {
        return Arrays.<UniqueKey<MyargususeremailsRecord>>asList(Keys.PK_MYARGUSUSEREMAILS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MyargususeremailsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MyargususeremailsRecord, ?>>asList(Keys.FK_MYARGUSUSEREMAILS_MYARGUSUSER);
    }

    public Myargususer myargususer() {
        return new Myargususer(this, Keys.FK_MYARGUSUSEREMAILS_MYARGUSUSER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Myargususeremails as(String alias) {
        return new Myargususeremails(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Myargususeremails as(Name alias) {
        return new Myargususeremails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Myargususeremails rename(String name) {
        return new Myargususeremails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Myargususeremails rename(Name name) {
        return new Myargususeremails(name, null);
    }
}
