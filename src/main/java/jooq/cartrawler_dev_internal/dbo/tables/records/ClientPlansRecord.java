/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ClientPlans;

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
public class ClientPlansRecord extends UpdatableRecordImpl<ClientPlansRecord> implements Record5<UUID, Integer, String, String, String> {

    private static final long serialVersionUID = -1677790619;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Client_Plans.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Client_Plans.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Client_Plans.Plan_ID</code>.
     */
    public void setPlanId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Client_Plans.Plan_ID</code>.
     */
    public Integer getPlanId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Client_Plans.Xml_Agent_Type</code>.
     */
    public void setXmlAgentType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Client_Plans.Xml_Agent_Type</code>.
     */
    public String getXmlAgentType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Client_Plans.Property</code>.
     */
    public void setProperty(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Client_Plans.Property</code>.
     */
    public String getProperty() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Client_Plans.Val</code>.
     */
    public void setVal(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Client_Plans.Val</code>.
     */
    public String getVal() {
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
    public Row5<UUID, Integer, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return ClientPlans.CLIENT_PLANS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ClientPlans.CLIENT_PLANS.PLAN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ClientPlans.CLIENT_PLANS.XML_AGENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ClientPlans.CLIENT_PLANS.PROPERTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ClientPlans.CLIENT_PLANS.VAL;
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
        return getPlanId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getXmlAgentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProperty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getVal();
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
        return getPlanId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getXmlAgentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProperty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientPlansRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientPlansRecord value2(Integer value) {
        setPlanId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientPlansRecord value3(String value) {
        setXmlAgentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientPlansRecord value4(String value) {
        setProperty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientPlansRecord value5(String value) {
        setVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientPlansRecord values(UUID value1, Integer value2, String value3, String value4, String value5) {
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
     * Create a detached ClientPlansRecord
     */
    public ClientPlansRecord() {
        super(ClientPlans.CLIENT_PLANS);
    }

    /**
     * Create a detached, initialised ClientPlansRecord
     */
    public ClientPlansRecord(UUID id, Integer planId, String xmlAgentType, String property, String val) {
        super(ClientPlans.CLIENT_PLANS);

        set(0, id);
        set(1, planId);
        set(2, xmlAgentType);
        set(3, property);
        set(4, val);
    }
}
