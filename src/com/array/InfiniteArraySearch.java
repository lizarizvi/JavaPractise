package com.array;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,9,10,11,12,13,14,15,18,19,20,21,26,27,28,29,33,35,45,46,47,50,54,58,60};
        int target = 54;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        if (target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2; //(end - start + 1) -> size of array by indices
            start = newStart;
        }
        return binary(arr, target, start, end);
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
}
