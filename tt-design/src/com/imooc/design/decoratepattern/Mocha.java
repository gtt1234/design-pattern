package com.imooc.design.decoratepattern;
//摩卡是一个装饰者,所以扩展自CondimentDecorator


public class Mocha extends CondimentDecorator {

    //用一个实例变量记录饮料,也就是被装饰者
    Beverage beverage;

    /**
     * 让被装饰者(饮料)被记录到实例变量中,这里的做法是把饮料当做构造器的参数.
     */
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDesctription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.2+ beverage.cost();
    }
}
