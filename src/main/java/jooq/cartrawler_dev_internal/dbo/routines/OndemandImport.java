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
public class OndemandImport extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 944221334;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.OnDemand_import.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public OndemandImport() {
        super("OnDemand_import", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
    }
}
