/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Legalagreement;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class LegalagreementRecord extends TableRecordImpl<LegalagreementRecord> implements Record19<Integer, Integer, String, String, Integer, Integer, Integer, String, Date, Date, Date, String, String, String, Boolean, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = 1671138266;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.fk_ax</code>.
     */
    public void setFkAx(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.fk_ax</code>.
     */
    public Integer getFkAx() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.la_name</code>.
     */
    public void setLaName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.la_name</code>.
     */
    public String getLaName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.la_long_name</code>.
     */
    public void setLaLongName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.la_long_name</code>.
     */
    public String getLaLongName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.fk_suppliers</code>.
     */
    public void setFkSuppliers(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.fk_suppliers</code>.
     */
    public Integer getFkSuppliers() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.provider_type</code>.
     */
    public void setProviderType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.provider_type</code>.
     */
    public Integer getProviderType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.provider_id</code>.
     */
    public void setProviderId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.provider_id</code>.
     */
    public Integer getProviderId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.ax_owner</code>.
     */
    public void setAxOwner(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.ax_owner</code>.
     */
    public String getAxOwner() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.creation_date</code>.
     */
    public void setCreationDate(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.creation_date</code>.
     */
    public Date getCreationDate() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.start_date</code>.
     */
    public void setStartDate(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.start_date</code>.
     */
    public Date getStartDate() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.end_date</code>.
     */
    public void setEndDate(Date value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.end_date</code>.
     */
    public Date getEndDate() {
        return (Date) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.company_name</code>.
     */
    public void setCompanyName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.paym_term_cust</code>.
     */
    public void setPaymTermCust(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.paym_term_cust</code>.
     */
    public String getPaymTermCust() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.paym_term_vend</code>.
     */
    public void setPaymTermVend(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.paym_term_vend</code>.
     */
    public String getPaymTermVend() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.noshow_status</code>.
     */
    public void setNoshowStatus(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.noshow_status</code>.
     */
    public Boolean getNoshowStatus() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.chargeback_status</code>.
     */
    public void setChargebackStatus(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.chargeback_status</code>.
     */
    public Boolean getChargebackStatus() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.cancellation_status</code>.
     */
    public void setCancellationStatus(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.cancellation_status</code>.
     */
    public Boolean getCancellationStatus() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.rebate_status</code>.
     */
    public void setRebateStatus(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.rebate_status</code>.
     */
    public Boolean getRebateStatus() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.commission_status</code>.
     */
    public void setCommissionStatus(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.LegalAgreement.commission_status</code>.
     */
    public Boolean getCommissionStatus() {
        return (Boolean) get(18);
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, String, String, Integer, Integer, Integer, String, Date, Date, Date, String, String, String, Boolean, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, String, String, Integer, Integer, Integer, String, Date, Date, Date, String, String, String, Boolean, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Legalagreement.LEGALAGREEMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Legalagreement.LEGALAGREEMENT.FK_AX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Legalagreement.LEGALAGREEMENT.LA_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Legalagreement.LEGALAGREEMENT.LA_LONG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Legalagreement.LEGALAGREEMENT.FK_SUPPLIERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Legalagreement.LEGALAGREEMENT.PROVIDER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Legalagreement.LEGALAGREEMENT.PROVIDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Legalagreement.LEGALAGREEMENT.AX_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return Legalagreement.LEGALAGREEMENT.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return Legalagreement.LEGALAGREEMENT.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field11() {
        return Legalagreement.LEGALAGREEMENT.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Legalagreement.LEGALAGREEMENT.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Legalagreement.LEGALAGREEMENT.PAYM_TERM_CUST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Legalagreement.LEGALAGREEMENT.PAYM_TERM_VEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return Legalagreement.LEGALAGREEMENT.NOSHOW_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return Legalagreement.LEGALAGREEMENT.CHARGEBACK_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return Legalagreement.LEGALAGREEMENT.CANCELLATION_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field18() {
        return Legalagreement.LEGALAGREEMENT.REBATE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field19() {
        return Legalagreement.LEGALAGREEMENT.COMMISSION_STATUS;
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
        return getFkAx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLaLongName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getFkSuppliers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getProviderType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getProviderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getAxOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component9() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component10() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component11() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getPaymTermCust();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getPaymTermVend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component15() {
        return getNoshowStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getChargebackStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component17() {
        return getCancellationStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component18() {
        return getRebateStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component19() {
        return getCommissionStatus();
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
        return getFkAx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLaLongName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFkSuppliers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getProviderType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getProviderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAxOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value10() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value11() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPaymTermCust();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getPaymTermVend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getNoshowStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getChargebackStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getCancellationStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value18() {
        return getRebateStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value19() {
        return getCommissionStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value2(Integer value) {
        setFkAx(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value3(String value) {
        setLaName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value4(String value) {
        setLaLongName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value5(Integer value) {
        setFkSuppliers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value6(Integer value) {
        setProviderType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value7(Integer value) {
        setProviderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value8(String value) {
        setAxOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value9(Date value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value10(Date value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value11(Date value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value12(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value13(String value) {
        setPaymTermCust(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value14(String value) {
        setPaymTermVend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value15(Boolean value) {
        setNoshowStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value16(Boolean value) {
        setChargebackStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value17(Boolean value) {
        setCancellationStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value18(Boolean value) {
        setRebateStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord value19(Boolean value) {
        setCommissionStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LegalagreementRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, Integer value6, Integer value7, String value8, Date value9, Date value10, Date value11, String value12, String value13, String value14, Boolean value15, Boolean value16, Boolean value17, Boolean value18, Boolean value19) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LegalagreementRecord
     */
    public LegalagreementRecord() {
        super(Legalagreement.LEGALAGREEMENT);
    }

    /**
     * Create a detached, initialised LegalagreementRecord
     */
    public LegalagreementRecord(Integer id, Integer fkAx, String laName, String laLongName, Integer fkSuppliers, Integer providerType, Integer providerId, String axOwner, Date creationDate, Date startDate, Date endDate, String companyName, String paymTermCust, String paymTermVend, Boolean noshowStatus, Boolean chargebackStatus, Boolean cancellationStatus, Boolean rebateStatus, Boolean commissionStatus) {
        super(Legalagreement.LEGALAGREEMENT);

        set(0, id);
        set(1, fkAx);
        set(2, laName);
        set(3, laLongName);
        set(4, fkSuppliers);
        set(5, providerType);
        set(6, providerId);
        set(7, axOwner);
        set(8, creationDate);
        set(9, startDate);
        set(10, endDate);
        set(11, companyName);
        set(12, paymTermCust);
        set(13, paymTermVend);
        set(14, noshowStatus);
        set(15, chargebackStatus);
        set(16, cancellationStatus);
        set(17, rebateStatus);
        set(18, commissionStatus);
    }
}
