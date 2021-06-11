package com.company.advancedLesson1.test;

import com.company.advancedLesson1.model.User;
import com.company.advancedLesson1.service.UserService;
import com.google.gson.Gson;

public class UserServiceTest {
    public static void doSerialize(){
        User user = new User("Suram",54);
        UserService.serializeUser(user);
    }

    public static void doDeSerialize(){
        User user = UserService.deserializeUser();
        System.out.println(user);
    }

    public static String doGsonSerialize(){
        User user = new User("Suram",54);
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
        return json;
    }

    public static void doGsonDeserialize(String json){
        Gson gson = new Gson();
        User user3 = gson.fromJson(json, User.class);
        System.out.println(user3);
    }

    public static void doXMLSerialize(){
        User user = new User("Suram", 54);
        UserService.serializeXML(user);
    }

    public static void doXMLDeserialize(){
        User user4 = UserService.deserializeXML();
        System.out.println(user4);
    }
}
