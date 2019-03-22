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
import jooq.cartrawler_dev_internal.dbo.tables.records.AffcommpaidRecord;

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
public class Affcommpaid extends TableImpl<AffcommpaidRecord> {

    private static final long serialVersionUID = -1886302546;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.AffCommPaid</code>
     */
    public static final Affcommpaid AFFCOMMPAID = new Affcommpaid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AffcommpaidRecord> getRecordType() {
        return AffcommpaidRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffCommPaid.idAffCommPaid</code>.
     */
    public final TableField<AffcommpaidRecord, Integer> IDAFFCOMMPAID = createField("idAffCommPaid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffCommPaid.Client_ID</code>.
     */
    public final TableField<AffcommpaidRecord, Integer> CLIENT_ID = createField("Client_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffCommPaid.Amount</code>.
     */
    public final TableField<AffcommpaidRecord, BigDecimal> AMOUNT = createField("Amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffCommPaid.PaymentType</code>.
     */
    public final TableField<AffcommpaidRecord, String> PAYMENTTYPE = createField("PaymentType", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffCommPaid.PayDate</code>.
     */
    public final TableField<AffcommpaidRecord, Timestamp> PAYDATE = createField("PayDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffCommPaid.Memo</code>.
     */
    public final TableField<AffcommpaidRecord, String> MEMO = createField("Memo", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffCommPaid.CommPaidBy</code>.
     */
    public final TableField<AffcommpaidRecord, Integer> COMMPAIDBY = createField("CommPaidBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffCommPaid.currency</code>.
     */
    public final TableField<AffcommpaidRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffCommPaid.paymentToSettlementRate</code>.
     */
    public final TableField<AffcommpaidRecord, BigDecimal> PAYMENTTOSETTLEMENTRATE = createField("paymentToSettlementRate", org.jooq.impl.SQLDataType.NUMERIC(10, 6), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.AffCommPaid</code> table reference
     */
    public Affcommpaid() {
        this(DSL.name("AffCommPaid"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AffCommPaid</code> table reference
     */
    public Affcommpaid(String alias) {
        this(DSL.name(alias), AFFCOMMPAID);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AffCommPaid</code> table reference
     */
    public Affcommpaid(Name alias) {
        this(alias, AFFCOMMPAID);
    }

    private Affcommpaid(Name alias, Table<AffcommpaidRecord> aliased) {
        this(alias, aliased, null);
    }

    private Affcommpaid(Name alias, Table<AffcommpaidRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Affcommpaid(Table<O> child, ForeignKey<O, AffcommpaidRecord> key) {
        super(child, key, AFFCOMMPAID);
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
        return Arrays.<Index>asList(Indexes.AFFCOMMPAID_PK_AFFCOMMPAID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AffcommpaidRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AFFCOMMPAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AffcommpaidRecord> getPrimaryKey() {
        return Keys.PK_AFFCOMMPAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AffcommpaidRecord>> getKeys() {
        return Arrays.<UniqueKey<AffcommpaidRecord>>asList(Keys.PK_AFFCOMMPAID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Affcommpaid as(String alias) {
        return new Affcommpaid(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Affcommpaid as(Name alias) {
        return new Affcommpaid(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Affcommpaid rename(String name) {
        return new Affcommpaid(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Affcommpaid rename(Name name) {
        return new Affcommpaid(name, null);
    }
}