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
public class Spgetmaxgroupid extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1322809237;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spGetMaxGroupID.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spGetMaxGroupID.group_id_max</code>.
     */
    public static final Parameter<Integer> GROUP_ID_MAX = createParameter("group_id_max", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public Spgetmaxgroupid() {
        super("spGetMaxGroupID", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInOutParameter(GROUP_ID_MAX);
    }

    /**
     * Set the <code>group_id_max</code> parameter IN value to the routine
     */
    public void setGroupIdMax(Integer value) {
        setValue(GROUP_ID_MAX, value);
    }

    /**
     * Get the <code>group_id_max</code> parameter OUT value from the routine
     */
    public Integer getGroupIdMax() {
        return get(GROUP_ID_MAX);
    }
}
