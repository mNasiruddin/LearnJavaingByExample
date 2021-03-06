/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ChannelpricingcontrolsDeletes;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class ChannelpricingcontrolsDeletesRecord extends TableRecordImpl<ChannelpricingcontrolsDeletesRecord> implements Record3<Long, Timestamp, String> {

    private static final long serialVersionUID = -1821540757;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingControls_Deletes.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingControls_Deletes.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingControls_Deletes.deleteDate</code>.
     */
    public void setDeletedate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingControls_Deletes.deleteDate</code>.
     */
    public Timestamp getDeletedate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ChannelPricingControls_Deletes.channelPriceIds</code>.
     */
    public void setChannelpriceids(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ChannelPricingControls_Deletes.channelPriceIds</code>.
     */
    public String getChannelpriceids() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Timestamp, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Timestamp, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ChannelpricingcontrolsDeletes.CHANNELPRICINGCONTROLS_DELETES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ChannelpricingcontrolsDeletes.CHANNELPRICINGCONTROLS_DELETES.DELETEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ChannelpricingcontrolsDeletes.CHANNELPRICINGCONTROLS_DELETES.CHANNELPRICEIDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getDeletedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getChannelpriceids();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getDeletedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getChannelpriceids();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcontrolsDeletesRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcontrolsDeletesRecord value2(Timestamp value) {
        setDeletedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcontrolsDeletesRecord value3(String value) {
        setChannelpriceids(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelpricingcontrolsDeletesRecord values(Long value1, Timestamp value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChannelpricingcontrolsDeletesRecord
     */
    public ChannelpricingcontrolsDeletesRecord() {
        super(ChannelpricingcontrolsDeletes.CHANNELPRICINGCONTROLS_DELETES);
    }

    /**
     * Create a detached, initialised ChannelpricingcontrolsDeletesRecord
     */
    public ChannelpricingcontrolsDeletesRecord(Long id, Timestamp deletedate, String channelpriceids) {
        super(ChannelpricingcontrolsDeletes.CHANNELPRICINGCONTROLS_DELETES);

        set(0, id);
        set(1, deletedate);
        set(2, channelpriceids);
    }
}
