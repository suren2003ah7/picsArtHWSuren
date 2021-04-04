package com.company.lesson3;

public class Lesson3 {
    // Task 1, fill an array with the number 2
    int[] arr222 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

    public void things(){
        // Task 2, Create an array and fill it with numbers from 1:1000
        int[] arr1000 = new int[1000];
        for (int i = 0; i < arr1000.length; i++){
            arr1000[i] = i + 1;
        }

        // Task 3, Create an array and fill it with odd numbers from -20:20
        int[] arrodd = new int[20];
        for (int i = 0, j = -19; i < arrodd.length; i++, j+=2){
            arrodd[i] = j;
        }

        //Task 4, Create an array and fill it. Print all elements which can be divided by 5.
        int[] arr = {4, 5, 19, 26, 14, 35, -63, -15, 75};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 5 == 0){
                System.out.println(arr[i]);
            }
        }
        System.out.println();

        //Task 5, Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        // Here I am using the array created in Task 4
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 24.12 && arr[i] < 467.23){
                System.out.println(arr[i]);
            }
        }
        System.out.println();

        //Task 6, Create an array and fill it. Print count of elements which can be divided by 2.
        // Here I am using the array created in Task 4
        int x = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                x++;
            }
        }
        System.out.println(x);
        System.out.println();

        //Task 7, Given an integer, 0< N < 21 , print its first 10 multiples. Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.
        int n = 12;
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
