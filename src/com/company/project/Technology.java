package com.company.project;

public abstract class Technology {
    private String name;
    private String condition;
    private int year;
    private boolean isTurnedOn = false;
    private double weight;
    private String serialCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSerialCode() { return serialCode; }

    public void setSerialCode(String serialCode) { this.serialCode = serialCode; }

    abstract public void turnOn();
    abstract public void turnOff();
}
