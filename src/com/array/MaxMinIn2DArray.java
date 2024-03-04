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
            for (int i : arr2) {
                if (min > i) {
                    min = i;
                }
            }
        }
        return min;
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] arr2 : arr) {
            for (int i : arr2) {
                if (max < i) {
                    max = i;
                }
            }
        }
        return max;
    }
}
