package com.abhay;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        // For Loop :
//        for (int i=1;i<=a;i++)
//        {
//            System.out.println(i);
//        }
        // While Loop :
//        int i=2;
//        while(i<=a)
//        {
//            System.out.println(i);
//            i+=2;
//        }
        //Do While Loop :
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=a);
    }
}
