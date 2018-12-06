/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.PlancontractClientNegativeRecord;

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
public class PlancontractClientNegative extends TableImpl<PlancontractClientNegativeRecord> {

    private static final long serialVersionUID = 1421645471;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.plancontract_client_negative</code>
     */
    public static final PlancontractClientNegative PLANCONTRACT_CLIENT_NEGATIVE = new PlancontractClientNegative();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlancontractClientNegativeRecord> getRecordType() {
        return PlancontractClientNegativeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plancontract_client_negative.fk_plancontract</code>.
     */
    public final TableField<PlancontractClientNegativeRecord, Integer> FK_PLANCONTRACT = createField("fk_plancontract", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plancontract_client_negative.fk_client</code>.
     */
    public final TableField<PlancontractClientNegativeRecord, Integer> FK_CLIENT = createField("fk_client", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plancontract_client_negative.negativeFilter</code>.
     */
    public final TableField<PlancontractClientNegativeRecord, Boolean> NEGATIVEFILTER = createField("negativeFilter", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plancontract_client_negative.fk_plan</code>.
     */
    public final TableField<PlancontractClientNegativeRecord, Integer> FK_PLAN = createField("fk_plan", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.plancontract_client_negative</code> table reference
     */
    public PlancontractClientNegative() {
        this(DSL.name("plancontract_client_negative"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.plancontract_client_negative</code> table reference
     */
    public PlancontractClientNegative(String alias) {
        this(DSL.name(alias), PLANCONTRACT_CLIENT_NEGATIVE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.plancontract_client_negative</code> table reference
     */
    public PlancontractClientNegative(Name alias) {
        this(alias, PLANCONTRACT_CLIENT_NEGATIVE);
    }

    private PlancontractClientNegative(Name alias, Table<PlancontractClientNegativeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PlancontractClientNegative(Name alias, Table<PlancontractClientNegativeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PlancontractClientNegative(Table<O> child, ForeignKey<O, PlancontractClientNegativeRecord> key) {
        super(child, key, PLANCONTRACT_CLIENT_NEGATIVE);
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
    public PlancontractClientNegative as(String alias) {
        return new PlancontractClientNegative(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractClientNegative as(Name alias) {
        return new PlancontractClientNegative(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PlancontractClientNegative rename(String name) {
        return new PlancontractClientNegative(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PlancontractClientNegative rename(Name name) {
        return new PlancontractClientNegative(name, null);
    }
}
