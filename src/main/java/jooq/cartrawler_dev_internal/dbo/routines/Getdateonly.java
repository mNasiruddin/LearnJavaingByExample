/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.routines;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;

import org.jooq.Field;
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
public class Getdateonly extends AbstractRoutine<Timestamp> {

    private static final long serialVersionUID = 1786667883;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.GetDateOnly.RETURN_VALUE</code>.
     */
    public static final Parameter<Timestamp> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMP, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.GetDateOnly.pInputDate</code>.
     */
    public static final Parameter<Timestamp> PINPUTDATE = createParameter("pInputDate", org.jooq.impl.SQLDataType.TIMESTAMP, false, false);

    /**
     * Create a new routine call instance
     */
    public Getdateonly() {
        super("GetDateOnly", Dbo.DBO, org.jooq.impl.SQLDataType.TIMESTAMP);

        setReturnParameter(RETURN_VALUE);
        addInParameter(PINPUTDATE);
    }

    /**
     * Set the <code>pInputDate</code> parameter IN value to the routine
     */
    public void setPinputdate(Timestamp value) {
        setValue(PINPUTDATE, value);
    }

    /**
     * Set the <code>pInputDate</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPinputdate(Field<Timestamp> field) {
        setField(PINPUTDATE, field);
    }
}
