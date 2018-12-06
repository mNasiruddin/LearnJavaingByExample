/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Agency;

import org.jooq.Record1;
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
public class AgencyRecord extends UpdatableRecordImpl<AgencyRecord> {

    private static final long serialVersionUID = 316829113;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_ID</code>.
     */
    public void setAgencyId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_ID</code>.
     */
    public Integer getAgencyId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Name</code>.
     */
    public void setAgencyName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Name</code>.
     */
    public String getAgencyName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Address</code>.
     */
    public void setAgencyAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Address</code>.
     */
    public String getAgencyAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Phone</code>.
     */
    public void setAgencyPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Phone</code>.
     */
    public String getAgencyPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Fax</code>.
     */
    public void setAgencyFax(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Fax</code>.
     */
    public String getAgencyFax() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Email</code>.
     */
    public void setAgencyEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Agency_Email</code>.
     */
    public String getAgencyEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Country_ID</code>.
     */
    public void setCountryId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Country_ID</code>.
     */
    public String getCountryId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Supply_CreditInfo</code>.
     */
    public void setSupplyCreditinfo(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Supply_CreditInfo</code>.
     */
    public Boolean getSupplyCreditinfo() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Show_Charges</code>.
     */
    public void setShowCharges(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Show_Charges</code>.
     */
    public Boolean getShowCharges() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.VAT_Rate</code>.
     */
    public void setVatRate(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.VAT_Rate</code>.
     */
    public BigDecimal getVatRate() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Third_Party</code>.
     */
    public void setThirdParty(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Third_Party</code>.
     */
    public BigDecimal getThirdParty() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.CDW</code>.
     */
    public void setCdw(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.CDW</code>.
     */
    public BigDecimal getCdw() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Airport_Tax</code>.
     */
    public void setAirportTax(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Airport_Tax</code>.
     */
    public BigDecimal getAirportTax() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Van_Tax</code>.
     */
    public void setVanTax(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Van_Tax</code>.
     */
    public BigDecimal getVanTax() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Vehicle_Theft</code>.
     */
    public void setVehicleTheft(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Vehicle_Theft</code>.
     */
    public BigDecimal getVehicleTheft() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Second_Driver</code>.
     */
    public void setSecondDriver(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Second_Driver</code>.
     */
    public BigDecimal getSecondDriver() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.PA_Insurance</code>.
     */
    public void setPaInsurance(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.PA_Insurance</code>.
     */
    public BigDecimal getPaInsurance() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.N_Ireland</code>.
     */
    public void setNIreland(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.N_Ireland</code>.
     */
    public BigDecimal getNIreland() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.WindScreen</code>.
     */
    public void setWindscreen(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.WindScreen</code>.
     */
    public BigDecimal getWindscreen() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.BabySeat</code>.
     */
    public void setBabyseat(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.BabySeat</code>.
     */
    public BigDecimal getBabyseat() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Extra_Driver_DK</code>.
     */
    public void setExtraDriverDk(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Extra_Driver_DK</code>.
     */
    public BigDecimal getExtraDriverDk() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Advance_Time</code>.
     */
    public void setAdvanceTime(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Advance_Time</code>.
     */
    public Integer getAdvanceTime() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Account_No</code>.
     */
    public void setAccountNo(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Account_No</code>.
     */
    public String getAccountNo() {
        return (String) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Plan_Code</code>.
     */
    public void setPlanCode(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Plan_Code</code>.
     */
    public String getPlanCode() {
        return (String) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency.Contact_Phone</code>.
     */
    public void setContactPhone(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency.Contact_Phone</code>.
     */
    public String getContactPhone() {
        return (String) get(24);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AgencyRecord
     */
    public AgencyRecord() {
        super(Agency.AGENCY);
    }

    /**
     * Create a detached, initialised AgencyRecord
     */
    public AgencyRecord(Integer agencyId, String agencyName, String agencyAddress, String agencyPhone, String agencyFax, String agencyEmail, String countryId, Boolean supplyCreditinfo, Boolean showCharges, BigDecimal vatRate, BigDecimal thirdParty, BigDecimal cdw, BigDecimal airportTax, BigDecimal vanTax, BigDecimal vehicleTheft, BigDecimal secondDriver, BigDecimal paInsurance, BigDecimal nIreland, BigDecimal windscreen, BigDecimal babyseat, BigDecimal extraDriverDk, Integer advanceTime, String accountNo, String planCode, String contactPhone) {
        super(Agency.AGENCY);

        set(0, agencyId);
        set(1, agencyName);
        set(2, agencyAddress);
        set(3, agencyPhone);
        set(4, agencyFax);
        set(5, agencyEmail);
        set(6, countryId);
        set(7, supplyCreditinfo);
        set(8, showCharges);
        set(9, vatRate);
        set(10, thirdParty);
        set(11, cdw);
        set(12, airportTax);
        set(13, vanTax);
        set(14, vehicleTheft);
        set(15, secondDriver);
        set(16, paInsurance);
        set(17, nIreland);
        set(18, windscreen);
        set(19, babyseat);
        set(20, extraDriverDk);
        set(21, advanceTime);
        set(22, accountNo);
        set(23, planCode);
        set(24, contactPhone);
    }
}
