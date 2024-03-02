package com.liza;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = in.nextLine();
        int len = str.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)){
            System.out.println("string is palindrome");
        } else
            System.out.println("string is not palindrome");
        }
    }
