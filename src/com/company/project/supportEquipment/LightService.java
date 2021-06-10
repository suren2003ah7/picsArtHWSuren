package com.company.project.supportEquipment;

import com.company.project.ArcadeGame;

import java.util.ArrayList;
import java.util.Scanner;

public class LightService {
    public static Light create(){
        Scanner sc = new Scanner(System.in);
        Light l = new Light();

        System.out.println("Enter the name of the light");
        String name = sc.nextLine();
        l.setName(name);

        System.out.println("Enter the condition of the light (out of order, bad, normal, good, new)");
        String condition = sc.next();
        l.setCondition(condition);

        System.out.println("Enter the production year of the light");
        int year = sc.nextInt();
        l.setYear(year);

        System.out.println("Enter the weight of the light");
        double weight = sc.nextDouble();
        l.setWeight(weight);

        System.out.println("Enter the serial code of the light (2 letters at the front and 2 numbers at the back)");
        String serialCode = sc.next();
        l.setSerialCode(serialCode);

        System.out.println("Enter the color of the light");
        String lightColor = sc.next();
        l.setLightColor(lightColor);

        return l;
    }

    public static ArrayList<Light> convert(ArrayList<String> s){
        ArrayList<Light> lights = new ArrayList<>();
        for (int i = 0; i < s.size(); i++){
            String[] temp_string = s.get(i).split(",");
            Light temp = new Light();
            temp.setName(temp_string[0]);
            temp.setCondition(temp_string[1]);
            temp.setYear(Integer.parseInt(temp_string[2]));
            temp.setWeight(Double.parseDouble(temp_string[3]));
            temp.setSerialCode(temp_string[4]);
            temp.setLightColor(temp_string[5]);
            lights.add(temp);
        }
        return lights;
    }

    public static void printAllInfo(ArrayList<Light> lights){
        if (lights == null || lights.size() == 0){
            System.out.println("There are no lights");
            return;
        }
        for (int i = 0; i < lights.size(); i++){
            lights.get(i).info();
        }
    }

    public static void turnAllOn(ArrayList<Light> lights){
        if (lights == null || lights.size() == 0){
            System.out.println("There are no lights");
            return;
        }
        for (int i = 0; i < lights.size(); i++){
            lights.get(i).turnOn();
        }
    }

    public static void turnAllOff(ArrayList<Light> lights){
        if (lights == null || lights.size() == 0){
            System.out.println("There are no lights");
            return;
        }
        for (int i = 0; i < lights.size(); i++){
            lights.get(i).turnOff();
        }
    }

    public static void printAllColourLights(ArrayList<Light> lights, String color){
        for (int i = 0; i < lights.size(); i++){
            if (lights.get(i).getLightColor().equals(color)){
                lights.get(i).info();
            }
        }
    }

    public static void sortFromOldestToNewest(ArrayList<Light> lights){
        int x = 0;
        boolean b = true;
        while(b){
            b = false;
            for (int i = 0; i < lights.size() - 1 - x; i++){
                if (lights.get(i).getYear() > lights.get(i + 1).getYear()){
                    Light z = lights.get(i);
                    lights.set(i, lights.get(i + 1));
                    lights.set(i + 1, z);
                    b = true;
                }
            }
            x++;
        }
        printAllInfo(lights);
    }
}
