package nl.inholland.hello;

import nl.inholland.hello.model.User;
import java.util.Optional;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;
import java.util.ArrayList;
import java.util.List;

public class HelloAuthenticator implements Authenticator<BasicCredentials, User>
{
    @Override
    public Optional<User> authenticate(BasicCredentials credentials) throws AuthenticationException
    {        
        List<User> users = new ArrayList<>();
        User user1 = new User("stefan", "test", true);
        User user2 = new User("stefan1", "test", false);
        User user3 = new User("stefan2", "test", false);
        User user4 = new User("stefan3", "test", false);
        User user5 = new User("stefan4", "test", true);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        
        for (User u : users)
        {
            if(credentials.getUsername().equals(u.getName()) && credentials.getPassword().equals(u.getPassword()))
            {
                return Optional.of(u);            }
        }
               
        return Optional.empty();
    }
}