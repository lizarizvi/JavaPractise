package com.String;
//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        String str = " ";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String s) {
        //[^a-zA-Z0-9] is a regular expression that matches any character
        // that is not a letter (a-z or A-Z) or a digit (0-9)
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder builder = new StringBuilder(s);
        String reverse = builder.reverse().toString();
        return s.equals(reverse);
    }
}
