/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.routines;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.types.UByte;


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
public class Spinsertaffiliatefile extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 65658236;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateFile.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateFile.Client_ID</code>.
     */
    public static final Parameter<Integer> CLIENT_ID = createParameter("Client_ID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateFile.FullFileName</code>.
     */
    public static final Parameter<String> FULLFILENAME = createParameter("FullFileName", org.jooq.impl.SQLDataType.VARCHAR(100), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateFile.FileType</code>.
     */
    public static final Parameter<UByte> FILETYPE = createParameter("FileType", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateFile.HeadFootFlag</code>.
     */
    public static final Parameter<UByte> HEADFOOTFLAG = createParameter("HeadFootFlag", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, false, false);

    /**
     * Create a new routine call instance
     */
    public Spinsertaffiliatefile() {
        super("spInsertAffiliateFile", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(CLIENT_ID);
        addInParameter(FULLFILENAME);
        addInParameter(FILETYPE);
        addInParameter(HEADFOOTFLAG);
    }

    /**
     * Set the <code>Client_ID</code> parameter IN value to the routine
     */
    public void setClientId(Integer value) {
        setValue(CLIENT_ID, value);
    }

    /**
     * Set the <code>FullFileName</code> parameter IN value to the routine
     */
    public void setFullfilename(String value) {
        setValue(FULLFILENAME, value);
    }

    /**
     * Set the <code>FileType</code> parameter IN value to the routine
     */
    public void setFiletype(UByte value) {
        setValue(FILETYPE, value);
    }

    /**
     * Set the <code>HeadFootFlag</code> parameter IN value to the routine
     */
    public void setHeadfootflag(UByte value) {
        setValue(HEADFOOTFLAG, value);
    }
}
