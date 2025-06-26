package com.abhay.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box old = new Box(4.6,7.9,8.2);
//        Box box =  new Box(old);
//        System.out.println(box.l +  " " + box.w + " " + box.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(1,5,6,8);
//        System.out.println(box4.h);
//        System.out.println(box4.weight);

//        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.w);
        //there are many variables in both parent and child classes
        //you are given access to variables that are in the ref type i.e.Box Weight
        //hence,you should have access to weight variable
        //this also means, that ones you are trying to access should be initialized
        //but here , when the obj itself is of type parent class ,how will you call the constructor
        //that is why erroe
//        BoxWeight box6 = new Box(2,3,5);
//        System.out.println(box6);

//        Boxprice box = new Boxprice(5,8,200);
//        System.out.println(box.l);
        Box.Greeting();
        old.getL();

    }
}
