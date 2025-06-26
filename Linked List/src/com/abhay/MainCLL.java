package com.abhay;

public class MainCLL {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertLast(45);
        list.insertLast(54);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(2);
        list.delete(3);
        list.display();
    }
}
