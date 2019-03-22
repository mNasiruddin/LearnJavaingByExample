/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ChangeTrackingCtUsersRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ChangeTrackingCtUsers extends TableImpl<ChangeTrackingCtUsersRecord> {

    private static final long serialVersionUID = 2123408011;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users</code>
     */
    public static final ChangeTrackingCtUsers CHANGE_TRACKING_CT_USERS = new ChangeTrackingCtUsers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChangeTrackingCtUsersRecord> getRecordType() {
        return ChangeTrackingCtUsersRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users.user_id</code>.
     */
    public final TableField<ChangeTrackingCtUsersRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users.SYS_CHANGE_VERSION</code>.
     */
    public final TableField<ChangeTrackingCtUsersRecord, Long> SYS_CHANGE_VERSION = createField("SYS_CHANGE_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public final TableField<ChangeTrackingCtUsersRecord, Long> SYS_CHANGE_CREATION_VERSION = createField("SYS_CHANGE_CREATION_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users.SYS_CHANGE_OPERATION</code>.
     */
    public final TableField<ChangeTrackingCtUsersRecord, String> SYS_CHANGE_OPERATION = createField("SYS_CHANGE_OPERATION", org.jooq.impl.SQLDataType.NCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users.SYS_CHANGE_COLUMNS</code>.
     */
    public final TableField<ChangeTrackingCtUsersRecord, byte[]> SYS_CHANGE_COLUMNS = createField("SYS_CHANGE_COLUMNS", org.jooq.impl.SQLDataType.VARBINARY(4100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users.SYS_CHANGE_CONTEXT</code>.
     */
    public final TableField<ChangeTrackingCtUsersRecord, byte[]> SYS_CHANGE_CONTEXT = createField("SYS_CHANGE_CONTEXT", org.jooq.impl.SQLDataType.VARBINARY(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users.Ref</code>.
     */
    public final TableField<ChangeTrackingCtUsersRecord, Integer> REF = createField("Ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users</code> table reference
     */
    public ChangeTrackingCtUsers() {
        this(DSL.name("change_tracking_CT_Users"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users</code> table reference
     */
    public ChangeTrackingCtUsers(String alias) {
        this(DSL.name(alias), CHANGE_TRACKING_CT_USERS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.change_tracking_CT_Users</code> table reference
     */
    public ChangeTrackingCtUsers(Name alias) {
        this(alias, CHANGE_TRACKING_CT_USERS);
    }

    private ChangeTrackingCtUsers(Name alias, Table<ChangeTrackingCtUsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChangeTrackingCtUsers(Name alias, Table<ChangeTrackingCtUsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ChangeTrackingCtUsers(Table<O> child, ForeignKey<O, ChangeTrackingCtUsersRecord> key) {
        super(child, key, CHANGE_TRACKING_CT_USERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CHANGE_TRACKING_CT_USERS_PK_CHANGE_CT_USERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ChangeTrackingCtUsersRecord, Long> getIdentity() {
        return Keys.IDENTITY_CHANGE_TRACKING_CT_USERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChangeTrackingCtUsersRecord> getPrimaryKey() {
        return Keys.PK_CHANGE_CT_USERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChangeTrackingCtUsersRecord>> getKeys() {
        return Arrays.<UniqueKey<ChangeTrackingCtUsersRecord>>asList(Keys.PK_CHANGE_CT_USERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeTrackingCtUsers as(String alias) {
        return new ChangeTrackingCtUsers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeTrackingCtUsers as(Name alias) {
        return new ChangeTrackingCtUsers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeTrackingCtUsers rename(String name) {
        return new ChangeTrackingCtUsers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeTrackingCtUsers rename(Name name) {
        return new ChangeTrackingCtUsers(name, null);
    }
}