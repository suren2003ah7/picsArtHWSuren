package com.company.project.animatronics;
import com.company.project.Animatronic;

public class Bear extends Animatronic {
    @Override
    public void dance() {
        if (isTurnedOn()){
            System.out.println(getName() + " is dancing, slowly moving his big belly and ginormous feet!");
        }
    }

    @Override
    public void sing() {
        if (isTurnedOn()){
            System.out.println(getName() + " is singing with his microphone!");
        }
    }

    public void playMusicBox(){
        if (isTurnedOn()){
            System.out.println(getName() + " is playing his his music box!");
        }
    }

    public void laugh(){
        if (isTurnedOn()){
            System.out.println(getName() + " is laughing with it's childish voice!");
        }
    }
}
