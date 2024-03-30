package com.array;
//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,1,0,4,3};
        System.out.println(cyclic(arr));
    }

    static int cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                return j;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
