/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.RuleBak20170913;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class RuleBak20170913Record extends TableRecordImpl<RuleBak20170913Record> implements Record9<UUID, Integer, Integer, String, String, Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = -1313593359;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.rule_id</code>.
     */
    public void setRuleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.rule_id</code>.
     */
    public Integer getRuleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.parent_rule_id</code>.
     */
    public void setParentRuleId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.parent_rule_id</code>.
     */
    public Integer getParentRuleId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.rule_values</code>.
     */
    public void setRuleValues(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.rule_values</code>.
     */
    public String getRuleValues() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.rule_charge_id</code>.
     */
    public void setRuleChargeId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.rule_charge_id</code>.
     */
    public Integer getRuleChargeId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.rule_message_id</code>.
     */
    public void setRuleMessageId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.rule_message_id</code>.
     */
    public Integer getRuleMessageId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.amenddate</code>.
     */
    public void setAmenddate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_bak20170913.amenddate</code>.
     */
    public Timestamp getAmenddate() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UUID, Integer, Integer, String, String, Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UUID, Integer, Integer, String, String, Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return RuleBak20170913.RULE_BAK20170913.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RuleBak20170913.RULE_BAK20170913.RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RuleBak20170913.RULE_BAK20170913.PARENT_RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RuleBak20170913.RULE_BAK20170913.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return RuleBak20170913.RULE_BAK20170913.RULE_VALUES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return RuleBak20170913.RULE_BAK20170913.RULE_CHARGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return RuleBak20170913.RULE_BAK20170913.RULE_MESSAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return RuleBak20170913.RULE_BAK20170913.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return RuleBak20170913.RULE_BAK20170913.AMENDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getParentRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRuleValues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getRuleChargeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getRuleMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getAmenddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getParentRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRuleValues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRuleChargeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRuleMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getAmenddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record value2(Integer value) {
        setRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record value3(Integer value) {
        setParentRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record value5(String value) {
        setRuleValues(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record value6(Integer value) {
        setRuleChargeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record value7(Integer value) {
        setRuleMessageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record value8(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record value9(Timestamp value) {
        setAmenddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleBak20170913Record values(UUID value1, Integer value2, Integer value3, String value4, String value5, Integer value6, Integer value7, Integer value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RuleBak20170913Record
     */
    public RuleBak20170913Record() {
        super(RuleBak20170913.RULE_BAK20170913);
    }

    /**
     * Create a detached, initialised RuleBak20170913Record
     */
    public RuleBak20170913Record(UUID guid, Integer ruleId, Integer parentRuleId, String type, String ruleValues, Integer ruleChargeId, Integer ruleMessageId, Integer userId, Timestamp amenddate) {
        super(RuleBak20170913.RULE_BAK20170913);

        set(0, guid);
        set(1, ruleId);
        set(2, parentRuleId);
        set(3, type);
        set(4, ruleValues);
        set(5, ruleChargeId);
        set(6, ruleMessageId);
        set(7, userId);
        set(8, amenddate);
    }
}
