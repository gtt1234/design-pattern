package com.imooc.design.observerPattern.business.impl;

import com.imooc.design.observerPattern.business.DisplayElement;
import com.imooc.design.observerPattern.business.Observer;
import com.imooc.design.observerPattern.business.Subject;

/**
 * @Description: TODO
 * @Author ttgan
 * @Date 2019/11/26
 **/
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("数据");
    }


    //这里更新状态的方法，不要把主题的属性都作为参数传进来，直接传入主题所实现的接口
    // （这些观测值的种类和个数在未来有可能改变吗？如果以后会改变，这些变化是否被很好地封装？）

    @Override
    public void update(Subject o) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
