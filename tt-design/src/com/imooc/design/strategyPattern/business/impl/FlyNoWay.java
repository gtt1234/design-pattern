package com.imooc.design.strategyPattern.business.impl;

import com.imooc.design.strategyPattern.business.FlyBehavior;

/**
 * @Description: TODO
 * @Author ttgan
 * @Date 2019/11/25
 **/
//不会飞行为类
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        //不会飞
    }
}
