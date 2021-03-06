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
import jooq.cartrawler_dev_internal.dbo.tables.records.ChangeTrackingAncillarytypeRecord;

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
public class ChangeTrackingAncillarytype extends TableImpl<ChangeTrackingAncillarytypeRecord> {

    private static final long serialVersionUID = -1889935874;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType</code>
     */
    public static final ChangeTrackingAncillarytype CHANGE_TRACKING_ANCILLARYTYPE = new ChangeTrackingAncillarytype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChangeTrackingAncillarytypeRecord> getRecordType() {
        return ChangeTrackingAncillarytypeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType.pk_id</code>.
     */
    public final TableField<ChangeTrackingAncillarytypeRecord, Long> PK_ID = createField("pk_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType.SYS_CHANGE_VERSION</code>.
     */
    public final TableField<ChangeTrackingAncillarytypeRecord, Long> SYS_CHANGE_VERSION = createField("SYS_CHANGE_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public final TableField<ChangeTrackingAncillarytypeRecord, Long> SYS_CHANGE_CREATION_VERSION = createField("SYS_CHANGE_CREATION_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType.SYS_CHANGE_OPERATION</code>.
     */
    public final TableField<ChangeTrackingAncillarytypeRecord, String> SYS_CHANGE_OPERATION = createField("SYS_CHANGE_OPERATION", org.jooq.impl.SQLDataType.NCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType.SYS_CHANGE_COLUMNS</code>.
     */
    public final TableField<ChangeTrackingAncillarytypeRecord, byte[]> SYS_CHANGE_COLUMNS = createField("SYS_CHANGE_COLUMNS", org.jooq.impl.SQLDataType.VARBINARY(4100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType.SYS_CHANGE_CONTEXT</code>.
     */
    public final TableField<ChangeTrackingAncillarytypeRecord, byte[]> SYS_CHANGE_CONTEXT = createField("SYS_CHANGE_CONTEXT", org.jooq.impl.SQLDataType.VARBINARY(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType.Ref</code>.
     */
    public final TableField<ChangeTrackingAncillarytypeRecord, Integer> REF = createField("Ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType</code> table reference
     */
    public ChangeTrackingAncillarytype() {
        this(DSL.name("change_tracking_AncillaryType"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType</code> table reference
     */
    public ChangeTrackingAncillarytype(String alias) {
        this(DSL.name(alias), CHANGE_TRACKING_ANCILLARYTYPE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.change_tracking_AncillaryType</code> table reference
     */
    public ChangeTrackingAncillarytype(Name alias) {
        this(alias, CHANGE_TRACKING_ANCILLARYTYPE);
    }

    private ChangeTrackingAncillarytype(Name alias, Table<ChangeTrackingAncillarytypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChangeTrackingAncillarytype(Name alias, Table<ChangeTrackingAncillarytypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ChangeTrackingAncillarytype(Table<O> child, ForeignKey<O, ChangeTrackingAncillarytypeRecord> key) {
        super(child, key, CHANGE_TRACKING_ANCILLARYTYPE);
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
        return Arrays.<Index>asList(Indexes.CHANGE_TRACKING_ANCILLARYTYPE_PK_CHANGE_ANCILLARYTYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ChangeTrackingAncillarytypeRecord, Long> getIdentity() {
        return Keys.IDENTITY_CHANGE_TRACKING_ANCILLARYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChangeTrackingAncillarytypeRecord> getPrimaryKey() {
        return Keys.PK_CHANGE_ANCILLARYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChangeTrackingAncillarytypeRecord>> getKeys() {
        return Arrays.<UniqueKey<ChangeTrackingAncillarytypeRecord>>asList(Keys.PK_CHANGE_ANCILLARYTYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeTrackingAncillarytype as(String alias) {
        return new ChangeTrackingAncillarytype(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeTrackingAncillarytype as(Name alias) {
        return new ChangeTrackingAncillarytype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeTrackingAncillarytype rename(String name) {
        return new ChangeTrackingAncillarytype(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeTrackingAncillarytype rename(Name name) {
        return new ChangeTrackingAncillarytype(name, null);
    }
}
