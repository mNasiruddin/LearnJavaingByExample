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
import jooq.cartrawler_dev_internal.dbo.tables.records.RcAgentCargroupsRecord;

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
public class RcAgentCargroups extends TableImpl<RcAgentCargroupsRecord> {

    private static final long serialVersionUID = 10484576;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.RC_Agent_CarGroups</code>
     */
    public static final RcAgentCargroups RC_AGENT_CARGROUPS = new RcAgentCargroups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RcAgentCargroupsRecord> getRecordType() {
        return RcAgentCargroupsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RC_Agent_CarGroups.C_ID</code>.
     */
    public final TableField<RcAgentCargroupsRecord, Integer> C_ID = createField("C_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RC_Agent_CarGroups.Car_Agent_Id</code>.
     */
    public final TableField<RcAgentCargroupsRecord, Integer> CAR_AGENT_ID = createField("Car_Agent_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RC_Agent_CarGroups.Details</code>.
     */
    public final TableField<RcAgentCargroupsRecord, String> DETAILS = createField("Details", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RC_Agent_CarGroups.Group_id</code>.
     */
    public final TableField<RcAgentCargroupsRecord, String> GROUP_ID = createField("Group_id", org.jooq.impl.SQLDataType.NVARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.RC_Agent_CarGroups</code> table reference
     */
    public RcAgentCargroups() {
        this(DSL.name("RC_Agent_CarGroups"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.RC_Agent_CarGroups</code> table reference
     */
    public RcAgentCargroups(String alias) {
        this(DSL.name(alias), RC_AGENT_CARGROUPS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.RC_Agent_CarGroups</code> table reference
     */
    public RcAgentCargroups(Name alias) {
        this(alias, RC_AGENT_CARGROUPS);
    }

    private RcAgentCargroups(Name alias, Table<RcAgentCargroupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RcAgentCargroups(Name alias, Table<RcAgentCargroupsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RcAgentCargroups(Table<O> child, ForeignKey<O, RcAgentCargroupsRecord> key) {
        super(child, key, RC_AGENT_CARGROUPS);
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
        return Arrays.<Index>asList(Indexes.RC_AGENT_CARGROUPS_PK_RC_AGENT_CARGROUPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RcAgentCargroupsRecord> getPrimaryKey() {
        return Keys.PK_RC_AGENT_CARGROUPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RcAgentCargroupsRecord>> getKeys() {
        return Arrays.<UniqueKey<RcAgentCargroupsRecord>>asList(Keys.PK_RC_AGENT_CARGROUPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RcAgentCargroupsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RcAgentCargroupsRecord, ?>>asList(Keys.FK_RC_AGENT_CARGROUPS_RC_CARGROUPS);
    }

    public RcCargroups rcCargroups() {
        return new RcCargroups(this, Keys.FK_RC_AGENT_CARGROUPS_RC_CARGROUPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RcAgentCargroups as(String alias) {
        return new RcAgentCargroups(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RcAgentCargroups as(Name alias) {
        return new RcAgentCargroups(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RcAgentCargroups rename(String name) {
        return new RcAgentCargroups(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RcAgentCargroups rename(Name name) {
        return new RcAgentCargroups(name, null);
    }
}
