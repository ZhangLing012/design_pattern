package com.geely.design.pattern.structural.adapter.demo1.objectadapter;

/**
 * 不是继承无法调用被适配者方法
 * 所以用组合
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
