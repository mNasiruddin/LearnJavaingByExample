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
import jooq.cartrawler_dev_internal.dbo.tables.records.OnetimeoffercodenextinstanceRecord;

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
public class Onetimeoffercodenextinstance extends TableImpl<OnetimeoffercodenextinstanceRecord> {

    private static final long serialVersionUID = 1900332363;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.OneTimeOfferCodeNextInstance</code>
     */
    public static final Onetimeoffercodenextinstance ONETIMEOFFERCODENEXTINSTANCE = new Onetimeoffercodenextinstance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OnetimeoffercodenextinstanceRecord> getRecordType() {
        return OnetimeoffercodenextinstanceRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneTimeOfferCodeNextInstance.offerCode</code>.
     */
    public final TableField<OnetimeoffercodenextinstanceRecord, Integer> OFFERCODE = createField("offerCode", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OneTimeOfferCodeNextInstance.nextReference</code>.
     */
    public final TableField<OnetimeoffercodenextinstanceRecord, Integer> NEXTREFERENCE = createField("nextReference", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.OneTimeOfferCodeNextInstance</code> table reference
     */
    public Onetimeoffercodenextinstance() {
        this(DSL.name("OneTimeOfferCodeNextInstance"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OneTimeOfferCodeNextInstance</code> table reference
     */
    public Onetimeoffercodenextinstance(String alias) {
        this(DSL.name(alias), ONETIMEOFFERCODENEXTINSTANCE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OneTimeOfferCodeNextInstance</code> table reference
     */
    public Onetimeoffercodenextinstance(Name alias) {
        this(alias, ONETIMEOFFERCODENEXTINSTANCE);
    }

    private Onetimeoffercodenextinstance(Name alias, Table<OnetimeoffercodenextinstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Onetimeoffercodenextinstance(Name alias, Table<OnetimeoffercodenextinstanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Onetimeoffercodenextinstance(Table<O> child, ForeignKey<O, OnetimeoffercodenextinstanceRecord> key) {
        super(child, key, ONETIMEOFFERCODENEXTINSTANCE);
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
        return Arrays.<Index>asList(Indexes.ONETIMEOFFERCODENEXTINSTANCE_PK_ONETIMEOFFERCODENEXTINSTANCE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OnetimeoffercodenextinstanceRecord> getPrimaryKey() {
        return Keys.PK_ONETIMEOFFERCODENEXTINSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OnetimeoffercodenextinstanceRecord>> getKeys() {
        return Arrays.<UniqueKey<OnetimeoffercodenextinstanceRecord>>asList(Keys.PK_ONETIMEOFFERCODENEXTINSTANCE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onetimeoffercodenextinstance as(String alias) {
        return new Onetimeoffercodenextinstance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Onetimeoffercodenextinstance as(Name alias) {
        return new Onetimeoffercodenextinstance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Onetimeoffercodenextinstance rename(String name) {
        return new Onetimeoffercodenextinstance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Onetimeoffercodenextinstance rename(Name name) {
        return new Onetimeoffercodenextinstance(name, null);
    }
}
