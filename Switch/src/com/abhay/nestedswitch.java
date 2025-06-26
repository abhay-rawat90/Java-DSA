package com.abhay;

import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Employee ID:");
        int empID = in.nextInt();
        System.out.print("Enter Department name:");
        String dep = in.next();
        switch (empID) {
            case 1 -> System.out.println("Abhay Rawat");
            case 2 -> System.out.println("AR");
            case 3 -> {
                switch (dep) {
                    case "IT" -> System.out.println("IT department");
                    case "CS" -> System.out.println("Computer Departemnt");
                    case "management" -> System.out.println("Accounts Department");
                    default -> System.out.println("Enter Valid Department");
                }
            }
            default -> System.out.println("Enter Valid number");
        }

    }
}
