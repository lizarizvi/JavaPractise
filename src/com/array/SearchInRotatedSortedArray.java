package com.array;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 4;
        System.out.println(search(arr, target));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1){
            return binary(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binary(nums, target, 0, pivot - 1);
        }
        return binary(nums, target, pivot + 1, nums.length - 1);
    }
    static int binary(int[] arr, int target, int start, int end) {  //already known ascending or descending
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

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            //4 cases to find peak i.e. largest element
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid;
            }
            if (arr[start] >= arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
