package com.liza;

public class evenAugust {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0)
                c++;
        }
        System.out.println("Kunal can go out for " + c + " days in august");
    }
}
