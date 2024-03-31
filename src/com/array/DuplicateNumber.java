package com.array;
//https://leetcode.com/problems/find-the-duplicate-number/description/
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if (arr[i] != arr[arr[i] - 1]){
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }

            //anther method
//            if (arr[i] != i + 1){
//                if (arr[i] != arr[arr[i] - 1]){
//                    swap(arr, i, arr[i] - 1);
//                } else {
//                    return arr[i];
//                }
//            } else {
//                i++;
//            }

        }
        return arr[arr.length - 1];
//        return -1;
    }
    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
