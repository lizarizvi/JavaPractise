package com.array;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {3,34,56,-43,43,65,12,-5,6};
//        int target = 99;
        int target = -43;
        System.out.println(searchInRange(arr, target, 1, 4));
    }
    static boolean searchInRange(int[] arr, int target, int start, int end){
        //        if(arr.length == 0){
//            return -1;
////            return "not found";
//        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == target) {
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
