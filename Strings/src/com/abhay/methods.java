package com.abhay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Abhay Rawat";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("   abhay    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
