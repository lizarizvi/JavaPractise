package com.liza;

public class Program {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int flag1 = 0;
        int flag2 = 0;
        int sum = 0;
        int sum2 =0;
        int pro = 1;
        for (int j : arr) {
            if (j % 2 == 0) {
                flag1++;
                sum += j;
            } else {
                flag2++;
                pro *= j;
                sum2 += j;
            }
        }
        if(flag1 == arr.length)
            System.out.println("only even(sum): " + sum);
        else if(flag2 == arr.length)
            System.out.println("only odd(product): " + pro);
        else
            System.out.println("both odd and even(diff): " + (sum - sum2));
    }
}
