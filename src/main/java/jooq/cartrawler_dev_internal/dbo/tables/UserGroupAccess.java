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
import jooq.cartrawler_dev_internal.dbo.tables.records.UserGroupAccessRecord;

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
public class UserGroupAccess extends TableImpl<UserGroupAccessRecord> {

    private static final long serialVersionUID = 682838363;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.USER_GROUP_ACCESS</code>
     */
    public static final UserGroupAccess USER_GROUP_ACCESS = new UserGroupAccess();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserGroupAccessRecord> getRecordType() {
        return UserGroupAccessRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.USER_GROUP_ACCESS.guid</code>.
     */
    public final TableField<UserGroupAccessRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.USER_GROUP_ACCESS.fk_accessedTable</code>. fk to table row that access is granted to
     */
    public final TableField<UserGroupAccessRecord, Integer> FK_ACCESSEDTABLE = createField("fk_accessedTable", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "fk to table row that access is granted to");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.USER_GROUP_ACCESS.fk_user_group</code>. fk into group that is granted access
     */
    public final TableField<UserGroupAccessRecord, Integer> FK_USER_GROUP = createField("fk_user_group", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "fk into group that is granted access");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.USER_GROUP_ACCESS.accessedTable</code>. name of the table access is granted to
     */
    public final TableField<UserGroupAccessRecord, String> ACCESSEDTABLE = createField("accessedTable", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "name of the table access is granted to");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.USER_GROUP_ACCESS</code> table reference
     */
    public UserGroupAccess() {
        this(DSL.name("USER_GROUP_ACCESS"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.USER_GROUP_ACCESS</code> table reference
     */
    public UserGroupAccess(String alias) {
        this(DSL.name(alias), USER_GROUP_ACCESS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.USER_GROUP_ACCESS</code> table reference
     */
    public UserGroupAccess(Name alias) {
        this(alias, USER_GROUP_ACCESS);
    }

    private UserGroupAccess(Name alias, Table<UserGroupAccessRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserGroupAccess(Name alias, Table<UserGroupAccessRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserGroupAccess(Table<O> child, ForeignKey<O, UserGroupAccessRecord> key) {
        super(child, key, USER_GROUP_ACCESS);
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
        return Arrays.<Index>asList(Indexes.USER_GROUP_ACCESS_PK_USER_GROUP_ACCESS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserGroupAccessRecord> getPrimaryKey() {
        return Keys.PK_USER_GROUP_ACCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserGroupAccessRecord>> getKeys() {
        return Arrays.<UniqueKey<UserGroupAccessRecord>>asList(Keys.PK_USER_GROUP_ACCESS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupAccess as(String alias) {
        return new UserGroupAccess(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupAccess as(Name alias) {
        return new UserGroupAccess(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGroupAccess rename(String name) {
        return new UserGroupAccess(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGroupAccess rename(Name name) {
        return new UserGroupAccess(name, null);
    }
}
