package com.array;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'c', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
//        if (target >= letters[letters.length - 1]){
//            return letters[0];
//        }
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            // int mid = start + (end - start) / 2;
            if (target < letters[mid]){    //if (target > arr[mid]) for descending order
                end = mid - 1;
            } else //if (target > letters[mid])
            {   //if (target < arr[mid]) for descending order
                start = mid + 1;
            }
//            else {
//                return letters[mid + 1];
//            }
        }
        //return letters[start]; //FOR CEIL EVERYTHING ELSE REMAINS SAME
        return letters[start % letters.length];
    }
}
