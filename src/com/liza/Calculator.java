package com.liza;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the operator: ");
        char ch = in.next().charAt(0);
        System.out.println();
        int ans;
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
            System.out.print("enter two nos. ");
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            System.out.println();
            if (ch == '+'){
                ans = n1 + n2;
                System.out.println(ans);
            }
            if (ch == '-'){
                ans = n1 - n2;
                System.out.println(ans);
            }
            if (ch == '*'){
                ans = n1 * n2;
                System.out.println(ans);
            }
            if (ch == '/'){
                if (n2 != 0){
                    ans = n1 / n2;
                    System.out.println(ans);
                }
            }
            if (ch == '%'){
                ans = n1 % n2;
                System.out.println(ans);
            }
        }
        else{
            System.out.println("invalid operator");
        }
    }
}
