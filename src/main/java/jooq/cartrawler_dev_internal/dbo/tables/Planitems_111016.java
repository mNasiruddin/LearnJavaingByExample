/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.Planitems_111016Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Planitems_111016 extends TableImpl<Planitems_111016Record> {

    private static final long serialVersionUID = 352711722;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.planitems_111016</code>
     */
    public static final Planitems_111016 PLANITEMS_111016 = new Planitems_111016();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Planitems_111016Record> getRecordType() {
        return Planitems_111016Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.planitems_111016.guid</code>.
     */
    public final TableField<Planitems_111016Record, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.planitems_111016.ID</code>.
     */
    public final TableField<Planitems_111016Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.planitems_111016.fk_plan</code>.
     */
    public final TableField<Planitems_111016Record, UUID> FK_PLAN = createField("fk_plan", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.planitems_111016.fk_contract</code>.
     */
    public final TableField<Planitems_111016Record, UUID> FK_CONTRACT = createField("fk_contract", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.planitems_111016</code> table reference
     */
    public Planitems_111016() {
        this(DSL.name("planitems_111016"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.planitems_111016</code> table reference
     */
    public Planitems_111016(String alias) {
        this(DSL.name(alias), PLANITEMS_111016);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.planitems_111016</code> table reference
     */
    public Planitems_111016(Name alias) {
        this(alias, PLANITEMS_111016);
    }

    private Planitems_111016(Name alias, Table<Planitems_111016Record> aliased) {
        this(alias, aliased, null);
    }

    private Planitems_111016(Name alias, Table<Planitems_111016Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Planitems_111016(Table<O> child, ForeignKey<O, Planitems_111016Record> key) {
        super(child, key, PLANITEMS_111016);
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
    public Identity<Planitems_111016Record, Integer> getIdentity() {
        return Keys.IDENTITY_PLANITEMS_111016;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Planitems_111016 as(String alias) {
        return new Planitems_111016(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Planitems_111016 as(Name alias) {
        return new Planitems_111016(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Planitems_111016 rename(String name) {
        return new Planitems_111016(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Planitems_111016 rename(Name name) {
        return new Planitems_111016(name, null);
    }
}
