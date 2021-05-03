package com.company;
import com.company.project.*;
import com.company.project.games.NumberGuesser;
import com.company.project.games.SuperMario;
import com.company.project.games.Trivia;
import com.company.project.supportEquipment.*;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

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
                    boolean bb1 = true;
                    while (bb1){
                        System.out.println("Choose the category");
                        System.out.println("1. Animatronics");
                        System.out.println("2. Arcade Games");
                        System.out.println("3. Computers");
                        System.out.println("4. Lights");
                        System.out.println("5. Speakers");
                        System.out.println("6. Go back");
                        int j = sc.nextInt();
                        boolean bbb = true;
                        switch (j){
                            case 1:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all animatronics");
                                    System.out.println("2. Turn all animatronics on");
                                    System.out.println("3. Turn all animatronics off");
                                    System.out.println("4. Animatronic test concert");
                                    System.out.println("5. View all bears");
                                    System.out.println("6. View all rabbits");
                                    System.out.println("7. View all chickens");
                                    System.out.println("8. View all foxes");
                                    System.out.println("9. Go Back");
                                    int k = sc.nextInt();
                                    switch (k){
                                        case 1:
                                            try{
                                                AnimatronicService.printAllInfo(anims1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 2:
                                            try{
                                                AnimatronicService.turnAllOn(anims1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 3:
                                            try {
                                                AnimatronicService.turnAllOff(anims1);
                                            }
                                            catch(NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 4:
                                            try{
                                                AnimatronicService.concert(anims1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 5:
                                            try{
                                                AnimatronicService.viewAllBears(anims1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 6:
                                            try{
                                                AnimatronicService.viewAllRabbits(anims1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 7:
                                            try{
                                                AnimatronicService.viewAllChickens(anims1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 8:
                                            try{
                                                AnimatronicService.viewAllFoxes(anims1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 9:
                                            bbb = false;
                                            break;
                                        default:
                                            System.out.println("Wrong input!");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all arcade games");
                                    System.out.println("2. Turn on all arcade games");
                                    System.out.println("3. Turn off all arcade games");
                                    System.out.println("4. Play all arcade games");
                                    System.out.println("5. Print the arcade game with the highest high score");
                                    System.out.println("6. Go Back");
                                    int k = sc.nextInt();
                                    switch (k){
                                        case 1:
                                            try{
                                                ArcadeGameService.printAllGames(games1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 2:
                                            try{
                                                ArcadeGameService.turnAllOn(games1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 3:
                                            try{
                                                ArcadeGameService.turnAllOff(games1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 4:
                                            try{
                                                ArcadeGameService.playAll(games1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 5:
                                            try{
                                                ArcadeGameService.printHighest(games1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 6:
                                            bbb = false;
                                            break;
                                        default:
                                            System.out.println("Wrong input!");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all computers");
                                    System.out.println("2. Turn on all the computers");
                                    System.out.println("3. Turn off all the computers");
                                    System.out.println("4. View staff info");
                                    System.out.println("5. Go Back");
                                    int k = sc.nextInt();
                                    switch (k){
                                        case 1:
                                            try{
                                                ComputerService.printAllComputers(comps1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 2:
                                            try{
                                                ComputerService.turnAllOn(comps1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 3:
                                            try{
                                                ComputerService.turnAllOff(comps1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 4:
                                            try{
                                                comps1[0].printStaffData();
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 5:
                                            bbb = false;
                                            break;
                                        default:
                                            System.out.println("Wrong input!");
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all lights");
                                    System.out.println("2. Turn on all the lights");
                                    System.out.println("3. Turn off all the lights");
                                    System.out.println("4. Go back");
                                    int k = sc.nextInt();
                                    switch (k){
                                        case 1:
                                            try{
                                                LightService.printAllInfo(lights1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 2:
                                            try{
                                                LightService.turnAllOn(lights1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 3:
                                            try{
                                                LightService.turnAllOff(lights1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 4:
                                            bbb = false;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 5:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all speakers");
                                    System.out.println("2. Turn on all the speakers");
                                    System.out.println("3. Turn off all the speakers");
                                    System.out.println("4. Play music");
                                    System.out.println("5. Go back");
                                    int k = sc.nextInt();
                                    switch (k){
                                        case 1:
                                            try{
                                                SpeakerService.printAllInfo(speakers1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 2:
                                            try{
                                                SpeakerService.turnAllOn(speakers1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 3:
                                            try{
                                                SpeakerService.turnAllOff(speakers1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 4:
                                            try{
                                                SpeakerService.playAllMusic(speakers1);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 5:
                                            bbb = false;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 6:
                                bb1 = false;
                                break;
                            default:
                                System.out.println("Wrong input!");
                                break;
                        }
                    }
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
                    boolean bb = true;
                    while (bb){
                        System.out.println("Choose the category");
                        System.out.println("1. Animatronics");
                        System.out.println("2. Arcade Games");
                        System.out.println("3. Computers");
                        System.out.println("4. Lights");
                        System.out.println("5. Speakers");
                        System.out.println("6. Go back");
                        int j = sc.nextInt();
                        boolean bbb = true;
                        switch (j){
                            case 1:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all animatronics");
                                    System.out.println("2. Turn all animatronics on");
                                    System.out.println("3. Turn all animatronics off");
                                    System.out.println("4. Animatronic test concert");
                                    System.out.println("5. View all bears");
                                    System.out.println("6. View all rabbits");
                                    System.out.println("7. View all chickens");
                                    System.out.println("8. View all foxes");
                                    System.out.println("9. Go Back");
                                    int k = sc.nextInt();
                                    switch (k){
                                        case 1:
                                            try{
                                                AnimatronicService.printAllInfo(anims);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 2:
                                            try{
                                                AnimatronicService.turnAllOn(anims);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 3:
                                            try {
                                                AnimatronicService.turnAllOff(anims);
                                            }
                                            catch(NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 4:
                                            try{
                                                AnimatronicService.concert(anims);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 5:
                                            try{
                                                AnimatronicService.viewAllBears(anims);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 6:
                                            try{
                                                AnimatronicService.viewAllRabbits(anims);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 7:
                                            try{
                                                AnimatronicService.viewAllChickens(anims);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 8:
                                            try{
                                                AnimatronicService.viewAllFoxes(anims);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 9:
                                            bbb = false;
                                            break;
                                        default:
                                            System.out.println("Wrong input!");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all arcade games");
                                    System.out.println("2. Turn on all arcade games");
                                    System.out.println("3. Turn off all arcade games");
                                    System.out.println("4. Play all arcade games");
                                    System.out.println("5. Print the arcade game with the highest high score");
                                    System.out.println("6. Go Back");
                                    int k = sc.nextInt();
                                    switch (k){
                                        case 1:
                                            try{
                                                ArcadeGameService.printAllGames(games);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 2:
                                            try{
                                                ArcadeGameService.turnAllOn(games);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 3:
                                            try{
                                                ArcadeGameService.turnAllOff(games);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 4:
                                            try{
                                                ArcadeGameService.playAll(games);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 5:
                                            try{
                                                ArcadeGameService.printHighest(games);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 6:
                                            bbb = false;
                                            break;
                                        default:
                                            System.out.println("Wrong input!");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all computers");
                                    System.out.println("2. Turn on all the computers");
                                    System.out.println("3. Turn off all the computers");
                                    System.out.println("4. View staff info");
                                    System.out.println("5. Go Back");
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
                                                comps[0].printStaffData();
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 5:
                                            bbb = false;
                                            break;
                                        default:
                                            System.out.println("Wrong input!");
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all lights");
                                    System.out.println("2. Turn on all the lights");
                                    System.out.println("3. Turn off all the lights");
                                    System.out.println("4. Go back");
                                    int k = sc.nextInt();
                                    switch (k){
                                        case 1:
                                            try{
                                                LightService.printAllInfo(lights);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 2:
                                            try{
                                                LightService.turnAllOn(lights);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 3:
                                            try{
                                                LightService.turnAllOff(lights);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 4:
                                            bbb = false;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 5:
                                while(bbb){
                                    System.out.println("Choose action");
                                    System.out.println("1. View all speakers");
                                    System.out.println("2. Turn on all the speakers");
                                    System.out.println("3. Turn off all the speakers");
                                    System.out.println("4. Play music");
                                    System.out.println("5. Go back");
                                    int k = sc.nextInt();
                                    switch (k){
                                        case 1:
                                            try{
                                                SpeakerService.printAllInfo(speakers);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 2:
                                            try{
                                                SpeakerService.turnAllOn(speakers);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 3:
                                            try{
                                                SpeakerService.turnAllOff(speakers);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 4:
                                            try{
                                                SpeakerService.playAllMusic(speakers);
                                            }
                                            catch (NullPointerException e){
                                                System.out.println("There are no such entities");
                                            }
                                            break;
                                        case 5:
                                            bbb = false;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 6:
                                bb = false;
                                break;
                            default:
                                System.out.println("Wrong input!");
                                break;
                        }
                    }
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
