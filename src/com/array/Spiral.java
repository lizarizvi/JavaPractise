package com.array;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i, j;
        ArrayList<Integer> arr = new ArrayList<Integer>(m * n);
        for(i = 0; i < m - 2; i++){
            for(j = 0; j < n; j++){
                if(i == 0){
                    arr.add(matrix[i][j]);
                }
            }
            arr.add(matrix[i + 1][n - 1]);
        }
        for(i = m - 1; i > 0; i--){
            for(j = n - 1; j > 0; j--){
                if(i == m - 1){
                    arr.add(matrix[i][j]);
                }
            }
            arr.add(matrix[i][0]);
        }
        return arr;
    }
}

