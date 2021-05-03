package com.company.project.supportEquipment;
import java.util.Scanner;

public class ComputerService {
    public static Computer create(){
        Scanner sc = new Scanner(System.in);
        Computer c = new Computer();

        System.out.println("Enter the name of the computer");
        String name = sc.next();
        c.setName(name);

        System.out.println("Enter the condition of the computer (out of order, bad, normal, good, new)");
        String condition = sc.next();
        c.setCondition(condition);

        System.out.println("Enter the production year of the computer");
        int year = sc.nextInt();
        c.setYear(year);

        System.out.println("Enter the weight of the computer");
        double weight = sc.nextDouble();
        c.setWeight(weight);

        System.out.println("Enter the serial code of the computer (2 letters at the front and 2 numbers at the back)");
        String serialCode = sc.next();
        c.setSerialCode(serialCode);

        System.out.println("Enter the HDD memory of the computer");
        int memory = sc.nextInt();
        c.setMemory(memory);

        System.out.println("Enter the RAM of the computer");
        int RAM = sc.nextInt();
        c.setRAM(RAM);

        System.out.println("Enter the monitor length of the computer");
        double monitorLength = sc.nextDouble();
        c.setMonitorLength(monitorLength);

        System.out.println("Enter the monitor width of the computer");
        double monitorWidth = sc.nextDouble();
        c.setMonitorWidth(monitorWidth);

        return c;
    }

    public static Computer[] convert(String[] s){
        Computer[] comps = new Computer[s.length];
        for (int i = 0; i < s.length; i++){
            String[] temp_string = s[i].split(",");
            Computer temp = new Computer();
            temp.setName(temp_string[0]);
            temp.setCondition(temp_string[1]);
            temp.setYear(Integer.parseInt(temp_string[2]));
            temp.setWeight(Double.parseDouble(temp_string[3]));
            temp.setSerialCode(temp_string[4]);
            temp.setMemory(Integer.parseInt(temp_string[5]));
            temp.setRAM(Integer.parseInt(temp_string[6]));
            temp.setMonitorWidth(Double.parseDouble(temp_string[7]));
            temp.setMonitorLength(Double.parseDouble(temp_string[8]));
            comps[i] = temp;
        }
        return comps;
    }

    public static void printAllComputers(Computer[] comps){
        if (comps == null || comps.length == 0){
            System.out.println("There are no computers");
            return;
        }
        for (int i = 0; i < comps.length; i++){
            comps[i].info();
        }
    }

    public static void turnAllOn(Computer[] comps){
        if (comps == null || comps.length == 0){
            System.out.println("There are no computers");
            return;
        }
        for (int i = 0; i < comps.length; i++){
            comps[i].turnOn();
        }
    }

    public static void turnAllOff(Computer[] comps){
        if (comps == null || comps.length == 0){
            System.out.println("There are no computers");
            return;
        }
        for (int i = 0; i < comps.length; i++){
            comps[i].turnOff();
        }
    }
}
