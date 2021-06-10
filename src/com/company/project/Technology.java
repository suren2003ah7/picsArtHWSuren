package com.company.project;

public abstract class Technology {
    private String name = "defaultName";
    private String condition = "new";
    private int year = 2021;
    private boolean isTurnedOn = false;
    private double weight = 100.0; // in kilograms
    private String serialCode = "NOSERIALCODE";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.equals(""))){
            this.name = name;
        }
        else{
            System.out.println("Wrong input!");
        }
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        if (condition.equals("out of order") || condition.equals("bad") || condition.equals("normal") || condition.equals("good") || condition.equals("new")){
            this.condition = condition;
        }
        else{
            System.out.println("Wrong input!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1960 && year <= 2021){
            this.year = year;
        }
        else {
            System.out.println("Wrong input!");
        }
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
        if (weight > 0 && weight < 1000000){
            this.weight = weight;
        }
        else {
            System.out.println("Wrong input!");
        }
    }

    public String getSerialCode() { return serialCode; }

    public void setSerialCode(String serialCode) {
        if (serialCode.length() == 4){
            if (Character.isLetter(serialCode.charAt(0)) && Character.isLetter(serialCode.charAt(1)) && Character.isDigit(serialCode.charAt(2)) && Character.isDigit(serialCode.charAt(3))){
                this.serialCode = serialCode;
            }
            else {
                System.out.println("Wrong input!");
            }
        }
        else {
            System.out.println("Wrong input!");
        }
    }

    abstract public void turnOn();
    abstract public void turnOff();
    abstract public void info();
}
