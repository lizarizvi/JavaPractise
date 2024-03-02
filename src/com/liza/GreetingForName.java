package com.liza;

import java.util.Scanner;

public class GreetingForName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }
}
