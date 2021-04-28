package com.company.project;

public abstract class Animatronic extends Technology{
    private double height;

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }

    abstract void dance();
    abstract void sing();
}
