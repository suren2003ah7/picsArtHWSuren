package com.company.project.menus;

import com.company.project.supportEquipment.Light;
import com.company.project.supportEquipment.LightService;

import java.util.Scanner;

public class LightMenu {
    public static void run(Light[] lights){
        Scanner sc = new Scanner(System.in);
        boolean bbb = true;
        while(bbb){
            System.out.println("Choose action");
            System.out.println("1. View all lights");
            System.out.println("2. Turn on all the lights");
            System.out.println("3. Turn off all the lights");
            System.out.println("4. Go back");
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
                    bbb = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
