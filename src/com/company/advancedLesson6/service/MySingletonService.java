package com.company.advancedLesson6.service;

import com.company.advancedLesson6.model.MySingleton;

import java.io.*;

public class MySingletonService {
    public static void serialize(MySingleton mysing){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("singleton");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(mysing);
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

    public static MySingleton deserialize(){
        MySingleton mysing = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("singleton");
            ois = new ObjectInputStream(fis);
            mysing = (MySingleton) ois.readObject();
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
        return mysing;
    }
}
