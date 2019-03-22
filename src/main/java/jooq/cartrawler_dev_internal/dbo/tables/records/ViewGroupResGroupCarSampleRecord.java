/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ViewGroupResGroupCarSample;

import org.jooq.impl.TableRecordImpl;
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
public class ViewGroupResGroupCarSampleRecord extends TableRecordImpl<ViewGroupResGroupCarSampleRecord> {

    private static final long serialVersionUID = -1394544193;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Group_ID</code>.
     */
    public void setGroupId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Group_ID</code>.
     */
    public String getGroupId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Group_Name</code>.
     */
    public void setGroupName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Group_Name</code>.
     */
    public String getGroupName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Group_type</code>.
     */
    public void setGroupType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Group_type</code>.
     */
    public String getGroupType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.KCode</code>.
     */
    public void setKcode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.KCode</code>.
     */
    public String getKcode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.freesale</code>.
     */
    public void setFreesale(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.freesale</code>.
     */
    public Boolean getFreesale() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Van_Group</code>.
     */
    public void setVanGroup(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Van_Group</code>.
     */
    public Boolean getVanGroup() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.MinAge_30</code>.
     */
    public void setMinage_30(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.MinAge_30</code>.
     */
    public Boolean getMinage_30() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.advance_time</code>.
     */
    public void setAdvanceTime(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.advance_time</code>.
     */
    public Integer getAdvanceTime() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.OTA_VehClass</code>.
     */
    public void setOtaVehclass(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.OTA_VehClass</code>.
     */
    public Integer getOtaVehclass() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.OTA_VehCategory</code>.
     */
    public void setOtaVehcategory(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.OTA_VehCategory</code>.
     */
    public Integer getOtaVehcategory() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.group_status</code>.
     */
    public void setGroupStatus(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.group_status</code>.
     */
    public Boolean getGroupStatus() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.selected_car_id</code>.
     */
    public void setSelectedCarId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.selected_car_id</code>.
     */
    public Integer getSelectedCarId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.res_group_code</code>.
     */
    public void setResGroupCode(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.res_group_code</code>.
     */
    public String getResGroupCode() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.region_id</code>.
     */
    public void setRegionId(UByte value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.region_id</code>.
     */
    public UByte getRegionId() {
        return (UByte) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.sample_car_id</code>.
     */
    public void setSampleCarId(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.sample_car_id</code>.
     */
    public Integer getSampleCarId() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.automatic</code>.
     */
    public void setAutomatic(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.automatic</code>.
     */
    public Boolean getAutomatic() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.aircon</code>.
     */
    public void setAircon(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.aircon</code>.
     */
    public Boolean getAircon() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.gps</code>.
     */
    public void setGps(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.gps</code>.
     */
    public Boolean getGps() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.bags</code>.
     */
    public void setBags(UByte value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.bags</code>.
     */
    public UByte getBags() {
        return (UByte) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.paslarge</code>.
     */
    public void setPaslarge(UByte value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.paslarge</code>.
     */
    public UByte getPaslarge() {
        return (UByte) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.passmall</code>.
     */
    public void setPassmall(UByte value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.passmall</code>.
     */
    public UByte getPassmall() {
        return (UByte) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.doors</code>.
     */
    public void setDoors(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.doors</code>.
     */
    public String getDoors() {
        return (String) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.seats</code>.
     */
    public void setSeats(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.seats</code>.
     */
    public String getSeats() {
        return (String) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.drive</code>.
     */
    public void setDrive(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.drive</code>.
     */
    public String getDrive() {
        return (String) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.fuel</code>.
     */
    public void setFuel(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.fuel</code>.
     */
    public String getFuel() {
        return (String) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.ota_vehicle_category</code>.
     */
    public void setOtaVehicleCategory(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.ota_vehicle_category</code>.
     */
    public String getOtaVehicleCategory() {
        return (String) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.ota_vehicle_class_size</code>.
     */
    public void setOtaVehicleClassSize(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.ota_vehicle_class_size</code>.
     */
    public String getOtaVehicleClassSize() {
        return (String) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.enginesize</code>.
     */
    public void setEnginesize(Double value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.enginesize</code>.
     */
    public Double getEnginesize() {
        return (Double) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.fuelconsumption</code>.
     */
    public void setFuelconsumption(Double value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.fuelconsumption</code>.
     */
    public Double getFuelconsumption() {
        return (Double) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.fuelconsumption_unit</code>.
     */
    public void setFuelconsumptionUnit(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.fuelconsumption_unit</code>.
     */
    public String getFuelconsumptionUnit() {
        return (String) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.picture</code>.
     */
    public void setPicture(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.picture</code>.
     */
    public String getPicture() {
        return (String) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.picture_plain</code>.
     */
    public void setPicturePlain(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.picture_plain</code>.
     */
    public String getPicturePlain() {
        return (String) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.ranking</code>.
     */
    public void setRanking(UByte value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.ranking</code>.
     */
    public UByte getRanking() {
        return (UByte) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.cartrawler_category</code>.
     */
    public void setCartrawlerCategory(Short value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.cartrawler_category</code>.
     */
    public Short getCartrawlerCategory() {
        return (Short) get(34);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Country_ID</code>.
     */
    public void setCountryId(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.Country_ID</code>.
     */
    public String getCountryId() {
        return (String) get(35);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.blocked</code>.
     */
    public void setBlocked(Boolean value) {
        set(36, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.blocked</code>.
     */
    public Boolean getBlocked() {
        return (Boolean) get(36);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.onrequest</code>.
     */
    public void setOnrequest(Boolean value) {
        set(37, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.onrequest</code>.
     */
    public Boolean getOnrequest() {
        return (Boolean) get(37);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.guaranteed_car</code>.
     */
    public void setGuaranteedCar(Boolean value) {
        set(38, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.guaranteed_car</code>.
     */
    public Boolean getGuaranteedCar() {
        return (Boolean) get(38);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.car_id</code>.
     */
    public void setCarId(Integer value) {
        set(39, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.car_id</code>.
     */
    public Integer getCarId() {
        return (Integer) get(39);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.make</code>.
     */
    public void setMake(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.make</code>.
     */
    public String getMake() {
        return (String) get(40);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.model</code>.
     */
    public void setModel(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.model</code>.
     */
    public String getModel() {
        return (String) get(41);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.description</code>.
     */
    public void setDescription(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.view_group_res_group_car_sample.description</code>.
     */
    public String getDescription() {
        return (String) get(42);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewGroupResGroupCarSampleRecord
     */
    public ViewGroupResGroupCarSampleRecord() {
        super(ViewGroupResGroupCarSample.VIEW_GROUP_RES_GROUP_CAR_SAMPLE);
    }

    /**
     * Create a detached, initialised ViewGroupResGroupCarSampleRecord
     */
    public ViewGroupResGroupCarSampleRecord(String groupId, String groupName, String groupType, String kcode, Boolean freesale, Boolean vanGroup, Boolean minage_30, Integer advanceTime, Integer otaVehclass, Integer otaVehcategory, Boolean groupStatus, Integer carAgentId, Integer selectedCarId, String resGroupCode, UByte regionId, Integer sampleCarId, Boolean automatic, Boolean aircon, Boolean gps, UByte bags, UByte paslarge, UByte passmall, String doors, String seats, String drive, String fuel, String otaVehicleCategory, String otaVehicleClassSize, Double enginesize, Double fuelconsumption, String fuelconsumptionUnit, String picture, String picturePlain, UByte ranking, Short cartrawlerCategory, String countryId, Boolean blocked, Boolean onrequest, Boolean guaranteedCar, Integer carId, String make, String model, String description) {
        super(ViewGroupResGroupCarSample.VIEW_GROUP_RES_GROUP_CAR_SAMPLE);

        set(0, groupId);
        set(1, groupName);
        set(2, groupType);
        set(3, kcode);
        set(4, freesale);
        set(5, vanGroup);
        set(6, minage_30);
        set(7, advanceTime);
        set(8, otaVehclass);
        set(9, otaVehcategory);
        set(10, groupStatus);
        set(11, carAgentId);
        set(12, selectedCarId);
        set(13, resGroupCode);
        set(14, regionId);
        set(15, sampleCarId);
        set(16, automatic);
        set(17, aircon);
        set(18, gps);
        set(19, bags);
        set(20, paslarge);
        set(21, passmall);
        set(22, doors);
        set(23, seats);
        set(24, drive);
        set(25, fuel);
        set(26, otaVehicleCategory);
        set(27, otaVehicleClassSize);
        set(28, enginesize);
        set(29, fuelconsumption);
        set(30, fuelconsumptionUnit);
        set(31, picture);
        set(32, picturePlain);
        set(33, ranking);
        set(34, cartrawlerCategory);
        set(35, countryId);
        set(36, blocked);
        set(37, onrequest);
        set(38, guaranteedCar);
        set(39, carId);
        set(40, make);
        set(41, model);
        set(42, description);
    }
}