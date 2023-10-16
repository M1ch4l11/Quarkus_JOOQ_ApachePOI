package org.acme;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import generated.market.tables.records.CustomerRecord;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.PartType;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import services.jooq.JooqService;

@RequestScoped
@Path("/crud")
@Produces(MediaType.APPLICATION_JSON)
public class CRUDResource {

    @Inject
    DSLContext dsl;

    @Inject
    JooqService service;

    @GET
    @Path("/{tableName}/all")
    public Result<Record> getAll(@PathParam("tableName") String tableName ) {
        return dsl.select()
                .from("market." + service.getTableName(tableName))
                .fetch();
    }

    @GET
    @Path("/{tableName}/{id}")
    public Result<Record> getById(@PathParam("tableName") String tableName, @PathParam("id") int id){
        return dsl.select()
                .from("market." + service.getTableName(tableName))
                .where(service.findCondition(id, tableName))
                .fetch();
    }

    @POST
    @Path("/customer")
    public int setRow(@PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        CustomerRecord customerRecord = service.convertToCustomerRecord(new ObjectMapper().readValue(json, models.Customer.class));
        return dsl.insertInto(DSL.table("market."+service.getTableName("customer")))
                .set(customerRecord.field2(), customerRecord.getIdAdress())
                .set(customerRecord.field3(), customerRecord.getFirstname())
                .set(customerRecord.field4(), customerRecord.getLastname())
                .set(customerRecord.field5(), customerRecord.getBirthdate())
                .set(customerRecord.field6(), customerRecord.getEmail())
                .execute();
    }
}
