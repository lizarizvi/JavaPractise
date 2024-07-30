package com.liza;
//https://leetcode.com/problems/two-sum/description/
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,9,11,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }
        static int[] twoSum(int[] nums, int target) {
            int[] indices = new int[2];
            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        indices[0] = i;
                        indices[1] = j;
                        break;
                    }
                }
            }
            return indices;
        }
    }
