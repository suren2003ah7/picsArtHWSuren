package com.company.advancedLesson5.model;

import javax.swing.*;

public class MyTimer extends Thread{
    private int seconds;
    private JLabel label;

    public MyTimer(int seconds, JLabel label){
        this.seconds = seconds;
        this.label = label;
    }

    @Override
    public void run() {
        timer();
    }

    public synchronized void timer(){
        int secs = seconds % 60;
        int mins = (seconds - secs) / 60;
        while (true){
            if (secs >= 10)
                label.setText(mins + ":" + secs);
            else
                label.setText(mins + ":0" + secs);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (mins == 0 && secs == 0){
                label.setText("0:00");
                break;
            }

            if (secs == 0) {
                mins--;
                secs = 59;
                continue;
            }
            secs--;
        }
    }
}
