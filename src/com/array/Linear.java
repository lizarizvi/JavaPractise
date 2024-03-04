package com.array;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {3,34,56,-43,43,65,12,-5,6,3};
//        int target = 99;
        int target = -43;
        System.out.println(linearSearch(arr, target));
    }
    static boolean linearSearch(int[] arr, int target){
//        if(arr.length == 0){
//            return -1;
////            return "not found";
//        }
        for (int i : arr) {
            if (i == target) {
//                return i;    //returns the index of the found target
//                return "found"; //return whether target found or not
//                return i;   //returns the target if found
                return true;
            }
        }
//        return -1;
//        return Integer.MAX_VALUE;     //while returning the element the target can be -1 too so we changed it to MAX_VALUE
//        return "not found";
        return false;
    }
}
