package com.liza;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the principal: ");
        double principal = in.nextDouble();
        System.out.print("enter the rate: ");
        double rate = in.nextDouble();
        System.out.print("enter the time: ");
        double time = in.nextDouble();
        double SI = (principal * rate * time) / 100;
        System.out.println("simple interest is: " + SI);
    }
}
