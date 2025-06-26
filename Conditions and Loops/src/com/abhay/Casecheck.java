package com.abhay;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Character:");
        char n = in.next().trim().charAt(0);
        if(n>= 'a' && n<= 'z')
        {
            System.out.println("It is in Lowercase");
        }
        else if(n>='A'&& n<='Z')
        {
            System.out.println("It is in Uppercase");
        }

    }
}
