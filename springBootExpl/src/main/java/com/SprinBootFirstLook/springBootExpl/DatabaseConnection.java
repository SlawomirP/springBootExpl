package com.SprinBootFirstLook.springBootExpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

    @Value("localhost") // w nawiasie normalnie bysmy dali lokalizacje
    private String host;
    @Value("Slaw")
    private String username;
    @Value("password")
    private String password;

    public void addUserToDatabase(String name) {
        System.out.println("User added to db.");
    }
}
