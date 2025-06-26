package com.abhay;

public class PT30 {
    public static void main(String[] args) {
        pt2(5);

    }
    static void pt2(int n) {
        for (int i = 1; i <= n; i++) {
            {
                for (int j = 1; j <=(n-i)*2 ; j++) {
                    System.out.print(" ");

                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");

                }
                for (int j = 2; j <= i ; j++) {
                    System.out.print(j + " ");

                }

                System.out.println();
            }

        }
    }
}
