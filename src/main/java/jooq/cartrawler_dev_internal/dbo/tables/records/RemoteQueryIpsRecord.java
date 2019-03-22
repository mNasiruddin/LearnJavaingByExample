/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.RemoteQueryIps;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class RemoteQueryIpsRecord extends UpdatableRecordImpl<RemoteQueryIpsRecord> implements Record10<Long, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = -960438505;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.fk_remote_queries</code>.
     */
    public void setFkRemoteQueries(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.fk_remote_queries</code>.
     */
    public Long getFkRemoteQueries() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.consumerip</code>.
     */
    public void setConsumerip(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.consumerip</code>.
     */
    public Integer getConsumerip() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.proxyclientip</code>.
     */
    public void setProxyclientip(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.proxyclientip</code>.
     */
    public Integer getProxyclientip() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.clientip</code>.
     */
    public void setClientip(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.clientip</code>.
     */
    public Integer getClientip() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.responseTime</code>.
     */
    public void setResponsetime(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.responseTime</code>.
     */
    public Integer getResponsetime() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.physicalIP</code>.
     */
    public void setPhysicalip(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.physicalIP</code>.
     */
    public Integer getPhysicalip() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.fk_plan</code>.
     */
    public void setFkPlan(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.fk_plan</code>.
     */
    public Integer getFkPlan() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.pickup_agentLoc</code>.
     */
    public void setPickupAgentloc(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.pickup_agentLoc</code>.
     */
    public Integer getPickupAgentloc() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.dropoff_agentLoc</code>.
     */
    public void setDropoffAgentloc(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.dropoff_agentLoc</code>.
     */
    public Integer getDropoffAgentloc() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.querydate</code>.
     */
    public void setQuerydate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_ips.querydate</code>.
     */
    public Timestamp getQuerydate() {
        return (Timestamp) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.FK_REMOTE_QUERIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.CONSUMERIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.PROXYCLIENTIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.CLIENTIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.RESPONSETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.PHYSICALIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.FK_PLAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.PICKUP_AGENTLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.DROPOFF_AGENTLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return RemoteQueryIps.REMOTE_QUERY_IPS.QUERYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getFkRemoteQueries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getConsumerip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getProxyclientip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getClientip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getResponsetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPhysicalip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getFkPlan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getPickupAgentloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getDropoffAgentloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getQuerydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getFkRemoteQueries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getConsumerip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getProxyclientip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getClientip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getResponsetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPhysicalip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getFkPlan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getPickupAgentloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getDropoffAgentloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getQuerydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value1(Long value) {
        setFkRemoteQueries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value2(Integer value) {
        setConsumerip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value3(Integer value) {
        setProxyclientip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value4(Integer value) {
        setClientip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value5(Integer value) {
        setResponsetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value6(Integer value) {
        setPhysicalip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value7(Integer value) {
        setFkPlan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value8(Integer value) {
        setPickupAgentloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value9(Integer value) {
        setDropoffAgentloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord value10(Timestamp value) {
        setQuerydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryIpsRecord values(Long value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Timestamp value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RemoteQueryIpsRecord
     */
    public RemoteQueryIpsRecord() {
        super(RemoteQueryIps.REMOTE_QUERY_IPS);
    }

    /**
     * Create a detached, initialised RemoteQueryIpsRecord
     */
    public RemoteQueryIpsRecord(Long fkRemoteQueries, Integer consumerip, Integer proxyclientip, Integer clientip, Integer responsetime, Integer physicalip, Integer fkPlan, Integer pickupAgentloc, Integer dropoffAgentloc, Timestamp querydate) {
        super(RemoteQueryIps.REMOTE_QUERY_IPS);

        set(0, fkRemoteQueries);
        set(1, consumerip);
        set(2, proxyclientip);
        set(3, clientip);
        set(4, responsetime);
        set(5, physicalip);
        set(6, fkPlan);
        set(7, pickupAgentloc);
        set(8, dropoffAgentloc);
        set(9, querydate);
    }
}