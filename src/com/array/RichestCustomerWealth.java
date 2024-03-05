package com.array;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts ={ {1,3,2},
                {4,5,6},
                {3,9} };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int lar = accounts[0][0];
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > lar) {
                lar = sum;
            }
        }
        return lar;
    }
}
