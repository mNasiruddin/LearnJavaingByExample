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
import jooq.cartrawler_dev_internal.dbo.tables.records.SpecialsRecord;

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
public class Specials extends TableImpl<SpecialsRecord> {

    private static final long serialVersionUID = -750787670;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Specials</code>
     */
    public static final Specials SPECIALS = new Specials();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpecialsRecord> getRecordType() {
        return SpecialsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Location_ID</code>.
     */
    public final TableField<SpecialsRecord, Integer> LOCATION_ID = createField("Location_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Agency_ID</code>.
     */
    public final TableField<SpecialsRecord, Integer> AGENCY_ID = createField("Agency_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Special_ID</code>.
     */
    public final TableField<SpecialsRecord, Integer> SPECIAL_ID = createField("Special_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Special_Ref</code>.
     */
    public final TableField<SpecialsRecord, String> SPECIAL_REF = createField("Special_Ref", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Special_Name</code>.
     */
    public final TableField<SpecialsRecord, String> SPECIAL_NAME = createField("Special_Name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Special_Description</code>.
     */
    public final TableField<SpecialsRecord, String> SPECIAL_DESCRIPTION = createField("Special_Description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Special_Image</code>.
     */
    public final TableField<SpecialsRecord, byte[]> SPECIAL_IMAGE = createField("Special_Image", org.jooq.impl.SQLDataType.BINARY(2147483647), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Special_Rate</code>.
     */
    public final TableField<SpecialsRecord, BigDecimal> SPECIAL_RATE = createField("Special_Rate", org.jooq.impl.SQLDataType.NUMERIC(18, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Daily_Rate</code>.
     */
    public final TableField<SpecialsRecord, Boolean> DAILY_RATE = createField("Daily_Rate", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.No_Of_Days</code>.
     */
    public final TableField<SpecialsRecord, Integer> NO_OF_DAYS = createField("No_Of_Days", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Valid_From</code>.
     */
    public final TableField<SpecialsRecord, Timestamp> VALID_FROM = createField("Valid_From", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Valid_To</code>.
     */
    public final TableField<SpecialsRecord, Timestamp> VALID_TO = createField("Valid_To", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Term_Conditions</code>.
     */
    public final TableField<SpecialsRecord, String> TERM_CONDITIONS = createField("Term_Conditions", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Status</code>.
     */
    public final TableField<SpecialsRecord, Boolean> STATUS = createField("Status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Image_Width</code>.
     */
    public final TableField<SpecialsRecord, String> IMAGE_WIDTH = createField("Image_Width", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Specials.Image_Height</code>.
     */
    public final TableField<SpecialsRecord, String> IMAGE_HEIGHT = createField("Image_Height", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Specials</code> table reference
     */
    public Specials() {
        this(DSL.name("Specials"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Specials</code> table reference
     */
    public Specials(String alias) {
        this(DSL.name(alias), SPECIALS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Specials</code> table reference
     */
    public Specials(Name alias) {
        this(alias, SPECIALS);
    }

    private Specials(Name alias, Table<SpecialsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Specials(Name alias, Table<SpecialsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Specials(Table<O> child, ForeignKey<O, SpecialsRecord> key) {
        super(child, key, SPECIALS);
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
        return Arrays.<Index>asList(Indexes.SPECIALS_SPECIALS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SpecialsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SPECIALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SpecialsRecord> getPrimaryKey() {
        return Keys.SPECIALS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpecialsRecord>> getKeys() {
        return Arrays.<UniqueKey<SpecialsRecord>>asList(Keys.SPECIALS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Specials as(String alias) {
        return new Specials(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Specials as(Name alias) {
        return new Specials(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Specials rename(String name) {
        return new Specials(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Specials rename(Name name) {
        return new Specials(name, null);
    }
}
