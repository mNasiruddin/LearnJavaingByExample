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
import jooq.cartrawler_dev_internal.dbo.tables.records.AffuploadRecord;

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
import org.jooq.types.UByte;


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
public class Affupload extends TableImpl<AffuploadRecord> {

    private static final long serialVersionUID = 657229319;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.AffUpload</code>
     */
    public static final Affupload AFFUPLOAD = new Affupload();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AffuploadRecord> getRecordType() {
        return AffuploadRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffUpload.idAffUpload</code>.
     */
    public final TableField<AffuploadRecord, Integer> IDAFFUPLOAD = createField("idAffUpload", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffUpload.Client_ID</code>.
     */
    public final TableField<AffuploadRecord, Integer> CLIENT_ID = createField("Client_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffUpload.FileType</code>.
     */
    public final TableField<AffuploadRecord, UByte> FILETYPE = createField("FileType", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffUpload.FullFileName</code>.
     */
    public final TableField<AffuploadRecord, String> FULLFILENAME = createField("FullFileName", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.AffUpload</code> table reference
     */
    public Affupload() {
        this(DSL.name("AffUpload"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AffUpload</code> table reference
     */
    public Affupload(String alias) {
        this(DSL.name(alias), AFFUPLOAD);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AffUpload</code> table reference
     */
    public Affupload(Name alias) {
        this(alias, AFFUPLOAD);
    }

    private Affupload(Name alias, Table<AffuploadRecord> aliased) {
        this(alias, aliased, null);
    }

    private Affupload(Name alias, Table<AffuploadRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Affupload(Table<O> child, ForeignKey<O, AffuploadRecord> key) {
        super(child, key, AFFUPLOAD);
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
        return Arrays.<Index>asList(Indexes.AFFUPLOAD_PK_AFFUPLOAD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AffuploadRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AFFUPLOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AffuploadRecord> getPrimaryKey() {
        return Keys.PK_AFFUPLOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AffuploadRecord>> getKeys() {
        return Arrays.<UniqueKey<AffuploadRecord>>asList(Keys.PK_AFFUPLOAD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Affupload as(String alias) {
        return new Affupload(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Affupload as(Name alias) {
        return new Affupload(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Affupload rename(String name) {
        return new Affupload(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Affupload rename(Name name) {
        return new Affupload(name, null);
    }
}