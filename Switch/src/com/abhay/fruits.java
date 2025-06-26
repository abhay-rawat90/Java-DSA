package com.abhay;

import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a fruit name:");
        String fruit = inp.next();
        //by if metthod
//        if(fruit.equals("mango"))
//        {
//            System.out.println("King of Fruits");
//        }
//        if(fruit.equals("apple"))
//        {
//            System.out.println("A Sweet Red Fruit");
//        }
//        if(fruit.equals("grapes"))
//        {
//            System.out.println("A juicy small fruit");
//        }
//        else {
//            System.out.println("Enter valid fruit");
//        }
        //Using Switch Statement
        switch (fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("A Red Sweet fruit");
                break;
            case "grape":
                System.out.println("A juicy small fruit");
                break;
            default:
                System.out.println("Enter Valid Fruit");
                break;
        }

    }
}
