package com.Recursion;

import java.util.ArrayList;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,7,9,12};
        System.out.println(linearSearch(arr,0, 5));
        findAllIndex(arr, 0, 2);
        System.out.println(arrayList);

        System.out.println(findAllIndex2(arr, 0, 2, new ArrayList<>()));
        System.out.println(findAllIndex3(arr, 0, 2));

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

    static ArrayList<Integer> arrayList = new ArrayList<>();
    static void findAllIndex(int[] arr, int index, int target){
        if (index == arr.length - 1){
            return;
        }
        if (arr[index] == target) {
            arrayList.add(index);
        }
        findAllIndex(arr, index + 1, target);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int index, int target, ArrayList<Integer> list){
        if (index == arr.length - 1){
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr, index + 1, target, list);
    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length - 1){
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, index + 1, target);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    }
