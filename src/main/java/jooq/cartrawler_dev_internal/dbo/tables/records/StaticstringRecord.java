/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Staticstring;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


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
public class StaticstringRecord extends TableRecordImpl<StaticstringRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = 955902958;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.StaticString.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.StaticString.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.StaticString.hash</code>.
     */
    public void setHash(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.StaticString.hash</code>.
     */
    public String getHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.StaticString.text</code>.
     */
    public void setText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.StaticString.text</code>.
     */
    public String getText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.StaticString.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.StaticString.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.StaticString.lang</code>.
     */
    public void setLang(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.StaticString.lang</code>.
     */
    public String getLang() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Staticstring.STATICSTRING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Staticstring.STATICSTRING.HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Staticstring.STATICSTRING.TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Staticstring.STATICSTRING.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Staticstring.STATICSTRING.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticstringRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticstringRecord value2(String value) {
        setHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticstringRecord value3(String value) {
        setText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticstringRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticstringRecord value5(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticstringRecord values(Integer value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StaticstringRecord
     */
    public StaticstringRecord() {
        super(Staticstring.STATICSTRING);
    }

    /**
     * Create a detached, initialised StaticstringRecord
     */
    public StaticstringRecord(Integer id, String hash, String text, String type, String lang) {
        super(Staticstring.STATICSTRING);

        set(0, id);
        set(1, hash);
        set(2, text);
        set(3, type);
        set(4, lang);
    }
}
