/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.MspeerConflictdetectionconfigrequest;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class MspeerConflictdetectionconfigrequestRecord extends UpdatableRecordImpl<MspeerConflictdetectionconfigrequestRecord> implements Record7<Integer, String, Timestamp, Integer, Timestamp, String, Boolean> {

    private static final long serialVersionUID = -1859050302;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.publication</code>.
     */
    public void setPublication(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.publication</code>.
     */
    public String getPublication() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.sent_date</code>.
     */
    public void setSentDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.sent_date</code>.
     */
    public Timestamp getSentDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.timeout</code>.
     */
    public void setTimeout(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.timeout</code>.
     */
    public Integer getTimeout() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.modified_date</code>.
     */
    public void setModifiedDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.modified_date</code>.
     */
    public Timestamp getModifiedDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.progress_phase</code>.
     */
    public void setProgressPhase(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.progress_phase</code>.
     */
    public String getProgressPhase() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.phase_timed_out</code>.
     */
    public void setPhaseTimedOut(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigrequest.phase_timed_out</code>.
     */
    public Boolean getPhaseTimedOut() {
        return (Boolean) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, Integer, Timestamp, String, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, Integer, Timestamp, String, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MspeerConflictdetectionconfigrequest.MSPEER_CONFLICTDETECTIONCONFIGREQUEST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MspeerConflictdetectionconfigrequest.MSPEER_CONFLICTDETECTIONCONFIGREQUEST.PUBLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return MspeerConflictdetectionconfigrequest.MSPEER_CONFLICTDETECTIONCONFIGREQUEST.SENT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MspeerConflictdetectionconfigrequest.MSPEER_CONFLICTDETECTIONCONFIGREQUEST.TIMEOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return MspeerConflictdetectionconfigrequest.MSPEER_CONFLICTDETECTIONCONFIGREQUEST.MODIFIED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MspeerConflictdetectionconfigrequest.MSPEER_CONFLICTDETECTIONCONFIGREQUEST.PROGRESS_PHASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return MspeerConflictdetectionconfigrequest.MSPEER_CONFLICTDETECTIONCONFIGREQUEST.PHASE_TIMED_OUT;
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
    public String component2() {
        return getPublication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getSentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProgressPhase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getPhaseTimedOut();
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
    public String value2() {
        return getPublication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getSentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProgressPhase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getPhaseTimedOut();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigrequestRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigrequestRecord value2(String value) {
        setPublication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigrequestRecord value3(Timestamp value) {
        setSentDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigrequestRecord value4(Integer value) {
        setTimeout(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigrequestRecord value5(Timestamp value) {
        setModifiedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigrequestRecord value6(String value) {
        setProgressPhase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigrequestRecord value7(Boolean value) {
        setPhaseTimedOut(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigrequestRecord values(Integer value1, String value2, Timestamp value3, Integer value4, Timestamp value5, String value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MspeerConflictdetectionconfigrequestRecord
     */
    public MspeerConflictdetectionconfigrequestRecord() {
        super(MspeerConflictdetectionconfigrequest.MSPEER_CONFLICTDETECTIONCONFIGREQUEST);
    }

    /**
     * Create a detached, initialised MspeerConflictdetectionconfigrequestRecord
     */
    public MspeerConflictdetectionconfigrequestRecord(Integer id, String publication, Timestamp sentDate, Integer timeout, Timestamp modifiedDate, String progressPhase, Boolean phaseTimedOut) {
        super(MspeerConflictdetectionconfigrequest.MSPEER_CONFLICTDETECTIONCONFIGREQUEST);

        set(0, id);
        set(1, publication);
        set(2, sentDate);
        set(3, timeout);
        set(4, modifiedDate);
        set(5, progressPhase);
        set(6, phaseTimedOut);
    }
}
