package com.Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,7,9,12};
        System.out.println(linearSearch(arr,0, 5));
    }

    static boolean sortedOrNot(int[] arr, int index) {
        if (index == arr.length - 1){
            return true;
        }
        return arr[index] <= arr[index + 1] && sortedOrNot(arr, index + 1);
    }
    static int linearSearch(int[] arr, int index, int target){
        if (index == arr.length - 1){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr, index + 1, target);
    }
}
