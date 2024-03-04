package com.array;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {3,34,56,-43,43,65,12,-5,6};
        System.out.println("max: " + max(arr));
        System.out.println("min: " + min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
