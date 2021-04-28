package com.company.project.supportEquipment;

import com.company.project.Technology;

public class Speaker extends Technology {
    private int loudness;

    public int getLoudness() { return loudness; }

    public void setLoudness(int loudness) { this.loudness = loudness; }

    @Override
    public void turnOn() {
        if(!(this.isTurnedOn())){
            System.out.println("Speaker turned on");
            setTurnedOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (this.isTurnedOn()){
            System.out.println("Speaker turned off");
            setTurnedOn(false);
        }
    }
}
