package com.company.project;
import com.company.project.games.NumberGuesser;
import com.company.project.games.SuperMario;
import com.company.project.games.Trivia;
import java.util.Scanner;

public class ArcadeGameService {
    public static ArcadeGame create(){
        Scanner sc = new Scanner(System.in);
        ArcadeGame game;
        System.out.println("What type of arcade game you want?");
        String type = sc.next();
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
        String name = sc.next();
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

    public static ArcadeGame[] convert(String[] s){
        ArcadeGame[] games = new ArcadeGame[s.length];
        for (int i = 0; i < s.length; i++){
            String[] temp_string = s[i].split(",");
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
            games[i] = temp_game;
        }
        return games;
    }

    public static void printAllGames(ArcadeGame[] games){
        if (games == null || games.length == 0){
            System.out.println("There are no games");
            return;
        }
        for (int i = 0; i < games.length; i++){
            games[i].info();
        }
    }

    public static void turnAllOn(ArcadeGame[] games){
        if (games == null || games.length == 0){
            System.out.println("There are no games");
            return;
        }
        for (int i = 0; i < games.length; i++){
            games[i].turnOn();
        }
    }

    public static void turnAllOff(ArcadeGame[] games){
        if (games == null || games.length == 0){
            System.out.println("There are no games");
            return;
        }
        for (int i = 0; i < games.length; i++){
            games[i].turnOff();
        }
    }

    public static void playAll(ArcadeGame[] games){
        if (games == null || games.length == 0){
            System.out.println("There are no games");
            return;
        }
        for (int i = 0; i < games.length; i++){
            games[i].play();
        }
    }

    public static void printHighest(ArcadeGame[] games){
        if (games == null || games.length == 0){
            System.out.println("There are no games");
            return;
        }
        ArcadeGame arc = games[0];
        for (int i = 1; i < games.length; i++){
            if (arc.getHighScore() < games[i].getHighScore()){
                ArcadeGame temp = arc;
                arc = games[i];
                games[i] = temp;
            }
        }
        arc.info();
    }
}
