/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Emailruleresstatus;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class EmailruleresstatusRecord extends UpdatableRecordImpl<EmailruleresstatusRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = -798895066;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRuleResStatus.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRuleResStatus.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRuleResStatus.fk_emailrule</code>.
     */
    public void setFkEmailrule(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRuleResStatus.fk_emailrule</code>.
     */
    public Integer getFkEmailrule() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRuleResStatus.reservation_status</code>.
     */
    public void setReservationStatus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRuleResStatus.reservation_status</code>.
     */
    public String getReservationStatus() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Emailruleresstatus.EMAILRULERESSTATUS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Emailruleresstatus.EMAILRULERESSTATUS.FK_EMAILRULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Emailruleresstatus.EMAILRULERESSTATUS.RESERVATION_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFkEmailrule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getReservationStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFkEmailrule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReservationStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailruleresstatusRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailruleresstatusRecord value2(Integer value) {
        setFkEmailrule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailruleresstatusRecord value3(String value) {
        setReservationStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailruleresstatusRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailruleresstatusRecord
     */
    public EmailruleresstatusRecord() {
        super(Emailruleresstatus.EMAILRULERESSTATUS);
    }

    /**
     * Create a detached, initialised EmailruleresstatusRecord
     */
    public EmailruleresstatusRecord(Integer id, Integer fkEmailrule, String reservationStatus) {
        super(Emailruleresstatus.EMAILRULERESSTATUS);

        set(0, id);
        set(1, fkEmailrule);
        set(2, reservationStatus);
    }
}
