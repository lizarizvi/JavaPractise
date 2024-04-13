package com.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = (start + end) / 2;
        int pivot = arr[mid];

        while(start <= end){
            //also a reason why if its already sorted it will not swap
            while(arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);

    }
}
