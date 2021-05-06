package com.company.project.menus;

import com.company.project.Animatronic;
import com.company.project.AnimatronicService;
import com.company.project.ArcadeGame;
import com.company.project.ArcadeGameService;
import com.company.project.supportEquipment.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu{
    public static void run(ArrayList<Animatronic> anims, ArrayList<ArcadeGame> games, ArrayList<Computer> comps, ArrayList<Light> lights, ArrayList<Speaker> speakers) {
        Scanner sc = new Scanner(System.in);
        boolean bb = true;
        while (bb){
            System.out.println("Choose the category");
            System.out.println("1. Animatronics");
            System.out.println("2. Arcade Games");
            System.out.println("3. Computers");
            System.out.println("4. Lights");
            System.out.println("5. Speakers");
            System.out.println("6. Go back");
            int j = sc.nextInt();
            boolean bbb = true;
            switch (j){
                case 1:
                    AnimatronicMenu.run(anims);
                    break;
                case 2:
                    ArcadeGameMenu.run(games);
                    break;
                case 3:
                    ComputerMenu.run(comps);
                    break;
                case 4:
                    LightMenu.run(lights);
                    break;
                case 5:
                    SpeakerMenu.run(speakers);
                    break;
                case 6:
                    bb = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
