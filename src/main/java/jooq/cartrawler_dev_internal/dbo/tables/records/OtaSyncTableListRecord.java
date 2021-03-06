/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.OtaSyncTableList;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class OtaSyncTableListRecord extends UpdatableRecordImpl<OtaSyncTableListRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1960802596;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ota_sync_table_list.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ota_sync_table_list.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ota_sync_table_list.table_name</code>.
     */
    public void setTableName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ota_sync_table_list.table_name</code>.
     */
    public String getTableName() {
        return (String) get(1);
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
        return OtaSyncTableList.OTA_SYNC_TABLE_LIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OtaSyncTableList.OTA_SYNC_TABLE_LIST.TABLE_NAME;
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
        return getTableName();
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
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaSyncTableListRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaSyncTableListRecord value2(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaSyncTableListRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OtaSyncTableListRecord
     */
    public OtaSyncTableListRecord() {
        super(OtaSyncTableList.OTA_SYNC_TABLE_LIST);
    }

    /**
     * Create a detached, initialised OtaSyncTableListRecord
     */
    public OtaSyncTableListRecord(Integer id, String tableName) {
        super(OtaSyncTableList.OTA_SYNC_TABLE_LIST);

        set(0, id);
        set(1, tableName);
    }
}
