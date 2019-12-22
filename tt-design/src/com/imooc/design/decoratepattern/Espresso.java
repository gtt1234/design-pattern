package com.imooc.design.decoratepattern;

//浓缩咖啡,扩展自饮料
public class Espresso extends Beverage {

    public Espresso(){

        desctription = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
