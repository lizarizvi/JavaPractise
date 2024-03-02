package com.liza;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        if (num == sum)
            System.out.println("perfect");
        else
            System.out.println("not perfect");
    }
}
