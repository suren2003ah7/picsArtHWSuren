package com.company;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int year;
    private Car car;

    public User(String name, int year, Car car) {
        this.name = name;
        this.year = year;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
