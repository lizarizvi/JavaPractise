package com.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(707));
    }

    static boolean palindrome(int n) {
        return String.valueOf(n).equals(reverse(n));
    }
    static String reverse(int n) {  // by myself
        if (n % 10 == n){
            return "" + n;
        }
        return "" + (n % 10) + reverse(n / 10);
    }
}
