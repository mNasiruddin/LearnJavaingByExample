/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Activeconnectionsmonitoring;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ActiveconnectionsmonitoringRecord extends TableRecordImpl<ActiveconnectionsmonitoringRecord> implements Record4<String, Integer, String, Timestamp> {

    private static final long serialVersionUID = 407731404;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ActiveConnectionsMonitoring.DBName</code>.
     */
    public void setDbname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ActiveConnectionsMonitoring.DBName</code>.
     */
    public String getDbname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ActiveConnectionsMonitoring.NumberOfConnections</code>.
     */
    public void setNumberofconnections(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ActiveConnectionsMonitoring.NumberOfConnections</code>.
     */
    public Integer getNumberofconnections() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ActiveConnectionsMonitoring.LoginName</code>.
     */
    public void setLoginname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ActiveConnectionsMonitoring.LoginName</code>.
     */
    public String getLoginname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ActiveConnectionsMonitoring.insertdate</code>.
     */
    public void setInsertdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ActiveConnectionsMonitoring.insertdate</code>.
     */
    public Timestamp getInsertdate() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Integer, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Integer, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Activeconnectionsmonitoring.ACTIVECONNECTIONSMONITORING.DBNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Activeconnectionsmonitoring.ACTIVECONNECTIONSMONITORING.NUMBEROFCONNECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Activeconnectionsmonitoring.ACTIVECONNECTIONSMONITORING.LOGINNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Activeconnectionsmonitoring.ACTIVECONNECTIONSMONITORING.INSERTDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getDbname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getNumberofconnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLoginname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getInsertdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDbname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getNumberofconnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLoginname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getInsertdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveconnectionsmonitoringRecord value1(String value) {
        setDbname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveconnectionsmonitoringRecord value2(Integer value) {
        setNumberofconnections(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveconnectionsmonitoringRecord value3(String value) {
        setLoginname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveconnectionsmonitoringRecord value4(Timestamp value) {
        setInsertdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveconnectionsmonitoringRecord values(String value1, Integer value2, String value3, Timestamp value4) {
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
     * Create a detached ActiveconnectionsmonitoringRecord
     */
    public ActiveconnectionsmonitoringRecord() {
        super(Activeconnectionsmonitoring.ACTIVECONNECTIONSMONITORING);
    }

    /**
     * Create a detached, initialised ActiveconnectionsmonitoringRecord
     */
    public ActiveconnectionsmonitoringRecord(String dbname, Integer numberofconnections, String loginname, Timestamp insertdate) {
        super(Activeconnectionsmonitoring.ACTIVECONNECTIONSMONITORING);

        set(0, dbname);
        set(1, numberofconnections);
        set(2, loginname);
        set(3, insertdate);
    }
}
