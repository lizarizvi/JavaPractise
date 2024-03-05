package com.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-23, -10, -2, 0, 4, 32, 43, 67};
        System.out.println(binary(arr, -10));
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            // int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
