package com.company.lesson2;

public class Lesson2 {
    int a, b, c, d;
    int[] arr = {3, 9, -9, 29, 0};

    public Lesson2(int e, int f, int g, int h) {
        a = e;
        b = f;
        c = g;
        d = h;
    }

    public void things() {
        int sum = a + b + c + d;
        double mean = sum / (double) 4;
        int prod = a * b * c * d;
        System.out.println(a++ + " " + ++a + " " + sum + " " + mean + " " + prod);
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        if (a > b) {
            System.out.println("a is bigger than b");
        } else if (a < b) {
            System.out.println("a is smaller than b");
        } else {
            System.out.println("a is equal to b");
        }

        if (b >= c && a < d || c >= a && b <= d) {
            System.out.println("yah");
        } else {
            System.out.println("nah");
        }
        System.out.println(a > 7 ? "yes" : "no");
        arr[3] = d;
        System.out.println("array length: " + arr.length + ", first item: " + arr[0]);
    }
}
