package example;

import example.restmodels.RequestTraceHeader;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@HeaderParam("request-id") RequestTraceHeader requestId) {
        System.out.println("Received requestTraceHeader 'request-id':- ");
        if (requestId == null) System.out.println("Null");
//        else System.out.println(requestId.getRequestId());
        return "Hello Guy";
    }
}
