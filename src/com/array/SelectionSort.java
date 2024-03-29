package com.array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(selection(arr)));
    }

    static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int first, int last) {
        int max = first;
        for (int i = first; i <= last; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

//    static int[] selection(int[] arr) {  // complexity - O(n^2) - best and worst case
//        //it performs well for small array and lists
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[min]){
//                    min = j;
//                }
//            }
//            int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;
//        }
//        return arr;
//    }

}
