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
import jooq.cartrawler_dev_internal.dbo.tables.records.IsocountryRecord;

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
public class Isocountry extends TableImpl<IsocountryRecord> {

    private static final long serialVersionUID = 164502636;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.isocountry</code>
     */
    public static final Isocountry ISOCOUNTRY = new Isocountry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IsocountryRecord> getRecordType() {
        return IsocountryRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.isocountry.id</code>.
     */
    public final TableField<IsocountryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.isocountry.country_id</code>.
     */
    public final TableField<IsocountryRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.isocountry.country_name</code>.
     */
    public final TableField<IsocountryRecord, String> COUNTRY_NAME = createField("country_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.isocountry.residence_region_id</code>.
     */
    public final TableField<IsocountryRecord, Integer> RESIDENCE_REGION_ID = createField("residence_region_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.isocountry.phoneCode</code>.
     */
    public final TableField<IsocountryRecord, Integer> PHONECODE = createField("phoneCode", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.isocountry.ISO3</code>.
     */
    public final TableField<IsocountryRecord, String> ISO3 = createField("ISO3", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.isocountry</code> table reference
     */
    public Isocountry() {
        this(DSL.name("isocountry"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.isocountry</code> table reference
     */
    public Isocountry(String alias) {
        this(DSL.name(alias), ISOCOUNTRY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.isocountry</code> table reference
     */
    public Isocountry(Name alias) {
        this(alias, ISOCOUNTRY);
    }

    private Isocountry(Name alias, Table<IsocountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Isocountry(Name alias, Table<IsocountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Isocountry(Table<O> child, ForeignKey<O, IsocountryRecord> key) {
        super(child, key, ISOCOUNTRY);
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
        return Arrays.<Index>asList(Indexes.ISOCOUNTRY_PK_ISOCOUNTRY, Indexes.ISOCOUNTRY_PK_ISOCOUNTRY_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IsocountryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ISOCOUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IsocountryRecord> getPrimaryKey() {
        return Keys.PK_ISOCOUNTRY_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IsocountryRecord>> getKeys() {
        return Arrays.<UniqueKey<IsocountryRecord>>asList(Keys.PK_ISOCOUNTRY_1, Keys.PK_ISOCOUNTRY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Isocountry as(String alias) {
        return new Isocountry(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Isocountry as(Name alias) {
        return new Isocountry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Isocountry rename(String name) {
        return new Isocountry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Isocountry rename(Name name) {
        return new Isocountry(name, null);
    }
}
