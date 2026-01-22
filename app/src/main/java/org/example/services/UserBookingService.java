package org.example.services;

import org.example.entities.User;

import java.io.File;

public class UserBookingService
{
    private User user;

    private static final String USERS_PATH="../localDb/user.json";

    public UserBookingService(User user1){
        this.user=user1;
        File users =new File();
    }
}
