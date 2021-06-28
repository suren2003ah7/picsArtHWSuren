package com.company.advancedLesson6.model;

import java.io.Serializable;

public class MySingleton implements Serializable {
    private String text;
    private int number;
    private static volatile MySingleton instance =  new MySingleton();

    public static MySingleton getInstance() {
        return instance;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private MySingleton() { }

    /*public static MySingleton getInstance(){
        if (instance == null){
            synchronized (MySingleton.class){
                if (instance == null){
                    return new MySingleton();
                }
            }
        }
        return instance;
    }*/

    protected Object readResolve(){
        return instance;
    }
}
