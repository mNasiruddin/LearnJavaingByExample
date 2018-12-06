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
import jooq.cartrawler_dev_internal.dbo.tables.records.IsscountryGroupRecord;

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
public class IsscountryGroup extends TableImpl<IsscountryGroupRecord> {

    private static final long serialVersionUID = 310662663;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.issCountry_Group</code>
     */
    public static final IsscountryGroup ISSCOUNTRY_GROUP = new IsscountryGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IsscountryGroupRecord> getRecordType() {
        return IsscountryGroupRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issCountry_Group.country_group_id</code>.
     */
    public final TableField<IsscountryGroupRecord, Integer> COUNTRY_GROUP_ID = createField("country_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issCountry_Group.country_group_name</code>.
     */
    public final TableField<IsscountryGroupRecord, String> COUNTRY_GROUP_NAME = createField("country_group_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.issCountry_Group</code> table reference
     */
    public IsscountryGroup() {
        this(DSL.name("issCountry_Group"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.issCountry_Group</code> table reference
     */
    public IsscountryGroup(String alias) {
        this(DSL.name(alias), ISSCOUNTRY_GROUP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.issCountry_Group</code> table reference
     */
    public IsscountryGroup(Name alias) {
        this(alias, ISSCOUNTRY_GROUP);
    }

    private IsscountryGroup(Name alias, Table<IsscountryGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private IsscountryGroup(Name alias, Table<IsscountryGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IsscountryGroup(Table<O> child, ForeignKey<O, IsscountryGroupRecord> key) {
        super(child, key, ISSCOUNTRY_GROUP);
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
        return Arrays.<Index>asList(Indexes.ISSCOUNTRY_GROUP_PK_ISSCOUNTRY_GROUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IsscountryGroupRecord> getPrimaryKey() {
        return Keys.PK_ISSCOUNTRY_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IsscountryGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<IsscountryGroupRecord>>asList(Keys.PK_ISSCOUNTRY_GROUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsscountryGroup as(String alias) {
        return new IsscountryGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsscountryGroup as(Name alias) {
        return new IsscountryGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IsscountryGroup rename(String name) {
        return new IsscountryGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IsscountryGroup rename(Name name) {
        return new IsscountryGroup(name, null);
    }
}
