/*
 * This file is generated by jOOQ.
 */
package generated.market.tables;


import com.fasterxml.jackson.annotation.JsonProperty;
import generated.market.Keys;
import generated.market.Market;
import generated.market.tables.records.CustomerRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class  Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>market.Customer</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>market.Customer.id_customer</code>.
     */
    @JsonProperty("id_customer")
    public final TableField<CustomerRecord, Integer> ID_CUSTOMER = createField(DSL.name("id_customer"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>market.Customer.id_adress</code>.
     */
    public final TableField<CustomerRecord, Integer> ID_ADRESS = createField(DSL.name("id_adress"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>market.Customer.firstname</code>.
     */
    public final TableField<CustomerRecord, String> FIRSTNAME = createField(DSL.name("firstname"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>market.Customer.lastname</code>.
     */
    public final TableField<CustomerRecord, String> LASTNAME = createField(DSL.name("lastname"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>market.Customer.birthdate</code>.
     */
    public final TableField<CustomerRecord, LocalDate> BIRTHDATE = createField(DSL.name("birthdate"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>market.Customer.email</code>.
     */
    public final TableField<CustomerRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private Customer(Name alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>market.Customer</code> table reference
     */
    public Customer(String alias) {
        this(DSL.name(alias), CUSTOMER);
    }

    /**
     * Create an aliased <code>market.Customer</code> table reference
     */
    public Customer(Name alias) {
        this(alias, CUSTOMER);
    }

    /**
     * Create a <code>market.Customer</code> table reference
     */
    public Customer() {
        this(DSL.name("Customer"), null);
    }

    public <O extends Record> Customer(Table<O> child, ForeignKey<O, CustomerRecord> key) {
        super(child, key, CUSTOMER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Market.MARKET;
    }

    @Override
    public Identity<CustomerRecord, Integer> getIdentity() {
        return (Identity<CustomerRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.CUSTOMER_PKEY;
    }

    @Override
    public List<ForeignKey<CustomerRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CUSTOMER__FK_CUSTOMER_ADRESS);
    }

    private transient Adress _adress;

    /**
     * Get the implicit join path to the <code>market.Adress</code> table.
     */
    public Adress adress() {
        if (_adress == null)
            _adress = new Adress(this, Keys.CUSTOMER__FK_CUSTOMER_ADRESS);

        return _adress;
    }

    @Override
    public Customer as(String alias) {
        return new Customer(DSL.name(alias), this);
    }

    @Override
    public Customer as(Name alias) {
        return new Customer(alias, this);
    }

    @Override
    public Customer as(Table<?> alias) {
        return new Customer(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(String name) {
        return new Customer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Name name) {
        return new Customer(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Table<?> name) {
        return new Customer(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, String, LocalDate, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super Integer, ? super String, ? super String, ? super LocalDate, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super Integer, ? super String, ? super String, ? super LocalDate, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
