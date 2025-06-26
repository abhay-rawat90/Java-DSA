package com.abhay;

public class factors {
    public static void main(String[] args) {
        int n= 30;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i*j == n)
                {
                    System.out.print(i + " ");
                }

            }

        }
    }
}
