package com.company;
import com.company.advancedLesson1.User;
import com.company.advancedLesson1.UserService;
import com.google.gson.Gson;

public class Main {
    public static void main(String args[]) {
        User user = new User("Suram", 54);
        UserService.serializeUser(user);
        User user2 = UserService.deserializeUser();
        System.out.println(user2);

        Gson gson = new Gson();
        String json = gson.toJson(user);
        User user3 = gson.fromJson(json, User.class);
        System.out.println(json);
        System.out.println(user3);

        UserService.serializeXML(user);
        User user4 = UserService.deserializeXML();
        System.out.println(user4);
    }
}
