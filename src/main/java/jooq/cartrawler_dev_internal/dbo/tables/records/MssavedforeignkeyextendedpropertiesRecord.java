/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Mssavedforeignkeyextendedproperties;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class MssavedforeignkeyextendedpropertiesRecord extends TableRecordImpl<MssavedforeignkeyextendedpropertiesRecord> implements Record6<String, String, String, String, Object, Timestamp> {

    private static final long serialVersionUID = 1735793859;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.program_name</code>.
     */
    public void setProgramName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.program_name</code>.
     */
    public String getProgramName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.parent_schema</code>.
     */
    public void setParentSchema(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.parent_schema</code>.
     */
    public String getParentSchema() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.property_name</code>.
     */
    public void setPropertyName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.property_name</code>.
     */
    public String getPropertyName() {
        return (String) get(3);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPropertyValue(Object value) {
        set(4, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPropertyValue() {
        return get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeyextendedproperties.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Object, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Object, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Mssavedforeignkeyextendedproperties.MSSAVEDFOREIGNKEYEXTENDEDPROPERTIES.PROGRAM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Mssavedforeignkeyextendedproperties.MSSAVEDFOREIGNKEYEXTENDEDPROPERTIES.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Mssavedforeignkeyextendedproperties.MSSAVEDFOREIGNKEYEXTENDEDPROPERTIES.PARENT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Mssavedforeignkeyextendedproperties.MSSAVEDFOREIGNKEYEXTENDEDPROPERTIES.PROPERTY_NAME;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field5() {
        return Mssavedforeignkeyextendedproperties.MSSAVEDFOREIGNKEYEXTENDEDPROPERTIES.PROPERTY_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Mssavedforeignkeyextendedproperties.MSSAVEDFOREIGNKEYEXTENDEDPROPERTIES.TIMESTAMP;
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
    public String component4() {
        return getPropertyName();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component5() {
        return getPropertyValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
    public String value4() {
        return getPropertyName();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value5() {
        return getPropertyValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeyextendedpropertiesRecord value1(String value) {
        setProgramName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeyextendedpropertiesRecord value2(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeyextendedpropertiesRecord value3(String value) {
        setParentSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeyextendedpropertiesRecord value4(String value) {
        setPropertyName(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public MssavedforeignkeyextendedpropertiesRecord value5(Object value) {
        setPropertyValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeyextendedpropertiesRecord value6(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeyextendedpropertiesRecord values(String value1, String value2, String value3, String value4, Object value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MssavedforeignkeyextendedpropertiesRecord
     */
    public MssavedforeignkeyextendedpropertiesRecord() {
        super(Mssavedforeignkeyextendedproperties.MSSAVEDFOREIGNKEYEXTENDEDPROPERTIES);
    }

    /**
     * Create a detached, initialised MssavedforeignkeyextendedpropertiesRecord
     */
    public MssavedforeignkeyextendedpropertiesRecord(String programName, String constraintName, String parentSchema, String propertyName, Object propertyValue, Timestamp timestamp) {
        super(Mssavedforeignkeyextendedproperties.MSSAVEDFOREIGNKEYEXTENDEDPROPERTIES);

        set(0, programName);
        set(1, constraintName);
        set(2, parentSchema);
        set(3, propertyName);
        set(4, propertyValue);
        set(5, timestamp);
    }
}
