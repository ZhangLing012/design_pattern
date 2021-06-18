package com.geely.design.pattern.structural.adapter.demo1.objectadapter;


/**
 *
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
