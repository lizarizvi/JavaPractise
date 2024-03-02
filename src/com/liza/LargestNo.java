package com.liza;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first no: ");
        int num1 = in.nextInt();
        System.out.print("enter the second no: ");
        int num2 = in.nextInt();
        System.out.print("enter the third no: ");
        int num3 = in.nextInt();
        maximum(num1, num2, num3);
        minimum(num1, num2, num3);
//        if (num1 > num2)
//            System.out.println("largest no is: " + num1);
//        else if (num2 > num1)
//            System.out.println("largest no is: " + num2);
//        else
//            System.out.println("both are equal");
    }

    static void minimum(int a, int b, int c) {
        int minNo = Math.min(a,Math.min(b,c));
        System.out.println("minimum no is: " + minNo);
    }

    static void maximum(int a, int b, int c){
        int maxNo = Math.max(a,Math.max(b,c));
        System.out.println("maximum no is: " + maxNo);
    }
}
