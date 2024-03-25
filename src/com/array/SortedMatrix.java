package com.array;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int target = 12;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length; //matrix may be empty

        if (row == 1){
            return binarySearch(matrix, 0, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;
        //run loop till only 2 rows remains
        while (rStart < (rEnd - 1)){ //while this is true we have more than 2 rows
            int mid = (rStart + rEnd) / 2;
            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        //now we have 2 rows
        //check whether the target is in col of 2 rows
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        //search in 1,2,3,4 halves in rows
        if (target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]){
            return binarySearch(matrix, rStart, cMid + 1, col - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, col - 1, target);
        }
    }

    //search in row provided b/w cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd){
            int mid = (cStart + cEnd) / 2;
            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
