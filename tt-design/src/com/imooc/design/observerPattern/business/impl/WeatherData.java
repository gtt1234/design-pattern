package com.imooc.design.observerPattern.business.impl;

import com.imooc.design.observerPattern.business.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import com.imooc.design.observerPattern.business.Observer;

/**
 * @Description: TODO
 * @Author ttgan
 * @Date 2019/11/26
 **/

//题例：Internet气象观测站。
//一个WeatherData对象负责追踪目前的天气状况（温度，湿度，气压）。我们希望你们能建立一个应用，有三种布告板，
// 分别显示目前的状况、气象统计及简单的预报。当WeatherObject对象获得最新的测量数据时，三种布告板必须实时更新。
// 而且，这是一个可以扩展的气象站，Weather-O-Rama气象站希望公布一组API，好让其他开发人员可以写出自己的气象布告板，
// 并插入此应用中，我们希望能提供这样的API。

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    //   Observable：java内置的主题（被观察者），是一个类，必须设计一个类来继承它，
    //如果某个类想同时具有Observable类和另一个超类的行为，就完了，java不支持多重继承。所以有时候需要自己实现一整套观察者模式

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    //当从气象站得到更新观测值时，我们通知观察者
    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
