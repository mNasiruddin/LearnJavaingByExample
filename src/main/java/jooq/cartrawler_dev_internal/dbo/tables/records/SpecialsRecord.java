/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Specials;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Record3;
import org.jooq.Row16;
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
public class SpecialsRecord extends UpdatableRecordImpl<SpecialsRecord> implements Record16<Integer, Integer, Integer, String, String, String, byte[], BigDecimal, Boolean, Integer, Timestamp, Timestamp, String, Boolean, String, String> {

    private static final long serialVersionUID = 1429957217;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Location_ID</code>.
     */
    public void setLocationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Location_ID</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Agency_ID</code>.
     */
    public void setAgencyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Agency_ID</code>.
     */
    public Integer getAgencyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Special_ID</code>.
     */
    public void setSpecialId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Special_ID</code>.
     */
    public Integer getSpecialId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Ref</code>.
     */
    public void setSpecialRef(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Ref</code>.
     */
    public String getSpecialRef() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Name</code>.
     */
    public void setSpecialName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Name</code>.
     */
    public String getSpecialName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Description</code>.
     */
    public void setSpecialDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Description</code>.
     */
    public String getSpecialDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Image</code>.
     */
    public void setSpecialImage(byte... value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Image</code>.
     */
    public byte[] getSpecialImage() {
        return (byte[]) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Rate</code>.
     */
    public void setSpecialRate(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Special_Rate</code>.
     */
    public BigDecimal getSpecialRate() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Daily_Rate</code>.
     */
    public void setDailyRate(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Daily_Rate</code>.
     */
    public Boolean getDailyRate() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.No_Of_Days</code>.
     */
    public void setNoOfDays(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.No_Of_Days</code>.
     */
    public Integer getNoOfDays() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Valid_From</code>.
     */
    public void setValidFrom(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Valid_From</code>.
     */
    public Timestamp getValidFrom() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Valid_To</code>.
     */
    public void setValidTo(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Valid_To</code>.
     */
    public Timestamp getValidTo() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Term_Conditions</code>.
     */
    public void setTermConditions(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Term_Conditions</code>.
     */
    public String getTermConditions() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Status</code>.
     */
    public void setStatus(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Image_Width</code>.
     */
    public void setImageWidth(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Image_Width</code>.
     */
    public String getImageWidth() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Specials.Image_Height</code>.
     */
    public void setImageHeight(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Specials.Image_Height</code>.
     */
    public String getImageHeight() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, String, String, String, byte[], BigDecimal, Boolean, Integer, Timestamp, Timestamp, String, Boolean, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, String, String, String, byte[], BigDecimal, Boolean, Integer, Timestamp, Timestamp, String, Boolean, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Specials.SPECIALS.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Specials.SPECIALS.AGENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Specials.SPECIALS.SPECIAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Specials.SPECIALS.SPECIAL_REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Specials.SPECIALS.SPECIAL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Specials.SPECIALS.SPECIAL_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field7() {
        return Specials.SPECIALS.SPECIAL_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return Specials.SPECIALS.SPECIAL_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Specials.SPECIALS.DAILY_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Specials.SPECIALS.NO_OF_DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Specials.SPECIALS.VALID_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Specials.SPECIALS.VALID_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Specials.SPECIALS.TERM_CONDITIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Specials.SPECIALS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Specials.SPECIALS.IMAGE_WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Specials.SPECIALS.IMAGE_HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSpecialId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSpecialRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSpecialName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSpecialDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component7() {
        return getSpecialImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getSpecialRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getDailyRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getNoOfDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getValidFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getValidTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getTermConditions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getImageWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getImageHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSpecialId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSpecialRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSpecialName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSpecialDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value7() {
        return getSpecialImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getSpecialRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getDailyRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getNoOfDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getValidFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getValidTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getTermConditions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getImageWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getImageHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value1(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value2(Integer value) {
        setAgencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value3(Integer value) {
        setSpecialId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value4(String value) {
        setSpecialRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value5(String value) {
        setSpecialName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value6(String value) {
        setSpecialDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value7(byte... value) {
        setSpecialImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value8(BigDecimal value) {
        setSpecialRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value9(Boolean value) {
        setDailyRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value10(Integer value) {
        setNoOfDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value11(Timestamp value) {
        setValidFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value12(Timestamp value) {
        setValidTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value13(String value) {
        setTermConditions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value14(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value15(String value) {
        setImageWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord value16(String value) {
        setImageHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialsRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, String value6, byte[] value7, BigDecimal value8, Boolean value9, Integer value10, Timestamp value11, Timestamp value12, String value13, Boolean value14, String value15, String value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpecialsRecord
     */
    public SpecialsRecord() {
        super(Specials.SPECIALS);
    }

    /**
     * Create a detached, initialised SpecialsRecord
     */
    public SpecialsRecord(Integer locationId, Integer agencyId, Integer specialId, String specialRef, String specialName, String specialDescription, byte[] specialImage, BigDecimal specialRate, Boolean dailyRate, Integer noOfDays, Timestamp validFrom, Timestamp validTo, String termConditions, Boolean status, String imageWidth, String imageHeight) {
        super(Specials.SPECIALS);

        set(0, locationId);
        set(1, agencyId);
        set(2, specialId);
        set(3, specialRef);
        set(4, specialName);
        set(5, specialDescription);
        set(6, specialImage);
        set(7, specialRate);
        set(8, dailyRate);
        set(9, noOfDays);
        set(10, validFrom);
        set(11, validTo);
        set(12, termConditions);
        set(13, status);
        set(14, imageWidth);
        set(15, imageHeight);
    }
}