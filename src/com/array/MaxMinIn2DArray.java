package com.array;

public class MaxMinIn2DArray {
    public static void main(String[] args) {
        int[][] arr = { {-4,3,2},
                {4,5,6},
                {3,9} };
        System.out.println("max: " + max(arr));
        System.out.println("min: " + min(arr));
    }

    static int min(int[][] arr) {
        int min = arr[0][0];
        for (int[] arr2 : arr) {
            for (int j = 0; j < arr2.length; j++) {
                if (min > arr2[j]) {
                    min = arr2[j];
                }
            }
        }
        return min;
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] arr2 : arr) {
            for (int j = 0; j < arr2.length; j++) {
                if (max < arr2[j]) {
                    max = arr2[j];
                }
            }
        }
        return max;
    }
}
