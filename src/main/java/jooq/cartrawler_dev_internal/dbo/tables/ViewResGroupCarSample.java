/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.ViewResGroupCarSampleRecord;

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
public class ViewResGroupCarSample extends TableImpl<ViewResGroupCarSampleRecord> {

    private static final long serialVersionUID = 409192485;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample</code>
     */
    public static final ViewResGroupCarSample VIEW_RES_GROUP_CAR_SAMPLE = new ViewResGroupCarSample();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewResGroupCarSampleRecord> getRecordType() {
        return ViewResGroupCarSampleRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.res_group_code</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> RES_GROUP_CODE = createField("res_group_code", org.jooq.impl.SQLDataType.CHAR(4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.region_id</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, UByte> REGION_ID = createField("region_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.sample_car_id</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, Integer> SAMPLE_CAR_ID = createField("sample_car_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.automatic</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, Boolean> AUTOMATIC = createField("automatic", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.aircon</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, Boolean> AIRCON = createField("aircon", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.gps</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, Boolean> GPS = createField("gps", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.bags</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, UByte> BAGS = createField("bags", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.paslarge</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, UByte> PASLARGE = createField("paslarge", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.passmall</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, UByte> PASSMALL = createField("passmall", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.doors</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> DOORS = createField("doors", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.seats</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> SEATS = createField("seats", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.drive</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> DRIVE = createField("drive", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.fuel</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> FUEL = createField("fuel", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.ota_vehicle_category</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> OTA_VEHICLE_CATEGORY = createField("ota_vehicle_category", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.ota_vehicle_class_size</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> OTA_VEHICLE_CLASS_SIZE = createField("ota_vehicle_class_size", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.enginesize</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, Double> ENGINESIZE = createField("enginesize", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.fuelconsumption</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, Double> FUELCONSUMPTION = createField("fuelconsumption", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.fuelconsumption_unit</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> FUELCONSUMPTION_UNIT = createField("fuelconsumption_unit", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.picture</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> PICTURE = createField("picture", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.picture_plain</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> PICTURE_PLAIN = createField("picture_plain", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.ranking</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, UByte> RANKING = createField("ranking", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.cartrawler_category</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, Short> CARTRAWLER_CATEGORY = createField("cartrawler_category", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.country_id</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.car_id</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, Integer> CAR_ID = createField("car_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.make</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> MAKE = createField("make", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.model</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> MODEL = createField("model", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample.description</code>.
     */
    public final TableField<ViewResGroupCarSampleRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample</code> table reference
     */
    public ViewResGroupCarSample() {
        this(DSL.name("view_res_group_car_sample"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample</code> table reference
     */
    public ViewResGroupCarSample(String alias) {
        this(DSL.name(alias), VIEW_RES_GROUP_CAR_SAMPLE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.view_res_group_car_sample</code> table reference
     */
    public ViewResGroupCarSample(Name alias) {
        this(alias, VIEW_RES_GROUP_CAR_SAMPLE);
    }

    private ViewResGroupCarSample(Name alias, Table<ViewResGroupCarSampleRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewResGroupCarSample(Name alias, Table<ViewResGroupCarSampleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewResGroupCarSample(Table<O> child, ForeignKey<O, ViewResGroupCarSampleRecord> key) {
        super(child, key, VIEW_RES_GROUP_CAR_SAMPLE);
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
    public ViewResGroupCarSample as(String alias) {
        return new ViewResGroupCarSample(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewResGroupCarSample as(Name alias) {
        return new ViewResGroupCarSample(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewResGroupCarSample rename(String name) {
        return new ViewResGroupCarSample(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewResGroupCarSample rename(Name name) {
        return new ViewResGroupCarSample(name, null);
    }
}
