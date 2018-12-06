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
import jooq.cartrawler_dev_internal.dbo.tables.records.TestimonialRecord;

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
public class Testimonial extends TableImpl<TestimonialRecord> {

    private static final long serialVersionUID = -362420717;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Testimonial</code>
     */
    public static final Testimonial TESTIMONIAL = new Testimonial();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestimonialRecord> getRecordType() {
        return TestimonialRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.TestimonalID</code>.
     */
    public final TableField<TestimonialRecord, Long> TESTIMONALID = createField("TestimonalID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.TestimonalTitle</code>.
     */
    public final TableField<TestimonialRecord, String> TESTIMONALTITLE = createField("TestimonalTitle", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.TestimonalSub</code>.
     */
    public final TableField<TestimonialRecord, String> TESTIMONALSUB = createField("TestimonalSub", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.TestimonalRating</code>.
     */
    public final TableField<TestimonialRecord, String> TESTIMONALRATING = createField("TestimonalRating", org.jooq.impl.SQLDataType.CHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.CarImage</code>.
     */
    public final TableField<TestimonialRecord, String> CARIMAGE = createField("CarImage", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.Comments</code>.
     */
    public final TableField<TestimonialRecord, String> COMMENTS = createField("Comments", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.ClientName</code>.
     */
    public final TableField<TestimonialRecord, String> CLIENTNAME = createField("ClientName", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.Address</code>.
     */
    public final TableField<TestimonialRecord, String> ADDRESS = createField("Address", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.City</code>.
     */
    public final TableField<TestimonialRecord, String> CITY = createField("City", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.Country</code>.
     */
    public final TableField<TestimonialRecord, String> COUNTRY = createField("Country", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.CommentTime</code>.
     */
    public final TableField<TestimonialRecord, Timestamp> COMMENTTIME = createField("CommentTime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.Status</code>.
     */
    public final TableField<TestimonialRecord, Boolean> STATUS = createField("Status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Testimonial.CommentLevel</code>.
     */
    public final TableField<TestimonialRecord, String> COMMENTLEVEL = createField("CommentLevel", org.jooq.impl.SQLDataType.CHAR(10), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Testimonial</code> table reference
     */
    public Testimonial() {
        this(DSL.name("Testimonial"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Testimonial</code> table reference
     */
    public Testimonial(String alias) {
        this(DSL.name(alias), TESTIMONIAL);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Testimonial</code> table reference
     */
    public Testimonial(Name alias) {
        this(alias, TESTIMONIAL);
    }

    private Testimonial(Name alias, Table<TestimonialRecord> aliased) {
        this(alias, aliased, null);
    }

    private Testimonial(Name alias, Table<TestimonialRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Testimonial(Table<O> child, ForeignKey<O, TestimonialRecord> key) {
        super(child, key, TESTIMONIAL);
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
        return Arrays.<Index>asList(Indexes.TESTIMONIAL_PK_TESTIMONIAL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestimonialRecord> getPrimaryKey() {
        return Keys.PK_TESTIMONIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestimonialRecord>> getKeys() {
        return Arrays.<UniqueKey<TestimonialRecord>>asList(Keys.PK_TESTIMONIAL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Testimonial as(String alias) {
        return new Testimonial(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Testimonial as(Name alias) {
        return new Testimonial(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Testimonial rename(String name) {
        return new Testimonial(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Testimonial rename(Name name) {
        return new Testimonial(name, null);
    }
}
