package com.liza;

import java.util.Scanner;

public class SumFun {
    static int sumNegative = 0;
    static int sumPositiveOdd = 0;
    static int sumPositiveEven = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no: ");
        int num = in.nextInt();
        while(num != 0){
            negativeSum(num);
            positiveOdd(num);
            positiveEven(num);
            System.out.print("enter no: ");
            num = in.nextInt();
        }
    }

    static void negativeSum(int num) {
        if (num < 0){
            sumNegative += num;
            System.out.println("sum of negative: " + sumNegative);
        }
    }

    static void positiveOdd(int num){
        if (num > 0 && num % 2 != 0){
            sumPositiveOdd += num;
            System.out.println("sum of positive odd: " + sumPositiveOdd);
        }
    }

    static void positiveEven(int num){
        if (num > 0 && num % 2 == 0){
            sumPositiveEven += num;
            System.out.println("sum of positive even: " + sumPositiveEven);
        }
    }
}