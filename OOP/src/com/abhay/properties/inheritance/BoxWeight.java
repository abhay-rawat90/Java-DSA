package com.abhay.properties.inheritance;

public class  BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this ? call the parent class constructor
        //used to initialize values in parent class
        this.weight = weight;
    }

    public BoxWeight(double side,double weight) {
        super(side); // what is this ? call the parent class constructor
        //used to initialize values in parent class
        this.weight = weight;
    }

}
