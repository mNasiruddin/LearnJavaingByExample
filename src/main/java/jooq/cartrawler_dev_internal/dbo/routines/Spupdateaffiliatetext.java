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
public class Spupdateaffiliatetext extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1483504274;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spUpdateAffiliateText.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spUpdateAffiliateText.Client_ID</code>.
     */
    public static final Parameter<Integer> CLIENT_ID = createParameter("Client_ID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spUpdateAffiliateText.TitleText</code>.
     */
    public static final Parameter<String> TITLETEXT = createParameter("TitleText", org.jooq.impl.SQLDataType.VARCHAR(4000), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spUpdateAffiliateText.IntroText</code>.
     */
    public static final Parameter<String> INTROTEXT = createParameter("IntroText", org.jooq.impl.SQLDataType.VARCHAR(4000), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spUpdateAffiliateText.ThanksText</code>.
     */
    public static final Parameter<String> THANKSTEXT = createParameter("ThanksText", org.jooq.impl.SQLDataType.VARCHAR(4000), false, false);

    /**
     * Create a new routine call instance
     */
    public Spupdateaffiliatetext() {
        super("spUpdateAffiliateText", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(CLIENT_ID);
        addInParameter(TITLETEXT);
        addInParameter(INTROTEXT);
        addInParameter(THANKSTEXT);
    }

    /**
     * Set the <code>Client_ID</code> parameter IN value to the routine
     */
    public void setClientId(Integer value) {
        setValue(CLIENT_ID, value);
    }

    /**
     * Set the <code>TitleText</code> parameter IN value to the routine
     */
    public void setTitletext(String value) {
        setValue(TITLETEXT, value);
    }

    /**
     * Set the <code>IntroText</code> parameter IN value to the routine
     */
    public void setIntrotext(String value) {
        setValue(INTROTEXT, value);
    }

    /**
     * Set the <code>ThanksText</code> parameter IN value to the routine
     */
    public void setThankstext(String value) {
        setValue(THANKSTEXT, value);
    }
}
