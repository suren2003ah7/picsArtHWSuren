package com.company.project;

public abstract class ArcadeGame extends Technology{
    private int highScore = 0;

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        if (highScore >= 0){
            this.highScore = highScore;
        }
        else {
            System.out.println("Wrong input!");
        }
    }

    @Override
    public void turnOn() {
        if(!(isTurnedOn())){
            System.out.println("Beep-Beep, arcade game turned on! Good Morning)");
            setTurnedOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (isTurnedOn()){
            System.out.println("Boop-Boop, arcade game turned off! zzz");
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
        System.out.println("high score: " + getHighScore());
        System.out.println("==================================");
    }

    public void viewHighScore(){
        if (isTurnedOn()){
            System.out.println("High Score: " + getHighScore());
        }
    }

    abstract public void play();
}
