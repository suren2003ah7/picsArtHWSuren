package com.company;
import com.company.lesson2.Lesson2;
import com.company.lesson2.Public;

public class Main {

    public static void main(String[] args) {
        Lesson2 test = new Lesson2(10, 6, 29, -7);
        test.things();
        Public sol = new Public();
        sol.Solution();
        // this class was actually supposed to be Problem, not Public
    }
}
