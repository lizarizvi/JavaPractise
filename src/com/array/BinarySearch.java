package com.array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-23, -10, -2, 0, 4, 32, 43, 67};  //ascending
        int[] arr2 = {67, 43, 4, 0, -2, -23};   //descending
        System.out.println(orderAgnosticBS(arr2, -2));

        int[][] arr3 = {{18, 9, 12}, {36,-4,91}, {44,33,16}};
        int target = 91;
        System.out.println(Arrays.toString(binarySearchIn2DArray(arr3, target)));
    }

    static int binary(int[] arr, int target) {  //already known ascending or descending
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            // int mid = start + (end - start) / 2;
            if (target < arr[mid]){    //if (target > arr[mid]) for descending order
                end = mid - 1;
            } else if (target > arr[mid]) {   //if (target < arr[mid]) for descending order
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // check whether ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = (start + end) / 2;
            // int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){    //if (target > arr[mid]) for descending order
                    end = mid - 1;
                } else if (target > arr[mid]) {   //if (target < arr[mid]) for descending order
                    start = mid + 1;
                }
            }

            else {
                if (target > arr[mid]){    //if (target > arr[mid]) for descending order
                    end = mid - 1;
                } else if (target < arr[mid]) {   //if (target < arr[mid]) for descending order
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int[] binarySearchIn2DArray(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0){
            if (arr[r][c] == target){
                return new int[]{r, c};
            } else if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }

}
