/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.UserRoleRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class UserRole extends TableImpl<UserRoleRecord> {

    private static final long serialVersionUID = -1183211125;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.user_role</code>
     */
    public static final UserRole USER_ROLE = new UserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRoleRecord> getRecordType() {
        return UserRoleRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.user_role.guid</code>.
     */
    public final TableField<UserRoleRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.user_role.user_id</code>.
     */
    public final TableField<UserRoleRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.user_role.role_id</code>.
     */
    public final TableField<UserRoleRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.user_role</code> table reference
     */
    public UserRole() {
        this(DSL.name("user_role"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.user_role</code> table reference
     */
    public UserRole(String alias) {
        this(DSL.name(alias), USER_ROLE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.user_role</code> table reference
     */
    public UserRole(Name alias) {
        this(alias, USER_ROLE);
    }

    private UserRole(Name alias, Table<UserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRole(Name alias, Table<UserRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserRole(Table<O> child, ForeignKey<O, UserRoleRecord> key) {
        super(child, key, USER_ROLE);
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
        return Arrays.<Index>asList(Indexes.USER_ROLE_PK_USER_ROLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRoleRecord> getPrimaryKey() {
        return Keys.PK_USER_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRoleRecord>>asList(Keys.PK_USER_ROLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserRoleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserRoleRecord, ?>>asList(Keys.FK_USER_ID, Keys.FK_ROLE_ID);
    }

    public Users users() {
        return new Users(this, Keys.FK_USER_ID);
    }

    public Roles roles() {
        return new Roles(this, Keys.FK_ROLE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRole as(String alias) {
        return new UserRole(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRole as(Name alias) {
        return new UserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(String name) {
        return new UserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(Name name) {
        return new UserRole(name, null);
    }
}
