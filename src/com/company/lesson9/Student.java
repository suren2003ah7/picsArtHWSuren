package com.company.lesson9;

public class Student {
    private String name;
    private String surname;
    private int year;
    private char gender;
    private double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void printInfo(){
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getYear());
        System.out.println(getGender());
        System.out.println(getMark());
    }
}
