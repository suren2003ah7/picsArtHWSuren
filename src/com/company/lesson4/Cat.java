package com.company.lesson4;

public class Cat {
    private String name;
    private int age = 0;
    private int length = 25; // in centimeters
    private char gender; // F for female, M for male
    private boolean isHungry = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void speak(){
        System.out.println();
        System.out.println("Meow");
        System.out.println();
    }
}
