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
public class Selectparticulatportaluser extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -193427996;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.SelectParticulatPortalUser.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.SelectParticulatPortalUser.UserName</code>.
     */
    public static final Parameter<String> USERNAME = createParameter("UserName", org.jooq.impl.SQLDataType.NVARCHAR(30), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.SelectParticulatPortalUser.Email</code>.
     */
    public static final Parameter<String> EMAIL = createParameter("Email", org.jooq.impl.SQLDataType.NVARCHAR(50), false, false);

    /**
     * Create a new routine call instance
     */
    public Selectparticulatportaluser() {
        super("SelectParticulatPortalUser", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(USERNAME);
        addInParameter(EMAIL);
    }

    /**
     * Set the <code>UserName</code> parameter IN value to the routine
     */
    public void setUsername(String value) {
        setValue(USERNAME, value);
    }

    /**
     * Set the <code>Email</code> parameter IN value to the routine
     */
    public void setEmail(String value) {
        setValue(EMAIL, value);
    }
}
