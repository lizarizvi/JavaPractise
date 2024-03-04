package com.array;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigitsArray {
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (numOfDigits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    static int numOfDigits(int n){ //count the no of digits
        int c = 0;
        while(n > 0){
            c++;
            n /= 10;
        }
        return c;
    }
}
