package com.imooc.design.decoratepattern;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        //不需要调料的Espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesctription() + " $" + beverage.cost());

        //
        Beverage beverage1 = new DarkRoast();

        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDesctription() + " $" + beverage1.cost());
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDesctription() + " $" + beverage1.cost());
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDesctription() + " $" + beverage1.cost());


        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDesctription() + " $"+ beverage2.cost());

    }


}
