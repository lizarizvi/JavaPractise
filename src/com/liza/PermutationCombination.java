package com.liza;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no of items: ");
        int n = in.nextInt();
        System.out.print("enter the no of items chosen at a time: ");
        int r = in.nextInt();
        int nCr = factorial(n) / (factorial(r) * factorial(n-r));
        int nPr = factorial(n) / factorial(n-r);
        System.out.println("combination is: " + nCr);
        System.out.println("permutation is: " + nPr);
    }
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
