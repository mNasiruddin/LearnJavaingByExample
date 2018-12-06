/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.BudgetsplancontractsRecord;

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
public class Budgetsplancontracts extends TableImpl<BudgetsplancontractsRecord> {

    private static final long serialVersionUID = -509791114;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.BudgetsPlanContracts</code>
     */
    public static final Budgetsplancontracts BUDGETSPLANCONTRACTS = new Budgetsplancontracts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BudgetsplancontractsRecord> getRecordType() {
        return BudgetsplancontractsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BudgetsPlanContracts.guid</code>.
     */
    public final TableField<BudgetsplancontractsRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BudgetsPlanContracts.id</code>.
     */
    public final TableField<BudgetsplancontractsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BudgetsPlanContracts.fk_Budgets</code>.
     */
    public final TableField<BudgetsplancontractsRecord, Integer> FK_BUDGETS = createField("fk_Budgets", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BudgetsPlanContracts.fk_PlanContracts</code>.
     */
    public final TableField<BudgetsplancontractsRecord, Integer> FK_PLANCONTRACTS = createField("fk_PlanContracts", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BudgetsPlanContracts.negativeFilter</code>.
     */
    public final TableField<BudgetsplancontractsRecord, Boolean> NEGATIVEFILTER = createField("negativeFilter", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.BudgetsPlanContracts</code> table reference
     */
    public Budgetsplancontracts() {
        this(DSL.name("BudgetsPlanContracts"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.BudgetsPlanContracts</code> table reference
     */
    public Budgetsplancontracts(String alias) {
        this(DSL.name(alias), BUDGETSPLANCONTRACTS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.BudgetsPlanContracts</code> table reference
     */
    public Budgetsplancontracts(Name alias) {
        this(alias, BUDGETSPLANCONTRACTS);
    }

    private Budgetsplancontracts(Name alias, Table<BudgetsplancontractsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Budgetsplancontracts(Name alias, Table<BudgetsplancontractsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Budgetsplancontracts(Table<O> child, ForeignKey<O, BudgetsplancontractsRecord> key) {
        super(child, key, BUDGETSPLANCONTRACTS);
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
        return Arrays.<Index>asList(Indexes.BUDGETSPLANCONTRACTS_PK_BUDGETSPLANCONTRACTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BudgetsplancontractsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BUDGETSPLANCONTRACTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BudgetsplancontractsRecord> getPrimaryKey() {
        return Keys.PK_BUDGETSPLANCONTRACTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BudgetsplancontractsRecord>> getKeys() {
        return Arrays.<UniqueKey<BudgetsplancontractsRecord>>asList(Keys.PK_BUDGETSPLANCONTRACTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Budgetsplancontracts as(String alias) {
        return new Budgetsplancontracts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Budgetsplancontracts as(Name alias) {
        return new Budgetsplancontracts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Budgetsplancontracts rename(String name) {
        return new Budgetsplancontracts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Budgetsplancontracts rename(Name name) {
        return new Budgetsplancontracts(name, null);
    }
}
