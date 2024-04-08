package com.Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binary(arr , target, start, end));

        int[] arr1 = {5,6,7,8,9,1,2,3};
        System.out.println(rotatedBS(arr1, 7, 0, arr1.length - 1));
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

    static int rotatedBS(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target){
            return mid;
        }
        if (arr[start] <= arr[mid]){
            if (target <= arr[mid] && target >= arr[start]){
                return rotatedBS(arr, target, start, mid - 1);
            } else {
                return rotatedBS(arr, target, mid + 1, end);
            }
        }
        if (target >= arr[mid] && target <= end){
            return rotatedBS(arr, target, mid + 1, end);
        }
        return rotatedBS(arr, target, start, mid - 1);
    }
}
