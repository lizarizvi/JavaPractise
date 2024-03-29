package com.String;
//https://leetcode.com/problems/sorting-the-sentence/description/
import java.util.Arrays;

public class SortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String str = sortSentence(s);
        System.out.println(str);
    }

//    static String sortSentence(String s) {
//        String[] strArr = s.split(" ",s.length());
//        String str = "";
//        for (int i = 0; i < strArr.length - 1; i++) {
//            for (int j = 0; j < strArr.length - 1 - i; j++) {
//                if (strArr[j].charAt(strArr[j].length() - 1) > strArr[j + 1].charAt(strArr[j + 1].length() - 1)){
//                    String  temp = strArr[j];
//                    strArr[j] = strArr[j + 1];
//                    strArr[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < strArr.length; i++) {
//            strArr[i] = strArr[i].replaceAll("[^A-Za-z]", " ");
//            strArr[strArr.length - 1] = strArr[strArr.length - 1].replaceAll("[^A-Za-z]", "");
//            str += strArr[i];
//        }
//        return str;
//    }

    public static String sortSentence(String s) {
        String[] str = s.split(" ");                // Since the String contains only whitespaces, it's safe to split the String at them
        String[] res = new String[str.length];      // This String array will hold the rearranged words
        StringBuilder sb = new StringBuilder();     // Instead of using '+' operator to concat repeatedly, I have created a StringBuilder object which is more efficient
        int i = 0;
        for (String elem : str) {
            i = (int) (elem.charAt(elem.length() - 1) - '0');  // This  will extract the digit present at the end of each String and store it in i (i = index of the word in res[])
            res[i - 1] = elem.substring(0, elem.length() - 1); // This gives the substring of each String except for the digit in the end and stores the word at an appropriate index (i - 1) in res[]
        }
        //append the words from res[] to StringBuilder object to form a sentence
        for (i = 0; i < res.length - 1; i++)
            sb.append(res[i]).append(" ");
        sb.append(res[i]);
        return sb.toString();
    }
}
