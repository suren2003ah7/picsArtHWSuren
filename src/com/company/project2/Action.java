package com.company.project2;

import java.util.ArrayList;
import java.util.Scanner;

public class Action {
    public static void register(){
        ArrayList<String> users = (ArrayList) FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project2\\database.txt");
        Scanner sc = new Scanner(System.in);
        String fullName;
        String username;
        String email;
        String pass;
            System.out.println("Enter full name");
            fullName = sc.nextLine();
            if (fullName.matches("^\\s*$")){
                System.out.println("Wrong full name input!");
                return;
            }
            System.out.println("Enter username");
            username = sc.next();
            if (username.matches("^\\s*$") || username.length() <= 10){
                System.out.println("Wrong username input!");
                return;
            }
            System.out.println("Enter email");
            email = sc.next();
            if (!(email.matches( "^(.+)@(.+)$"))){
                System.out.println("Email input is not valid");
                return;
            }
            System.out.println("Enter password");
            pass = sc.next();
            String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
            if (!(pass.matches(regex))){
                System.out.println("Wrong password input!");
                System.out.println("password:\n" +
                                   "at least one upper case\n" +
                                   "at least one lower case\n" +
                                   "at least one digit\n" +
                                   "at least one special character @#$%^&-+=()\n" +
                                   "no white spaces\n" +
                                   "length from 8 to 20");
                return;
            }
        pass = MD5(pass);
        for (int i = 0; i < users.size(); i++){
            String[] temp = users.get(i).split(",");
            if (username.equals(temp[1])){
                System.out.println("This username is already taken!");
                return;
            }
            if (email.equals(temp[2])){
                System.out.println("There is already a user with this email!");
                return;
            }
        }
        String all = fullName + "," + username + "," + email + "," + pass + "\n";
        FileService.writeFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project2\\database.txt", all);
    }

    public static String[] login(){
        ArrayList<String> users = (ArrayList) FileService.readFile("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\project2\\database.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();

        System.out.println("Enter password");
        String pass = sc.next();
        pass = MD5(pass);

        for (int i = 0; i < users.size(); i++){
            String[] temp = users.get(i).split(",");
            if (username.equals(temp[1]) && pass.equals(temp[3])){
                System.out.println("You successfully logged in");
                return temp;
            }
        }
        System.out.println("Invalid username or password!");
        return new String[]{};
    }

    public static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
}
