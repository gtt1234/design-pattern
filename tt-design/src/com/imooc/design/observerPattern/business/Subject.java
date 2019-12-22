package com.imooc.design.observerPattern.business;

import com.imooc.design.observerPattern.business.Observer ;

//主题接口
public interface Subject {
    //注册观察者
    public void registerObserver(Observer o);
    //删除观察者
    public void removeObserver(Observer o);
    //当主题状态改变时，这个方法会被调用，以通知所有的观察者
    public void notifyObserver();

}
