package com.imooc.design.decoratepattern;

//酱油装饰者
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDesctription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
