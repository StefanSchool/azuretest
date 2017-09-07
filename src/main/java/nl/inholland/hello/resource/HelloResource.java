package nl.inholland.hello.resource;

import io.dropwizard.auth.Auth;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import nl.inholland.hello.model.User;

@Path("/hey")
public class HelloResource
{
    final private String defaultName;
    
    public HelloResource(String defaultName)
    {
        this.defaultName = defaultName;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public User getName(@Auth User user)
    {
        if(user.isImportant())
        {
           return user;
        }
        else
        {
            return user; 
        }
        
    }
    
}