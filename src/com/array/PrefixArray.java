package com.array;

import java.util.Arrays;

public class PrefixArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int prefixLength = 3; // Change this to the desired length of the prefix

        // Using Arrays.copyOfRange
        int[] prefixArray = Arrays.copyOfRange(originalArray, 0, prefixLength);

        // Printing the prefix array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Prefix Array: " + Arrays.toString(prefixArray));
    }
}
