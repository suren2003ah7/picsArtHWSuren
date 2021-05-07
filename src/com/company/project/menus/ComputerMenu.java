package com.company.project.menus;

import com.company.project.supportEquipment.Computer;
import com.company.project.supportEquipment.ComputerService;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerMenu {
    public static void run(ArrayList<Computer> comps){
        Scanner sc = new Scanner(System.in);
        boolean bbb = true;
        while(bbb){
            System.out.println("Choose action");
            System.out.println("1. View all computers");
            System.out.println("2. Turn on all the computers");
            System.out.println("3. Turn off all the computers");
            System.out.println("4. View staff info");
            System.out.println("5. View diagonals of the computers");
            System.out.println("6. Sort from the oldest to the newest");
            System.out.println("7. Go Back");
            int k = sc.nextInt();
            switch (k){
                case 1:
                    try{
                        ComputerService.printAllComputers(comps);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 2:
                    try{
                        ComputerService.turnAllOn(comps);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 3:
                    try{
                        ComputerService.turnAllOff(comps);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 4:
                    try{
                        comps.get(0).printStaffData();
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 5:
                    try{
                        ComputerService.viewDiagonalOfComputers(comps);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 6:
                    try{
                        ComputerService.sortFromOldestToNewest(comps);
                    }
                    catch (NullPointerException e){
                        System.out.println("There are no such entities");
                    }
                    break;
                case 7:
                    bbb = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
