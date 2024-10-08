package StringOperationPackage;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 * 
 * @author Bertilla Fernandes
 */
@Path("generic")
public class StringOperations {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StringOperations
     */
    public StringOperations() {
    }

    /**
     * Retrieves representation of an instance of StringOperationPackage.StringOperations
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getHtml() {
        return "<h1>Welcome to the String Operations Web Service</h1>";
    }

    /**
     * PUT method for updating or creating an instance of StringOperations
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
        // Implement if needed
    }

    @PUT
    @Consumes("text/html")
    @Path("/Uppercase")
    public String toUppercaseMethod(String str) {
        return str.toUpperCase();
    }

    @PUT
    @Consumes("text/html")
    @Path("/Lowercase")
    public String toLowercaseMethod(String str) {
        return str.toLowerCase();
    }
}
