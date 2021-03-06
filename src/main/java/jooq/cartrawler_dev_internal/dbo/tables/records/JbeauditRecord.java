/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Jbeaudit;

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
public class JbeauditRecord extends UpdatableRecordImpl<JbeauditRecord> implements Record4<UUID, Integer, Timestamp, String> {

    private static final long serialVersionUID = 525947695;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.jbeaudit.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.jbeaudit.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.jbeaudit.userid</code>.
     */
    public void setUserid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.jbeaudit.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.jbeaudit.datetime</code>.
     */
    public void setDatetime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.jbeaudit.datetime</code>.
     */
    public Timestamp getDatetime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.jbeaudit.sql</code>.
     */
    public void setSql(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.jbeaudit.sql</code>.
     */
    public String getSql() {
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
    public Row4<UUID, Integer, Timestamp, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, Timestamp, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Jbeaudit.JBEAUDIT.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Jbeaudit.JBEAUDIT.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Jbeaudit.JBEAUDIT.DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Jbeaudit.JBEAUDIT.SQL;
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
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSql();
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
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JbeauditRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JbeauditRecord value2(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JbeauditRecord value3(Timestamp value) {
        setDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JbeauditRecord value4(String value) {
        setSql(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JbeauditRecord values(UUID value1, Integer value2, Timestamp value3, String value4) {
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
     * Create a detached JbeauditRecord
     */
    public JbeauditRecord() {
        super(Jbeaudit.JBEAUDIT);
    }

    /**
     * Create a detached, initialised JbeauditRecord
     */
    public JbeauditRecord(UUID guid, Integer userid, Timestamp datetime, String sql) {
        super(Jbeaudit.JBEAUDIT);

        set(0, guid);
        set(1, userid);
        set(2, datetime);
        set(3, sql);
    }
}
