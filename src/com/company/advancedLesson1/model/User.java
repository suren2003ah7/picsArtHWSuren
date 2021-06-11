package com.company.advancedLesson1.model;

import java.io.Serializable;

public class User implements Serializable {

    private String username;
    private int year;
    private final static long serialVersionUID = 89352654593591L;

    public User(String username, int year) {
        this.username = username;
        this.year = year;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", year=" + year +
                '}';
    }
}
