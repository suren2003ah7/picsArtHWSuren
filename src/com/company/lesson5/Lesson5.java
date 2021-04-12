package com.company.lesson5;

import java.util.Locale;

public class Lesson5 {
    // messing around with Strings
    // Here I illustrate some possibilities of the String, not all of them, I read the whole article tho
    char[] arr1 = {'h', 'e', 'l', 'l', 'o'};
    char[] arr2 = {'b', 'y', 'e'};
    String s1 = new String(arr1);
    String s2 = "hello";
    String s3 = "Hello";
    String s4 = new String(arr2);
    String sent = "This is a is-sentence with a lot of is and this in it.";

    public void things(){
        if (s1.length() == s2.length()){
            System.out.println("The length of the first string equals" +
                               " to the length of the second string");
        }

        System.out.println("First character of the third string: " + s3.charAt(0));
        char[] buf = new char[2];
        s4.getChars(0, 2, buf, 0);
        System.out.println("First and second characters of the fourth string: " + buf[0] + buf[1]);

        if (s1.equals(s2)){
            System.out.println("The first string is the same as the second one");
        }
        if (!(s1.equals(s4))){
            System.out.println("The first string is not the same as the fourth one");
        }

        if (s1.compareTo(s4) > 0){
            System.out.println("The first string is \"bigger\" than the fourth one");
        }

        int i;
        String result;
        do{
            System.out.println(sent);
            i = sent.indexOf("is");
            if (i != -1){
                result = sent.substring(0, i);
                result = result + "was";
                result = result + sent.substring(i + "is".length());
                sent = result;
            }
        }while(i != -1);

        System.out.println(s3.replace('l', 'w'));
        System.out.println(s1.toUpperCase());
        System.out.println(String.join(", ", s1, s2, s3, s4, sent));
    }

    public String toString(){
        return "Strings are " + s1 + " " + s2 + " " + s3 + " " + s4;
    }
}
