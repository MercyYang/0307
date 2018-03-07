package com.login.user;  
  
public class User {  
    private String username;  
    private String password;  
      
    public User(String username, String password) {  
        super();  
        this.username = username;  
        this.password = password;  
    }  
    public String getUsername() {  
        return username;  
    }  
    public void setUsername(String username) {  
        this.username = username;  
    }  
      
}  