/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Temptracking;

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
public class TemptrackingRecord extends TableRecordImpl<TemptrackingRecord> {

    private static final long serialVersionUID = -130680241;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.url</code>.
     */
    public void setUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.url</code>.
     */
    public String getUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.clientID</code>.
     */
    public void setClientid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.clientID</code>.
     */
    public Integer getClientid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.event</code>.
     */
    public void setEvent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.event</code>.
     */
    public String getEvent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickupID</code>.
     */
    public void setPickupid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickupID</code>.
     */
    public Integer getPickupid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickupName</code>.
     */
    public void setPickupname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickupName</code>.
     */
    public String getPickupname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickUpCountry</code>.
     */
    public void setPickupcountry(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickUpCountry</code>.
     */
    public String getPickupcountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickupDate</code>.
     */
    public void setPickupdate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickupDate</code>.
     */
    public Timestamp getPickupdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickupTime</code>.
     */
    public void setPickuptime(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.pickupTime</code>.
     */
    public String getPickuptime() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.returnID</code>.
     */
    public void setReturnid(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.returnID</code>.
     */
    public Integer getReturnid() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.returnName</code>.
     */
    public void setReturnname(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.returnName</code>.
     */
    public String getReturnname() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.returnDate</code>.
     */
    public void setReturndate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.returnDate</code>.
     */
    public Timestamp getReturndate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.returnTime</code>.
     */
    public void setReturntime(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.returnTime</code>.
     */
    public String getReturntime() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.age</code>.
     */
    public void setAge(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.currencyID</code>.
     */
    public void setCurrencyid(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.currencyID</code>.
     */
    public String getCurrencyid() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.ns1</code>.
     */
    public void setNs1(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.ns1</code>.
     */
    public String getNs1() {
        return (String) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.CT</code>.
     */
    public void setCt(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.CT</code>.
     */
    public String getCt() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.residenceID</code>.
     */
    public void setResidenceid(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.residenceID</code>.
     */
    public Integer getResidenceid() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.elID</code>.
     */
    public void setElid(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.elID</code>.
     */
    public Long getElid() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.carGroupID</code>.
     */
    public void setCargroupid(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.carGroupID</code>.
     */
    public Integer getCargroupid() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.referrer</code>.
     */
    public void setReferrer(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.referrer</code>.
     */
    public String getReferrer() {
        return (String) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.kpid</code>.
     */
    public void setKpid(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.kpid</code>.
     */
    public Integer getKpid() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.kwid</code>.
     */
    public void setKwid(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.kwid</code>.
     */
    public Integer getKwid() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.ktrack</code>.
     */
    public void setKtrack(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.ktrack</code>.
     */
    public String getKtrack() {
        return (String) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.tradeDoubler</code>.
     */
    public void setTradedoubler(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.tradeDoubler</code>.
     */
    public String getTradedoubler() {
        return (String) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.affilinet</code>.
     */
    public void setAffilinet(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.affilinet</code>.
     */
    public String getAffilinet() {
        return (String) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.carSelected</code>.
     */
    public void setCarselected(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.carSelected</code>.
     */
    public String getCarselected() {
        return (String) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.carPrice</code>.
     */
    public void setCarprice(BigDecimal value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.carPrice</code>.
     */
    public BigDecimal getCarprice() {
        return (BigDecimal) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.carPic</code>.
     */
    public void setCarpic(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.carPic</code>.
     */
    public String getCarpic() {
        return (String) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.carPricePerDay</code>.
     */
    public void setCarpriceperday(BigDecimal value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.carPricePerDay</code>.
     */
    public BigDecimal getCarpriceperday() {
        return (BigDecimal) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.insurance_offered</code>.
     */
    public void setInsuranceOffered(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.insurance_offered</code>.
     */
    public Integer getInsuranceOffered() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.abe_insurance_purchased</code>.
     */
    public void setAbeInsurancePurchased(Integer value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.abe_insurance_purchased</code>.
     */
    public Integer getAbeInsurancePurchased() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.Car hire fee</code>.
     */
    public void setCarHireFee(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.Car hire fee</code>.
     */
    public String getCarHireFee() {
        return (String) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.Damage Refund Insurance</code>.
     */
    public void setDamageRefundInsurance(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.Damage Refund Insurance</code>.
     */
    public String getDamageRefundInsurance() {
        return (String) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.Price Total</code>.
     */
    public void setPriceTotal(BigDecimal value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.Price Total</code>.
     */
    public BigDecimal getPriceTotal() {
        return (BigDecimal) get(34);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.reservationNumber</code>.
     */
    public void setReservationnumber(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.reservationNumber</code>.
     */
    public String getReservationnumber() {
        return (String) get(35);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TempTracking.totalIncInsurance</code>.
     */
    public void setTotalincinsurance(BigDecimal value) {
        set(36, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TempTracking.totalIncInsurance</code>.
     */
    public BigDecimal getTotalincinsurance() {
        return (BigDecimal) get(36);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TemptrackingRecord
     */
    public TemptrackingRecord() {
        super(Temptracking.TEMPTRACKING);
    }

    /**
     * Create a detached, initialised TemptrackingRecord
     */
    public TemptrackingRecord(Integer id, String url, Integer clientid, String event, Integer pickupid, String pickupname, String pickupcountry, Timestamp pickupdate, String pickuptime, Integer returnid, String returnname, Timestamp returndate, String returntime, Integer age, String currencyid, String ns1, String ct, Integer residenceid, Long elid, Integer cargroupid, String referrer, Integer kpid, Integer kwid, String ktrack, String tradedoubler, String affilinet, String carselected, BigDecimal carprice, String carpic, BigDecimal carpriceperday, Integer insuranceOffered, Integer abeInsurancePurchased, String carHireFee, String damageRefundInsurance, BigDecimal priceTotal, String reservationnumber, BigDecimal totalincinsurance) {
        super(Temptracking.TEMPTRACKING);

        set(0, id);
        set(1, url);
        set(2, clientid);
        set(3, event);
        set(4, pickupid);
        set(5, pickupname);
        set(6, pickupcountry);
        set(7, pickupdate);
        set(8, pickuptime);
        set(9, returnid);
        set(10, returnname);
        set(11, returndate);
        set(12, returntime);
        set(13, age);
        set(14, currencyid);
        set(15, ns1);
        set(16, ct);
        set(17, residenceid);
        set(18, elid);
        set(19, cargroupid);
        set(20, referrer);
        set(21, kpid);
        set(22, kwid);
        set(23, ktrack);
        set(24, tradedoubler);
        set(25, affilinet);
        set(26, carselected);
        set(27, carprice);
        set(28, carpic);
        set(29, carpriceperday);
        set(30, insuranceOffered);
        set(31, abeInsurancePurchased);
        set(32, carHireFee);
        set(33, damageRefundInsurance);
        set(34, priceTotal);
        set(35, reservationnumber);
        set(36, totalincinsurance);
    }
}
