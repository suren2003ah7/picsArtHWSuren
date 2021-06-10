package com.company.project;

public abstract class Animatronic extends Technology{
    private double height = 1.8; // in meters
    private String animal = "UNKNOWN";

    public String getAnimal() { return animal; }

    public void setAnimal(String animal) {
        if (animal.equals("bear") || animal.equals("rabbit") || animal.equals("chicken") || animal.equals("fox")){
            this.animal = animal;
        }
        else{
            System.out.println("Wrong input!");
        }
    }

    public double getHeight() { return height; }

    public void setHeight(double height) {
        if (height > 0 && height < 50){
            this.height = height;
        }
        else{
            System.out.println("Wrong input!");
        }
    }

    public abstract void dance();
    public abstract void sing();

    @Override
    public void turnOn() {
        if(!(isTurnedOn())){
            System.out.println(getName() + " turned on");
            setTurnedOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (isTurnedOn()){
            System.out.println(getName() + " turned off");
            setTurnedOn(false);
        }
    }

    @Override
    public void info() {
        System.out.println("==================================");
        System.out.println("name: " + getName());
        System.out.println("condition: " + getCondition());
        System.out.println("year: " + getYear());
        System.out.println("weight: " + getWeight());
        System.out.println("serial code: " + getSerialCode());
        System.out.println("height: " + getHeight());
        System.out.println("animal: " + getAnimal());
        System.out.println("==================================");
    }
}
