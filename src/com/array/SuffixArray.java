package com.array;

import java.util.Arrays;

public class SuffixArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int suffixLength = 3; // Change this to the desired length of the suffix

        // Using Arrays.copyOfRange
        int startIndex = originalArray.length - suffixLength;
        int[] suffixArray = Arrays.copyOfRange(originalArray, startIndex, originalArray.length);

        // Printing the suffix array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Suffix Array: " + Arrays.toString(suffixArray));
    }
}
