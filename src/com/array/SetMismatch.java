package com.array;
//https://leetcode.com/problems/set-mismatch/description/
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        int missingNum = 0, duplicate = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                missingNum = arr[j];
                duplicate = j + 1;
            }
        }
        return new int[]{missingNum, duplicate};
    }
    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
