package com.Recursion;

public class Reverse {

    static int sum = 0;
    static void reverse2(int n){   // method 1
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse2(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(reverse(765));

        reverse2(23451);
        System.out.println(sum);

        System.out.println(reverse3(1234));
    }

    // method 2
    static int reverse3(int n) {
        int count = (int)(Math.log10(n)) + 1;
        return helper(n, count);
    }

    static int helper(int n, int count) {
        if (n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, count - 1)) + helper(n / 10, count - 1);
    }


    static String reverse(int n) {  // by myself
        if (n % 10 == n){
            return "" + n;
        }
        return "" + (n % 10) + reverse(n / 10);
    }
}
