package com.company;
import com.company.exam1.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaxiService service = new TaxiService();
        Scanner sc = new Scanner(System.in);

        Taxi t1 = new Taxi();
        Taxi t2 = new Taxi();
        Taxi t3 = new Taxi();
        t1 = service.create(t1);
        t2 = service.create(t2);
        t3 = service.create(t3);
        Taxi[] taxis = {t1, t2, t3};
        boolean b = true;
        while(b){
            System.out.println("=====================================");
            System.out.println("Select options from below");
            System.out.println("1. Prints info about the taxi based on if it's a sport one or not.");
            System.out.println("2. Returns the newest taxi form the two.");
            System.out.println("3. Prints the country of the taxi with the smallest amount of seats.");
            System.out.println("4. Prints info about all non-sport taxis.");
            System.out.println("5. Prints info about sport taxis which has a decent milage.");
            System.out.println("6. Returns the taxi with the minimal weight.");
            System.out.println("7. Returns the taxi with the minimal cost.");
            System.out.println("8. Prints all taxis from the oldest to the newest.");
            System.out.println("9. Exit.");
            System.out.println("=====================================");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    service.printStuff(t2);
                    break;
                case 2:
                    service.newest(t1, t3);
                    break;
                case 3:
                    service.countryOfTheSmallest(t1, t2, t3);
                    break;
                case 4:
                    service.noSportTaxis(taxis);
                    break;
                case 5:
                    service.sportLongRunnerTaxis(taxis);
                    break;
                case 6:
                    service.minimalWeight(taxis);
                    break;
                case 7:
                    service.minimalCost(taxis);
                    break;
                case 8:
                    service.fromOldestToNewest(taxis);
                    break;
                case 9:
                    b = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
