package com.abhay;

public class Wrapperexample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b =20;
        Integer num = 45;
        System.out.println(a + " " + b);
//        final int bonus =2;
        final A abhay = new A("Abhay Rawat");
        abhay.name ="other name";
        // when a non primitive is final you cannot reassign it
//        abhay = new A("other name");
//        A obj;
//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random name");
//        }

    }

    static void swap(Integer a,Integer b)
    {
        // no swapping will happen as in java there is no pass by reference just pass by value
        Integer temp = a;
        a=b;
        b= temp;
    }
}

class A{
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}
