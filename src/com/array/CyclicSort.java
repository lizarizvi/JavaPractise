package com.array;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println(Arrays.toString(cyclic(arr)));
    }
    static int[] cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i] != arr[arr[i] - 1]){
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
