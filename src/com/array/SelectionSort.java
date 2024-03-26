package com.array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,-1,-3,0};
        System.out.println(Arrays.toString(selection(arr)));
    }

    static int[] selection(int[] arr) {  // complexity - O(n^2) - best and worst case
        //it performs well for small array and lists
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
