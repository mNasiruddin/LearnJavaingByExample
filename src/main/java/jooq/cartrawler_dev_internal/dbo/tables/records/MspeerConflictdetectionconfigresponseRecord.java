/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.MspeerConflictdetectionconfigresponse;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


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
public class MspeerConflictdetectionconfigresponseRecord extends TableRecordImpl<MspeerConflictdetectionconfigresponseRecord> implements Record13<Integer, String, String, Integer, Integer, Boolean, Boolean, Integer, Integer, Boolean, Object, String, Timestamp> {

    private static final long serialVersionUID = 862708161;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.request_id</code>.
     */
    public void setRequestId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.request_id</code>.
     */
    public Integer getRequestId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_node</code>.
     */
    public void setPeerNode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_node</code>.
     */
    public String getPeerNode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_db</code>.
     */
    public void setPeerDb(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_db</code>.
     */
    public String getPeerDb() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_version</code>.
     */
    public void setPeerVersion(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_version</code>.
     */
    public Integer getPeerVersion() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_db_version</code>.
     */
    public void setPeerDbVersion(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_db_version</code>.
     */
    public Integer getPeerDbVersion() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.is_peer</code>.
     */
    public void setIsPeer(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.is_peer</code>.
     */
    public Boolean getIsPeer() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.conflictdetection_enabled</code>.
     */
    public void setConflictdetectionEnabled(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.conflictdetection_enabled</code>.
     */
    public Boolean getConflictdetectionEnabled() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.originator_id</code>.
     */
    public void setOriginatorId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.originator_id</code>.
     */
    public Integer getOriginatorId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_conflict_retention</code>.
     */
    public void setPeerConflictRetention(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_conflict_retention</code>.
     */
    public Integer getPeerConflictRetention() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_continue_onconflict</code>.
     */
    public void setPeerContinueOnconflict(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_continue_onconflict</code>.
     */
    public Boolean getPeerContinueOnconflict() {
        return (Boolean) get(9);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPeerSubscriptions(Object value) {
        set(10, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPeerSubscriptions() {
        return get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.progress_phase</code>.
     */
    public void setProgressPhase(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.progress_phase</code>.
     */
    public String getProgressPhase() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.modified_date</code>.
     */
    public void setModifiedDate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.modified_date</code>.
     */
    public Timestamp getModifiedDate() {
        return (Timestamp) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, Integer, Integer, Boolean, Boolean, Integer, Integer, Boolean, Object, String, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, Integer, Integer, Boolean, Boolean, Integer, Integer, Boolean, Object, String, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.REQUEST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.PEER_NODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.PEER_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.PEER_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.PEER_DB_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.IS_PEER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.CONFLICTDETECTION_ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.ORIGINATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.PEER_CONFLICT_RETENTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.PEER_CONTINUE_ONCONFLICT;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field11() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.PEER_SUBSCRIPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.PROGRESS_PHASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE.MODIFIED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRequestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPeerNode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPeerDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPeerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPeerDbVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getIsPeer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getConflictdetectionEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getOriginatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getPeerConflictRetention();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getPeerContinueOnconflict();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component11() {
        return getPeerSubscriptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getProgressPhase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRequestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPeerNode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPeerDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPeerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPeerDbVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getIsPeer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getConflictdetectionEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOriginatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getPeerConflictRetention();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getPeerContinueOnconflict();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value11() {
        return getPeerSubscriptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getProgressPhase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value1(Integer value) {
        setRequestId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value2(String value) {
        setPeerNode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value3(String value) {
        setPeerDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value4(Integer value) {
        setPeerVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value5(Integer value) {
        setPeerDbVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value6(Boolean value) {
        setIsPeer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value7(Boolean value) {
        setConflictdetectionEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value8(Integer value) {
        setOriginatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value9(Integer value) {
        setPeerConflictRetention(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value10(Boolean value) {
        setPeerContinueOnconflict(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public MspeerConflictdetectionconfigresponseRecord value11(Object value) {
        setPeerSubscriptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value12(String value) {
        setProgressPhase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord value13(Timestamp value) {
        setModifiedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponseRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Boolean value6, Boolean value7, Integer value8, Integer value9, Boolean value10, Object value11, String value12, Timestamp value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MspeerConflictdetectionconfigresponseRecord
     */
    public MspeerConflictdetectionconfigresponseRecord() {
        super(MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE);
    }

    /**
     * Create a detached, initialised MspeerConflictdetectionconfigresponseRecord
     */
    public MspeerConflictdetectionconfigresponseRecord(Integer requestId, String peerNode, String peerDb, Integer peerVersion, Integer peerDbVersion, Boolean isPeer, Boolean conflictdetectionEnabled, Integer originatorId, Integer peerConflictRetention, Boolean peerContinueOnconflict, Object peerSubscriptions, String progressPhase, Timestamp modifiedDate) {
        super(MspeerConflictdetectionconfigresponse.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE);

        set(0, requestId);
        set(1, peerNode);
        set(2, peerDb);
        set(3, peerVersion);
        set(4, peerDbVersion);
        set(5, isPeer);
        set(6, conflictdetectionEnabled);
        set(7, originatorId);
        set(8, peerConflictRetention);
        set(9, peerContinueOnconflict);
        set(10, peerSubscriptions);
        set(11, progressPhase);
        set(12, modifiedDate);
    }
}
