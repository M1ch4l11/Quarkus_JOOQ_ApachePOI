package services.jooq;

import generated.market.tables.records.CustomerRecord;
import models.Customer;
import org.jooq.Condition;
import org.jooq.Name;

import java.beans.JavaBean;


@JavaBean
public interface JooqService {
    public Name getTableName(String name);
    public CustomerRecord convertToCustomerRecord(Customer customer);
    public Condition findCondition(int id, String tableName);
}
