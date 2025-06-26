package com.abhay;

public class leet4 {
    public static void main(String[] args) {
        int[][] mat = {{5}};
        System.out.println(diagonalSum(mat));

    }

    public static int diagonalSum(int[][] mat)
    {
        int sum = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat[row].length; column++) {
                if(row == column)
                {
                    sum = sum + mat[row][column];
                }


            }
        }
        if(mat.length > 1) {
            for (int row = 0; row < mat.length; row++) {
                for (int column = 0; column < mat[row].length; column++) {
                    if (row == 0 && column == mat[row].length - 1) {
                        while (row < mat[row].length - 1 && column >= 0) {
                            if (row != column) {
                                sum = sum + mat[row][column];
                            }
                            row++;
                            column--;
                        }
                        sum = sum + mat[row][column];
                    }

                }
            }
        }


        return sum;

    }
}
