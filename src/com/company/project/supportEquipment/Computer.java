package com.company.project.supportEquipment;

import com.company.project.Technology;

public class Computer extends Technology {
    private int memory;
    private int RAM;
    private double monitorWidth;
    private double monitorLength;

    public int getMemory() { return memory; }

    public void setMemory(int memory) { this.memory = memory; }

    public int getRAM() { return RAM; }

    public void setRAM(int RAM) { this.RAM = RAM; }

    public double getMonitorWidth() { return monitorWidth; }

    public void setMonitorWidth(double monitorWidth) { this.monitorWidth = monitorWidth; }

    public double getMonitorLength() { return monitorLength; }

    public void setMonitorLength(double monitorLength) { this.monitorLength = monitorLength; }

    @Override
    public void turnOn() {
        if(!(this.isTurnedOn())){
            System.out.println("Computer turned on");
            setTurnedOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (this.isTurnedOn()){
            System.out.println("Computer turned off");
            setTurnedOn(false);
        }
    }

    public void printStaffData(){
        System.out.println("~~~\"At Freddy's\" staff list~~~");
        System.out.println("Henry Brown, Owner");
        System.out.println("William Afton, Co-founder");
        System.out.println("Dave Roberts, Guard");
        System.out.println("Ron Stones, Guard");
        System.out.println("Anna Bricks, Cook");
        System.out.println("Joshua Walton, Cook");
        System.out.println("Margaret Clay, Cook");
        System.out.println("David Muller, Waiter");
        System.out.println("Katy Peterson, Waitress");
        System.out.println();
    }
}
