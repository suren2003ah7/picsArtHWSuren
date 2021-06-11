package com.company.advancedLesson1;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
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

    public static void serializeXML(User user){
        try {
            FileOutputStream fos = new FileOutputStream("info.xml");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            XMLEncoder x = new XMLEncoder(oos);
            x.writeObject(user);
            x.close();
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static User deserializeXML(){
        User temp = null;
        try {
            FileInputStream fis = new FileInputStream("info.xml");
            ObjectInputStream ois = new ObjectInputStream(fis);
            XMLDecoder x = new XMLDecoder(ois);
            temp = (User) x.readObject();
            x.close();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }
}
