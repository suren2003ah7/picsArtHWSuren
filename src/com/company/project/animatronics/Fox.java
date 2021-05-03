package com.company.project.animatronics;
import com.company.project.Animatronic;

public class Fox extends Animatronic {
    @Override
    public void dance() {
        if (isTurnedOn()){
            System.out.println(getName() + " is dancing using its sharp hook!");
        }
    }

    @Override
    public void sing() {
        if (isTurnedOn()){
            System.out.println(getName() + " is singing with his pirate accent!, Yarr!");
        }
    }

    public void rolePlay(){
        if (isTurnedOn()){
            System.out.println(getName() + " is role-playing, he is a mighty pirate traveling through the endless seas desperate to find the treasure of the green ghost!");
        }
    }
}
