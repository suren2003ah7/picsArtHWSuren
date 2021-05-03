package com.company.project.supportEquipment;

import com.company.project.Technology;

public class Speaker extends Technology {
    private int loudness = 1; // in decibels

    public int getLoudness() { return loudness; }

    public void setLoudness(int loudness) {
        if (loudness > 0 && loudness < 140){
            this.loudness = loudness;
        }
        else{
            System.out.println("Wrong input!");
        }
    }

    @Override
    public void turnOn() {
        if(!(isTurnedOn())){
            System.out.println("Speaker turned on");
            setTurnedOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (isTurnedOn()){
            System.out.println("Speaker turned off");
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
        System.out.println("loudness: " + getLoudness());
        System.out.println("==================================");
    }

    public void playMusic(){
        if (isTurnedOn()){
            System.out.println(getName() + " is playing music");
        }
    }
}
