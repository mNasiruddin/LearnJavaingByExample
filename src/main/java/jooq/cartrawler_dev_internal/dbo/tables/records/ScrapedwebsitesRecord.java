/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Scrapedwebsites;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class ScrapedwebsitesRecord extends TableRecordImpl<ScrapedwebsitesRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1012771590;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ScrapedWebsites.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ScrapedWebsites.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ScrapedWebsites.siteName</code>.
     */
    public void setSitename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ScrapedWebsites.siteName</code>.
     */
    public String getSitename() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Scrapedwebsites.SCRAPEDWEBSITES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Scrapedwebsites.SCRAPEDWEBSITES.SITENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScrapedwebsitesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScrapedwebsitesRecord value2(String value) {
        setSitename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScrapedwebsitesRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScrapedwebsitesRecord
     */
    public ScrapedwebsitesRecord() {
        super(Scrapedwebsites.SCRAPEDWEBSITES);
    }

    /**
     * Create a detached, initialised ScrapedwebsitesRecord
     */
    public ScrapedwebsitesRecord(Integer id, String sitename) {
        super(Scrapedwebsites.SCRAPEDWEBSITES);

        set(0, id);
        set(1, sitename);
    }
}