package com.liza;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("enter the string: ");
//        String str = in.nextLine();

        System.out.print("enter the num: ");
        int num = in.nextInt();
        if (palindrome(num) == num){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

//        int len = str.length();
//        String revStr = "";
//        for (int i = len - 1; i >= 0; i--) {
//            revStr += str.charAt(i);
//        }
//        System.out.println("reversed string: " + revStr);
    }

    static int palindrome(int num) {
        String rev = "";
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            rev += rem;
            num /= 10;
        }
        return Integer.parseInt(rev);
    }

}
