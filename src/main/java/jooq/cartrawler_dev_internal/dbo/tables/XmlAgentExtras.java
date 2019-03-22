/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.XmlAgentExtrasRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class XmlAgentExtras extends TableImpl<XmlAgentExtrasRecord> {

    private static final long serialVersionUID = -524847736;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.XML_Agent_Extras</code>
     */
    public static final XmlAgentExtras XML_AGENT_EXTRAS = new XmlAgentExtras();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XmlAgentExtrasRecord> getRecordType() {
        return XmlAgentExtrasRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.XML_Agent_Extras.id</code>.
     */
    public final TableField<XmlAgentExtrasRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.XML_Agent_Extras.xml_agent_id</code>.
     */
    public final TableField<XmlAgentExtrasRecord, Integer> XML_AGENT_ID = createField("xml_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.XML_Agent_Extras.optional_id</code>.
     */
    public final TableField<XmlAgentExtrasRecord, Integer> OPTIONAL_ID = createField("optional_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.XML_Agent_Extras.optional_xml_Code</code>.
     */
    public final TableField<XmlAgentExtrasRecord, String> OPTIONAL_XML_CODE = createField("optional_xml_Code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.XML_Agent_Extras.optional_OTA_Code</code>.
     */
    public final TableField<XmlAgentExtrasRecord, Integer> OPTIONAL_OTA_CODE = createField("optional_OTA_Code", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.XML_Agent_Extras</code> table reference
     */
    public XmlAgentExtras() {
        this(DSL.name("XML_Agent_Extras"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.XML_Agent_Extras</code> table reference
     */
    public XmlAgentExtras(String alias) {
        this(DSL.name(alias), XML_AGENT_EXTRAS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.XML_Agent_Extras</code> table reference
     */
    public XmlAgentExtras(Name alias) {
        this(alias, XML_AGENT_EXTRAS);
    }

    private XmlAgentExtras(Name alias, Table<XmlAgentExtrasRecord> aliased) {
        this(alias, aliased, null);
    }

    private XmlAgentExtras(Name alias, Table<XmlAgentExtrasRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> XmlAgentExtras(Table<O> child, ForeignKey<O, XmlAgentExtrasRecord> key) {
        super(child, key, XML_AGENT_EXTRAS);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.XML_AGENT_EXTRAS_PK_XML_AGENT_EXTRAS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<XmlAgentExtrasRecord, Integer> getIdentity() {
        return Keys.IDENTITY_XML_AGENT_EXTRAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XmlAgentExtrasRecord> getPrimaryKey() {
        return Keys.PK_XML_AGENT_EXTRAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XmlAgentExtrasRecord>> getKeys() {
        return Arrays.<UniqueKey<XmlAgentExtrasRecord>>asList(Keys.PK_XML_AGENT_EXTRAS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentExtras as(String alias) {
        return new XmlAgentExtras(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentExtras as(Name alias) {
        return new XmlAgentExtras(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XmlAgentExtras rename(String name) {
        return new XmlAgentExtras(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XmlAgentExtras rename(Name name) {
        return new XmlAgentExtras(name, null);
    }
}