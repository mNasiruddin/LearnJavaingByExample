/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.routines;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class SpinsertaffiliatesubaccTemprich extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -804386752;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc_tempRich.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc_tempRich.Client_ID</code>.
     */
    public static final Parameter<Integer> CLIENT_ID = createParameter("Client_ID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc_tempRich.Client_Name</code>.
     */
    public static final Parameter<String> CLIENT_NAME = createParameter("Client_Name", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc_tempRich.DisplayCountry</code>.
     */
    public static final Parameter<String> DISPLAYCOUNTRY = createParameter("DisplayCountry", org.jooq.impl.SQLDataType.VARCHAR(2), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc_tempRich.DisplayCurrency</code>.
     */
    public static final Parameter<String> DISPLAYCURRENCY = createParameter("DisplayCurrency", org.jooq.impl.SQLDataType.VARCHAR(3), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc_tempRich.password</code>.
     */
    public static final Parameter<String> PASSWORD = createParameter("password", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc_tempRich.portalUserName</code>.
     */
    public static final Parameter<String> PORTALUSERNAME = createParameter("portalUserName", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc_tempRich.email</code>.
     */
    public static final Parameter<String> EMAIL = createParameter("email", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc_tempRich.newSubID</code>.
     */
    public static final Parameter<Integer> NEWSUBID = createParameter("newSubID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public SpinsertaffiliatesubaccTemprich() {
        super("spInsertAffiliateSubAcc_tempRich", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(CLIENT_ID);
        addInParameter(CLIENT_NAME);
        addInParameter(DISPLAYCOUNTRY);
        addInParameter(DISPLAYCURRENCY);
        addInParameter(PASSWORD);
        addInParameter(PORTALUSERNAME);
        addInParameter(EMAIL);
        addInOutParameter(NEWSUBID);
    }

    /**
     * Set the <code>Client_ID</code> parameter IN value to the routine
     */
    public void setClientId(Integer value) {
        setValue(CLIENT_ID, value);
    }

    /**
     * Set the <code>Client_Name</code> parameter IN value to the routine
     */
    public void setClientName(String value) {
        setValue(CLIENT_NAME, value);
    }

    /**
     * Set the <code>DisplayCountry</code> parameter IN value to the routine
     */
    public void setDisplaycountry(String value) {
        setValue(DISPLAYCOUNTRY, value);
    }

    /**
     * Set the <code>DisplayCurrency</code> parameter IN value to the routine
     */
    public void setDisplaycurrency(String value) {
        setValue(DISPLAYCURRENCY, value);
    }

    /**
     * Set the <code>password</code> parameter IN value to the routine
     */
    public void setPassword(String value) {
        setValue(PASSWORD, value);
    }

    /**
     * Set the <code>portalUserName</code> parameter IN value to the routine
     */
    public void setPortalusername(String value) {
        setValue(PORTALUSERNAME, value);
    }

    /**
     * Set the <code>email</code> parameter IN value to the routine
     */
    public void setEmail(String value) {
        setValue(EMAIL, value);
    }

    /**
     * Set the <code>newSubID</code> parameter IN value to the routine
     */
    public void setNewsubid(Integer value) {
        setValue(NEWSUBID, value);
    }

    /**
     * Get the <code>newSubID</code> parameter OUT value from the routine
     */
    public Integer getNewsubid() {
        return get(NEWSUBID);
    }
}
