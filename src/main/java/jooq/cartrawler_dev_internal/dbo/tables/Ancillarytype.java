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
import jooq.cartrawler_dev_internal.dbo.tables.records.AncillarytypeRecord;

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
public class Ancillarytype extends TableImpl<AncillarytypeRecord> {

    private static final long serialVersionUID = 472840808;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.AncillaryType</code>
     */
    public static final Ancillarytype ANCILLARYTYPE = new Ancillarytype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AncillarytypeRecord> getRecordType() {
        return AncillarytypeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AncillaryType.pk_id</code>.
     */
    public final TableField<AncillarytypeRecord, Integer> PK_ID = createField("pk_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AncillaryType.id</code>.
     */
    public final TableField<AncillarytypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AncillaryType.type_name</code>.
     */
    public final TableField<AncillarytypeRecord, String> TYPE_NAME = createField("type_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AncillaryType.type_code</code>.
     */
    public final TableField<AncillarytypeRecord, String> TYPE_CODE = createField("type_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.AncillaryType</code> table reference
     */
    public Ancillarytype() {
        this(DSL.name("AncillaryType"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AncillaryType</code> table reference
     */
    public Ancillarytype(String alias) {
        this(DSL.name(alias), ANCILLARYTYPE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AncillaryType</code> table reference
     */
    public Ancillarytype(Name alias) {
        this(alias, ANCILLARYTYPE);
    }

    private Ancillarytype(Name alias, Table<AncillarytypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ancillarytype(Name alias, Table<AncillarytypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Ancillarytype(Table<O> child, ForeignKey<O, AncillarytypeRecord> key) {
        super(child, key, ANCILLARYTYPE);
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
        return Arrays.<Index>asList(Indexes.ANCILLARYTYPE_PK_ANCILLARYTYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AncillarytypeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ANCILLARYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AncillarytypeRecord> getPrimaryKey() {
        return Keys.PK_ANCILLARYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AncillarytypeRecord>> getKeys() {
        return Arrays.<UniqueKey<AncillarytypeRecord>>asList(Keys.PK_ANCILLARYTYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ancillarytype as(String alias) {
        return new Ancillarytype(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ancillarytype as(Name alias) {
        return new Ancillarytype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ancillarytype rename(String name) {
        return new Ancillarytype(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ancillarytype rename(Name name) {
        return new Ancillarytype(name, null);
    }
}
