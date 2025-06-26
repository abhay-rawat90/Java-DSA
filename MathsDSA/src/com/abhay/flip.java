package com.abhay;

import java.util.Arrays;

public class flip {
    public static void main(String[] args) {
        int[][] img = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] image = flip(img);
        for(int row=0;row<image.length;row++)
        {
            for(int col=0;col<image[row].length;col++)
            {
                System.out.print(image[row][col]);



            }
            System.out.println();
        }

    }

    static int[][] flip(int[][] image)
    {
        for(int[] row : image)
        {
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                //swap
                int temp =row[i] ^ 1;
                row[i] = row[image.length - i -1] ^ 1;
                row[image.length -i -1] = temp;

            }
        }
        return image;

    }

}
