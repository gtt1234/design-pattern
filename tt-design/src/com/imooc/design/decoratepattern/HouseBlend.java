package com.imooc.design.decoratepattern;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        desctription = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
