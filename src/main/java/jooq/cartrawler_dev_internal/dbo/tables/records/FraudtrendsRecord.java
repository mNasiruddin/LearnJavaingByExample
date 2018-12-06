/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Fraudtrends;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class FraudtrendsRecord extends UpdatableRecordImpl<FraudtrendsRecord> implements Record17<Integer, Integer, UByte, UByte, Short, Short, String, UByte, UByte, String, String, Integer, String, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 453783636;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.pickup</code>.
     */
    public void setPickup(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.pickup</code>.
     */
    public Integer getPickup() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.hourOfDayMin</code>.
     */
    public void setHourofdaymin(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.hourOfDayMin</code>.
     */
    public UByte getHourofdaymin() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.hourOfDayMax</code>.
     */
    public void setHourofdaymax(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.hourOfDayMax</code>.
     */
    public UByte getHourofdaymax() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.proximityMin</code>.
     */
    public void setProximitymin(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.proximityMin</code>.
     */
    public Short getProximitymin() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.proximityMax</code>.
     */
    public void setProximitymax(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.proximityMax</code>.
     */
    public Short getProximitymax() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.geoCountry</code>.
     */
    public void setGeocountry(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.geoCountry</code>.
     */
    public String getGeocountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.daysMin</code>.
     */
    public void setDaysmin(UByte value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.daysMin</code>.
     */
    public UByte getDaysmin() {
        return (UByte) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.daysMax</code>.
     */
    public void setDaysmax(UByte value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.daysMax</code>.
     */
    public UByte getDaysmax() {
        return (UByte) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.surname</code>.
     */
    public void setSurname(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.surname</code>.
     */
    public String getSurname() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.supplier</code>.
     */
    public void setSupplier(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.supplier</code>.
     */
    public String getSupplier() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.channel</code>.
     */
    public void setChannel(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.channel</code>.
     */
    public Integer getChannel() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.car</code>.
     */
    public void setCar(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.car</code>.
     */
    public String getCar() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.residency</code>.
     */
    public void setResidency(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.residency</code>.
     */
    public String getResidency() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.client</code>.
     */
    public void setClient(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.client</code>.
     */
    public Integer getClient() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.risk</code>.
     */
    public void setRisk(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.risk</code>.
     */
    public Integer getRisk() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fraudTrends.CarAgentLoc</code>.
     */
    public void setCaragentloc(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fraudTrends.CarAgentLoc</code>.
     */
    public Integer getCaragentloc() {
        return (Integer) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, Integer, UByte, UByte, Short, Short, String, UByte, UByte, String, String, Integer, String, String, Integer, Integer, Integer> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, Integer, UByte, UByte, Short, Short, String, UByte, UByte, String, String, Integer, String, String, Integer, Integer, Integer> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Fraudtrends.FRAUDTRENDS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Fraudtrends.FRAUDTRENDS.PICKUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return Fraudtrends.FRAUDTRENDS.HOUROFDAYMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field4() {
        return Fraudtrends.FRAUDTRENDS.HOUROFDAYMAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Fraudtrends.FRAUDTRENDS.PROXIMITYMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Fraudtrends.FRAUDTRENDS.PROXIMITYMAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Fraudtrends.FRAUDTRENDS.GEOCOUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field8() {
        return Fraudtrends.FRAUDTRENDS.DAYSMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field9() {
        return Fraudtrends.FRAUDTRENDS.DAYSMAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Fraudtrends.FRAUDTRENDS.SURNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Fraudtrends.FRAUDTRENDS.SUPPLIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Fraudtrends.FRAUDTRENDS.CHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Fraudtrends.FRAUDTRENDS.CAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Fraudtrends.FRAUDTRENDS.RESIDENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return Fraudtrends.FRAUDTRENDS.CLIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return Fraudtrends.FRAUDTRENDS.RISK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return Fraudtrends.FRAUDTRENDS.CARAGENTLOC;
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
        return getPickup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component3() {
        return getHourofdaymin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component4() {
        return getHourofdaymax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getProximitymin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getProximitymax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getGeocountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component8() {
        return getDaysmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component9() {
        return getDaysmax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSupplier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getCar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getResidency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getRisk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component17() {
        return getCaragentloc();
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
        return getPickup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getHourofdaymin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value4() {
        return getHourofdaymax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getProximitymin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getProximitymax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getGeocountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value8() {
        return getDaysmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value9() {
        return getDaysmax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSupplier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getCar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getResidency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getRisk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getCaragentloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value2(Integer value) {
        setPickup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value3(UByte value) {
        setHourofdaymin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value4(UByte value) {
        setHourofdaymax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value5(Short value) {
        setProximitymin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value6(Short value) {
        setProximitymax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value7(String value) {
        setGeocountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value8(UByte value) {
        setDaysmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value9(UByte value) {
        setDaysmax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value10(String value) {
        setSurname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value11(String value) {
        setSupplier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value12(Integer value) {
        setChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value13(String value) {
        setCar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value14(String value) {
        setResidency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value15(Integer value) {
        setClient(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value16(Integer value) {
        setRisk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord value17(Integer value) {
        setCaragentloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FraudtrendsRecord values(Integer value1, Integer value2, UByte value3, UByte value4, Short value5, Short value6, String value7, UByte value8, UByte value9, String value10, String value11, Integer value12, String value13, String value14, Integer value15, Integer value16, Integer value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FraudtrendsRecord
     */
    public FraudtrendsRecord() {
        super(Fraudtrends.FRAUDTRENDS);
    }

    /**
     * Create a detached, initialised FraudtrendsRecord
     */
    public FraudtrendsRecord(Integer id, Integer pickup, UByte hourofdaymin, UByte hourofdaymax, Short proximitymin, Short proximitymax, String geocountry, UByte daysmin, UByte daysmax, String surname, String supplier, Integer channel, String car, String residency, Integer client, Integer risk, Integer caragentloc) {
        super(Fraudtrends.FRAUDTRENDS);

        set(0, id);
        set(1, pickup);
        set(2, hourofdaymin);
        set(3, hourofdaymax);
        set(4, proximitymin);
        set(5, proximitymax);
        set(6, geocountry);
        set(7, daysmin);
        set(8, daysmax);
        set(9, surname);
        set(10, supplier);
        set(11, channel);
        set(12, car);
        set(13, residency);
        set(14, client);
        set(15, risk);
        set(16, caragentloc);
    }
}
