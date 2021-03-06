/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.PlancontractspecialoffersRecord;

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
public class Plancontractspecialoffers extends TableImpl<PlancontractspecialoffersRecord> {

    private static final long serialVersionUID = -1141791365;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers</code>
     */
    public static final Plancontractspecialoffers PLANCONTRACTSPECIALOFFERS = new Plancontractspecialoffers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlancontractspecialoffersRecord> getRecordType() {
        return PlancontractspecialoffersRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.guid</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.id</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.effectiveFrom</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Timestamp> EFFECTIVEFROM = createField("effectiveFrom", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.effectiveTo</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Timestamp> EFFECTIVETO = createField("effectiveTo", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.pickupFrom</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Timestamp> PICKUPFROM = createField("pickupFrom", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.pickupTo</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Timestamp> PICKUPTO = createField("pickupTo", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.fk_virtualLocation</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Integer> FK_VIRTUALLOCATION = createField("fk_virtualLocation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.fk_location</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Integer> FK_LOCATION = createField("fk_location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerType</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> OFFERTYPE = createField("offerType", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerText</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> OFFERTEXT = createField("offerText", org.jooq.impl.SQLDataType.VARCHAR(400), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerTextVerbose</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> OFFERTEXTVERBOSE = createField("offerTextVerbose", org.jooq.impl.SQLDataType.VARCHAR(3000), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.fk_contract</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Integer> FK_CONTRACT = createField("fk_contract", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.SIPPList</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> SIPPLIST = createField("SIPPList", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.minDays</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Integer> MINDAYS = createField("minDays", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.maxDays</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Integer> MAXDAYS = createField("maxDays", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.amendedBy</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerHtmlVerbose</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> OFFERHTMLVERBOSE = createField("offerHtmlVerbose", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerImageURL</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> OFFERIMAGEURL = createField("offerImageURL", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.so_friendly_name</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> SO_FRIENDLY_NAME = createField("so_friendly_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.ui_token</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> UI_TOKEN = createField("ui_token", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.text_sub</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> TEXT_SUB = createField("text_sub", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.supplier</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> SUPPLIER = createField("supplier", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.country_id</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.dailyCost</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, BigDecimal> DAILYCOST = createField("dailyCost", org.jooq.impl.SQLDataType.NUMERIC(6, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.maxCost</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, BigDecimal> MAXCOST = createField("maxCost", org.jooq.impl.SQLDataType.NUMERIC(6, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerCur</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, String> OFFERCUR = createField("offerCur", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.publicOffer</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Boolean> PUBLICOFFER = createField("publicOffer", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.inFeed</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Boolean> INFEED = createField("inFeed", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.isOneTime</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Boolean> ISONETIME = createField("isOneTime", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.display_only</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Boolean> DISPLAY_ONLY = createField("display_only", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.supOptSaleFlag</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Boolean> SUPOPTSALEFLAG = createField("supOptSaleFlag", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.create_date</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.deal_of_the_day</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Boolean> DEAL_OF_THE_DAY = createField("deal_of_the_day", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.displayOrder</code>.
     */
    public final TableField<PlancontractspecialoffersRecord, Integer> DISPLAYORDER = createField("displayOrder", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers</code> table reference
     */
    public Plancontractspecialoffers() {
        this(DSL.name("PlanContractSpecialOffers"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers</code> table reference
     */
    public Plancontractspecialoffers(String alias) {
        this(DSL.name(alias), PLANCONTRACTSPECIALOFFERS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers</code> table reference
     */
    public Plancontractspecialoffers(Name alias) {
        this(alias, PLANCONTRACTSPECIALOFFERS);
    }

    private Plancontractspecialoffers(Name alias, Table<PlancontractspecialoffersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plancontractspecialoffers(Name alias, Table<PlancontractspecialoffersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Plancontractspecialoffers(Table<O> child, ForeignKey<O, PlancontractspecialoffersRecord> key) {
        super(child, key, PLANCONTRACTSPECIALOFFERS);
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
        return Arrays.<Index>asList(Indexes.PLANCONTRACTSPECIALOFFERS_PK_PLANCONTRACTSPECIALOFFERS_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PlancontractspecialoffersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PLANCONTRACTSPECIALOFFERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlancontractspecialoffersRecord> getPrimaryKey() {
        return Keys.PK_PLANCONTRACTSPECIALOFFERS_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlancontractspecialoffersRecord>> getKeys() {
        return Arrays.<UniqueKey<PlancontractspecialoffersRecord>>asList(Keys.PK_PLANCONTRACTSPECIALOFFERS_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plancontractspecialoffers as(String alias) {
        return new Plancontractspecialoffers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plancontractspecialoffers as(Name alias) {
        return new Plancontractspecialoffers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plancontractspecialoffers rename(String name) {
        return new Plancontractspecialoffers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plancontractspecialoffers rename(Name name) {
        return new Plancontractspecialoffers(name, null);
    }
}
