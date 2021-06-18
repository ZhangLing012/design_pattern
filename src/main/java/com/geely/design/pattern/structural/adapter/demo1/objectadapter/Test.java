package com.geely.design.pattern.structural.adapter.demo1.objectadapter;

/**
 * Created by geely
 * 组合复用原则 委托机制
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();


    }
}
