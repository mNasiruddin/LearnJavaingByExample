/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.DccMarginsRecord;

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
public class DccMargins extends TableImpl<DccMarginsRecord> {

    private static final long serialVersionUID = -1363778147;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.dcc_margins</code>
     */
    public static final DccMargins DCC_MARGINS = new DccMargins();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DccMarginsRecord> getRecordType() {
        return DccMarginsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dcc_margins.id</code>.
     */
    public final TableField<DccMarginsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dcc_margins.country_code</code>.
     */
    public final TableField<DccMarginsRecord, String> COUNTRY_CODE = createField("country_code", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dcc_margins.margin</code>.
     */
    public final TableField<DccMarginsRecord, BigDecimal> MARGIN = createField("margin", org.jooq.impl.SQLDataType.NUMERIC(10, 8).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dcc_margins.fk_user</code>.
     */
    public final TableField<DccMarginsRecord, Integer> FK_USER = createField("fk_user", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dcc_margins.changed</code>.
     */
    public final TableField<DccMarginsRecord, Timestamp> CHANGED = createField("changed", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.dcc_margins</code> table reference
     */
    public DccMargins() {
        this(DSL.name("dcc_margins"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.dcc_margins</code> table reference
     */
    public DccMargins(String alias) {
        this(DSL.name(alias), DCC_MARGINS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.dcc_margins</code> table reference
     */
    public DccMargins(Name alias) {
        this(alias, DCC_MARGINS);
    }

    private DccMargins(Name alias, Table<DccMarginsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DccMargins(Name alias, Table<DccMarginsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DccMargins(Table<O> child, ForeignKey<O, DccMarginsRecord> key) {
        super(child, key, DCC_MARGINS);
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
        return Arrays.<Index>asList(Indexes.DCC_MARGINS_PK_DCC_MARGINS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DccMarginsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DCC_MARGINS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DccMarginsRecord> getPrimaryKey() {
        return Keys.PK_DCC_MARGINS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DccMarginsRecord>> getKeys() {
        return Arrays.<UniqueKey<DccMarginsRecord>>asList(Keys.PK_DCC_MARGINS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DccMargins as(String alias) {
        return new DccMargins(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DccMargins as(Name alias) {
        return new DccMargins(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DccMargins rename(String name) {
        return new DccMargins(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DccMargins rename(Name name) {
        return new DccMargins(name, null);
    }
}
