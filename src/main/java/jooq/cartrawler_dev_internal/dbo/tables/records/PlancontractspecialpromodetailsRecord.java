/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Plancontractspecialpromodetails;

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
public class PlancontractspecialpromodetailsRecord extends UpdatableRecordImpl<PlancontractspecialpromodetailsRecord> implements Record6<UUID, Integer, String, String, Integer, Integer> {

    private static final long serialVersionUID = -33138751;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.ct_promo_code</code>.
     */
    public void setCtPromoCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.ct_promo_code</code>.
     */
    public String getCtPromoCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.supplier_promo_code</code>.
     */
    public void setSupplierPromoCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.supplier_promo_code</code>.
     */
    public String getSupplierPromoCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.fk_contract</code>.
     */
    public void setFkContract(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.fk_contract</code>.
     */
    public Integer getFkContract() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.fk_offer</code>.
     */
    public void setFkOffer(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialPromoDetails.fk_offer</code>.
     */
    public Integer getFkOffer() {
        return (Integer) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, String, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, String, String, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Plancontractspecialpromodetails.PLANCONTRACTSPECIALPROMODETAILS.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Plancontractspecialpromodetails.PLANCONTRACTSPECIALPROMODETAILS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Plancontractspecialpromodetails.PLANCONTRACTSPECIALPROMODETAILS.CT_PROMO_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Plancontractspecialpromodetails.PLANCONTRACTSPECIALPROMODETAILS.SUPPLIER_PROMO_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Plancontractspecialpromodetails.PLANCONTRACTSPECIALPROMODETAILS.FK_CONTRACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Plancontractspecialpromodetails.PLANCONTRACTSPECIALPROMODETAILS.FK_OFFER;
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
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCtPromoCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSupplierPromoCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getFkContract();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getFkOffer();
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
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCtPromoCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSupplierPromoCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFkContract();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getFkOffer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractspecialpromodetailsRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractspecialpromodetailsRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractspecialpromodetailsRecord value3(String value) {
        setCtPromoCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractspecialpromodetailsRecord value4(String value) {
        setSupplierPromoCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractspecialpromodetailsRecord value5(Integer value) {
        setFkContract(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractspecialpromodetailsRecord value6(Integer value) {
        setFkOffer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractspecialpromodetailsRecord values(UUID value1, Integer value2, String value3, String value4, Integer value5, Integer value6) {
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
     * Create a detached PlancontractspecialpromodetailsRecord
     */
    public PlancontractspecialpromodetailsRecord() {
        super(Plancontractspecialpromodetails.PLANCONTRACTSPECIALPROMODETAILS);
    }

    /**
     * Create a detached, initialised PlancontractspecialpromodetailsRecord
     */
    public PlancontractspecialpromodetailsRecord(UUID guid, Integer id, String ctPromoCode, String supplierPromoCode, Integer fkContract, Integer fkOffer) {
        super(Plancontractspecialpromodetails.PLANCONTRACTSPECIALPROMODETAILS);

        set(0, guid);
        set(1, id);
        set(2, ctPromoCode);
        set(3, supplierPromoCode);
        set(4, fkContract);
        set(5, fkOffer);
    }
}
