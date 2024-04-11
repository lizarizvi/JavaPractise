package com.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1){ //base condition when only one element left
            return arr;
        }
        int mid = arr.length / 2;
        //sorting first and second side of array
        int[] first = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // merge function merge first and second array
        return merge(first, second);
    }

    static int[] merge(int[] first, int[] second) {
        //new array that will contain merged and sorted array
        int[] mergedArray = new int[first.length + second.length];
        int i = 0; //pointer for first[]
        int j = 0; //pointer for second[]
        int k = 0; //pointer for mergedArray[]
        //while reaching one of its length loop will end and
        //will check separately if element in first or second is left
        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mergedArray[k] = first[i];
                i++;
            } else {
                mergedArray[k] = second[j];
                j++;
            }
            k++;
        }
        //loop will work when there are elements left in first[]
        while (i < first.length){
            mergedArray[k] = first[i];
            i++;
            k++;
        }
        //loop will work when there are elements left in second[]
        while (j < second.length){
            mergedArray[k] = second[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
