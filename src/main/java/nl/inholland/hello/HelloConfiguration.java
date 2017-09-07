package nl.inholland.hello;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class HelloConfiguration extends Configuration 
{
    @NotEmpty
    private String defaultName = "Team";

    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }
    
    
}



