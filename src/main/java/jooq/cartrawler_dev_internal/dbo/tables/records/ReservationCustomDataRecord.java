/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationCustomData;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ReservationCustomDataRecord extends UpdatableRecordImpl<ReservationCustomDataRecord> implements Record5<UUID, Integer, String, byte[], String> {

    private static final long serialVersionUID = 1371347493;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.ref</code>.
     */
    public void setRef(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.data</code>.
     */
    public void setData(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.data</code>.
     */
    public byte[] getData() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.partnerEmail</code>.
     */
    public void setPartneremail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_Custom_Data.partnerEmail</code>.
     */
    public String getPartneremail() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, String, byte[], String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, String, byte[], String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return ReservationCustomData.RESERVATION_CUSTOM_DATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationCustomData.RESERVATION_CUSTOM_DATA.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReservationCustomData.RESERVATION_CUSTOM_DATA.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return ReservationCustomData.RESERVATION_CUSTOM_DATA.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReservationCustomData.RESERVATION_CUSTOM_DATA.PARTNEREMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPartneremail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPartneremail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCustomDataRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCustomDataRecord value2(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCustomDataRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCustomDataRecord value4(byte... value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCustomDataRecord value5(String value) {
        setPartneremail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCustomDataRecord values(UUID value1, Integer value2, String value3, byte[] value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationCustomDataRecord
     */
    public ReservationCustomDataRecord() {
        super(ReservationCustomData.RESERVATION_CUSTOM_DATA);
    }

    /**
     * Create a detached, initialised ReservationCustomDataRecord
     */
    public ReservationCustomDataRecord(UUID id, Integer ref, String type, byte[] data, String partneremail) {
        super(ReservationCustomData.RESERVATION_CUSTOM_DATA);

        set(0, id);
        set(1, ref);
        set(2, type);
        set(3, data);
        set(4, partneremail);
    }
}
