package com.example.mitrofanovaviktoria.data;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private ArrayList<User> users = new ArrayList<>();

    public Repository() {
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.id = i;
            user.firstName = "FirstName" + i;
            user.secondName = "SecondName" + i;
            user.age = String.valueOf(20 + i);
            user.detailsInformation = "Details Information about " + user.firstName;
            users.add(user);
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getUser(int id) {
        for (User user : users) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }
}
