package com.abhay.staticexample;

public class Innerclasses {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

//        @Override
//        public String toString() {
//            return name;
//        }
    }

    public static void main(String[] args) {
        Test a = new Test("Abhay");
        Test b = new Test("Rawat");
        System.out.println(a);

    }
}
