package com.liza;

public class App {
    public static void main(String[] args) {
        int n = 768248276;
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}
