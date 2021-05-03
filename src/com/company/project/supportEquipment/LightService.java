package com.company.project.supportEquipment;

import java.util.Scanner;

public class LightService {
    public static Light create(){
        Scanner sc = new Scanner(System.in);
        Light l = new Light();

        System.out.println("Enter the name of the light");
        String name = sc.next();
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

    public static Light[] convert(String[] s){
        Light[] lights = new Light[s.length];
        for (int i = 0; i < s.length; i++){
            String[] temp_string = s[i].split(",");
            Light temp = new Light();
            temp.setName(temp_string[0]);
            temp.setCondition(temp_string[1]);
            temp.setYear(Integer.parseInt(temp_string[2]));
            temp.setWeight(Double.parseDouble(temp_string[3]));
            temp.setSerialCode(temp_string[4]);
            temp.setLightColor(temp_string[5]);
            lights[i] = temp;
        }
        return lights;
    }

    public static void printAllInfo(Light[] lights){
        if (lights == null || lights.length == 0){
            System.out.println("There are no lights");
            return;
        }
        for (int i = 0; i < lights.length; i++){
            lights[i].info();
        }
    }

    public static void turnAllOn(Light[] lights){
        if (lights == null || lights.length == 0){
            System.out.println("There are no lights");
            return;
        }
        for (int i = 0; i < lights.length; i++){
            lights[i].turnOn();
        }
    }

    public static void turnAllOff(Light[] lights){
        if (lights == null || lights.length == 0){
            System.out.println("There are no lights");
            return;
        }
        for (int i = 0; i < lights.length; i++){
            lights[i].turnOff();
        }
    }
}
