package com.liza;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = in.nextInt();
        System.out.print("Factors are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}