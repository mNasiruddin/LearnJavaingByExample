/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.routines;


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
public class Fngetbinarytosha256 extends AbstractRoutine<byte[]> {

    private static final long serialVersionUID = 1672336539;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.fnGetBinaryToSha256.RETURN_VALUE</code>.
     */
    public static final Parameter<byte[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARBINARY(8000), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.fnGetBinaryToSha256.Str</code>.
     */
    public static final Parameter<byte[]> STR = createParameter("Str", org.jooq.impl.SQLDataType.VARBINARY(8000), false, false);

    /**
     * Create a new routine call instance
     */
    public Fngetbinarytosha256() {
        super("fnGetBinaryToSha256", Dbo.DBO, org.jooq.impl.SQLDataType.VARBINARY(8000));

        setReturnParameter(RETURN_VALUE);
        addInParameter(STR);
    }

    /**
     * Set the <code>Str</code> parameter IN value to the routine
     */
    public void setStr(byte... value) {
        setValue(STR, value);
    }

    /**
     * Set the <code>Str</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setStr(Field<byte[]> field) {
        setField(STR, field);
    }
}
