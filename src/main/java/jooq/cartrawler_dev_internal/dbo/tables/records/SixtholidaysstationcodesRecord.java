/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Sixtholidaysstationcodes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class SixtholidaysstationcodesRecord extends UpdatableRecordImpl<SixtholidaysstationcodesRecord> implements Record3<UUID, String, Integer> {

    private static final long serialVersionUID = 1466726361;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SixtHolidaysStationCodes.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SixtHolidaysStationCodes.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SixtHolidaysStationCodes.airport</code>.
     */
    public void setAirport(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SixtHolidaysStationCodes.airport</code>.
     */
    public String getAirport() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SixtHolidaysStationCodes.sixtStationID</code>.
     */
    public void setSixtstationid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SixtHolidaysStationCodes.sixtStationID</code>.
     */
    public Integer getSixtstationid() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UUID, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UUID, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Sixtholidaysstationcodes.SIXTHOLIDAYSSTATIONCODES.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Sixtholidaysstationcodes.SIXTHOLIDAYSSTATIONCODES.AIRPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Sixtholidaysstationcodes.SIXTHOLIDAYSSTATIONCODES.SIXTSTATIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAirport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSixtstationid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAirport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSixtstationid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SixtholidaysstationcodesRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SixtholidaysstationcodesRecord value2(String value) {
        setAirport(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SixtholidaysstationcodesRecord value3(Integer value) {
        setSixtstationid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SixtholidaysstationcodesRecord values(UUID value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SixtholidaysstationcodesRecord
     */
    public SixtholidaysstationcodesRecord() {
        super(Sixtholidaysstationcodes.SIXTHOLIDAYSSTATIONCODES);
    }

    /**
     * Create a detached, initialised SixtholidaysstationcodesRecord
     */
    public SixtholidaysstationcodesRecord(UUID guid, String airport, Integer sixtstationid) {
        super(Sixtholidaysstationcodes.SIXTHOLIDAYSSTATIONCODES);

        set(0, guid);
        set(1, airport);
        set(2, sixtstationid);
    }
}
