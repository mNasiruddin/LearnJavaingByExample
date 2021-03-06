/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.DsSwapCarLkp;

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
public class DsSwapCarLkpRecord extends UpdatableRecordImpl<DsSwapCarLkpRecord> implements Record7<Integer, Integer, String, Integer, Integer, String, Integer> {

    private static final long serialVersionUID = -59024519;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.test_id</code>.
     */
    public void setTestId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.test_id</code>.
     */
    public Integer getTestId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.test_bucket</code>.
     */
    public void setTestBucket(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.test_bucket</code>.
     */
    public String getTestBucket() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.region_id</code>.
     */
    public void setRegionId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.region_id</code>.
     */
    public Integer getRegionId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.group_name</code>.
     */
    public void setGroupName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.group_name</code>.
     */
    public String getGroupName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.car_id</code>.
     */
    public void setCarId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ds_swap_car_lkp.car_id</code>.
     */
    public Integer getCarId() {
        return (Integer) get(6);
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
    public Row7<Integer, Integer, String, Integer, Integer, String, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Integer, String, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DsSwapCarLkp.DS_SWAP_CAR_LKP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DsSwapCarLkp.DS_SWAP_CAR_LKP.TEST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DsSwapCarLkp.DS_SWAP_CAR_LKP.TEST_BUCKET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DsSwapCarLkp.DS_SWAP_CAR_LKP.REGION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return DsSwapCarLkp.DS_SWAP_CAR_LKP.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DsSwapCarLkp.DS_SWAP_CAR_LKP.GROUP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return DsSwapCarLkp.DS_SWAP_CAR_LKP.CAR_ID;
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
        return getTestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTestBucket();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCarId();
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
        return getTestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTestBucket();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCarId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsSwapCarLkpRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsSwapCarLkpRecord value2(Integer value) {
        setTestId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsSwapCarLkpRecord value3(String value) {
        setTestBucket(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsSwapCarLkpRecord value4(Integer value) {
        setRegionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsSwapCarLkpRecord value5(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsSwapCarLkpRecord value6(String value) {
        setGroupName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsSwapCarLkpRecord value7(Integer value) {
        setCarId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsSwapCarLkpRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, String value6, Integer value7) {
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
     * Create a detached DsSwapCarLkpRecord
     */
    public DsSwapCarLkpRecord() {
        super(DsSwapCarLkp.DS_SWAP_CAR_LKP);
    }

    /**
     * Create a detached, initialised DsSwapCarLkpRecord
     */
    public DsSwapCarLkpRecord(Integer id, Integer testId, String testBucket, Integer regionId, Integer carAgentId, String groupName, Integer carId) {
        super(DsSwapCarLkp.DS_SWAP_CAR_LKP);

        set(0, id);
        set(1, testId);
        set(2, testBucket);
        set(3, regionId);
        set(4, carAgentId);
        set(5, groupName);
        set(6, carId);
    }
}
