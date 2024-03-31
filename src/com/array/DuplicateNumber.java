package com.array;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-the-duplicate-number/description/
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
        System.out.println(findAllDuplicates(arr));
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
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    static List<Integer> findAllDuplicates(int[] arr) {
//        int i = 0;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        while (i < arr.length){
//            if (arr[i] != i + 1){
//                if (arr[i] != arr[arr[i] - 1]){
//                    swap(arr, i, arr[i] - 1);
//                } else {
//                    arrayList.add(arr[i]);
//                    i++;
//                }
//            } else {
//                i++;
//            }
//        }
//        Collections.sort(arrayList);
//        return arrayList;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                arrayList.add(arr[j]);
            }
        }

        return arrayList;
    }
}
