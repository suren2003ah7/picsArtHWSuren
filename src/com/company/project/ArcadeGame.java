package com.company.project;

public abstract class ArcadeGame extends Technology{
    private int highScore;

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    @Override
    public void turnOn() {
        if(!(this.isTurnedOn())){
            System.out.println("Beep-Beep, arcade game turned on! Good Morning)");
            setTurnedOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (this.isTurnedOn()){
            System.out.println("Boop-Boop, arcade game turned off! zzz");
            setTurnedOn(false);
        }
    }

    /*public void stats(){
        System.out.println("The highest score is " + getHighScore());
    }*/
    abstract public void play();
}
