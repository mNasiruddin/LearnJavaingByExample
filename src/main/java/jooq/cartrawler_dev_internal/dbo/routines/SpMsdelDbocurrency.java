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
public class SpMsdelDbocurrency extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 2113892621;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSdel_dboCurrency.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSdel_dboCurrency.pkc1</code>.
     */
    public static final Parameter<String> PKC1 = createParameter("pkc1", org.jooq.impl.SQLDataType.VARCHAR(3), false, false);

    /**
     * Create a new routine call instance
     */
    public SpMsdelDbocurrency() {
        super("sp_MSdel_dboCurrency", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(PKC1);
    }

    /**
     * Set the <code>pkc1</code> parameter IN value to the routine
     */
    public void setPkc1(String value) {
        setValue(PKC1, value);
    }
}