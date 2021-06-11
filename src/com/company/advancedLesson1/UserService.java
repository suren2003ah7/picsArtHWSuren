package com.company.advancedLesson1;

import java.io.*;

public class UserService {

    public static void serializeUser(User user){
        try {
            FileOutputStream fos = new FileOutputStream("user");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static User deserializeUser(){
        User user = null;
        try {
            FileInputStream fis = new FileInputStream("user");
            ObjectInputStream ois = new ObjectInputStream(fis);
            user = (User) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
