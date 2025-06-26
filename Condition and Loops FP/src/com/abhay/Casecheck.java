package com.abhay;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char ch = inp.next().trim().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("It is Lower case letter");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("It is an Upper Case letter");
        }
    }
}
