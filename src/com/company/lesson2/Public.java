package com.company.lesson2;

public class Public {
    int[] arr = {7, 6, 4, 6, 4};
    int[] arr1 = new int[arr.length];
    int[] arr2 = new int[arr.length];
    int sum1, sum2;
    public void Solution() {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr1[j]){
                    arr2[i] = arr[i];
                }
                else {
                    arr1[i] = arr[i];
                }
            }
        }
        for (int i = 0; i < arr1.length; i++){
            sum1+=arr1[i];
            sum2+=arr2[i];
        }
        System.out.println(sum1 - sum2);
    }
    public void Solution2(){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++){
            result^=arr[i];
        }
        System.out.println(result);
    }
}
