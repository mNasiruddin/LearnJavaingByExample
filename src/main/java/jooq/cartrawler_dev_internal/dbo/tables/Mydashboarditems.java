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
import jooq.cartrawler_dev_internal.dbo.tables.records.MydashboarditemsRecord;

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
public class Mydashboarditems extends TableImpl<MydashboarditemsRecord> {

    private static final long serialVersionUID = 1902690439;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.myDashboardItems</code>
     */
    public static final Mydashboarditems MYDASHBOARDITEMS = new Mydashboarditems();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MydashboarditemsRecord> getRecordType() {
        return MydashboarditemsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.myDashboardItems.fk_myDashboard</code>.
     */
    public final TableField<MydashboarditemsRecord, Integer> FK_MYDASHBOARD = createField("fk_myDashboard", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.myDashboardItems.fk_savedReport</code>.
     */
    public final TableField<MydashboarditemsRecord, Integer> FK_SAVEDREPORT = createField("fk_savedReport", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.myDashboardItems.x</code>.
     */
    public final TableField<MydashboarditemsRecord, Integer> X = createField("x", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.myDashboardItems.y</code>.
     */
    public final TableField<MydashboarditemsRecord, Integer> Y = createField("y", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.myDashboardItems.width</code>.
     */
    public final TableField<MydashboarditemsRecord, Integer> WIDTH = createField("width", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.myDashboardItems.height</code>.
     */
    public final TableField<MydashboarditemsRecord, Integer> HEIGHT = createField("height", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.myDashboardItems</code> table reference
     */
    public Mydashboarditems() {
        this(DSL.name("myDashboardItems"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.myDashboardItems</code> table reference
     */
    public Mydashboarditems(String alias) {
        this(DSL.name(alias), MYDASHBOARDITEMS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.myDashboardItems</code> table reference
     */
    public Mydashboarditems(Name alias) {
        this(alias, MYDASHBOARDITEMS);
    }

    private Mydashboarditems(Name alias, Table<MydashboarditemsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mydashboarditems(Name alias, Table<MydashboarditemsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Mydashboarditems(Table<O> child, ForeignKey<O, MydashboarditemsRecord> key) {
        super(child, key, MYDASHBOARDITEMS);
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
        return Arrays.<Index>asList(Indexes.MYDASHBOARDITEMS_PK_MYDASHBOARDITEMS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MydashboarditemsRecord> getPrimaryKey() {
        return Keys.PK_MYDASHBOARDITEMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MydashboarditemsRecord>> getKeys() {
        return Arrays.<UniqueKey<MydashboarditemsRecord>>asList(Keys.PK_MYDASHBOARDITEMS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mydashboarditems as(String alias) {
        return new Mydashboarditems(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mydashboarditems as(Name alias) {
        return new Mydashboarditems(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mydashboarditems rename(String name) {
        return new Mydashboarditems(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mydashboarditems rename(Name name) {
        return new Mydashboarditems(name, null);
    }
}
