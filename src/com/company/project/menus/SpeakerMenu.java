package com.company.project.menus;

import com.company.project.supportEquipment.Speaker;
import com.company.project.supportEquipment.SpeakerService;

import java.util.Scanner;

public class SpeakerMenu {
    public static void run(Speaker[] speakers){
        Scanner sc = new Scanner(System.in);
        boolean bbb = true;
        while(bbb){
            System.out.println("Choose action");
            System.out.println("1. View all speakers");
            System.out.println("2. Turn on all the speakers");
            System.out.println("3. Turn off all the speakers");
            System.out.println("4. Play music");
            System.out.println("5. Go back");
            int k = sc.nextInt();
            switch (k){
                case 1:
                    try{
                        SpeakerService.printAllInfo(speakers);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 2:
                    try{
                        SpeakerService.turnAllOn(speakers);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 3:
                    try{
                        SpeakerService.turnAllOff(speakers);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 4:
                    try{
                        SpeakerService.playAllMusic(speakers);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 5:
                    bbb = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
