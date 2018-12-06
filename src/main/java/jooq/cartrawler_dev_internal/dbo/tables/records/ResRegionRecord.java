/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ResRegion;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;


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
public class ResRegionRecord extends UpdatableRecordImpl<ResRegionRecord> implements Record4<UUID, UByte, String, String> {

    private static final long serialVersionUID = -1942556622;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.res_region.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.res_region.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.res_region.region_id</code>.
     */
    public void setRegionId(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.res_region.region_id</code>.
     */
    public UByte getRegionId() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.res_region.region_name</code>.
     */
    public void setRegionName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.res_region.region_name</code>.
     */
    public String getRegionName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.res_region.identifier</code>.
     */
    public void setIdentifier(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.res_region.identifier</code>.
     */
    public String getIdentifier() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, UByte, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, UByte, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return ResRegion.RES_REGION.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field2() {
        return ResRegion.RES_REGION.REGION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ResRegion.RES_REGION.REGION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ResRegion.RES_REGION.IDENTIFIER;
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
    public UByte component2() {
        return getRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRegionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIdentifier();
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
    public UByte value2() {
        return getRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRegionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResRegionRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResRegionRecord value2(UByte value) {
        setRegionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResRegionRecord value3(String value) {
        setRegionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResRegionRecord value4(String value) {
        setIdentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResRegionRecord values(UUID value1, UByte value2, String value3, String value4) {
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
     * Create a detached ResRegionRecord
     */
    public ResRegionRecord() {
        super(ResRegion.RES_REGION);
    }

    /**
     * Create a detached, initialised ResRegionRecord
     */
    public ResRegionRecord(UUID guid, UByte regionId, String regionName, String identifier) {
        super(ResRegion.RES_REGION);

        set(0, guid);
        set(1, regionId);
        set(2, regionName);
        set(3, identifier);
    }
}
