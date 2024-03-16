package com.array;
//https://leetcode.com/problems/kth-missing-positive-number/description/
public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2};
        int k = 2;
        System.out.println(findKthPositive(arr, k));
    }
    static int findKthPositive(int[] arr, int k) {
        int[] arr2 = new int[arr.length * arr.length * 2];
        int a = 0;
            for (int i = 1; i < arr2.length; i++) {
                if (!binary(arr, i)) {
                    arr2[a] = i;
                    a++;
                    if (a >= k)
                        break;
                }
            }
        return arr2[k - 1];
    }
    static boolean binary(int[] arr, int target) {  //already known ascending or descending
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
                return true;
            }
        }
        return false;
    }
}
