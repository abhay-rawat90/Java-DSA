package com.abhay;

public class First {
    public static void main(String[] args) {
        //store 5 roll nos
        int[] numbers = new int[5];
        //store 5 names
        String[] names = new String[5];

        //data of 5 students(roll no ,name, marks)
        int[] rollno = new int[5];
        String[] name =new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        Student student1;
        student1 = new Student();
//        student1.greetings();
        Student random  = new Student();
        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.marks);


    }



}
//create a class
//for every single student
class Student {
    int rollno ;
    String name;
    float marks;
    //we need add the values of the above properties object by object
    //we need one word to access every object

    void greetings()
    {
        System.out.println("Hello! My name is " + this.name);
    }
    Student () {
        this.rollno = 16;
        this.name = "Abhay Rawat";
        this.marks = 8.86F;

    }

    Student(int rollno, String name, float marks)
    {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}
