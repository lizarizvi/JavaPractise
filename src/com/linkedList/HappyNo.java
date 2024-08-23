package com.linkedList;
//https://leetcode.com/problems/happy-number/description/
public class HappyNo {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = sumSq(slow);
            fast = sumSq(sumSq(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private static int sumSq(int number) {
        int ans = 0;
        while (number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
}
