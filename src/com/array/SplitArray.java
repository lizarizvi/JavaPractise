package com.array;
//https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int j : nums) {
            start = Math.max(start, j);
            end += j;
        }
        while (start < end){
            int mid = (start + end) / 2;

            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces <= k){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
