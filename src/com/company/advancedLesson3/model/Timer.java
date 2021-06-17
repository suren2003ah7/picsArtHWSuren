package com.company.advancedLesson3.model;

import java.util.Scanner;

public class Timer extends Thread{
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number of seconds");
        int seconds = sc.nextInt();
        System.out.println();
        timer(seconds);
    }

    public void timer(int seconds) {
        int secs = seconds % 60;
        int mins = (seconds - secs) / 60;
        while (true){
            System.out.println(mins + "m " + secs + "s");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (mins == 0 && secs == 0){
                System.out.println("Time is up!");
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
