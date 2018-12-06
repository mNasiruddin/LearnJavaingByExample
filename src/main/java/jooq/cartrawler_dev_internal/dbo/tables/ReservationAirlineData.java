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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationAirlineDataRecord;

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
public class ReservationAirlineData extends TableImpl<ReservationAirlineDataRecord> {

    private static final long serialVersionUID = 1759417394;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_airline_data</code>
     */
    public static final ReservationAirlineData RESERVATION_AIRLINE_DATA = new ReservationAirlineData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationAirlineDataRecord> getRecordType() {
        return ReservationAirlineDataRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_airline_data.fk_reservation</code>.
     */
    public final TableField<ReservationAirlineDataRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_airline_data.sourceAirport</code>.
     */
    public final TableField<ReservationAirlineDataRecord, String> SOURCEAIRPORT = createField("sourceAirport", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_airline_data.pax</code>.
     */
    public final TableField<ReservationAirlineDataRecord, UByte> PAX = createField("pax", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_airline_data</code> table reference
     */
    public ReservationAirlineData() {
        this(DSL.name("reservation_airline_data"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_airline_data</code> table reference
     */
    public ReservationAirlineData(String alias) {
        this(DSL.name(alias), RESERVATION_AIRLINE_DATA);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_airline_data</code> table reference
     */
    public ReservationAirlineData(Name alias) {
        this(alias, RESERVATION_AIRLINE_DATA);
    }

    private ReservationAirlineData(Name alias, Table<ReservationAirlineDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationAirlineData(Name alias, Table<ReservationAirlineDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationAirlineData(Table<O> child, ForeignKey<O, ReservationAirlineDataRecord> key) {
        super(child, key, RESERVATION_AIRLINE_DATA);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_AIRLINE_DATA_PK_RESERVATION_AIRLINE_DATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationAirlineDataRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_AIRLINE_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationAirlineDataRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationAirlineDataRecord>>asList(Keys.PK_RESERVATION_AIRLINE_DATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ReservationAirlineDataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ReservationAirlineDataRecord, ?>>asList(Keys.FK_RESERVATION_AIRLINE_DATA_RESERVATION);
    }

    public Reservation reservation() {
        return new Reservation(this, Keys.FK_RESERVATION_AIRLINE_DATA_RESERVATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAirlineData as(String alias) {
        return new ReservationAirlineData(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAirlineData as(Name alias) {
        return new ReservationAirlineData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationAirlineData rename(String name) {
        return new ReservationAirlineData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationAirlineData rename(Name name) {
        return new ReservationAirlineData(name, null);
    }
}
