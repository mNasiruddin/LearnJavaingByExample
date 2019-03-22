/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ClientemailtemplateBak061217Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ClientemailtemplateBak061217 extends TableImpl<ClientemailtemplateBak061217Record> {

    private static final long serialVersionUID = -557719194;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217</code>
     */
    public static final ClientemailtemplateBak061217 CLIENTEMAILTEMPLATE_BAK061217 = new ClientemailtemplateBak061217();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientemailtemplateBak061217Record> getRecordType() {
        return ClientemailtemplateBak061217Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217.guid</code>.
     */
    public final TableField<ClientemailtemplateBak061217Record, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217.id</code>.
     */
    public final TableField<ClientemailtemplateBak061217Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217.fk_client</code>.
     */
    public final TableField<ClientemailtemplateBak061217Record, Integer> FK_CLIENT = createField("fk_client", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217.type</code>.
     */
    public final TableField<ClientemailtemplateBak061217Record, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217.lang_id</code>.
     */
    public final TableField<ClientemailtemplateBak061217Record, String> LANG_ID = createField("lang_id", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217.template</code>.
     */
    public final TableField<ClientemailtemplateBak061217Record, byte[]> TEMPLATE = createField("template", org.jooq.impl.SQLDataType.BINARY(2147483647).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217.template_name</code>.
     */
    public final TableField<ClientemailtemplateBak061217Record, String> TEMPLATE_NAME = createField("template_name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217.fk_contract</code>.
     */
    public final TableField<ClientemailtemplateBak061217Record, Integer> FK_CONTRACT = createField("fk_contract", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217</code> table reference
     */
    public ClientemailtemplateBak061217() {
        this(DSL.name("clientemailtemplate_bak061217"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217</code> table reference
     */
    public ClientemailtemplateBak061217(String alias) {
        this(DSL.name(alias), CLIENTEMAILTEMPLATE_BAK061217);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.clientemailtemplate_bak061217</code> table reference
     */
    public ClientemailtemplateBak061217(Name alias) {
        this(alias, CLIENTEMAILTEMPLATE_BAK061217);
    }

    private ClientemailtemplateBak061217(Name alias, Table<ClientemailtemplateBak061217Record> aliased) {
        this(alias, aliased, null);
    }

    private ClientemailtemplateBak061217(Name alias, Table<ClientemailtemplateBak061217Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ClientemailtemplateBak061217(Table<O> child, ForeignKey<O, ClientemailtemplateBak061217Record> key) {
        super(child, key, CLIENTEMAILTEMPLATE_BAK061217);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ClientemailtemplateBak061217Record, Integer> getIdentity() {
        return Keys.IDENTITY_CLIENTEMAILTEMPLATE_BAK061217;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientemailtemplateBak061217 as(String alias) {
        return new ClientemailtemplateBak061217(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientemailtemplateBak061217 as(Name alias) {
        return new ClientemailtemplateBak061217(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientemailtemplateBak061217 rename(String name) {
        return new ClientemailtemplateBak061217(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientemailtemplateBak061217 rename(Name name) {
        return new ClientemailtemplateBak061217(name, null);
    }
}