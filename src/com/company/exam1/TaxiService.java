package com.company.exam1;
import com.company.exam1.Taxi;

import java.util.Scanner;

public class TaxiService {
    public Taxi create(Taxi taxi){
        Scanner sc = new Scanner(System.in);
        int e = 1;

        for (int i = 0; i < e; i++){
            System.out.println("Enter taxi name");
            String name = sc.next();
            if (name == ""){
                System.out.println("Wrong input! Try again");
                e++;
                continue;
            }
            taxi.setName(name);
        }
        e = 1;

        for (int i = 0; i < e; i++){
            System.out.println("Enter taxi country");
            String country = sc.next();
            if (country == ""){
                System.out.println("Wrong input! Try again");
                e++;
                continue;
            }
            taxi.setCountry(country);
        }
        e = 1;

        for (int i = 0; i < e; i++){
            System.out.println("Enter taxi year of production");
            int year = sc.nextInt();
            if (year < 1903 || year > 2020){
                System.out.println("Wrong input! Try again");
                e++;
                continue;
            }
            taxi.setYear(year);
        }
        e = 1;

        for (int i = 0; i < e; i++){
            System.out.println("Enter taxi milage");
            int milage = sc.nextInt();
            if (milage < 0 || milage > 999999){
                System.out.println("Wrong input! Try again");
                e++;
                continue;
            }
            taxi.setMilage(milage);
        }
        e = 1;

        for (int i = 0; i < e; i++){
            System.out.println("Is the taxi a sport car or no? y/n");
            String sport = sc.next();
            if (sport.charAt(0) != 'y' && sport.charAt(0) != 'n'){
                System.out.println("Wrong input! Try again");
                e++;
                continue;
            }
            if (sport.charAt(0) == 'y') {
                taxi.setSport(true);
            }
            else{
                taxi.setSport(false);
            }
        }
        e = 1;

        for (int i = 0; i < e; i++){
            System.out.println("Enter taxi weight");
            int weight = sc.nextInt();
            if (weight < 1000 || weight > 3000){
                System.out.println("Wrong input! Try again");
                e++;
                continue;
            }
            taxi.setWeight(weight);
        }
        e = 1;

        for (int i = 0; i < e; i++){
            System.out.println("Enter taxi top speed");
            int topSpeed = sc.nextInt();
            if (topSpeed < 0){
                System.out.println("Wrong input! Try again");
                e++;
                continue;
            }
            taxi.setTopSpeed(topSpeed);
        }
        e = 1;

        for (int i = 0; i < e; i++){
            System.out.println("Enter taxi number of seats");
            int number = sc.nextInt();
            if (number < 0){
                System.out.println("Wrong input! Try again");
                e++;
                continue;
            }
            taxi.setNumberOfSeats(number);
        }
        e = 1;

        for (int i = 0; i < e; i++){
            System.out.println("Enter taxi cost");
            double cost = sc.nextDouble();
            if (cost < 0){
                System.out.println("Wrong input! Try again");
                e++;
                continue;
            }
            taxi.setCost(cost);
        }
        return taxi;
    }

    public void printStuff(Taxi taxi){
        if (taxi.isSport()){
            System.out.println("cost: " + taxi.getCost());
            System.out.println("top speed: " + taxi.getTopSpeed());
        }
        else {
            System.out.println("model: " + taxi.getName());
            System.out.println("country: " + taxi.getCountry());
        }
    }

    public Taxi newest(Taxi t1, Taxi t2){
        if (t1.getYear() >= t2.getYear()){
            System.out.println("The newest from the two: " + t1.getName());
            return t1;
        }
        System.out.println("The newest from the two: " + t2.getName());
        return t2;
    }

    public void countryOfTheSmallest(Taxi t1, Taxi t2, Taxi t3){
        if (t1.getNumberOfSeats() < t2.getNumberOfSeats() && t1.getNumberOfSeats() < t3.getNumberOfSeats()){
            System.out.println(t1.getCountry());
        }
        else if(t2.getNumberOfSeats() < t3.getNumberOfSeats()){
            System.out.println(t2.getCountry());
        }
        else{
            System.out.println(t3.getCountry());
        }
    }

    public void noSportTaxis(Taxi[] taxis){
        for (int i = 0; i < taxis.length; i++){
            if (!(taxis[i].isSport())){
                taxis[i].info();
            }
        }
    }

    public void sportLongRunnerTaxis(Taxi[] taxis){
        for (int i = 0; i < taxis.length; i++){
            if (taxis[i].isSport() && taxis[i].getMilage() > 50000){
                taxis[i].info();
            }
        }
    }

    public Taxi minimalWeight(Taxi[] taxis){
        Taxi minimal = taxis[0];
        for (int i = 1; i < taxis.length; i++){
            if (minimal.getWeight() >= taxis[i].getWeight()){
                minimal = taxis[i];
            }
        }
        System.out.println("taxi with minimal weight: " + minimal.getName());
        return minimal;
    }

    public Taxi minimalCost(Taxi[] taxis){
        Taxi minimal = null;
        for (int i = 0; i < taxis.length; i++){
            if (taxis[i].isSport()){
                if (minimal == null){
                    minimal = taxis[i];
                    continue;
                }
                if (minimal.getCost() > taxis[i].getCost()) {
                    minimal = taxis[i];
                }
            }
        }
        System.out.println("taxi with minimal cost: " + minimal.getName());
        return minimal;
    }

    public void fromOldestToNewest(Taxi[] taxis){
            int x = 0;
            boolean b = true;
            while(b){
                b = false;
                for (int i = 0; i < taxis.length - 1 - x; i++){
                    if (taxis[i].getYear() > taxis[i+1].getYear()){
                        Taxi z = taxis[i];
                        taxis[i] = taxis[i+1];
                        taxis[i+1] = z;
                        b = true;
                    }
                }
                x++;
            }
            for (Taxi i: taxis){
                i.info();
            }
        }
    }
