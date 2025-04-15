package com.junnu.sms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Credentials {
    @Id
    String username;
    String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
   
}
