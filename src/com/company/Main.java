package com.company;
import com.company.project.*;
import com.company.project.menus.Menu;
import com.company.project.supportEquipment.*;

import java.awt.*;
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
                    Animatronic[] anims1 = new Animatronic[a1];
                    System.out.println("How many arcade games do you want to enter");
                    int g1 = sc.nextInt();
                    ArcadeGame[] games1 = new ArcadeGame[g1];
                    System.out.println("How many computers do you want to enter");
                    int c1 = sc.nextInt();
                    Computer[] comps1 = new Computer[c1];
                    System.out.println("How many lights do you want to enter");
                    int l1 = sc.nextInt();
                    Light[] lights1 = new Light[l1];
                    System.out.println("How many speakers games do you want to enter");
                    int s1 = sc.nextInt();
                    Speaker[] speakers1 = new Speaker[s1];

                    for (int j = 0; j < a1; j++){
                        anims1[j] = AnimatronicService.create();
                    }

                    for (int j = 0; j < g1; j++){
                        games1[j] = ArcadeGameService.create();
                    }

                    for (int j = 0; j < c1; j++){
                        comps1[j] = ComputerService.create();
                    }

                    for (int j = 0; j < l1; j++){
                        lights1[j] = LightService.create();
                    }

                    for (int j = 0; j < s1; j++){
                        speakers1[j] = SpeakerService.create();
                    }
                    Menu.run(anims1, games1, comps1, lights1, speakers1);
                    break;
                case 2:
                    String[] a = FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\animatronics.txt");
                    String[] g = FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\arcadegames.txt");
                    String[] c = FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\computers.txt");
                    String[] l = FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\lights.txt");
                    String[] s = FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project\\info\\speakers.txt");

                    Animatronic[] anims = AnimatronicService.convert(a);
                    ArcadeGame[] games = ArcadeGameService.convert(g);
                    Computer[] comps = ComputerService.convert(c);
                    Light[] lights = LightService.convert(l);
                    Speaker[] speakers = SpeakerService.convert(s);
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
