package com.company.project.animatronics;
import com.company.project.Animatronic;

public class Chicken extends Animatronic {
    @Override
    public void dance() {
        if (isTurnedOn()){
            System.out.println(getName() + " is dancing, slowly vibrating with its orange beak!");
        }
    }

    @Override
    public void sing() {
        if (isTurnedOn()){
            System.out.println(getName() + " is singing with her charming voice!");
        }
    }

    public void deliverCupcake(){
        if (isTurnedOn()){
            System.out.println(getName() + " just delivered a tasty pink cupcake with a smile!)");
        }
    }
}
