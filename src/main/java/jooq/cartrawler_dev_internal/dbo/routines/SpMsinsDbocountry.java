/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.routines;


import java.math.BigDecimal;

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
public class SpMsinsDbocountry extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1290476845;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c1</code>.
     */
    public static final Parameter<String> C1 = createParameter("c1", org.jooq.impl.SQLDataType.VARCHAR(2), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c2</code>.
     */
    public static final Parameter<String> C2 = createParameter("c2", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c3</code>.
     */
    public static final Parameter<String> C3 = createParameter("c3", org.jooq.impl.SQLDataType.VARCHAR(3), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c4</code>.
     */
    public static final Parameter<String> C4 = createParameter("c4", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c5</code>.
     */
    public static final Parameter<String> C5 = createParameter("c5", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c6</code>.
     */
    public static final Parameter<String> C6 = createParameter("c6", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c7</code>.
     */
    public static final Parameter<String> C7 = createParameter("c7", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c8</code>.
     */
    public static final Parameter<String> C8 = createParameter("c8", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c9</code>.
     */
    public static final Parameter<String> C9 = createParameter("c9", org.jooq.impl.SQLDataType.VARCHAR(255), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c10</code>.
     */
    public static final Parameter<String> C10 = createParameter("c10", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c11</code>.
     */
    public static final Parameter<String> C11 = createParameter("c11", org.jooq.impl.SQLDataType.VARCHAR(255), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c12</code>.
     */
    public static final Parameter<String> C12 = createParameter("c12", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c13</code>.
     */
    public static final Parameter<String> C13 = createParameter("c13", org.jooq.impl.SQLDataType.VARCHAR(255), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c14</code>.
     */
    public static final Parameter<String> C14 = createParameter("c14", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c15</code>.
     */
    public static final Parameter<byte[]> C15 = createParameter("c15", org.jooq.impl.SQLDataType.BINARY(2147483647), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c16</code>.
     */
    public static final Parameter<String> C16 = createParameter("c16", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c17</code>.
     */
    public static final Parameter<String> C17 = createParameter("c17", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c18</code>.
     */
    public static final Parameter<Short> C18 = createParameter("c18", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c19</code>.
     */
    public static final Parameter<Boolean> C19 = createParameter("c19", org.jooq.impl.SQLDataType.BIT, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c20</code>.
     */
    public static final Parameter<Boolean> C20 = createParameter("c20", org.jooq.impl.SQLDataType.BIT, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c21</code>.
     */
    public static final Parameter<String> C21 = createParameter("c21", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c22</code>.
     */
    public static final Parameter<String> C22 = createParameter("c22", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c23</code>.
     */
    public static final Parameter<String> C23 = createParameter("c23", org.jooq.impl.SQLDataType.VARCHAR(3), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c24</code>.
     */
    public static final Parameter<String> C24 = createParameter("c24", org.jooq.impl.SQLDataType.VARCHAR(3), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c25</code>.
     */
    public static final Parameter<String> C25 = createParameter("c25", org.jooq.impl.SQLDataType.VARCHAR(2), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c26</code>.
     */
    public static final Parameter<Boolean> C26 = createParameter("c26", org.jooq.impl.SQLDataType.BIT, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c27</code>.
     */
    public static final Parameter<String> C27 = createParameter("c27", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c28</code>.
     */
    public static final Parameter<UByte> C28 = createParameter("c28", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c29</code>.
     */
    public static final Parameter<Boolean> C29 = createParameter("c29", org.jooq.impl.SQLDataType.BIT, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c30</code>.
     */
    public static final Parameter<Integer> C30 = createParameter("c30", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c31</code>.
     */
    public static final Parameter<String> C31 = createParameter("c31", org.jooq.impl.SQLDataType.VARCHAR(64), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c32</code>.
     */
    public static final Parameter<BigDecimal> C32 = createParameter("c32", org.jooq.impl.SQLDataType.NUMERIC(18, 8), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c33</code>.
     */
    public static final Parameter<BigDecimal> C33 = createParameter("c33", org.jooq.impl.SQLDataType.NUMERIC(18, 8), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c34</code>.
     */
    public static final Parameter<String> C34 = createParameter("c34", org.jooq.impl.SQLDataType.VARCHAR(3), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c35</code>.
     */
    public static final Parameter<Short> C35 = createParameter("c35", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c36</code>.
     */
    public static final Parameter<String> C36 = createParameter("c36", org.jooq.impl.SQLDataType.VARCHAR(3), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.sp_MSins_dboCountry.c37</code>.
     */
    public static final Parameter<Boolean> C37 = createParameter("c37", org.jooq.impl.SQLDataType.BIT, false, false);

    /**
     * Create a new routine call instance
     */
    public SpMsinsDbocountry() {
        super("sp_MSins_dboCountry", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(C1);
        addInParameter(C2);
        addInParameter(C3);
        addInParameter(C4);
        addInParameter(C5);
        addInParameter(C6);
        addInParameter(C7);
        addInParameter(C8);
        addInParameter(C9);
        addInParameter(C10);
        addInParameter(C11);
        addInParameter(C12);
        addInParameter(C13);
        addInParameter(C14);
        addInParameter(C15);
        addInParameter(C16);
        addInParameter(C17);
        addInParameter(C18);
        addInParameter(C19);
        addInParameter(C20);
        addInParameter(C21);
        addInParameter(C22);
        addInParameter(C23);
        addInParameter(C24);
        addInParameter(C25);
        addInParameter(C26);
        addInParameter(C27);
        addInParameter(C28);
        addInParameter(C29);
        addInParameter(C30);
        addInParameter(C31);
        addInParameter(C32);
        addInParameter(C33);
        addInParameter(C34);
        addInParameter(C35);
        addInParameter(C36);
        addInParameter(C37);
    }

    /**
     * Set the <code>c1</code> parameter IN value to the routine
     */
    public void setC1(String value) {
        setValue(C1, value);
    }

    /**
     * Set the <code>c2</code> parameter IN value to the routine
     */
    public void setC2(String value) {
        setValue(C2, value);
    }

    /**
     * Set the <code>c3</code> parameter IN value to the routine
     */
    public void setC3(String value) {
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
    public void setC5(String value) {
        setValue(C5, value);
    }

    /**
     * Set the <code>c6</code> parameter IN value to the routine
     */
    public void setC6(String value) {
        setValue(C6, value);
    }

    /**
     * Set the <code>c7</code> parameter IN value to the routine
     */
    public void setC7(String value) {
        setValue(C7, value);
    }

    /**
     * Set the <code>c8</code> parameter IN value to the routine
     */
    public void setC8(String value) {
        setValue(C8, value);
    }

    /**
     * Set the <code>c9</code> parameter IN value to the routine
     */
    public void setC9(String value) {
        setValue(C9, value);
    }

    /**
     * Set the <code>c10</code> parameter IN value to the routine
     */
    public void setC10(String value) {
        setValue(C10, value);
    }

    /**
     * Set the <code>c11</code> parameter IN value to the routine
     */
    public void setC11(String value) {
        setValue(C11, value);
    }

    /**
     * Set the <code>c12</code> parameter IN value to the routine
     */
    public void setC12(String value) {
        setValue(C12, value);
    }

    /**
     * Set the <code>c13</code> parameter IN value to the routine
     */
    public void setC13(String value) {
        setValue(C13, value);
    }

    /**
     * Set the <code>c14</code> parameter IN value to the routine
     */
    public void setC14(String value) {
        setValue(C14, value);
    }

    /**
     * Set the <code>c15</code> parameter IN value to the routine
     */
    public void setC15(byte... value) {
        setValue(C15, value);
    }

    /**
     * Set the <code>c16</code> parameter IN value to the routine
     */
    public void setC16(String value) {
        setValue(C16, value);
    }

    /**
     * Set the <code>c17</code> parameter IN value to the routine
     */
    public void setC17(String value) {
        setValue(C17, value);
    }

    /**
     * Set the <code>c18</code> parameter IN value to the routine
     */
    public void setC18(Short value) {
        setValue(C18, value);
    }

    /**
     * Set the <code>c19</code> parameter IN value to the routine
     */
    public void setC19(Boolean value) {
        setValue(C19, value);
    }

    /**
     * Set the <code>c20</code> parameter IN value to the routine
     */
    public void setC20(Boolean value) {
        setValue(C20, value);
    }

    /**
     * Set the <code>c21</code> parameter IN value to the routine
     */
    public void setC21(String value) {
        setValue(C21, value);
    }

    /**
     * Set the <code>c22</code> parameter IN value to the routine
     */
    public void setC22(String value) {
        setValue(C22, value);
    }

    /**
     * Set the <code>c23</code> parameter IN value to the routine
     */
    public void setC23(String value) {
        setValue(C23, value);
    }

    /**
     * Set the <code>c24</code> parameter IN value to the routine
     */
    public void setC24(String value) {
        setValue(C24, value);
    }

    /**
     * Set the <code>c25</code> parameter IN value to the routine
     */
    public void setC25(String value) {
        setValue(C25, value);
    }

    /**
     * Set the <code>c26</code> parameter IN value to the routine
     */
    public void setC26(Boolean value) {
        setValue(C26, value);
    }

    /**
     * Set the <code>c27</code> parameter IN value to the routine
     */
    public void setC27(String value) {
        setValue(C27, value);
    }

    /**
     * Set the <code>c28</code> parameter IN value to the routine
     */
    public void setC28(UByte value) {
        setValue(C28, value);
    }

    /**
     * Set the <code>c29</code> parameter IN value to the routine
     */
    public void setC29(Boolean value) {
        setValue(C29, value);
    }

    /**
     * Set the <code>c30</code> parameter IN value to the routine
     */
    public void setC30(Integer value) {
        setValue(C30, value);
    }

    /**
     * Set the <code>c31</code> parameter IN value to the routine
     */
    public void setC31(String value) {
        setValue(C31, value);
    }

    /**
     * Set the <code>c32</code> parameter IN value to the routine
     */
    public void setC32(BigDecimal value) {
        setValue(C32, value);
    }

    /**
     * Set the <code>c33</code> parameter IN value to the routine
     */
    public void setC33(BigDecimal value) {
        setValue(C33, value);
    }

    /**
     * Set the <code>c34</code> parameter IN value to the routine
     */
    public void setC34(String value) {
        setValue(C34, value);
    }

    /**
     * Set the <code>c35</code> parameter IN value to the routine
     */
    public void setC35(Short value) {
        setValue(C35, value);
    }

    /**
     * Set the <code>c36</code> parameter IN value to the routine
     */
    public void setC36(String value) {
        setValue(C36, value);
    }

    /**
     * Set the <code>c37</code> parameter IN value to the routine
     */
    public void setC37(Boolean value) {
        setValue(C37, value);
    }
}
