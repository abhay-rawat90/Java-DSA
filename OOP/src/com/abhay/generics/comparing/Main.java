package com.abhay.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student abhay = new Student(16,89.76f);
        Student abhay1 = new Student(17,99.52f);

        if(abhay.compareTo(abhay1) < 0)
        {
            System.out.println("abhay1 has more marks");

        }


    }
}
