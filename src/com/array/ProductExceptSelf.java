package com.array;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(array)));
    }
//    static int[] productExceptSelf(int[] nums) {
//        int product;
//        int[] answer = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            product = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j)
//                    continue;
//                product *= nums[j];
//            }
//            answer[i] = product;
//        }
//        return answer;
//    }
    // the above solution showed time limit exceeded for large number of values

    static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];

        int[] prefixProducts = new int[n];
        prefixProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            prefixProducts[i] = prefixProducts[i - 1] * nums[i - 1];
        }

        int[] suffixProducts = new int[n];
        suffixProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffixProducts[i] = suffixProducts[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            answer[i] = prefixProducts[i] * suffixProducts[i];
        }
        return answer;
    }

}
