package com.liza;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the age: ");
        int age = in.nextInt();
        if (eligibility(age)){
            System.out.println("a person can vote");
        } else {
            System.out.println("a person cannot vote");
        }
    }
    static boolean eligibility(int age) {
        return age >= 18;
    }
    }
