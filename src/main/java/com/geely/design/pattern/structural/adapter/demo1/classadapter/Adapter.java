package com.geely.design.pattern.structural.adapter.demo1.classadapter;

/**
 * Created by geely
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        //... 逻辑代码
        super.adapteeRequest();
        //...逻辑代码
    }
}
