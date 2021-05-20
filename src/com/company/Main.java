package com.company;

import com.company.project2.Action;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        while (b){
            System.out.println("Choose");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    Action.register();
                    break;
                case 2:
                    String[] user = Action.login();
                    if (user.length == 0){
                        break;
                    }
                    else{
                        boolean bb = true;
                        while (bb){
                            System.out.println("You are logged in as " + user[1]);
                            System.out.println("Choose");
                            System.out.println("1. Print Info");
                            System.out.println("2. Exit");
                            int i1 = sc.nextInt();
                            switch (i1){
                                case 1:
                                    System.out.println("Full Name: " + user[0]);
                                    System.out.println("Email: " + user[2]);
                                    break;
                                case 2:
                                    bb =  false;
                                    break;
                                default:
                                    System.out.println("Wrong input!");
                                    break;
                            }
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
// HelloWorld420#