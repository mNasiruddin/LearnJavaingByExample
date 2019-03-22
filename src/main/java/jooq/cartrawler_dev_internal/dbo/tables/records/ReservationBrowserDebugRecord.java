/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationBrowserDebug;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class ReservationBrowserDebugRecord extends UpdatableRecordImpl<ReservationBrowserDebugRecord> implements Record20<Integer, String, String, String, String, String, String, Integer, Integer, Long, Long, Long, Long, Long, Long, Integer, Long, UByte, Timestamp, Long> {

    private static final long serialVersionUID = 1341009065;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.url</code>.
     */
    public void setUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.url</code>.
     */
    public String getUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.browser</code>.
     */
    public void setBrowser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.browser</code>.
     */
    public String getBrowser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.version</code>.
     */
    public void setVersion(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.version</code>.
     */
    public String getVersion() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.platform</code>.
     */
    public void setPlatform(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.platform</code>.
     */
    public String getPlatform() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.userAgent</code>.
     */
    public void setUseragent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.userAgent</code>.
     */
    public String getUseragent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.userLanguage</code>.
     */
    public void setUserlanguage(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.userLanguage</code>.
     */
    public String getUserlanguage() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.svn_version</code>.
     */
    public void setSvnVersion(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.svn_version</code>.
     */
    public Integer getSvnVersion() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.engine_name_id</code>.
     */
    public void setEngineNameId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.engine_name_id</code>.
     */
    public Integer getEngineNameId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.cID</code>.
     */
    public void setCid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.cID</code>.
     */
    public Long getCid() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.kID</code>.
     */
    public void setKid(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.kID</code>.
     */
    public Long getKid() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.agID</code>.
     */
    public void setAgid(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.agID</code>.
     */
    public Long getAgid() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.aID</code>.
     */
    public void setAid(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.aID</code>.
     */
    public Long getAid() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.customer_id</code>.
     */
    public void setCustomerId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.customer_id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.engineLoadID</code>.
     */
    public void setEngineloadid(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.engineLoadID</code>.
     */
    public Long getEngineloadid() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.fk_engineLoadURLs</code>.
     */
    public void setFkEngineloadurls(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.fk_engineLoadURLs</code>.
     */
    public Integer getFkEngineloadurls() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.queryID</code>.
     */
    public void setQueryid(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.queryID</code>.
     */
    public Long getQueryid() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.proxyversion</code>.
     */
    public void setProxyversion(UByte value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.proxyversion</code>.
     */
    public UByte getProxyversion() {
        return (UByte) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.res_date</code>.
     */
    public void setResDate(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.res_date</code>.
     */
    public Timestamp getResDate() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.fk_big_engineLoadURLs</code>.
     */
    public void setFkBigEngineloadurls(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_browser_debug.fk_big_engineLoadURLs</code>.
     */
    public Long getFkBigEngineloadurls() {
        return (Long) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, String, String, String, String, String, Integer, Integer, Long, Long, Long, Long, Long, Long, Integer, Long, UByte, Timestamp, Long> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, String, String, String, String, String, Integer, Integer, Long, Long, Long, Long, Long, Long, Integer, Long, UByte, Timestamp, Long> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.BROWSER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.PLATFORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.USERAGENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.USERLANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.SVN_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.ENGINE_NAME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.KID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.AGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.AID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.ENGINELOADID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.FK_ENGINELOADURLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field17() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.QUERYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field18() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.PROXYVERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.RES_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field20() {
        return ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG.FK_BIG_ENGINELOADURLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getBrowser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPlatform();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUseragent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getUserlanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getSvnVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getEngineNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getKid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getAgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
        return getAid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component15() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getFkEngineloadurls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component17() {
        return getQueryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component18() {
        return getProxyversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getResDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component20() {
        return getFkBigEngineloadurls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBrowser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPlatform();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUseragent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUserlanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSvnVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getEngineNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getKid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getAgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getAid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getFkEngineloadurls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value17() {
        return getQueryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value18() {
        return getProxyversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getResDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value20() {
        return getFkBigEngineloadurls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value1(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value2(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value3(String value) {
        setBrowser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value4(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value5(String value) {
        setPlatform(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value6(String value) {
        setUseragent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value7(String value) {
        setUserlanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value8(Integer value) {
        setSvnVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value9(Integer value) {
        setEngineNameId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value10(Long value) {
        setCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value11(Long value) {
        setKid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value12(Long value) {
        setAgid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value13(Long value) {
        setAid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value14(Long value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value15(Long value) {
        setEngineloadid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value16(Integer value) {
        setFkEngineloadurls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value17(Long value) {
        setQueryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value18(UByte value) {
        setProxyversion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value19(Timestamp value) {
        setResDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord value20(Long value) {
        setFkBigEngineloadurls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationBrowserDebugRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8, Integer value9, Long value10, Long value11, Long value12, Long value13, Long value14, Long value15, Integer value16, Long value17, UByte value18, Timestamp value19, Long value20) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationBrowserDebugRecord
     */
    public ReservationBrowserDebugRecord() {
        super(ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG);
    }

    /**
     * Create a detached, initialised ReservationBrowserDebugRecord
     */
    public ReservationBrowserDebugRecord(Integer fkReservation, String url, String browser, String version, String platform, String useragent, String userlanguage, Integer svnVersion, Integer engineNameId, Long cid, Long kid, Long agid, Long aid, Long customerId, Long engineloadid, Integer fkEngineloadurls, Long queryid, UByte proxyversion, Timestamp resDate, Long fkBigEngineloadurls) {
        super(ReservationBrowserDebug.RESERVATION_BROWSER_DEBUG);

        set(0, fkReservation);
        set(1, url);
        set(2, browser);
        set(3, version);
        set(4, platform);
        set(5, useragent);
        set(6, userlanguage);
        set(7, svnVersion);
        set(8, engineNameId);
        set(9, cid);
        set(10, kid);
        set(11, agid);
        set(12, aid);
        set(13, customerId);
        set(14, engineloadid);
        set(15, fkEngineloadurls);
        set(16, queryid);
        set(17, proxyversion);
        set(18, resDate);
        set(19, fkBigEngineloadurls);
    }
}