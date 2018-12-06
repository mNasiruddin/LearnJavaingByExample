/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.Temp2Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Temp2 extends TableImpl<Temp2Record> {

    private static final long serialVersionUID = 1654244953;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.temp2</code>
     */
    public static final Temp2 TEMP2 = new Temp2();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Temp2Record> getRecordType() {
        return Temp2Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Ref</code>.
     */
    public final TableField<Temp2Record, Integer> REF = createField("Ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Reservation_ID</code>.
     */
    public final TableField<Temp2Record, String> RESERVATION_ID = createField("Reservation_ID", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Internal_Ref</code>.
     */
    public final TableField<Temp2Record, String> INTERNAL_REF = createField("Internal_Ref", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Res_Date</code>.
     */
    public final TableField<Temp2Record, Timestamp> RES_DATE = createField("Res_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.PickUp_Location</code>.
     */
    public final TableField<Temp2Record, Integer> PICKUP_LOCATION = createField("PickUp_Location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.DropOff_Location</code>.
     */
    public final TableField<Temp2Record, Integer> DROPOFF_LOCATION = createField("DropOff_Location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.PickUp_Date</code>.
     */
    public final TableField<Temp2Record, Timestamp> PICKUP_DATE = createField("PickUp_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.PickUp_Time</code>.
     */
    public final TableField<Temp2Record, String> PICKUP_TIME = createField("PickUp_Time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.DropOff_Date</code>.
     */
    public final TableField<Temp2Record, Timestamp> DROPOFF_DATE = createField("DropOff_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.DropOff_Time</code>.
     */
    public final TableField<Temp2Record, String> DROPOFF_TIME = createField("DropOff_Time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Estimated_Days</code>.
     */
    public final TableField<Temp2Record, Long> ESTIMATED_DAYS = createField("Estimated_Days", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Country_ID</code>.
     */
    public final TableField<Temp2Record, String> COUNTRY_ID = createField("Country_ID", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.FirstName</code>.
     */
    public final TableField<Temp2Record, String> FIRSTNAME = createField("FirstName", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Surname</code>.
     */
    public final TableField<Temp2Record, String> SURNAME = createField("Surname", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Address</code>.
     */
    public final TableField<Temp2Record, String> ADDRESS = createField("Address", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.EMail</code>.
     */
    public final TableField<Temp2Record, String> EMAIL = createField("EMail", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Phone</code>.
     */
    public final TableField<Temp2Record, String> PHONE = createField("Phone", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Client_ID</code>.
     */
    public final TableField<Temp2Record, Integer> CLIENT_ID = createField("Client_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Airline_ID</code>.
     */
    public final TableField<Temp2Record, String> AIRLINE_ID = createField("Airline_ID", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Flight_No</code>.
     */
    public final TableField<Temp2Record, String> FLIGHT_NO = createField("Flight_No", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Billing_Status</code>.
     */
    public final TableField<Temp2Record, String> BILLING_STATUS = createField("Billing_Status", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Reservation_Status</code>.
     */
    public final TableField<Temp2Record, String> RESERVATION_STATUS = createField("Reservation_Status", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Complete</code>.
     */
    public final TableField<Temp2Record, Boolean> COMPLETE = createField("Complete", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.ConfirmedBy</code>.
     */
    public final TableField<Temp2Record, String> CONFIRMEDBY = createField("ConfirmedBy", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Date_Confirmed</code>.
     */
    public final TableField<Temp2Record, String> DATE_CONFIRMED = createField("Date_Confirmed", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Confirmation_Date</code>.
     */
    public final TableField<Temp2Record, Timestamp> CONFIRMATION_DATE = createField("Confirmation_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Confirmation_PIN</code>.
     */
    public final TableField<Temp2Record, Long> CONFIRMATION_PIN = createField("Confirmation_PIN", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Currency_ID</code>.
     */
    public final TableField<Temp2Record, String> CURRENCY_ID = createField("Currency_ID", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.VAT_Rate</code>.
     */
    public final TableField<Temp2Record, BigDecimal> VAT_RATE = createField("VAT_Rate", org.jooq.impl.SQLDataType.NUMERIC(5, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Third_Party</code>.
     */
    public final TableField<Temp2Record, BigDecimal> THIRD_PARTY = createField("Third_Party", org.jooq.impl.SQLDataType.NUMERIC(10, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.CDW</code>.
     */
    public final TableField<Temp2Record, BigDecimal> CDW = createField("CDW", org.jooq.impl.SQLDataType.NUMERIC(6, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Airport_Tax</code>.
     */
    public final TableField<Temp2Record, BigDecimal> AIRPORT_TAX = createField("Airport_Tax", org.jooq.impl.SQLDataType.NUMERIC(5, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.after_hours_charge</code>.
     */
    public final TableField<Temp2Record, BigDecimal> AFTER_HOURS_CHARGE = createField("after_hours_charge", org.jooq.impl.SQLDataType.NUMERIC(6, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.dropoff_surcharge</code>.
     */
    public final TableField<Temp2Record, BigDecimal> DROPOFF_SURCHARGE = createField("dropoff_surcharge", org.jooq.impl.SQLDataType.NUMERIC(6, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.age_surcharge</code>.
     */
    public final TableField<Temp2Record, BigDecimal> AGE_SURCHARGE = createField("age_surcharge", org.jooq.impl.SQLDataType.NUMERIC(6, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.additional_info</code>.
     */
    public final TableField<Temp2Record, String> ADDITIONAL_INFO = createField("additional_info", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Booking_Agent</code>.
     */
    public final TableField<Temp2Record, Integer> BOOKING_AGENT = createField("Booking_Agent", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Argus_Amount_Taken</code>.
     */
    public final TableField<Temp2Record, BigDecimal> ARGUS_AMOUNT_TAKEN = createField("Argus_Amount_Taken", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.timestamp</code>.
     */
    public final TableField<Temp2Record, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Voucher_Account</code>.
     */
    public final TableField<Temp2Record, String> VOUCHER_ACCOUNT = createField("Voucher_Account", org.jooq.impl.SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Voucher_Plan_Code</code>.
     */
    public final TableField<Temp2Record, String> VOUCHER_PLAN_CODE = createField("Voucher_Plan_Code", org.jooq.impl.SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Voucher_Car_Code</code>.
     */
    public final TableField<Temp2Record, String> VOUCHER_CAR_CODE = createField("Voucher_Car_Code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.email_sent</code>.
     */
    public final TableField<Temp2Record, Boolean> EMAIL_SENT = createField("email_sent", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.printed</code>.
     */
    public final TableField<Temp2Record, Boolean> PRINTED = createField("printed", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Send_Info_Email</code>.
     */
    public final TableField<Temp2Record, Boolean> SEND_INFO_EMAIL = createField("Send_Info_Email", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Info_Email_Sent</code>.
     */
    public final TableField<Temp2Record, Boolean> INFO_EMAIL_SENT = createField("Info_Email_Sent", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.payandshop_auth_code</code>.
     */
    public final TableField<Temp2Record, String> PAYANDSHOP_AUTH_CODE = createField("payandshop_auth_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.payandshop_pasref</code>.
     */
    public final TableField<Temp2Record, String> PAYANDSHOP_PASREF = createField("payandshop_pasref", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.payandshop_amount_charged</code>.
     */
    public final TableField<Temp2Record, BigDecimal> PAYANDSHOP_AMOUNT_CHARGED = createField("payandshop_amount_charged", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.payandshop_id</code>.
     */
    public final TableField<Temp2Record, String> PAYANDSHOP_ID = createField("payandshop_id", org.jooq.impl.SQLDataType.VARCHAR(24), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.user_id</code>.
     */
    public final TableField<Temp2Record, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.booking_fee</code>.
     */
    public final TableField<Temp2Record, BigDecimal> BOOKING_FEE = createField("booking_fee", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.problem</code>.
     */
    public final TableField<Temp2Record, Boolean> PROBLEM = createField("problem", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.resolved</code>.
     */
    public final TableField<Temp2Record, Boolean> RESOLVED = createField("resolved", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.problem_lastviewed</code>.
     */
    public final TableField<Temp2Record, Timestamp> PROBLEM_LASTVIEWED = createField("problem_lastviewed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.problem_rep</code>.
     */
    public final TableField<Temp2Record, String> PROBLEM_REP = createField("problem_rep", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.amended_reservation</code>.
     */
    public final TableField<Temp2Record, Boolean> AMENDED_RESERVATION = createField("amended_reservation", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.notebook_entry</code>.
     */
    public final TableField<Temp2Record, Boolean> NOTEBOOK_ENTRY = createField("notebook_entry", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.discount</code>.
     */
    public final TableField<Temp2Record, BigDecimal> DISCOUNT = createField("discount", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.cancelled_by</code>.
     */
    public final TableField<Temp2Record, String> CANCELLED_BY = createField("cancelled_by", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.cancelled_date</code>.
     */
    public final TableField<Temp2Record, Timestamp> CANCELLED_DATE = createField("cancelled_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.voucher_discount</code>.
     */
    public final TableField<Temp2Record, BigDecimal> VOUCHER_DISCOUNT = createField("voucher_discount", org.jooq.impl.SQLDataType.NUMERIC(18, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.hide_cancel</code>.
     */
    public final TableField<Temp2Record, Boolean> HIDE_CANCEL = createField("hide_cancel", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.telephone_booking</code>.
     */
    public final TableField<Temp2Record, Boolean> TELEPHONE_BOOKING = createField("telephone_booking", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.car_agent_markup</code>.
     */
    public final TableField<Temp2Record, BigDecimal> CAR_AGENT_MARKUP = createField("car_agent_markup", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.telephone_markup</code>.
     */
    public final TableField<Temp2Record, BigDecimal> TELEPHONE_MARKUP = createField("telephone_markup", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.affiliate_markup</code>.
     */
    public final TableField<Temp2Record, BigDecimal> AFFILIATE_MARKUP = createField("affiliate_markup", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.total_rental_cost</code>.
     */
    public final TableField<Temp2Record, BigDecimal> TOTAL_RENTAL_COST = createField("total_rental_cost", org.jooq.impl.SQLDataType.NUMERIC(12, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.base_daily_rate</code>.
     */
    public final TableField<Temp2Record, BigDecimal> BASE_DAILY_RATE = createField("base_daily_rate", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.rental_days</code>.
     */
    public final TableField<Temp2Record, BigDecimal> RENTAL_DAYS = createField("rental_days", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.european_rates</code>.
     */
    public final TableField<Temp2Record, Boolean> EUROPEAN_RATES = createField("european_rates", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.res_group_id</code>.
     */
    public final TableField<Temp2Record, Integer> RES_GROUP_ID = createField("res_group_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.freesale</code>.
     */
    public final TableField<Temp2Record, Boolean> FREESALE = createField("freesale", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.rental_agent_id</code>.
     */
    public final TableField<Temp2Record, Integer> RENTAL_AGENT_ID = createField("rental_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.drop_agent_id</code>.
     */
    public final TableField<Temp2Record, Integer> DROP_AGENT_ID = createField("drop_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.rate_currency</code>.
     */
    public final TableField<Temp2Record, String> RATE_CURRENCY = createField("rate_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.charge_currency</code>.
     */
    public final TableField<Temp2Record, String> CHARGE_CURRENCY = createField("charge_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.exchange_rate</code>.
     */
    public final TableField<Temp2Record, BigDecimal> EXCHANGE_RATE = createField("exchange_rate", org.jooq.impl.SQLDataType.NUMERIC(10, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.prepaid_rental</code>.
     */
    public final TableField<Temp2Record, Boolean> PREPAID_RENTAL = createField("prepaid_rental", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.prepaid_amount</code>.
     */
    public final TableField<Temp2Record, BigDecimal> PREPAID_AMOUNT = createField("prepaid_amount", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.optional_extras</code>.
     */
    public final TableField<Temp2Record, Boolean> OPTIONAL_EXTRAS = createField("optional_extras", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.new_rates</code>.
     */
    public final TableField<Temp2Record, Boolean> NEW_RATES = createField("new_rates", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.age_group</code>.
     */
    public final TableField<Temp2Record, Integer> AGE_GROUP = createField("age_group", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.car_name</code>.
     */
    public final TableField<Temp2Record, String> CAR_NAME = createField("car_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.affiliate_engine</code>.
     */
    public final TableField<Temp2Record, Boolean> AFFILIATE_ENGINE = createField("affiliate_engine", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.euro_charge_total</code>.
     */
    public final TableField<Temp2Record, BigDecimal> EURO_CHARGE_TOTAL = createField("euro_charge_total", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.local_charge_total</code>.
     */
    public final TableField<Temp2Record, BigDecimal> LOCAL_CHARGE_TOTAL = createField("local_charge_total", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.charge_prepaid</code>.
     */
    public final TableField<Temp2Record, BigDecimal> CHARGE_PREPAID = createField("charge_prepaid", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.amended_date</code>.
     */
    public final TableField<Temp2Record, Timestamp> AMENDED_DATE = createField("amended_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Group_ID</code>.
     */
    public final TableField<Temp2Record, String> GROUP_ID = createField("Group_ID", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.customer_amend_date</code>.
     */
    public final TableField<Temp2Record, Timestamp> CUSTOMER_AMEND_DATE = createField("customer_amend_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.euro_base_rate</code>.
     */
    public final TableField<Temp2Record, BigDecimal> EURO_BASE_RATE = createField("euro_base_rate", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.rate_euro_exchange</code>.
     */
    public final TableField<Temp2Record, BigDecimal> RATE_EURO_EXCHANGE = createField("rate_euro_exchange", org.jooq.impl.SQLDataType.NUMERIC(10, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.customer_denied</code>.
     */
    public final TableField<Temp2Record, Boolean> CUSTOMER_DENIED = createField("customer_denied", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.rate_base_rate</code>.
     */
    public final TableField<Temp2Record, BigDecimal> RATE_BASE_RATE = createField("rate_base_rate", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.invoice_number</code>.
     */
    public final TableField<Temp2Record, String> INVOICE_NUMBER = createField("invoice_number", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.agent_paid</code>.
     */
    public final TableField<Temp2Record, Boolean> AGENT_PAID = createField("agent_paid", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.invoice_date</code>.
     */
    public final TableField<Temp2Record, Timestamp> INVOICE_DATE = createField("invoice_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.denied_reason</code>.
     */
    public final TableField<Temp2Record, Integer> DENIED_REASON = createField("denied_reason", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.new_rates_rpt</code>.
     */
    public final TableField<Temp2Record, Short> NEW_RATES_RPT = createField("new_rates_rpt", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.CommRate</code>.
     */
    public final TableField<Temp2Record, BigDecimal> COMMRATE = createField("CommRate", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.XML_Agent_ID</code>.
     */
    public final TableField<Temp2Record, Integer> XML_AGENT_ID = createField("XML_Agent_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.XML_Locked</code>.
     */
    public final TableField<Temp2Record, Boolean> XML_LOCKED = createField("XML_Locked", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.XML_Res_Ref</code>.
     */
    public final TableField<Temp2Record, String> XML_RES_REF = createField("XML_Res_Ref", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Initial_XML_Date</code>.
     */
    public final TableField<Temp2Record, Timestamp> INITIAL_XML_DATE = createField("Initial_XML_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Last_XML_Date</code>.
     */
    public final TableField<Temp2Record, Timestamp> LAST_XML_DATE = createField("Last_XML_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Manual_Request</code>.
     */
    public final TableField<Temp2Record, Boolean> MANUAL_REQUEST = createField("Manual_Request", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Auto_Email_Request</code>.
     */
    public final TableField<Temp2Record, Boolean> AUTO_EMAIL_REQUEST = createField("Auto_Email_Request", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.XML_Email_Date</code>.
     */
    public final TableField<Temp2Record, Timestamp> XML_EMAIL_DATE = createField("XML_Email_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.adaffi</code>.
     */
    public final TableField<Temp2Record, Integer> ADAFFI = createField("adaffi", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.citizen_country_code</code>.
     */
    public final TableField<Temp2Record, String> CITIZEN_COUNTRY_CODE = createField("citizen_country_code", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.test</code>.
     */
    public final TableField<Temp2Record, Integer> TEST = createField("test", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.parent_id</code>.
     */
    public final TableField<Temp2Record, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.commission_sharing_amount</code>.
     */
    public final TableField<Temp2Record, BigDecimal> COMMISSION_SHARING_AMOUNT = createField("commission_sharing_amount", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.original_resref</code>.
     */
    public final TableField<Temp2Record, Integer> ORIGINAL_RESREF = createField("original_resref", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.carType</code>.
     */
    public final TableField<Temp2Record, String> CARTYPE = createField("carType", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.cookie_client_id</code>.
     */
    public final TableField<Temp2Record, Integer> COOKIE_CLIENT_ID = createField("cookie_client_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.processingFeePercantage</code>.
     */
    public final TableField<Temp2Record, BigDecimal> PROCESSINGFEEPERCANTAGE = createField("processingFeePercantage", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.fk_CancelledReason</code>.
     */
    public final TableField<Temp2Record, Integer> FK_CANCELLEDREASON = createField("fk_CancelledReason", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.fk_reservation_invoice</code>.
     */
    public final TableField<Temp2Record, Integer> FK_RESERVATION_INVOICE = createField("fk_reservation_invoice", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.namePrefix</code>.
     */
    public final TableField<Temp2Record, String> NAMEPREFIX = createField("namePrefix", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.nameSuffix</code>.
     */
    public final TableField<Temp2Record, String> NAMESUFFIX = createField("nameSuffix", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.acquiring_user</code>.
     */
    public final TableField<Temp2Record, Integer> ACQUIRING_USER = createField("acquiring_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.fk_affcommpaid</code>.
     */
    public final TableField<Temp2Record, Integer> FK_AFFCOMMPAID = createField("fk_affcommpaid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.fk_affcommPaidOverride</code>.
     */
    public final TableField<Temp2Record, Integer> FK_AFFCOMMPAIDOVERRIDE = createField("fk_affcommPaidOverride", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.retail_commissionable_amount</code>.
     */
    public final TableField<Temp2Record, BigDecimal> RETAIL_COMMISSIONABLE_AMOUNT = createField("retail_commissionable_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.Retail_commission_percentage</code>.
     */
    public final TableField<Temp2Record, BigDecimal> RETAIL_COMMISSION_PERCENTAGE = createField("Retail_commission_percentage", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.ip</code>.
     */
    public final TableField<Temp2Record, Integer> IP = createField("ip", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.physicalIP</code>.
     */
    public final TableField<Temp2Record, Integer> PHYSICALIP = createField("physicalIP", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.clientTransactionFee</code>.
     */
    public final TableField<Temp2Record, BigDecimal> CLIENTTRANSACTIONFEE = createField("clientTransactionFee", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.fk_reservation_invoice2</code>.
     */
    public final TableField<Temp2Record, Integer> FK_RESERVATION_INVOICE2 = createField("fk_reservation_invoice2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.AirlineCode</code>.
     */
    public final TableField<Temp2Record, String> AIRLINECODE = createField("AirlineCode", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.rate_charge_exchange2</code>.
     */
    public final TableField<Temp2Record, BigDecimal> RATE_CHARGE_EXCHANGE2 = createField("rate_charge_exchange2", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.rate_display_exchange2</code>.
     */
    public final TableField<Temp2Record, BigDecimal> RATE_DISPLAY_EXCHANGE2 = createField("rate_display_exchange2", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.rate_charge_exchange</code>.
     */
    public final TableField<Temp2Record, BigDecimal> RATE_CHARGE_EXCHANGE = createField("rate_charge_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.temp2.rate_display_exchange</code>.
     */
    public final TableField<Temp2Record, BigDecimal> RATE_DISPLAY_EXCHANGE = createField("rate_display_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.temp2</code> table reference
     */
    public Temp2() {
        this(DSL.name("temp2"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.temp2</code> table reference
     */
    public Temp2(String alias) {
        this(DSL.name(alias), TEMP2);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.temp2</code> table reference
     */
    public Temp2(Name alias) {
        this(alias, TEMP2);
    }

    private Temp2(Name alias, Table<Temp2Record> aliased) {
        this(alias, aliased, null);
    }

    private Temp2(Name alias, Table<Temp2Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Temp2(Table<O> child, ForeignKey<O, Temp2Record> key) {
        super(child, key, TEMP2);
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
    public Identity<Temp2Record, Integer> getIdentity() {
        return Keys.IDENTITY_TEMP2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Temp2 as(String alias) {
        return new Temp2(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Temp2 as(Name alias) {
        return new Temp2(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Temp2 rename(String name) {
        return new Temp2(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Temp2 rename(Name name) {
        return new Temp2(name, null);
    }
}
