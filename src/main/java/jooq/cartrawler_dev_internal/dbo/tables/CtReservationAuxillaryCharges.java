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
import jooq.cartrawler_dev_internal.dbo.tables.records.CtReservationAuxillaryChargesRecord;

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
public class CtReservationAuxillaryCharges extends TableImpl<CtReservationAuxillaryChargesRecord> {

    private static final long serialVersionUID = -1626516662;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges</code>
     */
    public static final CtReservationAuxillaryCharges CT_RESERVATION_AUXILLARY_CHARGES = new CtReservationAuxillaryCharges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtReservationAuxillaryChargesRecord> getRecordType() {
        return CtReservationAuxillaryChargesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges.id</code>.
     */
    public final TableField<CtReservationAuxillaryChargesRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges.SYS_CHANGE_VERSION</code>.
     */
    public final TableField<CtReservationAuxillaryChargesRecord, Long> SYS_CHANGE_VERSION = createField("SYS_CHANGE_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public final TableField<CtReservationAuxillaryChargesRecord, Long> SYS_CHANGE_CREATION_VERSION = createField("SYS_CHANGE_CREATION_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges.SYS_CHANGE_OPERATION</code>.
     */
    public final TableField<CtReservationAuxillaryChargesRecord, String> SYS_CHANGE_OPERATION = createField("SYS_CHANGE_OPERATION", org.jooq.impl.SQLDataType.NCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges.SYS_CHANGE_COLUMNS</code>.
     */
    public final TableField<CtReservationAuxillaryChargesRecord, byte[]> SYS_CHANGE_COLUMNS = createField("SYS_CHANGE_COLUMNS", org.jooq.impl.SQLDataType.VARBINARY(4100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges.SYS_CHANGE_CONTEXT</code>.
     */
    public final TableField<CtReservationAuxillaryChargesRecord, byte[]> SYS_CHANGE_CONTEXT = createField("SYS_CHANGE_CONTEXT", org.jooq.impl.SQLDataType.VARBINARY(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges.guid</code>.
     */
    public final TableField<CtReservationAuxillaryChargesRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges</code> table reference
     */
    public CtReservationAuxillaryCharges() {
        this(DSL.name("CT_Reservation_auxillary_charges"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges</code> table reference
     */
    public CtReservationAuxillaryCharges(String alias) {
        this(DSL.name(alias), CT_RESERVATION_AUXILLARY_CHARGES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CT_Reservation_auxillary_charges</code> table reference
     */
    public CtReservationAuxillaryCharges(Name alias) {
        this(alias, CT_RESERVATION_AUXILLARY_CHARGES);
    }

    private CtReservationAuxillaryCharges(Name alias, Table<CtReservationAuxillaryChargesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CtReservationAuxillaryCharges(Name alias, Table<CtReservationAuxillaryChargesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CtReservationAuxillaryCharges(Table<O> child, ForeignKey<O, CtReservationAuxillaryChargesRecord> key) {
        super(child, key, CT_RESERVATION_AUXILLARY_CHARGES);
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
        return Arrays.<Index>asList(Indexes.CT_RESERVATION_AUXILLARY_CHARGES_PK_CT_RESERVATION_AUXILLARY_CHARGES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CtReservationAuxillaryChargesRecord, Long> getIdentity() {
        return Keys.IDENTITY_CT_RESERVATION_AUXILLARY_CHARGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CtReservationAuxillaryChargesRecord> getPrimaryKey() {
        return Keys.PK_CT_RESERVATION_AUXILLARY_CHARGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CtReservationAuxillaryChargesRecord>> getKeys() {
        return Arrays.<UniqueKey<CtReservationAuxillaryChargesRecord>>asList(Keys.PK_CT_RESERVATION_AUXILLARY_CHARGES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtReservationAuxillaryCharges as(String alias) {
        return new CtReservationAuxillaryCharges(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtReservationAuxillaryCharges as(Name alias) {
        return new CtReservationAuxillaryCharges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CtReservationAuxillaryCharges rename(String name) {
        return new CtReservationAuxillaryCharges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CtReservationAuxillaryCharges rename(Name name) {
        return new CtReservationAuxillaryCharges(name, null);
    }
}
