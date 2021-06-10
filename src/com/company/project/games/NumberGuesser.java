package com.company.project.games;
import java.util.Random;
import java.util.Scanner;

import com.company.project.ArcadeGame;

public class NumberGuesser extends ArcadeGame {
    @Override
    public void play() {
        int d;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rand.nextInt(10) + 1;
        System.out.println("Guess the number from 1 to 10 inclusive, you have 3 tries");
        for (int i = 0; i < 3; i++){
            d = sc.nextInt();
            if (d == number){
                System.out.println("You Win!");
                return;
            }
            else if (d > number){
                System.out.println("Lower!");
            }
            else if (d < number){
                System.out.println("Higher!");
            }
        }
        System.out.println("You lost!");
    }
}
