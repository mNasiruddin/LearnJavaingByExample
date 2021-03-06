/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Portalpermission;

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
public class PortalpermissionRecord extends UpdatableRecordImpl<PortalpermissionRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -865540773;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PortalPermission.permissionId</code>.
     */
    public void setPermissionid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PortalPermission.permissionId</code>.
     */
    public Integer getPermissionid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PortalPermission.permission</code>.
     */
    public void setPermission(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PortalPermission.permission</code>.
     */
    public String getPermission() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PortalPermission.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PortalPermission.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PortalPermission.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PortalPermission.type</code>.
     */
    public String getType() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Portalpermission.PORTALPERMISSION.PERMISSIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Portalpermission.PORTALPERMISSION.PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Portalpermission.PORTALPERMISSION.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Portalpermission.PORTALPERMISSION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPermissionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPermissionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortalpermissionRecord value1(Integer value) {
        setPermissionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortalpermissionRecord value2(String value) {
        setPermission(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortalpermissionRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortalpermissionRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortalpermissionRecord values(Integer value1, String value2, String value3, String value4) {
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
     * Create a detached PortalpermissionRecord
     */
    public PortalpermissionRecord() {
        super(Portalpermission.PORTALPERMISSION);
    }

    /**
     * Create a detached, initialised PortalpermissionRecord
     */
    public PortalpermissionRecord(Integer permissionid, String permission, String description, String type) {
        super(Portalpermission.PORTALPERMISSION);

        set(0, permissionid);
        set(1, permission);
        set(2, description);
        set(3, type);
    }
}
