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
import jooq.cartrawler_dev_internal.dbo.tables.records.VirtuallocationitemsRecord;

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
public class Virtuallocationitems extends TableImpl<VirtuallocationitemsRecord> {

    private static final long serialVersionUID = 1131890171;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.VirtualLocationItems</code>
     */
    public static final Virtuallocationitems VIRTUALLOCATIONITEMS = new Virtuallocationitems();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VirtuallocationitemsRecord> getRecordType() {
        return VirtuallocationitemsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.guid</code>.
     */
    public final TableField<VirtuallocationitemsRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.ID</code>.
     */
    public final TableField<VirtuallocationitemsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.location_id</code>.
     */
    public final TableField<VirtuallocationitemsRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.country_id</code>.
     */
    public final TableField<VirtuallocationitemsRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.ref</code>.
     */
    public final TableField<VirtuallocationitemsRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.state_code</code>.
     */
    public final TableField<VirtuallocationitemsRecord, String> STATE_CODE = createField("state_code", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.VirtualLocationItems</code> table reference
     */
    public Virtuallocationitems() {
        this(DSL.name("VirtualLocationItems"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.VirtualLocationItems</code> table reference
     */
    public Virtuallocationitems(String alias) {
        this(DSL.name(alias), VIRTUALLOCATIONITEMS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.VirtualLocationItems</code> table reference
     */
    public Virtuallocationitems(Name alias) {
        this(alias, VIRTUALLOCATIONITEMS);
    }

    private Virtuallocationitems(Name alias, Table<VirtuallocationitemsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Virtuallocationitems(Name alias, Table<VirtuallocationitemsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Virtuallocationitems(Table<O> child, ForeignKey<O, VirtuallocationitemsRecord> key) {
        super(child, key, VIRTUALLOCATIONITEMS);
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
        return Arrays.<Index>asList(Indexes.VIRTUALLOCATIONITEMS_PK_VIRTUALLOCATIONITEMS, Indexes.VIRTUALLOCATIONITEMS_PK_VIRTUALLOCATIONITEMS_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<VirtuallocationitemsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VIRTUALLOCATIONITEMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VirtuallocationitemsRecord> getPrimaryKey() {
        return Keys.PK_VIRTUALLOCATIONITEMS_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VirtuallocationitemsRecord>> getKeys() {
        return Arrays.<UniqueKey<VirtuallocationitemsRecord>>asList(Keys.PK_VIRTUALLOCATIONITEMS_1, Keys.PK_VIRTUALLOCATIONITEMS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Virtuallocationitems as(String alias) {
        return new Virtuallocationitems(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Virtuallocationitems as(Name alias) {
        return new Virtuallocationitems(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Virtuallocationitems rename(String name) {
        return new Virtuallocationitems(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Virtuallocationitems rename(Name name) {
        return new Virtuallocationitems(name, null);
    }
}
