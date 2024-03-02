package com.liza;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the year: ");
        int year = in.nextInt();
        if(year % 4 == 0){
            System.out.println("leap year");
        } else{
            System.out.println("not a leap year");
        }
    }
}
