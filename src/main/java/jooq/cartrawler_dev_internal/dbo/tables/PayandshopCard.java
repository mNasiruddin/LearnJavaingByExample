/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.PayandshopCardRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;


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
public class PayandshopCard extends TableImpl<PayandshopCardRecord> {

    private static final long serialVersionUID = -2032228847;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.PayandShop_Card</code>
     */
    public static final PayandshopCard PAYANDSHOP_CARD = new PayandshopCard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayandshopCardRecord> getRecordType() {
        return PayandshopCardRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.id</code>.
     */
    public final TableField<PayandshopCardRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.payment_method_type</code>.
     */
    public final TableField<PayandshopCardRecord, UByte> PAYMENT_METHOD_TYPE = createField("payment_method_type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.card_name</code>.
     */
    public final TableField<PayandshopCardRecord, String> CARD_NAME = createField("card_name", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.card_id</code>.
     */
    public final TableField<PayandshopCardRecord, Integer> CARD_ID = createField("card_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.card_first_six</code>.
     */
    public final TableField<PayandshopCardRecord, String> CARD_FIRST_SIX = createField("card_first_six", org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.card_number</code>.
     */
    public final TableField<PayandshopCardRecord, String> CARD_NUMBER = createField("card_number", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.card_date</code>.
     */
    public final TableField<PayandshopCardRecord, String> CARD_DATE = createField("card_date", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.narrative</code>.
     */
    public final TableField<PayandshopCardRecord, String> NARRATIVE = createField("narrative", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.realex_pass_ref</code>.
     */
    public final TableField<PayandshopCardRecord, String> REALEX_PASS_REF = createField("realex_pass_ref", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.realex_card_ref</code>.
     */
    public final TableField<PayandshopCardRecord, String> REALEX_CARD_REF = createField("realex_card_ref", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.payment_provider</code>.
     */
    public final TableField<PayandshopCardRecord, Short> PAYMENT_PROVIDER = createField("payment_provider", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Card.encrypted_card_number</code>.
     */
    public final TableField<PayandshopCardRecord, String> ENCRYPTED_CARD_NUMBER = createField("encrypted_card_number", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.PayandShop_Card</code> table reference
     */
    public PayandshopCard() {
        this(DSL.name("PayandShop_Card"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PayandShop_Card</code> table reference
     */
    public PayandshopCard(String alias) {
        this(DSL.name(alias), PAYANDSHOP_CARD);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PayandShop_Card</code> table reference
     */
    public PayandshopCard(Name alias) {
        this(alias, PAYANDSHOP_CARD);
    }

    private PayandshopCard(Name alias, Table<PayandshopCardRecord> aliased) {
        this(alias, aliased, null);
    }

    private PayandshopCard(Name alias, Table<PayandshopCardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PayandshopCard(Table<O> child, ForeignKey<O, PayandshopCardRecord> key) {
        super(child, key, PAYANDSHOP_CARD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PAYANDSHOP_CARD_PK_PAYANDSHOP_CARD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PayandshopCardRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PAYANDSHOP_CARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PayandshopCardRecord> getPrimaryKey() {
        return Keys.PK_PAYANDSHOP_CARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PayandshopCardRecord>> getKeys() {
        return Arrays.<UniqueKey<PayandshopCardRecord>>asList(Keys.PK_PAYANDSHOP_CARD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayandshopCard as(String alias) {
        return new PayandshopCard(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayandshopCard as(Name alias) {
        return new PayandshopCard(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PayandshopCard rename(String name) {
        return new PayandshopCard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PayandshopCard rename(Name name) {
        return new PayandshopCard(name, null);
    }
}
