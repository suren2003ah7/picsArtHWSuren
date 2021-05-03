package com.company.project.supportEquipment;

import com.company.project.Technology;

public class Light extends Technology {
    private String lightColor = "UNKNOWN";

    public String getLightColor() { return lightColor; }

    public void setLightColor(String lightColor) {
        if (!(lightColor.equals(""))){
            this.lightColor = lightColor;
        }
        else {
            System.out.println("Wrong input!");
        }
    }

    @Override
    public void turnOn() {
        if(!(isTurnedOn())){
            System.out.println("Light turned on");
            setTurnedOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (isTurnedOn()){
            System.out.println("Light turned off");
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
        System.out.println("light color: " + getLightColor());
        System.out.println("==================================");
    }

}
