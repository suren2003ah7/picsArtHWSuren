package com.company.project.menus;

import com.company.project.ArcadeGame;
import com.company.project.ArcadeGameService;

import java.util.ArrayList;
import java.util.Scanner;

public class ArcadeGameMenu {
    public static void run(ArrayList<ArcadeGame> games){
        Scanner sc = new Scanner(System.in);
        boolean bbb = true;
        while(bbb){
            System.out.println("Choose action");
            System.out.println("1. View all arcade games");
            System.out.println("2. Turn on all arcade games");
            System.out.println("3. Turn off all arcade games");
            System.out.println("4. Play all arcade games");
            System.out.println("5. Print the arcade game with the highest high score");
            System.out.println("6. Go Back");
            int k = sc.nextInt();
            switch (k){
                case 1:
                    try{
                        ArcadeGameService.printAllGames(games);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 2:
                    try{
                        ArcadeGameService.turnAllOn(games);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 3:
                    try{
                        ArcadeGameService.turnAllOff(games);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 4:
                    try{
                        ArcadeGameService.playAll(games);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 5:
                    try{
                        ArcadeGameService.printHighest(games);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 6:
                    bbb = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
