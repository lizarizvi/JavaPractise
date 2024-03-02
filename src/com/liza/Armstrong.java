package com.liza;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first no: ");
        int num1 = in.nextInt();
        System.out.print("enter the second no: ");
        int num2 = in.nextInt();
        System.out.print("armstrong no are: ");
        for (int i = num1; i <= num2; i++) {
            if (armstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean armstrong(int num) {
        int temp = num;
        int sum = 0;
        int c = String.valueOf(num).length();
        while (num > 0){
            int rem = num % 10;
            sum += Math.pow(rem, c);
            num = num / 10;
        }
        return temp == sum;
    }
}
