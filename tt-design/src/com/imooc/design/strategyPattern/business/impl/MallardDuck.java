package  com.imooc.design.strategyPattern.business.impl;


/**
 * @Description: TODO
 * @Author ttgan
 * @Date 2019/11/25
 **/

import com.imooc.design.strategyPattern.business.Duck;
import com.imooc.design.strategyPattern.business.FlyBehavior;
import com.imooc.design.strategyPattern.business.QuackBehavior;

/**
 * 设计原则1：找出应用中可能需要变化之处，把它们独立起来，(在这里就是那些行为类)不要和那些不需要变化的代码混在一起
 * 设计原则2：针对接口编程，而不是针对实现编程
 *设计原则3：多用组合，少用继承
 */
public class MallardDuck extends Duck {

    //针对接口编程的体现
    public MallardDuck(FlyBehavior fb, QuackBehavior qb){
        //setFlyBehavior（new FlyWithWings())  不用具体的实现类
       setFlyBehavior(fb);
       setQuackBehavior(qb);
    }
    //将鸭子类和行为类结合使用，这就是组合，这种做法和“继承”不同的地方在于，鸭子的行为不是继承来的，而是和适当的行为对象“组合”来的

    //如果MallardDuck类只是单单实现了FlyBehavior，这种实现接口的方法无法达到代码的复用
    //这就意味着：无论何时你需要修改某个行为，你必须得往下追踪并在每一个定义此行为的类中修改它，一不小心，可能会造成新的错误。

    //“针对接口编程”,(真正的意思是针对超类型编程（更明确的说变量的声明类型应该是超类型，通常是一个抽象类或者是一个接口）)
    // 关键就在多态，利用多态，程序可以针对超类型编程，执行时会根据实际状况执行到真正的行为，不会被绑死在超类型的行为上。
    @Override
    public void display() {

    }



}
