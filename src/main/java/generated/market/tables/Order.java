/*
 * This file is generated by jOOQ.
 */
package generated.market.tables;


import generated.market.Indexes;
import generated.market.Keys;
import generated.market.Market;
import generated.market.tables.records.OrderRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class Order extends TableImpl<OrderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>market.Order</code>
     */
    public static final Order ORDER = new Order();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderRecord> getRecordType() {
        return OrderRecord.class;
    }

    /**
     * The column <code>market.Order.id_order</code>.
     */
    public final TableField<OrderRecord, Integer> ID_ORDER = createField(DSL.name("id_order"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("nextval('market.\"Order_id_order_seq\"'::regclass)"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>market.Order.id_fruit</code>.
     */
    public final TableField<OrderRecord, Integer> ID_FRUIT = createField(DSL.name("id_fruit"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>market.Order.id_customer</code>.
     */
    public final TableField<OrderRecord, Integer> ID_CUSTOMER = createField(DSL.name("id_customer"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>market.Order.date_of_order</code>.
     */
    public final TableField<OrderRecord, LocalDate> DATE_OF_ORDER = createField(DSL.name("date_of_order"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>market.Order.date_of_completed</code>.
     */
    public final TableField<OrderRecord, LocalDate> DATE_OF_COMPLETED = createField(DSL.name("date_of_completed"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>market.Order.kg</code>.
     */
    public final TableField<OrderRecord, Double> KG = createField(DSL.name("kg"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>market.Order.price</code>.
     */
    public final TableField<OrderRecord, Double> PRICE = createField(DSL.name("price"), SQLDataType.DOUBLE, this, "");

    private Order(Name alias, Table<OrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private Order(Name alias, Table<OrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>market.Order</code> table reference
     */
    public Order(String alias) {
        this(DSL.name(alias), ORDER);
    }

    /**
     * Create an aliased <code>market.Order</code> table reference
     */
    public Order(Name alias) {
        this(alias, ORDER);
    }

    /**
     * Create a <code>market.Order</code> table reference
     */
    public Order() {
        this(DSL.name("Order"), null);
    }

    public <O extends Record> Order(Table<O> child, ForeignKey<O, OrderRecord> key) {
        super(child, key, ORDER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Market.MARKET;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FK_ORDER_CUSTOMER1_IDX, Indexes.FK_ORDER_FRUIT1_IDX);
    }

    @Override
    public UniqueKey<OrderRecord> getPrimaryKey() {
        return Keys.ORDER_PKEY;
    }

    @Override
    public List<ForeignKey<OrderRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ORDER__FK_ORDER_FRUIT1, Keys.ORDER__FK_ORDER_CUSTOMER1);
    }

    private transient Fruit _fruit;
    private transient Customer _customer;

    /**
     * Get the implicit join path to the <code>market.Fruit</code> table.
     */
    public Fruit fruit() {
        if (_fruit == null)
            _fruit = new Fruit(this, Keys.ORDER__FK_ORDER_FRUIT1);

        return _fruit;
    }

    /**
     * Get the implicit join path to the <code>market.Customer</code> table.
     */
    public Customer customer() {
        if (_customer == null)
            _customer = new Customer(this, Keys.ORDER__FK_ORDER_CUSTOMER1);

        return _customer;
    }

    @Override
    public Order as(String alias) {
        return new Order(DSL.name(alias), this);
    }

    @Override
    public Order as(Name alias) {
        return new Order(alias, this);
    }

    @Override
    public Order as(Table<?> alias) {
        return new Order(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Order rename(String name) {
        return new Order(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Order rename(Name name) {
        return new Order(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Order rename(Table<?> name) {
        return new Order(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, LocalDate, LocalDate, Double, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Integer, ? super Integer, ? super Integer, ? super LocalDate, ? super LocalDate, ? super Double, ? super Double, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Integer, ? super Integer, ? super Integer, ? super LocalDate, ? super LocalDate, ? super Double, ? super Double, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
