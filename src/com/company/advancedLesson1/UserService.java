package com.company.advancedLesson1;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class UserService {

    public static void serializeUser(User user){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("user");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (oos != null)
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static User deserializeUser(){
        User user = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("user");
            ois = new ObjectInputStream(fis);
            user = (User) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (ois != null)
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
