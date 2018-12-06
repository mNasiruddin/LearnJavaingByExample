/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ContractsexcludedRecord;

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
public class Contractsexcluded extends TableImpl<ContractsexcludedRecord> {

    private static final long serialVersionUID = -79457340;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ContractsExcluded</code>
     */
    public static final Contractsexcluded CONTRACTSEXCLUDED = new Contractsexcluded();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractsexcludedRecord> getRecordType() {
        return ContractsexcludedRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ContractsExcluded.id</code>.
     */
    public final TableField<ContractsexcludedRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ContractsExcluded.fk_plancontract</code>.
     */
    public final TableField<ContractsexcludedRecord, UUID> FK_PLANCONTRACT = createField("fk_plancontract", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ContractsExcluded.type</code>.
     */
    public final TableField<ContractsexcludedRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ContractsExcluded.excludedContract</code>.
     */
    public final TableField<ContractsexcludedRecord, UUID> EXCLUDEDCONTRACT = createField("excludedContract", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ContractsExcluded.lastUpdated</code>.
     */
    public final TableField<ContractsexcludedRecord, Timestamp> LASTUPDATED = createField("lastUpdated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ContractsExcluded</code> table reference
     */
    public Contractsexcluded() {
        this(DSL.name("ContractsExcluded"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ContractsExcluded</code> table reference
     */
    public Contractsexcluded(String alias) {
        this(DSL.name(alias), CONTRACTSEXCLUDED);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ContractsExcluded</code> table reference
     */
    public Contractsexcluded(Name alias) {
        this(alias, CONTRACTSEXCLUDED);
    }

    private Contractsexcluded(Name alias, Table<ContractsexcludedRecord> aliased) {
        this(alias, aliased, null);
    }

    private Contractsexcluded(Name alias, Table<ContractsexcludedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Contractsexcluded(Table<O> child, ForeignKey<O, ContractsexcludedRecord> key) {
        super(child, key, CONTRACTSEXCLUDED);
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
        return Arrays.<Index>asList(Indexes.CONTRACTSEXCLUDED_IDX_UNIQUE_IGNORE_INSERT, Indexes.CONTRACTSEXCLUDED_PK__CONTRACT__3213E83F0F120947);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ContractsexcludedRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONTRACTSEXCLUDED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractsexcludedRecord> getPrimaryKey() {
        return Keys.PK__CONTRACT__3213E83F0F120947;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractsexcludedRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractsexcludedRecord>>asList(Keys.PK__CONTRACT__3213E83F0F120947, Keys.IDX_UNIQUE_IGNORE_INSERT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractsexcludedRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractsexcludedRecord, ?>>asList(Keys.FK_FK_CONVENIENCEID);
    }

    public Plancontract plancontract() {
        return new Plancontract(this, Keys.FK_FK_CONVENIENCEID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Contractsexcluded as(String alias) {
        return new Contractsexcluded(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Contractsexcluded as(Name alias) {
        return new Contractsexcluded(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Contractsexcluded rename(String name) {
        return new Contractsexcluded(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Contractsexcluded rename(Name name) {
        return new Contractsexcluded(name, null);
    }
}
