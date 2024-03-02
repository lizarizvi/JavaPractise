package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main(String[] args) {

    }
    public boolean checkIfPangram(String sentence) {
        for(char ch = 'a'; ch <= 'z'; ch++){
            for(int i = 0; i < sentence.length(); i++){
                return sentence.charAt(i) == ch;
            }
        }
        return false;
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String str = "";
        for(int i = 0; i < num.length; i++){
            str += num[i];
        }
        int sum = Integer.parseInt(str) + k;
        while(sum > 0){
            int p = sum % 10;
            sum /= 10;
            list.add(p);
//            list = Collections.reverse(list);
        }
        return list;
    }
}
