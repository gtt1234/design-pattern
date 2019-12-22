package com.imooc.design.decoratepattern;

public abstract class Beverage {
    String desctription = "Unknown Beverage";

    public String getDesctription(){
        return desctription;
    }

    public abstract double cost();
}
