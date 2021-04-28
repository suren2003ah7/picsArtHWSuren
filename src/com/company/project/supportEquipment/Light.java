package com.company.project.supportEquipment;

import com.company.project.Technology;

public class Light extends Technology {
    private String lightColor;

    public String getLightColor() { return lightColor; }

    public void setLightColor(String lightColor) { this.lightColor = lightColor; }

    @Override
    public void turnOn() {
        if(!(this.isTurnedOn())){
            System.out.println("Light turned on");
            setTurnedOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (this.isTurnedOn()){
            System.out.println("Light turned off");
            setTurnedOn(false);
        }
    }

}
