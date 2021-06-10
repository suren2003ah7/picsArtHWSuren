package com.company.exam1;

public class Taxi {
    private String model;
    private String country;
    private int year;
    private int milage;
    private boolean isSport;
    private int weight;
    private int topSpeed;
    private int numberOfSeats;
    private double cost;

    public String getName() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void info(){
        System.out.println("=====================================");
        System.out.println("model: " + getName());
        System.out.println("country: " + getCountry());
        System.out.println("year: " + getYear());
        System.out.println("milage: " + getMilage());
        System.out.println("isSport: " + isSport());
        System.out.println("weight: " + getWeight());
        System.out.println("top speed: " + getTopSpeed());
        System.out.println("number of seats: " + getNumberOfSeats());
        System.out.println("cost: " + getCost());
        System.out.println("=====================================");
    }
}
