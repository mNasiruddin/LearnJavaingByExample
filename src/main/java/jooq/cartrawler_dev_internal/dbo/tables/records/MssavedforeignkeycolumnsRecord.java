/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Mssavedforeignkeycolumns;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class MssavedforeignkeycolumnsRecord extends TableRecordImpl<MssavedforeignkeycolumnsRecord> implements Record7<String, String, String, Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -2113294161;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.program_name</code>.
     */
    public void setProgramName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.program_name</code>.
     */
    public String getProgramName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.parent_schema</code>.
     */
    public void setParentSchema(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.parent_schema</code>.
     */
    public String getParentSchema() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.constraint_column_id</code>.
     */
    public void setConstraintColumnId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.constraint_column_id</code>.
     */
    public Integer getConstraintColumnId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.referencing_column_name</code>.
     */
    public void setReferencingColumnName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.referencing_column_name</code>.
     */
    public String getReferencingColumnName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.referenced_column_name</code>.
     */
    public void setReferencedColumnName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.referenced_column_name</code>.
     */
    public String getReferencedColumnName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeycolumns.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Integer, String, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Integer, String, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Mssavedforeignkeycolumns.MSSAVEDFOREIGNKEYCOLUMNS.PROGRAM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Mssavedforeignkeycolumns.MSSAVEDFOREIGNKEYCOLUMNS.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Mssavedforeignkeycolumns.MSSAVEDFOREIGNKEYCOLUMNS.PARENT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Mssavedforeignkeycolumns.MSSAVEDFOREIGNKEYCOLUMNS.CONSTRAINT_COLUMN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Mssavedforeignkeycolumns.MSSAVEDFOREIGNKEYCOLUMNS.REFERENCING_COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Mssavedforeignkeycolumns.MSSAVEDFOREIGNKEYCOLUMNS.REFERENCED_COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Mssavedforeignkeycolumns.MSSAVEDFOREIGNKEYCOLUMNS.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getProgramName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getParentSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getConstraintColumnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getReferencingColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getReferencedColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getProgramName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParentSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getConstraintColumnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getReferencingColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getReferencedColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeycolumnsRecord value1(String value) {
        setProgramName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeycolumnsRecord value2(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeycolumnsRecord value3(String value) {
        setParentSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeycolumnsRecord value4(Integer value) {
        setConstraintColumnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeycolumnsRecord value5(String value) {
        setReferencingColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeycolumnsRecord value6(String value) {
        setReferencedColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeycolumnsRecord value7(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeycolumnsRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MssavedforeignkeycolumnsRecord
     */
    public MssavedforeignkeycolumnsRecord() {
        super(Mssavedforeignkeycolumns.MSSAVEDFOREIGNKEYCOLUMNS);
    }

    /**
     * Create a detached, initialised MssavedforeignkeycolumnsRecord
     */
    public MssavedforeignkeycolumnsRecord(String programName, String constraintName, String parentSchema, Integer constraintColumnId, String referencingColumnName, String referencedColumnName, Timestamp timestamp) {
        super(Mssavedforeignkeycolumns.MSSAVEDFOREIGNKEYCOLUMNS);

        set(0, programName);
        set(1, constraintName);
        set(2, parentSchema);
        set(3, constraintColumnId);
        set(4, referencingColumnName);
        set(5, referencedColumnName);
        set(6, timestamp);
    }
}
