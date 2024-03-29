package com.array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,0,-2,-3};
        System.out.println(Arrays.toString(insertion(arr)));
    }

    static int[] insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }


//    static int[] insertion(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > key){
//                arr[j + 1] = arr[j];
//                j -=1;
//            }
//            arr[j + 1] = key;
//        }
//        return arr;
//    }
}
