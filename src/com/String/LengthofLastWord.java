package com.String;
//https://leetcode.com/problems/length-of-last-word/description/
public class LengthofLastWord {
    public static void main(String[] args) {
        String str = " hello   world   ";
        System.out.println(lengthOfLastWord(str));
    }
    static int lengthOfLastWord(String s) {
        s = s.trim(); //last and start spaces gone
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i --) {  //from end to start
            if (s.charAt(i) != ' ') { //till space is not found increase length
                length ++;
            }
            else break;  // if space found break out of loop
        }
        return length;
    }
}
