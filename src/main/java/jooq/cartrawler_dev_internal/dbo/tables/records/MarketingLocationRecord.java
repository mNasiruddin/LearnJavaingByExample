/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.MarketingLocation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class MarketingLocationRecord extends UpdatableRecordImpl<MarketingLocationRecord> implements Record18<Integer, Boolean, String, Boolean, BigDecimal, BigDecimal, String, Boolean, String, String, Integer, Boolean, Short, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String> {

    private static final long serialVersionUID = -824529493;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.marketing_location_id</code>.
     */
    public void setMarketingLocationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.marketing_location_id</code>.
     */
    public Integer getMarketingLocationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.status</code>.
     */
    public void setStatus(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.country_id</code>.
     */
    public void setCountryId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.marketing_airport</code>.
     */
    public void setMarketingAirport(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.marketing_airport</code>.
     */
    public Boolean getMarketingAirport() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.latitude</code>.
     */
    public void setLatitude(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.longitude</code>.
     */
    public void setLongitude(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.keywords</code>.
     */
    public void setKeywords(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.keywords</code>.
     */
    public String getKeywords() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.marketing_railway</code>.
     */
    public void setMarketingRailway(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.marketing_railway</code>.
     */
    public Boolean getMarketingRailway() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.iata_airport_code</code>.
     */
    public void setIataAirportCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.iata_airport_code</code>.
     */
    public String getIataAirportCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.marketing_seo_name</code>.
     */
    public void setMarketingSeoName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.marketing_seo_name</code>.
     */
    public String getMarketingSeoName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.popular_rank</code>.
     */
    public void setPopularRank(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.popular_rank</code>.
     */
    public Integer getPopularRank() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.show_on_map</code>.
     */
    public void setShowOnMap(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.show_on_map</code>.
     */
    public Boolean getShowOnMap() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.mlFlags</code>.
     */
    public void setMlflags(Short value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.mlFlags</code>.
     */
    public Short getMlflags() {
        return (Short) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.CarMetrics1</code>.
     */
    public void setCarmetrics1(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.CarMetrics1</code>.
     */
    public BigDecimal getCarmetrics1() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.CarMetrics2</code>.
     */
    public void setCarmetrics2(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.CarMetrics2</code>.
     */
    public BigDecimal getCarmetrics2() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.CarMetrics3</code>.
     */
    public void setCarmetrics3(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.CarMetrics3</code>.
     */
    public BigDecimal getCarmetrics3() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.CarMetrics4</code>.
     */
    public void setCarmetrics4(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.CarMetrics4</code>.
     */
    public BigDecimal getCarmetrics4() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_location.google_places_id</code>.
     */
    public void setGooglePlacesId(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_location.google_places_id</code>.
     */
    public String getGooglePlacesId() {
        return (String) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Boolean, String, Boolean, BigDecimal, BigDecimal, String, Boolean, String, String, Integer, Boolean, Short, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Boolean, String, Boolean, BigDecimal, BigDecimal, String, Boolean, String, String, Integer, Boolean, Short, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MarketingLocation.MARKETING_LOCATION.MARKETING_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return MarketingLocation.MARKETING_LOCATION.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MarketingLocation.MARKETING_LOCATION.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return MarketingLocation.MARKETING_LOCATION.MARKETING_AIRPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return MarketingLocation.MARKETING_LOCATION.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return MarketingLocation.MARKETING_LOCATION.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MarketingLocation.MARKETING_LOCATION.KEYWORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return MarketingLocation.MARKETING_LOCATION.MARKETING_RAILWAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MarketingLocation.MARKETING_LOCATION.IATA_AIRPORT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return MarketingLocation.MARKETING_LOCATION.MARKETING_SEO_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return MarketingLocation.MARKETING_LOCATION.POPULAR_RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return MarketingLocation.MARKETING_LOCATION.SHOW_ON_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field13() {
        return MarketingLocation.MARKETING_LOCATION.MLFLAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return MarketingLocation.MARKETING_LOCATION.CARMETRICS1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return MarketingLocation.MARKETING_LOCATION.CARMETRICS2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field16() {
        return MarketingLocation.MARKETING_LOCATION.CARMETRICS3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field17() {
        return MarketingLocation.MARKETING_LOCATION.CARMETRICS4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return MarketingLocation.MARKETING_LOCATION.GOOGLE_PLACES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getMarketingLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getMarketingAirport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getKeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getMarketingRailway();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getIataAirportCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getMarketingSeoName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getPopularRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getShowOnMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component13() {
        return getMlflags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getCarmetrics1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getCarmetrics2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component16() {
        return getCarmetrics3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component17() {
        return getCarmetrics4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getGooglePlacesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMarketingLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getMarketingAirport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getKeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getMarketingRailway();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getIataAirportCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMarketingSeoName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getPopularRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getShowOnMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value13() {
        return getMlflags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getCarmetrics1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getCarmetrics2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value16() {
        return getCarmetrics3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value17() {
        return getCarmetrics4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getGooglePlacesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value1(Integer value) {
        setMarketingLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value2(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value3(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value4(Boolean value) {
        setMarketingAirport(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value5(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value6(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value7(String value) {
        setKeywords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value8(Boolean value) {
        setMarketingRailway(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value9(String value) {
        setIataAirportCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value10(String value) {
        setMarketingSeoName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value11(Integer value) {
        setPopularRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value12(Boolean value) {
        setShowOnMap(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value13(Short value) {
        setMlflags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value14(BigDecimal value) {
        setCarmetrics1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value15(BigDecimal value) {
        setCarmetrics2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value16(BigDecimal value) {
        setCarmetrics3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value17(BigDecimal value) {
        setCarmetrics4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord value18(String value) {
        setGooglePlacesId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingLocationRecord values(Integer value1, Boolean value2, String value3, Boolean value4, BigDecimal value5, BigDecimal value6, String value7, Boolean value8, String value9, String value10, Integer value11, Boolean value12, Short value13, BigDecimal value14, BigDecimal value15, BigDecimal value16, BigDecimal value17, String value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MarketingLocationRecord
     */
    public MarketingLocationRecord() {
        super(MarketingLocation.MARKETING_LOCATION);
    }

    /**
     * Create a detached, initialised MarketingLocationRecord
     */
    public MarketingLocationRecord(Integer marketingLocationId, Boolean status, String countryId, Boolean marketingAirport, BigDecimal latitude, BigDecimal longitude, String keywords, Boolean marketingRailway, String iataAirportCode, String marketingSeoName, Integer popularRank, Boolean showOnMap, Short mlflags, BigDecimal carmetrics1, BigDecimal carmetrics2, BigDecimal carmetrics3, BigDecimal carmetrics4, String googlePlacesId) {
        super(MarketingLocation.MARKETING_LOCATION);

        set(0, marketingLocationId);
        set(1, status);
        set(2, countryId);
        set(3, marketingAirport);
        set(4, latitude);
        set(5, longitude);
        set(6, keywords);
        set(7, marketingRailway);
        set(8, iataAirportCode);
        set(9, marketingSeoName);
        set(10, popularRank);
        set(11, showOnMap);
        set(12, mlflags);
        set(13, carmetrics1);
        set(14, carmetrics2);
        set(15, carmetrics3);
        set(16, carmetrics4);
        set(17, googlePlacesId);
    }
}