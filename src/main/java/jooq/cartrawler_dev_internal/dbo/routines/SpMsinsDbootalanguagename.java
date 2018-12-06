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
public class SpMsinsDbootalanguagename extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1368271730;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dbootaLanguageName.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dbootaLanguageName.c1</code>.
     */
    public static final Parameter<Integer> C1 = createParameter("c1", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dbootaLanguageName.c2</code>.
     */
    public static final Parameter<Integer> C2 = createParameter("c2", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dbootaLanguageName.c3</code>.
     */
    public static final Parameter<Integer> C3 = createParameter("c3", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dbootaLanguageName.c4</code>.
     */
    public static final Parameter<String> C4 = createParameter("c4", org.jooq.impl.SQLDataType.VARCHAR(128), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dbootaLanguageName.c5</code>.
     */
    public static final Parameter<Boolean> C5 = createParameter("c5", org.jooq.impl.SQLDataType.BIT, false, false);

    /**
     * Create a new routine call instance
     */
    public SpMsinsDbootalanguagename() {
        super("sp_MSins_dbootaLanguageName", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(C1);
        addInParameter(C2);
        addInParameter(C3);
        addInParameter(C4);
        addInParameter(C5);
    }

    /**
     * Set the <code>c1</code> parameter IN value to the routine
     */
    public void setC1(Integer value) {
        setValue(C1, value);
    }

    /**
     * Set the <code>c2</code> parameter IN value to the routine
     */
    public void setC2(Integer value) {
        setValue(C2, value);
    }

    /**
     * Set the <code>c3</code> parameter IN value to the routine
     */
    public void setC3(Integer value) {
        setValue(C3, value);
    }

    /**
     * Set the <code>c4</code> parameter IN value to the routine
     */
    public void setC4(String value) {
        setValue(C4, value);
    }

    /**
     * Set the <code>c5</code> parameter IN value to the routine
     */
    public void setC5(Boolean value) {
        setValue(C5, value);
    }
}
