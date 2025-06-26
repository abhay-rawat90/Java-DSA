package com.abhay;

public class PT17 {
    public static void main(String[] args) {
        pt2(7);

    }
    static void pt2(int n) {
        for (int i = 1; i <= n; i++) {
            if (i <= (n + 1) / 2)
            {
                for (int j = 1; j <= ((n+1)/2-i)*2; j++)
                {
                    System.out.print(" ");

                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");

                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                    //when one row is printed , we need to add a new line

            }
            if (i > (n + 1) / 2)
            {
                for (int j = 1; j <= (i - (n + 1) / 2)*2; j++) {
                    System.out.print(" ");

                }
                for (int j = (n+1)-i; j >=1; j--) {
                    System.out.print(j + " ");

                }
                for (int j = 2; j <= (n+1)-i; j++) {
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }
    }
}
