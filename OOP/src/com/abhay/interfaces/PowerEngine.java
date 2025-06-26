package com.abhay.interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Engine Stop");

    }

    @Override
    public void accn() {
        System.out.println("Accelerating");

    }
}
