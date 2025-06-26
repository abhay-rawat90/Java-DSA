package com.abhay;

public class PT28 {
    public static void main(String[] args) {
        pt2(9);

    }
    static void pt2(int n)
    {
        for (int i = 1; i <= n; i++) {
            if(i<=(n+1)/2)
            {
                for (int j = 1; j <=(n+1)/2-i; j++)
                {
                    System.out.print(" ");

                }
                for (int j = 1; j <=i; j++)
                {
                    System.out.print("* ");

                }
            }
            if(i>(n+1)/2)
            {
                for (int j = 1; j <=i-(n+1)/2 ; j++)
                {
                    System.out.print(" ");

                }
                for (int j = 1; j <=(n+1-i) ; j++)
                {
                    System.out.print("* ");

                }
            }
            //when one row is printed , we need to add a new line
            System.out.println();


        }
//        for (int i = 1; i <= n; i++) {
//            if(i<=(n+1)/2)
//            {
//                for (int j = 1; j <=i; j++)
//                {
//                    System.out.print("* ");
//
//                }
//            }
//            if(i>(n+1)/2)
//            {
//                for (int j = 1; j <=(n+1-i) ; j++)
//                {
//                    System.out.print("* ");
//
//                }
//            }
//            //when one row is printed , we need to add a new line
//            System.out.println();
//
//
//        }
        
    }
}
