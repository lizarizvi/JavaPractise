package com.array;

import java.util.ArrayList;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2147483647, 2147483646, 2147483645, 3, 2, 1, -1, 0, -2147483648};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            int element = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] > 0 && arr[i] != arr[element]){
                swap(arr, i, element);
            } else {
                i++;
            }
        }
        int a = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                //return j + 1;
                arrayList.add(j + 1);
                return min(arrayList);
            } else {
                a = arr[j] + 1;
            }
        }
        return a;
        //return arr.length + 1;
    }
    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
    static int min(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
