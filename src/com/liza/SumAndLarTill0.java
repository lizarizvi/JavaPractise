package com.liza;

import java.util.Scanner;

public class SumAndLarTill0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no: ");
        int num = in.nextInt();
        int sum = 0;
        int lar = 0;
        while(num != 0){
            sum += num;
            if (num > lar){
                lar = num;
            }
            System.out.print("enter no: ");
            num = in.nextInt();
        }
        System.out.println("sum is: " + sum);
        System.out.println("largest number is: " + lar);
    }
}
