/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.ViewGroupResGroupCarRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class ViewGroupResGroupCar extends TableImpl<ViewGroupResGroupCarRecord> {

    private static final long serialVersionUID = 190766487;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.view_group_res_group_car</code>
     */
    public static final ViewGroupResGroupCar VIEW_GROUP_RES_GROUP_CAR = new ViewGroupResGroupCar();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewGroupResGroupCarRecord> getRecordType() {
        return ViewGroupResGroupCarRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.Group_ID</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> GROUP_ID = createField("Group_ID", org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.Group_Name</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> GROUP_NAME = createField("Group_Name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.Group_type</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> GROUP_TYPE = createField("Group_type", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.KCode</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> KCODE = createField("KCode", org.jooq.impl.SQLDataType.CHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.freesale</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> FREESALE = createField("freesale", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.Van_Group</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> VAN_GROUP = createField("Van_Group", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.MinAge_30</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> MINAGE_30 = createField("MinAge_30", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.advance_time</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Integer> ADVANCE_TIME = createField("advance_time", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.OTA_VehClass</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Integer> OTA_VEHCLASS = createField("OTA_VehClass", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.OTA_VehCategory</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Integer> OTA_VEHCATEGORY = createField("OTA_VehCategory", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.group_status</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> GROUP_STATUS = createField("group_status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.car_agent_id</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.selected_car_id</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Integer> SELECTED_CAR_ID = createField("selected_car_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.res_group_code</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> RES_GROUP_CODE = createField("res_group_code", org.jooq.impl.SQLDataType.CHAR(4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.region_id</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, UByte> REGION_ID = createField("region_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.sample_car_id</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Integer> SAMPLE_CAR_ID = createField("sample_car_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.automatic</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> AUTOMATIC = createField("automatic", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.aircon</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> AIRCON = createField("aircon", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.gps</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> GPS = createField("gps", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.bags</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, UByte> BAGS = createField("bags", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.paslarge</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, UByte> PASLARGE = createField("paslarge", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.passmall</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, UByte> PASSMALL = createField("passmall", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.doors</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> DOORS = createField("doors", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.seats</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> SEATS = createField("seats", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.drive</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> DRIVE = createField("drive", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.fuel</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> FUEL = createField("fuel", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.ota_vehicle_category</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> OTA_VEHICLE_CATEGORY = createField("ota_vehicle_category", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.ota_vehicle_class_size</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> OTA_VEHICLE_CLASS_SIZE = createField("ota_vehicle_class_size", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.enginesize</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Double> ENGINESIZE = createField("enginesize", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.fuelconsumption</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Double> FUELCONSUMPTION = createField("fuelconsumption", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.fuelconsumption_unit</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> FUELCONSUMPTION_UNIT = createField("fuelconsumption_unit", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.picture</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> PICTURE = createField("picture", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.picture_plain</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> PICTURE_PLAIN = createField("picture_plain", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.ranking</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, UByte> RANKING = createField("ranking", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.cartrawler_category</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Short> CARTRAWLER_CATEGORY = createField("cartrawler_category", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.Country_ID</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> COUNTRY_ID = createField("Country_ID", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.blocked</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> BLOCKED = createField("blocked", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.onrequest</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> ONREQUEST = createField("onrequest", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.guaranteed_car</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Boolean> GUARANTEED_CAR = createField("guaranteed_car", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.car_id</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, Integer> CAR_ID = createField("car_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.make</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> MAKE = createField("make", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.model</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> MODEL = createField("model", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group_car.description</code>.
     */
    public final TableField<ViewGroupResGroupCarRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.view_group_res_group_car</code> table reference
     */
    public ViewGroupResGroupCar() {
        this(DSL.name("view_group_res_group_car"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.view_group_res_group_car</code> table reference
     */
    public ViewGroupResGroupCar(String alias) {
        this(DSL.name(alias), VIEW_GROUP_RES_GROUP_CAR);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.view_group_res_group_car</code> table reference
     */
    public ViewGroupResGroupCar(Name alias) {
        this(alias, VIEW_GROUP_RES_GROUP_CAR);
    }

    private ViewGroupResGroupCar(Name alias, Table<ViewGroupResGroupCarRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewGroupResGroupCar(Name alias, Table<ViewGroupResGroupCarRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewGroupResGroupCar(Table<O> child, ForeignKey<O, ViewGroupResGroupCarRecord> key) {
        super(child, key, VIEW_GROUP_RES_GROUP_CAR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewGroupResGroupCar as(String alias) {
        return new ViewGroupResGroupCar(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewGroupResGroupCar as(Name alias) {
        return new ViewGroupResGroupCar(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewGroupResGroupCar rename(String name) {
        return new ViewGroupResGroupCar(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewGroupResGroupCar rename(Name name) {
        return new ViewGroupResGroupCar(name, null);
    }
}
