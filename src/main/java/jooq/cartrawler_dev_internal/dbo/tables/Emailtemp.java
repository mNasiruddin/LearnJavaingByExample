/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.EmailtempRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Emailtemp extends TableImpl<EmailtempRecord> {

    private static final long serialVersionUID = 788262640;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.EmailTemp</code>
     */
    public static final Emailtemp EMAILTEMP = new Emailtemp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailtempRecord> getRecordType() {
        return EmailtempRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.EmailTemp.Email</code>.
     */
    public final TableField<EmailtempRecord, String> EMAIL = createField("Email", org.jooq.impl.SQLDataType.VARCHAR(55), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.EmailTemp</code> table reference
     */
    public Emailtemp() {
        this(DSL.name("EmailTemp"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.EmailTemp</code> table reference
     */
    public Emailtemp(String alias) {
        this(DSL.name(alias), EMAILTEMP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.EmailTemp</code> table reference
     */
    public Emailtemp(Name alias) {
        this(alias, EMAILTEMP);
    }

    private Emailtemp(Name alias, Table<EmailtempRecord> aliased) {
        this(alias, aliased, null);
    }

    private Emailtemp(Name alias, Table<EmailtempRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Emailtemp(Table<O> child, ForeignKey<O, EmailtempRecord> key) {
        super(child, key, EMAILTEMP);
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
    public Emailtemp as(String alias) {
        return new Emailtemp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Emailtemp as(Name alias) {
        return new Emailtemp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Emailtemp rename(String name) {
        return new Emailtemp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Emailtemp rename(Name name) {
        return new Emailtemp(name, null);
    }
}
