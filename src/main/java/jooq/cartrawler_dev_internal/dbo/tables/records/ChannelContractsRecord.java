/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ChannelContracts;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ChannelContractsRecord extends UpdatableRecordImpl<ChannelContractsRecord> implements Record4<Integer, Integer, Integer, Short> {

    private static final long serialVersionUID = -1706816635;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.channel_contracts.ix</code>.
     */
    public void setIx(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.channel_contracts.ix</code>.
     */
    public Integer getIx() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.channel_contracts.fk_channel</code>.
     */
    public void setFkChannel(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.channel_contracts.fk_channel</code>.
     */
    public Integer getFkChannel() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.channel_contracts.fk_contract</code>.
     */
    public void setFkContract(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.channel_contracts.fk_contract</code>.
     */
    public Integer getFkContract() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.channel_contracts.style</code>.
     */
    public void setStyle(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.channel_contracts.style</code>.
     */
    public Short getStyle() {
        return (Short) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Short> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Short> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ChannelContracts.CHANNEL_CONTRACTS.IX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ChannelContracts.CHANNEL_CONTRACTS.FK_CHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ChannelContracts.CHANNEL_CONTRACTS.FK_CONTRACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return ChannelContracts.CHANNEL_CONTRACTS.STYLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFkChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkContract();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getStyle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFkChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkContract();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getStyle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelContractsRecord value1(Integer value) {
        setIx(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelContractsRecord value2(Integer value) {
        setFkChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelContractsRecord value3(Integer value) {
        setFkContract(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelContractsRecord value4(Short value) {
        setStyle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelContractsRecord values(Integer value1, Integer value2, Integer value3, Short value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChannelContractsRecord
     */
    public ChannelContractsRecord() {
        super(ChannelContracts.CHANNEL_CONTRACTS);
    }

    /**
     * Create a detached, initialised ChannelContractsRecord
     */
    public ChannelContractsRecord(Integer ix, Integer fkChannel, Integer fkContract, Short style) {
        super(ChannelContracts.CHANNEL_CONTRACTS);

        set(0, ix);
        set(1, fkChannel);
        set(2, fkContract);
        set(3, style);
    }
}
