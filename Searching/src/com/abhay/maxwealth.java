package com.abhay;

public class maxwealth {
    public static void main(String[] args) {
        int[][] accounts ={
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maxwealth(accounts));


    }

    static int maxwealth(int[][] accounts)
    {int max = 0;

        for (int row = 0; row < accounts.length; row++) {
            int rowsum = 0;


            for (int col = 0; col < accounts[row].length; col++) {
                rowsum+=accounts[row][col];


            }

            if(max<rowsum)
            {
                max=rowsum;
            }

        }

        return max;
    }

}
