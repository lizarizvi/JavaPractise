package com.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(mergeSort(arr)));

        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        mergeSortLeetcode(nums1, 0, nums1.length);
        System.out.println(Arrays.toString(nums1));
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


    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1){ //base condition when only one element left
            return;
        }
        int mid = (start + end) / 2;
        //sorting first and second side of array
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        // merge function merge first and second array
        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end) {
        //new array that will contain merged and sorted array
        int[] mergedArray = new int[end - start];
        int i = start; //pointer for first[]
        int j = mid; //pointer for second[]
        int k = 0; //pointer for mergedArray[]
        //while reaching one of its length loop will end and
        //will check separately if element in first or second is left
        while (i < mid && j < end){
            if (arr[i] < arr[j]){
                mergedArray[k] = arr[i];
                i++;
            } else {
                mergedArray[k] = arr[j];
                j++;
            }
            k++;
        }
        //loop will work when there are elements left in first[]
        while (i < mid){
            mergedArray[k] = arr[i];
            i++;
            k++;
        }
        //loop will work when there are elements left in second[]
        while (j < end){
            mergedArray[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(mergedArray, 0, arr, start, mergedArray.length);

        // System.arraycopy(mergedArray, 0, arr, start + 0, mergedArray.length);

    }



//    https://leetcode.com/problems/merge-sorted-array/
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        while(i < n){
            int temp = nums1[m + i];
            nums1[m + i] = nums2[i];
            nums2[i] = temp;
            i++;
        }
    }
    static void mergeSortLeetcode(int[] arr, int start, int end) {
        if (end - start == 1){ //base condition when only one element left
            return;
        }
        int mid = (start + end) / 2;
        //sorting first and second side of array
        mergeSortLeetcode(arr, start, mid);
        mergeSortLeetcode(arr, mid, end);

        // merge function merge first and second array
        mergeLeetcode(arr, start, mid, end);
    }

    static void mergeLeetcode(int[] arr, int start, int mid, int end) {
        //new array that will contain merged and sorted array
        int[] mergedArray = new int[end - start];
        int i = start; //pointer for first[]
        int j = mid; //pointer for second[]
        int k = 0; //pointer for mergedArray[]
        //while reaching one of its length loop will end and
        //will check separately if element in first or second is left
        while (i < mid && j < end){
            if (arr[i] < arr[j]){
                mergedArray[k] = arr[i];
                i++;
            } else {
                mergedArray[k] = arr[j];
                j++;
            }
            k++;
        }
        //loop will work when there are elements left in first[]
        while (i < mid){
            mergedArray[k] = arr[i];
            i++;
            k++;
        }
        //loop will work when there are elements left in second[]
        while (j < end){
            mergedArray[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(mergedArray, 0, arr, start, mergedArray.length);

        // System.arraycopy(mergedArray, 0, arr, start + 0, mergedArray.length);
    }
}
