package com.company.project.animatronics;
import com.company.project.Animatronic;

public class Rabbit extends Animatronic {
    @Override
    public void dance() {
        if (isTurnedOn()){
            System.out.println(getName() + " is dancing with his ears moving from left to right!");
        }
    }

    @Override
    public void sing() {
        if (isTurnedOn()){
            System.out.println(getName() + " is singing with his robotic voice!");
        }
    }

    public void playGuitar(){
        if (isTurnedOn()){
            System.out.println(getName() + " is playing Eric Clapton with his red guitar");
        }
    }
}
