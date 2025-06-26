package com.abhay.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.accn();
//        car.start();
//        car.stop();
//        Media carMedia = new Car();
//        carMedia.stop();

        Nicecar car = new Nicecar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
