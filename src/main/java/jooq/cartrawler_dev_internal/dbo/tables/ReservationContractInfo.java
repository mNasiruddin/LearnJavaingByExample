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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationContractInfoRecord;

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
public class ReservationContractInfo extends TableImpl<ReservationContractInfoRecord> {

    private static final long serialVersionUID = -1248955359;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_contract_info</code>
     */
    public static final ReservationContractInfo RESERVATION_CONTRACT_INFO = new ReservationContractInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationContractInfoRecord> getRecordType() {
        return ReservationContractInfoRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.id</code>.
     */
    public final TableField<ReservationContractInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.fk_reservation</code>.
     */
    public final TableField<ReservationContractInfoRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.guid</code>.
     */
    public final TableField<ReservationContractInfoRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.prepaidAcc</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> PREPAIDACC = createField("prepaidAcc", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.contract</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> CONTRACT = createField("contract", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.iata</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> IATA = createField("iata", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.extendedProperties</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> EXTENDEDPROPERTIES = createField("extendedProperties", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.fk_plan</code>.
     */
    public final TableField<ReservationContractInfoRecord, UUID> FK_PLAN = createField("fk_plan", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.fk_planContract</code>.
     */
    public final TableField<ReservationContractInfoRecord, UUID> FK_PLANCONTRACT = createField("fk_planContract", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.retail_commission</code>.
     */
    public final TableField<ReservationContractInfoRecord, BigDecimal> RETAIL_COMMISSION = createField("retail_commission", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.booking_language</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> BOOKING_LANGUAGE = createField("booking_language", org.jooq.impl.SQLDataType.CHAR(5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.rateCode</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> RATECODE = createField("rateCode", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.txid</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> TXID = createField("txid", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.clientInterface</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> CLIENTINTERFACE = createField("clientInterface", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.rebate_type</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> REBATE_TYPE = createField("rebate_type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.rebate_amount</code>.
     */
    public final TableField<ReservationContractInfoRecord, BigDecimal> REBATE_AMOUNT = createField("rebate_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.rebate_currency</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> REBATE_CURRENCY = createField("rebate_currency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.calculated_rebate</code>.
     */
    public final TableField<ReservationContractInfoRecord, BigDecimal> CALCULATED_REBATE = createField("calculated_rebate", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.rebate_in_price</code>.
     */
    public final TableField<ReservationContractInfoRecord, Boolean> REBATE_IN_PRICE = createField("rebate_in_price", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.promoVendorCode</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> PROMOVENDORCODE = createField("promoVendorCode", org.jooq.impl.SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.loyaltyProgram</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> LOYALTYPROGRAM = createField("loyaltyProgram", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.loyaltyNum</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> LOYALTYNUM = createField("loyaltyNum", org.jooq.impl.SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.contract_class</code>.
     */
    public final TableField<ReservationContractInfoRecord, Short> CONTRACT_CLASS = createField("contract_class", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.isSwitchContract</code>.
     */
    public final TableField<ReservationContractInfoRecord, Boolean> ISSWITCHCONTRACT = createField("isSwitchContract", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.bookedByDC</code>.
     */
    public final TableField<ReservationContractInfoRecord, Boolean> BOOKEDBYDC = createField("bookedByDC", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.isCorporate</code>.
     */
    public final TableField<ReservationContractInfoRecord, Boolean> ISCORPORATE = createField("isCorporate", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.emv</code>.
     */
    public final TableField<ReservationContractInfoRecord, BigDecimal> EMV = createField("emv", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.commType</code>.
     */
    public final TableField<ReservationContractInfoRecord, Short> COMMTYPE = createField("commType", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.frozen</code>.
     */
    public final TableField<ReservationContractInfoRecord, UByte> FROZEN = createField("frozen", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.flags</code>.
     */
    public final TableField<ReservationContractInfoRecord, UByte> FLAGS = createField("flags", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.supplier_cancel_datetime</code>.
     */
    public final TableField<ReservationContractInfoRecord, Timestamp> SUPPLIER_CANCEL_DATETIME = createField("supplier_cancel_datetime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.productType</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> PRODUCTTYPE = createField("productType", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.productType2</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> PRODUCTTYPE2 = createField("productType2", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.fk_brandplatform</code>.
     */
    public final TableField<ReservationContractInfoRecord, Integer> FK_BRANDPLATFORM = createField("fk_brandplatform", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.fk_supplierbrandplatform</code>.
     */
    public final TableField<ReservationContractInfoRecord, Integer> FK_SUPPLIERBRANDPLATFORM = createField("fk_supplierbrandplatform", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.brand_platform_desc</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> BRAND_PLATFORM_DESC = createField("brand_platform_desc", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.insurance_txid</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> INSURANCE_TXID = createField("insurance_txid", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.businessType</code>.
     */
    public final TableField<ReservationContractInfoRecord, String> BUSINESSTYPE = createField("businessType", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.mor_by_contract</code>.
     */
    public final TableField<ReservationContractInfoRecord, Boolean> MOR_BY_CONTRACT = createField("mor_by_contract", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_contract_info.supplier_mor</code>.
     */
    public final TableField<ReservationContractInfoRecord, Boolean> SUPPLIER_MOR = createField("supplier_mor", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_contract_info</code> table reference
     */
    public ReservationContractInfo() {
        this(DSL.name("reservation_contract_info"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_contract_info</code> table reference
     */
    public ReservationContractInfo(String alias) {
        this(DSL.name(alias), RESERVATION_CONTRACT_INFO);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_contract_info</code> table reference
     */
    public ReservationContractInfo(Name alias) {
        this(alias, RESERVATION_CONTRACT_INFO);
    }

    private ReservationContractInfo(Name alias, Table<ReservationContractInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationContractInfo(Name alias, Table<ReservationContractInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationContractInfo(Table<O> child, ForeignKey<O, ReservationContractInfoRecord> key) {
        super(child, key, RESERVATION_CONTRACT_INFO);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_CONTRACT_INFO_PK_RESERVATION_CONTRACT_INFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationContractInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_CONTRACT_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationContractInfoRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_CONTRACT_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationContractInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationContractInfoRecord>>asList(Keys.PK_RESERVATION_CONTRACT_INFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationContractInfo as(String alias) {
        return new ReservationContractInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationContractInfo as(Name alias) {
        return new ReservationContractInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationContractInfo rename(String name) {
        return new ReservationContractInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationContractInfo rename(Name name) {
        return new ReservationContractInfo(name, null);
    }
}
