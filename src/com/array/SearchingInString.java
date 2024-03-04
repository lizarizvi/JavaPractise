package com.array;

import java.util.Arrays;

public class SearchingInString {
    public static void main(String[] args) {
        String str = "Liza";
        char target = 'i';
        System.out.println(search(str, target));

        System.out.println(str.toCharArray());    //prints "Liza"
        System.out.println(Arrays.toString(str.toCharArray()));    //prints [L, i, z, a]
    }
    static boolean search(String str, char target){

//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) {
//                return true;
//            }
//        }

        for (char ch : str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }

        return false;
    }
}
