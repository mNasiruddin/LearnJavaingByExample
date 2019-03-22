/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationConsolidatorInfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class ReservationConsolidatorInfoRecord extends UpdatableRecordImpl<ReservationConsolidatorInfoRecord> implements Record21<UUID, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1825336742;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.ConsolidatorCode</code>.
     */
    public void setConsolidatorcode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.ConsolidatorCode</code>.
     */
    public String getConsolidatorcode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.ConsolidatorCodeContext</code>.
     */
    public void setConsolidatorcodecontext(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.ConsolidatorCodeContext</code>.
     */
    public String getConsolidatorcodecontext() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.LocationName</code>.
     */
    public void setLocationname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.LocationName</code>.
     */
    public String getLocationname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.StageDescription</code>.
     */
    public void setStagedescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.StageDescription</code>.
     */
    public String getStagedescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AtAirport</code>.
     */
    public void setAtairport(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AtAirport</code>.
     */
    public String getAtairport() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VendorCode</code>.
     */
    public void setVendorcode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VendorCode</code>.
     */
    public String getVendorcode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VendorAccountNumber</code>.
     */
    public void setVendoraccountnumber(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VendorAccountNumber</code>.
     */
    public String getVendoraccountnumber() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VendorPlanCode</code>.
     */
    public void setVendorplancode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VendorPlanCode</code>.
     */
    public String getVendorplancode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AddressLine1</code>.
     */
    public void setAddressline1(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AddressLine1</code>.
     */
    public String getAddressline1() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AddressLine2</code>.
     */
    public void setAddressline2(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AddressLine2</code>.
     */
    public String getAddressline2() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AddressLine3</code>.
     */
    public void setAddressline3(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AddressLine3</code>.
     */
    public String getAddressline3() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.CityName</code>.
     */
    public void setCityname(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.CityName</code>.
     */
    public String getCityname() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.PostalCode</code>.
     */
    public void setPostalcode(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.PostalCode</code>.
     */
    public String getPostalcode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.CountryCode</code>.
     */
    public void setCountrycode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.CountryCode</code>.
     */
    public String getCountrycode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.Telephone</code>.
     */
    public void setTelephone(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.Telephone</code>.
     */
    public String getTelephone() {
        return (String) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.CounterLocation</code>.
     */
    public void setCounterlocation(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.CounterLocation</code>.
     */
    public String getCounterlocation() {
        return (String) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.SupplierSubReference </code>.
     */
    public void setSuppliersubreference_(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.SupplierSubReference </code>.
     */
    public String getSuppliersubreference_() {
        return (String) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VoucherURL </code>.
     */
    public void setVoucherurl_(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VoucherURL </code>.
     */
    public String getVoucherurl_() {
        return (String) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<UUID, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<UUID, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.CONSOLIDATORCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.CONSOLIDATORCODECONTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.LOCATIONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.STAGEDESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.ATAIRPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.VENDORCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.VENDORACCOUNTNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.VENDORPLANCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.ADDRESSLINE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.ADDRESSLINE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.ADDRESSLINE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.CITYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.POSTALCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.COUNTRYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.TELEPHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.COUNTERLOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.SUPPLIERSUBREFERENCE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO.VOUCHERURL_;
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
    public Integer component3() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getConsolidatorcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getConsolidatorcodecontext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLocationname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getStagedescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getAtairport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getVendorcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getVendoraccountnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getVendorplancode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAddressline1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getAddressline2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getAddressline3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCityname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getPostalcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCountrycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getTelephone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getCounterlocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getSuppliersubreference_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getVoucherurl_();
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
    public Integer value3() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getConsolidatorcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getConsolidatorcodecontext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLocationname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getStagedescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAtairport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getVendorcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getVendoraccountnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getVendorplancode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAddressline1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAddressline2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getAddressline3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCityname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getPostalcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCountrycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getTelephone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getCounterlocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getSuppliersubreference_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getVoucherurl_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value3(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value4(String value) {
        setConsolidatorcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value5(String value) {
        setConsolidatorcodecontext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value6(String value) {
        setLocationname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value7(String value) {
        setStagedescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value8(String value) {
        setAtairport(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value9(String value) {
        setVendorcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value10(String value) {
        setVendoraccountnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value11(String value) {
        setVendorplancode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value12(String value) {
        setAddressline1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value13(String value) {
        setAddressline2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value14(String value) {
        setAddressline3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value15(String value) {
        setCityname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value16(String value) {
        setPostalcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value17(String value) {
        setCountrycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value18(String value) {
        setTelephone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value19(String value) {
        setCounterlocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value20(String value) {
        setSuppliersubreference_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord value21(String value) {
        setVoucherurl_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfoRecord values(UUID value1, Integer value2, Integer value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, String value19, String value20, String value21) {
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
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationConsolidatorInfoRecord
     */
    public ReservationConsolidatorInfoRecord() {
        super(ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO);
    }

    /**
     * Create a detached, initialised ReservationConsolidatorInfoRecord
     */
    public ReservationConsolidatorInfoRecord(UUID guid, Integer id, Integer fkReservation, String consolidatorcode, String consolidatorcodecontext, String locationname, String stagedescription, String atairport, String vendorcode, String vendoraccountnumber, String vendorplancode, String addressline1, String addressline2, String addressline3, String cityname, String postalcode, String countrycode, String telephone, String counterlocation, String suppliersubreference_, String voucherurl_) {
        super(ReservationConsolidatorInfo.RESERVATION_CONSOLIDATOR_INFO);

        set(0, guid);
        set(1, id);
        set(2, fkReservation);
        set(3, consolidatorcode);
        set(4, consolidatorcodecontext);
        set(5, locationname);
        set(6, stagedescription);
        set(7, atairport);
        set(8, vendorcode);
        set(9, vendoraccountnumber);
        set(10, vendorplancode);
        set(11, addressline1);
        set(12, addressline2);
        set(13, addressline3);
        set(14, cityname);
        set(15, postalcode);
        set(16, countrycode);
        set(17, telephone);
        set(18, counterlocation);
        set(19, suppliersubreference_);
        set(20, voucherurl_);
    }
}