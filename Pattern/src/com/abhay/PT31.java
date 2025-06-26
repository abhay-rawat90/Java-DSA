package com.abhay;

public class PT31 {
    public static void main(String[] args) {
        pt2(3);

    }
    static void pt2(int n) {
        int org = n;
        n= 2*n;
        for (int i = 0; i <=n; i++) {
            {
                for (int j = 0; j <= n; j++) {
                    int ateveryindex = org - Math.min(Math.min(i,j),Math.min(n-i,n-j))  ;
                    System.out.print(ateveryindex+1 + " ");

                }

            }
            System.out.println();
        }
    }
}
