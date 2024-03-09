package com.array;

public class CeilFloor {
    public static void main(String[] args) {
        int[] arr = {-23, -10, -2, 0, 4, 32, 43, 67, 70, 80, 90, 100, 200, 444};  //ascending
        System.out.println(floor(arr, 199));
    }

    static int ceil(int[] arr, int target) {  //already known ascending or descending
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
                return arr[mid];
            }
        }
        return arr[start]; //FOR CEIL EVERYTHING ELSE REMAINS SAME
    }

    static int floor(int[] arr, int target) {  //already known ascending or descending
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
                return arr[mid];
            }
        }
        return arr[end];  //FOR FLOOR EVERYTHING ELSE REMAINS SAME
    }
}
