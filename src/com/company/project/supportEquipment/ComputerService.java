package com.company.project.supportEquipment;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerService {
    public static Computer create(){
        Scanner sc = new Scanner(System.in);
        Computer c = new Computer();

        System.out.println("Enter the name of the computer");
        String name = sc.nextLine();
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

    public static ArrayList<Computer> convert(ArrayList<String> s){
        ArrayList<Computer> comps = new ArrayList<>();
        for (int i = 0; i < s.size(); i++){
            String[] temp_string = s.get(i).split(",");
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
            comps.add(temp);
        }
        return comps;
    }

    public static void printAllComputers(ArrayList<Computer> comps){
        if (comps == null || comps.size() == 0){
            System.out.println("There are no computers");
            return;
        }
        for (int i = 0; i < comps.size(); i++){
            comps.get(i).info();
        }
    }

    public static void turnAllOn(ArrayList<Computer> comps){
        if (comps == null || comps.size() == 0){
            System.out.println("There are no computers");
            return;
        }
        for (int i = 0; i < comps.size(); i++){
            comps.get(i).turnOn();
        }
    }

    public static void turnAllOff(ArrayList<Computer> comps){
        if (comps == null || comps.size() == 0){
            System.out.println("There are no computers");
            return;
        }
        for (int i = 0; i < comps.size(); i++){
            comps.get(i).turnOff();
        }
    }
}
