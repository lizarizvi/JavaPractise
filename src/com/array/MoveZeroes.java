package com.array;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        moveZeroes(array);
    }
    static void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }
        for (int i = nonZeroIndex; i < n; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
