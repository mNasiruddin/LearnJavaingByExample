/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ClientcommissiontiersRecord;

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
public class Clientcommissiontiers extends TableImpl<ClientcommissiontiersRecord> {

    private static final long serialVersionUID = -1016777214;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers</code>
     */
    public static final Clientcommissiontiers CLIENTCOMMISSIONTIERS = new Clientcommissiontiers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientcommissiontiersRecord> getRecordType() {
        return ClientcommissiontiersRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.Id</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.Ref</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Integer> REF = createField("Ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.Percent</code>.
     */
    public final TableField<ClientcommissiontiersRecord, BigDecimal> PERCENT = createField("Percent", org.jooq.impl.SQLDataType.NUMERIC(10, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.TierType</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Short> TIERTYPE = createField("TierType", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.CommissionType</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Short> COMMISSIONTYPE = createField("CommissionType", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.TierThreshold</code>.
     */
    public final TableField<ClientcommissiontiersRecord, BigDecimal> TIERTHRESHOLD = createField("TierThreshold", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.SubRef</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Integer> SUBREF = createField("SubRef", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.rollover</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Date> ROLLOVER = createField("rollover", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.lastUpdate</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Timestamp> LASTUPDATE = createField("lastUpdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.exclude_commission</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Boolean> EXCLUDE_COMMISSION = createField("exclude_commission", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.applicable_from</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Date> APPLICABLE_FROM = createField("applicable_from", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers.last_application</code>.
     */
    public final TableField<ClientcommissiontiersRecord, Date> LAST_APPLICATION = createField("last_application", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers</code> table reference
     */
    public Clientcommissiontiers() {
        this(DSL.name("ClientCommissionTiers"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers</code> table reference
     */
    public Clientcommissiontiers(String alias) {
        this(DSL.name(alias), CLIENTCOMMISSIONTIERS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ClientCommissionTiers</code> table reference
     */
    public Clientcommissiontiers(Name alias) {
        this(alias, CLIENTCOMMISSIONTIERS);
    }

    private Clientcommissiontiers(Name alias, Table<ClientcommissiontiersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Clientcommissiontiers(Name alias, Table<ClientcommissiontiersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Clientcommissiontiers(Table<O> child, ForeignKey<O, ClientcommissiontiersRecord> key) {
        super(child, key, CLIENTCOMMISSIONTIERS);
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
        return Arrays.<Index>asList(Indexes.CLIENTCOMMISSIONTIERS_PK__CLIENTCO__3214EC074242D080);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ClientcommissiontiersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLIENTCOMMISSIONTIERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClientcommissiontiersRecord> getPrimaryKey() {
        return Keys.PK__CLIENTCO__3214EC074242D080;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClientcommissiontiersRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientcommissiontiersRecord>>asList(Keys.PK__CLIENTCO__3214EC074242D080);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientcommissiontiers as(String alias) {
        return new Clientcommissiontiers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientcommissiontiers as(Name alias) {
        return new Clientcommissiontiers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientcommissiontiers rename(String name) {
        return new Clientcommissiontiers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientcommissiontiers rename(Name name) {
        return new Clientcommissiontiers(name, null);
    }
}
