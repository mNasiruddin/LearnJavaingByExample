/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Country;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
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
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> {

    private static final long serialVersionUID = 1956589045;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Country_ID</code>.
     */
    public void setCountryId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Country_ID</code>.
     */
    public String getCountryId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Country_Name</code>.
     */
    public void setCountryName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Country_Name</code>.
     */
    public String getCountryName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.currency_id</code>.
     */
    public void setCurrencyId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.currency_id</code>.
     */
    public String getCurrencyId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.continent</code>.
     */
    public void setContinent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.continent</code>.
     */
    public String getContinent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Country_Info</code>.
     */
    public void setCountryInfo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Country_Info</code>.
     */
    public String getCountryInfo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Country_Info_Domestic</code>.
     */
    public void setCountryInfoDomestic(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Country_Info_Domestic</code>.
     */
    public String getCountryInfoDomestic() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Country_text</code>.
     */
    public void setCountryText(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Country_text</code>.
     */
    public String getCountryText() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Country_text_domestic</code>.
     */
    public void setCountryTextDomestic(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Country_text_domestic</code>.
     */
    public String getCountryTextDomestic() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Page_Title</code>.
     */
    public void setPageTitle(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Page_Title</code>.
     */
    public String getPageTitle() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Page_Title_Domestic</code>.
     */
    public void setPageTitleDomestic(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Page_Title_Domestic</code>.
     */
    public String getPageTitleDomestic() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Meta_Description</code>.
     */
    public void setMetaDescription(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Meta_Description</code>.
     */
    public String getMetaDescription() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Meta_Description_Domestic</code>.
     */
    public void setMetaDescriptionDomestic(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Meta_Description_Domestic</code>.
     */
    public String getMetaDescriptionDomestic() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Meta_Keywords</code>.
     */
    public void setMetaKeywords(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Meta_Keywords</code>.
     */
    public String getMetaKeywords() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Meta_Keywords_Domestic</code>.
     */
    public void setMetaKeywordsDomestic(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Meta_Keywords_Domestic</code>.
     */
    public String getMetaKeywordsDomestic() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Country_Image</code>.
     */
    public void setCountryImage(byte... value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Country_Image</code>.
     */
    public byte[] getCountryImage() {
        return (byte[]) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Image_Width</code>.
     */
    public void setImageWidth(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Image_Width</code>.
     */
    public String getImageWidth() {
        return (String) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Image_Height</code>.
     */
    public void setImageHeight(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Image_Height</code>.
     */
    public String getImageHeight() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.image_above</code>.
     */
    public void setImageAbove(Short value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.image_above</code>.
     */
    public Short getImageAbove() {
        return (Short) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Updated</code>.
     */
    public void setUpdated(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Updated</code>.
     */
    public Boolean getUpdated() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Index_Display</code>.
     */
    public void setIndexDisplay(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Index_Display</code>.
     */
    public Boolean getIndexDisplay() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Index_Name</code>.
     */
    public void setIndexName(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Index_Name</code>.
     */
    public String getIndexName() {
        return (String) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.alt_url</code>.
     */
    public void setAltUrl(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.alt_url</code>.
     */
    public String getAltUrl() {
        return (String) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Rates_Currency_Id</code>.
     */
    public void setRatesCurrencyId(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Rates_Currency_Id</code>.
     */
    public String getRatesCurrencyId() {
        return (String) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Charge_Currency_id</code>.
     */
    public void setChargeCurrencyId(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Charge_Currency_id</code>.
     */
    public String getChargeCurrencyId() {
        return (String) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Link_Country</code>.
     */
    public void setLinkCountry(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Link_Country</code>.
     */
    public String getLinkCountry() {
        return (String) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.country_status</code>.
     */
    public void setCountryStatus(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.country_status</code>.
     */
    public Boolean getCountryStatus() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.country_name_de</code>.
     */
    public void setCountryNameDe(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.country_name_de</code>.
     */
    public String getCountryNameDe() {
        return (String) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.region_id</code>.
     */
    public void setRegionId(UByte value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.region_id</code>.
     */
    public UByte getRegionId() {
        return (UByte) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.newFrameworkDBRate</code>.
     */
    public void setNewframeworkdbrate(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.newFrameworkDBRate</code>.
     */
    public Boolean getNewframeworkdbrate() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.amendedBy</code>.
     */
    public void setAmendedby(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.amendedBy</code>.
     */
    public Integer getAmendedby() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.capital_timezone</code>.
     */
    public void setCapitalTimezone(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.capital_timezone</code>.
     */
    public String getCapitalTimezone() {
        return (String) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.capital_latitude</code>.
     */
    public void setCapitalLatitude(BigDecimal value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.capital_latitude</code>.
     */
    public BigDecimal getCapitalLatitude() {
        return (BigDecimal) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.capital_longitude</code>.
     */
    public void setCapitalLongitude(BigDecimal value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.capital_longitude</code>.
     */
    public BigDecimal getCapitalLongitude() {
        return (BigDecimal) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.Mondial_Currency_id</code>.
     */
    public void setMondialCurrencyId(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.Mondial_Currency_id</code>.
     */
    public String getMondialCurrencyId() {
        return (String) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.residency_region</code>.
     */
    public void setResidencyRegion(Short value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.residency_region</code>.
     */
    public Short getResidencyRegion() {
        return (Short) get(34);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.default_display_currency</code>.
     */
    public void setDefaultDisplayCurrency(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.default_display_currency</code>.
     */
    public String getDefaultDisplayCurrency() {
        return (String) get(35);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Country.so_price_align</code>.
     */
    public void setSoPriceAlign(Boolean value) {
        set(36, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Country.so_price_align</code>.
     */
    public Boolean getSoPriceAlign() {
        return (Boolean) get(36);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryRecord
     */
    public CountryRecord() {
        super(Country.COUNTRY);
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(String countryId, String countryName, String currencyId, String continent, String countryInfo, String countryInfoDomestic, String countryText, String countryTextDomestic, String pageTitle, String pageTitleDomestic, String metaDescription, String metaDescriptionDomestic, String metaKeywords, String metaKeywordsDomestic, byte[] countryImage, String imageWidth, String imageHeight, Short imageAbove, Boolean updated, Boolean indexDisplay, String indexName, String altUrl, String ratesCurrencyId, String chargeCurrencyId, String linkCountry, Boolean countryStatus, String countryNameDe, UByte regionId, Boolean newframeworkdbrate, Integer amendedby, String capitalTimezone, BigDecimal capitalLatitude, BigDecimal capitalLongitude, String mondialCurrencyId, Short residencyRegion, String defaultDisplayCurrency, Boolean soPriceAlign) {
        super(Country.COUNTRY);

        set(0, countryId);
        set(1, countryName);
        set(2, currencyId);
        set(3, continent);
        set(4, countryInfo);
        set(5, countryInfoDomestic);
        set(6, countryText);
        set(7, countryTextDomestic);
        set(8, pageTitle);
        set(9, pageTitleDomestic);
        set(10, metaDescription);
        set(11, metaDescriptionDomestic);
        set(12, metaKeywords);
        set(13, metaKeywordsDomestic);
        set(14, countryImage);
        set(15, imageWidth);
        set(16, imageHeight);
        set(17, imageAbove);
        set(18, updated);
        set(19, indexDisplay);
        set(20, indexName);
        set(21, altUrl);
        set(22, ratesCurrencyId);
        set(23, chargeCurrencyId);
        set(24, linkCountry);
        set(25, countryStatus);
        set(26, countryNameDe);
        set(27, regionId);
        set(28, newframeworkdbrate);
        set(29, amendedby);
        set(30, capitalTimezone);
        set(31, capitalLatitude);
        set(32, capitalLongitude);
        set(33, mondialCurrencyId);
        set(34, residencyRegion);
        set(35, defaultDisplayCurrency);
        set(36, soPriceAlign);
    }
}
