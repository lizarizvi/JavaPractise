package com.array;
//https://leetcode.com/problems/kth-missing-positive-number/description/
public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 12;
        System.out.println(findKthPositive(arr, k));
    }
    static int findKthPositive(int[] arr, int k) {
//        for (int i = 0; i < arr.length; i++) {
//            int ans = arr[i];
//            if (ans <= k) {
//                k++;
//            } else {
//                break;
//            }
//        }
//        return k;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}
