package com.array;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peakElement = peakIndexInMountainArray(arr);
        int ascending = orderAgnosticBS(arr, target, 0, peakElement);
        if (ascending != -1) {
            return ascending;
        }
        return orderAgnosticBS(arr, target, peakElement, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
//        int start = 0;
//        int end = arr.length - 1;

        // check whether ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + end) / 2;
            // int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {    //if (target > arr[mid]) for descending order
                    end = mid - 1;
                } else if (target > arr[mid]) {   //if (target < arr[mid]) for descending order
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {    //if (target > arr[mid]) for descending order
                    end = mid - 1;
                } else if (target < arr[mid]) {   //if (target < arr[mid]) for descending order
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}




// This is MountainArray's API interface.
// You should not implement it, or speculate about its implementation
interface MountainArray {
    int get(int index);
    int length();
}

// Make sure that you are passing instances of MountainArray i.e. mountainArr to the methods where needed,
// and ensure you're calling methods like length() on instances of MountainArray, not on the class itself.
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakElement = peakIndexInMountainArray(mountainArr);
        int ascending = orderAgnosticBS(mountainArr, target, 0, peakElement);
        if (ascending != -1){
            return ascending;
        }
        return orderAgnosticBS(mountainArr, target, peakElement, mountainArr.length() - 1);
    }
    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length - 1;

        // check whether ascending or descending
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while(start <= end){
            int mid = (start + end) / 2;
            // int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) == target){
                return mid;
            }

            if (isAsc){
                if (target < mountainArr.get(mid)){    //if (target > arr[mid]) for descending order
                    end = mid - 1;
                } else if (target > mountainArr.get(mid)) {   //if (target < arr[mid]) for descending order
                    start = mid + 1;
                }
            }

            else {
                if (target > mountainArr.get(mid)){    //if (target > arr[mid]) for descending order
                    end = mid - 1;
                } else if (target < mountainArr.get(mid)) {   //if (target < arr[mid]) for descending order
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
