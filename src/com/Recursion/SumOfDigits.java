package com.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(343));
        System.out.println(product(32));
    }

    static int sumOfDigits(int n) {
        if (n == 0){
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
    static int product(int n){
        if (n % 10 == n){        //check when one digit is left return it
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}
