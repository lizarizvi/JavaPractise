package com.String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome2(str));
    }
//    static boolean isPalindrome(String str){
//        if (str == null){
//            return true;
//        }
//        str = str.toLowerCase();
//        int start = 0;
//        int end = str.length() - 1;
//        while(start <= end){
//            if (str.charAt(start) != str.charAt(end)){
//                return false;
//            } else {
//                start++;
//                end--;
//            }
//        }
//        return true;
//    }

    static boolean isPalindrome2(String str){
        if (str == null){
            return true;
        }
        StringBuilder builder = new StringBuilder(str);
        String reverse = builder.reverse().toString();
        return str.equals(reverse);
    }
}
