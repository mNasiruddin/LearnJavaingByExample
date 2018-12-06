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
import jooq.cartrawler_dev_internal.dbo.tables.records.HeadquartersRecord;

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
public class Headquarters extends TableImpl<HeadquartersRecord> {

    private static final long serialVersionUID = 1257388381;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.HeadQuarters</code>
     */
    public static final Headquarters HEADQUARTERS = new Headquarters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HeadquartersRecord> getRecordType() {
        return HeadquartersRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HeadQuarters.Ref</code>.
     */
    public final TableField<HeadquartersRecord, Integer> REF = createField("Ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HeadQuarters.location_id</code>.
     */
    public final TableField<HeadquartersRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.HeadQuarters.country_id</code>.
     */
    public final TableField<HeadquartersRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.CHAR(2).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.HeadQuarters</code> table reference
     */
    public Headquarters() {
        this(DSL.name("HeadQuarters"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.HeadQuarters</code> table reference
     */
    public Headquarters(String alias) {
        this(DSL.name(alias), HEADQUARTERS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.HeadQuarters</code> table reference
     */
    public Headquarters(Name alias) {
        this(alias, HEADQUARTERS);
    }

    private Headquarters(Name alias, Table<HeadquartersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Headquarters(Name alias, Table<HeadquartersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Headquarters(Table<O> child, ForeignKey<O, HeadquartersRecord> key) {
        super(child, key, HEADQUARTERS);
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
        return Arrays.<Index>asList(Indexes.HEADQUARTERS_PK_HEADQUARTERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HeadquartersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HEADQUARTERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HeadquartersRecord> getPrimaryKey() {
        return Keys.PK_HEADQUARTERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HeadquartersRecord>> getKeys() {
        return Arrays.<UniqueKey<HeadquartersRecord>>asList(Keys.PK_HEADQUARTERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Headquarters as(String alias) {
        return new Headquarters(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Headquarters as(Name alias) {
        return new Headquarters(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Headquarters rename(String name) {
        return new Headquarters(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Headquarters rename(Name name) {
        return new Headquarters(name, null);
    }
}
