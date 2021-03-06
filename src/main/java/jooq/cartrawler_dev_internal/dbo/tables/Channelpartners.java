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
import jooq.cartrawler_dev_internal.dbo.tables.records.ChannelpartnersRecord;

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
public class Channelpartners extends TableImpl<ChannelpartnersRecord> {

    private static final long serialVersionUID = 445442805;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ChannelPartners</code>
     */
    public static final Channelpartners CHANNELPARTNERS = new Channelpartners();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChannelpartnersRecord> getRecordType() {
        return ChannelpartnersRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPartners.ref</code>.
     */
    public final TableField<ChannelpartnersRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPartners.client_id</code>.
     */
    public final TableField<ChannelpartnersRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ChannelPartners</code> table reference
     */
    public Channelpartners() {
        this(DSL.name("ChannelPartners"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ChannelPartners</code> table reference
     */
    public Channelpartners(String alias) {
        this(DSL.name(alias), CHANNELPARTNERS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ChannelPartners</code> table reference
     */
    public Channelpartners(Name alias) {
        this(alias, CHANNELPARTNERS);
    }

    private Channelpartners(Name alias, Table<ChannelpartnersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Channelpartners(Name alias, Table<ChannelpartnersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Channelpartners(Table<O> child, ForeignKey<O, ChannelpartnersRecord> key) {
        super(child, key, CHANNELPARTNERS);
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
        return Arrays.<Index>asList(Indexes.CHANNELPARTNERS_IX_CHANNELPARTNERS_2, Indexes.CHANNELPARTNERS_PK_CHANNELPARTNERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChannelpartnersRecord> getPrimaryKey() {
        return Keys.PK_CHANNELPARTNERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChannelpartnersRecord>> getKeys() {
        return Arrays.<UniqueKey<ChannelpartnersRecord>>asList(Keys.PK_CHANNELPARTNERS, Keys.IX_CHANNELPARTNERS_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Channelpartners as(String alias) {
        return new Channelpartners(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Channelpartners as(Name alias) {
        return new Channelpartners(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelpartners rename(String name) {
        return new Channelpartners(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelpartners rename(Name name) {
        return new Channelpartners(name, null);
    }
}
