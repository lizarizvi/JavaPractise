package com.Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binary(arr , target, start, end));
    }

    static int binary(int[] arr, int target, int start, int end) {
        if (start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target){
            return mid;
        }
        if (target < arr[mid]){
            return binary(arr, target, start, mid - 1);
        }
        return binary(arr, target, mid + 1, end);
    }
}
