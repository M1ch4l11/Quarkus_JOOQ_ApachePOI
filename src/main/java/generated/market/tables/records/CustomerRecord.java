/*
 * This file is generated by jOOQ.
 */
package generated.market.tables.records;


import generated.market.tables.Customer;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> implements Record6<Integer, Integer, String, String, LocalDate, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>market.Customer.id_customer</code>.
     */
    public void setIdCustomer(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>market.Customer.id_customer</code>.
     */
    public Integer getIdCustomer() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>market.Customer.id_adress</code>.
     */
    public void setIdAdress(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>market.Customer.id_adress</code>.
     */
    public Integer getIdAdress() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>market.Customer.firstname</code>.
     */
    public void setFirstname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>market.Customer.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>market.Customer.lastname</code>.
     */
    public void setLastname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>market.Customer.lastname</code>.
     */
    public String getLastname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>market.Customer.birthdate</code>.
     */
    public void setBirthdate(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>market.Customer.birthdate</code>.
     */
    public LocalDate getBirthdate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>market.Customer.email</code>.
     */
    public void setEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>market.Customer.email</code>.
     */
    public String getEmail() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, String, LocalDate, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, String, String, LocalDate, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Customer.CUSTOMER.ID_CUSTOMER;
    }

    @Override
    public Field<Integer> field2() {
        return Customer.CUSTOMER.ID_ADRESS;
    }

    @Override
    public Field<String> field3() {
        return Customer.CUSTOMER.FIRSTNAME;
    }

    @Override
    public Field<String> field4() {
        return Customer.CUSTOMER.LASTNAME;
    }

    @Override
    public Field<LocalDate> field5() {
        return Customer.CUSTOMER.BIRTHDATE;
    }

    @Override
    public Field<String> field6() {
        return Customer.CUSTOMER.EMAIL;
    }

    @Override
    public Integer component1() {
        return getIdCustomer();
    }

    @Override
    public Integer component2() {
        return getIdAdress();
    }

    @Override
    public String component3() {
        return getFirstname();
    }

    @Override
    public String component4() {
        return getLastname();
    }

    @Override
    public LocalDate component5() {
        return getBirthdate();
    }

    @Override
    public String component6() {
        return getEmail();
    }

    @Override
    public Integer value1() {
        return getIdCustomer();
    }

    @Override
    public Integer value2() {
        return getIdAdress();
    }

    @Override
    public String value3() {
        return getFirstname();
    }

    @Override
    public String value4() {
        return getLastname();
    }

    @Override
    public LocalDate value5() {
        return getBirthdate();
    }

    @Override
    public String value6() {
        return getEmail();
    }

    @Override
    public CustomerRecord value1(Integer value) {
        setIdCustomer(value);
        return this;
    }

    @Override
    public CustomerRecord value2(Integer value) {
        setIdAdress(value);
        return this;
    }

    @Override
    public CustomerRecord value3(String value) {
        setFirstname(value);
        return this;
    }

    @Override
    public CustomerRecord value4(String value) {
        setLastname(value);
        return this;
    }

    @Override
    public CustomerRecord value5(LocalDate value) {
        setBirthdate(value);
        return this;
    }

    @Override
    public CustomerRecord value6(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public CustomerRecord values(Integer value1, Integer value2, String value3, String value4, LocalDate value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(Integer idCustomer, Integer idAdress, String firstname, String lastname, LocalDate birthdate, String email) {
        super(Customer.CUSTOMER);

        setIdCustomer(idCustomer);
        setIdAdress(idAdress);
        setFirstname(firstname);
        setLastname(lastname);
        setBirthdate(birthdate);
        setEmail(email);
        resetChangedOnNotNull();
    }
}
