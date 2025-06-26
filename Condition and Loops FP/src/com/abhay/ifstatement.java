package com.abhay;

import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        int a = inp.nextInt();
        if(a>10000){
            a=a+2000;
        }

        else {
            a=a+1000;
        }
        System.out.println("Now your Salary is: " + a);

    }
}
