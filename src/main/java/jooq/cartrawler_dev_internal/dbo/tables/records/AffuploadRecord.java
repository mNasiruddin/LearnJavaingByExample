/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Affupload;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
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
public class AffuploadRecord extends UpdatableRecordImpl<AffuploadRecord> implements Record4<Integer, Integer, UByte, String> {

    private static final long serialVersionUID = -2112366793;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffUpload.idAffUpload</code>.
     */
    public void setIdaffupload(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffUpload.idAffUpload</code>.
     */
    public Integer getIdaffupload() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffUpload.Client_ID</code>.
     */
    public void setClientId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffUpload.Client_ID</code>.
     */
    public Integer getClientId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffUpload.FileType</code>.
     */
    public void setFiletype(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffUpload.FileType</code>.
     */
    public UByte getFiletype() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffUpload.FullFileName</code>.
     */
    public void setFullfilename(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffUpload.FullFileName</code>.
     */
    public String getFullfilename() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, UByte, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, UByte, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Affupload.AFFUPLOAD.IDAFFUPLOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Affupload.AFFUPLOAD.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return Affupload.AFFUPLOAD.FILETYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Affupload.AFFUPLOAD.FULLFILENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIdaffupload();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component3() {
        return getFiletype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFullfilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdaffupload();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getFiletype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFullfilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffuploadRecord value1(Integer value) {
        setIdaffupload(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffuploadRecord value2(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffuploadRecord value3(UByte value) {
        setFiletype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffuploadRecord value4(String value) {
        setFullfilename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AffuploadRecord values(Integer value1, Integer value2, UByte value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AffuploadRecord
     */
    public AffuploadRecord() {
        super(Affupload.AFFUPLOAD);
    }

    /**
     * Create a detached, initialised AffuploadRecord
     */
    public AffuploadRecord(Integer idaffupload, Integer clientId, UByte filetype, String fullfilename) {
        super(Affupload.AFFUPLOAD);

        set(0, idaffupload);
        set(1, clientId);
        set(2, filetype);
        set(3, fullfilename);
    }
}