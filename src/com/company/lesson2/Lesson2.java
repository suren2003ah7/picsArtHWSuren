package com.company.lesson2;

public class Lesson2 {
    int a, b, c, d;
    int[] arr = {7, 6, 4, 6, 4};
    public Lesson2(int e, int f, int g, int h){
        a = e;
        b = f;
        c = g;
        d = h;
    }
    public void things(){
        int sum = a + b + c + d;
        double mean = sum / (double) 4;
        int prod = a * b * c * d;
        System.out.println(a++ + " " + ++a + " " + sum + " " + mean + " " + prod);
        if (a > b){
            System.out.println("a is bigger than b");
        }
        else if(a < b){
            System.out.println("a is smaller than b");
        }
        else{
            System.out.println("a is equal to b");
        }
        arr[3] = d;
        System.out.println("array length: " + arr.length + ", first item: " + arr[0]);
    }
}
