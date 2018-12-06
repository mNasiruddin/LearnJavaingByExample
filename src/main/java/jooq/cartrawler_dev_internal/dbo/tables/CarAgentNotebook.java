/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.CarAgentNotebookRecord;

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
public class CarAgentNotebook extends TableImpl<CarAgentNotebookRecord> {

    private static final long serialVersionUID = -804187827;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook</code>
     */
    public static final CarAgentNotebook CAR_AGENT_NOTEBOOK = new CarAgentNotebook();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarAgentNotebookRecord> getRecordType() {
        return CarAgentNotebookRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook.Seq_No</code>.
     */
    public final TableField<CarAgentNotebookRecord, Integer> SEQ_NO = createField("Seq_No", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook.car_agent_id</code>.
     */
    public final TableField<CarAgentNotebookRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook.Note_Date</code>.
     */
    public final TableField<CarAgentNotebookRecord, Timestamp> NOTE_DATE = createField("Note_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook.Note_Detail</code>.
     */
    public final TableField<CarAgentNotebookRecord, String> NOTE_DETAIL = createField("Note_Detail", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook.Added_By</code>.
     */
    public final TableField<CarAgentNotebookRecord, String> ADDED_BY = createField("Added_By", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook.Customer_add</code>.
     */
    public final TableField<CarAgentNotebookRecord, Boolean> CUSTOMER_ADD = createField("Customer_add", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook.Complaint</code>.
     */
    public final TableField<CarAgentNotebookRecord, Boolean> COMPLAINT = createField("Complaint", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook.Public_Text</code>.
     */
    public final TableField<CarAgentNotebookRecord, Boolean> PUBLIC_TEXT = createField("Public_Text", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook</code> table reference
     */
    public CarAgentNotebook() {
        this(DSL.name("Car_Agent_Notebook"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook</code> table reference
     */
    public CarAgentNotebook(String alias) {
        this(DSL.name(alias), CAR_AGENT_NOTEBOOK);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Car_Agent_Notebook</code> table reference
     */
    public CarAgentNotebook(Name alias) {
        this(alias, CAR_AGENT_NOTEBOOK);
    }

    private CarAgentNotebook(Name alias, Table<CarAgentNotebookRecord> aliased) {
        this(alias, aliased, null);
    }

    private CarAgentNotebook(Name alias, Table<CarAgentNotebookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CarAgentNotebook(Table<O> child, ForeignKey<O, CarAgentNotebookRecord> key) {
        super(child, key, CAR_AGENT_NOTEBOOK);
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
        return Arrays.<Index>asList(Indexes.CAR_AGENT_NOTEBOOK_PK_CAR_AGENT_NOTEBOOK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CarAgentNotebookRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CAR_AGENT_NOTEBOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CarAgentNotebookRecord> getPrimaryKey() {
        return Keys.PK_CAR_AGENT_NOTEBOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CarAgentNotebookRecord>> getKeys() {
        return Arrays.<UniqueKey<CarAgentNotebookRecord>>asList(Keys.PK_CAR_AGENT_NOTEBOOK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentNotebook as(String alias) {
        return new CarAgentNotebook(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentNotebook as(Name alias) {
        return new CarAgentNotebook(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentNotebook rename(String name) {
        return new CarAgentNotebook(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentNotebook rename(Name name) {
        return new CarAgentNotebook(name, null);
    }
}
