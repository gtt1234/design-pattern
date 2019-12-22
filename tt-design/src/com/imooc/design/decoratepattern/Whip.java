package com.imooc.design.decoratepattern;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDesctription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.3+ beverage.cost();
    }
}
