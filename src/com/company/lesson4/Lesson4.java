package com.company.lesson4;

public class Lesson4 {
    int[] arr = {5, 19, -29, 43, 0, 39, 13, -9, 333};
    int x = 0;
    public void Sort(){
        boolean b = true;
        while(b){
            b = false;
            for (int i = 0; i < arr.length - 1 - x; i++){
                if (arr[i] > arr[i+1]){
                    int z = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = z;
                    b = true;
                }
            }
            x++;
        }
        for (int i:arr){
            System.out.print(i + " ");
        }
    }
}
