/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.StopsaleGroup;

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
public class StopsaleGroupRecord extends UpdatableRecordImpl<StopsaleGroupRecord> implements Record4<UUID, Integer, String, byte[]> {

    private static final long serialVersionUID = 669067583;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.stopsale_group.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.stopsale_group.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.stopsale_group.stopsale_id</code>.
     */
    public void setStopsaleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.stopsale_group.stopsale_id</code>.
     */
    public Integer getStopsaleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.stopsale_group.group_id</code>.
     */
    public void setGroupId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.stopsale_group.group_id</code>.
     */
    public String getGroupId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.stopsale_group.rv</code>.
     */
    public void setRv(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.stopsale_group.rv</code>.
     */
    public byte[] getRv() {
        return (byte[]) get(3);
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
    public Row4<UUID, Integer, String, byte[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, String, byte[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return StopsaleGroup.STOPSALE_GROUP.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return StopsaleGroup.STOPSALE_GROUP.STOPSALE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return StopsaleGroup.STOPSALE_GROUP.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return StopsaleGroup.STOPSALE_GROUP.RV;
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
    public Integer component2() {
        return getStopsaleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getRv();
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
    public Integer value2() {
        return getStopsaleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getRv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleGroupRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleGroupRecord value2(Integer value) {
        setStopsaleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleGroupRecord value3(String value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleGroupRecord value4(byte... value) {
        setRv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleGroupRecord values(UUID value1, Integer value2, String value3, byte[] value4) {
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
     * Create a detached StopsaleGroupRecord
     */
    public StopsaleGroupRecord() {
        super(StopsaleGroup.STOPSALE_GROUP);
    }

    /**
     * Create a detached, initialised StopsaleGroupRecord
     */
    public StopsaleGroupRecord(UUID guid, Integer stopsaleId, String groupId, byte[] rv) {
        super(StopsaleGroup.STOPSALE_GROUP);

        set(0, guid);
        set(1, stopsaleId);
        set(2, groupId);
        set(3, rv);
    }
}
