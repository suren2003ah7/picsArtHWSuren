package com.company.project.menus;

import com.company.project.supportEquipment.Light;
import com.company.project.supportEquipment.LightService;

import java.util.ArrayList;
import java.util.Scanner;

public class LightMenu {
    public static void run(ArrayList<Light> lights){
        Scanner sc = new Scanner(System.in);
        boolean bbb = true;
        while(bbb){
            System.out.println("Choose action");
            System.out.println("1. View all lights");
            System.out.println("2. Turn on all the lights");
            System.out.println("3. Turn off all the lights");
            System.out.println("4. Print all the lights with the color you want");
            System.out.println("5. Sort from the oldest to the newest");
            System.out.println("6. Go back");
            int k = sc.nextInt();
            switch (k){
                case 1:
                    try{
                        LightService.printAllInfo(lights);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 2:
                    try{
                        LightService.turnAllOn(lights);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 3:
                    try{
                        LightService.turnAllOff(lights);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 4:
                    try{
                        System.out.println("Type the color you want to search");
                        String color = sc.nextLine();
                        LightService.printAllColourLights(lights, color);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 5:
                    try{
                        LightService.sortFromOldestToNewest(lights);
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
