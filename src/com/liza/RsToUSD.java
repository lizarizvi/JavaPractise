package com.liza;

import java.util.Scanner;

public class RsToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the currency in rupees: ");
        double cur = in.nextDouble();
        // 1 INR = 0.014 USD
        double usd = cur * 0.014;
        System.out.println("currency in USD is: " + usd);
    }
}
