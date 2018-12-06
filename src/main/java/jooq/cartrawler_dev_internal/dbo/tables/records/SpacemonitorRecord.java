/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Spacemonitor;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class SpacemonitorRecord extends TableRecordImpl<SpacemonitorRecord> implements Record5<String, BigDecimal, BigDecimal, BigDecimal, Timestamp> {

    private static final long serialVersionUID = -964896141;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.databasename</code>.
     */
    public void setDatabasename(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.databasename</code>.
     */
    public String getDatabasename() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.logsize_MB</code>.
     */
    public void setLogsizeMb(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.logsize_MB</code>.
     */
    public BigDecimal getLogsizeMb() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.row_size</code>.
     */
    public void setRowSize(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.row_size</code>.
     */
    public BigDecimal getRowSize() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.total_size</code>.
     */
    public void setTotalSize(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.total_size</code>.
     */
    public BigDecimal getTotalSize() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.updatedate</code>.
     */
    public void setUpdatedate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SpaceMonitor.updatedate</code>.
     */
    public Timestamp getUpdatedate() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, BigDecimal, BigDecimal, BigDecimal, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, BigDecimal, BigDecimal, BigDecimal, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Spacemonitor.SPACEMONITOR.DATABASENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return Spacemonitor.SPACEMONITOR.LOGSIZE_MB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return Spacemonitor.SPACEMONITOR.ROW_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Spacemonitor.SPACEMONITOR.TOTAL_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Spacemonitor.SPACEMONITOR.UPDATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getDatabasename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getLogsizeMb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getRowSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getTotalSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUpdatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDatabasename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getLogsizeMb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getRowSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getTotalSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpacemonitorRecord value1(String value) {
        setDatabasename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpacemonitorRecord value2(BigDecimal value) {
        setLogsizeMb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpacemonitorRecord value3(BigDecimal value) {
        setRowSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpacemonitorRecord value4(BigDecimal value) {
        setTotalSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpacemonitorRecord value5(Timestamp value) {
        setUpdatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpacemonitorRecord values(String value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpacemonitorRecord
     */
    public SpacemonitorRecord() {
        super(Spacemonitor.SPACEMONITOR);
    }

    /**
     * Create a detached, initialised SpacemonitorRecord
     */
    public SpacemonitorRecord(String databasename, BigDecimal logsizeMb, BigDecimal rowSize, BigDecimal totalSize, Timestamp updatedate) {
        super(Spacemonitor.SPACEMONITOR);

        set(0, databasename);
        set(1, logsizeMb);
        set(2, rowSize);
        set(3, totalSize);
        set(4, updatedate);
    }
}
