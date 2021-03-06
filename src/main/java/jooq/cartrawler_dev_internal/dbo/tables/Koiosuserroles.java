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
import jooq.cartrawler_dev_internal.dbo.tables.records.KoiosuserrolesRecord;

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
public class Koiosuserroles extends TableImpl<KoiosuserrolesRecord> {

    private static final long serialVersionUID = 1202859949;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.koiosUserRoles</code>
     */
    public static final Koiosuserroles KOIOSUSERROLES = new Koiosuserroles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KoiosuserrolesRecord> getRecordType() {
        return KoiosuserrolesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.koiosUserRoles.user_name</code>.
     */
    public final TableField<KoiosuserrolesRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.koiosUserRoles.role_name</code>.
     */
    public final TableField<KoiosuserrolesRecord, String> ROLE_NAME = createField("role_name", org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.koiosUserRoles</code> table reference
     */
    public Koiosuserroles() {
        this(DSL.name("koiosUserRoles"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.koiosUserRoles</code> table reference
     */
    public Koiosuserroles(String alias) {
        this(DSL.name(alias), KOIOSUSERROLES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.koiosUserRoles</code> table reference
     */
    public Koiosuserroles(Name alias) {
        this(alias, KOIOSUSERROLES);
    }

    private Koiosuserroles(Name alias, Table<KoiosuserrolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Koiosuserroles(Name alias, Table<KoiosuserrolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Koiosuserroles(Table<O> child, ForeignKey<O, KoiosuserrolesRecord> key) {
        super(child, key, KOIOSUSERROLES);
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
        return Arrays.<Index>asList(Indexes.KOIOSUSERROLES_PK__KOIOSUSE__6B11568E5DEAEAF5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<KoiosuserrolesRecord> getPrimaryKey() {
        return Keys.PK__KOIOSUSE__6B11568E5DEAEAF5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<KoiosuserrolesRecord>> getKeys() {
        return Arrays.<UniqueKey<KoiosuserrolesRecord>>asList(Keys.PK__KOIOSUSE__6B11568E5DEAEAF5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Koiosuserroles as(String alias) {
        return new Koiosuserroles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Koiosuserroles as(Name alias) {
        return new Koiosuserroles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Koiosuserroles rename(String name) {
        return new Koiosuserroles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Koiosuserroles rename(Name name) {
        return new Koiosuserroles(name, null);
    }
}
