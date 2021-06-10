package com.company;
import com.company.project.*;
import com.company.project.menus.Menu;
import com.company.project.supportEquipment.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        while (b){
            System.out.println("Choose action");
            System.out.println("1. enter the values");
            System.out.println("2. Use default values");
            System.out.println("3. Exit");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("How many animatronics do you want to enter");
                    int a1 = sc.nextInt();
                    ArrayList<Animatronic> anims1 = new ArrayList<>();
                    System.out.println("How many arcade games do you want to enter");
                    int g1 = sc.nextInt();
                    ArrayList<ArcadeGame> games1 = new ArrayList<>();
                    System.out.println("How many computers do you want to enter");
                    int c1 = sc.nextInt();
                    ArrayList<Computer> comps1 = new ArrayList<>();
                    System.out.println("How many lights do you want to enter");
                    int l1 = sc.nextInt();
                    ArrayList<Light> lights1 = new ArrayList<>();
                    System.out.println("How many speakers games do you want to enter");
                    int s1 = sc.nextInt();
                    ArrayList<Speaker> speakers1 = new ArrayList<>();

                    for (int j = 0; j < a1; j++){
                        anims1.add(AnimatronicService.create());
                    }

                    for (int j = 0; j < g1; j++){
                        games1.add(ArcadeGameService.create());
                    }

                    for (int j = 0; j < c1; j++){
                        comps1.add(ComputerService.create());
                    }

                    for (int j = 0; j < l1; j++){
                        lights1.add(LightService.create());
                    }

                    for (int j = 0; j < s1; j++){
                        speakers1.add(SpeakerService.create());
                    }
                    Menu.run(anims1, games1, comps1, lights1, speakers1);
                    break;
                case 2:
                    ArrayList<String> a = (ArrayList<String>) FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\animatronics.txt");
                    ArrayList<String> g = (ArrayList<String>) FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\arcadegames.txt");
                    ArrayList<String> c = (ArrayList<String>) FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\computers.txt");
                    ArrayList<String> l = (ArrayList<String>) FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\lights.txt");
                    ArrayList<String> s = (ArrayList<String>) FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\speakers.txt");

                    ArrayList<Animatronic> anims = AnimatronicService.convert(a);
                    ArrayList<ArcadeGame> games = ArcadeGameService.convert(g);
                    ArrayList<Computer> comps = ComputerService.convert(c);
                    ArrayList<Light> lights = LightService.convert(l);
                    ArrayList<Speaker> speakers = SpeakerService.convert(s);
                    Menu.run(anims, games, comps, lights, speakers);
                    break;
                case 3:
                    b = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
