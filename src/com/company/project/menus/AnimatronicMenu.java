package com.company.project.menus;

import com.company.project.Animatronic;
import com.company.project.AnimatronicService;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimatronicMenu {
    public static void run(ArrayList<Animatronic> anims){
        Scanner sc = new Scanner(System.in);
        boolean bbb = true;
        while(bbb){
            System.out.println("Choose action");
            System.out.println("1. View all animatronics");
            System.out.println("2. Turn all animatronics on");
            System.out.println("3. Turn all animatronics off");
            System.out.println("4. Animatronic test concert");
            System.out.println("5. View all bears");
            System.out.println("6. View all rabbits");
            System.out.println("7. View all chickens");
            System.out.println("8. View all foxes");
            System.out.println("9. Go Back");
            int k = sc.nextInt();
            switch (k){
                case 1:
                    try{
                        AnimatronicService.printAllInfo(anims);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 2:
                    try{
                        AnimatronicService.turnAllOn(anims);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 3:
                    try {
                        AnimatronicService.turnAllOff(anims);
                    }
                    catch(NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 4:
                    try{
                        AnimatronicService.concert(anims);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 5:
                    try{
                        AnimatronicService.viewAllBears(anims);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 6:
                    try{
                        AnimatronicService.viewAllRabbits(anims);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 7:
                    try{
                        AnimatronicService.viewAllChickens(anims);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 8:
                    try{
                        AnimatronicService.viewAllFoxes(anims);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 9:
                    bbb = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
