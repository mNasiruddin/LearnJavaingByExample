/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Affbank;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class AffbankRecord extends UpdatableRecordImpl<AffbankRecord> implements Record19<Integer, Integer, String, String, String, String, String, String, String, String, Timestamp, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 206340275;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.idAffBank</code>.
     */
    public void setIdaffbank(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.idAffBank</code>.
     */
    public Integer getIdaffbank() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.Client_ID</code>.
     */
    public void setClientId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.Client_ID</code>.
     */
    public Integer getClientId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.AccName</code>.
     */
    public void setAccname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.AccName</code>.
     */
    public String getAccname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankName</code>.
     */
    public void setBankname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankName</code>.
     */
    public String getBankname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankAddress</code>.
     */
    public void setBankaddress(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankAddress</code>.
     */
    public String getBankaddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankSortCode</code>.
     */
    public void setBanksortcode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankSortCode</code>.
     */
    public String getBanksortcode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankAccNo</code>.
     */
    public void setBankaccno(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankAccNo</code>.
     */
    public String getBankaccno() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.SwiftCode</code>.
     */
    public void setSwiftcode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.SwiftCode</code>.
     */
    public String getSwiftcode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.IBAN</code>.
     */
    public void setIban(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.IBAN</code>.
     */
    public String getIban() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankCountryID</code>.
     */
    public void setBankcountryid(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankCountryID</code>.
     */
    public String getBankcountryid() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.last_changed_date</code>.
     */
    public void setLastChangedDate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.last_changed_date</code>.
     */
    public Timestamp getLastChangedDate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.AccName_inter</code>.
     */
    public void setAccnameInter(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.AccName_inter</code>.
     */
    public String getAccnameInter() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankName_inter</code>.
     */
    public void setBanknameInter(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankName_inter</code>.
     */
    public String getBanknameInter() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankAddress_inter</code>.
     */
    public void setBankaddressInter(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankAddress_inter</code>.
     */
    public String getBankaddressInter() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankSortCode_inter</code>.
     */
    public void setBanksortcodeInter(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankSortCode_inter</code>.
     */
    public String getBanksortcodeInter() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.SwiftCode_inter</code>.
     */
    public void setSwiftcodeInter(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.SwiftCode_inter</code>.
     */
    public String getSwiftcodeInter() {
        return (String) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.IBAN_inter</code>.
     */
    public void setIbanInter(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.IBAN_inter</code>.
     */
    public String getIbanInter() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankCountryID_inter</code>.
     */
    public void setBankcountryidInter(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankCountryID_inter</code>.
     */
    public String getBankcountryidInter() {
        return (String) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffBank.BankAccNo_inter</code>.
     */
    public void setBankaccnoInter(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffBank.BankAccNo_inter</code>.
     */
    public String getBankaccnoInter() {
        return (String) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, String, String, String, String, String, String, String, String, Timestamp, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, String, String, String, String, String, String, String, String, Timestamp, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Affbank.AFFBANK.IDAFFBANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Affbank.AFFBANK.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Affbank.AFFBANK.ACCNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Affbank.AFFBANK.BANKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Affbank.AFFBANK.BANKADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Affbank.AFFBANK.BANKSORTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Affbank.AFFBANK.BANKACCNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Affbank.AFFBANK.SWIFTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Affbank.AFFBANK.IBAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Affbank.AFFBANK.BANKCOUNTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Affbank.AFFBANK.LAST_CHANGED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Affbank.AFFBANK.ACCNAME_INTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Affbank.AFFBANK.BANKNAME_INTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Affbank.AFFBANK.BANKADDRESS_INTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Affbank.AFFBANK.BANKSORTCODE_INTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Affbank.AFFBANK.SWIFTCODE_INTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Affbank.AFFBANK.IBAN_INTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Affbank.AFFBANK.BANKCOUNTRYID_INTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Affbank.AFFBANK.BANKACCNO_INTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIdaffbank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAccname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBankname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBankaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getBanksortcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBankaccno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSwiftcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getIban();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getBankcountryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getLastChangedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAccnameInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getBanknameInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getBankaddressInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getBanksortcodeInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getSwiftcodeInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getIbanInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getBankcountryidInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getBankaccnoInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdaffbank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAccname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBankname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBankaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBanksortcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBankaccno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSwiftcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getIban();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBankcountryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getLastChangedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAccnameInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getBanknameInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getBankaddressInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getBanksortcodeInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getSwiftcodeInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getIbanInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getBankcountryidInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getBankaccnoInter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value1(Integer value) {
        setIdaffbank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value2(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value3(String value) {
        setAccname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value4(String value) {
        setBankname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value5(String value) {
        setBankaddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value6(String value) {
        setBanksortcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value7(String value) {
        setBankaccno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value8(String value) {
        setSwiftcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value9(String value) {
        setIban(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value10(String value) {
        setBankcountryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value11(Timestamp value) {
        setLastChangedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value12(String value) {
        setAccnameInter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value13(String value) {
        setBanknameInter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value14(String value) {
        setBankaddressInter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value15(String value) {
        setBanksortcodeInter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value16(String value) {
        setSwiftcodeInter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value17(String value) {
        setIbanInter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value18(String value) {
        setBankcountryidInter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord value19(String value) {
        setBankaccnoInter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffbankRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Timestamp value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, String value19) {
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
     * Create a detached AffbankRecord
     */
    public AffbankRecord() {
        super(Affbank.AFFBANK);
    }

    /**
     * Create a detached, initialised AffbankRecord
     */
    public AffbankRecord(Integer idaffbank, Integer clientId, String accname, String bankname, String bankaddress, String banksortcode, String bankaccno, String swiftcode, String iban, String bankcountryid, Timestamp lastChangedDate, String accnameInter, String banknameInter, String bankaddressInter, String banksortcodeInter, String swiftcodeInter, String ibanInter, String bankcountryidInter, String bankaccnoInter) {
        super(Affbank.AFFBANK);

        set(0, idaffbank);
        set(1, clientId);
        set(2, accname);
        set(3, bankname);
        set(4, bankaddress);
        set(5, banksortcode);
        set(6, bankaccno);
        set(7, swiftcode);
        set(8, iban);
        set(9, bankcountryid);
        set(10, lastChangedDate);
        set(11, accnameInter);
        set(12, banknameInter);
        set(13, bankaddressInter);
        set(14, banksortcodeInter);
        set(15, swiftcodeInter);
        set(16, ibanInter);
        set(17, bankcountryidInter);
        set(18, bankaccnoInter);
    }
}
