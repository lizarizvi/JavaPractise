package com.liza;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first no: ");
        int num1 = in.nextInt();
        System.out.print("enter the second no: ");
        int num2 = in.nextInt();
        System.out.println("prime no are: ");
        for (int i = num1; i <= num2; i++){
            if (prime(i) == 2)
                System.out.print(i + " ");
        }
    }

    static int prime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count ++;
        }
        return count;
    }
}
