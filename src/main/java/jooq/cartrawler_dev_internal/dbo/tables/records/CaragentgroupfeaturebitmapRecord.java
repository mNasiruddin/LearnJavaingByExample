/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Caragentgroupfeaturebitmap;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class CaragentgroupfeaturebitmapRecord extends UpdatableRecordImpl<CaragentgroupfeaturebitmapRecord> implements Record6<Integer, Integer, String, Integer, String, Boolean> {

    private static final long serialVersionUID = -1036753992;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.fk_otaCodeTableId</code>.
     */
    public void setFkOtacodetableid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.fk_otaCodeTableId</code>.
     */
    public Integer getFkOtacodetableid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.featureName</code>.
     */
    public void setFeaturename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.featureName</code>.
     */
    public String getFeaturename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.bitIndex</code>.
     */
    public void setBitindex(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.bitIndex</code>.
     */
    public Integer getBitindex() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.displayName</code>.
     */
    public void setDisplayname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.displayName</code>.
     */
    public String getDisplayname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.live</code>.
     */
    public void setLive(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.CarAgentGroupFeatureBitMap.live</code>.
     */
    public Boolean getLive() {
        return (Boolean) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Integer, String, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Integer, String, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Caragentgroupfeaturebitmap.CARAGENTGROUPFEATUREBITMAP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Caragentgroupfeaturebitmap.CARAGENTGROUPFEATUREBITMAP.FK_OTACODETABLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Caragentgroupfeaturebitmap.CARAGENTGROUPFEATUREBITMAP.FEATURENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Caragentgroupfeaturebitmap.CARAGENTGROUPFEATUREBITMAP.BITINDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Caragentgroupfeaturebitmap.CARAGENTGROUPFEATUREBITMAP.DISPLAYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Caragentgroupfeaturebitmap.CARAGENTGROUPFEATUREBITMAP.LIVE;
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
        return getFkOtacodetableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFeaturename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBitindex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDisplayname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getLive();
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
        return getFkOtacodetableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFeaturename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBitindex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDisplayname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getLive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaragentgroupfeaturebitmapRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaragentgroupfeaturebitmapRecord value2(Integer value) {
        setFkOtacodetableid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaragentgroupfeaturebitmapRecord value3(String value) {
        setFeaturename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaragentgroupfeaturebitmapRecord value4(Integer value) {
        setBitindex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaragentgroupfeaturebitmapRecord value5(String value) {
        setDisplayname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaragentgroupfeaturebitmapRecord value6(Boolean value) {
        setLive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaragentgroupfeaturebitmapRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CaragentgroupfeaturebitmapRecord
     */
    public CaragentgroupfeaturebitmapRecord() {
        super(Caragentgroupfeaturebitmap.CARAGENTGROUPFEATUREBITMAP);
    }

    /**
     * Create a detached, initialised CaragentgroupfeaturebitmapRecord
     */
    public CaragentgroupfeaturebitmapRecord(Integer id, Integer fkOtacodetableid, String featurename, Integer bitindex, String displayname, Boolean live) {
        super(Caragentgroupfeaturebitmap.CARAGENTGROUPFEATUREBITMAP);

        set(0, id);
        set(1, fkOtacodetableid);
        set(2, featurename);
        set(3, bitindex);
        set(4, displayname);
        set(5, live);
    }
}
