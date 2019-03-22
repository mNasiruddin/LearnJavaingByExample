/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ScrapedwebsitesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Scrapedwebsites extends TableImpl<ScrapedwebsitesRecord> {

    private static final long serialVersionUID = 1652210839;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ScrapedWebsites</code>
     */
    public static final Scrapedwebsites SCRAPEDWEBSITES = new Scrapedwebsites();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScrapedwebsitesRecord> getRecordType() {
        return ScrapedwebsitesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ScrapedWebsites.id</code>.
     */
    public final TableField<ScrapedwebsitesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ScrapedWebsites.siteName</code>.
     */
    public final TableField<ScrapedwebsitesRecord, String> SITENAME = createField("siteName", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ScrapedWebsites</code> table reference
     */
    public Scrapedwebsites() {
        this(DSL.name("ScrapedWebsites"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ScrapedWebsites</code> table reference
     */
    public Scrapedwebsites(String alias) {
        this(DSL.name(alias), SCRAPEDWEBSITES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ScrapedWebsites</code> table reference
     */
    public Scrapedwebsites(Name alias) {
        this(alias, SCRAPEDWEBSITES);
    }

    private Scrapedwebsites(Name alias, Table<ScrapedwebsitesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Scrapedwebsites(Name alias, Table<ScrapedwebsitesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Scrapedwebsites(Table<O> child, ForeignKey<O, ScrapedwebsitesRecord> key) {
        super(child, key, SCRAPEDWEBSITES);
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
    public Identity<ScrapedwebsitesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SCRAPEDWEBSITES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scrapedwebsites as(String alias) {
        return new Scrapedwebsites(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scrapedwebsites as(Name alias) {
        return new Scrapedwebsites(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Scrapedwebsites rename(String name) {
        return new Scrapedwebsites(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scrapedwebsites rename(Name name) {
        return new Scrapedwebsites(name, null);
    }
}