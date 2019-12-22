package com.imooc.design.decoratepattern;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        desctription = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.8;
    }
}
