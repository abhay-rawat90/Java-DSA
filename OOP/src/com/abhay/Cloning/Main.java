package com.abhay.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human abhay = new Human(19,"Abhay Rawat");
        Human twin = (Human)abhay.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 32;
        System.out.println(Arrays.toString(abhay.arr));
        System.out.println(Arrays.toString(twin.arr));


    }

}
