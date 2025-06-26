package com.abhay;

import java.util.ArrayList;
import java.util.List;

public class newFile {
    public static void main(String[] args) {


    }

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < matrix.length;i++)
        {
            for(int j = 0; i < matrix[0].length; i++ )
            {
                list.add(matrix[i][j]);
            }
        }
        return list;

    }
}
