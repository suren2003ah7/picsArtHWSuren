package com.company.project;
import com.company.project.animatronics.Bear;
import com.company.project.animatronics.Chicken;
import com.company.project.animatronics.Fox;
import com.company.project.animatronics.Rabbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnimatronicService {
    public static Animatronic create() {
        Scanner sc = new Scanner(System.in);
        Animatronic anim;
        System.out.println("What animal animatronic do you want to create?");
        String animal = sc.next();
        if (animal.equals("bear")) {
            anim = new Bear();
        }
        else if (animal.equals("rabbit")){
            anim = new Rabbit();
        }
        else if (animal.equals("chicken")){
            anim = new Chicken();
        }
        else if (animal.equals("fox")){
            anim = new Fox();
        }
        else {
            System.out.println("No such animal animatronic available!");
            return null;
        }

        System.out.println("Enter the name of the animatronic");
        String name = sc.nextLine();
        anim.setName(name);

        System.out.println("Enter the condition of the animatronic (out of order, bad, normal, good, new)");
        String condition = sc.next();
        anim.setCondition(condition);

        System.out.println("Enter the production year of the animatronic");
        int year = sc.nextInt();
        anim.setYear(year);

        System.out.println("Enter the weight of the animatronic");
        double weight = sc.nextDouble();
        anim.setWeight(weight);

        System.out.println("Enter the serial code of the animatronic (2 letters at the front and 2 numbers at the back)");
        String serialCode = sc.next();
        anim.setSerialCode(serialCode);

        System.out.println("Enter the height of the animatronic");
        double height = sc.nextDouble();
        anim.setHeight(height);

        return anim;
    }

    public static ArrayList<Animatronic> convert(ArrayList<String> s){
        ArrayList<Animatronic> anims = new ArrayList<>();
        for (int i = 0; i < s.size(); i++){
            String[] temp_string = s.get(i).split(",");
            Animatronic temp_anim;
            if (temp_string[0].equals("bear")){
                temp_anim = new Bear();
            }
            else if (temp_string[0].equals("rabbit")){
                temp_anim = new Rabbit();
            }
            else if (temp_string[0].equals("chicken")){
                temp_anim = new Chicken();
            }
            else if (temp_string[0].equals("fox")){
                temp_anim = new Fox();
            }
            else{
                System.out.println("Default input is wrong!");
                return null;
            }
            temp_anim.setAnimal(temp_string[0]);
            temp_anim.setName(temp_string[1]);
            temp_anim.setCondition(temp_string[2]);
            temp_anim.setYear(Integer.parseInt(temp_string[3]));
            temp_anim.setWeight(Double.parseDouble(temp_string[4]));
            temp_anim.setSerialCode(temp_string[5]);
            temp_anim.setHeight(Double.parseDouble(temp_string[6]));
            anims.add(temp_anim);
        }
        return anims;
    }

    public static void printAllInfo(ArrayList<Animatronic> anims){
        if (anims == null || anims.size() == 0){
            System.out.println("There are no animatronics");
            return;
        }
        for (int i = 0; i < anims.size(); i++){
            anims.get(i).info();
            System.out.println();
        }
    }

    public static void turnAllOn(ArrayList<Animatronic> anims){
        if (anims == null || anims.size() == 0){
            System.out.println("There are no animatronics");
            return;
        }
        for (int i = 0; i < anims.size(); i++){
            anims.get(i).turnOn();
        }
    }

    public static void turnAllOff(ArrayList<Animatronic> anims){
        if (anims == null || anims.size() == 0){
            System.out.println("There are no animatronics");
            return;
        }
        for (int i = 0; i < anims.size(); i++){
            anims.get(i).turnOff();
        }
    }

    public static void concert(ArrayList<Animatronic> anims){
        if (anims == null || anims.size() == 0){
            System.out.println("There are no animatronics");
            return;
        }
        for (int i = 0; i < anims.size(); i++){
            anims.get(i).sing();
            anims.get(i).dance();
            if (anims.get(i).getAnimal().equals("bear")){
                Bear temp = (Bear) anims.get(i);
                temp.playMusicBox();
                temp.laugh();
            }
            else if (anims.get(i).getAnimal().equals("rabbit")){
                Rabbit temp = (Rabbit) anims.get(i);
                temp.playGuitar();
            }
            else if (anims.get(i).getAnimal().equals("fox")){
                Fox temp = (Fox) anims.get(i);
                temp.rolePlay();
            }
            else if (anims.get(i).getAnimal().equals("chicken")){
                Chicken temp = (Chicken) anims.get(i);
                temp.deliverCupcake();
            }
        }
    }

    public static void viewAllBears(ArrayList<Animatronic> anims){
        if (anims == null || anims.size() == 0){
            System.out.println("There are no animatronics");
            return;
        }
        for (int i = 0; i < anims.size(); i++){
            if (anims.get(i).getAnimal().equals("bear")){
                anims.get(i).info();
            }
        }
    }

    public static void viewAllRabbits(ArrayList<Animatronic> anims){
        if (anims == null || anims.size() == 0){
            System.out.println("There are no animatronics");
            return;
        }
        for (int i = 0; i < anims.size(); i++){
            if (anims.get(i).getAnimal().equals("rabbit")){
                anims.get(i).info();
            }
        }
    }

    public static void viewAllChickens(ArrayList<Animatronic> anims){
        if (anims == null || anims.size() == 0){
            System.out.println("There are no animatronics");
            return;
        }
        for (int i = 0; i < anims.size(); i++){
            if (anims.get(i).getAnimal().equals("chicken")){
                anims.get(i).info();
            }
        }
    }

    public static void viewAllFoxes(ArrayList<Animatronic> anims){
        if (anims == null || anims.size() == 0){
            System.out.println("There are no animatronics");
            return;
        }
        for (int i = 0; i < anims.size(); i++){
            if (anims.get(i).getAnimal().equals("fox")){
                anims.get(i).info();
            }
        }
    }

    public static void viewHighestAnimatronic(ArrayList<Animatronic> anims){
        Animatronic maximal = anims.get(0);
        for (int i = 1; i < anims.size(); i++){
            if (maximal.getHeight() < anims.get(i).getHeight()){
                Animatronic temp = maximal;
                maximal = anims.get(i);
                anims.set(i, temp);
            }
        }
        maximal.info();
    }

    public static void sortFromOldestToNewest(ArrayList<Animatronic> anims){
        int x = 0;
        boolean b = true;
        while(b){
            b = false;
            for (int i = 0; i < anims.size() - 1 - x; i++){
                if (anims.get(i).getYear() > anims.get(i + 1).getYear()){
                    Animatronic z = anims.get(i);
                    anims.set(i, anims.get(i + 1));
                    anims.set(i + 1, z);
                    b = true;
                }
            }
            x++;
        }
        printAllInfo(anims);
    }
}
