package nl.inholland.hello.model;

import java.security.Principal;

public class User implements Principal
{
    private String name = "";
    
    private String password = "";
    
    private boolean important = false;
    
    public User(String name, String password, boolean important)
    {
        this.name = name;
        this.password = password;
        this.important = important;
    }
    
    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isImportant() {
        return important;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}