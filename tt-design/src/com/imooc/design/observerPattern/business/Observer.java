package com.imooc.design.observerPattern.business;

//观察者接口
public interface Observer {
    //当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者
    public void update(Subject o);

    //???把观测值直接传入观察者中是更新状态的最直接的方法。你认为这样做法明智吗？
    // 提示：这些观测值的种类和个数在未来有可能改变吗？如果以后会改变，
    // 这些变化是否被很好地封装？或者是需要修改许多代码才能办到？





}
