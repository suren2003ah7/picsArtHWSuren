package com.company.project.games;

import com.company.project.ArcadeGame;

import java.util.Scanner;

public class Trivia extends ArcadeGame {
    @Override
    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer all 3 questions correctly, and win!");
        for (int i = 0; i < 3; i++){
            switch (i){
                case 0:
                    System.out.println("2 + 2 * 2 = ?");
                    if(sc.nextInt() == 6){
                        System.out.println("Correct!");
                        break;
                    }
                    System.out.println("Wrong, you lose!");
                    return;
                case 1:
                    System.out.println("3^5 = ?, (^ is the power sign)");
                    if(sc.nextInt() == 243){
                        System.out.println("Correct!");
                        break;
                    }
                    System.out.println("Wrong, you lose!");
                    return;
                case 2:
                    System.out.println("sqrt(81) = ?, (whats the square root of 81?)");
                    if(sc.nextInt() == 9){
                        System.out.println("Correct!");
                        break;
                    }
                    System.out.println("Wrong, you lose!");
                    return;
            }
        }
        System.out.println("You win!");
    }
}
