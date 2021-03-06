/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.FngetgoverningchannelsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Fngetgoverningchannels extends TableImpl<FngetgoverningchannelsRecord> {

    private static final long serialVersionUID = -639449656;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.fnGetGoverningChannels</code>
     */
    public static final Fngetgoverningchannels FNGETGOVERNINGCHANNELS = new Fngetgoverningchannels();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FngetgoverningchannelsRecord> getRecordType() {
        return FngetgoverningchannelsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fnGetGoverningChannels.ID</code>.
     */
    public final TableField<FngetgoverningchannelsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fnGetGoverningChannels.name</code>.
     */
    public final TableField<FngetgoverningchannelsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fnGetGoverningChannels.stopSale</code>.
     */
    public final TableField<FngetgoverningchannelsRecord, Integer> STOPSALE = createField("stopSale", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.fnGetGoverningChannels</code> table reference
     */
    public Fngetgoverningchannels() {
        this(DSL.name("fnGetGoverningChannels"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.fnGetGoverningChannels</code> table reference
     */
    public Fngetgoverningchannels(String alias) {
        this(DSL.name(alias), FNGETGOVERNINGCHANNELS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.fnGetGoverningChannels</code> table reference
     */
    public Fngetgoverningchannels(Name alias) {
        this(alias, FNGETGOVERNINGCHANNELS);
    }

    private Fngetgoverningchannels(Name alias, Table<FngetgoverningchannelsRecord> aliased) {
        this(alias, aliased, new Field[7]);
    }

    private Fngetgoverningchannels(Name alias, Table<FngetgoverningchannelsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Fngetgoverningchannels(Table<O> child, ForeignKey<O, FngetgoverningchannelsRecord> key) {
        super(child, key, FNGETGOVERNINGCHANNELS);
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
    public Fngetgoverningchannels as(String alias) {
        return new Fngetgoverningchannels(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fngetgoverningchannels as(Name alias) {
        return new Fngetgoverningchannels(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Fngetgoverningchannels rename(String name) {
        return new Fngetgoverningchannels(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Fngetgoverningchannels rename(Name name) {
        return new Fngetgoverningchannels(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public Fngetgoverningchannels call(Integer pickuploc, Integer client, Timestamp pickupdate, String consumercountry, String sipp, Integer agent, Timestamp resdate) {
        return new Fngetgoverningchannels(DSL.name(getName()), null, new Field[] { 
              DSL.val(pickuploc, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(client, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(pickupdate, org.jooq.impl.SQLDataType.TIMESTAMP)
            , DSL.val(consumercountry, org.jooq.impl.SQLDataType.VARCHAR(2))
            , DSL.val(sipp, org.jooq.impl.SQLDataType.VARCHAR(4))
            , DSL.val(agent, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(resdate, org.jooq.impl.SQLDataType.TIMESTAMP)
        });
    }

    /**
     * Call this table-valued function
     */
    public Fngetgoverningchannels call(Field<Integer> pickuploc, Field<Integer> client, Field<Timestamp> pickupdate, Field<String> consumercountry, Field<String> sipp, Field<Integer> agent, Field<Timestamp> resdate) {
        return new Fngetgoverningchannels(DSL.name(getName()), null, new Field[] { 
              pickuploc
            , client
            , pickupdate
            , consumercountry
            , sipp
            , agent
            , resdate
        });
    }
}
