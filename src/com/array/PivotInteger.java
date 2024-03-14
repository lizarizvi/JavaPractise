package com.array;
//https://leetcode.com/problems/find-the-pivot-integer/description/?envType=daily-question&envId=2024-03-13
public class PivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
    static int pivotInteger(int n) {
//        int mid = 1 + (n - 1) / 2;
//        for (int i = 1; i <= n; i++) {
//            int tillMidSum = (mid * (mid + 1)) / 2;
//            int tillEndSum = (n * (n + 1)) / 2;
//            int tillLeftMidSum = ((mid - 1) * (mid)) / 2;
//            int midEndSum = tillEndSum - tillLeftMidSum;
//            if (tillMidSum == midEndSum) {
//                return mid;
//            } else if (tillMidSum < midEndSum) {
//                mid++;
//            } else {
//                mid--;
//            }
//        }
//        return -1;

        //better solution with less complexity
        int y = n*(n+1)/2;
        int x = (int)Math.sqrt(y);
        if(x*x==y) return x;
        else return -1;
    }
}
