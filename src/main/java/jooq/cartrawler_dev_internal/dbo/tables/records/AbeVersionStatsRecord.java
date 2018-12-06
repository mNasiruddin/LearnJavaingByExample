/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.AbeVersionStats;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AbeVersionStatsRecord extends UpdatableRecordImpl<AbeVersionStatsRecord> implements Record4<Integer, Integer, String, Long> {

    private static final long serialVersionUID = 1317704959;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version_stats.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version_stats.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version_stats.fk_version_id</code>.
     */
    public void setFkVersionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version_stats.fk_version_id</code>.
     */
    public Integer getFkVersionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version_stats.site</code>.
     */
    public void setSite(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version_stats.site</code>.
     */
    public String getSite() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version_stats.loaded</code>.
     */
    public void setLoaded(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version_stats.loaded</code>.
     */
    public Long getLoaded() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AbeVersionStats.ABE_VERSION_STATS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AbeVersionStats.ABE_VERSION_STATS.FK_VERSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AbeVersionStats.ABE_VERSION_STATS.SITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return AbeVersionStats.ABE_VERSION_STATS.LOADED;
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
    public Integer component2() {
        return getFkVersionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getLoaded();
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
    public Integer value2() {
        return getFkVersionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getLoaded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionStatsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionStatsRecord value2(Integer value) {
        setFkVersionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionStatsRecord value3(String value) {
        setSite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionStatsRecord value4(Long value) {
        setLoaded(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionStatsRecord values(Integer value1, Integer value2, String value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AbeVersionStatsRecord
     */
    public AbeVersionStatsRecord() {
        super(AbeVersionStats.ABE_VERSION_STATS);
    }

    /**
     * Create a detached, initialised AbeVersionStatsRecord
     */
    public AbeVersionStatsRecord(Integer id, Integer fkVersionId, String site, Long loaded) {
        super(AbeVersionStats.ABE_VERSION_STATS);

        set(0, id);
        set(1, fkVersionId);
        set(2, site);
        set(3, loaded);
    }
}
