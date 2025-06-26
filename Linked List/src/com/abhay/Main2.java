package com.abhay;

public class Main2 {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(23);
        list.insertFirst(2);
        list.insertFirst(98);
        list.insertLast(45);
        list.insert(2,54);
        list.Display();
    }
}
