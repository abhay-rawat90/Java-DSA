package com.abhay.interfaces;

public class Car implements Engine, Brake,Media {

    @Override
    public void brake() {
        System.out.println("I brake like normal car");

    }

    @Override
    public void start() {
        System.out.println("I start engine like normal car");


    }

    @Override
    public void stop() {
        System.out.println("I stop engine like normal car");

    }

    @Override
    public void accn() {
        System.out.println("I accelerate like normal car");

    }
}
