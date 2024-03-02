package com.liza;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first no: ");
        int num1 = in.nextInt();
        System.out.print("enter the second no: ");
        int num2 = in.nextInt();

        System.out.println("hcf is: " + hcf(num1, num2));
        lcm(num1, num2);
    }

    static int hcf(int num1, int num2) {
        int hcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    static void lcm(int num1, int num2) {
        //formula for lcm is  lcm = (a * b) / gcd or hcf
        int lcm = num1 * num2 / hcf(num1, num2);
        System.out.println("lcm is: " + lcm);
    }
}
