/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.RemoteQueriesAbtestNames;

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
public class RemoteQueriesAbtestNamesRecord extends UpdatableRecordImpl<RemoteQueriesAbtestNamesRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 250399342;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names.abtest_name</code>.
     */
    public void setAbtestName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names.abtest_name</code>.
     */
    public String getAbtestName() {
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
        return RemoteQueriesAbtestNames.REMOTE_QUERIES_ABTEST_NAMES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RemoteQueriesAbtestNames.REMOTE_QUERIES_ABTEST_NAMES.ABTEST_NAME;
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
        return getAbtestName();
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
        return getAbtestName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesAbtestNamesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesAbtestNamesRecord value2(String value) {
        setAbtestName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesAbtestNamesRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RemoteQueriesAbtestNamesRecord
     */
    public RemoteQueriesAbtestNamesRecord() {
        super(RemoteQueriesAbtestNames.REMOTE_QUERIES_ABTEST_NAMES);
    }

    /**
     * Create a detached, initialised RemoteQueriesAbtestNamesRecord
     */
    public RemoteQueriesAbtestNamesRecord(Integer id, String abtestName) {
        super(RemoteQueriesAbtestNames.REMOTE_QUERIES_ABTEST_NAMES);

        set(0, id);
        set(1, abtestName);
    }
}
