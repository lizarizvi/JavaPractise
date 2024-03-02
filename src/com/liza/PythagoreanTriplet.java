package com.liza;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first no: ");
        int num1 = in.nextInt();
        System.out.print("enter the second no: ");
        int num2 = in.nextInt();
        System.out.print("enter the third no: ");
        int num3 = in.nextInt();
        if (pythagoras(num1,num2) == num3){
            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not Pythagorean Triplet");
        }
    }

    static int pythagoras(int num1, int num2) {
        return (num1 * num1) + (num2 * num2);
    }
}
