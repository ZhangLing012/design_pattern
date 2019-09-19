package com.geely.design.pattern.structural.adapter.classadapter;

/**
 * 继承
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();


    }
}
