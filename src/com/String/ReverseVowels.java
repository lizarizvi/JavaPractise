package com.String;
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class ReverseVowels {
    public static void main(String[] args) {
        String str = "aA";
        System.out.println(reverseVowels(str));
    }
    static String reverseVowels(String s) {
        //s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);

        while (start < end) {
            char ch = s.charAt(start);
            char ch1 = s.charAt(end);

            if (vowels.indexOf(ch) == -1) {
                start++;
                continue;
            }

            if (vowels.indexOf(ch1) == -1) {
                end--;
                continue;
            }
            //The character at the specified index is set to ch.
            sb.setCharAt(start, ch1);
            sb.setCharAt(end, ch);

            start++;
            end--;
        }

        return sb.toString();
    }
}
