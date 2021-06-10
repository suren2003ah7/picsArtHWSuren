package com.company.project;
import com.company.project.games.NumberGuesser;
import com.company.project.games.SuperMario;
import com.company.project.games.Trivia;

import java.util.ArrayList;
import java.util.Scanner;

public class ArcadeGameService {
    public static ArcadeGame create(){
        Scanner sc = new Scanner(System.in);
        ArcadeGame game;
        System.out.println("What type of arcade game you want?");
        String type = sc.nextLine();
        if (type.equals("number guesser")){
            game = new NumberGuesser();
        }
        else if(type.equals("super mario")){
            game = new SuperMario();
        }
        else if(type.equals("trivia")){
            game = new Trivia();
        }
        else{
            System.out.println("No such game available!");
            return null;
        }

        System.out.println("Enter the name of the arcade game");
        String name = sc.nextLine();
        game.setName(name);

        System.out.println("Enter the condition of the arcade game (out of order, bad, normal, good, new)");
        String condition = sc.next();
        game.setCondition(condition);

        System.out.println("Enter the production year of the arcade game");
        int year = sc.nextInt();
        game.setYear(year);

        System.out.println("Enter the weight of the arcade game");
        double weight = sc.nextDouble();
        game.setWeight(weight);

        System.out.println("Enter the serial code of the arcade game (2 letters at the front and 2 numbers at the back)");
        String serialCode = sc.next();
        game.setSerialCode(serialCode);

        System.out.println("Enter the high score of the arcade game");
        int highScore = sc.nextInt();
        game.setHighScore(highScore);

        return game;
    }

    public static ArrayList<ArcadeGame> convert(ArrayList<String> s){
        ArrayList<ArcadeGame> games = new ArrayList<>();
        for (int i = 0; i < s.size(); i++){
            String[] temp_string = s.get(i).split(",");
            ArcadeGame temp_game;
            if (temp_string[0].equals("number guesser")){
                temp_game = new NumberGuesser();
            }
            else if (temp_string[0].equals("super mario")){
                temp_game = new SuperMario();
            }
            else if (temp_string[0].equals("trivia")){
                temp_game = new Trivia();
            }
            else{
                System.out.println("Input is wrong!");
                return null;
            }
            temp_game.setName(temp_string[1]);
            temp_game.setCondition(temp_string[2]);
            temp_game.setYear(Integer.parseInt(temp_string[3]));
            temp_game.setWeight(Double.parseDouble(temp_string[4]));
            temp_game.setSerialCode(temp_string[5]);
            temp_game.setHighScore(Integer.parseInt(temp_string[6]));
            games.add(temp_game);
        }
        return games;
    }

    public static void printAllGames(ArrayList<ArcadeGame> games){
        if (games == null || games.size() == 0){
            System.out.println("There are no games");
            return;
        }
        for (int i = 0; i < games.size(); i++){
            games.get(i).info();
        }
    }

    public static void turnAllOn(ArrayList<ArcadeGame> games){
        if (games == null || games.size() == 0){
            System.out.println("There are no games");
            return;
        }
        for (int i = 0; i < games.size(); i++){
            games.get(i).turnOn();
        }
    }

    public static void turnAllOff(ArrayList<ArcadeGame> games){
        if (games == null || games.size() == 0){
            System.out.println("There are no games");
            return;
        }
        for (int i = 0; i < games.size(); i++){
            games.get(i).turnOff();
        }
    }

    public static void playAll(ArrayList<ArcadeGame> games){
        if (games == null || games.size() == 0){
            System.out.println("There are no games");
            return;
        }
        for (int i = 0; i < games.size(); i++){
            games.get(i).play();
        }
    }

    public static void printHighest(ArrayList<ArcadeGame> games){
        if (games == null || games.size() == 0){
            System.out.println("There are no games");
            return;
        }
        ArcadeGame arc = games.get(0);
        for (int i = 1; i < games.size(); i++){
            if (arc.getHighScore() < games.get(i).getHighScore()){
                ArcadeGame temp = arc;
                arc = games.get(i);
                games.set(i, temp);
            }
        }
        arc.info();
    }

    public static void sortFromOldestToNewest(ArrayList<ArcadeGame> games){
        int x = 0;
        boolean b = true;
        while(b){
            b = false;
            for (int i = 0; i < games.size() - 1 - x; i++){
                if (games.get(i).getYear() > games.get(i + 1).getYear()){
                    ArcadeGame z = games.get(i);
                    games.set(i, games.get(i + 1));
                    games.set(i + 1, z);
                    b = true;
                }
            }
            x++;
        }
        printAllGames(games);
    }
}
