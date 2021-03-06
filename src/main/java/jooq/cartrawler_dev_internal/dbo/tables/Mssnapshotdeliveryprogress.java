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
import jooq.cartrawler_dev_internal.dbo.tables.records.MssnapshotdeliveryprogressRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class Mssnapshotdeliveryprogress extends TableImpl<MssnapshotdeliveryprogressRecord> {

    private static final long serialVersionUID = 225074545;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MSsnapshotdeliveryprogress</code>
     */
    public static final Mssnapshotdeliveryprogress MSSNAPSHOTDELIVERYPROGRESS = new Mssnapshotdeliveryprogress();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MssnapshotdeliveryprogressRecord> getRecordType() {
        return MssnapshotdeliveryprogressRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsnapshotdeliveryprogress.session_token</code>.
     */
    public final TableField<MssnapshotdeliveryprogressRecord, String> SESSION_TOKEN = createField("session_token", org.jooq.impl.SQLDataType.NVARCHAR(260).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsnapshotdeliveryprogress.progress_token_hash</code>.
     */
    public final TableField<MssnapshotdeliveryprogressRecord, Integer> PROGRESS_TOKEN_HASH = createField("progress_token_hash", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsnapshotdeliveryprogress.progress_token</code>.
     */
    public final TableField<MssnapshotdeliveryprogressRecord, String> PROGRESS_TOKEN = createField("progress_token", org.jooq.impl.SQLDataType.NVARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSsnapshotdeliveryprogress.progress_timestamp</code>.
     */
    public final TableField<MssnapshotdeliveryprogressRecord, Timestamp> PROGRESS_TIMESTAMP = createField("progress_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MSsnapshotdeliveryprogress</code> table reference
     */
    public Mssnapshotdeliveryprogress() {
        this(DSL.name("MSsnapshotdeliveryprogress"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSsnapshotdeliveryprogress</code> table reference
     */
    public Mssnapshotdeliveryprogress(String alias) {
        this(DSL.name(alias), MSSNAPSHOTDELIVERYPROGRESS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSsnapshotdeliveryprogress</code> table reference
     */
    public Mssnapshotdeliveryprogress(Name alias) {
        this(alias, MSSNAPSHOTDELIVERYPROGRESS);
    }

    private Mssnapshotdeliveryprogress(Name alias, Table<MssnapshotdeliveryprogressRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mssnapshotdeliveryprogress(Name alias, Table<MssnapshotdeliveryprogressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Mssnapshotdeliveryprogress(Table<O> child, ForeignKey<O, MssnapshotdeliveryprogressRecord> key) {
        super(child, key, MSSNAPSHOTDELIVERYPROGRESS);
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
        return Arrays.<Index>asList(Indexes.MSSNAPSHOTDELIVERYPROGRESS_CI_MSSNAPSHOTDELIVERYPROGRESS_PROGRESS_TOKEN_HASH, Indexes.MSSNAPSHOTDELIVERYPROGRESS_NCI_MSSNAPSHOTDELIVERYPROGRESS_SESSION_TOKEN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mssnapshotdeliveryprogress as(String alias) {
        return new Mssnapshotdeliveryprogress(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mssnapshotdeliveryprogress as(Name alias) {
        return new Mssnapshotdeliveryprogress(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mssnapshotdeliveryprogress rename(String name) {
        return new Mssnapshotdeliveryprogress(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mssnapshotdeliveryprogress rename(Name name) {
        return new Mssnapshotdeliveryprogress(name, null);
    }
}
