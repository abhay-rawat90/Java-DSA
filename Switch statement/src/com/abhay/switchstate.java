package com.abhay;

import java.util.Scanner;

public class switchstate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter Fruit name: ");
//        String fruit = in.next();
//
//        if (fruit.equals("apple"))
//        {
//            System.out.println("An apple a day keep the doctor away");
//        }
//        else if (fruit.equals("mango"))
//        {
//            System.out.println("King of fruits");
//        }
//        else if (fruit.equals("banana"))
//        {
//            System.out.println("Very healthy fruit");
//        }
//        else
//        {
//            System.out.println("Fruit ka naam daal chutiye");
//        }
//        switch (fruit) {
//            case "apple" -> System.out.println("Red coloured fruit ");
//            case "mango" -> System.out.println("King thing");
//            case "banana" -> System.out.println("bananaannananananan");
//            default -> System.out.println("Fruit ka naam daalo baalak ");
//        }
        System.out.print("Enter the name of day and I will give description of that day : ");
        String  day = in.next();
        switch (day){
            case "Monday" -> {
                System.out.println("Worst day");
                System.out.println("Sach hai");
                System.out.print("Accha lagta hai ki nahi: ");
                String a = in.next();
                switch (a){
                    case "haan" -> System.out.println("Bodam ho");
                    case "nahi" -> System.out.println("Thik hai ");
                    default -> System.out.println("haan ya na batao khaali");
                }
            }
            case "Tuesday"-> System.out.println("Veg hone ka din");
            case "Wednesday" -> System.out.println("Bina matlab ka din");
            case "Thursday" -> System.out.println("okay day");
            case "Friday" -> System.out.println("Weekend ke pehle ka din");
            case "Saturday" -> System.out.println("Weekend Shuru");
            case "Sunday" -> System.out.println("Weekend shuru hote hi khatam");
            default -> System.out.println("Sahi din daalo bhai ");
        }
    }
}
