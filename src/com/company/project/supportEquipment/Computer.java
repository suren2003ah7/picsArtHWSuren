package com.company.project.supportEquipment;

import com.company.project.Technology;

public class Computer extends Technology {
    private int memory = 1; // in gb
    private int RAM = 1; // in gb
    private double monitorWidth = 1; // in centimeters
    private double monitorLength = 1; // in centimeters

    public int getMemory() { return memory; }

    public void setMemory(int memory) {
        if (memory > 0 && memory <= 10000){
            this.memory = memory;
        }
        else{
            System.out.println("Wrong input!");
        }
    }

    public int getRAM() { return RAM; }

    public void setRAM(int RAM) {
        if (RAM > 0 && RAM <= 32){
            this.RAM = RAM;
        }
        else {
            System.out.println("Wrong input!");
        }
    }

    public double getMonitorWidth() { return monitorWidth; }

    public void setMonitorWidth(double monitorWidth) {
        if (monitorWidth > 0 && monitorWidth < 10000) {
            this.monitorWidth = monitorWidth;
        }
        else {
            System.out.println("Wrong input!");
        }
    }

    public double getMonitorLength() { return monitorLength; }

    public void setMonitorLength(double monitorLength) {
        if (monitorLength > 0 && monitorLength < 10000) {
            this.monitorLength = monitorLength;;
        }
        else {
            System.out.println("Wrong input!");
        }
    }

    @Override
    public void turnOn() {
        if(!(isTurnedOn())){
            System.out.println("Computer turned on");
            setTurnedOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (isTurnedOn()){
            System.out.println("Computer turned off");
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
        System.out.println("memory: " + getMemory());
        System.out.println("RAM: " + getRAM());
        System.out.println("monitor width: " + getMonitorWidth());
        System.out.println("monitor length: " + getMonitorLength());
        System.out.println("==================================");
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
