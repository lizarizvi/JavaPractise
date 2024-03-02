package com.liza;

import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int n = in.nextInt();
        int sum = 0;
        System.out.print("enter the nos: ");
        for (int i = 1; i <= n; i++) {
            int num = in.nextInt();
            sum += num;
        }
        System.out.println("sum of nos is: " + sum);
        double avg = sum / n;
        System.out.println("average of nos is: " + avg);
    }
}
