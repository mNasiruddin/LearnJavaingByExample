/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Mssavedforeignkeys;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
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
public class MssavedforeignkeysRecord extends TableRecordImpl<MssavedforeignkeysRecord> implements Record12<String, String, String, String, String, String, Boolean, Boolean, Boolean, UByte, UByte, Timestamp> {

    private static final long serialVersionUID = -1805964726;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.program_name</code>.
     */
    public void setProgramName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.program_name</code>.
     */
    public String getProgramName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.parent_schema</code>.
     */
    public void setParentSchema(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.parent_schema</code>.
     */
    public String getParentSchema() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.parent_name</code>.
     */
    public void setParentName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.parent_name</code>.
     */
    public String getParentName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.referenced_object_schema</code>.
     */
    public void setReferencedObjectSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.referenced_object_schema</code>.
     */
    public String getReferencedObjectSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.referenced_object_name</code>.
     */
    public void setReferencedObjectName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.referenced_object_name</code>.
     */
    public String getReferencedObjectName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.is_disabled</code>.
     */
    public void setIsDisabled(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.is_disabled</code>.
     */
    public Boolean getIsDisabled() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.is_not_for_replication</code>.
     */
    public void setIsNotForReplication(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.is_not_for_replication</code>.
     */
    public Boolean getIsNotForReplication() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.is_not_trusted</code>.
     */
    public void setIsNotTrusted(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.is_not_trusted</code>.
     */
    public Boolean getIsNotTrusted() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.delete_referential_action</code>.
     */
    public void setDeleteReferentialAction(UByte value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.delete_referential_action</code>.
     */
    public UByte getDeleteReferentialAction() {
        return (UByte) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.update_referential_action</code>.
     */
    public void setUpdateReferentialAction(UByte value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.update_referential_action</code>.
     */
    public UByte getUpdateReferentialAction() {
        return (UByte) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsavedforeignkeys.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, String, String, Boolean, Boolean, Boolean, UByte, UByte, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, String, String, Boolean, Boolean, Boolean, UByte, UByte, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.PROGRAM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.PARENT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.PARENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.REFERENCED_OBJECT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.REFERENCED_OBJECT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.IS_DISABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.IS_NOT_FOR_REPLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.IS_NOT_TRUSTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field10() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.DELETE_REFERENTIAL_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field11() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.UPDATE_REFERENTIAL_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Mssavedforeignkeys.MSSAVEDFOREIGNKEYS.TIMESTAMP;
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
        return getParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getReferencedObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getReferencedObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getIsDisabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getIsNotForReplication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getIsNotTrusted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component10() {
        return getDeleteReferentialAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component11() {
        return getUpdateReferentialAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
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
        return getParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getReferencedObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getReferencedObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getIsDisabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getIsNotForReplication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getIsNotTrusted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value10() {
        return getDeleteReferentialAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value11() {
        return getUpdateReferentialAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value1(String value) {
        setProgramName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value2(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value3(String value) {
        setParentSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value4(String value) {
        setParentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value5(String value) {
        setReferencedObjectSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value6(String value) {
        setReferencedObjectName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value7(Boolean value) {
        setIsDisabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value8(Boolean value) {
        setIsNotForReplication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value9(Boolean value) {
        setIsNotTrusted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value10(UByte value) {
        setDeleteReferentialAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value11(UByte value) {
        setUpdateReferentialAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord value12(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssavedforeignkeysRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Boolean value7, Boolean value8, Boolean value9, UByte value10, UByte value11, Timestamp value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MssavedforeignkeysRecord
     */
    public MssavedforeignkeysRecord() {
        super(Mssavedforeignkeys.MSSAVEDFOREIGNKEYS);
    }

    /**
     * Create a detached, initialised MssavedforeignkeysRecord
     */
    public MssavedforeignkeysRecord(String programName, String constraintName, String parentSchema, String parentName, String referencedObjectSchema, String referencedObjectName, Boolean isDisabled, Boolean isNotForReplication, Boolean isNotTrusted, UByte deleteReferentialAction, UByte updateReferentialAction, Timestamp timestamp) {
        super(Mssavedforeignkeys.MSSAVEDFOREIGNKEYS);

        set(0, programName);
        set(1, constraintName);
        set(2, parentSchema);
        set(3, parentName);
        set(4, referencedObjectSchema);
        set(5, referencedObjectName);
        set(6, isDisabled);
        set(7, isNotForReplication);
        set(8, isNotTrusted);
        set(9, deleteReferentialAction);
        set(10, updateReferentialAction);
        set(11, timestamp);
    }
}
