package jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/coba")
public class MyResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "[{ 'message': 'welcome' }]";
    }
}