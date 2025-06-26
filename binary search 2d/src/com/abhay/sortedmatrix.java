package com.abhay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortedmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 11;
        System.out.println(Arrays.toString(search(arr,target)));

    }

    static int[] binsearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cstart = mid + 1;
            }
            if (matrix[row][mid] > target) {
                cend = mid - 1;
            }
        }
        return new int[]{-1, -1};

    }

    static int[] search(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;//bee cautious , matrix may be empty
        if (rows == 1) {
            return binsearch(mat, 0, 0, cols - 1, target);
        }
        int rowstart = 0;
        int rowend = rows - 1;
        int cmid = cols / 2;
        //run the loop till two rows are remaining
        while (rowstart < (rowend - 1)) {
            int mid = rowstart + (rowend - rowstart) / 2;
            if (mat[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (mat[mid][cmid] < target)
            {
                rowstart= mid;
            }
            if(mat[mid][cmid] > target)
            {
                rowend = mid;

            }
        }
        //check whether target is in columns of two rows
        if (mat[rowstart][cmid] == target)
        {
            return new int[]{rowstart,cmid};
        }
        if (mat[rowstart+1][cmid] == target )
        {
            return new int[]{rowstart+1,cmid};
        }
        if(target <= mat[rowstart][cmid-1])
        {
            return binsearch(mat,rowstart,0,cmid-1,target);

        }
        if(target >= mat[rowstart][cmid+1] && target <= mat[rowstart][cols-1])
        {
            return binsearch(mat,rowstart,cmid+1,cols-1,target);

        }
        if(target <= mat[rowstart+1][cmid-1])
        {
            return binsearch(mat,rowstart+1,0,cmid-1,target);

        }
        else
        {
            return binsearch(mat,rowstart+1,cmid+1,cols-1,target);

        }
    }
}