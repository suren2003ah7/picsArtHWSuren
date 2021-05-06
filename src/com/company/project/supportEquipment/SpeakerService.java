package com.company.project.supportEquipment;

import java.util.ArrayList;
import java.util.Scanner;

public class SpeakerService {
    public static Speaker create(){
        Scanner sc = new Scanner(System.in);
        Speaker s = new Speaker();

        System.out.println("Enter the name of the speaker");
        String name = sc.nextLine();
        s.setName(name);

        System.out.println("Enter the condition of the speaker (out of order, bad, normal, good, new)");
        String condition = sc.next();
        s.setCondition(condition);

        System.out.println("Enter the production year of the speaker");
        int year = sc.nextInt();
        s.setYear(year);

        System.out.println("Enter the weight of the speaker");
        double weight = sc.nextDouble();
        s.setWeight(weight);

        System.out.println("Enter the serial code of the speaker (2 letters at the front and 2 numbers at the back)");
        String serialCode = sc.next();
        s.setSerialCode(serialCode);

        System.out.println("Enter the loudness year of the speaker");
        int loudness = sc.nextInt();
        s.setLoudness(loudness);

        return s;
    }

    public static ArrayList<Speaker> convert(ArrayList<String> s){
        ArrayList<Speaker> speakers = new ArrayList<>();
        for (int i = 0; i < s.size(); i++){
            String[] temp_string = s.get(i).split(",");
            Speaker temp = new Speaker();
            temp.setName(temp_string[0]);
            temp.setCondition(temp_string[1]);
            temp.setYear(Integer.parseInt(temp_string[2]));
            temp.setWeight(Double.parseDouble(temp_string[3]));
            temp.setSerialCode(temp_string[4]);
            temp.setLoudness(Integer.parseInt(temp_string[5]));
            speakers.add(temp);
        }
        return speakers;
    }
    public static void printAllInfo(ArrayList<Speaker> speakers){
        if (speakers == null || speakers.size() == 0){
            System.out.println("There are no speakers");
            return;
        }
        for (int i = 0; i < speakers.size(); i++){
            speakers.get(i).info();
        }
    }

    public static void turnAllOn(ArrayList<Speaker> speakers){
        if (speakers == null || speakers.size() == 0){
            System.out.println("There are no speakers");
            return;
        }
        for (int i = 0; i < speakers.size(); i++){
            speakers.get(i).turnOn();
        }
    }

    public static void turnAllOff(ArrayList<Speaker> speakers){
        if (speakers == null || speakers.size() == 0){
            System.out.println("There are no speakers");
            return;
        }
        for (int i = 0; i < speakers.size(); i++){
            speakers.get(i).turnOff();
        }
    }

    public static void playAllMusic(ArrayList<Speaker> speakers){
        if (speakers == null || speakers.size() == 0){
            System.out.println("There are no speakers");
            return;
        }
        for (int i = 0; i < speakers.size(); i++){
            speakers.get(i).playMusic();
        }
    }
}
