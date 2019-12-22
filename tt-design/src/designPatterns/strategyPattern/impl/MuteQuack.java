package designPatterns.strategyPattern.impl;

import com.imooc.design.strategyPattern.business.QuackBehavior;

/**
 * @Description: TODO
 * @Author ttgan
 * @Date 2019/11/25
 **/
//不会叫行为类
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        //不会叫
    }
}
