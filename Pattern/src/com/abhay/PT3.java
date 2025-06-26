package com.abhay;

public class PT3 {
    public static void main(String[] args) {
        pt2(6);

    }
    static void pt2(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=(n+1-i) ; j++)
            {

                System.out.print("* ");

            }
            //when one row is printed , we need to add a new line
            System.out.println();

            
        }
        
    }
}
