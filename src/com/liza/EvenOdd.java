package com.liza;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = in.nextInt();
        if (even(num)){
            System.out.println("number is even");
        } else{
            System.out.println("number is odd");
        }
    }

    static boolean even(int num) {
        return num % 2 == 0;
    }
}
