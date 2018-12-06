/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Sysarticleupdates;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class SysarticleupdatesRecord extends TableRecordImpl<SysarticleupdatesRecord> implements Record10<Integer, Integer, Integer, Integer, Integer, Boolean, Integer, Integer, Integer, Boolean> {

    private static final long serialVersionUID = 1565261537;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.artid</code>.
     */
    public void setArtid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.artid</code>.
     */
    public Integer getArtid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.pubid</code>.
     */
    public void setPubid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.pubid</code>.
     */
    public Integer getPubid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.sync_ins_proc</code>.
     */
    public void setSyncInsProc(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.sync_ins_proc</code>.
     */
    public Integer getSyncInsProc() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.sync_upd_proc</code>.
     */
    public void setSyncUpdProc(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.sync_upd_proc</code>.
     */
    public Integer getSyncUpdProc() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.sync_del_proc</code>.
     */
    public void setSyncDelProc(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.sync_del_proc</code>.
     */
    public Integer getSyncDelProc() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.autogen</code>.
     */
    public void setAutogen(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.autogen</code>.
     */
    public Boolean getAutogen() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.sync_upd_trig</code>.
     */
    public void setSyncUpdTrig(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.sync_upd_trig</code>.
     */
    public Integer getSyncUpdTrig() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.conflict_tableid</code>.
     */
    public void setConflictTableid(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.conflict_tableid</code>.
     */
    public Integer getConflictTableid() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.ins_conflict_proc</code>.
     */
    public void setInsConflictProc(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.ins_conflict_proc</code>.
     */
    public Integer getInsConflictProc() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.identity_support</code>.
     */
    public void setIdentitySupport(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sysarticleupdates.identity_support</code>.
     */
    public Boolean getIdentitySupport() {
        return (Boolean) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, Integer, Boolean, Integer, Integer, Integer, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, Integer, Boolean, Integer, Integer, Integer, Boolean> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Sysarticleupdates.SYSARTICLEUPDATES.ARTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Sysarticleupdates.SYSARTICLEUPDATES.PUBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Sysarticleupdates.SYSARTICLEUPDATES.SYNC_INS_PROC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Sysarticleupdates.SYSARTICLEUPDATES.SYNC_UPD_PROC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Sysarticleupdates.SYSARTICLEUPDATES.SYNC_DEL_PROC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Sysarticleupdates.SYSARTICLEUPDATES.AUTOGEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Sysarticleupdates.SYSARTICLEUPDATES.SYNC_UPD_TRIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Sysarticleupdates.SYSARTICLEUPDATES.CONFLICT_TABLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Sysarticleupdates.SYSARTICLEUPDATES.INS_CONFLICT_PROC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Sysarticleupdates.SYSARTICLEUPDATES.IDENTITY_SUPPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getArtid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getPubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSyncInsProc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getSyncUpdProc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSyncDelProc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getAutogen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getSyncUpdTrig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getConflictTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getInsConflictProc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getIdentitySupport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getArtid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getPubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSyncInsProc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSyncUpdProc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSyncDelProc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getAutogen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSyncUpdTrig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getConflictTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getInsConflictProc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getIdentitySupport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value1(Integer value) {
        setArtid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value2(Integer value) {
        setPubid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value3(Integer value) {
        setSyncInsProc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value4(Integer value) {
        setSyncUpdProc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value5(Integer value) {
        setSyncDelProc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value6(Boolean value) {
        setAutogen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value7(Integer value) {
        setSyncUpdTrig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value8(Integer value) {
        setConflictTableid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value9(Integer value) {
        setInsConflictProc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord value10(Boolean value) {
        setIdentitySupport(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysarticleupdatesRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Boolean value6, Integer value7, Integer value8, Integer value9, Boolean value10) {
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
     * Create a detached SysarticleupdatesRecord
     */
    public SysarticleupdatesRecord() {
        super(Sysarticleupdates.SYSARTICLEUPDATES);
    }

    /**
     * Create a detached, initialised SysarticleupdatesRecord
     */
    public SysarticleupdatesRecord(Integer artid, Integer pubid, Integer syncInsProc, Integer syncUpdProc, Integer syncDelProc, Boolean autogen, Integer syncUpdTrig, Integer conflictTableid, Integer insConflictProc, Boolean identitySupport) {
        super(Sysarticleupdates.SYSARTICLEUPDATES);

        set(0, artid);
        set(1, pubid);
        set(2, syncInsProc);
        set(3, syncUpdProc);
        set(4, syncDelProc);
        set(5, autogen);
        set(6, syncUpdTrig);
        set(7, conflictTableid);
        set(8, insConflictProc);
        set(9, identitySupport);
    }
}
