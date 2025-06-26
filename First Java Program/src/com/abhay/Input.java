package com.abhay;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Enter your Roll No :");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your Roll number is " + rollno);
    }
}
