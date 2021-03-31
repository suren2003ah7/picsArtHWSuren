package com.company.lesson1;

public class Lesson1 {
    String FullName = "Suren Hakobyan";
    char firstLetter = 'S';
    byte age = 17;
    short salary = 0;
    int favoriteNumber = 7;
    long yob = 2003; //year of birth
    boolean lovesPicsArt = true;
    float height = 1.8f;
    double mass = 63.5;
    public void thing(){
        System.out.println("Full name, First letter: " + FullName + " , " + firstLetter);
        System.out.println("age, year of birth: " + age + " , " + yob);
        System.out.println("height, mass: " + height + " , " + mass);
        System.out.println("salary: " + salary);
        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Loves picsArt?: " + lovesPicsArt);
        System.out.println(":)");
    }
}
