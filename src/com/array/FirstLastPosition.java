package com.array;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums ={5,7,7,7,7,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 7)));
    }
    static int[] searchRange(int[] nums, int target) {
//        int[] arr = new int[2];
//        int f = 0;
//        for(int i = 0; i < nums.length; i++){
//            if(target != nums[i]){
//                arr[0] = -1;
//                arr[1] = -1;
//            }
//            if(nums[i] == target){
//                arr[0] = i;
//                break;
//            }
//        }
//        for(int i = nums.length - 1; i > 0; i--){
//            if(nums[i] == target){
//                arr[1] = i;
//                break;
//            }
//        }
//        if(nums.length == 0){
//            return new int[]{-1, -1};
//        }
//        return arr;
        int[] ans = {-1, -1};
        //check for first occurrences if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }
    static int search(int[] nums, int target, boolean startIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // int mid = start + (end - start) / 2;
            if (target < nums[mid]) {    //if (target > arr[mid]) for descending order
                end = mid - 1;
            } else if (target > nums[mid]) {   //if (target < arr[mid]) for descending order
                start = mid + 1;
            } else {
                ans = mid;
                if (startIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
